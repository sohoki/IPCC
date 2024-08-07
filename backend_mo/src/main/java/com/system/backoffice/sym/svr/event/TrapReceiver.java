package com.system.backoffice.sym.svr.event;

import java.io.IOException;

import org.snmp4j.CommandResponder;
import org.snmp4j.CommandResponderEvent;
import org.snmp4j.CommunityTarget;
import org.snmp4j.MessageDispatcher;
import org.snmp4j.MessageDispatcherImpl;
import org.snmp4j.MessageException;
import org.snmp4j.PDU;
import org.snmp4j.Snmp;
import org.snmp4j.mp.MPv1;
import org.snmp4j.mp.MPv2c;
import org.snmp4j.mp.StateReference;
import org.snmp4j.mp.StatusInformation;
import org.snmp4j.security.Priv3DES;
import org.snmp4j.security.SecurityProtocols;
import org.snmp4j.smi.Address;
import org.snmp4j.smi.OctetString;
import org.snmp4j.smi.TcpAddress;
import org.snmp4j.smi.TransportIpAddress;
import org.snmp4j.smi.UdpAddress;
import org.snmp4j.transport.AbstractTransportMapping;
import org.snmp4j.transport.DefaultTcpTransportMapping;
import org.snmp4j.transport.DefaultUdpTransportMapping;
import org.snmp4j.util.ThreadPool;
import lombok.extern.slf4j.Slf4j;

import org.snmp4j.util.MultiThreadedMessageDispatcher;


@Slf4j
public class TrapReceiver implements  CommandResponder{

	public TrapReceiver() {
		
	}
	/*
	public static void main(String[] args){
		TrapReceiver snmp4jTrapReceiver = new TrapReceiver();
		try{
			snmp4jTrapReceiver.listen(new UdpAddress("192.168.22.178/164"));
		}catch (IOException e){
			System.err.println("Error in Listening for Trap");
			System.err.println("Exception Message = " + e.getMessage());
		}
	}
	*/
	public synchronized void listen(TransportIpAddress address) throws IOException{
		
		AbstractTransportMapping transport;
		if (address instanceof TcpAddress){
			log.info("tcp listen");
			transport = new DefaultTcpTransportMapping((TcpAddress) address);
		}else{
			log.info("udp listen");
			transport = new DefaultUdpTransportMapping((UdpAddress) address);
		}

		ThreadPool threadPool = ThreadPool.create("DispatcherPool", 10);
		MessageDispatcher mtDispatcher = new MultiThreadedMessageDispatcher(threadPool, new MessageDispatcherImpl());
	
		// add message processing models
		mtDispatcher.addMessageProcessingModel(new MPv1());
		mtDispatcher.addMessageProcessingModel(new MPv2c());
	
		// add all security protocols
		SecurityProtocols.getInstance().addDefaultProtocols();
		SecurityProtocols.getInstance().addPrivacyProtocol(new Priv3DES());
	
		//Create Target
		CommunityTarget target = new CommunityTarget();
		target.setCommunity( new OctetString("pbxsnmp"));
		
		Snmp snmp = new Snmp(mtDispatcher, transport);
		snmp.addCommandResponder(this);
		
		transport.listen();
		System.out.println("Listening on " + address);

		try{
			this.wait();
		}catch (InterruptedException ex){
			Thread.currentThread().interrupt();
		}
	}
	@Override
	public <A extends Address> void processPdu(CommandResponderEvent<A> event) {
		// TODO Auto-generated method stub
		PDU pdu = event.getPDU();
		if (pdu != null){
	
			System.out.println("Trap Type = " + pdu.getType());
			System.out.println("Variable Bindings = " + pdu.getVariableBindings());
			int pduType = pdu.getType();
			if ((pduType != PDU.TRAP) && (pduType != PDU.V1TRAP) && (pduType != PDU.REPORT) && (pduType != PDU.RESPONSE)){
				
				pdu.setErrorIndex(0);
				pdu.setErrorStatus(0);
				pdu.setType(PDU.RESPONSE);
				StatusInformation statusInformation = new StatusInformation();
				StateReference ref = event.getStateReference();
				try{
					System.out.println(event.getPDU());
					event.getMessageDispatcher().returnResponsePdu(event.getMessageProcessingModel(),
							event.getSecurityModel(), event.getSecurityName(), event.getSecurityLevel(),
					pdu, event.getMaxSizeResponsePDU(), ref, statusInformation);
				}catch (MessageException ex){
					System.err.println("Error while sending response: " + ex.getMessage());
					
				}
			}
		}
	}
	
}
