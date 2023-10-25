
package com.system.ipcc.pbx.avaya.smsxml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StationStatusType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StationStatusType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Administered_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Connected_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Extension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Port" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Service_State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Call_Parked" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TCP_Signal_Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Parameter_Download" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SAC_Activated" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ring_Cut_Off_Act" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Active_Coverage_Option" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Service_Link_Port" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Service_Link_Ext" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Audio_Service" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MM_Conference_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MM_Endpoint_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Message_Waiting" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Mobility_State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Access_Rights" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Key_Allocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Connected_Ports" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Multimedia_Service_Link_Mode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EC500_Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Off_PBX_Service_State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Limit_Incoming_Calls" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Multimedia_Mode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="User_Cntrl_Restr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Group_Cntrl_Restr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Awaken_At" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="User_DND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Group_DND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Room_Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Part_ID_Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Serial_Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FW_Version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Station_Lock_Active" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TOD_Station_Lock" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CF_Destination_Ext" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Internal_Unconditional" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Internal_Busy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Internal_No_Reply" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="External_Unconditional" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="External_Busy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="External_No_Reply" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Switch_End_IP_Signaling_Loc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IP_Signaling_Switch_End_IP_Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IP_Signaling_Switch_End_Port" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IP_Signaling_Set_End_IP_Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IP_Signaling_Set_End_Port" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Audio_Channel_Codec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Audio_Channel_Other_End_IP_Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Audio_Channel_Other_End_Port" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Audio_Channel_Set_End_IP_Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Audio_Channel_Set_End_Port" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Audio_Channel_Other_End_Network_Region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Audio_Channel_Set_End_Network_Region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Audio_Channel_Audio_Connection_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Mac_Address_3_x" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Mac_Address_4_x" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IP_Endpoint_Data_Port" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Product_ID_Release" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="H245_Tunneled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Registration_Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Authentication_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Dependency_Mode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Native_NAT_Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ALG_NAT_WAN_Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shd_Port" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shd_TCP_Signal_Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shd_Product_ID_Release" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shd_Product_Version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shd_H245_Tunneled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shd_Registration_Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shd_MAC_Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shd_Authentication_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shd_Dependency_Mode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shd_Native_NAT_Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shd_ALG_NAT_WAN_Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shd2_Port" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shd2_TCP_Signal_Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shd2_Product_ID_Release" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shd2_Product_Version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shd2_H245_Tunneled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shd2_Registration_Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shd2_MAC_Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shd2_Authentication_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shd2_Dependency_Mode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shd2_Native_NAT_Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shd2_ALG_NAT_WAN_Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="On_ACD_Call" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Occupancy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;group ref="{http://xml.avaya.com/sms}StationStatusArrayGroup"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StationStatusType", propOrder = {
    "administeredType",
    "connectedType",
    "extension",
    "port",
    "serviceState",
    "callParked",
    "tcpSignalStatus",
    "parameterDownload",
    "sacActivated",
    "ringCutOffAct",
    "activeCoverageOption",
    "serviceLinkPort",
    "serviceLinkExt",
    "audioService",
    "mmConferenceID",
    "mmEndpointID",
    "messageWaiting",
    "mobilityState",
    "accessRights",
    "keyAllocation",
    "connectedPorts",
    "multimediaServiceLinkMode",
    "ec500Status",
    "offPBXServiceState",
    "limitIncomingCalls",
    "multimediaMode",
    "userCntrlRestr",
    "groupCntrlRestr",
    "awakenAt",
    "userDND",
    "groupDND",
    "roomStatus",
    "partIDNumber",
    "serialNumber",
    "fwVersion",
    "stationLockActive",
    "todStationLock",
    "cfDestinationExt",
    "internalUnconditional",
    "internalBusy",
    "internalNoReply",
    "externalUnconditional",
    "externalBusy",
    "externalNoReply",
    "switchEndIPSignalingLoc",
    "ipSignalingSwitchEndIPAddress",
    "ipSignalingSwitchEndPort",
    "ipSignalingSetEndIPAddress",
    "ipSignalingSetEndPort",
    "audioChannelCodec",
    "audioChannelOtherEndIPAddress",
    "audioChannelOtherEndPort",
    "audioChannelSetEndIPAddress",
    "audioChannelSetEndPort",
    "audioChannelOtherEndNetworkRegion",
    "audioChannelSetEndNetworkRegion",
    "audioChannelAudioConnectionType",
    "macAddress3X",
    "macAddress4X",
    "ipEndpointDataPort",
    "productIDRelease",
    "h245Tunneled",
    "registrationStatus",
    "authenticationType",
    "dependencyMode",
    "nativeNATAddress",
    "algnatwanAddress",
    "shdPort",
    "shdTCPSignalStatus",
    "shdProductIDRelease",
    "shdProductVersion",
    "shdH245Tunneled",
    "shdRegistrationStatus",
    "shdMACAddress",
    "shdAuthenticationType",
    "shdDependencyMode",
    "shdNativeNATAddress",
    "shdALGNATWANAddress",
    "shd2Port",
    "shd2TCPSignalStatus",
    "shd2ProductIDRelease",
    "shd2ProductVersion",
    "shd2H245Tunneled",
    "shd2RegistrationStatus",
    "shd2MACAddress",
    "shd2AuthenticationType",
    "shd2DependencyMode",
    "shd2NativeNATAddress",
    "shd2ALGNATWANAddress",
    "onACDCall",
    "occupancy",
    "srcPort",
    "dstPort",
    "tpd1",
    "tpd2",
    "tpd3",
    "tpd4",
    "tpd5",
    "tpd6",
    "tpd7",
    "tpd8",
    "tpd9",
    "tpd10",
    "tpd11",
    "tpd12",
    "tpd13",
    "tpd14",
    "tpd15",
    "tpd16",
    "tpd17",
    "tpd18",
    "tpd19",
    "tpd20",
    "tpd21",
    "tpd22",
    "tpd23",
    "tpd24",
    "tpd25",
    "tpd26",
    "tpd27",
    "tpd28",
    "tpd29",
    "tpd30",
    "tpd31",
    "tpd32",
    "acdGrp",
    "acdMod"
})
public class StationStatusType {

    @XmlElement(name = "Administered_Type")
    protected String administeredType;
    @XmlElement(name = "Connected_Type")
    protected String connectedType;
    @XmlElement(name = "Extension")
    protected String extension;
    @XmlElement(name = "Port")
    protected String port;
    @XmlElement(name = "Service_State")
    protected String serviceState;
    @XmlElement(name = "Call_Parked")
    protected String callParked;
    @XmlElement(name = "TCP_Signal_Status")
    protected String tcpSignalStatus;
    @XmlElement(name = "Parameter_Download")
    protected String parameterDownload;
    @XmlElement(name = "SAC_Activated")
    protected String sacActivated;
    @XmlElement(name = "Ring_Cut_Off_Act")
    protected String ringCutOffAct;
    @XmlElement(name = "Active_Coverage_Option")
    protected String activeCoverageOption;
    @XmlElement(name = "Service_Link_Port")
    protected String serviceLinkPort;
    @XmlElement(name = "Service_Link_Ext")
    protected String serviceLinkExt;
    @XmlElement(name = "Audio_Service")
    protected String audioService;
    @XmlElement(name = "MM_Conference_ID")
    protected String mmConferenceID;
    @XmlElement(name = "MM_Endpoint_ID")
    protected String mmEndpointID;
    @XmlElement(name = "Message_Waiting")
    protected String messageWaiting;
    @XmlElement(name = "Mobility_State")
    protected String mobilityState;
    @XmlElement(name = "Access_Rights")
    protected String accessRights;
    @XmlElement(name = "Key_Allocation")
    protected String keyAllocation;
    @XmlElement(name = "Connected_Ports")
    protected String connectedPorts;
    @XmlElement(name = "Multimedia_Service_Link_Mode")
    protected String multimediaServiceLinkMode;
    @XmlElement(name = "EC500_Status")
    protected String ec500Status;
    @XmlElement(name = "Off_PBX_Service_State")
    protected String offPBXServiceState;
    @XmlElement(name = "Limit_Incoming_Calls")
    protected String limitIncomingCalls;
    @XmlElement(name = "Multimedia_Mode")
    protected String multimediaMode;
    @XmlElement(name = "User_Cntrl_Restr")
    protected String userCntrlRestr;
    @XmlElement(name = "Group_Cntrl_Restr")
    protected String groupCntrlRestr;
    @XmlElement(name = "Awaken_At")
    protected String awakenAt;
    @XmlElement(name = "User_DND")
    protected String userDND;
    @XmlElement(name = "Group_DND")
    protected String groupDND;
    @XmlElement(name = "Room_Status")
    protected String roomStatus;
    @XmlElement(name = "Part_ID_Number")
    protected String partIDNumber;
    @XmlElement(name = "Serial_Number")
    protected String serialNumber;
    @XmlElement(name = "FW_Version")
    protected String fwVersion;
    @XmlElement(name = "Station_Lock_Active")
    protected String stationLockActive;
    @XmlElement(name = "TOD_Station_Lock")
    protected String todStationLock;
    @XmlElement(name = "CF_Destination_Ext")
    protected String cfDestinationExt;
    @XmlElement(name = "Internal_Unconditional")
    protected String internalUnconditional;
    @XmlElement(name = "Internal_Busy")
    protected String internalBusy;
    @XmlElement(name = "Internal_No_Reply")
    protected String internalNoReply;
    @XmlElement(name = "External_Unconditional")
    protected String externalUnconditional;
    @XmlElement(name = "External_Busy")
    protected String externalBusy;
    @XmlElement(name = "External_No_Reply")
    protected String externalNoReply;
    @XmlElement(name = "Switch_End_IP_Signaling_Loc")
    protected String switchEndIPSignalingLoc;
    @XmlElement(name = "IP_Signaling_Switch_End_IP_Address")
    protected String ipSignalingSwitchEndIPAddress;
    @XmlElement(name = "IP_Signaling_Switch_End_Port")
    protected String ipSignalingSwitchEndPort;
    @XmlElement(name = "IP_Signaling_Set_End_IP_Address")
    protected String ipSignalingSetEndIPAddress;
    @XmlElement(name = "IP_Signaling_Set_End_Port")
    protected String ipSignalingSetEndPort;
    @XmlElement(name = "Audio_Channel_Codec")
    protected String audioChannelCodec;
    @XmlElement(name = "Audio_Channel_Other_End_IP_Address")
    protected String audioChannelOtherEndIPAddress;
    @XmlElement(name = "Audio_Channel_Other_End_Port")
    protected String audioChannelOtherEndPort;
    @XmlElement(name = "Audio_Channel_Set_End_IP_Address")
    protected String audioChannelSetEndIPAddress;
    @XmlElement(name = "Audio_Channel_Set_End_Port")
    protected String audioChannelSetEndPort;
    @XmlElement(name = "Audio_Channel_Other_End_Network_Region")
    protected String audioChannelOtherEndNetworkRegion;
    @XmlElement(name = "Audio_Channel_Set_End_Network_Region")
    protected String audioChannelSetEndNetworkRegion;
    @XmlElement(name = "Audio_Channel_Audio_Connection_Type")
    protected String audioChannelAudioConnectionType;
    @XmlElement(name = "Mac_Address_3_x")
    protected String macAddress3X;
    @XmlElement(name = "Mac_Address_4_x")
    protected String macAddress4X;
    @XmlElement(name = "IP_Endpoint_Data_Port")
    protected String ipEndpointDataPort;
    @XmlElement(name = "Product_ID_Release")
    protected String productIDRelease;
    @XmlElement(name = "H245_Tunneled")
    protected String h245Tunneled;
    @XmlElement(name = "Registration_Status")
    protected String registrationStatus;
    @XmlElement(name = "Authentication_Type")
    protected String authenticationType;
    @XmlElement(name = "Dependency_Mode")
    protected String dependencyMode;
    @XmlElement(name = "Native_NAT_Address")
    protected String nativeNATAddress;
    @XmlElement(name = "ALG_NAT_WAN_Address")
    protected String algnatwanAddress;
    @XmlElement(name = "Shd_Port")
    protected String shdPort;
    @XmlElement(name = "Shd_TCP_Signal_Status")
    protected String shdTCPSignalStatus;
    @XmlElement(name = "Shd_Product_ID_Release")
    protected String shdProductIDRelease;
    @XmlElement(name = "Shd_Product_Version")
    protected String shdProductVersion;
    @XmlElement(name = "Shd_H245_Tunneled")
    protected String shdH245Tunneled;
    @XmlElement(name = "Shd_Registration_Status")
    protected String shdRegistrationStatus;
    @XmlElement(name = "Shd_MAC_Address")
    protected String shdMACAddress;
    @XmlElement(name = "Shd_Authentication_Type")
    protected String shdAuthenticationType;
    @XmlElement(name = "Shd_Dependency_Mode")
    protected String shdDependencyMode;
    @XmlElement(name = "Shd_Native_NAT_Address")
    protected String shdNativeNATAddress;
    @XmlElement(name = "Shd_ALG_NAT_WAN_Address")
    protected String shdALGNATWANAddress;
    @XmlElement(name = "Shd2_Port")
    protected String shd2Port;
    @XmlElement(name = "Shd2_TCP_Signal_Status")
    protected String shd2TCPSignalStatus;
    @XmlElement(name = "Shd2_Product_ID_Release")
    protected String shd2ProductIDRelease;
    @XmlElement(name = "Shd2_Product_Version")
    protected String shd2ProductVersion;
    @XmlElement(name = "Shd2_H245_Tunneled")
    protected String shd2H245Tunneled;
    @XmlElement(name = "Shd2_Registration_Status")
    protected String shd2RegistrationStatus;
    @XmlElement(name = "Shd2_MAC_Address")
    protected String shd2MACAddress;
    @XmlElement(name = "Shd2_Authentication_Type")
    protected String shd2AuthenticationType;
    @XmlElement(name = "Shd2_Dependency_Mode")
    protected String shd2DependencyMode;
    @XmlElement(name = "Shd2_Native_NAT_Address")
    protected String shd2NativeNATAddress;
    @XmlElement(name = "Shd2_ALG_NAT_WAN_Address")
    protected String shd2ALGNATWANAddress;
    @XmlElement(name = "On_ACD_Call")
    protected String onACDCall;
    @XmlElement(name = "Occupancy")
    protected String occupancy;
    @XmlElement(name = "Src_Port")
    protected List<ArrayType> srcPort;
    @XmlElement(name = "Dst_Port")
    protected List<ArrayType> dstPort;
    @XmlElement(name = "TPD_1")
    protected List<ArrayType> tpd1;
    @XmlElement(name = "TPD_2")
    protected List<ArrayType> tpd2;
    @XmlElement(name = "TPD_3")
    protected List<ArrayType> tpd3;
    @XmlElement(name = "TPD_4")
    protected List<ArrayType> tpd4;
    @XmlElement(name = "TPD_5")
    protected List<ArrayType> tpd5;
    @XmlElement(name = "TPD_6")
    protected List<ArrayType> tpd6;
    @XmlElement(name = "TPD_7")
    protected List<ArrayType> tpd7;
    @XmlElement(name = "TPD_8")
    protected List<ArrayType> tpd8;
    @XmlElement(name = "TPD_9")
    protected List<ArrayType> tpd9;
    @XmlElement(name = "TPD_10")
    protected List<ArrayType> tpd10;
    @XmlElement(name = "TPD_11")
    protected List<ArrayType> tpd11;
    @XmlElement(name = "TPD_12")
    protected List<ArrayType> tpd12;
    @XmlElement(name = "TPD_13")
    protected List<ArrayType> tpd13;
    @XmlElement(name = "TPD_14")
    protected List<ArrayType> tpd14;
    @XmlElement(name = "TPD_15")
    protected List<ArrayType> tpd15;
    @XmlElement(name = "TPD_16")
    protected List<ArrayType> tpd16;
    @XmlElement(name = "TPD_17")
    protected List<ArrayType> tpd17;
    @XmlElement(name = "TPD_18")
    protected List<ArrayType> tpd18;
    @XmlElement(name = "TPD_19")
    protected List<ArrayType> tpd19;
    @XmlElement(name = "TPD_20")
    protected List<ArrayType> tpd20;
    @XmlElement(name = "TPD_21")
    protected List<ArrayType> tpd21;
    @XmlElement(name = "TPD_22")
    protected List<ArrayType> tpd22;
    @XmlElement(name = "TPD_23")
    protected List<ArrayType> tpd23;
    @XmlElement(name = "TPD_24")
    protected List<ArrayType> tpd24;
    @XmlElement(name = "TPD_25")
    protected List<ArrayType> tpd25;
    @XmlElement(name = "TPD_26")
    protected List<ArrayType> tpd26;
    @XmlElement(name = "TPD_27")
    protected List<ArrayType> tpd27;
    @XmlElement(name = "TPD_28")
    protected List<ArrayType> tpd28;
    @XmlElement(name = "TPD_29")
    protected List<ArrayType> tpd29;
    @XmlElement(name = "TPD_30")
    protected List<ArrayType> tpd30;
    @XmlElement(name = "TPD_31")
    protected List<ArrayType> tpd31;
    @XmlElement(name = "TPD_32")
    protected List<ArrayType> tpd32;
    @XmlElement(name = "ACD_Grp")
    protected List<ArrayType> acdGrp;
    @XmlElement(name = "ACD_Mod")
    protected List<ArrayType> acdMod;

    /**
     * Gets the value of the administeredType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdministeredType() {
        return administeredType;
    }

    /**
     * Sets the value of the administeredType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdministeredType(String value) {
        this.administeredType = value;
    }

    /**
     * Gets the value of the connectedType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectedType() {
        return connectedType;
    }

    /**
     * Sets the value of the connectedType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectedType(String value) {
        this.connectedType = value;
    }

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
     * Gets the value of the serviceState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceState() {
        return serviceState;
    }

    /**
     * Sets the value of the serviceState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceState(String value) {
        this.serviceState = value;
    }

    /**
     * Gets the value of the callParked property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallParked() {
        return callParked;
    }

    /**
     * Sets the value of the callParked property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallParked(String value) {
        this.callParked = value;
    }

    /**
     * Gets the value of the tcpSignalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTCPSignalStatus() {
        return tcpSignalStatus;
    }

    /**
     * Sets the value of the tcpSignalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTCPSignalStatus(String value) {
        this.tcpSignalStatus = value;
    }

    /**
     * Gets the value of the parameterDownload property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParameterDownload() {
        return parameterDownload;
    }

    /**
     * Sets the value of the parameterDownload property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParameterDownload(String value) {
        this.parameterDownload = value;
    }

    /**
     * Gets the value of the sacActivated property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSACActivated() {
        return sacActivated;
    }

    /**
     * Sets the value of the sacActivated property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSACActivated(String value) {
        this.sacActivated = value;
    }

    /**
     * Gets the value of the ringCutOffAct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRingCutOffAct() {
        return ringCutOffAct;
    }

    /**
     * Sets the value of the ringCutOffAct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRingCutOffAct(String value) {
        this.ringCutOffAct = value;
    }

    /**
     * Gets the value of the activeCoverageOption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActiveCoverageOption() {
        return activeCoverageOption;
    }

    /**
     * Sets the value of the activeCoverageOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActiveCoverageOption(String value) {
        this.activeCoverageOption = value;
    }

    /**
     * Gets the value of the serviceLinkPort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceLinkPort() {
        return serviceLinkPort;
    }

    /**
     * Sets the value of the serviceLinkPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceLinkPort(String value) {
        this.serviceLinkPort = value;
    }

    /**
     * Gets the value of the serviceLinkExt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceLinkExt() {
        return serviceLinkExt;
    }

    /**
     * Sets the value of the serviceLinkExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceLinkExt(String value) {
        this.serviceLinkExt = value;
    }

    /**
     * Gets the value of the audioService property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAudioService() {
        return audioService;
    }

    /**
     * Sets the value of the audioService property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAudioService(String value) {
        this.audioService = value;
    }

    /**
     * Gets the value of the mmConferenceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMMConferenceID() {
        return mmConferenceID;
    }

    /**
     * Sets the value of the mmConferenceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMMConferenceID(String value) {
        this.mmConferenceID = value;
    }

    /**
     * Gets the value of the mmEndpointID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMMEndpointID() {
        return mmEndpointID;
    }

    /**
     * Sets the value of the mmEndpointID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMMEndpointID(String value) {
        this.mmEndpointID = value;
    }

    /**
     * Gets the value of the messageWaiting property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageWaiting() {
        return messageWaiting;
    }

    /**
     * Sets the value of the messageWaiting property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageWaiting(String value) {
        this.messageWaiting = value;
    }

    /**
     * Gets the value of the mobilityState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobilityState() {
        return mobilityState;
    }

    /**
     * Sets the value of the mobilityState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobilityState(String value) {
        this.mobilityState = value;
    }

    /**
     * Gets the value of the accessRights property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessRights() {
        return accessRights;
    }

    /**
     * Sets the value of the accessRights property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessRights(String value) {
        this.accessRights = value;
    }

    /**
     * Gets the value of the keyAllocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyAllocation() {
        return keyAllocation;
    }

    /**
     * Sets the value of the keyAllocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyAllocation(String value) {
        this.keyAllocation = value;
    }

    /**
     * Gets the value of the connectedPorts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectedPorts() {
        return connectedPorts;
    }

    /**
     * Sets the value of the connectedPorts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectedPorts(String value) {
        this.connectedPorts = value;
    }

    /**
     * Gets the value of the multimediaServiceLinkMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMultimediaServiceLinkMode() {
        return multimediaServiceLinkMode;
    }

    /**
     * Sets the value of the multimediaServiceLinkMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMultimediaServiceLinkMode(String value) {
        this.multimediaServiceLinkMode = value;
    }

    /**
     * Gets the value of the ec500Status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEC500Status() {
        return ec500Status;
    }

    /**
     * Sets the value of the ec500Status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEC500Status(String value) {
        this.ec500Status = value;
    }

    /**
     * Gets the value of the offPBXServiceState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffPBXServiceState() {
        return offPBXServiceState;
    }

    /**
     * Sets the value of the offPBXServiceState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffPBXServiceState(String value) {
        this.offPBXServiceState = value;
    }

    /**
     * Gets the value of the limitIncomingCalls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLimitIncomingCalls() {
        return limitIncomingCalls;
    }

    /**
     * Sets the value of the limitIncomingCalls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLimitIncomingCalls(String value) {
        this.limitIncomingCalls = value;
    }

    /**
     * Gets the value of the multimediaMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMultimediaMode() {
        return multimediaMode;
    }

    /**
     * Sets the value of the multimediaMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMultimediaMode(String value) {
        this.multimediaMode = value;
    }

    /**
     * Gets the value of the userCntrlRestr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserCntrlRestr() {
        return userCntrlRestr;
    }

    /**
     * Sets the value of the userCntrlRestr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserCntrlRestr(String value) {
        this.userCntrlRestr = value;
    }

    /**
     * Gets the value of the groupCntrlRestr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupCntrlRestr() {
        return groupCntrlRestr;
    }

    /**
     * Sets the value of the groupCntrlRestr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupCntrlRestr(String value) {
        this.groupCntrlRestr = value;
    }

    /**
     * Gets the value of the awakenAt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAwakenAt() {
        return awakenAt;
    }

    /**
     * Sets the value of the awakenAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAwakenAt(String value) {
        this.awakenAt = value;
    }

    /**
     * Gets the value of the userDND property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserDND() {
        return userDND;
    }

    /**
     * Sets the value of the userDND property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserDND(String value) {
        this.userDND = value;
    }

    /**
     * Gets the value of the groupDND property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupDND() {
        return groupDND;
    }

    /**
     * Sets the value of the groupDND property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupDND(String value) {
        this.groupDND = value;
    }

    /**
     * Gets the value of the roomStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomStatus() {
        return roomStatus;
    }

    /**
     * Sets the value of the roomStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomStatus(String value) {
        this.roomStatus = value;
    }

    /**
     * Gets the value of the partIDNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartIDNumber() {
        return partIDNumber;
    }

    /**
     * Sets the value of the partIDNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartIDNumber(String value) {
        this.partIDNumber = value;
    }

    /**
     * Gets the value of the serialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets the value of the serialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNumber(String value) {
        this.serialNumber = value;
    }

    /**
     * Gets the value of the fwVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFWVersion() {
        return fwVersion;
    }

    /**
     * Sets the value of the fwVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFWVersion(String value) {
        this.fwVersion = value;
    }

    /**
     * Gets the value of the stationLockActive property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStationLockActive() {
        return stationLockActive;
    }

    /**
     * Sets the value of the stationLockActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStationLockActive(String value) {
        this.stationLockActive = value;
    }

    /**
     * Gets the value of the todStationLock property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTODStationLock() {
        return todStationLock;
    }

    /**
     * Sets the value of the todStationLock property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTODStationLock(String value) {
        this.todStationLock = value;
    }

    /**
     * Gets the value of the cfDestinationExt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCFDestinationExt() {
        return cfDestinationExt;
    }

    /**
     * Sets the value of the cfDestinationExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCFDestinationExt(String value) {
        this.cfDestinationExt = value;
    }

    /**
     * Gets the value of the internalUnconditional property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternalUnconditional() {
        return internalUnconditional;
    }

    /**
     * Sets the value of the internalUnconditional property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternalUnconditional(String value) {
        this.internalUnconditional = value;
    }

    /**
     * Gets the value of the internalBusy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternalBusy() {
        return internalBusy;
    }

    /**
     * Sets the value of the internalBusy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternalBusy(String value) {
        this.internalBusy = value;
    }

    /**
     * Gets the value of the internalNoReply property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternalNoReply() {
        return internalNoReply;
    }

    /**
     * Sets the value of the internalNoReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternalNoReply(String value) {
        this.internalNoReply = value;
    }

    /**
     * Gets the value of the externalUnconditional property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalUnconditional() {
        return externalUnconditional;
    }

    /**
     * Sets the value of the externalUnconditional property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalUnconditional(String value) {
        this.externalUnconditional = value;
    }

    /**
     * Gets the value of the externalBusy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalBusy() {
        return externalBusy;
    }

    /**
     * Sets the value of the externalBusy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalBusy(String value) {
        this.externalBusy = value;
    }

    /**
     * Gets the value of the externalNoReply property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalNoReply() {
        return externalNoReply;
    }

    /**
     * Sets the value of the externalNoReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalNoReply(String value) {
        this.externalNoReply = value;
    }

    /**
     * Gets the value of the switchEndIPSignalingLoc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSwitchEndIPSignalingLoc() {
        return switchEndIPSignalingLoc;
    }

    /**
     * Sets the value of the switchEndIPSignalingLoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSwitchEndIPSignalingLoc(String value) {
        this.switchEndIPSignalingLoc = value;
    }

    /**
     * Gets the value of the ipSignalingSwitchEndIPAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPSignalingSwitchEndIPAddress() {
        return ipSignalingSwitchEndIPAddress;
    }

    /**
     * Sets the value of the ipSignalingSwitchEndIPAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPSignalingSwitchEndIPAddress(String value) {
        this.ipSignalingSwitchEndIPAddress = value;
    }

    /**
     * Gets the value of the ipSignalingSwitchEndPort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPSignalingSwitchEndPort() {
        return ipSignalingSwitchEndPort;
    }

    /**
     * Sets the value of the ipSignalingSwitchEndPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPSignalingSwitchEndPort(String value) {
        this.ipSignalingSwitchEndPort = value;
    }

    /**
     * Gets the value of the ipSignalingSetEndIPAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPSignalingSetEndIPAddress() {
        return ipSignalingSetEndIPAddress;
    }

    /**
     * Sets the value of the ipSignalingSetEndIPAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPSignalingSetEndIPAddress(String value) {
        this.ipSignalingSetEndIPAddress = value;
    }

    /**
     * Gets the value of the ipSignalingSetEndPort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPSignalingSetEndPort() {
        return ipSignalingSetEndPort;
    }

    /**
     * Sets the value of the ipSignalingSetEndPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPSignalingSetEndPort(String value) {
        this.ipSignalingSetEndPort = value;
    }

    /**
     * Gets the value of the audioChannelCodec property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAudioChannelCodec() {
        return audioChannelCodec;
    }

    /**
     * Sets the value of the audioChannelCodec property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAudioChannelCodec(String value) {
        this.audioChannelCodec = value;
    }

    /**
     * Gets the value of the audioChannelOtherEndIPAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAudioChannelOtherEndIPAddress() {
        return audioChannelOtherEndIPAddress;
    }

    /**
     * Sets the value of the audioChannelOtherEndIPAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAudioChannelOtherEndIPAddress(String value) {
        this.audioChannelOtherEndIPAddress = value;
    }

    /**
     * Gets the value of the audioChannelOtherEndPort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAudioChannelOtherEndPort() {
        return audioChannelOtherEndPort;
    }

    /**
     * Sets the value of the audioChannelOtherEndPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAudioChannelOtherEndPort(String value) {
        this.audioChannelOtherEndPort = value;
    }

    /**
     * Gets the value of the audioChannelSetEndIPAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAudioChannelSetEndIPAddress() {
        return audioChannelSetEndIPAddress;
    }

    /**
     * Sets the value of the audioChannelSetEndIPAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAudioChannelSetEndIPAddress(String value) {
        this.audioChannelSetEndIPAddress = value;
    }

    /**
     * Gets the value of the audioChannelSetEndPort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAudioChannelSetEndPort() {
        return audioChannelSetEndPort;
    }

    /**
     * Sets the value of the audioChannelSetEndPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAudioChannelSetEndPort(String value) {
        this.audioChannelSetEndPort = value;
    }

    /**
     * Gets the value of the audioChannelOtherEndNetworkRegion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAudioChannelOtherEndNetworkRegion() {
        return audioChannelOtherEndNetworkRegion;
    }

    /**
     * Sets the value of the audioChannelOtherEndNetworkRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAudioChannelOtherEndNetworkRegion(String value) {
        this.audioChannelOtherEndNetworkRegion = value;
    }

    /**
     * Gets the value of the audioChannelSetEndNetworkRegion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAudioChannelSetEndNetworkRegion() {
        return audioChannelSetEndNetworkRegion;
    }

    /**
     * Sets the value of the audioChannelSetEndNetworkRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAudioChannelSetEndNetworkRegion(String value) {
        this.audioChannelSetEndNetworkRegion = value;
    }

    /**
     * Gets the value of the audioChannelAudioConnectionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAudioChannelAudioConnectionType() {
        return audioChannelAudioConnectionType;
    }

    /**
     * Sets the value of the audioChannelAudioConnectionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAudioChannelAudioConnectionType(String value) {
        this.audioChannelAudioConnectionType = value;
    }

    /**
     * Gets the value of the macAddress3X property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMacAddress3X() {
        return macAddress3X;
    }

    /**
     * Sets the value of the macAddress3X property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMacAddress3X(String value) {
        this.macAddress3X = value;
    }

    /**
     * Gets the value of the macAddress4X property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMacAddress4X() {
        return macAddress4X;
    }

    /**
     * Sets the value of the macAddress4X property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMacAddress4X(String value) {
        this.macAddress4X = value;
    }

    /**
     * Gets the value of the ipEndpointDataPort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPEndpointDataPort() {
        return ipEndpointDataPort;
    }

    /**
     * Sets the value of the ipEndpointDataPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPEndpointDataPort(String value) {
        this.ipEndpointDataPort = value;
    }

    /**
     * Gets the value of the productIDRelease property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductIDRelease() {
        return productIDRelease;
    }

    /**
     * Sets the value of the productIDRelease property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductIDRelease(String value) {
        this.productIDRelease = value;
    }

    /**
     * Gets the value of the h245Tunneled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getH245Tunneled() {
        return h245Tunneled;
    }

    /**
     * Sets the value of the h245Tunneled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setH245Tunneled(String value) {
        this.h245Tunneled = value;
    }

    /**
     * Gets the value of the registrationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationStatus() {
        return registrationStatus;
    }

    /**
     * Sets the value of the registrationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationStatus(String value) {
        this.registrationStatus = value;
    }

    /**
     * Gets the value of the authenticationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthenticationType() {
        return authenticationType;
    }

    /**
     * Sets the value of the authenticationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthenticationType(String value) {
        this.authenticationType = value;
    }

    /**
     * Gets the value of the dependencyMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDependencyMode() {
        return dependencyMode;
    }

    /**
     * Sets the value of the dependencyMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDependencyMode(String value) {
        this.dependencyMode = value;
    }

    /**
     * Gets the value of the nativeNATAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNativeNATAddress() {
        return nativeNATAddress;
    }

    /**
     * Sets the value of the nativeNATAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNativeNATAddress(String value) {
        this.nativeNATAddress = value;
    }

    /**
     * Gets the value of the algnatwanAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getALGNATWANAddress() {
        return algnatwanAddress;
    }

    /**
     * Sets the value of the algnatwanAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setALGNATWANAddress(String value) {
        this.algnatwanAddress = value;
    }

    /**
     * Gets the value of the shdPort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShdPort() {
        return shdPort;
    }

    /**
     * Sets the value of the shdPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShdPort(String value) {
        this.shdPort = value;
    }

    /**
     * Gets the value of the shdTCPSignalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShdTCPSignalStatus() {
        return shdTCPSignalStatus;
    }

    /**
     * Sets the value of the shdTCPSignalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShdTCPSignalStatus(String value) {
        this.shdTCPSignalStatus = value;
    }

    /**
     * Gets the value of the shdProductIDRelease property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShdProductIDRelease() {
        return shdProductIDRelease;
    }

    /**
     * Sets the value of the shdProductIDRelease property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShdProductIDRelease(String value) {
        this.shdProductIDRelease = value;
    }

    /**
     * Gets the value of the shdProductVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShdProductVersion() {
        return shdProductVersion;
    }

    /**
     * Sets the value of the shdProductVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShdProductVersion(String value) {
        this.shdProductVersion = value;
    }

    /**
     * Gets the value of the shdH245Tunneled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShdH245Tunneled() {
        return shdH245Tunneled;
    }

    /**
     * Sets the value of the shdH245Tunneled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShdH245Tunneled(String value) {
        this.shdH245Tunneled = value;
    }

    /**
     * Gets the value of the shdRegistrationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShdRegistrationStatus() {
        return shdRegistrationStatus;
    }

    /**
     * Sets the value of the shdRegistrationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShdRegistrationStatus(String value) {
        this.shdRegistrationStatus = value;
    }

    /**
     * Gets the value of the shdMACAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShdMACAddress() {
        return shdMACAddress;
    }

    /**
     * Sets the value of the shdMACAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShdMACAddress(String value) {
        this.shdMACAddress = value;
    }

    /**
     * Gets the value of the shdAuthenticationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShdAuthenticationType() {
        return shdAuthenticationType;
    }

    /**
     * Sets the value of the shdAuthenticationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShdAuthenticationType(String value) {
        this.shdAuthenticationType = value;
    }

    /**
     * Gets the value of the shdDependencyMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShdDependencyMode() {
        return shdDependencyMode;
    }

    /**
     * Sets the value of the shdDependencyMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShdDependencyMode(String value) {
        this.shdDependencyMode = value;
    }

    /**
     * Gets the value of the shdNativeNATAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShdNativeNATAddress() {
        return shdNativeNATAddress;
    }

    /**
     * Sets the value of the shdNativeNATAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShdNativeNATAddress(String value) {
        this.shdNativeNATAddress = value;
    }

    /**
     * Gets the value of the shdALGNATWANAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShdALGNATWANAddress() {
        return shdALGNATWANAddress;
    }

    /**
     * Sets the value of the shdALGNATWANAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShdALGNATWANAddress(String value) {
        this.shdALGNATWANAddress = value;
    }

    /**
     * Gets the value of the shd2Port property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShd2Port() {
        return shd2Port;
    }

    /**
     * Sets the value of the shd2Port property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShd2Port(String value) {
        this.shd2Port = value;
    }

    /**
     * Gets the value of the shd2TCPSignalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShd2TCPSignalStatus() {
        return shd2TCPSignalStatus;
    }

    /**
     * Sets the value of the shd2TCPSignalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShd2TCPSignalStatus(String value) {
        this.shd2TCPSignalStatus = value;
    }

    /**
     * Gets the value of the shd2ProductIDRelease property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShd2ProductIDRelease() {
        return shd2ProductIDRelease;
    }

    /**
     * Sets the value of the shd2ProductIDRelease property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShd2ProductIDRelease(String value) {
        this.shd2ProductIDRelease = value;
    }

    /**
     * Gets the value of the shd2ProductVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShd2ProductVersion() {
        return shd2ProductVersion;
    }

    /**
     * Sets the value of the shd2ProductVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShd2ProductVersion(String value) {
        this.shd2ProductVersion = value;
    }

    /**
     * Gets the value of the shd2H245Tunneled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShd2H245Tunneled() {
        return shd2H245Tunneled;
    }

    /**
     * Sets the value of the shd2H245Tunneled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShd2H245Tunneled(String value) {
        this.shd2H245Tunneled = value;
    }

    /**
     * Gets the value of the shd2RegistrationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShd2RegistrationStatus() {
        return shd2RegistrationStatus;
    }

    /**
     * Sets the value of the shd2RegistrationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShd2RegistrationStatus(String value) {
        this.shd2RegistrationStatus = value;
    }

    /**
     * Gets the value of the shd2MACAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShd2MACAddress() {
        return shd2MACAddress;
    }

    /**
     * Sets the value of the shd2MACAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShd2MACAddress(String value) {
        this.shd2MACAddress = value;
    }

    /**
     * Gets the value of the shd2AuthenticationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShd2AuthenticationType() {
        return shd2AuthenticationType;
    }

    /**
     * Sets the value of the shd2AuthenticationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShd2AuthenticationType(String value) {
        this.shd2AuthenticationType = value;
    }

    /**
     * Gets the value of the shd2DependencyMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShd2DependencyMode() {
        return shd2DependencyMode;
    }

    /**
     * Sets the value of the shd2DependencyMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShd2DependencyMode(String value) {
        this.shd2DependencyMode = value;
    }

    /**
     * Gets the value of the shd2NativeNATAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShd2NativeNATAddress() {
        return shd2NativeNATAddress;
    }

    /**
     * Sets the value of the shd2NativeNATAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShd2NativeNATAddress(String value) {
        this.shd2NativeNATAddress = value;
    }

    /**
     * Gets the value of the shd2ALGNATWANAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShd2ALGNATWANAddress() {
        return shd2ALGNATWANAddress;
    }

    /**
     * Sets the value of the shd2ALGNATWANAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShd2ALGNATWANAddress(String value) {
        this.shd2ALGNATWANAddress = value;
    }

    /**
     * Gets the value of the onACDCall property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnACDCall() {
        return onACDCall;
    }

    /**
     * Sets the value of the onACDCall property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnACDCall(String value) {
        this.onACDCall = value;
    }

    /**
     * Gets the value of the occupancy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccupancy() {
        return occupancy;
    }

    /**
     * Sets the value of the occupancy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccupancy(String value) {
        this.occupancy = value;
    }

    /**
     * Gets the value of the srcPort property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the srcPort property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSrcPort().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getSrcPort() {
        if (srcPort == null) {
            srcPort = new ArrayList<ArrayType>();
        }
        return this.srcPort;
    }

    /**
     * Gets the value of the dstPort property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dstPort property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDstPort().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getDstPort() {
        if (dstPort == null) {
            dstPort = new ArrayList<ArrayType>();
        }
        return this.dstPort;
    }

    /**
     * Gets the value of the tpd1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tpd1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTPD1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getTPD1() {
        if (tpd1 == null) {
            tpd1 = new ArrayList<ArrayType>();
        }
        return this.tpd1;
    }

    /**
     * Gets the value of the tpd2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tpd2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTPD2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getTPD2() {
        if (tpd2 == null) {
            tpd2 = new ArrayList<ArrayType>();
        }
        return this.tpd2;
    }

    /**
     * Gets the value of the tpd3 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tpd3 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTPD3().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getTPD3() {
        if (tpd3 == null) {
            tpd3 = new ArrayList<ArrayType>();
        }
        return this.tpd3;
    }

    /**
     * Gets the value of the tpd4 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tpd4 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTPD4().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getTPD4() {
        if (tpd4 == null) {
            tpd4 = new ArrayList<ArrayType>();
        }
        return this.tpd4;
    }

    /**
     * Gets the value of the tpd5 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tpd5 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTPD5().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getTPD5() {
        if (tpd5 == null) {
            tpd5 = new ArrayList<ArrayType>();
        }
        return this.tpd5;
    }

    /**
     * Gets the value of the tpd6 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tpd6 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTPD6().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getTPD6() {
        if (tpd6 == null) {
            tpd6 = new ArrayList<ArrayType>();
        }
        return this.tpd6;
    }

    /**
     * Gets the value of the tpd7 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tpd7 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTPD7().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getTPD7() {
        if (tpd7 == null) {
            tpd7 = new ArrayList<ArrayType>();
        }
        return this.tpd7;
    }

    /**
     * Gets the value of the tpd8 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tpd8 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTPD8().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getTPD8() {
        if (tpd8 == null) {
            tpd8 = new ArrayList<ArrayType>();
        }
        return this.tpd8;
    }

    /**
     * Gets the value of the tpd9 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tpd9 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTPD9().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getTPD9() {
        if (tpd9 == null) {
            tpd9 = new ArrayList<ArrayType>();
        }
        return this.tpd9;
    }

    /**
     * Gets the value of the tpd10 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tpd10 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTPD10().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getTPD10() {
        if (tpd10 == null) {
            tpd10 = new ArrayList<ArrayType>();
        }
        return this.tpd10;
    }

    /**
     * Gets the value of the tpd11 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tpd11 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTPD11().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getTPD11() {
        if (tpd11 == null) {
            tpd11 = new ArrayList<ArrayType>();
        }
        return this.tpd11;
    }

    /**
     * Gets the value of the tpd12 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tpd12 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTPD12().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getTPD12() {
        if (tpd12 == null) {
            tpd12 = new ArrayList<ArrayType>();
        }
        return this.tpd12;
    }

    /**
     * Gets the value of the tpd13 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tpd13 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTPD13().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getTPD13() {
        if (tpd13 == null) {
            tpd13 = new ArrayList<ArrayType>();
        }
        return this.tpd13;
    }

    /**
     * Gets the value of the tpd14 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tpd14 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTPD14().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getTPD14() {
        if (tpd14 == null) {
            tpd14 = new ArrayList<ArrayType>();
        }
        return this.tpd14;
    }

    /**
     * Gets the value of the tpd15 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tpd15 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTPD15().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getTPD15() {
        if (tpd15 == null) {
            tpd15 = new ArrayList<ArrayType>();
        }
        return this.tpd15;
    }

    /**
     * Gets the value of the tpd16 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tpd16 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTPD16().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getTPD16() {
        if (tpd16 == null) {
            tpd16 = new ArrayList<ArrayType>();
        }
        return this.tpd16;
    }

    /**
     * Gets the value of the tpd17 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tpd17 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTPD17().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getTPD17() {
        if (tpd17 == null) {
            tpd17 = new ArrayList<ArrayType>();
        }
        return this.tpd17;
    }

    /**
     * Gets the value of the tpd18 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tpd18 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTPD18().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getTPD18() {
        if (tpd18 == null) {
            tpd18 = new ArrayList<ArrayType>();
        }
        return this.tpd18;
    }

    /**
     * Gets the value of the tpd19 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tpd19 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTPD19().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getTPD19() {
        if (tpd19 == null) {
            tpd19 = new ArrayList<ArrayType>();
        }
        return this.tpd19;
    }

    /**
     * Gets the value of the tpd20 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tpd20 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTPD20().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getTPD20() {
        if (tpd20 == null) {
            tpd20 = new ArrayList<ArrayType>();
        }
        return this.tpd20;
    }

    /**
     * Gets the value of the tpd21 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tpd21 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTPD21().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getTPD21() {
        if (tpd21 == null) {
            tpd21 = new ArrayList<ArrayType>();
        }
        return this.tpd21;
    }

    /**
     * Gets the value of the tpd22 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tpd22 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTPD22().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getTPD22() {
        if (tpd22 == null) {
            tpd22 = new ArrayList<ArrayType>();
        }
        return this.tpd22;
    }

    /**
     * Gets the value of the tpd23 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tpd23 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTPD23().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getTPD23() {
        if (tpd23 == null) {
            tpd23 = new ArrayList<ArrayType>();
        }
        return this.tpd23;
    }

    /**
     * Gets the value of the tpd24 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tpd24 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTPD24().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getTPD24() {
        if (tpd24 == null) {
            tpd24 = new ArrayList<ArrayType>();
        }
        return this.tpd24;
    }

    /**
     * Gets the value of the tpd25 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tpd25 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTPD25().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getTPD25() {
        if (tpd25 == null) {
            tpd25 = new ArrayList<ArrayType>();
        }
        return this.tpd25;
    }

    /**
     * Gets the value of the tpd26 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tpd26 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTPD26().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getTPD26() {
        if (tpd26 == null) {
            tpd26 = new ArrayList<ArrayType>();
        }
        return this.tpd26;
    }

    /**
     * Gets the value of the tpd27 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tpd27 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTPD27().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getTPD27() {
        if (tpd27 == null) {
            tpd27 = new ArrayList<ArrayType>();
        }
        return this.tpd27;
    }

    /**
     * Gets the value of the tpd28 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tpd28 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTPD28().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getTPD28() {
        if (tpd28 == null) {
            tpd28 = new ArrayList<ArrayType>();
        }
        return this.tpd28;
    }

    /**
     * Gets the value of the tpd29 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tpd29 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTPD29().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getTPD29() {
        if (tpd29 == null) {
            tpd29 = new ArrayList<ArrayType>();
        }
        return this.tpd29;
    }

    /**
     * Gets the value of the tpd30 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tpd30 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTPD30().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getTPD30() {
        if (tpd30 == null) {
            tpd30 = new ArrayList<ArrayType>();
        }
        return this.tpd30;
    }

    /**
     * Gets the value of the tpd31 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tpd31 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTPD31().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getTPD31() {
        if (tpd31 == null) {
            tpd31 = new ArrayList<ArrayType>();
        }
        return this.tpd31;
    }

    /**
     * Gets the value of the tpd32 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tpd32 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTPD32().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getTPD32() {
        if (tpd32 == null) {
            tpd32 = new ArrayList<ArrayType>();
        }
        return this.tpd32;
    }

    /**
     * Gets the value of the acdGrp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acdGrp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getACDGrp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getACDGrp() {
        if (acdGrp == null) {
            acdGrp = new ArrayList<ArrayType>();
        }
        return this.acdGrp;
    }

    /**
     * Gets the value of the acdMod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acdMod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getACDMod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getACDMod() {
        if (acdMod == null) {
            acdMod = new ArrayList<ArrayType>();
        }
        return this.acdMod;
    }

}
