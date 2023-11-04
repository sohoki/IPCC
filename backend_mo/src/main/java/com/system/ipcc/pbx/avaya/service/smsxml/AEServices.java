/*******************************************************************************
 * Title: AEServices.java
 *
 * $Author: greway $
 * $Revision: 1.2 $
 *
 * Copyright: Copyright (c) 2008 AVAYA, Inc.
 *
 ******************************************************************************/

//******************************************************************************
// Package
//******************************************************************************
package com.system.ipcc.pbx.avaya.service.smsxml;

import java.net.URL;
import java.util.ArrayList;
import java.util.Properties;

import com.system.ipcc.pbx.avaya.smsxml.ArrayType;
import com.system.ipcc.pbx.avaya.smsxml.IPServicesType;
import com.system.ipcc.pbx.avaya.smsxml.AgentType;
import com.system.ipcc.pbx.avaya.smsxml.ModelChoices;
import com.system.ipcc.pbx.avaya.smsxml.ObjectFactory;

class AEServices
{
	private ObjectFactory objectFactory;
    private IPServicesType ipServices ;
    private ModelChoices modelFields;
    private ArrayList<IPServicesType> data;
    
	// Class Loader
	ClassLoader cl = null;
	
    private String qualifier = "";
    private String root = "";
    private String login = "";
    private String pw = "";
    private String [] servers;
    private String [] serverPw;
    private String [] serverEnable;
    private int [] serverIndex;
    private int serverCount = 0;

    public final static int DISPLAY = 0;
    public final static int ADD = 1;
    public final static int ENABLE = 2;
    public final static int DISABLE = 3;
    public final static int REMOVE = 4;

    private int cmd = DISPLAY;

    SMSRequest sms;
    
    // Property File Values
    private static final String ROOT = "sms.root";
    private static final String LOGIN = "cm.login";
    private static final String PASSWORD = "cm.password";
    private static final String OPERATION ="operation";
    private static final String OPTIONS ="options";
    
    public AEServices( ) {
    	
    }
    

    private void display()
    {
       int nRows = ipServices.getAEServicesServer().size();

       System.out.println( "------------------ AESVCS Configuration ------------------" );
       int nPos = indexOf( (ArrayList<ArrayType>) ipServices.getServiceType(),"AESVCS");
       System.out.println( "Local Node: " + ipServices.getLocalNode().get(nPos).getValue() );
       System.out.println( "Local Port: " + ipServices.getLocalPort().get(nPos).getValue() );
       System.out.println( "Enabled: " + ipServices.getEnabled().get(nPos).getValue() );
       System.out.println( "" );
       System.out.println( "Server ID  Server Name       Password      Enabled  Status" );
       System.out.println( "---------  ----------------  ------------  -------  ------" );
       String strPad = "                    ";
       String strPw = "********************";

       for( int n = 0; n < nRows; ++n )
       {
           String strServer = ipServices.getAEServicesServer().get(n).getValue();
           long position = ipServices.getAEServicesServer().get(n).getPosition();
           if ( strServer != null )
           {
              String strId = ( "" + position + ": " + strPad).substring( 0, 11 );
              String strName = ( strServer + strPad).substring( 0, 18);
              int pwLen = ("" + ipServices.getAEServicesPassword().get(n).getValue()).length();
              String strPwPrint = (strPw.substring( 0, pwLen) + strPad).substring( 0, 14);
              String strEnabled = "   " + ipServices.getAEServicesEnabled().get(n).getValue() + "     ";
              String strStatus = ipServices.getAEServicesStatus().get(n).getValue();
              System.out.println( strId + strName + strPwPrint + strEnabled + strStatus );
           }
        }
    }

    private void doSetEnabled( boolean bEnable )
    {
        // Check server list against query results
        if ( ! checkExistingServers( bEnable ? "enable" : "disable" ) ) return;

        ModelChoices mf_enable = objectFactory.createModelChoices();
        IPServicesType ip_submit = objectFactory.createIPServicesType(); // Create new IPServicesType to submit
        
        for( int n = 0; n < serverCount; ++n )
        {
            int ndx = serverIndex[n];
            
            // Create ArrayType to set position and value
            ArrayType enable = objectFactory.createArrayType();
            enable.setValue(bEnable ? "y" : "n");
            enable.setPosition(ndx);
            
            // Add ArrayType element to ipServerices object
            ip_submit.getAEServicesEnabled().add(enable);
            
        }
        mf_enable.getIPServices().add(ip_submit);
        submitChange( mf_enable );
    }

    private void doRemove()
    {
        if ( ! checkExistingServers( "remove" ) ) return;

        ModelChoices mf_remove = objectFactory.createModelChoices();
        IPServicesType ip_submit = objectFactory.createIPServicesType(); // Create new IPServicesType to submit
        for( int n = 0; n < serverCount; ++n )
        {
            int ndx = serverIndex[n];
            
            // Set all three modifiable fields to " " to remove (clear) server
            ArrayType ae_server = objectFactory.createArrayType();
            ArrayType ae_passwd = objectFactory.createArrayType();
            ArrayType ae_enabled = objectFactory.createArrayType();
            ae_server.setPosition(ndx);
            ae_server.setValue(" ");
            ae_passwd.setPosition(ndx);
            ae_passwd.setValue(" ");
            ae_enabled.setPosition(ndx);
            ae_enabled.setValue(" ");
            
            ip_submit.getAEServicesServer().add(ae_server);
            ip_submit.getAEServicesPassword().add(ae_passwd);
            ip_submit.getAEServicesEnabled().add(ae_enabled);
        }
        mf_remove.getIPServices().add(ip_submit);
        submitChange( mf_remove );
    }

    private void doAdd()
    {
        if ( ! checkAddServers() ) return;

        // Prepare the add command
        ModelChoices mf_add = objectFactory.createModelChoices();
        IPServicesType ip_submit = objectFactory.createIPServicesType(); // Create new IPServicesType to submit
        
        for( int n = 0; n < serverCount; ++n )
        {
            int ndx = serverIndex[ n ];
            ArrayType ae_server = objectFactory.createArrayType();
            ArrayType ae_passwd = objectFactory.createArrayType();
            ArrayType ae_enabled = objectFactory.createArrayType();
            ae_server.setPosition(ndx);
            ae_server.setValue(servers[n]);
            ae_passwd.setPosition(ndx);
            ae_passwd.setValue(serverPw[n]);
            ae_enabled.setPosition(ndx);
            ae_enabled.setValue(serverEnable[n]);
            
            ip_submit.getAEServicesServer().add(ae_server);
            ip_submit.getAEServicesPassword().add(ae_passwd);
            ip_submit.getAEServicesEnabled().add(ae_enabled);
        }
        mf_add.getIPServices().add(ip_submit);
        submitChange( mf_add );
    }
   

    private void submitChange( ModelChoices ips )
    {
        //System.out.println( "TEST: Would have submitted the following:");
        //System.out.println( "      sms.execRequest( "+model+",change,\"\","+fields+" );");
        try
        {
            sms.execRequest( ips, "change", "" );
        }
        catch( Exception e )
        {
            System.out.println( "The request generated an unexpected exception: " + e );
            return;
        }

        if ( sms.success() )
        {
            System.out.println( "The operation completed successfully." );
        }
        else
        {
            System.out.println( "Error: " + sms.getFault() );
        }
    }

    private boolean checkAddServers()
    {
        boolean bOk = true;
        int nAvailable = 0; // Zero index is never used -- we'll increment below
        int nMaxIndex = 16; // current CM's fixed at 16
        int nUsed = 0;
        for ( int n = 0; n < serverCount; ++n )
        {
            int ndx = indexOf( (ArrayList<ArrayType>) ipServices.getAEServicesServer(), servers[n]);
            if ( ndx >= 0 )
            {
                System.out.println( "Server " + servers[n] + " is already added." );
                bOk = false;
            }
            else
            {
                // Find next available index, if any
                while( ++nAvailable <= nMaxIndex )
                {
                	int used = indexOfPosition( (ArrayList<ArrayType>)ipServices.getAEServicesServer(), nAvailable);
                    if ( used < 0 )
                    {
                        // it's an unused slot.  Use this index
                        serverIndex[ n ] = nAvailable;
                        ++nUsed;
                        break;
                    }
                }
                if ( nAvailable > nMaxIndex )
                {
                    System.out.println( "Cannot add " + servers.length + " servers.  There are only " + nUsed +
                      " unused links available." );
                    bOk = false;
                }
            }
        }
        return bOk;
    }

    private boolean checkExistingServers( String cmd )
    {
        int serverCount = servers.length;
        boolean bOk = true;
        for ( int n = 0; n < serverCount; ++n )
        {
            int ndx = indexOf( (ArrayList<ArrayType>) ipServices.getAEServicesServer(), servers[n]);
            if ( ndx < 0 )
            {
                System.out.println( "Server " + servers[n] + " is not configured.  Unable to " + cmd );
                bOk = false;
            }
            else
            {
                serverIndex[ n ] = ndx+1;
                String status = ipServices.getAEServicesStatus().get(ndx).getValue();
                // Don't modify in use servers
                if (( status != null ) && status.equals("in use") )
                {
                    System.out.println( "Server " + servers[n] + " is in use.  Unable to " + cmd );
                    bOk = false;
                }
                else if ( cmd.equals("remove") )
                {
                    // Check enabled status
                    String enabled = ipServices.getAEServicesEnabled().get(ndx).getValue();
                    if (( enabled != null ) && enabled.equals("y"))
                    {
                        System.out.println( "Cannot remove enabled server " + servers[n] + "; disable first." );
                        bOk = false;
                    }
                }
            }
        }
        return bOk;
    }

    public void addServer( String arg )
    {
        if ( serverCount >= servers.length )
        {
            // Shouldn't see this unless we have buggy code
            System.out.println( "Internal error - too many server arguments: ignoring " + arg );
            return;
        }
        if ( cmd != ADD )
        {
            servers[ serverCount ] = arg;
        }
        else
        {
            // Format of server info to add is:
            //     servername:password:enable
            // where
            //     password, if omitted, defaults to 1234567890ab (our testing default)
            //     enable, if omitted, defaults to n
            String [] addArgs = arg.split( ":" );
            servers[ serverCount ] = addArgs[0];
            serverPw[ serverCount ] = addArgs.length > 1 ? addArgs[1] : "1234567890ab";
            serverEnable[ serverCount ] = addArgs.length > 2 ? addArgs[2] : "n";
        }
        ++serverCount;
    }

    public void exec()
    {
    	// Create ModelFields Object
    	objectFactory = new ObjectFactory();
    	modelFields = objectFactory.createModelChoices();
    	ipServices = objectFactory.createIPServicesType();
    	
    	modelFields.getIPServices().add(ipServices);
    	
        sms = new SMSRequest( root, login, pw );
        // Args are valid; Set up client request and execute
        try
        {
            // ALWAYS do initial query
            sms.execRequest( modelFields, "display", qualifier );

            // sms.releaseSession();  // done with the session.
            if ( ! sms.success() )
            {
                System.out.println( "Error: " + sms.getFault() );
                sms.releaseSession();
                return;   // done
            }

            // Get reference to sms result data, other ops will use it
            data = (ArrayList<IPServicesType>) sms.getData().getIPServices();
            ipServices = data.get(0); // Should only have one instance returned
            
            // Check whether AESVCS is configured and enabled
            int nPos = indexOf( (ArrayList<ArrayType>)ipServices.getServiceType(), "AESVCS");
            if (( nPos < 0 ) || ! ipServices.getEnabled().get(nPos).getValue().equals("y"))
            {
                // If not, just report the error and quit.
                // TODO: Consider if we can (or should) automatically add or enable AESVCS
                // if necessary.
                System.out.println( "Error: AESVCS is " + ((nPos < 0) ? "not configured." : "disabled.") );
                sms.releaseSession();
                return; // done
            }

            // List requested?
            if ( cmd == DISPLAY )
            {
                display();
                sms.releaseSession();
                return;   // done
            }

            // Modify op requested.  Now need to base next command on results of above query
            // For now assume AESVCS entry exists...
            switch( cmd )
            {
                case ADD:
                    doAdd();
                    break;
                case ENABLE:
                    doSetEnabled( true );
                    break;
                case DISABLE:
                    doSetEnabled( false );
                    break;
                case REMOVE:
                    doRemove();
                    break;
            }

        }
        catch ( Exception e )
        {
           System.out.println("SMSTest failed with an unexpected exception:");
        }
        sms.releaseSession(); // attempt to release session, no matter what
        return;
    }

	// Load Properties
	public boolean loadProps() {
		URL appURL = null;
		int nServerArgs = 0;
		
		String[] optionsArray = null;
	
		try {
			this.cl = this.getClass().getClassLoader();
			if (cl != null){
				appURL = cl.getResource("aeservices.properties");
			 }
			 else {
				appURL = ClassLoader.getSystemResource("aeservices.properties");
			 }
			
			// Get common properties
	        Properties appProp = new Properties();
	        appProp.load(appURL.openStream());
	        String tmp = "";
	        String options = "";
	        
	        tmp = appProp.getProperty(ROOT);
	        if(tmp != null)
	        {
	        	if(tmp.length() <= 0)
	        	{
	        		System.out.println("You must enter a SMS Root URL!");
	        		return false;
	        	}
	        	this.root = tmp.trim();}
	        tmp = appProp.getProperty(LOGIN);
	        if(tmp != null)
	        {
	        	if(tmp.length() <= 0)
	        	{
	        		System.out.println("You must enter a cm login1");
	        		return false;
	        	}
	        	this.login = tmp.trim();
	        }
	        tmp = appProp.getProperty(PASSWORD);
	        if(tmp != null)
	        {
	        	if(tmp.length() <= 0)
	        	{
	        		System.out.println("You must enter a cm password!");
	        		return false;
	        	}
	        	this.pw = tmp.trim();
	        }
	        tmp = appProp.getProperty(OPERATION);
	        if(tmp != null)
	        {
	          	if ( tmp.equals( "add" ) )
                    cmd = AEServices.ADD;
                else if ( tmp.equals( "enable" ) )
                    cmd = AEServices.ENABLE;
                else if ( tmp.equals( "disable" ) )
                    cmd = AEServices.DISABLE;
                else if ( tmp.equals( "remove" ) )
                    cmd = AEServices.REMOVE;
                else if ( tmp.equals( "list" ) )
                    cmd = AEServices.DISPLAY;
	        }
	        tmp = appProp.getProperty(OPTIONS);
	        if(tmp != null)
	        { 
	        	options = tmp.trim();
	        	optionsArray = options.split(",");
	            nServerArgs = optionsArray.length;
	        }
	        
		    if ( cmd != AEServices.DISPLAY )
            {
		    	// The rest of our arguments are the list of servers to operate on
		    	if ( nServerArgs <= 0 )
		    	{
		    		System.out.println( "Missing required server in options property");
		    		return false; // should be at least one server 
		    	}
		    }
	    
		    servers = new String[ nServerArgs ];
			serverPw = new String[ nServerArgs ];
			serverEnable = new String[ nServerArgs ];
			serverIndex = new int [ nServerArgs ];
			// Default the server info array elements
			for( int n = 0; n < nServerArgs; ++ n )
			{
				servers[ n ] = "";
			    serverPw[ n ] = "1234567890ab";
			    serverEnable[ n ] = "n";
			    serverIndex[ n ] = -1;
			}
	        

	        // If there are server arguments (for all but display cmd), supply them to the handler
	        if ( nServerArgs > 0 )
	        {
	            // nArgs points to first
	            for( int n = 0; n < nServerArgs; ++n )
	            {
	                this.addServer( optionsArray[ n ] );
	            }
	        }
  	        
		 } catch (IllegalArgumentException arge) { 
			  // A fault was raised. The fault message will contain the explanation
			  System.out.println(arge.getMessage());
			  System.out.println("Please verify that aeservices.properties file exists " +
					  			 "in the resources directory and has the proper read permission!");
			  return false; 
		 } catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
		return true;
	}

	// Method returns the index of the first occurance of specified Value
	private int indexOf(ArrayList<ArrayType> aList , String needle){
		if(aList != null && needle != null){
			for(int i = 0; i < aList.size(); i++){
				if( aList.get(i).getValue().equals(needle) )
					return i;
			}
		}
		
		// If not found
		return -1;
	}
	
	// Method returns the index of the first occurance of specified Position
	private int indexOfPosition(ArrayList<ArrayType> aList , long searchPosition){
		if(aList != null && searchPosition >= 0){
			for(int i = 0; i < aList.size(); i++){
				if( aList.get(i).getPosition() == searchPosition)
					return i;
			}
		}
		
		// If not found
		return -1;
	}
    //**************************************************************************
    // main()
    //**************************************************************************
    /**
  	 *  This application is configured via the aeservices.properties file located in the 
  	 *  resources directory of this SDK.
  	 *  
     *  The add command will first attempt to create the AESVCS entry if it is missing.
     *  The remove command will first attempt to disable the listed servers, if necessary
     *  If any servers are listed as "in use", this sample app will not allow you to disable or remove them
     */
    public static void main(String[] args)
    {
 
        // Instantiate AEServices request handler
        AEServices handler = new AEServices();
        
        // Load properties from file
        boolean argsOk = handler.loadProps();
        
        if ( argsOk == false )
        {
        	System.out.println("Please verify your settings in the aeservies.properties file!!");
            return; // 1;
        }
        // Let the handler run the command
        handler.exec();
        return;
    }
}
