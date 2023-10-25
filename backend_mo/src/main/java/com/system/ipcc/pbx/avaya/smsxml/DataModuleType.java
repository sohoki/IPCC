
package com.system.ipcc.pbx.avaya.smsxml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DataModuleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataModuleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Extension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Busyout" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Loc_Node_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Subnetmask1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Subnetmask2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Subnetmask3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Subnetmask4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IP_Address_Negotiation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Establish_Connection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Establish_Connectionx25" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Destination_Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Destination_Numberx25" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Speed_Low" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Destination_Node_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Chap" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Chap_Secret" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Connected_Data_Module" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Host_Broadcast_Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Board" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Abbreviated_Dial_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Number_Packets" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Speed300" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Speed1200" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Speed2400" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Speed4800" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Speed9600" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Speed19200" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Speed_Auto_Adjust" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Parity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Data_Module_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Dial_Echo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Disconnect_Sequence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Answer_Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Mismatch_Speed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Connected_Indication" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Connected_To" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Remote_Loop_Test" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Secondary_Data_Module" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Endpoint_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_Channels" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Port" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Baud" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Permanent_Virtual_Circuit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="High_Permanent_Virtual_Circuit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Switch_Virtual_Circuit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="One_way_Inchannel_Low" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="One_way_Inchannel_High" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Two_way_channel_Low" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Two_way_Channel_High" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="One_way_Out_Channel_Low" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="One_way_Out_Channel_High" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Flow_Control_Negotiiation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Thru_Put_Class_Negotiation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Default_Thru_Put_Class" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Window" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Retry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Framesize" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Retrans_T1_Timer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Idle_T4_Timer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Restart_T10_Timer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Restart_T20_Timer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="COS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Call_T11_Timer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Call_T21_Timer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Reset_T12_Timer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Reset_T22_Timer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Clear_T13_Timer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Clear_T23_Timer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Special_Dial_Option" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maintenance_Extension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Bearer_Capability_Class" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Info_Transfer_Capability" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="COR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ISDN_Flag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Clldaddrtyp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="In_Called_Address_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Default_Out_Called_Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Prepend_Prefix_Digit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Log_Errors" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Mim_Service_Profileid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Endpoint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Mim_Support" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Mim_Messages" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Physical_Channel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Mim_Init" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Exchangeid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Fixtei" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Bride_Fault_Duplex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Bride_Fault_Mode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Bride_Fault_Speed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Brix25d_Channel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Bride_Fault_Application" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Bri_Numberb_Channels" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Bride_Fault_ITC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Keyboard_Dial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Country_Protocol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Protocol_Version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Endpointid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Onestep_Clearing" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Action_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sppd_Port" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ttiflags" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Tenant_Partition_Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Multimedia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Config" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Net_Packet_Modem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximumnet_Packet_BAUD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Dtedce" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Eia_Connected_To" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Eia_Clocking" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Clan_Modem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Link" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Linkx25" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Enabled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Enabledx25" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;group ref="{http://xml.avaya.com/sms}DataModuleArrayGroup"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataModuleType", propOrder = {
    "extension",
    "busyout",
    "locNodeName",
    "subnetmask1",
    "subnetmask2",
    "subnetmask3",
    "subnetmask4",
    "ipAddressNegotiation",
    "establishConnection",
    "establishConnectionx25",
    "destinationNumber",
    "destinationNumberx25",
    "speedLow",
    "destinationNodeName",
    "chap",
    "chapSecret",
    "connectedDataModule",
    "hostBroadcastAddress",
    "board",
    "abbreviatedDialCode",
    "numberPackets",
    "speed300",
    "name",
    "speed1200",
    "speed2400",
    "speed4800",
    "speed9600",
    "speed19200",
    "speedAutoAdjust",
    "parity",
    "dataModuleType",
    "dialEcho",
    "disconnectSequence",
    "answerText",
    "mismatchSpeed",
    "connectedIndication",
    "connectedTo",
    "remoteLoopTest",
    "secondaryDataModule",
    "endpointType",
    "maximumChannels",
    "port",
    "baud",
    "permanentVirtualCircuit",
    "highPermanentVirtualCircuit",
    "switchVirtualCircuit",
    "oneWayInchannelLow",
    "oneWayInchannelHigh",
    "twoWayChannelLow",
    "twoWayChannelHigh",
    "oneWayOutChannelLow",
    "oneWayOutChannelHigh",
    "flowControlNegotiiation",
    "thruPutClassNegotiation",
    "defaultThruPutClass",
    "window",
    "retry",
    "framesize",
    "retransT1Timer",
    "idleT4Timer",
    "restartT10Timer",
    "restartT20Timer",
    "cos",
    "callT11Timer",
    "callT21Timer",
    "resetT12Timer",
    "resetT22Timer",
    "clearT13Timer",
    "clearT23Timer",
    "specialDialOption",
    "maintenanceExtension",
    "bearerCapabilityClass",
    "infoTransferCapability",
    "cor",
    "isdnFlag",
    "clldaddrtyp",
    "inCalledAddressType",
    "defaultOutCalledAddress",
    "prependPrefixDigit",
    "logErrors",
    "mimServiceProfileid",
    "endpoint",
    "mimSupport",
    "mimMessages",
    "physicalChannel",
    "mimInit",
    "exchangeid",
    "fixtei",
    "brideFaultDuplex",
    "brideFaultMode",
    "brideFaultSpeed",
    "brix25DChannel",
    "brideFaultApplication",
    "briNumberbChannels",
    "brideFaultITC",
    "keyboardDial",
    "countryProtocol",
    "protocolVersion",
    "endpointid",
    "onestepClearing",
    "actionType",
    "sppdPort",
    "ttiflags",
    "tenantPartitionNumber",
    "multimedia",
    "config",
    "netPacketModem",
    "maximumnetPacketBAUD",
    "dtedce",
    "eiaConnectedTo",
    "eiaClocking",
    "clanModem",
    "link",
    "linkx25",
    "enabled",
    "enabledx25",
    "listNumber",
    "autodialType",
    "moduleExtension"
})
public class DataModuleType {

    @XmlElement(name = "Extension")
    protected String extension;
    @XmlElement(name = "Busyout")
    protected String busyout;
    @XmlElement(name = "Loc_Node_Name")
    protected String locNodeName;
    @XmlElement(name = "Subnetmask1")
    protected String subnetmask1;
    @XmlElement(name = "Subnetmask2")
    protected String subnetmask2;
    @XmlElement(name = "Subnetmask3")
    protected String subnetmask3;
    @XmlElement(name = "Subnetmask4")
    protected String subnetmask4;
    @XmlElement(name = "IP_Address_Negotiation")
    protected String ipAddressNegotiation;
    @XmlElement(name = "Establish_Connection")
    protected String establishConnection;
    @XmlElement(name = "Establish_Connectionx25")
    protected String establishConnectionx25;
    @XmlElement(name = "Destination_Number")
    protected String destinationNumber;
    @XmlElement(name = "Destination_Numberx25")
    protected String destinationNumberx25;
    @XmlElement(name = "Speed_Low")
    protected String speedLow;
    @XmlElement(name = "Destination_Node_Name")
    protected String destinationNodeName;
    @XmlElement(name = "Chap")
    protected String chap;
    @XmlElement(name = "Chap_Secret")
    protected String chapSecret;
    @XmlElement(name = "Connected_Data_Module")
    protected String connectedDataModule;
    @XmlElement(name = "Host_Broadcast_Address")
    protected String hostBroadcastAddress;
    @XmlElement(name = "Board")
    protected String board;
    @XmlElement(name = "Abbreviated_Dial_Code")
    protected String abbreviatedDialCode;
    @XmlElement(name = "Number_Packets")
    protected String numberPackets;
    @XmlElement(name = "Speed300")
    protected String speed300;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Speed1200")
    protected String speed1200;
    @XmlElement(name = "Speed2400")
    protected String speed2400;
    @XmlElement(name = "Speed4800")
    protected String speed4800;
    @XmlElement(name = "Speed9600")
    protected String speed9600;
    @XmlElement(name = "Speed19200")
    protected String speed19200;
    @XmlElement(name = "Speed_Auto_Adjust")
    protected String speedAutoAdjust;
    @XmlElement(name = "Parity")
    protected String parity;
    @XmlElement(name = "Data_Module_Type")
    protected String dataModuleType;
    @XmlElement(name = "Dial_Echo")
    protected String dialEcho;
    @XmlElement(name = "Disconnect_Sequence")
    protected String disconnectSequence;
    @XmlElement(name = "Answer_Text")
    protected String answerText;
    @XmlElement(name = "Mismatch_Speed")
    protected String mismatchSpeed;
    @XmlElement(name = "Connected_Indication")
    protected String connectedIndication;
    @XmlElement(name = "Connected_To")
    protected String connectedTo;
    @XmlElement(name = "Remote_Loop_Test")
    protected String remoteLoopTest;
    @XmlElement(name = "Secondary_Data_Module")
    protected String secondaryDataModule;
    @XmlElement(name = "Endpoint_Type")
    protected String endpointType;
    @XmlElement(name = "Maximum_Channels")
    protected String maximumChannels;
    @XmlElement(name = "Port")
    protected String port;
    @XmlElement(name = "Baud")
    protected String baud;
    @XmlElement(name = "Permanent_Virtual_Circuit")
    protected String permanentVirtualCircuit;
    @XmlElement(name = "High_Permanent_Virtual_Circuit")
    protected String highPermanentVirtualCircuit;
    @XmlElement(name = "Switch_Virtual_Circuit")
    protected String switchVirtualCircuit;
    @XmlElement(name = "One_way_Inchannel_Low")
    protected String oneWayInchannelLow;
    @XmlElement(name = "One_way_Inchannel_High")
    protected String oneWayInchannelHigh;
    @XmlElement(name = "Two_way_channel_Low")
    protected String twoWayChannelLow;
    @XmlElement(name = "Two_way_Channel_High")
    protected String twoWayChannelHigh;
    @XmlElement(name = "One_way_Out_Channel_Low")
    protected String oneWayOutChannelLow;
    @XmlElement(name = "One_way_Out_Channel_High")
    protected String oneWayOutChannelHigh;
    @XmlElement(name = "Flow_Control_Negotiiation")
    protected String flowControlNegotiiation;
    @XmlElement(name = "Thru_Put_Class_Negotiation")
    protected String thruPutClassNegotiation;
    @XmlElement(name = "Default_Thru_Put_Class")
    protected String defaultThruPutClass;
    @XmlElement(name = "Window")
    protected String window;
    @XmlElement(name = "Retry")
    protected String retry;
    @XmlElement(name = "Framesize")
    protected String framesize;
    @XmlElement(name = "Retrans_T1_Timer")
    protected String retransT1Timer;
    @XmlElement(name = "Idle_T4_Timer")
    protected String idleT4Timer;
    @XmlElement(name = "Restart_T10_Timer")
    protected String restartT10Timer;
    @XmlElement(name = "Restart_T20_Timer")
    protected String restartT20Timer;
    @XmlElement(name = "COS")
    protected String cos;
    @XmlElement(name = "Call_T11_Timer")
    protected String callT11Timer;
    @XmlElement(name = "Call_T21_Timer")
    protected String callT21Timer;
    @XmlElement(name = "Reset_T12_Timer")
    protected String resetT12Timer;
    @XmlElement(name = "Reset_T22_Timer")
    protected String resetT22Timer;
    @XmlElement(name = "Clear_T13_Timer")
    protected String clearT13Timer;
    @XmlElement(name = "Clear_T23_Timer")
    protected String clearT23Timer;
    @XmlElement(name = "Special_Dial_Option")
    protected String specialDialOption;
    @XmlElement(name = "Maintenance_Extension")
    protected String maintenanceExtension;
    @XmlElement(name = "Bearer_Capability_Class")
    protected String bearerCapabilityClass;
    @XmlElement(name = "Info_Transfer_Capability")
    protected String infoTransferCapability;
    @XmlElement(name = "COR")
    protected String cor;
    @XmlElement(name = "ISDN_Flag")
    protected String isdnFlag;
    @XmlElement(name = "Clldaddrtyp")
    protected String clldaddrtyp;
    @XmlElement(name = "In_Called_Address_Type")
    protected String inCalledAddressType;
    @XmlElement(name = "Default_Out_Called_Address")
    protected String defaultOutCalledAddress;
    @XmlElement(name = "Prepend_Prefix_Digit")
    protected String prependPrefixDigit;
    @XmlElement(name = "Log_Errors")
    protected String logErrors;
    @XmlElement(name = "Mim_Service_Profileid")
    protected String mimServiceProfileid;
    @XmlElement(name = "Endpoint")
    protected String endpoint;
    @XmlElement(name = "Mim_Support")
    protected String mimSupport;
    @XmlElement(name = "Mim_Messages")
    protected String mimMessages;
    @XmlElement(name = "Physical_Channel")
    protected String physicalChannel;
    @XmlElement(name = "Mim_Init")
    protected String mimInit;
    @XmlElement(name = "Exchangeid")
    protected String exchangeid;
    @XmlElement(name = "Fixtei")
    protected String fixtei;
    @XmlElement(name = "Bride_Fault_Duplex")
    protected String brideFaultDuplex;
    @XmlElement(name = "Bride_Fault_Mode")
    protected String brideFaultMode;
    @XmlElement(name = "Bride_Fault_Speed")
    protected String brideFaultSpeed;
    @XmlElement(name = "Brix25d_Channel")
    protected String brix25DChannel;
    @XmlElement(name = "Bride_Fault_Application")
    protected String brideFaultApplication;
    @XmlElement(name = "Bri_Numberb_Channels")
    protected String briNumberbChannels;
    @XmlElement(name = "Bride_Fault_ITC")
    protected String brideFaultITC;
    @XmlElement(name = "Keyboard_Dial")
    protected String keyboardDial;
    @XmlElement(name = "Country_Protocol")
    protected String countryProtocol;
    @XmlElement(name = "Protocol_Version")
    protected String protocolVersion;
    @XmlElement(name = "Endpointid")
    protected String endpointid;
    @XmlElement(name = "Onestep_Clearing")
    protected String onestepClearing;
    @XmlElement(name = "Action_Type")
    protected String actionType;
    @XmlElement(name = "Sppd_Port")
    protected String sppdPort;
    @XmlElement(name = "Ttiflags")
    protected String ttiflags;
    @XmlElement(name = "Tenant_Partition_Number")
    protected String tenantPartitionNumber;
    @XmlElement(name = "Multimedia")
    protected String multimedia;
    @XmlElement(name = "Config")
    protected String config;
    @XmlElement(name = "Net_Packet_Modem")
    protected String netPacketModem;
    @XmlElement(name = "Maximumnet_Packet_BAUD")
    protected String maximumnetPacketBAUD;
    @XmlElement(name = "Dtedce")
    protected String dtedce;
    @XmlElement(name = "Eia_Connected_To")
    protected String eiaConnectedTo;
    @XmlElement(name = "Eia_Clocking")
    protected String eiaClocking;
    @XmlElement(name = "Clan_Modem")
    protected String clanModem;
    @XmlElement(name = "Link")
    protected String link;
    @XmlElement(name = "Linkx25")
    protected String linkx25;
    @XmlElement(name = "Enabled")
    protected String enabled;
    @XmlElement(name = "Enabledx25")
    protected String enabledx25;
    @XmlElement(name = "List_Number")
    protected List<ArrayType> listNumber;
    @XmlElement(name = "Autodial_Type")
    protected List<ArrayType> autodialType;
    @XmlElement(name = "Module_Extension")
    protected List<ArrayType> moduleExtension;

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtension(String value) {
        this.extension = value;
    }

    /**
     * Gets the value of the busyout property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusyout() {
        return busyout;
    }

    /**
     * Sets the value of the busyout property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusyout(String value) {
        this.busyout = value;
    }

    /**
     * Gets the value of the locNodeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocNodeName() {
        return locNodeName;
    }

    /**
     * Sets the value of the locNodeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocNodeName(String value) {
        this.locNodeName = value;
    }

    /**
     * Gets the value of the subnetmask1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubnetmask1() {
        return subnetmask1;
    }

    /**
     * Sets the value of the subnetmask1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubnetmask1(String value) {
        this.subnetmask1 = value;
    }

    /**
     * Gets the value of the subnetmask2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubnetmask2() {
        return subnetmask2;
    }

    /**
     * Sets the value of the subnetmask2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubnetmask2(String value) {
        this.subnetmask2 = value;
    }

    /**
     * Gets the value of the subnetmask3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubnetmask3() {
        return subnetmask3;
    }

    /**
     * Sets the value of the subnetmask3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubnetmask3(String value) {
        this.subnetmask3 = value;
    }

    /**
     * Gets the value of the subnetmask4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubnetmask4() {
        return subnetmask4;
    }

    /**
     * Sets the value of the subnetmask4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubnetmask4(String value) {
        this.subnetmask4 = value;
    }

    /**
     * Gets the value of the ipAddressNegotiation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPAddressNegotiation() {
        return ipAddressNegotiation;
    }

    /**
     * Sets the value of the ipAddressNegotiation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPAddressNegotiation(String value) {
        this.ipAddressNegotiation = value;
    }

    /**
     * Gets the value of the establishConnection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstablishConnection() {
        return establishConnection;
    }

    /**
     * Sets the value of the establishConnection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstablishConnection(String value) {
        this.establishConnection = value;
    }

    /**
     * Gets the value of the establishConnectionx25 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstablishConnectionx25() {
        return establishConnectionx25;
    }

    /**
     * Sets the value of the establishConnectionx25 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstablishConnectionx25(String value) {
        this.establishConnectionx25 = value;
    }

    /**
     * Gets the value of the destinationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationNumber() {
        return destinationNumber;
    }

    /**
     * Sets the value of the destinationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationNumber(String value) {
        this.destinationNumber = value;
    }

    /**
     * Gets the value of the destinationNumberx25 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationNumberx25() {
        return destinationNumberx25;
    }

    /**
     * Sets the value of the destinationNumberx25 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationNumberx25(String value) {
        this.destinationNumberx25 = value;
    }

    /**
     * Gets the value of the speedLow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeedLow() {
        return speedLow;
    }

    /**
     * Sets the value of the speedLow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeedLow(String value) {
        this.speedLow = value;
    }

    /**
     * Gets the value of the destinationNodeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationNodeName() {
        return destinationNodeName;
    }

    /**
     * Sets the value of the destinationNodeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationNodeName(String value) {
        this.destinationNodeName = value;
    }

    /**
     * Gets the value of the chap property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChap() {
        return chap;
    }

    /**
     * Sets the value of the chap property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChap(String value) {
        this.chap = value;
    }

    /**
     * Gets the value of the chapSecret property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChapSecret() {
        return chapSecret;
    }

    /**
     * Sets the value of the chapSecret property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChapSecret(String value) {
        this.chapSecret = value;
    }

    /**
     * Gets the value of the connectedDataModule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectedDataModule() {
        return connectedDataModule;
    }

    /**
     * Sets the value of the connectedDataModule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectedDataModule(String value) {
        this.connectedDataModule = value;
    }

    /**
     * Gets the value of the hostBroadcastAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostBroadcastAddress() {
        return hostBroadcastAddress;
    }

    /**
     * Sets the value of the hostBroadcastAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostBroadcastAddress(String value) {
        this.hostBroadcastAddress = value;
    }

    /**
     * Gets the value of the board property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoard() {
        return board;
    }

    /**
     * Sets the value of the board property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoard(String value) {
        this.board = value;
    }

    /**
     * Gets the value of the abbreviatedDialCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbbreviatedDialCode() {
        return abbreviatedDialCode;
    }

    /**
     * Sets the value of the abbreviatedDialCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbbreviatedDialCode(String value) {
        this.abbreviatedDialCode = value;
    }

    /**
     * Gets the value of the numberPackets property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberPackets() {
        return numberPackets;
    }

    /**
     * Sets the value of the numberPackets property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberPackets(String value) {
        this.numberPackets = value;
    }

    /**
     * Gets the value of the speed300 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeed300() {
        return speed300;
    }

    /**
     * Sets the value of the speed300 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeed300(String value) {
        this.speed300 = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the speed1200 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeed1200() {
        return speed1200;
    }

    /**
     * Sets the value of the speed1200 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeed1200(String value) {
        this.speed1200 = value;
    }

    /**
     * Gets the value of the speed2400 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeed2400() {
        return speed2400;
    }

    /**
     * Sets the value of the speed2400 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeed2400(String value) {
        this.speed2400 = value;
    }

    /**
     * Gets the value of the speed4800 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeed4800() {
        return speed4800;
    }

    /**
     * Sets the value of the speed4800 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeed4800(String value) {
        this.speed4800 = value;
    }

    /**
     * Gets the value of the speed9600 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeed9600() {
        return speed9600;
    }

    /**
     * Sets the value of the speed9600 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeed9600(String value) {
        this.speed9600 = value;
    }

    /**
     * Gets the value of the speed19200 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeed19200() {
        return speed19200;
    }

    /**
     * Sets the value of the speed19200 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeed19200(String value) {
        this.speed19200 = value;
    }

    /**
     * Gets the value of the speedAutoAdjust property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeedAutoAdjust() {
        return speedAutoAdjust;
    }

    /**
     * Sets the value of the speedAutoAdjust property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeedAutoAdjust(String value) {
        this.speedAutoAdjust = value;
    }

    /**
     * Gets the value of the parity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParity() {
        return parity;
    }

    /**
     * Sets the value of the parity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParity(String value) {
        this.parity = value;
    }

    /**
     * Gets the value of the dataModuleType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataModuleType() {
        return dataModuleType;
    }

    /**
     * Sets the value of the dataModuleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataModuleType(String value) {
        this.dataModuleType = value;
    }

    /**
     * Gets the value of the dialEcho property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDialEcho() {
        return dialEcho;
    }

    /**
     * Sets the value of the dialEcho property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDialEcho(String value) {
        this.dialEcho = value;
    }

    /**
     * Gets the value of the disconnectSequence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisconnectSequence() {
        return disconnectSequence;
    }

    /**
     * Sets the value of the disconnectSequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisconnectSequence(String value) {
        this.disconnectSequence = value;
    }

    /**
     * Gets the value of the answerText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnswerText() {
        return answerText;
    }

    /**
     * Sets the value of the answerText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnswerText(String value) {
        this.answerText = value;
    }

    /**
     * Gets the value of the mismatchSpeed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMismatchSpeed() {
        return mismatchSpeed;
    }

    /**
     * Sets the value of the mismatchSpeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMismatchSpeed(String value) {
        this.mismatchSpeed = value;
    }

    /**
     * Gets the value of the connectedIndication property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectedIndication() {
        return connectedIndication;
    }

    /**
     * Sets the value of the connectedIndication property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectedIndication(String value) {
        this.connectedIndication = value;
    }

    /**
     * Gets the value of the connectedTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectedTo() {
        return connectedTo;
    }

    /**
     * Sets the value of the connectedTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectedTo(String value) {
        this.connectedTo = value;
    }

    /**
     * Gets the value of the remoteLoopTest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteLoopTest() {
        return remoteLoopTest;
    }

    /**
     * Sets the value of the remoteLoopTest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteLoopTest(String value) {
        this.remoteLoopTest = value;
    }

    /**
     * Gets the value of the secondaryDataModule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondaryDataModule() {
        return secondaryDataModule;
    }

    /**
     * Sets the value of the secondaryDataModule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondaryDataModule(String value) {
        this.secondaryDataModule = value;
    }

    /**
     * Gets the value of the endpointType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndpointType() {
        return endpointType;
    }

    /**
     * Sets the value of the endpointType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndpointType(String value) {
        this.endpointType = value;
    }

    /**
     * Gets the value of the maximumChannels property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumChannels() {
        return maximumChannels;
    }

    /**
     * Sets the value of the maximumChannels property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumChannels(String value) {
        this.maximumChannels = value;
    }

    /**
     * Gets the value of the port property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPort() {
        return port;
    }

    /**
     * Sets the value of the port property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPort(String value) {
        this.port = value;
    }

    /**
     * Gets the value of the baud property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaud() {
        return baud;
    }

    /**
     * Sets the value of the baud property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaud(String value) {
        this.baud = value;
    }

    /**
     * Gets the value of the permanentVirtualCircuit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPermanentVirtualCircuit() {
        return permanentVirtualCircuit;
    }

    /**
     * Sets the value of the permanentVirtualCircuit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPermanentVirtualCircuit(String value) {
        this.permanentVirtualCircuit = value;
    }

    /**
     * Gets the value of the highPermanentVirtualCircuit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHighPermanentVirtualCircuit() {
        return highPermanentVirtualCircuit;
    }

    /**
     * Sets the value of the highPermanentVirtualCircuit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHighPermanentVirtualCircuit(String value) {
        this.highPermanentVirtualCircuit = value;
    }

    /**
     * Gets the value of the switchVirtualCircuit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSwitchVirtualCircuit() {
        return switchVirtualCircuit;
    }

    /**
     * Sets the value of the switchVirtualCircuit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSwitchVirtualCircuit(String value) {
        this.switchVirtualCircuit = value;
    }

    /**
     * Gets the value of the oneWayInchannelLow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOneWayInchannelLow() {
        return oneWayInchannelLow;
    }

    /**
     * Sets the value of the oneWayInchannelLow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOneWayInchannelLow(String value) {
        this.oneWayInchannelLow = value;
    }

    /**
     * Gets the value of the oneWayInchannelHigh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOneWayInchannelHigh() {
        return oneWayInchannelHigh;
    }

    /**
     * Sets the value of the oneWayInchannelHigh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOneWayInchannelHigh(String value) {
        this.oneWayInchannelHigh = value;
    }

    /**
     * Gets the value of the twoWayChannelLow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTwoWayChannelLow() {
        return twoWayChannelLow;
    }

    /**
     * Sets the value of the twoWayChannelLow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTwoWayChannelLow(String value) {
        this.twoWayChannelLow = value;
    }

    /**
     * Gets the value of the twoWayChannelHigh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTwoWayChannelHigh() {
        return twoWayChannelHigh;
    }

    /**
     * Sets the value of the twoWayChannelHigh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTwoWayChannelHigh(String value) {
        this.twoWayChannelHigh = value;
    }

    /**
     * Gets the value of the oneWayOutChannelLow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOneWayOutChannelLow() {
        return oneWayOutChannelLow;
    }

    /**
     * Sets the value of the oneWayOutChannelLow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOneWayOutChannelLow(String value) {
        this.oneWayOutChannelLow = value;
    }

    /**
     * Gets the value of the oneWayOutChannelHigh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOneWayOutChannelHigh() {
        return oneWayOutChannelHigh;
    }

    /**
     * Sets the value of the oneWayOutChannelHigh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOneWayOutChannelHigh(String value) {
        this.oneWayOutChannelHigh = value;
    }

    /**
     * Gets the value of the flowControlNegotiiation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlowControlNegotiiation() {
        return flowControlNegotiiation;
    }

    /**
     * Sets the value of the flowControlNegotiiation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlowControlNegotiiation(String value) {
        this.flowControlNegotiiation = value;
    }

    /**
     * Gets the value of the thruPutClassNegotiation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThruPutClassNegotiation() {
        return thruPutClassNegotiation;
    }

    /**
     * Sets the value of the thruPutClassNegotiation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThruPutClassNegotiation(String value) {
        this.thruPutClassNegotiation = value;
    }

    /**
     * Gets the value of the defaultThruPutClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultThruPutClass() {
        return defaultThruPutClass;
    }

    /**
     * Sets the value of the defaultThruPutClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultThruPutClass(String value) {
        this.defaultThruPutClass = value;
    }

    /**
     * Gets the value of the window property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWindow() {
        return window;
    }

    /**
     * Sets the value of the window property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWindow(String value) {
        this.window = value;
    }

    /**
     * Gets the value of the retry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetry() {
        return retry;
    }

    /**
     * Sets the value of the retry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetry(String value) {
        this.retry = value;
    }

    /**
     * Gets the value of the framesize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFramesize() {
        return framesize;
    }

    /**
     * Sets the value of the framesize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFramesize(String value) {
        this.framesize = value;
    }

    /**
     * Gets the value of the retransT1Timer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetransT1Timer() {
        return retransT1Timer;
    }

    /**
     * Sets the value of the retransT1Timer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetransT1Timer(String value) {
        this.retransT1Timer = value;
    }

    /**
     * Gets the value of the idleT4Timer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdleT4Timer() {
        return idleT4Timer;
    }

    /**
     * Sets the value of the idleT4Timer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdleT4Timer(String value) {
        this.idleT4Timer = value;
    }

    /**
     * Gets the value of the restartT10Timer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRestartT10Timer() {
        return restartT10Timer;
    }

    /**
     * Sets the value of the restartT10Timer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRestartT10Timer(String value) {
        this.restartT10Timer = value;
    }

    /**
     * Gets the value of the restartT20Timer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRestartT20Timer() {
        return restartT20Timer;
    }

    /**
     * Sets the value of the restartT20Timer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRestartT20Timer(String value) {
        this.restartT20Timer = value;
    }

    /**
     * Gets the value of the cos property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOS() {
        return cos;
    }

    /**
     * Sets the value of the cos property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOS(String value) {
        this.cos = value;
    }

    /**
     * Gets the value of the callT11Timer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallT11Timer() {
        return callT11Timer;
    }

    /**
     * Sets the value of the callT11Timer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallT11Timer(String value) {
        this.callT11Timer = value;
    }

    /**
     * Gets the value of the callT21Timer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallT21Timer() {
        return callT21Timer;
    }

    /**
     * Sets the value of the callT21Timer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallT21Timer(String value) {
        this.callT21Timer = value;
    }

    /**
     * Gets the value of the resetT12Timer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResetT12Timer() {
        return resetT12Timer;
    }

    /**
     * Sets the value of the resetT12Timer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResetT12Timer(String value) {
        this.resetT12Timer = value;
    }

    /**
     * Gets the value of the resetT22Timer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResetT22Timer() {
        return resetT22Timer;
    }

    /**
     * Sets the value of the resetT22Timer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResetT22Timer(String value) {
        this.resetT22Timer = value;
    }

    /**
     * Gets the value of the clearT13Timer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClearT13Timer() {
        return clearT13Timer;
    }

    /**
     * Sets the value of the clearT13Timer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClearT13Timer(String value) {
        this.clearT13Timer = value;
    }

    /**
     * Gets the value of the clearT23Timer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClearT23Timer() {
        return clearT23Timer;
    }

    /**
     * Sets the value of the clearT23Timer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClearT23Timer(String value) {
        this.clearT23Timer = value;
    }

    /**
     * Gets the value of the specialDialOption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialDialOption() {
        return specialDialOption;
    }

    /**
     * Sets the value of the specialDialOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialDialOption(String value) {
        this.specialDialOption = value;
    }

    /**
     * Gets the value of the maintenanceExtension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaintenanceExtension() {
        return maintenanceExtension;
    }

    /**
     * Sets the value of the maintenanceExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaintenanceExtension(String value) {
        this.maintenanceExtension = value;
    }

    /**
     * Gets the value of the bearerCapabilityClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBearerCapabilityClass() {
        return bearerCapabilityClass;
    }

    /**
     * Sets the value of the bearerCapabilityClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBearerCapabilityClass(String value) {
        this.bearerCapabilityClass = value;
    }

    /**
     * Gets the value of the infoTransferCapability property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfoTransferCapability() {
        return infoTransferCapability;
    }

    /**
     * Sets the value of the infoTransferCapability property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfoTransferCapability(String value) {
        this.infoTransferCapability = value;
    }

    /**
     * Gets the value of the cor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOR() {
        return cor;
    }

    /**
     * Sets the value of the cor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOR(String value) {
        this.cor = value;
    }

    /**
     * Gets the value of the isdnFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISDNFlag() {
        return isdnFlag;
    }

    /**
     * Sets the value of the isdnFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISDNFlag(String value) {
        this.isdnFlag = value;
    }

    /**
     * Gets the value of the clldaddrtyp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClldaddrtyp() {
        return clldaddrtyp;
    }

    /**
     * Sets the value of the clldaddrtyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClldaddrtyp(String value) {
        this.clldaddrtyp = value;
    }

    /**
     * Gets the value of the inCalledAddressType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCalledAddressType() {
        return inCalledAddressType;
    }

    /**
     * Sets the value of the inCalledAddressType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCalledAddressType(String value) {
        this.inCalledAddressType = value;
    }

    /**
     * Gets the value of the defaultOutCalledAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultOutCalledAddress() {
        return defaultOutCalledAddress;
    }

    /**
     * Sets the value of the defaultOutCalledAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultOutCalledAddress(String value) {
        this.defaultOutCalledAddress = value;
    }

    /**
     * Gets the value of the prependPrefixDigit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrependPrefixDigit() {
        return prependPrefixDigit;
    }

    /**
     * Sets the value of the prependPrefixDigit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrependPrefixDigit(String value) {
        this.prependPrefixDigit = value;
    }

    /**
     * Gets the value of the logErrors property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogErrors() {
        return logErrors;
    }

    /**
     * Sets the value of the logErrors property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogErrors(String value) {
        this.logErrors = value;
    }

    /**
     * Gets the value of the mimServiceProfileid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMimServiceProfileid() {
        return mimServiceProfileid;
    }

    /**
     * Sets the value of the mimServiceProfileid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMimServiceProfileid(String value) {
        this.mimServiceProfileid = value;
    }

    /**
     * Gets the value of the endpoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndpoint() {
        return endpoint;
    }

    /**
     * Sets the value of the endpoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndpoint(String value) {
        this.endpoint = value;
    }

    /**
     * Gets the value of the mimSupport property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMimSupport() {
        return mimSupport;
    }

    /**
     * Sets the value of the mimSupport property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMimSupport(String value) {
        this.mimSupport = value;
    }

    /**
     * Gets the value of the mimMessages property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMimMessages() {
        return mimMessages;
    }

    /**
     * Sets the value of the mimMessages property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMimMessages(String value) {
        this.mimMessages = value;
    }

    /**
     * Gets the value of the physicalChannel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhysicalChannel() {
        return physicalChannel;
    }

    /**
     * Sets the value of the physicalChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhysicalChannel(String value) {
        this.physicalChannel = value;
    }

    /**
     * Gets the value of the mimInit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMimInit() {
        return mimInit;
    }

    /**
     * Sets the value of the mimInit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMimInit(String value) {
        this.mimInit = value;
    }

    /**
     * Gets the value of the exchangeid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExchangeid() {
        return exchangeid;
    }

    /**
     * Sets the value of the exchangeid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExchangeid(String value) {
        this.exchangeid = value;
    }

    /**
     * Gets the value of the fixtei property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFixtei() {
        return fixtei;
    }

    /**
     * Sets the value of the fixtei property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFixtei(String value) {
        this.fixtei = value;
    }

    /**
     * Gets the value of the brideFaultDuplex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrideFaultDuplex() {
        return brideFaultDuplex;
    }

    /**
     * Sets the value of the brideFaultDuplex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrideFaultDuplex(String value) {
        this.brideFaultDuplex = value;
    }

    /**
     * Gets the value of the brideFaultMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrideFaultMode() {
        return brideFaultMode;
    }

    /**
     * Sets the value of the brideFaultMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrideFaultMode(String value) {
        this.brideFaultMode = value;
    }

    /**
     * Gets the value of the brideFaultSpeed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrideFaultSpeed() {
        return brideFaultSpeed;
    }

    /**
     * Sets the value of the brideFaultSpeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrideFaultSpeed(String value) {
        this.brideFaultSpeed = value;
    }

    /**
     * Gets the value of the brix25DChannel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrix25DChannel() {
        return brix25DChannel;
    }

    /**
     * Sets the value of the brix25DChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrix25DChannel(String value) {
        this.brix25DChannel = value;
    }

    /**
     * Gets the value of the brideFaultApplication property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrideFaultApplication() {
        return brideFaultApplication;
    }

    /**
     * Sets the value of the brideFaultApplication property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrideFaultApplication(String value) {
        this.brideFaultApplication = value;
    }

    /**
     * Gets the value of the briNumberbChannels property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBriNumberbChannels() {
        return briNumberbChannels;
    }

    /**
     * Sets the value of the briNumberbChannels property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBriNumberbChannels(String value) {
        this.briNumberbChannels = value;
    }

    /**
     * Gets the value of the brideFaultITC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrideFaultITC() {
        return brideFaultITC;
    }

    /**
     * Sets the value of the brideFaultITC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrideFaultITC(String value) {
        this.brideFaultITC = value;
    }

    /**
     * Gets the value of the keyboardDial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyboardDial() {
        return keyboardDial;
    }

    /**
     * Sets the value of the keyboardDial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyboardDial(String value) {
        this.keyboardDial = value;
    }

    /**
     * Gets the value of the countryProtocol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryProtocol() {
        return countryProtocol;
    }

    /**
     * Sets the value of the countryProtocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryProtocol(String value) {
        this.countryProtocol = value;
    }

    /**
     * Gets the value of the protocolVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtocolVersion() {
        return protocolVersion;
    }

    /**
     * Sets the value of the protocolVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtocolVersion(String value) {
        this.protocolVersion = value;
    }

    /**
     * Gets the value of the endpointid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndpointid() {
        return endpointid;
    }

    /**
     * Sets the value of the endpointid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndpointid(String value) {
        this.endpointid = value;
    }

    /**
     * Gets the value of the onestepClearing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnestepClearing() {
        return onestepClearing;
    }

    /**
     * Sets the value of the onestepClearing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnestepClearing(String value) {
        this.onestepClearing = value;
    }

    /**
     * Gets the value of the actionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionType() {
        return actionType;
    }

    /**
     * Sets the value of the actionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionType(String value) {
        this.actionType = value;
    }

    /**
     * Gets the value of the sppdPort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSppdPort() {
        return sppdPort;
    }

    /**
     * Sets the value of the sppdPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSppdPort(String value) {
        this.sppdPort = value;
    }

    /**
     * Gets the value of the ttiflags property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTtiflags() {
        return ttiflags;
    }

    /**
     * Sets the value of the ttiflags property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTtiflags(String value) {
        this.ttiflags = value;
    }

    /**
     * Gets the value of the tenantPartitionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTenantPartitionNumber() {
        return tenantPartitionNumber;
    }

    /**
     * Sets the value of the tenantPartitionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTenantPartitionNumber(String value) {
        this.tenantPartitionNumber = value;
    }

    /**
     * Gets the value of the multimedia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMultimedia() {
        return multimedia;
    }

    /**
     * Sets the value of the multimedia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMultimedia(String value) {
        this.multimedia = value;
    }

    /**
     * Gets the value of the config property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfig() {
        return config;
    }

    /**
     * Sets the value of the config property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfig(String value) {
        this.config = value;
    }

    /**
     * Gets the value of the netPacketModem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetPacketModem() {
        return netPacketModem;
    }

    /**
     * Sets the value of the netPacketModem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetPacketModem(String value) {
        this.netPacketModem = value;
    }

    /**
     * Gets the value of the maximumnetPacketBAUD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumnetPacketBAUD() {
        return maximumnetPacketBAUD;
    }

    /**
     * Sets the value of the maximumnetPacketBAUD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumnetPacketBAUD(String value) {
        this.maximumnetPacketBAUD = value;
    }

    /**
     * Gets the value of the dtedce property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtedce() {
        return dtedce;
    }

    /**
     * Sets the value of the dtedce property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtedce(String value) {
        this.dtedce = value;
    }

    /**
     * Gets the value of the eiaConnectedTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEiaConnectedTo() {
        return eiaConnectedTo;
    }

    /**
     * Sets the value of the eiaConnectedTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEiaConnectedTo(String value) {
        this.eiaConnectedTo = value;
    }

    /**
     * Gets the value of the eiaClocking property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEiaClocking() {
        return eiaClocking;
    }

    /**
     * Sets the value of the eiaClocking property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEiaClocking(String value) {
        this.eiaClocking = value;
    }

    /**
     * Gets the value of the clanModem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClanModem() {
        return clanModem;
    }

    /**
     * Sets the value of the clanModem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClanModem(String value) {
        this.clanModem = value;
    }

    /**
     * Gets the value of the link property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLink() {
        return link;
    }

    /**
     * Sets the value of the link property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLink(String value) {
        this.link = value;
    }

    /**
     * Gets the value of the linkx25 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkx25() {
        return linkx25;
    }

    /**
     * Sets the value of the linkx25 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkx25(String value) {
        this.linkx25 = value;
    }

    /**
     * Gets the value of the enabled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnabled() {
        return enabled;
    }

    /**
     * Sets the value of the enabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnabled(String value) {
        this.enabled = value;
    }

    /**
     * Gets the value of the enabledx25 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnabledx25() {
        return enabledx25;
    }

    /**
     * Sets the value of the enabledx25 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnabledx25(String value) {
        this.enabledx25 = value;
    }

    /**
     * Gets the value of the listNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getListNumber() {
        if (listNumber == null) {
            listNumber = new ArrayList<ArrayType>();
        }
        return this.listNumber;
    }

    /**
     * Gets the value of the autodialType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the autodialType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAutodialType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getAutodialType() {
        if (autodialType == null) {
            autodialType = new ArrayList<ArrayType>();
        }
        return this.autodialType;
    }

    /**
     * Gets the value of the moduleExtension property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the moduleExtension property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModuleExtension().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getModuleExtension() {
        if (moduleExtension == null) {
            moduleExtension = new ArrayList<ArrayType>();
        }
        return this.moduleExtension;
    }

}
