
package com.system.ipcc.pbx.avaya.smsxml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SystemParametersCustomerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SystemParametersCustomerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="G3_Version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Platform" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RFA_Enterprise_System_ID_ESID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RFA_System_ID_SID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RFA_Module_ID_MID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Platform_Maximum_Ports" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Platform_Maximum_Ports_USED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Platform_Maximum_Ports_LOW" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Platform_Maximum_Ports_HIGH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_Stations" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_Stations_USED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_Stations_LOW" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_Stations_HIGH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_XMOBILE_Stations" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_XMOBILE_Stations_USED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_XMOBILE_Stations_LOW" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_XMOBILE_Stations_HIGH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_Off_PBX_Telephones_EC500" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_Off_PBX_Telephones_EC500_USED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_Off_PBX_Telephones_EC500_LOW" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_Off_PBX_Telephones_EC500_HIGH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_Off_PBX_Telephones_OPS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_Off_PBX_Telephones_OPS_USED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_Off_PBX_Telephones_OPS_LOW" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_Off_PBX_Telephones_OPS_HIGH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_Off_PBX_Telephones_SCCAN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_Off_PBX_Telephones_SCCAN_USED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_Off_PBX_Telephones_SCCAN_LOW" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_Off_PBX_Telephones_SCCAN_HIGH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_Administered_H_323_Trunks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_Administered_H_323_Trunks_USED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_Administered_H_323_Trunks_LOW" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_Administered_H_323_Trunks_HIGH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_Concurrently_Registered_IP_Stations" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_Concurrently_Registered_IP_Stations_USED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_Concurrently_Registered_IP_Stations_LOW" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_Concurrently_Registered_IP_Stations_HIGH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_Administered_Remote_Office_Trunks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_Administered_Remote_Office_Trunks_USED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_Administered_Remote_Office_Trunks_LOW" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_Administered_Remote_Office_Trunks_HIGH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_Concurrently_Registered_Remote_Office_Stations" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_Concurrently_Registered_Remote_Office_Stations_USED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_Concurrently_Registered_Remote_Office_Stations_LOW" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_Concurrently_Registered_Remote_Office_Stations_HIGH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_Concurrently_Registered_IP_ECons" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_Concurrently_Registered_IP_ECons_USED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_Concurrently_Registered_IP_ECons_LOW" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_Concurrently_Registered_IP_ECons_HIGH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Max_Concur_Registered_Unauthenticated_H_323_Stations" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Max_Concur_Registered_Unauthenticated_H_323_Stations_USED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Max_Concur_Registered_Unauthenticated_H_323_Stations_LOW" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Max_Concur_Registered_Unauthenticated_H_323_Stations_HIGH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_Video_Capable_H_323_Stations" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_Video_Capable_H_323_Stations_USED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_Video_Capable_H_323_Stations_LOW" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_Video_Capable_H_323_Stations_HIGH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_Video_Capable_IP_Softphones" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_Video_Capable_IP_Softphones_USED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_Video_Capable_IP_Softphones_LOW" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_Video_Capable_IP_Softphones_HIGH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_Administered_SIP_Trunks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_Administered_SIP_Trunks_USED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_Administered_SIP_Trunks_LOW" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_Administered_SIP_Trunks_HIGH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_Number_Of_DS1_Boards_With_Echo_Cancellation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_Number_Of_DS1_Boards_With_Echo_Cancellation_USED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_Number_Of_DS1_Boards_With_Echo_Cancellation_LOW" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_Number_Of_DS1_Boards_With_Echo_Cancellation_HIGH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_TN2501_VAL_Boards" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_TN2501_VAL_Boards_USED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_TN2501_VAL_Boards_LOW" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_TN2501_VAL_Boards_HIGH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_G250_G350_G700_VAL_Sources" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_G250_G350_G700_VAL_Sources_USED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_G250_G350_G700_VAL_Sources_LOW" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_G250_G350_G700_VAL_Sources_HIGH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_TN2602_Boards_With_80_VoIP_Channels" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_TN2602_Boards_With_80_VoIP_Channels_USED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_TN2602_Boards_With_80_VoIP_Channels_LOW" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_TN2602_Boards_With_80_VoIP_Channels_HIGH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_TN2602_Boards_With_320_VoIP_Channels" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_TN2602_Boards_With_320_VoIP_Channels_USED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_TN2602_Boards_With_320_VoIP_Channels_LOW" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_TN2602_Boards_With_320_VoIP_Channels_HIGH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_Number_Of_Expanded_Meet_me_Conference_Ports" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_Number_Of_Expanded_Meet_me_Conference_Ports_USED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_Number_Of_Expanded_Meet_me_Conference_Ports_LOW" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_Number_Of_Expanded_Meet_me_Conference_Ports_HIGH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Abbreviated_Dialing_Enhanced_List" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Access_Security_Gateway_ASG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Analog_Trunk_Incoming_Call_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="A_D_Grp_Sys_List_Dialing_Start_At_01" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Answer_Supervision_by_Call_Classifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ARS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ARS_AAR_Partitioning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ARS_AAR_Dialing_Without_FAC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ASAI_Interface" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ASAI_Link_Core_Capabilities" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ASAI_Proprietary_Adjunct_Links" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ASAI_Link_Plus_Capabilities" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Async_Transfer_Mode_ATM_PNC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Async_Transfer_Mode_ATM_Trunking" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ATM_WAN_Spare_Processor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ATMS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Attendant_Vectoring" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Audible_Message_Waiting" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Authorization_Codes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Backup_Cluster_Automatic_Takeover" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CAS_Branch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CAS_Main" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Change_COR_by_FAC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Computer_Telephony_Adjunct_Links" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Cvg_Of_Calls_Redirected_Off_Net" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DCS_Basic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DCS_Call_Coverage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DCS_With_Rerouting" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DCS_Global" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Digital_Loss_Plan_Modification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DS1_MSP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DS1_Echo_Cancellation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Emergency_Access_to_Attendant" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Enable_dadmin_Login" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Enhanced_Conferencing" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Enhanced_EC500" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Enterprise_Survivable_Server" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Enterprise_Wide_Licensing" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ESS_Administration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Extended_Cvg_Fwd_Admin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="External_Device_Alarm_Admin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Five_Port_Networks_Max_Per_MCC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Flexible_Billing" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Forced_Entry_of_Account_Codes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Global_Call_Classification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Hospitality_Basic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Hospitality_G3V3_Enhancements" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Hospitality_Parameter_Reduction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IP_Trunks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IP_Attendant_Consoles" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IP_Stations" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Internet_Protocol_IP_PNC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ISDN_Feature_Plus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ISDN_Network_Call_Redirection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ISDN_BRI_Trunks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ISDN_PRI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Local_Survivable_Processor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Malicious_Call_Trace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Media_Encryption_Over_IP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Mode_Code_For_Centralized_Voice_Mail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Mode_Code_Interface" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Multifrequency_Signaling" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Multimedia_Appl_Server_Interface_MASI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Multimedia_Call_Handling_Basic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Multimedia_Call_Handling_Enhanced" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Multimedia_IP_SIP_Trunking" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Multinational_Locations" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Multiple_Level_Precedence_And_Preemption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Multiple_Locations" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Personal_Station_Access" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="No_License_Mode_Disabled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Posted_Messages" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PNC_Duplication" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Port_Network_Support" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Premier_Business_Package" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Processor_And_System_MSP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Private_Networking" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Processor_Ethernet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="R9_5_Capabilities" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Remote_Office" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Restrict_Call_Forward_Off_Net" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Secondary_Data_Module" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Station_And_Trunk_MSP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Station_As_Virtual_Extension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="System_Management_Data_Transfer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Tenant_Partitioning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Terminal_Trans_Init_TTI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Time_Of_Day_Routing" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Uniform_Dialing_Plan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Usage_Allocation_Enhancements" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TN2501_VAL_Maximum_Capacity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Voice_Mail_Application_Support" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Wideband_Switching" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Wireless" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Call_Center_Release" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BCMS_Basic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BCMS_VuStats_Service_Level" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BSR_Local_Treatment_For_IP_and_ISDN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Business_Advocate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Call_Work_Codes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DTMF_Feedback_Signals_For_VRU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Dynamic_Advocate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Expert_Agent_Selection_EAS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EAS_PHD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Forced_ACD_Calls" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Least_Occupied_Agent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Lookahead_Interflow_LAI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Multiple_Call_Handling_On_Request" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Multiple_Call_Handling_Forced" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PASTE_Display_PBX_Data_On_Phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Reason_Codes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Service_Level_Maximizer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Service_Observing_Basic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Service_Observing_Remote_By_FAC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Service_Observing_VDNs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Timed_ACW" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Vectoring_Basic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Vectoring_Prompting" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Vectoring_G3V4_Enhanced" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Vectoring_3_0_Enhanced" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Vectoring_ANI_II_Digits_Routing" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Vectoring_G3V4_Advanced_Routing" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Vectoring_CINFO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Vectoring_Best_Service_Routing" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Vectoring_Holidays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Vectoring_Variables" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VDN_Of_Origin_Announcement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VDN_Return_Destination" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VuStats" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VuStats_G3V4_Enhanced" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Logged_In_ACD_Agents" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Logged_In_ACD_Agents_USED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Logged_In_ACD_Agents_LOW" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Logged_In_ACD_Agents_HIGH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Logged_In_Advocate_Agents" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Logged_In_Advocate_Agents_USED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Logged_In_Advocate_Agents_LOW" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Logged_In_Advocate_Agents_HIGH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Logged_In_IP_Softphone_Agents" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Logged_In_IP_Softphone_Agents_USED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Logged_In_IP_Softphone_Agents_LOW" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Logged_In_IP_Softphone_Agents_HIGH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Basic_Call_Setup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Basic_Supplementary_Services" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Centralized_Attendant" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Interworking_With_DCS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Supplementary_Services_with_Rerouting" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Transfer_into_QSIG_Voice_Mail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Value_Added_VALU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Adjunct_Call_Control" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Adjunct_Routing" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Domain_Control" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Event_Notification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Request_Feature" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Set_Value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Answering_Machine_Detection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Selective_Listening" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Switch_Classified_Outbound_Calls" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Proprietary_Applications" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CTI_Stations" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Increased_Adjunct_Route_Capacity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Phantom_Calls" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Agent_States" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;group ref="{http://xml.avaya.com/sms}SystemParametersCustomerArrayGroup"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SystemParametersCustomerType", propOrder = {
    "g3Version",
    "location",
    "platform",
    "rfaEnterpriseSystemIDESID",
    "rfaSystemIDSID",
    "rfaModuleIDMID",
    "platformMaximumPorts",
    "platformMaximumPortsUSED",
    "platformMaximumPortsLOW",
    "platformMaximumPortsHIGH",
    "maximumStations",
    "maximumStationsUSED",
    "maximumStationsLOW",
    "maximumStationsHIGH",
    "maximumXMOBILEStations",
    "maximumXMOBILEStationsUSED",
    "maximumXMOBILEStationsLOW",
    "maximumXMOBILEStationsHIGH",
    "maximumOffPBXTelephonesEC500",
    "maximumOffPBXTelephonesEC500USED",
    "maximumOffPBXTelephonesEC500LOW",
    "maximumOffPBXTelephonesEC500HIGH",
    "maximumOffPBXTelephonesOPS",
    "maximumOffPBXTelephonesOPSUSED",
    "maximumOffPBXTelephonesOPSLOW",
    "maximumOffPBXTelephonesOPSHIGH",
    "maximumOffPBXTelephonesSCCAN",
    "maximumOffPBXTelephonesSCCANUSED",
    "maximumOffPBXTelephonesSCCANLOW",
    "maximumOffPBXTelephonesSCCANHIGH",
    "maximumAdministeredH323Trunks",
    "maximumAdministeredH323TrunksUSED",
    "maximumAdministeredH323TrunksLOW",
    "maximumAdministeredH323TrunksHIGH",
    "maximumConcurrentlyRegisteredIPStations",
    "maximumConcurrentlyRegisteredIPStationsUSED",
    "maximumConcurrentlyRegisteredIPStationsLOW",
    "maximumConcurrentlyRegisteredIPStationsHIGH",
    "maximumAdministeredRemoteOfficeTrunks",
    "maximumAdministeredRemoteOfficeTrunksUSED",
    "maximumAdministeredRemoteOfficeTrunksLOW",
    "maximumAdministeredRemoteOfficeTrunksHIGH",
    "maximumConcurrentlyRegisteredRemoteOfficeStations",
    "maximumConcurrentlyRegisteredRemoteOfficeStationsUSED",
    "maximumConcurrentlyRegisteredRemoteOfficeStationsLOW",
    "maximumConcurrentlyRegisteredRemoteOfficeStationsHIGH",
    "maximumConcurrentlyRegisteredIPECons",
    "maximumConcurrentlyRegisteredIPEConsUSED",
    "maximumConcurrentlyRegisteredIPEConsLOW",
    "maximumConcurrentlyRegisteredIPEConsHIGH",
    "maxConcurRegisteredUnauthenticatedH323Stations",
    "maxConcurRegisteredUnauthenticatedH323StationsUSED",
    "maxConcurRegisteredUnauthenticatedH323StationsLOW",
    "maxConcurRegisteredUnauthenticatedH323StationsHIGH",
    "maximumVideoCapableH323Stations",
    "maximumVideoCapableH323StationsUSED",
    "maximumVideoCapableH323StationsLOW",
    "maximumVideoCapableH323StationsHIGH",
    "maximumVideoCapableIPSoftphones",
    "maximumVideoCapableIPSoftphonesUSED",
    "maximumVideoCapableIPSoftphonesLOW",
    "maximumVideoCapableIPSoftphonesHIGH",
    "maximumAdministeredSIPTrunks",
    "maximumAdministeredSIPTrunksUSED",
    "maximumAdministeredSIPTrunksLOW",
    "maximumAdministeredSIPTrunksHIGH",
    "maximumNumberOfDS1BoardsWithEchoCancellation",
    "maximumNumberOfDS1BoardsWithEchoCancellationUSED",
    "maximumNumberOfDS1BoardsWithEchoCancellationLOW",
    "maximumNumberOfDS1BoardsWithEchoCancellationHIGH",
    "maximumTN2501VALBoards",
    "maximumTN2501VALBoardsUSED",
    "maximumTN2501VALBoardsLOW",
    "maximumTN2501VALBoardsHIGH",
    "maximumG250G350G700VALSources",
    "maximumG250G350G700VALSourcesUSED",
    "maximumG250G350G700VALSourcesLOW",
    "maximumG250G350G700VALSourcesHIGH",
    "maximumTN2602BoardsWith80VoIPChannels",
    "maximumTN2602BoardsWith80VoIPChannelsUSED",
    "maximumTN2602BoardsWith80VoIPChannelsLOW",
    "maximumTN2602BoardsWith80VoIPChannelsHIGH",
    "maximumTN2602BoardsWith320VoIPChannels",
    "maximumTN2602BoardsWith320VoIPChannelsUSED",
    "maximumTN2602BoardsWith320VoIPChannelsLOW",
    "maximumTN2602BoardsWith320VoIPChannelsHIGH",
    "maximumNumberOfExpandedMeetMeConferencePorts",
    "maximumNumberOfExpandedMeetMeConferencePortsUSED",
    "maximumNumberOfExpandedMeetMeConferencePortsLOW",
    "maximumNumberOfExpandedMeetMeConferencePortsHIGH",
    "abbreviatedDialingEnhancedList",
    "accessSecurityGatewayASG",
    "analogTrunkIncomingCallID",
    "adGrpSysListDialingStartAt01",
    "answerSupervisionByCallClassifier",
    "ars",
    "arsaarPartitioning",
    "arsaarDialingWithoutFAC",
    "asaiInterface",
    "asaiLinkCoreCapabilities",
    "asaiProprietaryAdjunctLinks",
    "asaiLinkPlusCapabilities",
    "asyncTransferModeATMPNC",
    "asyncTransferModeATMTrunking",
    "atmwanSpareProcessor",
    "atms",
    "attendantVectoring",
    "audibleMessageWaiting",
    "authorizationCodes",
    "backupClusterAutomaticTakeover",
    "casBranch",
    "casMain",
    "changeCORByFAC",
    "computerTelephonyAdjunctLinks",
    "cvgOfCallsRedirectedOffNet",
    "dcsBasic",
    "dcsCallCoverage",
    "dcsWithRerouting",
    "dcsGlobal",
    "digitalLossPlanModification",
    "ds1MSP",
    "ds1EchoCancellation",
    "emergencyAccessToAttendant",
    "enableDadminLogin",
    "enhancedConferencing",
    "enhancedEC500",
    "enterpriseSurvivableServer",
    "enterpriseWideLicensing",
    "essAdministration",
    "extendedCvgFwdAdmin",
    "externalDeviceAlarmAdmin",
    "fivePortNetworksMaxPerMCC",
    "flexibleBilling",
    "forcedEntryOfAccountCodes",
    "globalCallClassification",
    "hospitalityBasic",
    "hospitalityG3V3Enhancements",
    "hospitalityParameterReduction",
    "ipTrunks",
    "ipAttendantConsoles",
    "ipStations",
    "internetProtocolIPPNC",
    "isdnFeaturePlus",
    "isdnNetworkCallRedirection",
    "isdnbriTrunks",
    "isdnpri",
    "localSurvivableProcessor",
    "maliciousCallTrace",
    "mediaEncryptionOverIP",
    "modeCodeForCentralizedVoiceMail",
    "modeCodeInterface",
    "multifrequencySignaling",
    "multimediaApplServerInterfaceMASI",
    "multimediaCallHandlingBasic",
    "multimediaCallHandlingEnhanced",
    "multimediaIPSIPTrunking",
    "multinationalLocations",
    "multipleLevelPrecedenceAndPreemption",
    "multipleLocations",
    "personalStationAccess",
    "noLicenseModeDisabled",
    "postedMessages",
    "pncDuplication",
    "portNetworkSupport",
    "premierBusinessPackage",
    "processorAndSystemMSP",
    "privateNetworking",
    "processorEthernet",
    "r95Capabilities",
    "remoteOffice",
    "restrictCallForwardOffNet",
    "secondaryDataModule",
    "stationAndTrunkMSP",
    "stationAsVirtualExtension",
    "systemManagementDataTransfer",
    "tenantPartitioning",
    "terminalTransInitTTI",
    "timeOfDayRouting",
    "uniformDialingPlan",
    "usageAllocationEnhancements",
    "tn2501VALMaximumCapacity",
    "voiceMailApplicationSupport",
    "widebandSwitching",
    "wireless",
    "callCenterRelease",
    "acd",
    "bcmsBasic",
    "bcmsVuStatsServiceLevel",
    "bsrLocalTreatmentForIPAndISDN",
    "businessAdvocate",
    "callWorkCodes",
    "dtmfFeedbackSignalsForVRU",
    "dynamicAdvocate",
    "expertAgentSelectionEAS",
    "easphd",
    "forcedACDCalls",
    "leastOccupiedAgent",
    "lookaheadInterflowLAI",
    "multipleCallHandlingOnRequest",
    "multipleCallHandlingForced",
    "pasteDisplayPBXDataOnPhone",
    "reasonCodes",
    "serviceLevelMaximizer",
    "serviceObservingBasic",
    "serviceObservingRemoteByFAC",
    "serviceObservingVDNs",
    "timedACW",
    "vectoringBasic",
    "vectoringPrompting",
    "vectoringG3V4Enhanced",
    "vectoring30Enhanced",
    "vectoringANIIIDigitsRouting",
    "vectoringG3V4AdvancedRouting",
    "vectoringCINFO",
    "vectoringBestServiceRouting",
    "vectoringHolidays",
    "vectoringVariables",
    "vdnOfOriginAnnouncement",
    "vdnReturnDestination",
    "vuStats",
    "vuStatsG3V4Enhanced",
    "loggedInACDAgents",
    "loggedInACDAgentsUSED",
    "loggedInACDAgentsLOW",
    "loggedInACDAgentsHIGH",
    "loggedInAdvocateAgents",
    "loggedInAdvocateAgentsUSED",
    "loggedInAdvocateAgentsLOW",
    "loggedInAdvocateAgentsHIGH",
    "loggedInIPSoftphoneAgents",
    "loggedInIPSoftphoneAgentsUSED",
    "loggedInIPSoftphoneAgentsLOW",
    "loggedInIPSoftphoneAgentsHIGH",
    "basicCallSetup",
    "basicSupplementaryServices",
    "centralizedAttendant",
    "interworkingWithDCS",
    "supplementaryServicesWithRerouting",
    "transferIntoQSIGVoiceMail",
    "valueAddedVALU",
    "adjunctCallControl",
    "adjunctRouting",
    "domainControl",
    "eventNotification",
    "requestFeature",
    "setValue",
    "answeringMachineDetection",
    "selectiveListening",
    "switchClassifiedOutboundCalls",
    "proprietaryApplications",
    "ctiStations",
    "increasedAdjunctRouteCapacity",
    "phantomCalls",
    "agentStates",
    "productID",
    "limit",
    "used",
    "release"
})
public class SystemParametersCustomerType {

    @XmlElement(name = "G3_Version")
    protected String g3Version;
    @XmlElement(name = "Location")
    protected String location;
    @XmlElement(name = "Platform")
    protected String platform;
    @XmlElement(name = "RFA_Enterprise_System_ID_ESID")
    protected String rfaEnterpriseSystemIDESID;
    @XmlElement(name = "RFA_System_ID_SID")
    protected String rfaSystemIDSID;
    @XmlElement(name = "RFA_Module_ID_MID")
    protected String rfaModuleIDMID;
    @XmlElement(name = "Platform_Maximum_Ports")
    protected String platformMaximumPorts;
    @XmlElement(name = "Platform_Maximum_Ports_USED")
    protected String platformMaximumPortsUSED;
    @XmlElement(name = "Platform_Maximum_Ports_LOW")
    protected String platformMaximumPortsLOW;
    @XmlElement(name = "Platform_Maximum_Ports_HIGH")
    protected String platformMaximumPortsHIGH;
    @XmlElement(name = "Maximum_Stations")
    protected String maximumStations;
    @XmlElement(name = "Maximum_Stations_USED")
    protected String maximumStationsUSED;
    @XmlElement(name = "Maximum_Stations_LOW")
    protected String maximumStationsLOW;
    @XmlElement(name = "Maximum_Stations_HIGH")
    protected String maximumStationsHIGH;
    @XmlElement(name = "Maximum_XMOBILE_Stations")
    protected String maximumXMOBILEStations;
    @XmlElement(name = "Maximum_XMOBILE_Stations_USED")
    protected String maximumXMOBILEStationsUSED;
    @XmlElement(name = "Maximum_XMOBILE_Stations_LOW")
    protected String maximumXMOBILEStationsLOW;
    @XmlElement(name = "Maximum_XMOBILE_Stations_HIGH")
    protected String maximumXMOBILEStationsHIGH;
    @XmlElement(name = "Maximum_Off_PBX_Telephones_EC500")
    protected String maximumOffPBXTelephonesEC500;
    @XmlElement(name = "Maximum_Off_PBX_Telephones_EC500_USED")
    protected String maximumOffPBXTelephonesEC500USED;
    @XmlElement(name = "Maximum_Off_PBX_Telephones_EC500_LOW")
    protected String maximumOffPBXTelephonesEC500LOW;
    @XmlElement(name = "Maximum_Off_PBX_Telephones_EC500_HIGH")
    protected String maximumOffPBXTelephonesEC500HIGH;
    @XmlElement(name = "Maximum_Off_PBX_Telephones_OPS")
    protected String maximumOffPBXTelephonesOPS;
    @XmlElement(name = "Maximum_Off_PBX_Telephones_OPS_USED")
    protected String maximumOffPBXTelephonesOPSUSED;
    @XmlElement(name = "Maximum_Off_PBX_Telephones_OPS_LOW")
    protected String maximumOffPBXTelephonesOPSLOW;
    @XmlElement(name = "Maximum_Off_PBX_Telephones_OPS_HIGH")
    protected String maximumOffPBXTelephonesOPSHIGH;
    @XmlElement(name = "Maximum_Off_PBX_Telephones_SCCAN")
    protected String maximumOffPBXTelephonesSCCAN;
    @XmlElement(name = "Maximum_Off_PBX_Telephones_SCCAN_USED")
    protected String maximumOffPBXTelephonesSCCANUSED;
    @XmlElement(name = "Maximum_Off_PBX_Telephones_SCCAN_LOW")
    protected String maximumOffPBXTelephonesSCCANLOW;
    @XmlElement(name = "Maximum_Off_PBX_Telephones_SCCAN_HIGH")
    protected String maximumOffPBXTelephonesSCCANHIGH;
    @XmlElement(name = "Maximum_Administered_H_323_Trunks")
    protected String maximumAdministeredH323Trunks;
    @XmlElement(name = "Maximum_Administered_H_323_Trunks_USED")
    protected String maximumAdministeredH323TrunksUSED;
    @XmlElement(name = "Maximum_Administered_H_323_Trunks_LOW")
    protected String maximumAdministeredH323TrunksLOW;
    @XmlElement(name = "Maximum_Administered_H_323_Trunks_HIGH")
    protected String maximumAdministeredH323TrunksHIGH;
    @XmlElement(name = "Maximum_Concurrently_Registered_IP_Stations")
    protected String maximumConcurrentlyRegisteredIPStations;
    @XmlElement(name = "Maximum_Concurrently_Registered_IP_Stations_USED")
    protected String maximumConcurrentlyRegisteredIPStationsUSED;
    @XmlElement(name = "Maximum_Concurrently_Registered_IP_Stations_LOW")
    protected String maximumConcurrentlyRegisteredIPStationsLOW;
    @XmlElement(name = "Maximum_Concurrently_Registered_IP_Stations_HIGH")
    protected String maximumConcurrentlyRegisteredIPStationsHIGH;
    @XmlElement(name = "Maximum_Administered_Remote_Office_Trunks")
    protected String maximumAdministeredRemoteOfficeTrunks;
    @XmlElement(name = "Maximum_Administered_Remote_Office_Trunks_USED")
    protected String maximumAdministeredRemoteOfficeTrunksUSED;
    @XmlElement(name = "Maximum_Administered_Remote_Office_Trunks_LOW")
    protected String maximumAdministeredRemoteOfficeTrunksLOW;
    @XmlElement(name = "Maximum_Administered_Remote_Office_Trunks_HIGH")
    protected String maximumAdministeredRemoteOfficeTrunksHIGH;
    @XmlElement(name = "Maximum_Concurrently_Registered_Remote_Office_Stations")
    protected String maximumConcurrentlyRegisteredRemoteOfficeStations;
    @XmlElement(name = "Maximum_Concurrently_Registered_Remote_Office_Stations_USED")
    protected String maximumConcurrentlyRegisteredRemoteOfficeStationsUSED;
    @XmlElement(name = "Maximum_Concurrently_Registered_Remote_Office_Stations_LOW")
    protected String maximumConcurrentlyRegisteredRemoteOfficeStationsLOW;
    @XmlElement(name = "Maximum_Concurrently_Registered_Remote_Office_Stations_HIGH")
    protected String maximumConcurrentlyRegisteredRemoteOfficeStationsHIGH;
    @XmlElement(name = "Maximum_Concurrently_Registered_IP_ECons")
    protected String maximumConcurrentlyRegisteredIPECons;
    @XmlElement(name = "Maximum_Concurrently_Registered_IP_ECons_USED")
    protected String maximumConcurrentlyRegisteredIPEConsUSED;
    @XmlElement(name = "Maximum_Concurrently_Registered_IP_ECons_LOW")
    protected String maximumConcurrentlyRegisteredIPEConsLOW;
    @XmlElement(name = "Maximum_Concurrently_Registered_IP_ECons_HIGH")
    protected String maximumConcurrentlyRegisteredIPEConsHIGH;
    @XmlElement(name = "Max_Concur_Registered_Unauthenticated_H_323_Stations")
    protected String maxConcurRegisteredUnauthenticatedH323Stations;
    @XmlElement(name = "Max_Concur_Registered_Unauthenticated_H_323_Stations_USED")
    protected String maxConcurRegisteredUnauthenticatedH323StationsUSED;
    @XmlElement(name = "Max_Concur_Registered_Unauthenticated_H_323_Stations_LOW")
    protected String maxConcurRegisteredUnauthenticatedH323StationsLOW;
    @XmlElement(name = "Max_Concur_Registered_Unauthenticated_H_323_Stations_HIGH")
    protected String maxConcurRegisteredUnauthenticatedH323StationsHIGH;
    @XmlElement(name = "Maximum_Video_Capable_H_323_Stations")
    protected String maximumVideoCapableH323Stations;
    @XmlElement(name = "Maximum_Video_Capable_H_323_Stations_USED")
    protected String maximumVideoCapableH323StationsUSED;
    @XmlElement(name = "Maximum_Video_Capable_H_323_Stations_LOW")
    protected String maximumVideoCapableH323StationsLOW;
    @XmlElement(name = "Maximum_Video_Capable_H_323_Stations_HIGH")
    protected String maximumVideoCapableH323StationsHIGH;
    @XmlElement(name = "Maximum_Video_Capable_IP_Softphones")
    protected String maximumVideoCapableIPSoftphones;
    @XmlElement(name = "Maximum_Video_Capable_IP_Softphones_USED")
    protected String maximumVideoCapableIPSoftphonesUSED;
    @XmlElement(name = "Maximum_Video_Capable_IP_Softphones_LOW")
    protected String maximumVideoCapableIPSoftphonesLOW;
    @XmlElement(name = "Maximum_Video_Capable_IP_Softphones_HIGH")
    protected String maximumVideoCapableIPSoftphonesHIGH;
    @XmlElement(name = "Maximum_Administered_SIP_Trunks")
    protected String maximumAdministeredSIPTrunks;
    @XmlElement(name = "Maximum_Administered_SIP_Trunks_USED")
    protected String maximumAdministeredSIPTrunksUSED;
    @XmlElement(name = "Maximum_Administered_SIP_Trunks_LOW")
    protected String maximumAdministeredSIPTrunksLOW;
    @XmlElement(name = "Maximum_Administered_SIP_Trunks_HIGH")
    protected String maximumAdministeredSIPTrunksHIGH;
    @XmlElement(name = "Maximum_Number_Of_DS1_Boards_With_Echo_Cancellation")
    protected String maximumNumberOfDS1BoardsWithEchoCancellation;
    @XmlElement(name = "Maximum_Number_Of_DS1_Boards_With_Echo_Cancellation_USED")
    protected String maximumNumberOfDS1BoardsWithEchoCancellationUSED;
    @XmlElement(name = "Maximum_Number_Of_DS1_Boards_With_Echo_Cancellation_LOW")
    protected String maximumNumberOfDS1BoardsWithEchoCancellationLOW;
    @XmlElement(name = "Maximum_Number_Of_DS1_Boards_With_Echo_Cancellation_HIGH")
    protected String maximumNumberOfDS1BoardsWithEchoCancellationHIGH;
    @XmlElement(name = "Maximum_TN2501_VAL_Boards")
    protected String maximumTN2501VALBoards;
    @XmlElement(name = "Maximum_TN2501_VAL_Boards_USED")
    protected String maximumTN2501VALBoardsUSED;
    @XmlElement(name = "Maximum_TN2501_VAL_Boards_LOW")
    protected String maximumTN2501VALBoardsLOW;
    @XmlElement(name = "Maximum_TN2501_VAL_Boards_HIGH")
    protected String maximumTN2501VALBoardsHIGH;
    @XmlElement(name = "Maximum_G250_G350_G700_VAL_Sources")
    protected String maximumG250G350G700VALSources;
    @XmlElement(name = "Maximum_G250_G350_G700_VAL_Sources_USED")
    protected String maximumG250G350G700VALSourcesUSED;
    @XmlElement(name = "Maximum_G250_G350_G700_VAL_Sources_LOW")
    protected String maximumG250G350G700VALSourcesLOW;
    @XmlElement(name = "Maximum_G250_G350_G700_VAL_Sources_HIGH")
    protected String maximumG250G350G700VALSourcesHIGH;
    @XmlElement(name = "Maximum_TN2602_Boards_With_80_VoIP_Channels")
    protected String maximumTN2602BoardsWith80VoIPChannels;
    @XmlElement(name = "Maximum_TN2602_Boards_With_80_VoIP_Channels_USED")
    protected String maximumTN2602BoardsWith80VoIPChannelsUSED;
    @XmlElement(name = "Maximum_TN2602_Boards_With_80_VoIP_Channels_LOW")
    protected String maximumTN2602BoardsWith80VoIPChannelsLOW;
    @XmlElement(name = "Maximum_TN2602_Boards_With_80_VoIP_Channels_HIGH")
    protected String maximumTN2602BoardsWith80VoIPChannelsHIGH;
    @XmlElement(name = "Maximum_TN2602_Boards_With_320_VoIP_Channels")
    protected String maximumTN2602BoardsWith320VoIPChannels;
    @XmlElement(name = "Maximum_TN2602_Boards_With_320_VoIP_Channels_USED")
    protected String maximumTN2602BoardsWith320VoIPChannelsUSED;
    @XmlElement(name = "Maximum_TN2602_Boards_With_320_VoIP_Channels_LOW")
    protected String maximumTN2602BoardsWith320VoIPChannelsLOW;
    @XmlElement(name = "Maximum_TN2602_Boards_With_320_VoIP_Channels_HIGH")
    protected String maximumTN2602BoardsWith320VoIPChannelsHIGH;
    @XmlElement(name = "Maximum_Number_Of_Expanded_Meet_me_Conference_Ports")
    protected String maximumNumberOfExpandedMeetMeConferencePorts;
    @XmlElement(name = "Maximum_Number_Of_Expanded_Meet_me_Conference_Ports_USED")
    protected String maximumNumberOfExpandedMeetMeConferencePortsUSED;
    @XmlElement(name = "Maximum_Number_Of_Expanded_Meet_me_Conference_Ports_LOW")
    protected String maximumNumberOfExpandedMeetMeConferencePortsLOW;
    @XmlElement(name = "Maximum_Number_Of_Expanded_Meet_me_Conference_Ports_HIGH")
    protected String maximumNumberOfExpandedMeetMeConferencePortsHIGH;
    @XmlElement(name = "Abbreviated_Dialing_Enhanced_List")
    protected String abbreviatedDialingEnhancedList;
    @XmlElement(name = "Access_Security_Gateway_ASG")
    protected String accessSecurityGatewayASG;
    @XmlElement(name = "Analog_Trunk_Incoming_Call_ID")
    protected String analogTrunkIncomingCallID;
    @XmlElement(name = "A_D_Grp_Sys_List_Dialing_Start_At_01")
    protected String adGrpSysListDialingStartAt01;
    @XmlElement(name = "Answer_Supervision_by_Call_Classifier")
    protected String answerSupervisionByCallClassifier;
    @XmlElement(name = "ARS")
    protected String ars;
    @XmlElement(name = "ARS_AAR_Partitioning")
    protected String arsaarPartitioning;
    @XmlElement(name = "ARS_AAR_Dialing_Without_FAC")
    protected String arsaarDialingWithoutFAC;
    @XmlElement(name = "ASAI_Interface")
    protected String asaiInterface;
    @XmlElement(name = "ASAI_Link_Core_Capabilities")
    protected String asaiLinkCoreCapabilities;
    @XmlElement(name = "ASAI_Proprietary_Adjunct_Links")
    protected String asaiProprietaryAdjunctLinks;
    @XmlElement(name = "ASAI_Link_Plus_Capabilities")
    protected String asaiLinkPlusCapabilities;
    @XmlElement(name = "Async_Transfer_Mode_ATM_PNC")
    protected String asyncTransferModeATMPNC;
    @XmlElement(name = "Async_Transfer_Mode_ATM_Trunking")
    protected String asyncTransferModeATMTrunking;
    @XmlElement(name = "ATM_WAN_Spare_Processor")
    protected String atmwanSpareProcessor;
    @XmlElement(name = "ATMS")
    protected String atms;
    @XmlElement(name = "Attendant_Vectoring")
    protected String attendantVectoring;
    @XmlElement(name = "Audible_Message_Waiting")
    protected String audibleMessageWaiting;
    @XmlElement(name = "Authorization_Codes")
    protected String authorizationCodes;
    @XmlElement(name = "Backup_Cluster_Automatic_Takeover")
    protected String backupClusterAutomaticTakeover;
    @XmlElement(name = "CAS_Branch")
    protected String casBranch;
    @XmlElement(name = "CAS_Main")
    protected String casMain;
    @XmlElement(name = "Change_COR_by_FAC")
    protected String changeCORByFAC;
    @XmlElement(name = "Computer_Telephony_Adjunct_Links")
    protected String computerTelephonyAdjunctLinks;
    @XmlElement(name = "Cvg_Of_Calls_Redirected_Off_Net")
    protected String cvgOfCallsRedirectedOffNet;
    @XmlElement(name = "DCS_Basic")
    protected String dcsBasic;
    @XmlElement(name = "DCS_Call_Coverage")
    protected String dcsCallCoverage;
    @XmlElement(name = "DCS_With_Rerouting")
    protected String dcsWithRerouting;
    @XmlElement(name = "DCS_Global")
    protected String dcsGlobal;
    @XmlElement(name = "Digital_Loss_Plan_Modification")
    protected String digitalLossPlanModification;
    @XmlElement(name = "DS1_MSP")
    protected String ds1MSP;
    @XmlElement(name = "DS1_Echo_Cancellation")
    protected String ds1EchoCancellation;
    @XmlElement(name = "Emergency_Access_to_Attendant")
    protected String emergencyAccessToAttendant;
    @XmlElement(name = "Enable_dadmin_Login")
    protected String enableDadminLogin;
    @XmlElement(name = "Enhanced_Conferencing")
    protected String enhancedConferencing;
    @XmlElement(name = "Enhanced_EC500")
    protected String enhancedEC500;
    @XmlElement(name = "Enterprise_Survivable_Server")
    protected String enterpriseSurvivableServer;
    @XmlElement(name = "Enterprise_Wide_Licensing")
    protected String enterpriseWideLicensing;
    @XmlElement(name = "ESS_Administration")
    protected String essAdministration;
    @XmlElement(name = "Extended_Cvg_Fwd_Admin")
    protected String extendedCvgFwdAdmin;
    @XmlElement(name = "External_Device_Alarm_Admin")
    protected String externalDeviceAlarmAdmin;
    @XmlElement(name = "Five_Port_Networks_Max_Per_MCC")
    protected String fivePortNetworksMaxPerMCC;
    @XmlElement(name = "Flexible_Billing")
    protected String flexibleBilling;
    @XmlElement(name = "Forced_Entry_of_Account_Codes")
    protected String forcedEntryOfAccountCodes;
    @XmlElement(name = "Global_Call_Classification")
    protected String globalCallClassification;
    @XmlElement(name = "Hospitality_Basic")
    protected String hospitalityBasic;
    @XmlElement(name = "Hospitality_G3V3_Enhancements")
    protected String hospitalityG3V3Enhancements;
    @XmlElement(name = "Hospitality_Parameter_Reduction")
    protected String hospitalityParameterReduction;
    @XmlElement(name = "IP_Trunks")
    protected String ipTrunks;
    @XmlElement(name = "IP_Attendant_Consoles")
    protected String ipAttendantConsoles;
    @XmlElement(name = "IP_Stations")
    protected String ipStations;
    @XmlElement(name = "Internet_Protocol_IP_PNC")
    protected String internetProtocolIPPNC;
    @XmlElement(name = "ISDN_Feature_Plus")
    protected String isdnFeaturePlus;
    @XmlElement(name = "ISDN_Network_Call_Redirection")
    protected String isdnNetworkCallRedirection;
    @XmlElement(name = "ISDN_BRI_Trunks")
    protected String isdnbriTrunks;
    @XmlElement(name = "ISDN_PRI")
    protected String isdnpri;
    @XmlElement(name = "Local_Survivable_Processor")
    protected String localSurvivableProcessor;
    @XmlElement(name = "Malicious_Call_Trace")
    protected String maliciousCallTrace;
    @XmlElement(name = "Media_Encryption_Over_IP")
    protected String mediaEncryptionOverIP;
    @XmlElement(name = "Mode_Code_For_Centralized_Voice_Mail")
    protected String modeCodeForCentralizedVoiceMail;
    @XmlElement(name = "Mode_Code_Interface")
    protected String modeCodeInterface;
    @XmlElement(name = "Multifrequency_Signaling")
    protected String multifrequencySignaling;
    @XmlElement(name = "Multimedia_Appl_Server_Interface_MASI")
    protected String multimediaApplServerInterfaceMASI;
    @XmlElement(name = "Multimedia_Call_Handling_Basic")
    protected String multimediaCallHandlingBasic;
    @XmlElement(name = "Multimedia_Call_Handling_Enhanced")
    protected String multimediaCallHandlingEnhanced;
    @XmlElement(name = "Multimedia_IP_SIP_Trunking")
    protected String multimediaIPSIPTrunking;
    @XmlElement(name = "Multinational_Locations")
    protected String multinationalLocations;
    @XmlElement(name = "Multiple_Level_Precedence_And_Preemption")
    protected String multipleLevelPrecedenceAndPreemption;
    @XmlElement(name = "Multiple_Locations")
    protected String multipleLocations;
    @XmlElement(name = "Personal_Station_Access")
    protected String personalStationAccess;
    @XmlElement(name = "No_License_Mode_Disabled")
    protected String noLicenseModeDisabled;
    @XmlElement(name = "Posted_Messages")
    protected String postedMessages;
    @XmlElement(name = "PNC_Duplication")
    protected String pncDuplication;
    @XmlElement(name = "Port_Network_Support")
    protected String portNetworkSupport;
    @XmlElement(name = "Premier_Business_Package")
    protected String premierBusinessPackage;
    @XmlElement(name = "Processor_And_System_MSP")
    protected String processorAndSystemMSP;
    @XmlElement(name = "Private_Networking")
    protected String privateNetworking;
    @XmlElement(name = "Processor_Ethernet")
    protected String processorEthernet;
    @XmlElement(name = "R9_5_Capabilities")
    protected String r95Capabilities;
    @XmlElement(name = "Remote_Office")
    protected String remoteOffice;
    @XmlElement(name = "Restrict_Call_Forward_Off_Net")
    protected String restrictCallForwardOffNet;
    @XmlElement(name = "Secondary_Data_Module")
    protected String secondaryDataModule;
    @XmlElement(name = "Station_And_Trunk_MSP")
    protected String stationAndTrunkMSP;
    @XmlElement(name = "Station_As_Virtual_Extension")
    protected String stationAsVirtualExtension;
    @XmlElement(name = "System_Management_Data_Transfer")
    protected String systemManagementDataTransfer;
    @XmlElement(name = "Tenant_Partitioning")
    protected String tenantPartitioning;
    @XmlElement(name = "Terminal_Trans_Init_TTI")
    protected String terminalTransInitTTI;
    @XmlElement(name = "Time_Of_Day_Routing")
    protected String timeOfDayRouting;
    @XmlElement(name = "Uniform_Dialing_Plan")
    protected String uniformDialingPlan;
    @XmlElement(name = "Usage_Allocation_Enhancements")
    protected String usageAllocationEnhancements;
    @XmlElement(name = "TN2501_VAL_Maximum_Capacity")
    protected String tn2501VALMaximumCapacity;
    @XmlElement(name = "Voice_Mail_Application_Support")
    protected String voiceMailApplicationSupport;
    @XmlElement(name = "Wideband_Switching")
    protected String widebandSwitching;
    @XmlElement(name = "Wireless")
    protected String wireless;
    @XmlElement(name = "Call_Center_Release")
    protected String callCenterRelease;
    @XmlElement(name = "ACD")
    protected String acd;
    @XmlElement(name = "BCMS_Basic")
    protected String bcmsBasic;
    @XmlElement(name = "BCMS_VuStats_Service_Level")
    protected String bcmsVuStatsServiceLevel;
    @XmlElement(name = "BSR_Local_Treatment_For_IP_and_ISDN")
    protected String bsrLocalTreatmentForIPAndISDN;
    @XmlElement(name = "Business_Advocate")
    protected String businessAdvocate;
    @XmlElement(name = "Call_Work_Codes")
    protected String callWorkCodes;
    @XmlElement(name = "DTMF_Feedback_Signals_For_VRU")
    protected String dtmfFeedbackSignalsForVRU;
    @XmlElement(name = "Dynamic_Advocate")
    protected String dynamicAdvocate;
    @XmlElement(name = "Expert_Agent_Selection_EAS")
    protected String expertAgentSelectionEAS;
    @XmlElement(name = "EAS_PHD")
    protected String easphd;
    @XmlElement(name = "Forced_ACD_Calls")
    protected String forcedACDCalls;
    @XmlElement(name = "Least_Occupied_Agent")
    protected String leastOccupiedAgent;
    @XmlElement(name = "Lookahead_Interflow_LAI")
    protected String lookaheadInterflowLAI;
    @XmlElement(name = "Multiple_Call_Handling_On_Request")
    protected String multipleCallHandlingOnRequest;
    @XmlElement(name = "Multiple_Call_Handling_Forced")
    protected String multipleCallHandlingForced;
    @XmlElement(name = "PASTE_Display_PBX_Data_On_Phone")
    protected String pasteDisplayPBXDataOnPhone;
    @XmlElement(name = "Reason_Codes")
    protected String reasonCodes;
    @XmlElement(name = "Service_Level_Maximizer")
    protected String serviceLevelMaximizer;
    @XmlElement(name = "Service_Observing_Basic")
    protected String serviceObservingBasic;
    @XmlElement(name = "Service_Observing_Remote_By_FAC")
    protected String serviceObservingRemoteByFAC;
    @XmlElement(name = "Service_Observing_VDNs")
    protected String serviceObservingVDNs;
    @XmlElement(name = "Timed_ACW")
    protected String timedACW;
    @XmlElement(name = "Vectoring_Basic")
    protected String vectoringBasic;
    @XmlElement(name = "Vectoring_Prompting")
    protected String vectoringPrompting;
    @XmlElement(name = "Vectoring_G3V4_Enhanced")
    protected String vectoringG3V4Enhanced;
    @XmlElement(name = "Vectoring_3_0_Enhanced")
    protected String vectoring30Enhanced;
    @XmlElement(name = "Vectoring_ANI_II_Digits_Routing")
    protected String vectoringANIIIDigitsRouting;
    @XmlElement(name = "Vectoring_G3V4_Advanced_Routing")
    protected String vectoringG3V4AdvancedRouting;
    @XmlElement(name = "Vectoring_CINFO")
    protected String vectoringCINFO;
    @XmlElement(name = "Vectoring_Best_Service_Routing")
    protected String vectoringBestServiceRouting;
    @XmlElement(name = "Vectoring_Holidays")
    protected String vectoringHolidays;
    @XmlElement(name = "Vectoring_Variables")
    protected String vectoringVariables;
    @XmlElement(name = "VDN_Of_Origin_Announcement")
    protected String vdnOfOriginAnnouncement;
    @XmlElement(name = "VDN_Return_Destination")
    protected String vdnReturnDestination;
    @XmlElement(name = "VuStats")
    protected String vuStats;
    @XmlElement(name = "VuStats_G3V4_Enhanced")
    protected String vuStatsG3V4Enhanced;
    @XmlElement(name = "Logged_In_ACD_Agents")
    protected String loggedInACDAgents;
    @XmlElement(name = "Logged_In_ACD_Agents_USED")
    protected String loggedInACDAgentsUSED;
    @XmlElement(name = "Logged_In_ACD_Agents_LOW")
    protected String loggedInACDAgentsLOW;
    @XmlElement(name = "Logged_In_ACD_Agents_HIGH")
    protected String loggedInACDAgentsHIGH;
    @XmlElement(name = "Logged_In_Advocate_Agents")
    protected String loggedInAdvocateAgents;
    @XmlElement(name = "Logged_In_Advocate_Agents_USED")
    protected String loggedInAdvocateAgentsUSED;
    @XmlElement(name = "Logged_In_Advocate_Agents_LOW")
    protected String loggedInAdvocateAgentsLOW;
    @XmlElement(name = "Logged_In_Advocate_Agents_HIGH")
    protected String loggedInAdvocateAgentsHIGH;
    @XmlElement(name = "Logged_In_IP_Softphone_Agents")
    protected String loggedInIPSoftphoneAgents;
    @XmlElement(name = "Logged_In_IP_Softphone_Agents_USED")
    protected String loggedInIPSoftphoneAgentsUSED;
    @XmlElement(name = "Logged_In_IP_Softphone_Agents_LOW")
    protected String loggedInIPSoftphoneAgentsLOW;
    @XmlElement(name = "Logged_In_IP_Softphone_Agents_HIGH")
    protected String loggedInIPSoftphoneAgentsHIGH;
    @XmlElement(name = "Basic_Call_Setup")
    protected String basicCallSetup;
    @XmlElement(name = "Basic_Supplementary_Services")
    protected String basicSupplementaryServices;
    @XmlElement(name = "Centralized_Attendant")
    protected String centralizedAttendant;
    @XmlElement(name = "Interworking_With_DCS")
    protected String interworkingWithDCS;
    @XmlElement(name = "Supplementary_Services_with_Rerouting")
    protected String supplementaryServicesWithRerouting;
    @XmlElement(name = "Transfer_into_QSIG_Voice_Mail")
    protected String transferIntoQSIGVoiceMail;
    @XmlElement(name = "Value_Added_VALU")
    protected String valueAddedVALU;
    @XmlElement(name = "Adjunct_Call_Control")
    protected String adjunctCallControl;
    @XmlElement(name = "Adjunct_Routing")
    protected String adjunctRouting;
    @XmlElement(name = "Domain_Control")
    protected String domainControl;
    @XmlElement(name = "Event_Notification")
    protected String eventNotification;
    @XmlElement(name = "Request_Feature")
    protected String requestFeature;
    @XmlElement(name = "Set_Value")
    protected String setValue;
    @XmlElement(name = "Answering_Machine_Detection")
    protected String answeringMachineDetection;
    @XmlElement(name = "Selective_Listening")
    protected String selectiveListening;
    @XmlElement(name = "Switch_Classified_Outbound_Calls")
    protected String switchClassifiedOutboundCalls;
    @XmlElement(name = "Proprietary_Applications")
    protected String proprietaryApplications;
    @XmlElement(name = "CTI_Stations")
    protected String ctiStations;
    @XmlElement(name = "Increased_Adjunct_Route_Capacity")
    protected String increasedAdjunctRouteCapacity;
    @XmlElement(name = "Phantom_Calls")
    protected String phantomCalls;
    @XmlElement(name = "Agent_States")
    protected String agentStates;
    @XmlElement(name = "ProductID")
    protected List<ArrayType> productID;
    @XmlElement(name = "Limit")
    protected List<ArrayType> limit;
    @XmlElement(name = "Used")
    protected List<ArrayType> used;
    @XmlElement(name = "Release")
    protected List<ArrayType> release;

    /**
     * Gets the value of the g3Version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getG3Version() {
        return g3Version;
    }

    /**
     * Sets the value of the g3Version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setG3Version(String value) {
        this.g3Version = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the platform property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlatform() {
        return platform;
    }

    /**
     * Sets the value of the platform property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlatform(String value) {
        this.platform = value;
    }

    /**
     * Gets the value of the rfaEnterpriseSystemIDESID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRFAEnterpriseSystemIDESID() {
        return rfaEnterpriseSystemIDESID;
    }

    /**
     * Sets the value of the rfaEnterpriseSystemIDESID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRFAEnterpriseSystemIDESID(String value) {
        this.rfaEnterpriseSystemIDESID = value;
    }

    /**
     * Gets the value of the rfaSystemIDSID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRFASystemIDSID() {
        return rfaSystemIDSID;
    }

    /**
     * Sets the value of the rfaSystemIDSID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRFASystemIDSID(String value) {
        this.rfaSystemIDSID = value;
    }

    /**
     * Gets the value of the rfaModuleIDMID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRFAModuleIDMID() {
        return rfaModuleIDMID;
    }

    /**
     * Sets the value of the rfaModuleIDMID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRFAModuleIDMID(String value) {
        this.rfaModuleIDMID = value;
    }

    /**
     * Gets the value of the platformMaximumPorts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlatformMaximumPorts() {
        return platformMaximumPorts;
    }

    /**
     * Sets the value of the platformMaximumPorts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlatformMaximumPorts(String value) {
        this.platformMaximumPorts = value;
    }

    /**
     * Gets the value of the platformMaximumPortsUSED property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlatformMaximumPortsUSED() {
        return platformMaximumPortsUSED;
    }

    /**
     * Sets the value of the platformMaximumPortsUSED property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlatformMaximumPortsUSED(String value) {
        this.platformMaximumPortsUSED = value;
    }

    /**
     * Gets the value of the platformMaximumPortsLOW property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlatformMaximumPortsLOW() {
        return platformMaximumPortsLOW;
    }

    /**
     * Sets the value of the platformMaximumPortsLOW property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlatformMaximumPortsLOW(String value) {
        this.platformMaximumPortsLOW = value;
    }

    /**
     * Gets the value of the platformMaximumPortsHIGH property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlatformMaximumPortsHIGH() {
        return platformMaximumPortsHIGH;
    }

    /**
     * Sets the value of the platformMaximumPortsHIGH property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlatformMaximumPortsHIGH(String value) {
        this.platformMaximumPortsHIGH = value;
    }

    /**
     * Gets the value of the maximumStations property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumStations() {
        return maximumStations;
    }

    /**
     * Sets the value of the maximumStations property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumStations(String value) {
        this.maximumStations = value;
    }

    /**
     * Gets the value of the maximumStationsUSED property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumStationsUSED() {
        return maximumStationsUSED;
    }

    /**
     * Sets the value of the maximumStationsUSED property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumStationsUSED(String value) {
        this.maximumStationsUSED = value;
    }

    /**
     * Gets the value of the maximumStationsLOW property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumStationsLOW() {
        return maximumStationsLOW;
    }

    /**
     * Sets the value of the maximumStationsLOW property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumStationsLOW(String value) {
        this.maximumStationsLOW = value;
    }

    /**
     * Gets the value of the maximumStationsHIGH property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumStationsHIGH() {
        return maximumStationsHIGH;
    }

    /**
     * Sets the value of the maximumStationsHIGH property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumStationsHIGH(String value) {
        this.maximumStationsHIGH = value;
    }

    /**
     * Gets the value of the maximumXMOBILEStations property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumXMOBILEStations() {
        return maximumXMOBILEStations;
    }

    /**
     * Sets the value of the maximumXMOBILEStations property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumXMOBILEStations(String value) {
        this.maximumXMOBILEStations = value;
    }

    /**
     * Gets the value of the maximumXMOBILEStationsUSED property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumXMOBILEStationsUSED() {
        return maximumXMOBILEStationsUSED;
    }

    /**
     * Sets the value of the maximumXMOBILEStationsUSED property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumXMOBILEStationsUSED(String value) {
        this.maximumXMOBILEStationsUSED = value;
    }

    /**
     * Gets the value of the maximumXMOBILEStationsLOW property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumXMOBILEStationsLOW() {
        return maximumXMOBILEStationsLOW;
    }

    /**
     * Sets the value of the maximumXMOBILEStationsLOW property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumXMOBILEStationsLOW(String value) {
        this.maximumXMOBILEStationsLOW = value;
    }

    /**
     * Gets the value of the maximumXMOBILEStationsHIGH property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumXMOBILEStationsHIGH() {
        return maximumXMOBILEStationsHIGH;
    }

    /**
     * Sets the value of the maximumXMOBILEStationsHIGH property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumXMOBILEStationsHIGH(String value) {
        this.maximumXMOBILEStationsHIGH = value;
    }

    /**
     * Gets the value of the maximumOffPBXTelephonesEC500 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumOffPBXTelephonesEC500() {
        return maximumOffPBXTelephonesEC500;
    }

    /**
     * Sets the value of the maximumOffPBXTelephonesEC500 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumOffPBXTelephonesEC500(String value) {
        this.maximumOffPBXTelephonesEC500 = value;
    }

    /**
     * Gets the value of the maximumOffPBXTelephonesEC500USED property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumOffPBXTelephonesEC500USED() {
        return maximumOffPBXTelephonesEC500USED;
    }

    /**
     * Sets the value of the maximumOffPBXTelephonesEC500USED property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumOffPBXTelephonesEC500USED(String value) {
        this.maximumOffPBXTelephonesEC500USED = value;
    }

    /**
     * Gets the value of the maximumOffPBXTelephonesEC500LOW property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumOffPBXTelephonesEC500LOW() {
        return maximumOffPBXTelephonesEC500LOW;
    }

    /**
     * Sets the value of the maximumOffPBXTelephonesEC500LOW property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumOffPBXTelephonesEC500LOW(String value) {
        this.maximumOffPBXTelephonesEC500LOW = value;
    }

    /**
     * Gets the value of the maximumOffPBXTelephonesEC500HIGH property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumOffPBXTelephonesEC500HIGH() {
        return maximumOffPBXTelephonesEC500HIGH;
    }

    /**
     * Sets the value of the maximumOffPBXTelephonesEC500HIGH property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumOffPBXTelephonesEC500HIGH(String value) {
        this.maximumOffPBXTelephonesEC500HIGH = value;
    }

    /**
     * Gets the value of the maximumOffPBXTelephonesOPS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumOffPBXTelephonesOPS() {
        return maximumOffPBXTelephonesOPS;
    }

    /**
     * Sets the value of the maximumOffPBXTelephonesOPS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumOffPBXTelephonesOPS(String value) {
        this.maximumOffPBXTelephonesOPS = value;
    }

    /**
     * Gets the value of the maximumOffPBXTelephonesOPSUSED property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumOffPBXTelephonesOPSUSED() {
        return maximumOffPBXTelephonesOPSUSED;
    }

    /**
     * Sets the value of the maximumOffPBXTelephonesOPSUSED property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumOffPBXTelephonesOPSUSED(String value) {
        this.maximumOffPBXTelephonesOPSUSED = value;
    }

    /**
     * Gets the value of the maximumOffPBXTelephonesOPSLOW property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumOffPBXTelephonesOPSLOW() {
        return maximumOffPBXTelephonesOPSLOW;
    }

    /**
     * Sets the value of the maximumOffPBXTelephonesOPSLOW property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumOffPBXTelephonesOPSLOW(String value) {
        this.maximumOffPBXTelephonesOPSLOW = value;
    }

    /**
     * Gets the value of the maximumOffPBXTelephonesOPSHIGH property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumOffPBXTelephonesOPSHIGH() {
        return maximumOffPBXTelephonesOPSHIGH;
    }

    /**
     * Sets the value of the maximumOffPBXTelephonesOPSHIGH property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumOffPBXTelephonesOPSHIGH(String value) {
        this.maximumOffPBXTelephonesOPSHIGH = value;
    }

    /**
     * Gets the value of the maximumOffPBXTelephonesSCCAN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumOffPBXTelephonesSCCAN() {
        return maximumOffPBXTelephonesSCCAN;
    }

    /**
     * Sets the value of the maximumOffPBXTelephonesSCCAN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumOffPBXTelephonesSCCAN(String value) {
        this.maximumOffPBXTelephonesSCCAN = value;
    }

    /**
     * Gets the value of the maximumOffPBXTelephonesSCCANUSED property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumOffPBXTelephonesSCCANUSED() {
        return maximumOffPBXTelephonesSCCANUSED;
    }

    /**
     * Sets the value of the maximumOffPBXTelephonesSCCANUSED property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumOffPBXTelephonesSCCANUSED(String value) {
        this.maximumOffPBXTelephonesSCCANUSED = value;
    }

    /**
     * Gets the value of the maximumOffPBXTelephonesSCCANLOW property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumOffPBXTelephonesSCCANLOW() {
        return maximumOffPBXTelephonesSCCANLOW;
    }

    /**
     * Sets the value of the maximumOffPBXTelephonesSCCANLOW property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumOffPBXTelephonesSCCANLOW(String value) {
        this.maximumOffPBXTelephonesSCCANLOW = value;
    }

    /**
     * Gets the value of the maximumOffPBXTelephonesSCCANHIGH property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumOffPBXTelephonesSCCANHIGH() {
        return maximumOffPBXTelephonesSCCANHIGH;
    }

    /**
     * Sets the value of the maximumOffPBXTelephonesSCCANHIGH property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumOffPBXTelephonesSCCANHIGH(String value) {
        this.maximumOffPBXTelephonesSCCANHIGH = value;
    }

    /**
     * Gets the value of the maximumAdministeredH323Trunks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumAdministeredH323Trunks() {
        return maximumAdministeredH323Trunks;
    }

    /**
     * Sets the value of the maximumAdministeredH323Trunks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumAdministeredH323Trunks(String value) {
        this.maximumAdministeredH323Trunks = value;
    }

    /**
     * Gets the value of the maximumAdministeredH323TrunksUSED property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumAdministeredH323TrunksUSED() {
        return maximumAdministeredH323TrunksUSED;
    }

    /**
     * Sets the value of the maximumAdministeredH323TrunksUSED property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumAdministeredH323TrunksUSED(String value) {
        this.maximumAdministeredH323TrunksUSED = value;
    }

    /**
     * Gets the value of the maximumAdministeredH323TrunksLOW property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumAdministeredH323TrunksLOW() {
        return maximumAdministeredH323TrunksLOW;
    }

    /**
     * Sets the value of the maximumAdministeredH323TrunksLOW property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumAdministeredH323TrunksLOW(String value) {
        this.maximumAdministeredH323TrunksLOW = value;
    }

    /**
     * Gets the value of the maximumAdministeredH323TrunksHIGH property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumAdministeredH323TrunksHIGH() {
        return maximumAdministeredH323TrunksHIGH;
    }

    /**
     * Sets the value of the maximumAdministeredH323TrunksHIGH property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumAdministeredH323TrunksHIGH(String value) {
        this.maximumAdministeredH323TrunksHIGH = value;
    }

    /**
     * Gets the value of the maximumConcurrentlyRegisteredIPStations property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumConcurrentlyRegisteredIPStations() {
        return maximumConcurrentlyRegisteredIPStations;
    }

    /**
     * Sets the value of the maximumConcurrentlyRegisteredIPStations property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumConcurrentlyRegisteredIPStations(String value) {
        this.maximumConcurrentlyRegisteredIPStations = value;
    }

    /**
     * Gets the value of the maximumConcurrentlyRegisteredIPStationsUSED property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumConcurrentlyRegisteredIPStationsUSED() {
        return maximumConcurrentlyRegisteredIPStationsUSED;
    }

    /**
     * Sets the value of the maximumConcurrentlyRegisteredIPStationsUSED property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumConcurrentlyRegisteredIPStationsUSED(String value) {
        this.maximumConcurrentlyRegisteredIPStationsUSED = value;
    }

    /**
     * Gets the value of the maximumConcurrentlyRegisteredIPStationsLOW property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumConcurrentlyRegisteredIPStationsLOW() {
        return maximumConcurrentlyRegisteredIPStationsLOW;
    }

    /**
     * Sets the value of the maximumConcurrentlyRegisteredIPStationsLOW property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumConcurrentlyRegisteredIPStationsLOW(String value) {
        this.maximumConcurrentlyRegisteredIPStationsLOW = value;
    }

    /**
     * Gets the value of the maximumConcurrentlyRegisteredIPStationsHIGH property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumConcurrentlyRegisteredIPStationsHIGH() {
        return maximumConcurrentlyRegisteredIPStationsHIGH;
    }

    /**
     * Sets the value of the maximumConcurrentlyRegisteredIPStationsHIGH property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumConcurrentlyRegisteredIPStationsHIGH(String value) {
        this.maximumConcurrentlyRegisteredIPStationsHIGH = value;
    }

    /**
     * Gets the value of the maximumAdministeredRemoteOfficeTrunks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumAdministeredRemoteOfficeTrunks() {
        return maximumAdministeredRemoteOfficeTrunks;
    }

    /**
     * Sets the value of the maximumAdministeredRemoteOfficeTrunks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumAdministeredRemoteOfficeTrunks(String value) {
        this.maximumAdministeredRemoteOfficeTrunks = value;
    }

    /**
     * Gets the value of the maximumAdministeredRemoteOfficeTrunksUSED property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumAdministeredRemoteOfficeTrunksUSED() {
        return maximumAdministeredRemoteOfficeTrunksUSED;
    }

    /**
     * Sets the value of the maximumAdministeredRemoteOfficeTrunksUSED property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumAdministeredRemoteOfficeTrunksUSED(String value) {
        this.maximumAdministeredRemoteOfficeTrunksUSED = value;
    }

    /**
     * Gets the value of the maximumAdministeredRemoteOfficeTrunksLOW property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumAdministeredRemoteOfficeTrunksLOW() {
        return maximumAdministeredRemoteOfficeTrunksLOW;
    }

    /**
     * Sets the value of the maximumAdministeredRemoteOfficeTrunksLOW property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumAdministeredRemoteOfficeTrunksLOW(String value) {
        this.maximumAdministeredRemoteOfficeTrunksLOW = value;
    }

    /**
     * Gets the value of the maximumAdministeredRemoteOfficeTrunksHIGH property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumAdministeredRemoteOfficeTrunksHIGH() {
        return maximumAdministeredRemoteOfficeTrunksHIGH;
    }

    /**
     * Sets the value of the maximumAdministeredRemoteOfficeTrunksHIGH property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumAdministeredRemoteOfficeTrunksHIGH(String value) {
        this.maximumAdministeredRemoteOfficeTrunksHIGH = value;
    }

    /**
     * Gets the value of the maximumConcurrentlyRegisteredRemoteOfficeStations property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumConcurrentlyRegisteredRemoteOfficeStations() {
        return maximumConcurrentlyRegisteredRemoteOfficeStations;
    }

    /**
     * Sets the value of the maximumConcurrentlyRegisteredRemoteOfficeStations property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumConcurrentlyRegisteredRemoteOfficeStations(String value) {
        this.maximumConcurrentlyRegisteredRemoteOfficeStations = value;
    }

    /**
     * Gets the value of the maximumConcurrentlyRegisteredRemoteOfficeStationsUSED property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumConcurrentlyRegisteredRemoteOfficeStationsUSED() {
        return maximumConcurrentlyRegisteredRemoteOfficeStationsUSED;
    }

    /**
     * Sets the value of the maximumConcurrentlyRegisteredRemoteOfficeStationsUSED property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumConcurrentlyRegisteredRemoteOfficeStationsUSED(String value) {
        this.maximumConcurrentlyRegisteredRemoteOfficeStationsUSED = value;
    }

    /**
     * Gets the value of the maximumConcurrentlyRegisteredRemoteOfficeStationsLOW property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumConcurrentlyRegisteredRemoteOfficeStationsLOW() {
        return maximumConcurrentlyRegisteredRemoteOfficeStationsLOW;
    }

    /**
     * Sets the value of the maximumConcurrentlyRegisteredRemoteOfficeStationsLOW property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumConcurrentlyRegisteredRemoteOfficeStationsLOW(String value) {
        this.maximumConcurrentlyRegisteredRemoteOfficeStationsLOW = value;
    }

    /**
     * Gets the value of the maximumConcurrentlyRegisteredRemoteOfficeStationsHIGH property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumConcurrentlyRegisteredRemoteOfficeStationsHIGH() {
        return maximumConcurrentlyRegisteredRemoteOfficeStationsHIGH;
    }

    /**
     * Sets the value of the maximumConcurrentlyRegisteredRemoteOfficeStationsHIGH property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumConcurrentlyRegisteredRemoteOfficeStationsHIGH(String value) {
        this.maximumConcurrentlyRegisteredRemoteOfficeStationsHIGH = value;
    }

    /**
     * Gets the value of the maximumConcurrentlyRegisteredIPECons property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumConcurrentlyRegisteredIPECons() {
        return maximumConcurrentlyRegisteredIPECons;
    }

    /**
     * Sets the value of the maximumConcurrentlyRegisteredIPECons property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumConcurrentlyRegisteredIPECons(String value) {
        this.maximumConcurrentlyRegisteredIPECons = value;
    }

    /**
     * Gets the value of the maximumConcurrentlyRegisteredIPEConsUSED property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumConcurrentlyRegisteredIPEConsUSED() {
        return maximumConcurrentlyRegisteredIPEConsUSED;
    }

    /**
     * Sets the value of the maximumConcurrentlyRegisteredIPEConsUSED property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumConcurrentlyRegisteredIPEConsUSED(String value) {
        this.maximumConcurrentlyRegisteredIPEConsUSED = value;
    }

    /**
     * Gets the value of the maximumConcurrentlyRegisteredIPEConsLOW property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumConcurrentlyRegisteredIPEConsLOW() {
        return maximumConcurrentlyRegisteredIPEConsLOW;
    }

    /**
     * Sets the value of the maximumConcurrentlyRegisteredIPEConsLOW property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumConcurrentlyRegisteredIPEConsLOW(String value) {
        this.maximumConcurrentlyRegisteredIPEConsLOW = value;
    }

    /**
     * Gets the value of the maximumConcurrentlyRegisteredIPEConsHIGH property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumConcurrentlyRegisteredIPEConsHIGH() {
        return maximumConcurrentlyRegisteredIPEConsHIGH;
    }

    /**
     * Sets the value of the maximumConcurrentlyRegisteredIPEConsHIGH property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumConcurrentlyRegisteredIPEConsHIGH(String value) {
        this.maximumConcurrentlyRegisteredIPEConsHIGH = value;
    }

    /**
     * Gets the value of the maxConcurRegisteredUnauthenticatedH323Stations property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxConcurRegisteredUnauthenticatedH323Stations() {
        return maxConcurRegisteredUnauthenticatedH323Stations;
    }

    /**
     * Sets the value of the maxConcurRegisteredUnauthenticatedH323Stations property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxConcurRegisteredUnauthenticatedH323Stations(String value) {
        this.maxConcurRegisteredUnauthenticatedH323Stations = value;
    }

    /**
     * Gets the value of the maxConcurRegisteredUnauthenticatedH323StationsUSED property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxConcurRegisteredUnauthenticatedH323StationsUSED() {
        return maxConcurRegisteredUnauthenticatedH323StationsUSED;
    }

    /**
     * Sets the value of the maxConcurRegisteredUnauthenticatedH323StationsUSED property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxConcurRegisteredUnauthenticatedH323StationsUSED(String value) {
        this.maxConcurRegisteredUnauthenticatedH323StationsUSED = value;
    }

    /**
     * Gets the value of the maxConcurRegisteredUnauthenticatedH323StationsLOW property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxConcurRegisteredUnauthenticatedH323StationsLOW() {
        return maxConcurRegisteredUnauthenticatedH323StationsLOW;
    }

    /**
     * Sets the value of the maxConcurRegisteredUnauthenticatedH323StationsLOW property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxConcurRegisteredUnauthenticatedH323StationsLOW(String value) {
        this.maxConcurRegisteredUnauthenticatedH323StationsLOW = value;
    }

    /**
     * Gets the value of the maxConcurRegisteredUnauthenticatedH323StationsHIGH property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxConcurRegisteredUnauthenticatedH323StationsHIGH() {
        return maxConcurRegisteredUnauthenticatedH323StationsHIGH;
    }

    /**
     * Sets the value of the maxConcurRegisteredUnauthenticatedH323StationsHIGH property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxConcurRegisteredUnauthenticatedH323StationsHIGH(String value) {
        this.maxConcurRegisteredUnauthenticatedH323StationsHIGH = value;
    }

    /**
     * Gets the value of the maximumVideoCapableH323Stations property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumVideoCapableH323Stations() {
        return maximumVideoCapableH323Stations;
    }

    /**
     * Sets the value of the maximumVideoCapableH323Stations property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumVideoCapableH323Stations(String value) {
        this.maximumVideoCapableH323Stations = value;
    }

    /**
     * Gets the value of the maximumVideoCapableH323StationsUSED property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumVideoCapableH323StationsUSED() {
        return maximumVideoCapableH323StationsUSED;
    }

    /**
     * Sets the value of the maximumVideoCapableH323StationsUSED property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumVideoCapableH323StationsUSED(String value) {
        this.maximumVideoCapableH323StationsUSED = value;
    }

    /**
     * Gets the value of the maximumVideoCapableH323StationsLOW property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumVideoCapableH323StationsLOW() {
        return maximumVideoCapableH323StationsLOW;
    }

    /**
     * Sets the value of the maximumVideoCapableH323StationsLOW property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumVideoCapableH323StationsLOW(String value) {
        this.maximumVideoCapableH323StationsLOW = value;
    }

    /**
     * Gets the value of the maximumVideoCapableH323StationsHIGH property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumVideoCapableH323StationsHIGH() {
        return maximumVideoCapableH323StationsHIGH;
    }

    /**
     * Sets the value of the maximumVideoCapableH323StationsHIGH property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumVideoCapableH323StationsHIGH(String value) {
        this.maximumVideoCapableH323StationsHIGH = value;
    }

    /**
     * Gets the value of the maximumVideoCapableIPSoftphones property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumVideoCapableIPSoftphones() {
        return maximumVideoCapableIPSoftphones;
    }

    /**
     * Sets the value of the maximumVideoCapableIPSoftphones property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumVideoCapableIPSoftphones(String value) {
        this.maximumVideoCapableIPSoftphones = value;
    }

    /**
     * Gets the value of the maximumVideoCapableIPSoftphonesUSED property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumVideoCapableIPSoftphonesUSED() {
        return maximumVideoCapableIPSoftphonesUSED;
    }

    /**
     * Sets the value of the maximumVideoCapableIPSoftphonesUSED property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumVideoCapableIPSoftphonesUSED(String value) {
        this.maximumVideoCapableIPSoftphonesUSED = value;
    }

    /**
     * Gets the value of the maximumVideoCapableIPSoftphonesLOW property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumVideoCapableIPSoftphonesLOW() {
        return maximumVideoCapableIPSoftphonesLOW;
    }

    /**
     * Sets the value of the maximumVideoCapableIPSoftphonesLOW property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumVideoCapableIPSoftphonesLOW(String value) {
        this.maximumVideoCapableIPSoftphonesLOW = value;
    }

    /**
     * Gets the value of the maximumVideoCapableIPSoftphonesHIGH property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumVideoCapableIPSoftphonesHIGH() {
        return maximumVideoCapableIPSoftphonesHIGH;
    }

    /**
     * Sets the value of the maximumVideoCapableIPSoftphonesHIGH property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumVideoCapableIPSoftphonesHIGH(String value) {
        this.maximumVideoCapableIPSoftphonesHIGH = value;
    }

    /**
     * Gets the value of the maximumAdministeredSIPTrunks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumAdministeredSIPTrunks() {
        return maximumAdministeredSIPTrunks;
    }

    /**
     * Sets the value of the maximumAdministeredSIPTrunks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumAdministeredSIPTrunks(String value) {
        this.maximumAdministeredSIPTrunks = value;
    }

    /**
     * Gets the value of the maximumAdministeredSIPTrunksUSED property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumAdministeredSIPTrunksUSED() {
        return maximumAdministeredSIPTrunksUSED;
    }

    /**
     * Sets the value of the maximumAdministeredSIPTrunksUSED property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumAdministeredSIPTrunksUSED(String value) {
        this.maximumAdministeredSIPTrunksUSED = value;
    }

    /**
     * Gets the value of the maximumAdministeredSIPTrunksLOW property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumAdministeredSIPTrunksLOW() {
        return maximumAdministeredSIPTrunksLOW;
    }

    /**
     * Sets the value of the maximumAdministeredSIPTrunksLOW property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumAdministeredSIPTrunksLOW(String value) {
        this.maximumAdministeredSIPTrunksLOW = value;
    }

    /**
     * Gets the value of the maximumAdministeredSIPTrunksHIGH property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumAdministeredSIPTrunksHIGH() {
        return maximumAdministeredSIPTrunksHIGH;
    }

    /**
     * Sets the value of the maximumAdministeredSIPTrunksHIGH property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumAdministeredSIPTrunksHIGH(String value) {
        this.maximumAdministeredSIPTrunksHIGH = value;
    }

    /**
     * Gets the value of the maximumNumberOfDS1BoardsWithEchoCancellation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumNumberOfDS1BoardsWithEchoCancellation() {
        return maximumNumberOfDS1BoardsWithEchoCancellation;
    }

    /**
     * Sets the value of the maximumNumberOfDS1BoardsWithEchoCancellation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumNumberOfDS1BoardsWithEchoCancellation(String value) {
        this.maximumNumberOfDS1BoardsWithEchoCancellation = value;
    }

    /**
     * Gets the value of the maximumNumberOfDS1BoardsWithEchoCancellationUSED property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumNumberOfDS1BoardsWithEchoCancellationUSED() {
        return maximumNumberOfDS1BoardsWithEchoCancellationUSED;
    }

    /**
     * Sets the value of the maximumNumberOfDS1BoardsWithEchoCancellationUSED property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumNumberOfDS1BoardsWithEchoCancellationUSED(String value) {
        this.maximumNumberOfDS1BoardsWithEchoCancellationUSED = value;
    }

    /**
     * Gets the value of the maximumNumberOfDS1BoardsWithEchoCancellationLOW property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumNumberOfDS1BoardsWithEchoCancellationLOW() {
        return maximumNumberOfDS1BoardsWithEchoCancellationLOW;
    }

    /**
     * Sets the value of the maximumNumberOfDS1BoardsWithEchoCancellationLOW property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumNumberOfDS1BoardsWithEchoCancellationLOW(String value) {
        this.maximumNumberOfDS1BoardsWithEchoCancellationLOW = value;
    }

    /**
     * Gets the value of the maximumNumberOfDS1BoardsWithEchoCancellationHIGH property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumNumberOfDS1BoardsWithEchoCancellationHIGH() {
        return maximumNumberOfDS1BoardsWithEchoCancellationHIGH;
    }

    /**
     * Sets the value of the maximumNumberOfDS1BoardsWithEchoCancellationHIGH property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumNumberOfDS1BoardsWithEchoCancellationHIGH(String value) {
        this.maximumNumberOfDS1BoardsWithEchoCancellationHIGH = value;
    }

    /**
     * Gets the value of the maximumTN2501VALBoards property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumTN2501VALBoards() {
        return maximumTN2501VALBoards;
    }

    /**
     * Sets the value of the maximumTN2501VALBoards property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumTN2501VALBoards(String value) {
        this.maximumTN2501VALBoards = value;
    }

    /**
     * Gets the value of the maximumTN2501VALBoardsUSED property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumTN2501VALBoardsUSED() {
        return maximumTN2501VALBoardsUSED;
    }

    /**
     * Sets the value of the maximumTN2501VALBoardsUSED property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumTN2501VALBoardsUSED(String value) {
        this.maximumTN2501VALBoardsUSED = value;
    }

    /**
     * Gets the value of the maximumTN2501VALBoardsLOW property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumTN2501VALBoardsLOW() {
        return maximumTN2501VALBoardsLOW;
    }

    /**
     * Sets the value of the maximumTN2501VALBoardsLOW property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumTN2501VALBoardsLOW(String value) {
        this.maximumTN2501VALBoardsLOW = value;
    }

    /**
     * Gets the value of the maximumTN2501VALBoardsHIGH property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumTN2501VALBoardsHIGH() {
        return maximumTN2501VALBoardsHIGH;
    }

    /**
     * Sets the value of the maximumTN2501VALBoardsHIGH property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumTN2501VALBoardsHIGH(String value) {
        this.maximumTN2501VALBoardsHIGH = value;
    }

    /**
     * Gets the value of the maximumG250G350G700VALSources property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumG250G350G700VALSources() {
        return maximumG250G350G700VALSources;
    }

    /**
     * Sets the value of the maximumG250G350G700VALSources property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumG250G350G700VALSources(String value) {
        this.maximumG250G350G700VALSources = value;
    }

    /**
     * Gets the value of the maximumG250G350G700VALSourcesUSED property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumG250G350G700VALSourcesUSED() {
        return maximumG250G350G700VALSourcesUSED;
    }

    /**
     * Sets the value of the maximumG250G350G700VALSourcesUSED property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumG250G350G700VALSourcesUSED(String value) {
        this.maximumG250G350G700VALSourcesUSED = value;
    }

    /**
     * Gets the value of the maximumG250G350G700VALSourcesLOW property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumG250G350G700VALSourcesLOW() {
        return maximumG250G350G700VALSourcesLOW;
    }

    /**
     * Sets the value of the maximumG250G350G700VALSourcesLOW property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumG250G350G700VALSourcesLOW(String value) {
        this.maximumG250G350G700VALSourcesLOW = value;
    }

    /**
     * Gets the value of the maximumG250G350G700VALSourcesHIGH property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumG250G350G700VALSourcesHIGH() {
        return maximumG250G350G700VALSourcesHIGH;
    }

    /**
     * Sets the value of the maximumG250G350G700VALSourcesHIGH property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumG250G350G700VALSourcesHIGH(String value) {
        this.maximumG250G350G700VALSourcesHIGH = value;
    }

    /**
     * Gets the value of the maximumTN2602BoardsWith80VoIPChannels property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumTN2602BoardsWith80VoIPChannels() {
        return maximumTN2602BoardsWith80VoIPChannels;
    }

    /**
     * Sets the value of the maximumTN2602BoardsWith80VoIPChannels property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumTN2602BoardsWith80VoIPChannels(String value) {
        this.maximumTN2602BoardsWith80VoIPChannels = value;
    }

    /**
     * Gets the value of the maximumTN2602BoardsWith80VoIPChannelsUSED property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumTN2602BoardsWith80VoIPChannelsUSED() {
        return maximumTN2602BoardsWith80VoIPChannelsUSED;
    }

    /**
     * Sets the value of the maximumTN2602BoardsWith80VoIPChannelsUSED property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumTN2602BoardsWith80VoIPChannelsUSED(String value) {
        this.maximumTN2602BoardsWith80VoIPChannelsUSED = value;
    }

    /**
     * Gets the value of the maximumTN2602BoardsWith80VoIPChannelsLOW property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumTN2602BoardsWith80VoIPChannelsLOW() {
        return maximumTN2602BoardsWith80VoIPChannelsLOW;
    }

    /**
     * Sets the value of the maximumTN2602BoardsWith80VoIPChannelsLOW property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumTN2602BoardsWith80VoIPChannelsLOW(String value) {
        this.maximumTN2602BoardsWith80VoIPChannelsLOW = value;
    }

    /**
     * Gets the value of the maximumTN2602BoardsWith80VoIPChannelsHIGH property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumTN2602BoardsWith80VoIPChannelsHIGH() {
        return maximumTN2602BoardsWith80VoIPChannelsHIGH;
    }

    /**
     * Sets the value of the maximumTN2602BoardsWith80VoIPChannelsHIGH property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumTN2602BoardsWith80VoIPChannelsHIGH(String value) {
        this.maximumTN2602BoardsWith80VoIPChannelsHIGH = value;
    }

    /**
     * Gets the value of the maximumTN2602BoardsWith320VoIPChannels property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumTN2602BoardsWith320VoIPChannels() {
        return maximumTN2602BoardsWith320VoIPChannels;
    }

    /**
     * Sets the value of the maximumTN2602BoardsWith320VoIPChannels property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumTN2602BoardsWith320VoIPChannels(String value) {
        this.maximumTN2602BoardsWith320VoIPChannels = value;
    }

    /**
     * Gets the value of the maximumTN2602BoardsWith320VoIPChannelsUSED property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumTN2602BoardsWith320VoIPChannelsUSED() {
        return maximumTN2602BoardsWith320VoIPChannelsUSED;
    }

    /**
     * Sets the value of the maximumTN2602BoardsWith320VoIPChannelsUSED property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumTN2602BoardsWith320VoIPChannelsUSED(String value) {
        this.maximumTN2602BoardsWith320VoIPChannelsUSED = value;
    }

    /**
     * Gets the value of the maximumTN2602BoardsWith320VoIPChannelsLOW property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumTN2602BoardsWith320VoIPChannelsLOW() {
        return maximumTN2602BoardsWith320VoIPChannelsLOW;
    }

    /**
     * Sets the value of the maximumTN2602BoardsWith320VoIPChannelsLOW property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumTN2602BoardsWith320VoIPChannelsLOW(String value) {
        this.maximumTN2602BoardsWith320VoIPChannelsLOW = value;
    }

    /**
     * Gets the value of the maximumTN2602BoardsWith320VoIPChannelsHIGH property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumTN2602BoardsWith320VoIPChannelsHIGH() {
        return maximumTN2602BoardsWith320VoIPChannelsHIGH;
    }

    /**
     * Sets the value of the maximumTN2602BoardsWith320VoIPChannelsHIGH property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumTN2602BoardsWith320VoIPChannelsHIGH(String value) {
        this.maximumTN2602BoardsWith320VoIPChannelsHIGH = value;
    }

    /**
     * Gets the value of the maximumNumberOfExpandedMeetMeConferencePorts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumNumberOfExpandedMeetMeConferencePorts() {
        return maximumNumberOfExpandedMeetMeConferencePorts;
    }

    /**
     * Sets the value of the maximumNumberOfExpandedMeetMeConferencePorts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumNumberOfExpandedMeetMeConferencePorts(String value) {
        this.maximumNumberOfExpandedMeetMeConferencePorts = value;
    }

    /**
     * Gets the value of the maximumNumberOfExpandedMeetMeConferencePortsUSED property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumNumberOfExpandedMeetMeConferencePortsUSED() {
        return maximumNumberOfExpandedMeetMeConferencePortsUSED;
    }

    /**
     * Sets the value of the maximumNumberOfExpandedMeetMeConferencePortsUSED property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumNumberOfExpandedMeetMeConferencePortsUSED(String value) {
        this.maximumNumberOfExpandedMeetMeConferencePortsUSED = value;
    }

    /**
     * Gets the value of the maximumNumberOfExpandedMeetMeConferencePortsLOW property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumNumberOfExpandedMeetMeConferencePortsLOW() {
        return maximumNumberOfExpandedMeetMeConferencePortsLOW;
    }

    /**
     * Sets the value of the maximumNumberOfExpandedMeetMeConferencePortsLOW property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumNumberOfExpandedMeetMeConferencePortsLOW(String value) {
        this.maximumNumberOfExpandedMeetMeConferencePortsLOW = value;
    }

    /**
     * Gets the value of the maximumNumberOfExpandedMeetMeConferencePortsHIGH property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumNumberOfExpandedMeetMeConferencePortsHIGH() {
        return maximumNumberOfExpandedMeetMeConferencePortsHIGH;
    }

    /**
     * Sets the value of the maximumNumberOfExpandedMeetMeConferencePortsHIGH property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumNumberOfExpandedMeetMeConferencePortsHIGH(String value) {
        this.maximumNumberOfExpandedMeetMeConferencePortsHIGH = value;
    }

    /**
     * Gets the value of the abbreviatedDialingEnhancedList property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbbreviatedDialingEnhancedList() {
        return abbreviatedDialingEnhancedList;
    }

    /**
     * Sets the value of the abbreviatedDialingEnhancedList property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbbreviatedDialingEnhancedList(String value) {
        this.abbreviatedDialingEnhancedList = value;
    }

    /**
     * Gets the value of the accessSecurityGatewayASG property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessSecurityGatewayASG() {
        return accessSecurityGatewayASG;
    }

    /**
     * Sets the value of the accessSecurityGatewayASG property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessSecurityGatewayASG(String value) {
        this.accessSecurityGatewayASG = value;
    }

    /**
     * Gets the value of the analogTrunkIncomingCallID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnalogTrunkIncomingCallID() {
        return analogTrunkIncomingCallID;
    }

    /**
     * Sets the value of the analogTrunkIncomingCallID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnalogTrunkIncomingCallID(String value) {
        this.analogTrunkIncomingCallID = value;
    }

    /**
     * Gets the value of the adGrpSysListDialingStartAt01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADGrpSysListDialingStartAt01() {
        return adGrpSysListDialingStartAt01;
    }

    /**
     * Sets the value of the adGrpSysListDialingStartAt01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADGrpSysListDialingStartAt01(String value) {
        this.adGrpSysListDialingStartAt01 = value;
    }

    /**
     * Gets the value of the answerSupervisionByCallClassifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnswerSupervisionByCallClassifier() {
        return answerSupervisionByCallClassifier;
    }

    /**
     * Sets the value of the answerSupervisionByCallClassifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnswerSupervisionByCallClassifier(String value) {
        this.answerSupervisionByCallClassifier = value;
    }

    /**
     * Gets the value of the ars property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getARS() {
        return ars;
    }

    /**
     * Sets the value of the ars property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setARS(String value) {
        this.ars = value;
    }

    /**
     * Gets the value of the arsaarPartitioning property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getARSAARPartitioning() {
        return arsaarPartitioning;
    }

    /**
     * Sets the value of the arsaarPartitioning property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setARSAARPartitioning(String value) {
        this.arsaarPartitioning = value;
    }

    /**
     * Gets the value of the arsaarDialingWithoutFAC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getARSAARDialingWithoutFAC() {
        return arsaarDialingWithoutFAC;
    }

    /**
     * Sets the value of the arsaarDialingWithoutFAC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setARSAARDialingWithoutFAC(String value) {
        this.arsaarDialingWithoutFAC = value;
    }

    /**
     * Gets the value of the asaiInterface property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getASAIInterface() {
        return asaiInterface;
    }

    /**
     * Sets the value of the asaiInterface property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setASAIInterface(String value) {
        this.asaiInterface = value;
    }

    /**
     * Gets the value of the asaiLinkCoreCapabilities property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getASAILinkCoreCapabilities() {
        return asaiLinkCoreCapabilities;
    }

    /**
     * Sets the value of the asaiLinkCoreCapabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setASAILinkCoreCapabilities(String value) {
        this.asaiLinkCoreCapabilities = value;
    }

    /**
     * Gets the value of the asaiProprietaryAdjunctLinks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getASAIProprietaryAdjunctLinks() {
        return asaiProprietaryAdjunctLinks;
    }

    /**
     * Sets the value of the asaiProprietaryAdjunctLinks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setASAIProprietaryAdjunctLinks(String value) {
        this.asaiProprietaryAdjunctLinks = value;
    }

    /**
     * Gets the value of the asaiLinkPlusCapabilities property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getASAILinkPlusCapabilities() {
        return asaiLinkPlusCapabilities;
    }

    /**
     * Sets the value of the asaiLinkPlusCapabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setASAILinkPlusCapabilities(String value) {
        this.asaiLinkPlusCapabilities = value;
    }

    /**
     * Gets the value of the asyncTransferModeATMPNC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsyncTransferModeATMPNC() {
        return asyncTransferModeATMPNC;
    }

    /**
     * Sets the value of the asyncTransferModeATMPNC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsyncTransferModeATMPNC(String value) {
        this.asyncTransferModeATMPNC = value;
    }

    /**
     * Gets the value of the asyncTransferModeATMTrunking property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsyncTransferModeATMTrunking() {
        return asyncTransferModeATMTrunking;
    }

    /**
     * Sets the value of the asyncTransferModeATMTrunking property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsyncTransferModeATMTrunking(String value) {
        this.asyncTransferModeATMTrunking = value;
    }

    /**
     * Gets the value of the atmwanSpareProcessor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getATMWANSpareProcessor() {
        return atmwanSpareProcessor;
    }

    /**
     * Sets the value of the atmwanSpareProcessor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setATMWANSpareProcessor(String value) {
        this.atmwanSpareProcessor = value;
    }

    /**
     * Gets the value of the atms property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getATMS() {
        return atms;
    }

    /**
     * Sets the value of the atms property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setATMS(String value) {
        this.atms = value;
    }

    /**
     * Gets the value of the attendantVectoring property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttendantVectoring() {
        return attendantVectoring;
    }

    /**
     * Sets the value of the attendantVectoring property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttendantVectoring(String value) {
        this.attendantVectoring = value;
    }

    /**
     * Gets the value of the audibleMessageWaiting property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAudibleMessageWaiting() {
        return audibleMessageWaiting;
    }

    /**
     * Sets the value of the audibleMessageWaiting property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAudibleMessageWaiting(String value) {
        this.audibleMessageWaiting = value;
    }

    /**
     * Gets the value of the authorizationCodes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizationCodes() {
        return authorizationCodes;
    }

    /**
     * Sets the value of the authorizationCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizationCodes(String value) {
        this.authorizationCodes = value;
    }

    /**
     * Gets the value of the backupClusterAutomaticTakeover property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackupClusterAutomaticTakeover() {
        return backupClusterAutomaticTakeover;
    }

    /**
     * Sets the value of the backupClusterAutomaticTakeover property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackupClusterAutomaticTakeover(String value) {
        this.backupClusterAutomaticTakeover = value;
    }

    /**
     * Gets the value of the casBranch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCASBranch() {
        return casBranch;
    }

    /**
     * Sets the value of the casBranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCASBranch(String value) {
        this.casBranch = value;
    }

    /**
     * Gets the value of the casMain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCASMain() {
        return casMain;
    }

    /**
     * Sets the value of the casMain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCASMain(String value) {
        this.casMain = value;
    }

    /**
     * Gets the value of the changeCORByFAC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangeCORByFAC() {
        return changeCORByFAC;
    }

    /**
     * Sets the value of the changeCORByFAC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangeCORByFAC(String value) {
        this.changeCORByFAC = value;
    }

    /**
     * Gets the value of the computerTelephonyAdjunctLinks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComputerTelephonyAdjunctLinks() {
        return computerTelephonyAdjunctLinks;
    }

    /**
     * Sets the value of the computerTelephonyAdjunctLinks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComputerTelephonyAdjunctLinks(String value) {
        this.computerTelephonyAdjunctLinks = value;
    }

    /**
     * Gets the value of the cvgOfCallsRedirectedOffNet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCvgOfCallsRedirectedOffNet() {
        return cvgOfCallsRedirectedOffNet;
    }

    /**
     * Sets the value of the cvgOfCallsRedirectedOffNet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCvgOfCallsRedirectedOffNet(String value) {
        this.cvgOfCallsRedirectedOffNet = value;
    }

    /**
     * Gets the value of the dcsBasic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDCSBasic() {
        return dcsBasic;
    }

    /**
     * Sets the value of the dcsBasic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDCSBasic(String value) {
        this.dcsBasic = value;
    }

    /**
     * Gets the value of the dcsCallCoverage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDCSCallCoverage() {
        return dcsCallCoverage;
    }

    /**
     * Sets the value of the dcsCallCoverage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDCSCallCoverage(String value) {
        this.dcsCallCoverage = value;
    }

    /**
     * Gets the value of the dcsWithRerouting property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDCSWithRerouting() {
        return dcsWithRerouting;
    }

    /**
     * Sets the value of the dcsWithRerouting property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDCSWithRerouting(String value) {
        this.dcsWithRerouting = value;
    }

    /**
     * Gets the value of the dcsGlobal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDCSGlobal() {
        return dcsGlobal;
    }

    /**
     * Sets the value of the dcsGlobal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDCSGlobal(String value) {
        this.dcsGlobal = value;
    }

    /**
     * Gets the value of the digitalLossPlanModification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDigitalLossPlanModification() {
        return digitalLossPlanModification;
    }

    /**
     * Sets the value of the digitalLossPlanModification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDigitalLossPlanModification(String value) {
        this.digitalLossPlanModification = value;
    }

    /**
     * Gets the value of the ds1MSP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDS1MSP() {
        return ds1MSP;
    }

    /**
     * Sets the value of the ds1MSP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDS1MSP(String value) {
        this.ds1MSP = value;
    }

    /**
     * Gets the value of the ds1EchoCancellation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDS1EchoCancellation() {
        return ds1EchoCancellation;
    }

    /**
     * Sets the value of the ds1EchoCancellation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDS1EchoCancellation(String value) {
        this.ds1EchoCancellation = value;
    }

    /**
     * Gets the value of the emergencyAccessToAttendant property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmergencyAccessToAttendant() {
        return emergencyAccessToAttendant;
    }

    /**
     * Sets the value of the emergencyAccessToAttendant property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmergencyAccessToAttendant(String value) {
        this.emergencyAccessToAttendant = value;
    }

    /**
     * Gets the value of the enableDadminLogin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnableDadminLogin() {
        return enableDadminLogin;
    }

    /**
     * Sets the value of the enableDadminLogin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnableDadminLogin(String value) {
        this.enableDadminLogin = value;
    }

    /**
     * Gets the value of the enhancedConferencing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnhancedConferencing() {
        return enhancedConferencing;
    }

    /**
     * Sets the value of the enhancedConferencing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnhancedConferencing(String value) {
        this.enhancedConferencing = value;
    }

    /**
     * Gets the value of the enhancedEC500 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnhancedEC500() {
        return enhancedEC500;
    }

    /**
     * Sets the value of the enhancedEC500 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnhancedEC500(String value) {
        this.enhancedEC500 = value;
    }

    /**
     * Gets the value of the enterpriseSurvivableServer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnterpriseSurvivableServer() {
        return enterpriseSurvivableServer;
    }

    /**
     * Sets the value of the enterpriseSurvivableServer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnterpriseSurvivableServer(String value) {
        this.enterpriseSurvivableServer = value;
    }

    /**
     * Gets the value of the enterpriseWideLicensing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnterpriseWideLicensing() {
        return enterpriseWideLicensing;
    }

    /**
     * Sets the value of the enterpriseWideLicensing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnterpriseWideLicensing(String value) {
        this.enterpriseWideLicensing = value;
    }

    /**
     * Gets the value of the essAdministration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getESSAdministration() {
        return essAdministration;
    }

    /**
     * Sets the value of the essAdministration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setESSAdministration(String value) {
        this.essAdministration = value;
    }

    /**
     * Gets the value of the extendedCvgFwdAdmin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtendedCvgFwdAdmin() {
        return extendedCvgFwdAdmin;
    }

    /**
     * Sets the value of the extendedCvgFwdAdmin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtendedCvgFwdAdmin(String value) {
        this.extendedCvgFwdAdmin = value;
    }

    /**
     * Gets the value of the externalDeviceAlarmAdmin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalDeviceAlarmAdmin() {
        return externalDeviceAlarmAdmin;
    }

    /**
     * Sets the value of the externalDeviceAlarmAdmin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalDeviceAlarmAdmin(String value) {
        this.externalDeviceAlarmAdmin = value;
    }

    /**
     * Gets the value of the fivePortNetworksMaxPerMCC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFivePortNetworksMaxPerMCC() {
        return fivePortNetworksMaxPerMCC;
    }

    /**
     * Sets the value of the fivePortNetworksMaxPerMCC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFivePortNetworksMaxPerMCC(String value) {
        this.fivePortNetworksMaxPerMCC = value;
    }

    /**
     * Gets the value of the flexibleBilling property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlexibleBilling() {
        return flexibleBilling;
    }

    /**
     * Sets the value of the flexibleBilling property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlexibleBilling(String value) {
        this.flexibleBilling = value;
    }

    /**
     * Gets the value of the forcedEntryOfAccountCodes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForcedEntryOfAccountCodes() {
        return forcedEntryOfAccountCodes;
    }

    /**
     * Sets the value of the forcedEntryOfAccountCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForcedEntryOfAccountCodes(String value) {
        this.forcedEntryOfAccountCodes = value;
    }

    /**
     * Gets the value of the globalCallClassification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlobalCallClassification() {
        return globalCallClassification;
    }

    /**
     * Sets the value of the globalCallClassification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlobalCallClassification(String value) {
        this.globalCallClassification = value;
    }

    /**
     * Gets the value of the hospitalityBasic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHospitalityBasic() {
        return hospitalityBasic;
    }

    /**
     * Sets the value of the hospitalityBasic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHospitalityBasic(String value) {
        this.hospitalityBasic = value;
    }

    /**
     * Gets the value of the hospitalityG3V3Enhancements property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHospitalityG3V3Enhancements() {
        return hospitalityG3V3Enhancements;
    }

    /**
     * Sets the value of the hospitalityG3V3Enhancements property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHospitalityG3V3Enhancements(String value) {
        this.hospitalityG3V3Enhancements = value;
    }

    /**
     * Gets the value of the hospitalityParameterReduction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHospitalityParameterReduction() {
        return hospitalityParameterReduction;
    }

    /**
     * Sets the value of the hospitalityParameterReduction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHospitalityParameterReduction(String value) {
        this.hospitalityParameterReduction = value;
    }

    /**
     * Gets the value of the ipTrunks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPTrunks() {
        return ipTrunks;
    }

    /**
     * Sets the value of the ipTrunks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPTrunks(String value) {
        this.ipTrunks = value;
    }

    /**
     * Gets the value of the ipAttendantConsoles property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPAttendantConsoles() {
        return ipAttendantConsoles;
    }

    /**
     * Sets the value of the ipAttendantConsoles property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPAttendantConsoles(String value) {
        this.ipAttendantConsoles = value;
    }

    /**
     * Gets the value of the ipStations property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPStations() {
        return ipStations;
    }

    /**
     * Sets the value of the ipStations property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPStations(String value) {
        this.ipStations = value;
    }

    /**
     * Gets the value of the internetProtocolIPPNC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternetProtocolIPPNC() {
        return internetProtocolIPPNC;
    }

    /**
     * Sets the value of the internetProtocolIPPNC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternetProtocolIPPNC(String value) {
        this.internetProtocolIPPNC = value;
    }

    /**
     * Gets the value of the isdnFeaturePlus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISDNFeaturePlus() {
        return isdnFeaturePlus;
    }

    /**
     * Sets the value of the isdnFeaturePlus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISDNFeaturePlus(String value) {
        this.isdnFeaturePlus = value;
    }

    /**
     * Gets the value of the isdnNetworkCallRedirection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISDNNetworkCallRedirection() {
        return isdnNetworkCallRedirection;
    }

    /**
     * Sets the value of the isdnNetworkCallRedirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISDNNetworkCallRedirection(String value) {
        this.isdnNetworkCallRedirection = value;
    }

    /**
     * Gets the value of the isdnbriTrunks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISDNBRITrunks() {
        return isdnbriTrunks;
    }

    /**
     * Sets the value of the isdnbriTrunks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISDNBRITrunks(String value) {
        this.isdnbriTrunks = value;
    }

    /**
     * Gets the value of the isdnpri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISDNPRI() {
        return isdnpri;
    }

    /**
     * Sets the value of the isdnpri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISDNPRI(String value) {
        this.isdnpri = value;
    }

    /**
     * Gets the value of the localSurvivableProcessor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalSurvivableProcessor() {
        return localSurvivableProcessor;
    }

    /**
     * Sets the value of the localSurvivableProcessor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalSurvivableProcessor(String value) {
        this.localSurvivableProcessor = value;
    }

    /**
     * Gets the value of the maliciousCallTrace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaliciousCallTrace() {
        return maliciousCallTrace;
    }

    /**
     * Sets the value of the maliciousCallTrace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaliciousCallTrace(String value) {
        this.maliciousCallTrace = value;
    }

    /**
     * Gets the value of the mediaEncryptionOverIP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaEncryptionOverIP() {
        return mediaEncryptionOverIP;
    }

    /**
     * Sets the value of the mediaEncryptionOverIP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaEncryptionOverIP(String value) {
        this.mediaEncryptionOverIP = value;
    }

    /**
     * Gets the value of the modeCodeForCentralizedVoiceMail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModeCodeForCentralizedVoiceMail() {
        return modeCodeForCentralizedVoiceMail;
    }

    /**
     * Sets the value of the modeCodeForCentralizedVoiceMail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModeCodeForCentralizedVoiceMail(String value) {
        this.modeCodeForCentralizedVoiceMail = value;
    }

    /**
     * Gets the value of the modeCodeInterface property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModeCodeInterface() {
        return modeCodeInterface;
    }

    /**
     * Sets the value of the modeCodeInterface property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModeCodeInterface(String value) {
        this.modeCodeInterface = value;
    }

    /**
     * Gets the value of the multifrequencySignaling property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMultifrequencySignaling() {
        return multifrequencySignaling;
    }

    /**
     * Sets the value of the multifrequencySignaling property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMultifrequencySignaling(String value) {
        this.multifrequencySignaling = value;
    }

    /**
     * Gets the value of the multimediaApplServerInterfaceMASI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMultimediaApplServerInterfaceMASI() {
        return multimediaApplServerInterfaceMASI;
    }

    /**
     * Sets the value of the multimediaApplServerInterfaceMASI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMultimediaApplServerInterfaceMASI(String value) {
        this.multimediaApplServerInterfaceMASI = value;
    }

    /**
     * Gets the value of the multimediaCallHandlingBasic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMultimediaCallHandlingBasic() {
        return multimediaCallHandlingBasic;
    }

    /**
     * Sets the value of the multimediaCallHandlingBasic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMultimediaCallHandlingBasic(String value) {
        this.multimediaCallHandlingBasic = value;
    }

    /**
     * Gets the value of the multimediaCallHandlingEnhanced property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMultimediaCallHandlingEnhanced() {
        return multimediaCallHandlingEnhanced;
    }

    /**
     * Sets the value of the multimediaCallHandlingEnhanced property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMultimediaCallHandlingEnhanced(String value) {
        this.multimediaCallHandlingEnhanced = value;
    }

    /**
     * Gets the value of the multimediaIPSIPTrunking property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMultimediaIPSIPTrunking() {
        return multimediaIPSIPTrunking;
    }

    /**
     * Sets the value of the multimediaIPSIPTrunking property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMultimediaIPSIPTrunking(String value) {
        this.multimediaIPSIPTrunking = value;
    }

    /**
     * Gets the value of the multinationalLocations property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMultinationalLocations() {
        return multinationalLocations;
    }

    /**
     * Sets the value of the multinationalLocations property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMultinationalLocations(String value) {
        this.multinationalLocations = value;
    }

    /**
     * Gets the value of the multipleLevelPrecedenceAndPreemption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMultipleLevelPrecedenceAndPreemption() {
        return multipleLevelPrecedenceAndPreemption;
    }

    /**
     * Sets the value of the multipleLevelPrecedenceAndPreemption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMultipleLevelPrecedenceAndPreemption(String value) {
        this.multipleLevelPrecedenceAndPreemption = value;
    }

    /**
     * Gets the value of the multipleLocations property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMultipleLocations() {
        return multipleLocations;
    }

    /**
     * Sets the value of the multipleLocations property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMultipleLocations(String value) {
        this.multipleLocations = value;
    }

    /**
     * Gets the value of the personalStationAccess property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalStationAccess() {
        return personalStationAccess;
    }

    /**
     * Sets the value of the personalStationAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalStationAccess(String value) {
        this.personalStationAccess = value;
    }

    /**
     * Gets the value of the noLicenseModeDisabled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoLicenseModeDisabled() {
        return noLicenseModeDisabled;
    }

    /**
     * Sets the value of the noLicenseModeDisabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoLicenseModeDisabled(String value) {
        this.noLicenseModeDisabled = value;
    }

    /**
     * Gets the value of the postedMessages property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostedMessages() {
        return postedMessages;
    }

    /**
     * Sets the value of the postedMessages property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostedMessages(String value) {
        this.postedMessages = value;
    }

    /**
     * Gets the value of the pncDuplication property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPNCDuplication() {
        return pncDuplication;
    }

    /**
     * Sets the value of the pncDuplication property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPNCDuplication(String value) {
        this.pncDuplication = value;
    }

    /**
     * Gets the value of the portNetworkSupport property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortNetworkSupport() {
        return portNetworkSupport;
    }

    /**
     * Sets the value of the portNetworkSupport property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortNetworkSupport(String value) {
        this.portNetworkSupport = value;
    }

    /**
     * Gets the value of the premierBusinessPackage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPremierBusinessPackage() {
        return premierBusinessPackage;
    }

    /**
     * Sets the value of the premierBusinessPackage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPremierBusinessPackage(String value) {
        this.premierBusinessPackage = value;
    }

    /**
     * Gets the value of the processorAndSystemMSP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessorAndSystemMSP() {
        return processorAndSystemMSP;
    }

    /**
     * Sets the value of the processorAndSystemMSP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessorAndSystemMSP(String value) {
        this.processorAndSystemMSP = value;
    }

    /**
     * Gets the value of the privateNetworking property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrivateNetworking() {
        return privateNetworking;
    }

    /**
     * Sets the value of the privateNetworking property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrivateNetworking(String value) {
        this.privateNetworking = value;
    }

    /**
     * Gets the value of the processorEthernet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessorEthernet() {
        return processorEthernet;
    }

    /**
     * Sets the value of the processorEthernet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessorEthernet(String value) {
        this.processorEthernet = value;
    }

    /**
     * Gets the value of the r95Capabilities property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getR95Capabilities() {
        return r95Capabilities;
    }

    /**
     * Sets the value of the r95Capabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setR95Capabilities(String value) {
        this.r95Capabilities = value;
    }

    /**
     * Gets the value of the remoteOffice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteOffice() {
        return remoteOffice;
    }

    /**
     * Sets the value of the remoteOffice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteOffice(String value) {
        this.remoteOffice = value;
    }

    /**
     * Gets the value of the restrictCallForwardOffNet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRestrictCallForwardOffNet() {
        return restrictCallForwardOffNet;
    }

    /**
     * Sets the value of the restrictCallForwardOffNet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRestrictCallForwardOffNet(String value) {
        this.restrictCallForwardOffNet = value;
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
     * Gets the value of the stationAndTrunkMSP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStationAndTrunkMSP() {
        return stationAndTrunkMSP;
    }

    /**
     * Sets the value of the stationAndTrunkMSP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStationAndTrunkMSP(String value) {
        this.stationAndTrunkMSP = value;
    }

    /**
     * Gets the value of the stationAsVirtualExtension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStationAsVirtualExtension() {
        return stationAsVirtualExtension;
    }

    /**
     * Sets the value of the stationAsVirtualExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStationAsVirtualExtension(String value) {
        this.stationAsVirtualExtension = value;
    }

    /**
     * Gets the value of the systemManagementDataTransfer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemManagementDataTransfer() {
        return systemManagementDataTransfer;
    }

    /**
     * Sets the value of the systemManagementDataTransfer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemManagementDataTransfer(String value) {
        this.systemManagementDataTransfer = value;
    }

    /**
     * Gets the value of the tenantPartitioning property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTenantPartitioning() {
        return tenantPartitioning;
    }

    /**
     * Sets the value of the tenantPartitioning property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTenantPartitioning(String value) {
        this.tenantPartitioning = value;
    }

    /**
     * Gets the value of the terminalTransInitTTI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminalTransInitTTI() {
        return terminalTransInitTTI;
    }

    /**
     * Sets the value of the terminalTransInitTTI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminalTransInitTTI(String value) {
        this.terminalTransInitTTI = value;
    }

    /**
     * Gets the value of the timeOfDayRouting property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeOfDayRouting() {
        return timeOfDayRouting;
    }

    /**
     * Sets the value of the timeOfDayRouting property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeOfDayRouting(String value) {
        this.timeOfDayRouting = value;
    }

    /**
     * Gets the value of the uniformDialingPlan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniformDialingPlan() {
        return uniformDialingPlan;
    }

    /**
     * Sets the value of the uniformDialingPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniformDialingPlan(String value) {
        this.uniformDialingPlan = value;
    }

    /**
     * Gets the value of the usageAllocationEnhancements property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsageAllocationEnhancements() {
        return usageAllocationEnhancements;
    }

    /**
     * Sets the value of the usageAllocationEnhancements property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsageAllocationEnhancements(String value) {
        this.usageAllocationEnhancements = value;
    }

    /**
     * Gets the value of the tn2501VALMaximumCapacity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTN2501VALMaximumCapacity() {
        return tn2501VALMaximumCapacity;
    }

    /**
     * Sets the value of the tn2501VALMaximumCapacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTN2501VALMaximumCapacity(String value) {
        this.tn2501VALMaximumCapacity = value;
    }

    /**
     * Gets the value of the voiceMailApplicationSupport property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoiceMailApplicationSupport() {
        return voiceMailApplicationSupport;
    }

    /**
     * Sets the value of the voiceMailApplicationSupport property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoiceMailApplicationSupport(String value) {
        this.voiceMailApplicationSupport = value;
    }

    /**
     * Gets the value of the widebandSwitching property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWidebandSwitching() {
        return widebandSwitching;
    }

    /**
     * Sets the value of the widebandSwitching property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWidebandSwitching(String value) {
        this.widebandSwitching = value;
    }

    /**
     * Gets the value of the wireless property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWireless() {
        return wireless;
    }

    /**
     * Sets the value of the wireless property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWireless(String value) {
        this.wireless = value;
    }

    /**
     * Gets the value of the callCenterRelease property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallCenterRelease() {
        return callCenterRelease;
    }

    /**
     * Sets the value of the callCenterRelease property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallCenterRelease(String value) {
        this.callCenterRelease = value;
    }

    /**
     * Gets the value of the acd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACD() {
        return acd;
    }

    /**
     * Sets the value of the acd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACD(String value) {
        this.acd = value;
    }

    /**
     * Gets the value of the bcmsBasic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBCMSBasic() {
        return bcmsBasic;
    }

    /**
     * Sets the value of the bcmsBasic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBCMSBasic(String value) {
        this.bcmsBasic = value;
    }

    /**
     * Gets the value of the bcmsVuStatsServiceLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBCMSVuStatsServiceLevel() {
        return bcmsVuStatsServiceLevel;
    }

    /**
     * Sets the value of the bcmsVuStatsServiceLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBCMSVuStatsServiceLevel(String value) {
        this.bcmsVuStatsServiceLevel = value;
    }

    /**
     * Gets the value of the bsrLocalTreatmentForIPAndISDN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBSRLocalTreatmentForIPAndISDN() {
        return bsrLocalTreatmentForIPAndISDN;
    }

    /**
     * Sets the value of the bsrLocalTreatmentForIPAndISDN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBSRLocalTreatmentForIPAndISDN(String value) {
        this.bsrLocalTreatmentForIPAndISDN = value;
    }

    /**
     * Gets the value of the businessAdvocate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessAdvocate() {
        return businessAdvocate;
    }

    /**
     * Sets the value of the businessAdvocate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessAdvocate(String value) {
        this.businessAdvocate = value;
    }

    /**
     * Gets the value of the callWorkCodes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallWorkCodes() {
        return callWorkCodes;
    }

    /**
     * Sets the value of the callWorkCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallWorkCodes(String value) {
        this.callWorkCodes = value;
    }

    /**
     * Gets the value of the dtmfFeedbackSignalsForVRU property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTMFFeedbackSignalsForVRU() {
        return dtmfFeedbackSignalsForVRU;
    }

    /**
     * Sets the value of the dtmfFeedbackSignalsForVRU property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTMFFeedbackSignalsForVRU(String value) {
        this.dtmfFeedbackSignalsForVRU = value;
    }

    /**
     * Gets the value of the dynamicAdvocate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDynamicAdvocate() {
        return dynamicAdvocate;
    }

    /**
     * Sets the value of the dynamicAdvocate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDynamicAdvocate(String value) {
        this.dynamicAdvocate = value;
    }

    /**
     * Gets the value of the expertAgentSelectionEAS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpertAgentSelectionEAS() {
        return expertAgentSelectionEAS;
    }

    /**
     * Sets the value of the expertAgentSelectionEAS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpertAgentSelectionEAS(String value) {
        this.expertAgentSelectionEAS = value;
    }

    /**
     * Gets the value of the easphd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEASPHD() {
        return easphd;
    }

    /**
     * Sets the value of the easphd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEASPHD(String value) {
        this.easphd = value;
    }

    /**
     * Gets the value of the forcedACDCalls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForcedACDCalls() {
        return forcedACDCalls;
    }

    /**
     * Sets the value of the forcedACDCalls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForcedACDCalls(String value) {
        this.forcedACDCalls = value;
    }

    /**
     * Gets the value of the leastOccupiedAgent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeastOccupiedAgent() {
        return leastOccupiedAgent;
    }

    /**
     * Sets the value of the leastOccupiedAgent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeastOccupiedAgent(String value) {
        this.leastOccupiedAgent = value;
    }

    /**
     * Gets the value of the lookaheadInterflowLAI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLookaheadInterflowLAI() {
        return lookaheadInterflowLAI;
    }

    /**
     * Sets the value of the lookaheadInterflowLAI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLookaheadInterflowLAI(String value) {
        this.lookaheadInterflowLAI = value;
    }

    /**
     * Gets the value of the multipleCallHandlingOnRequest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMultipleCallHandlingOnRequest() {
        return multipleCallHandlingOnRequest;
    }

    /**
     * Sets the value of the multipleCallHandlingOnRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMultipleCallHandlingOnRequest(String value) {
        this.multipleCallHandlingOnRequest = value;
    }

    /**
     * Gets the value of the multipleCallHandlingForced property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMultipleCallHandlingForced() {
        return multipleCallHandlingForced;
    }

    /**
     * Sets the value of the multipleCallHandlingForced property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMultipleCallHandlingForced(String value) {
        this.multipleCallHandlingForced = value;
    }

    /**
     * Gets the value of the pasteDisplayPBXDataOnPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPASTEDisplayPBXDataOnPhone() {
        return pasteDisplayPBXDataOnPhone;
    }

    /**
     * Sets the value of the pasteDisplayPBXDataOnPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPASTEDisplayPBXDataOnPhone(String value) {
        this.pasteDisplayPBXDataOnPhone = value;
    }

    /**
     * Gets the value of the reasonCodes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonCodes() {
        return reasonCodes;
    }

    /**
     * Sets the value of the reasonCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonCodes(String value) {
        this.reasonCodes = value;
    }

    /**
     * Gets the value of the serviceLevelMaximizer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceLevelMaximizer() {
        return serviceLevelMaximizer;
    }

    /**
     * Sets the value of the serviceLevelMaximizer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceLevelMaximizer(String value) {
        this.serviceLevelMaximizer = value;
    }

    /**
     * Gets the value of the serviceObservingBasic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceObservingBasic() {
        return serviceObservingBasic;
    }

    /**
     * Sets the value of the serviceObservingBasic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceObservingBasic(String value) {
        this.serviceObservingBasic = value;
    }

    /**
     * Gets the value of the serviceObservingRemoteByFAC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceObservingRemoteByFAC() {
        return serviceObservingRemoteByFAC;
    }

    /**
     * Sets the value of the serviceObservingRemoteByFAC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceObservingRemoteByFAC(String value) {
        this.serviceObservingRemoteByFAC = value;
    }

    /**
     * Gets the value of the serviceObservingVDNs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceObservingVDNs() {
        return serviceObservingVDNs;
    }

    /**
     * Sets the value of the serviceObservingVDNs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceObservingVDNs(String value) {
        this.serviceObservingVDNs = value;
    }

    /**
     * Gets the value of the timedACW property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimedACW() {
        return timedACW;
    }

    /**
     * Sets the value of the timedACW property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimedACW(String value) {
        this.timedACW = value;
    }

    /**
     * Gets the value of the vectoringBasic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVectoringBasic() {
        return vectoringBasic;
    }

    /**
     * Sets the value of the vectoringBasic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVectoringBasic(String value) {
        this.vectoringBasic = value;
    }

    /**
     * Gets the value of the vectoringPrompting property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVectoringPrompting() {
        return vectoringPrompting;
    }

    /**
     * Sets the value of the vectoringPrompting property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVectoringPrompting(String value) {
        this.vectoringPrompting = value;
    }

    /**
     * Gets the value of the vectoringG3V4Enhanced property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVectoringG3V4Enhanced() {
        return vectoringG3V4Enhanced;
    }

    /**
     * Sets the value of the vectoringG3V4Enhanced property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVectoringG3V4Enhanced(String value) {
        this.vectoringG3V4Enhanced = value;
    }

    /**
     * Gets the value of the vectoring30Enhanced property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVectoring30Enhanced() {
        return vectoring30Enhanced;
    }

    /**
     * Sets the value of the vectoring30Enhanced property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVectoring30Enhanced(String value) {
        this.vectoring30Enhanced = value;
    }

    /**
     * Gets the value of the vectoringANIIIDigitsRouting property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVectoringANIIIDigitsRouting() {
        return vectoringANIIIDigitsRouting;
    }

    /**
     * Sets the value of the vectoringANIIIDigitsRouting property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVectoringANIIIDigitsRouting(String value) {
        this.vectoringANIIIDigitsRouting = value;
    }

    /**
     * Gets the value of the vectoringG3V4AdvancedRouting property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVectoringG3V4AdvancedRouting() {
        return vectoringG3V4AdvancedRouting;
    }

    /**
     * Sets the value of the vectoringG3V4AdvancedRouting property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVectoringG3V4AdvancedRouting(String value) {
        this.vectoringG3V4AdvancedRouting = value;
    }

    /**
     * Gets the value of the vectoringCINFO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVectoringCINFO() {
        return vectoringCINFO;
    }

    /**
     * Sets the value of the vectoringCINFO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVectoringCINFO(String value) {
        this.vectoringCINFO = value;
    }

    /**
     * Gets the value of the vectoringBestServiceRouting property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVectoringBestServiceRouting() {
        return vectoringBestServiceRouting;
    }

    /**
     * Sets the value of the vectoringBestServiceRouting property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVectoringBestServiceRouting(String value) {
        this.vectoringBestServiceRouting = value;
    }

    /**
     * Gets the value of the vectoringHolidays property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVectoringHolidays() {
        return vectoringHolidays;
    }

    /**
     * Sets the value of the vectoringHolidays property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVectoringHolidays(String value) {
        this.vectoringHolidays = value;
    }

    /**
     * Gets the value of the vectoringVariables property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVectoringVariables() {
        return vectoringVariables;
    }

    /**
     * Sets the value of the vectoringVariables property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVectoringVariables(String value) {
        this.vectoringVariables = value;
    }

    /**
     * Gets the value of the vdnOfOriginAnnouncement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVDNOfOriginAnnouncement() {
        return vdnOfOriginAnnouncement;
    }

    /**
     * Sets the value of the vdnOfOriginAnnouncement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVDNOfOriginAnnouncement(String value) {
        this.vdnOfOriginAnnouncement = value;
    }

    /**
     * Gets the value of the vdnReturnDestination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVDNReturnDestination() {
        return vdnReturnDestination;
    }

    /**
     * Sets the value of the vdnReturnDestination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVDNReturnDestination(String value) {
        this.vdnReturnDestination = value;
    }

    /**
     * Gets the value of the vuStats property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVuStats() {
        return vuStats;
    }

    /**
     * Sets the value of the vuStats property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVuStats(String value) {
        this.vuStats = value;
    }

    /**
     * Gets the value of the vuStatsG3V4Enhanced property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVuStatsG3V4Enhanced() {
        return vuStatsG3V4Enhanced;
    }

    /**
     * Sets the value of the vuStatsG3V4Enhanced property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVuStatsG3V4Enhanced(String value) {
        this.vuStatsG3V4Enhanced = value;
    }

    /**
     * Gets the value of the loggedInACDAgents property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoggedInACDAgents() {
        return loggedInACDAgents;
    }

    /**
     * Sets the value of the loggedInACDAgents property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoggedInACDAgents(String value) {
        this.loggedInACDAgents = value;
    }

    /**
     * Gets the value of the loggedInACDAgentsUSED property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoggedInACDAgentsUSED() {
        return loggedInACDAgentsUSED;
    }

    /**
     * Sets the value of the loggedInACDAgentsUSED property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoggedInACDAgentsUSED(String value) {
        this.loggedInACDAgentsUSED = value;
    }

    /**
     * Gets the value of the loggedInACDAgentsLOW property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoggedInACDAgentsLOW() {
        return loggedInACDAgentsLOW;
    }

    /**
     * Sets the value of the loggedInACDAgentsLOW property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoggedInACDAgentsLOW(String value) {
        this.loggedInACDAgentsLOW = value;
    }

    /**
     * Gets the value of the loggedInACDAgentsHIGH property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoggedInACDAgentsHIGH() {
        return loggedInACDAgentsHIGH;
    }

    /**
     * Sets the value of the loggedInACDAgentsHIGH property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoggedInACDAgentsHIGH(String value) {
        this.loggedInACDAgentsHIGH = value;
    }

    /**
     * Gets the value of the loggedInAdvocateAgents property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoggedInAdvocateAgents() {
        return loggedInAdvocateAgents;
    }

    /**
     * Sets the value of the loggedInAdvocateAgents property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoggedInAdvocateAgents(String value) {
        this.loggedInAdvocateAgents = value;
    }

    /**
     * Gets the value of the loggedInAdvocateAgentsUSED property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoggedInAdvocateAgentsUSED() {
        return loggedInAdvocateAgentsUSED;
    }

    /**
     * Sets the value of the loggedInAdvocateAgentsUSED property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoggedInAdvocateAgentsUSED(String value) {
        this.loggedInAdvocateAgentsUSED = value;
    }

    /**
     * Gets the value of the loggedInAdvocateAgentsLOW property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoggedInAdvocateAgentsLOW() {
        return loggedInAdvocateAgentsLOW;
    }

    /**
     * Sets the value of the loggedInAdvocateAgentsLOW property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoggedInAdvocateAgentsLOW(String value) {
        this.loggedInAdvocateAgentsLOW = value;
    }

    /**
     * Gets the value of the loggedInAdvocateAgentsHIGH property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoggedInAdvocateAgentsHIGH() {
        return loggedInAdvocateAgentsHIGH;
    }

    /**
     * Sets the value of the loggedInAdvocateAgentsHIGH property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoggedInAdvocateAgentsHIGH(String value) {
        this.loggedInAdvocateAgentsHIGH = value;
    }

    /**
     * Gets the value of the loggedInIPSoftphoneAgents property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoggedInIPSoftphoneAgents() {
        return loggedInIPSoftphoneAgents;
    }

    /**
     * Sets the value of the loggedInIPSoftphoneAgents property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoggedInIPSoftphoneAgents(String value) {
        this.loggedInIPSoftphoneAgents = value;
    }

    /**
     * Gets the value of the loggedInIPSoftphoneAgentsUSED property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoggedInIPSoftphoneAgentsUSED() {
        return loggedInIPSoftphoneAgentsUSED;
    }

    /**
     * Sets the value of the loggedInIPSoftphoneAgentsUSED property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoggedInIPSoftphoneAgentsUSED(String value) {
        this.loggedInIPSoftphoneAgentsUSED = value;
    }

    /**
     * Gets the value of the loggedInIPSoftphoneAgentsLOW property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoggedInIPSoftphoneAgentsLOW() {
        return loggedInIPSoftphoneAgentsLOW;
    }

    /**
     * Sets the value of the loggedInIPSoftphoneAgentsLOW property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoggedInIPSoftphoneAgentsLOW(String value) {
        this.loggedInIPSoftphoneAgentsLOW = value;
    }

    /**
     * Gets the value of the loggedInIPSoftphoneAgentsHIGH property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoggedInIPSoftphoneAgentsHIGH() {
        return loggedInIPSoftphoneAgentsHIGH;
    }

    /**
     * Sets the value of the loggedInIPSoftphoneAgentsHIGH property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoggedInIPSoftphoneAgentsHIGH(String value) {
        this.loggedInIPSoftphoneAgentsHIGH = value;
    }

    /**
     * Gets the value of the basicCallSetup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBasicCallSetup() {
        return basicCallSetup;
    }

    /**
     * Sets the value of the basicCallSetup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBasicCallSetup(String value) {
        this.basicCallSetup = value;
    }

    /**
     * Gets the value of the basicSupplementaryServices property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBasicSupplementaryServices() {
        return basicSupplementaryServices;
    }

    /**
     * Sets the value of the basicSupplementaryServices property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBasicSupplementaryServices(String value) {
        this.basicSupplementaryServices = value;
    }

    /**
     * Gets the value of the centralizedAttendant property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCentralizedAttendant() {
        return centralizedAttendant;
    }

    /**
     * Sets the value of the centralizedAttendant property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCentralizedAttendant(String value) {
        this.centralizedAttendant = value;
    }

    /**
     * Gets the value of the interworkingWithDCS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterworkingWithDCS() {
        return interworkingWithDCS;
    }

    /**
     * Sets the value of the interworkingWithDCS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterworkingWithDCS(String value) {
        this.interworkingWithDCS = value;
    }

    /**
     * Gets the value of the supplementaryServicesWithRerouting property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplementaryServicesWithRerouting() {
        return supplementaryServicesWithRerouting;
    }

    /**
     * Sets the value of the supplementaryServicesWithRerouting property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplementaryServicesWithRerouting(String value) {
        this.supplementaryServicesWithRerouting = value;
    }

    /**
     * Gets the value of the transferIntoQSIGVoiceMail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferIntoQSIGVoiceMail() {
        return transferIntoQSIGVoiceMail;
    }

    /**
     * Sets the value of the transferIntoQSIGVoiceMail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransferIntoQSIGVoiceMail(String value) {
        this.transferIntoQSIGVoiceMail = value;
    }

    /**
     * Gets the value of the valueAddedVALU property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueAddedVALU() {
        return valueAddedVALU;
    }

    /**
     * Sets the value of the valueAddedVALU property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueAddedVALU(String value) {
        this.valueAddedVALU = value;
    }

    /**
     * Gets the value of the adjunctCallControl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdjunctCallControl() {
        return adjunctCallControl;
    }

    /**
     * Sets the value of the adjunctCallControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdjunctCallControl(String value) {
        this.adjunctCallControl = value;
    }

    /**
     * Gets the value of the adjunctRouting property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdjunctRouting() {
        return adjunctRouting;
    }

    /**
     * Sets the value of the adjunctRouting property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdjunctRouting(String value) {
        this.adjunctRouting = value;
    }

    /**
     * Gets the value of the domainControl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomainControl() {
        return domainControl;
    }

    /**
     * Sets the value of the domainControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomainControl(String value) {
        this.domainControl = value;
    }

    /**
     * Gets the value of the eventNotification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventNotification() {
        return eventNotification;
    }

    /**
     * Sets the value of the eventNotification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventNotification(String value) {
        this.eventNotification = value;
    }

    /**
     * Gets the value of the requestFeature property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestFeature() {
        return requestFeature;
    }

    /**
     * Sets the value of the requestFeature property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestFeature(String value) {
        this.requestFeature = value;
    }

    /**
     * Gets the value of the setValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSetValue() {
        return setValue;
    }

    /**
     * Sets the value of the setValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSetValue(String value) {
        this.setValue = value;
    }

    /**
     * Gets the value of the answeringMachineDetection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnsweringMachineDetection() {
        return answeringMachineDetection;
    }

    /**
     * Sets the value of the answeringMachineDetection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnsweringMachineDetection(String value) {
        this.answeringMachineDetection = value;
    }

    /**
     * Gets the value of the selectiveListening property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelectiveListening() {
        return selectiveListening;
    }

    /**
     * Sets the value of the selectiveListening property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelectiveListening(String value) {
        this.selectiveListening = value;
    }

    /**
     * Gets the value of the switchClassifiedOutboundCalls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSwitchClassifiedOutboundCalls() {
        return switchClassifiedOutboundCalls;
    }

    /**
     * Sets the value of the switchClassifiedOutboundCalls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSwitchClassifiedOutboundCalls(String value) {
        this.switchClassifiedOutboundCalls = value;
    }

    /**
     * Gets the value of the proprietaryApplications property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProprietaryApplications() {
        return proprietaryApplications;
    }

    /**
     * Sets the value of the proprietaryApplications property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProprietaryApplications(String value) {
        this.proprietaryApplications = value;
    }

    /**
     * Gets the value of the ctiStations property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCTIStations() {
        return ctiStations;
    }

    /**
     * Sets the value of the ctiStations property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCTIStations(String value) {
        this.ctiStations = value;
    }

    /**
     * Gets the value of the increasedAdjunctRouteCapacity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncreasedAdjunctRouteCapacity() {
        return increasedAdjunctRouteCapacity;
    }

    /**
     * Sets the value of the increasedAdjunctRouteCapacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncreasedAdjunctRouteCapacity(String value) {
        this.increasedAdjunctRouteCapacity = value;
    }

    /**
     * Gets the value of the phantomCalls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhantomCalls() {
        return phantomCalls;
    }

    /**
     * Sets the value of the phantomCalls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhantomCalls(String value) {
        this.phantomCalls = value;
    }

    /**
     * Gets the value of the agentStates property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentStates() {
        return agentStates;
    }

    /**
     * Sets the value of the agentStates property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentStates(String value) {
        this.agentStates = value;
    }

    /**
     * Gets the value of the productID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getProductID() {
        if (productID == null) {
            productID = new ArrayList<ArrayType>();
        }
        return this.productID;
    }

    /**
     * Gets the value of the limit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the limit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLimit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getLimit() {
        if (limit == null) {
            limit = new ArrayList<ArrayType>();
        }
        return this.limit;
    }

    /**
     * Gets the value of the used property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the used property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUsed().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getUsed() {
        if (used == null) {
            used = new ArrayList<ArrayType>();
        }
        return this.used;
    }

    /**
     * Gets the value of the release property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the release property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelease().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getRelease() {
        if (release == null) {
            release = new ArrayList<ArrayType>();
        }
        return this.release;
    }

}
