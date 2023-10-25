
package com.system.ipcc.pbx.avaya.smsxml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Extension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Port" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Coverage_Path_1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Coverage_Path_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Hunt_to_Station" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="COR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="COS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Room" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Jack" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Cable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Data_Extension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Survivable_GK_Node_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Lock_Messages" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Security_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MASI_Node_Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Map_to_Station" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Automatic_Moves" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Data_Module" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Display_Module" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Display_Language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IPEI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Access_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Home" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ringing_Pattern" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Message_Lamp_Ext" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MM_Remote_Data_Ext" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MM_Complex_Data_Ext" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="One_Step_Clearing" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Country_Protocol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Endpt_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CRV_Length" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LWC_Reception" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LWC_Activation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CDR_Privacy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Redirect_Notification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Per_Button_Ring_Control" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Bridged_Call_Alerting" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Active_Station_Ringing" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Idle_Active_Ringing" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="H320_Conversion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IP_Audio_Hairpinning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Prime_Appearance_Preference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Expansion_Module_24" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Direct_IP_IP_Audio_Connections" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Loss_Group" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Feature_Module" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Coverage_Module" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Coverage_Module_1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Remote_Office_Phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Coverage_After_Forwarding" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IP_Emergency_Calls" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Emergency_Location_Ext" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Configuration_Set" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XMobile_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LWC_Log_External_Calls" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Speakerphone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Dial_Prefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Cell_Phone_Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Mapping_Mode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Mobility_Trunk_Group" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Switchhook_Flash" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Distinctive_Audible_Alert" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Message_Waiting_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Length_of_Display" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Service_Link_Mode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Multimedia_Mode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AUDIX_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Messaging_Server_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Auto_Select_Idle_Appear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Conf_Trans_On_Primary_Appearance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Coverage_Msg_Retrieval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Auto_Answer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Data_Restriction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Idle_Appearance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Bridged_Idle_Line" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Restrict_Last_Appearance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Flash_for_Answer_Hold" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CPN___Send_Calling_No" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Multimedia_Early_Answer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Audible_Msg_Waiting" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Display_Client_Redirection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Select_Last_Used_Appear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Restricted_Number_Char" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Floor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Building" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Headset" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Speaker" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Mounting" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Cord_Length" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Set_Color" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Hot_Line_Destination_List_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Dial_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Info1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Info2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Data_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Data_BCC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Data_COS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Data_COR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Data_ITC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Data_TN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Data_Special_Dialing_Option" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Data_Abbreviated_Dialing_Dial_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Data_Multimedia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Data_Private_Line_Emulation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Data_Default_Duplex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Data_Default_Mode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Data_Default_Speed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Data_Default_ITC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Data_Default_Data_Application" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MWI_Served_User_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Tests" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Message_Waiting_Indicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ignore_Rotary_Digits" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Call_Waiting_Indicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Att_Call_Waiting_Indicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Adjunct_Supervision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IP_Hoteling" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IP_Softphone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IP_Video" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EC500_State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Native_Name_1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Native_Name_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Native_Name_3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Native_Name_4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Native_Name_5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Native_Name_Scripts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Unconditional_For_Internal_Calls_To" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Unconditional_For_Internal_Calls_To_Active" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Unconditional_For_External_Calls_To" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Unconditional_For_External_Calls_To_Active" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Busy_For_Internal_Calls_To" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Busy_For_Internal_Calls_To_Active" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Busy_For_External_Calls_To" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Busy_For_External_Calls_To_Active" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="No_Reply_For_Internal_Calls_To" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="No_Reply_For_Internal_Calls_To_Active" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="No_Reply_For_External_Calls_To" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="No_Reply_For_External_Calls_To_Active" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Set" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Data_Option" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Off_Premises_Stations" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="R_Balance_Network" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Passageway" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Model" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Display_Cartridge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Mute_Button_Enabled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Customizable_Labels" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Display_Caller_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Caller_ID_Message_Waiting_Indication" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Fixed_TEI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TEI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Secure_Terminal_Equipment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MIM_Support" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MIM_Maintenance_and_Management" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SPID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Survivable_COR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Survivable_Trunk_Destination" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DTMF_over_IP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Recall_Rotary_Digit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Always_Use" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EMU_Login_Allowed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Calls_Allowed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Endpt_Init" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Block_Alerting_if_IP_Principal_Logged_Off" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Bridged_Appearance_Origination_Restriction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Busy_Auto_Callback_Without_Flash" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Button_Modules" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Call_Appearance_Display_Format" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IP_Phone_Group_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Precedence_Call_Waiting" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SAC_CF_Override" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SIP_Trunk" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Time_of_Day_Lock_Table" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Type_of_3PCC_Enabled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XOIP_Endpoint_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Result_Port" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maintenance_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Alt_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Result" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Error_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;group ref="{http://xml.avaya.com/sms}StationArrayGroup"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StationType", propOrder = {
    "extension",
    "type",
    "port",
    "name",
    "coveragePath1",
    "coveragePath2",
    "huntToStation",
    "cor",
    "cos",
    "room",
    "jack",
    "cable",
    "dataExtension",
    "survivableGKNodeName",
    "tn",
    "lockMessages",
    "securityCode",
    "masiNodeNumber",
    "mapToStation",
    "automaticMoves",
    "dataModule",
    "displayModule",
    "displayLanguage",
    "ipei",
    "accessCode",
    "home",
    "ringingPattern",
    "messageLampExt",
    "mmRemoteDataExt",
    "mmComplexDataExt",
    "oneStepClearing",
    "countryProtocol",
    "endptID",
    "crvLength",
    "lwcReception",
    "lwcActivation",
    "cdrPrivacy",
    "redirectNotification",
    "perButtonRingControl",
    "bridgedCallAlerting",
    "activeStationRinging",
    "idleActiveRinging",
    "h320Conversion",
    "ipAudioHairpinning",
    "primeAppearancePreference",
    "expansionModule24",
    "directIPIPAudioConnections",
    "lossGroup",
    "featureModule",
    "coverageModule",
    "coverageModule1",
    "remoteOfficePhone",
    "coverageAfterForwarding",
    "ipEmergencyCalls",
    "emergencyLocationExt",
    "configurationSet",
    "xMobileType",
    "lwcLogExternalCalls",
    "speakerphone",
    "dialPrefix",
    "cellPhoneNumber",
    "mappingMode",
    "mobilityTrunkGroup",
    "switchhookFlash",
    "distinctiveAudibleAlert",
    "messageWaitingType",
    "lengthOfDisplay",
    "serviceLinkMode",
    "multimediaMode",
    "audixName",
    "messagingServerName",
    "autoSelectIdleAppear",
    "confTransOnPrimaryAppearance",
    "coverageMsgRetrieval",
    "autoAnswer",
    "dataRestriction",
    "idleAppearance",
    "bridgedIdleLine",
    "restrictLastAppearance",
    "flashForAnswerHold",
    "cpnSendCallingNo",
    "multimediaEarlyAnswer",
    "audibleMsgWaiting",
    "displayClientRedirection",
    "selectLastUsedAppear",
    "restrictedNumberChar",
    "floor",
    "building",
    "headset",
    "speaker",
    "mounting",
    "cordLength",
    "setColor",
    "hotLineDestinationListNumber",
    "dialCode",
    "info1",
    "info2",
    "dataName",
    "dataBCC",
    "dataCOS",
    "dataCOR",
    "dataITC",
    "dataTN",
    "dataSpecialDialingOption",
    "dataAbbreviatedDialingDialCode",
    "dataMultimedia",
    "dataPrivateLineEmulation",
    "dataDefaultDuplex",
    "dataDefaultMode",
    "dataDefaultSpeed",
    "dataDefaultITC",
    "dataDefaultDataApplication",
    "mwiServedUserType",
    "tests",
    "messageWaitingIndicator",
    "ignoreRotaryDigits",
    "callWaitingIndicator",
    "attCallWaitingIndicator",
    "adjunctSupervision",
    "ipHoteling",
    "ipSoftphone",
    "ipVideo",
    "ec500State",
    "nativeName1",
    "nativeName2",
    "nativeName3",
    "nativeName4",
    "nativeName5",
    "nativeNameScripts",
    "unconditionalForInternalCallsTo",
    "unconditionalForInternalCallsToActive",
    "unconditionalForExternalCallsTo",
    "unconditionalForExternalCallsToActive",
    "busyForInternalCallsTo",
    "busyForInternalCallsToActive",
    "busyForExternalCallsTo",
    "busyForExternalCallsToActive",
    "noReplyForInternalCallsTo",
    "noReplyForInternalCallsToActive",
    "noReplyForExternalCallsTo",
    "noReplyForExternalCallsToActive",
    "set",
    "dataOption",
    "offPremisesStations",
    "rBalanceNetwork",
    "passageway",
    "model",
    "displayCartridge",
    "muteButtonEnabled",
    "customizableLabels",
    "displayCallerID",
    "callerIDMessageWaitingIndication",
    "xid",
    "fixedTEI",
    "tei",
    "secureTerminalEquipment",
    "mimSupport",
    "mimMaintenanceAndManagement",
    "spid",
    "survivableCOR",
    "survivableTrunkDestination",
    "dtmfOverIP",
    "recallRotaryDigit",
    "alwaysUse",
    "emuLoginAllowed",
    "callsAllowed",
    "endptInit",
    "blockAlertingIfIPPrincipalLoggedOff",
    "bridgedAppearanceOriginationRestriction",
    "busyAutoCallbackWithoutFlash",
    "buttonModules",
    "callAppearanceDisplayFormat",
    "ipPhoneGroupID",
    "precedenceCallWaiting",
    "saccfOverride",
    "sipTrunk",
    "timeOfDayLockTable",
    "typeOf3PCCEnabled",
    "xoipEndpointType",
    "resultPort",
    "maintenanceName",
    "altName",
    "result",
    "errorCode",
    "location",
    "abbreviatedDialingListType",
    "abbreviatedDialingListNumber",
    "buttonData1",
    "buttonData2",
    "buttonData3",
    "buttonData4",
    "buttonData5",
    "buttonData6",
    "buttonData7",
    "dataList1",
    "dataPersonalListNumber"
})
public class StationType {

    @XmlElement(name = "Extension")
    protected String extension;
    @XmlElement(name = "Type")
    protected String type;
    @XmlElement(name = "Port")
    protected String port;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Coverage_Path_1")
    protected String coveragePath1;
    @XmlElement(name = "Coverage_Path_2")
    protected String coveragePath2;
    @XmlElement(name = "Hunt_to_Station")
    protected String huntToStation;
    @XmlElement(name = "COR")
    protected String cor;
    @XmlElement(name = "COS")
    protected String cos;
    @XmlElement(name = "Room")
    protected String room;
    @XmlElement(name = "Jack")
    protected String jack;
    @XmlElement(name = "Cable")
    protected String cable;
    @XmlElement(name = "Data_Extension")
    protected String dataExtension;
    @XmlElement(name = "Survivable_GK_Node_Name")
    protected String survivableGKNodeName;
    @XmlElement(name = "TN")
    protected String tn;
    @XmlElement(name = "Lock_Messages")
    protected String lockMessages;
    @XmlElement(name = "Security_Code")
    protected String securityCode;
    @XmlElement(name = "MASI_Node_Number")
    protected String masiNodeNumber;
    @XmlElement(name = "Map_to_Station")
    protected String mapToStation;
    @XmlElement(name = "Automatic_Moves")
    protected String automaticMoves;
    @XmlElement(name = "Data_Module")
    protected String dataModule;
    @XmlElement(name = "Display_Module")
    protected String displayModule;
    @XmlElement(name = "Display_Language")
    protected String displayLanguage;
    @XmlElement(name = "IPEI")
    protected String ipei;
    @XmlElement(name = "Access_Code")
    protected String accessCode;
    @XmlElement(name = "Home")
    protected String home;
    @XmlElement(name = "Ringing_Pattern")
    protected String ringingPattern;
    @XmlElement(name = "Message_Lamp_Ext")
    protected String messageLampExt;
    @XmlElement(name = "MM_Remote_Data_Ext")
    protected String mmRemoteDataExt;
    @XmlElement(name = "MM_Complex_Data_Ext")
    protected String mmComplexDataExt;
    @XmlElement(name = "One_Step_Clearing")
    protected String oneStepClearing;
    @XmlElement(name = "Country_Protocol")
    protected String countryProtocol;
    @XmlElement(name = "Endpt_ID")
    protected String endptID;
    @XmlElement(name = "CRV_Length")
    protected String crvLength;
    @XmlElement(name = "LWC_Reception")
    protected String lwcReception;
    @XmlElement(name = "LWC_Activation")
    protected String lwcActivation;
    @XmlElement(name = "CDR_Privacy")
    protected String cdrPrivacy;
    @XmlElement(name = "Redirect_Notification")
    protected String redirectNotification;
    @XmlElement(name = "Per_Button_Ring_Control")
    protected String perButtonRingControl;
    @XmlElement(name = "Bridged_Call_Alerting")
    protected String bridgedCallAlerting;
    @XmlElement(name = "Active_Station_Ringing")
    protected String activeStationRinging;
    @XmlElement(name = "Idle_Active_Ringing")
    protected String idleActiveRinging;
    @XmlElement(name = "H320_Conversion")
    protected String h320Conversion;
    @XmlElement(name = "IP_Audio_Hairpinning")
    protected String ipAudioHairpinning;
    @XmlElement(name = "Prime_Appearance_Preference")
    protected String primeAppearancePreference;
    @XmlElement(name = "Expansion_Module_24")
    protected String expansionModule24;
    @XmlElement(name = "Direct_IP_IP_Audio_Connections")
    protected String directIPIPAudioConnections;
    @XmlElement(name = "Loss_Group")
    protected String lossGroup;
    @XmlElement(name = "Feature_Module")
    protected String featureModule;
    @XmlElement(name = "Coverage_Module")
    protected String coverageModule;
    @XmlElement(name = "Coverage_Module_1")
    protected String coverageModule1;
    @XmlElement(name = "Remote_Office_Phone")
    protected String remoteOfficePhone;
    @XmlElement(name = "Coverage_After_Forwarding")
    protected String coverageAfterForwarding;
    @XmlElement(name = "IP_Emergency_Calls")
    protected String ipEmergencyCalls;
    @XmlElement(name = "Emergency_Location_Ext")
    protected String emergencyLocationExt;
    @XmlElement(name = "Configuration_Set")
    protected String configurationSet;
    @XmlElement(name = "XMobile_Type")
    protected String xMobileType;
    @XmlElement(name = "LWC_Log_External_Calls")
    protected String lwcLogExternalCalls;
    @XmlElement(name = "Speakerphone")
    protected String speakerphone;
    @XmlElement(name = "Dial_Prefix")
    protected String dialPrefix;
    @XmlElement(name = "Cell_Phone_Number")
    protected String cellPhoneNumber;
    @XmlElement(name = "Mapping_Mode")
    protected String mappingMode;
    @XmlElement(name = "Mobility_Trunk_Group")
    protected String mobilityTrunkGroup;
    @XmlElement(name = "Switchhook_Flash")
    protected String switchhookFlash;
    @XmlElement(name = "Distinctive_Audible_Alert")
    protected String distinctiveAudibleAlert;
    @XmlElement(name = "Message_Waiting_Type")
    protected String messageWaitingType;
    @XmlElement(name = "Length_of_Display")
    protected String lengthOfDisplay;
    @XmlElement(name = "Service_Link_Mode")
    protected String serviceLinkMode;
    @XmlElement(name = "Multimedia_Mode")
    protected String multimediaMode;
    @XmlElement(name = "AUDIX_Name")
    protected String audixName;
    @XmlElement(name = "Messaging_Server_Name")
    protected String messagingServerName;
    @XmlElement(name = "Auto_Select_Idle_Appear")
    protected String autoSelectIdleAppear;
    @XmlElement(name = "Conf_Trans_On_Primary_Appearance")
    protected String confTransOnPrimaryAppearance;
    @XmlElement(name = "Coverage_Msg_Retrieval")
    protected String coverageMsgRetrieval;
    @XmlElement(name = "Auto_Answer")
    protected String autoAnswer;
    @XmlElement(name = "Data_Restriction")
    protected String dataRestriction;
    @XmlElement(name = "Idle_Appearance")
    protected String idleAppearance;
    @XmlElement(name = "Bridged_Idle_Line")
    protected String bridgedIdleLine;
    @XmlElement(name = "Restrict_Last_Appearance")
    protected String restrictLastAppearance;
    @XmlElement(name = "Flash_for_Answer_Hold")
    protected String flashForAnswerHold;
    @XmlElement(name = "CPN___Send_Calling_No")
    protected String cpnSendCallingNo;
    @XmlElement(name = "Multimedia_Early_Answer")
    protected String multimediaEarlyAnswer;
    @XmlElement(name = "Audible_Msg_Waiting")
    protected String audibleMsgWaiting;
    @XmlElement(name = "Display_Client_Redirection")
    protected String displayClientRedirection;
    @XmlElement(name = "Select_Last_Used_Appear")
    protected String selectLastUsedAppear;
    @XmlElement(name = "Restricted_Number_Char")
    protected String restrictedNumberChar;
    @XmlElement(name = "Floor")
    protected String floor;
    @XmlElement(name = "Building")
    protected String building;
    @XmlElement(name = "Headset")
    protected String headset;
    @XmlElement(name = "Speaker")
    protected String speaker;
    @XmlElement(name = "Mounting")
    protected String mounting;
    @XmlElement(name = "Cord_Length")
    protected String cordLength;
    @XmlElement(name = "Set_Color")
    protected String setColor;
    @XmlElement(name = "Hot_Line_Destination_List_number")
    protected String hotLineDestinationListNumber;
    @XmlElement(name = "Dial_Code")
    protected String dialCode;
    @XmlElement(name = "Info1")
    protected String info1;
    @XmlElement(name = "Info2")
    protected String info2;
    @XmlElement(name = "Data_Name")
    protected String dataName;
    @XmlElement(name = "Data_BCC")
    protected String dataBCC;
    @XmlElement(name = "Data_COS")
    protected String dataCOS;
    @XmlElement(name = "Data_COR")
    protected String dataCOR;
    @XmlElement(name = "Data_ITC")
    protected String dataITC;
    @XmlElement(name = "Data_TN")
    protected String dataTN;
    @XmlElement(name = "Data_Special_Dialing_Option")
    protected String dataSpecialDialingOption;
    @XmlElement(name = "Data_Abbreviated_Dialing_Dial_Code")
    protected String dataAbbreviatedDialingDialCode;
    @XmlElement(name = "Data_Multimedia")
    protected String dataMultimedia;
    @XmlElement(name = "Data_Private_Line_Emulation")
    protected String dataPrivateLineEmulation;
    @XmlElement(name = "Data_Default_Duplex")
    protected String dataDefaultDuplex;
    @XmlElement(name = "Data_Default_Mode")
    protected String dataDefaultMode;
    @XmlElement(name = "Data_Default_Speed")
    protected String dataDefaultSpeed;
    @XmlElement(name = "Data_Default_ITC")
    protected String dataDefaultITC;
    @XmlElement(name = "Data_Default_Data_Application")
    protected String dataDefaultDataApplication;
    @XmlElement(name = "MWI_Served_User_Type")
    protected String mwiServedUserType;
    @XmlElement(name = "Tests")
    protected String tests;
    @XmlElement(name = "Message_Waiting_Indicator")
    protected String messageWaitingIndicator;
    @XmlElement(name = "Ignore_Rotary_Digits")
    protected String ignoreRotaryDigits;
    @XmlElement(name = "Call_Waiting_Indicator")
    protected String callWaitingIndicator;
    @XmlElement(name = "Att_Call_Waiting_Indicator")
    protected String attCallWaitingIndicator;
    @XmlElement(name = "Adjunct_Supervision")
    protected String adjunctSupervision;
    @XmlElement(name = "IP_Hoteling")
    protected String ipHoteling;
    @XmlElement(name = "IP_Softphone")
    protected String ipSoftphone;
    @XmlElement(name = "IP_Video")
    protected String ipVideo;
    @XmlElement(name = "EC500_State")
    protected String ec500State;
    @XmlElement(name = "Native_Name_1")
    protected String nativeName1;
    @XmlElement(name = "Native_Name_2")
    protected String nativeName2;
    @XmlElement(name = "Native_Name_3")
    protected String nativeName3;
    @XmlElement(name = "Native_Name_4")
    protected String nativeName4;
    @XmlElement(name = "Native_Name_5")
    protected String nativeName5;
    @XmlElement(name = "Native_Name_Scripts")
    protected String nativeNameScripts;
    @XmlElement(name = "Unconditional_For_Internal_Calls_To")
    protected String unconditionalForInternalCallsTo;
    @XmlElement(name = "Unconditional_For_Internal_Calls_To_Active")
    protected String unconditionalForInternalCallsToActive;
    @XmlElement(name = "Unconditional_For_External_Calls_To")
    protected String unconditionalForExternalCallsTo;
    @XmlElement(name = "Unconditional_For_External_Calls_To_Active")
    protected String unconditionalForExternalCallsToActive;
    @XmlElement(name = "Busy_For_Internal_Calls_To")
    protected String busyForInternalCallsTo;
    @XmlElement(name = "Busy_For_Internal_Calls_To_Active")
    protected String busyForInternalCallsToActive;
    @XmlElement(name = "Busy_For_External_Calls_To")
    protected String busyForExternalCallsTo;
    @XmlElement(name = "Busy_For_External_Calls_To_Active")
    protected String busyForExternalCallsToActive;
    @XmlElement(name = "No_Reply_For_Internal_Calls_To")
    protected String noReplyForInternalCallsTo;
    @XmlElement(name = "No_Reply_For_Internal_Calls_To_Active")
    protected String noReplyForInternalCallsToActive;
    @XmlElement(name = "No_Reply_For_External_Calls_To")
    protected String noReplyForExternalCallsTo;
    @XmlElement(name = "No_Reply_For_External_Calls_To_Active")
    protected String noReplyForExternalCallsToActive;
    @XmlElement(name = "Set")
    protected String set;
    @XmlElement(name = "Data_Option")
    protected String dataOption;
    @XmlElement(name = "Off_Premises_Stations")
    protected String offPremisesStations;
    @XmlElement(name = "R_Balance_Network")
    protected String rBalanceNetwork;
    @XmlElement(name = "Passageway")
    protected String passageway;
    @XmlElement(name = "Model")
    protected String model;
    @XmlElement(name = "Display_Cartridge")
    protected String displayCartridge;
    @XmlElement(name = "Mute_Button_Enabled")
    protected String muteButtonEnabled;
    @XmlElement(name = "Customizable_Labels")
    protected String customizableLabels;
    @XmlElement(name = "Display_Caller_ID")
    protected String displayCallerID;
    @XmlElement(name = "Caller_ID_Message_Waiting_Indication")
    protected String callerIDMessageWaitingIndication;
    @XmlElement(name = "XID")
    protected String xid;
    @XmlElement(name = "Fixed_TEI")
    protected String fixedTEI;
    @XmlElement(name = "TEI")
    protected String tei;
    @XmlElement(name = "Secure_Terminal_Equipment")
    protected String secureTerminalEquipment;
    @XmlElement(name = "MIM_Support")
    protected String mimSupport;
    @XmlElement(name = "MIM_Maintenance_and_Management")
    protected String mimMaintenanceAndManagement;
    @XmlElement(name = "SPID")
    protected String spid;
    @XmlElement(name = "Survivable_COR")
    protected String survivableCOR;
    @XmlElement(name = "Survivable_Trunk_Destination")
    protected String survivableTrunkDestination;
    @XmlElement(name = "DTMF_over_IP")
    protected String dtmfOverIP;
    @XmlElement(name = "Recall_Rotary_Digit")
    protected String recallRotaryDigit;
    @XmlElement(name = "Always_Use")
    protected String alwaysUse;
    @XmlElement(name = "EMU_Login_Allowed")
    protected String emuLoginAllowed;
    @XmlElement(name = "Calls_Allowed")
    protected String callsAllowed;
    @XmlElement(name = "Endpt_Init")
    protected String endptInit;
    @XmlElement(name = "Block_Alerting_if_IP_Principal_Logged_Off")
    protected String blockAlertingIfIPPrincipalLoggedOff;
    @XmlElement(name = "Bridged_Appearance_Origination_Restriction")
    protected String bridgedAppearanceOriginationRestriction;
    @XmlElement(name = "Busy_Auto_Callback_Without_Flash")
    protected String busyAutoCallbackWithoutFlash;
    @XmlElement(name = "Button_Modules")
    protected String buttonModules;
    @XmlElement(name = "Call_Appearance_Display_Format")
    protected String callAppearanceDisplayFormat;
    @XmlElement(name = "IP_Phone_Group_ID")
    protected String ipPhoneGroupID;
    @XmlElement(name = "Precedence_Call_Waiting")
    protected String precedenceCallWaiting;
    @XmlElement(name = "SAC_CF_Override")
    protected String saccfOverride;
    @XmlElement(name = "SIP_Trunk")
    protected String sipTrunk;
    @XmlElement(name = "Time_of_Day_Lock_Table")
    protected String timeOfDayLockTable;
    @XmlElement(name = "Type_of_3PCC_Enabled")
    protected String typeOf3PCCEnabled;
    @XmlElement(name = "XOIP_Endpoint_Type")
    protected String xoipEndpointType;
    @XmlElement(name = "Result_Port")
    protected String resultPort;
    @XmlElement(name = "Maintenance_Name")
    protected String maintenanceName;
    @XmlElement(name = "Alt_Name")
    protected String altName;
    @XmlElement(name = "Result")
    protected String result;
    @XmlElement(name = "Error_Code")
    protected String errorCode;
    @XmlElement(name = "Location")
    protected String location;
    @XmlElement(name = "Abbreviated_Dialing_List_Type")
    protected List<ArrayType> abbreviatedDialingListType;
    @XmlElement(name = "Abbreviated_Dialing_List_Number")
    protected List<ArrayType> abbreviatedDialingListNumber;
    @XmlElement(name = "Button_Data_1")
    protected List<ArrayType> buttonData1;
    @XmlElement(name = "Button_Data_2")
    protected List<ArrayType> buttonData2;
    @XmlElement(name = "Button_Data_3")
    protected List<ArrayType> buttonData3;
    @XmlElement(name = "Button_Data_4")
    protected List<ArrayType> buttonData4;
    @XmlElement(name = "Button_Data_5")
    protected List<ArrayType> buttonData5;
    @XmlElement(name = "Button_Data_6")
    protected List<ArrayType> buttonData6;
    @XmlElement(name = "Button_Data_7")
    protected List<ArrayType> buttonData7;
    @XmlElement(name = "Data_List1")
    protected List<ArrayType> dataList1;
    @XmlElement(name = "Data_Personal_List_Number")
    protected List<ArrayType> dataPersonalListNumber;

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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
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
     * Gets the value of the coveragePath1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoveragePath1() {
        return coveragePath1;
    }

    /**
     * Sets the value of the coveragePath1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoveragePath1(String value) {
        this.coveragePath1 = value;
    }

    /**
     * Gets the value of the coveragePath2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoveragePath2() {
        return coveragePath2;
    }

    /**
     * Sets the value of the coveragePath2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoveragePath2(String value) {
        this.coveragePath2 = value;
    }

    /**
     * Gets the value of the huntToStation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHuntToStation() {
        return huntToStation;
    }

    /**
     * Sets the value of the huntToStation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHuntToStation(String value) {
        this.huntToStation = value;
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
     * Gets the value of the room property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoom() {
        return room;
    }

    /**
     * Sets the value of the room property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoom(String value) {
        this.room = value;
    }

    /**
     * Gets the value of the jack property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJack() {
        return jack;
    }

    /**
     * Sets the value of the jack property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJack(String value) {
        this.jack = value;
    }

    /**
     * Gets the value of the cable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCable() {
        return cable;
    }

    /**
     * Sets the value of the cable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCable(String value) {
        this.cable = value;
    }

    /**
     * Gets the value of the dataExtension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataExtension() {
        return dataExtension;
    }

    /**
     * Sets the value of the dataExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataExtension(String value) {
        this.dataExtension = value;
    }

    /**
     * Gets the value of the survivableGKNodeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurvivableGKNodeName() {
        return survivableGKNodeName;
    }

    /**
     * Sets the value of the survivableGKNodeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurvivableGKNodeName(String value) {
        this.survivableGKNodeName = value;
    }

    /**
     * Gets the value of the tn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTN() {
        return tn;
    }

    /**
     * Sets the value of the tn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTN(String value) {
        this.tn = value;
    }

    /**
     * Gets the value of the lockMessages property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLockMessages() {
        return lockMessages;
    }

    /**
     * Sets the value of the lockMessages property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLockMessages(String value) {
        this.lockMessages = value;
    }

    /**
     * Gets the value of the securityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurityCode() {
        return securityCode;
    }

    /**
     * Sets the value of the securityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurityCode(String value) {
        this.securityCode = value;
    }

    /**
     * Gets the value of the masiNodeNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMASINodeNumber() {
        return masiNodeNumber;
    }

    /**
     * Sets the value of the masiNodeNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMASINodeNumber(String value) {
        this.masiNodeNumber = value;
    }

    /**
     * Gets the value of the mapToStation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMapToStation() {
        return mapToStation;
    }

    /**
     * Sets the value of the mapToStation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMapToStation(String value) {
        this.mapToStation = value;
    }

    /**
     * Gets the value of the automaticMoves property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutomaticMoves() {
        return automaticMoves;
    }

    /**
     * Sets the value of the automaticMoves property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutomaticMoves(String value) {
        this.automaticMoves = value;
    }

    /**
     * Gets the value of the dataModule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataModule() {
        return dataModule;
    }

    /**
     * Sets the value of the dataModule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataModule(String value) {
        this.dataModule = value;
    }

    /**
     * Gets the value of the displayModule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayModule() {
        return displayModule;
    }

    /**
     * Sets the value of the displayModule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayModule(String value) {
        this.displayModule = value;
    }

    /**
     * Gets the value of the displayLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayLanguage() {
        return displayLanguage;
    }

    /**
     * Sets the value of the displayLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayLanguage(String value) {
        this.displayLanguage = value;
    }

    /**
     * Gets the value of the ipei property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPEI() {
        return ipei;
    }

    /**
     * Sets the value of the ipei property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPEI(String value) {
        this.ipei = value;
    }

    /**
     * Gets the value of the accessCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessCode() {
        return accessCode;
    }

    /**
     * Sets the value of the accessCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessCode(String value) {
        this.accessCode = value;
    }

    /**
     * Gets the value of the home property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHome() {
        return home;
    }

    /**
     * Sets the value of the home property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHome(String value) {
        this.home = value;
    }

    /**
     * Gets the value of the ringingPattern property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRingingPattern() {
        return ringingPattern;
    }

    /**
     * Sets the value of the ringingPattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRingingPattern(String value) {
        this.ringingPattern = value;
    }

    /**
     * Gets the value of the messageLampExt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageLampExt() {
        return messageLampExt;
    }

    /**
     * Sets the value of the messageLampExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageLampExt(String value) {
        this.messageLampExt = value;
    }

    /**
     * Gets the value of the mmRemoteDataExt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMMRemoteDataExt() {
        return mmRemoteDataExt;
    }

    /**
     * Sets the value of the mmRemoteDataExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMMRemoteDataExt(String value) {
        this.mmRemoteDataExt = value;
    }

    /**
     * Gets the value of the mmComplexDataExt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMMComplexDataExt() {
        return mmComplexDataExt;
    }

    /**
     * Sets the value of the mmComplexDataExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMMComplexDataExt(String value) {
        this.mmComplexDataExt = value;
    }

    /**
     * Gets the value of the oneStepClearing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOneStepClearing() {
        return oneStepClearing;
    }

    /**
     * Sets the value of the oneStepClearing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOneStepClearing(String value) {
        this.oneStepClearing = value;
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
     * Gets the value of the endptID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndptID() {
        return endptID;
    }

    /**
     * Sets the value of the endptID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndptID(String value) {
        this.endptID = value;
    }

    /**
     * Gets the value of the crvLength property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRVLength() {
        return crvLength;
    }

    /**
     * Sets the value of the crvLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRVLength(String value) {
        this.crvLength = value;
    }

    /**
     * Gets the value of the lwcReception property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLWCReception() {
        return lwcReception;
    }

    /**
     * Sets the value of the lwcReception property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLWCReception(String value) {
        this.lwcReception = value;
    }

    /**
     * Gets the value of the lwcActivation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLWCActivation() {
        return lwcActivation;
    }

    /**
     * Sets the value of the lwcActivation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLWCActivation(String value) {
        this.lwcActivation = value;
    }

    /**
     * Gets the value of the cdrPrivacy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDRPrivacy() {
        return cdrPrivacy;
    }

    /**
     * Sets the value of the cdrPrivacy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDRPrivacy(String value) {
        this.cdrPrivacy = value;
    }

    /**
     * Gets the value of the redirectNotification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedirectNotification() {
        return redirectNotification;
    }

    /**
     * Sets the value of the redirectNotification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedirectNotification(String value) {
        this.redirectNotification = value;
    }

    /**
     * Gets the value of the perButtonRingControl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerButtonRingControl() {
        return perButtonRingControl;
    }

    /**
     * Sets the value of the perButtonRingControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerButtonRingControl(String value) {
        this.perButtonRingControl = value;
    }

    /**
     * Gets the value of the bridgedCallAlerting property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBridgedCallAlerting() {
        return bridgedCallAlerting;
    }

    /**
     * Sets the value of the bridgedCallAlerting property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBridgedCallAlerting(String value) {
        this.bridgedCallAlerting = value;
    }

    /**
     * Gets the value of the activeStationRinging property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActiveStationRinging() {
        return activeStationRinging;
    }

    /**
     * Sets the value of the activeStationRinging property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActiveStationRinging(String value) {
        this.activeStationRinging = value;
    }

    /**
     * Gets the value of the idleActiveRinging property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdleActiveRinging() {
        return idleActiveRinging;
    }

    /**
     * Sets the value of the idleActiveRinging property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdleActiveRinging(String value) {
        this.idleActiveRinging = value;
    }

    /**
     * Gets the value of the h320Conversion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getH320Conversion() {
        return h320Conversion;
    }

    /**
     * Sets the value of the h320Conversion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setH320Conversion(String value) {
        this.h320Conversion = value;
    }

    /**
     * Gets the value of the ipAudioHairpinning property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPAudioHairpinning() {
        return ipAudioHairpinning;
    }

    /**
     * Sets the value of the ipAudioHairpinning property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPAudioHairpinning(String value) {
        this.ipAudioHairpinning = value;
    }

    /**
     * Gets the value of the primeAppearancePreference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimeAppearancePreference() {
        return primeAppearancePreference;
    }

    /**
     * Sets the value of the primeAppearancePreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimeAppearancePreference(String value) {
        this.primeAppearancePreference = value;
    }

    /**
     * Gets the value of the expansionModule24 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpansionModule24() {
        return expansionModule24;
    }

    /**
     * Sets the value of the expansionModule24 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpansionModule24(String value) {
        this.expansionModule24 = value;
    }

    /**
     * Gets the value of the directIPIPAudioConnections property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectIPIPAudioConnections() {
        return directIPIPAudioConnections;
    }

    /**
     * Sets the value of the directIPIPAudioConnections property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectIPIPAudioConnections(String value) {
        this.directIPIPAudioConnections = value;
    }

    /**
     * Gets the value of the lossGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLossGroup() {
        return lossGroup;
    }

    /**
     * Sets the value of the lossGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLossGroup(String value) {
        this.lossGroup = value;
    }

    /**
     * Gets the value of the featureModule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeatureModule() {
        return featureModule;
    }

    /**
     * Sets the value of the featureModule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeatureModule(String value) {
        this.featureModule = value;
    }

    /**
     * Gets the value of the coverageModule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoverageModule() {
        return coverageModule;
    }

    /**
     * Sets the value of the coverageModule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoverageModule(String value) {
        this.coverageModule = value;
    }

    /**
     * Gets the value of the coverageModule1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoverageModule1() {
        return coverageModule1;
    }

    /**
     * Sets the value of the coverageModule1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoverageModule1(String value) {
        this.coverageModule1 = value;
    }

    /**
     * Gets the value of the remoteOfficePhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteOfficePhone() {
        return remoteOfficePhone;
    }

    /**
     * Sets the value of the remoteOfficePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteOfficePhone(String value) {
        this.remoteOfficePhone = value;
    }

    /**
     * Gets the value of the coverageAfterForwarding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoverageAfterForwarding() {
        return coverageAfterForwarding;
    }

    /**
     * Sets the value of the coverageAfterForwarding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoverageAfterForwarding(String value) {
        this.coverageAfterForwarding = value;
    }

    /**
     * Gets the value of the ipEmergencyCalls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPEmergencyCalls() {
        return ipEmergencyCalls;
    }

    /**
     * Sets the value of the ipEmergencyCalls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPEmergencyCalls(String value) {
        this.ipEmergencyCalls = value;
    }

    /**
     * Gets the value of the emergencyLocationExt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmergencyLocationExt() {
        return emergencyLocationExt;
    }

    /**
     * Sets the value of the emergencyLocationExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmergencyLocationExt(String value) {
        this.emergencyLocationExt = value;
    }

    /**
     * Gets the value of the configurationSet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfigurationSet() {
        return configurationSet;
    }

    /**
     * Sets the value of the configurationSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfigurationSet(String value) {
        this.configurationSet = value;
    }

    /**
     * Gets the value of the xMobileType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXMobileType() {
        return xMobileType;
    }

    /**
     * Sets the value of the xMobileType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXMobileType(String value) {
        this.xMobileType = value;
    }

    /**
     * Gets the value of the lwcLogExternalCalls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLWCLogExternalCalls() {
        return lwcLogExternalCalls;
    }

    /**
     * Sets the value of the lwcLogExternalCalls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLWCLogExternalCalls(String value) {
        this.lwcLogExternalCalls = value;
    }

    /**
     * Gets the value of the speakerphone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeakerphone() {
        return speakerphone;
    }

    /**
     * Sets the value of the speakerphone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeakerphone(String value) {
        this.speakerphone = value;
    }

    /**
     * Gets the value of the dialPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDialPrefix() {
        return dialPrefix;
    }

    /**
     * Sets the value of the dialPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDialPrefix(String value) {
        this.dialPrefix = value;
    }

    /**
     * Gets the value of the cellPhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCellPhoneNumber() {
        return cellPhoneNumber;
    }

    /**
     * Sets the value of the cellPhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCellPhoneNumber(String value) {
        this.cellPhoneNumber = value;
    }

    /**
     * Gets the value of the mappingMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMappingMode() {
        return mappingMode;
    }

    /**
     * Sets the value of the mappingMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMappingMode(String value) {
        this.mappingMode = value;
    }

    /**
     * Gets the value of the mobilityTrunkGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobilityTrunkGroup() {
        return mobilityTrunkGroup;
    }

    /**
     * Sets the value of the mobilityTrunkGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobilityTrunkGroup(String value) {
        this.mobilityTrunkGroup = value;
    }

    /**
     * Gets the value of the switchhookFlash property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSwitchhookFlash() {
        return switchhookFlash;
    }

    /**
     * Sets the value of the switchhookFlash property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSwitchhookFlash(String value) {
        this.switchhookFlash = value;
    }

    /**
     * Gets the value of the distinctiveAudibleAlert property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistinctiveAudibleAlert() {
        return distinctiveAudibleAlert;
    }

    /**
     * Sets the value of the distinctiveAudibleAlert property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistinctiveAudibleAlert(String value) {
        this.distinctiveAudibleAlert = value;
    }

    /**
     * Gets the value of the messageWaitingType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageWaitingType() {
        return messageWaitingType;
    }

    /**
     * Sets the value of the messageWaitingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageWaitingType(String value) {
        this.messageWaitingType = value;
    }

    /**
     * Gets the value of the lengthOfDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLengthOfDisplay() {
        return lengthOfDisplay;
    }

    /**
     * Sets the value of the lengthOfDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLengthOfDisplay(String value) {
        this.lengthOfDisplay = value;
    }

    /**
     * Gets the value of the serviceLinkMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceLinkMode() {
        return serviceLinkMode;
    }

    /**
     * Sets the value of the serviceLinkMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceLinkMode(String value) {
        this.serviceLinkMode = value;
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
     * Gets the value of the audixName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUDIXName() {
        return audixName;
    }

    /**
     * Sets the value of the audixName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUDIXName(String value) {
        this.audixName = value;
    }

    /**
     * Gets the value of the messagingServerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessagingServerName() {
        return messagingServerName;
    }

    /**
     * Sets the value of the messagingServerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessagingServerName(String value) {
        this.messagingServerName = value;
    }

    /**
     * Gets the value of the autoSelectIdleAppear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoSelectIdleAppear() {
        return autoSelectIdleAppear;
    }

    /**
     * Sets the value of the autoSelectIdleAppear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutoSelectIdleAppear(String value) {
        this.autoSelectIdleAppear = value;
    }

    /**
     * Gets the value of the confTransOnPrimaryAppearance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfTransOnPrimaryAppearance() {
        return confTransOnPrimaryAppearance;
    }

    /**
     * Sets the value of the confTransOnPrimaryAppearance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfTransOnPrimaryAppearance(String value) {
        this.confTransOnPrimaryAppearance = value;
    }

    /**
     * Gets the value of the coverageMsgRetrieval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoverageMsgRetrieval() {
        return coverageMsgRetrieval;
    }

    /**
     * Sets the value of the coverageMsgRetrieval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoverageMsgRetrieval(String value) {
        this.coverageMsgRetrieval = value;
    }

    /**
     * Gets the value of the autoAnswer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoAnswer() {
        return autoAnswer;
    }

    /**
     * Sets the value of the autoAnswer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutoAnswer(String value) {
        this.autoAnswer = value;
    }

    /**
     * Gets the value of the dataRestriction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataRestriction() {
        return dataRestriction;
    }

    /**
     * Sets the value of the dataRestriction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataRestriction(String value) {
        this.dataRestriction = value;
    }

    /**
     * Gets the value of the idleAppearance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdleAppearance() {
        return idleAppearance;
    }

    /**
     * Sets the value of the idleAppearance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdleAppearance(String value) {
        this.idleAppearance = value;
    }

    /**
     * Gets the value of the bridgedIdleLine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBridgedIdleLine() {
        return bridgedIdleLine;
    }

    /**
     * Sets the value of the bridgedIdleLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBridgedIdleLine(String value) {
        this.bridgedIdleLine = value;
    }

    /**
     * Gets the value of the restrictLastAppearance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRestrictLastAppearance() {
        return restrictLastAppearance;
    }

    /**
     * Sets the value of the restrictLastAppearance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRestrictLastAppearance(String value) {
        this.restrictLastAppearance = value;
    }

    /**
     * Gets the value of the flashForAnswerHold property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlashForAnswerHold() {
        return flashForAnswerHold;
    }

    /**
     * Sets the value of the flashForAnswerHold property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlashForAnswerHold(String value) {
        this.flashForAnswerHold = value;
    }

    /**
     * Gets the value of the cpnSendCallingNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCPNSendCallingNo() {
        return cpnSendCallingNo;
    }

    /**
     * Sets the value of the cpnSendCallingNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCPNSendCallingNo(String value) {
        this.cpnSendCallingNo = value;
    }

    /**
     * Gets the value of the multimediaEarlyAnswer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMultimediaEarlyAnswer() {
        return multimediaEarlyAnswer;
    }

    /**
     * Sets the value of the multimediaEarlyAnswer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMultimediaEarlyAnswer(String value) {
        this.multimediaEarlyAnswer = value;
    }

    /**
     * Gets the value of the audibleMsgWaiting property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAudibleMsgWaiting() {
        return audibleMsgWaiting;
    }

    /**
     * Sets the value of the audibleMsgWaiting property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAudibleMsgWaiting(String value) {
        this.audibleMsgWaiting = value;
    }

    /**
     * Gets the value of the displayClientRedirection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayClientRedirection() {
        return displayClientRedirection;
    }

    /**
     * Sets the value of the displayClientRedirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayClientRedirection(String value) {
        this.displayClientRedirection = value;
    }

    /**
     * Gets the value of the selectLastUsedAppear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelectLastUsedAppear() {
        return selectLastUsedAppear;
    }

    /**
     * Sets the value of the selectLastUsedAppear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelectLastUsedAppear(String value) {
        this.selectLastUsedAppear = value;
    }

    /**
     * Gets the value of the restrictedNumberChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRestrictedNumberChar() {
        return restrictedNumberChar;
    }

    /**
     * Sets the value of the restrictedNumberChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRestrictedNumberChar(String value) {
        this.restrictedNumberChar = value;
    }

    /**
     * Gets the value of the floor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFloor() {
        return floor;
    }

    /**
     * Sets the value of the floor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFloor(String value) {
        this.floor = value;
    }

    /**
     * Gets the value of the building property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuilding() {
        return building;
    }

    /**
     * Sets the value of the building property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuilding(String value) {
        this.building = value;
    }

    /**
     * Gets the value of the headset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeadset() {
        return headset;
    }

    /**
     * Sets the value of the headset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeadset(String value) {
        this.headset = value;
    }

    /**
     * Gets the value of the speaker property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeaker() {
        return speaker;
    }

    /**
     * Sets the value of the speaker property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeaker(String value) {
        this.speaker = value;
    }

    /**
     * Gets the value of the mounting property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMounting() {
        return mounting;
    }

    /**
     * Sets the value of the mounting property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMounting(String value) {
        this.mounting = value;
    }

    /**
     * Gets the value of the cordLength property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCordLength() {
        return cordLength;
    }

    /**
     * Sets the value of the cordLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCordLength(String value) {
        this.cordLength = value;
    }

    /**
     * Gets the value of the setColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSetColor() {
        return setColor;
    }

    /**
     * Sets the value of the setColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSetColor(String value) {
        this.setColor = value;
    }

    /**
     * Gets the value of the hotLineDestinationListNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotLineDestinationListNumber() {
        return hotLineDestinationListNumber;
    }

    /**
     * Sets the value of the hotLineDestinationListNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotLineDestinationListNumber(String value) {
        this.hotLineDestinationListNumber = value;
    }

    /**
     * Gets the value of the dialCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDialCode() {
        return dialCode;
    }

    /**
     * Sets the value of the dialCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDialCode(String value) {
        this.dialCode = value;
    }

    /**
     * Gets the value of the info1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfo1() {
        return info1;
    }

    /**
     * Sets the value of the info1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfo1(String value) {
        this.info1 = value;
    }

    /**
     * Gets the value of the info2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfo2() {
        return info2;
    }

    /**
     * Sets the value of the info2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfo2(String value) {
        this.info2 = value;
    }

    /**
     * Gets the value of the dataName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataName() {
        return dataName;
    }

    /**
     * Sets the value of the dataName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataName(String value) {
        this.dataName = value;
    }

    /**
     * Gets the value of the dataBCC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataBCC() {
        return dataBCC;
    }

    /**
     * Sets the value of the dataBCC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataBCC(String value) {
        this.dataBCC = value;
    }

    /**
     * Gets the value of the dataCOS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataCOS() {
        return dataCOS;
    }

    /**
     * Sets the value of the dataCOS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataCOS(String value) {
        this.dataCOS = value;
    }

    /**
     * Gets the value of the dataCOR property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataCOR() {
        return dataCOR;
    }

    /**
     * Sets the value of the dataCOR property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataCOR(String value) {
        this.dataCOR = value;
    }

    /**
     * Gets the value of the dataITC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataITC() {
        return dataITC;
    }

    /**
     * Sets the value of the dataITC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataITC(String value) {
        this.dataITC = value;
    }

    /**
     * Gets the value of the dataTN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataTN() {
        return dataTN;
    }

    /**
     * Sets the value of the dataTN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataTN(String value) {
        this.dataTN = value;
    }

    /**
     * Gets the value of the dataSpecialDialingOption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataSpecialDialingOption() {
        return dataSpecialDialingOption;
    }

    /**
     * Sets the value of the dataSpecialDialingOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataSpecialDialingOption(String value) {
        this.dataSpecialDialingOption = value;
    }

    /**
     * Gets the value of the dataAbbreviatedDialingDialCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataAbbreviatedDialingDialCode() {
        return dataAbbreviatedDialingDialCode;
    }

    /**
     * Sets the value of the dataAbbreviatedDialingDialCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataAbbreviatedDialingDialCode(String value) {
        this.dataAbbreviatedDialingDialCode = value;
    }

    /**
     * Gets the value of the dataMultimedia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataMultimedia() {
        return dataMultimedia;
    }

    /**
     * Sets the value of the dataMultimedia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataMultimedia(String value) {
        this.dataMultimedia = value;
    }

    /**
     * Gets the value of the dataPrivateLineEmulation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataPrivateLineEmulation() {
        return dataPrivateLineEmulation;
    }

    /**
     * Sets the value of the dataPrivateLineEmulation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataPrivateLineEmulation(String value) {
        this.dataPrivateLineEmulation = value;
    }

    /**
     * Gets the value of the dataDefaultDuplex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataDefaultDuplex() {
        return dataDefaultDuplex;
    }

    /**
     * Sets the value of the dataDefaultDuplex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataDefaultDuplex(String value) {
        this.dataDefaultDuplex = value;
    }

    /**
     * Gets the value of the dataDefaultMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataDefaultMode() {
        return dataDefaultMode;
    }

    /**
     * Sets the value of the dataDefaultMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataDefaultMode(String value) {
        this.dataDefaultMode = value;
    }

    /**
     * Gets the value of the dataDefaultSpeed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataDefaultSpeed() {
        return dataDefaultSpeed;
    }

    /**
     * Sets the value of the dataDefaultSpeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataDefaultSpeed(String value) {
        this.dataDefaultSpeed = value;
    }

    /**
     * Gets the value of the dataDefaultITC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataDefaultITC() {
        return dataDefaultITC;
    }

    /**
     * Sets the value of the dataDefaultITC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataDefaultITC(String value) {
        this.dataDefaultITC = value;
    }

    /**
     * Gets the value of the dataDefaultDataApplication property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataDefaultDataApplication() {
        return dataDefaultDataApplication;
    }

    /**
     * Sets the value of the dataDefaultDataApplication property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataDefaultDataApplication(String value) {
        this.dataDefaultDataApplication = value;
    }

    /**
     * Gets the value of the mwiServedUserType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMWIServedUserType() {
        return mwiServedUserType;
    }

    /**
     * Sets the value of the mwiServedUserType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMWIServedUserType(String value) {
        this.mwiServedUserType = value;
    }

    /**
     * Gets the value of the tests property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTests() {
        return tests;
    }

    /**
     * Sets the value of the tests property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTests(String value) {
        this.tests = value;
    }

    /**
     * Gets the value of the messageWaitingIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageWaitingIndicator() {
        return messageWaitingIndicator;
    }

    /**
     * Sets the value of the messageWaitingIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageWaitingIndicator(String value) {
        this.messageWaitingIndicator = value;
    }

    /**
     * Gets the value of the ignoreRotaryDigits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIgnoreRotaryDigits() {
        return ignoreRotaryDigits;
    }

    /**
     * Sets the value of the ignoreRotaryDigits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIgnoreRotaryDigits(String value) {
        this.ignoreRotaryDigits = value;
    }

    /**
     * Gets the value of the callWaitingIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallWaitingIndicator() {
        return callWaitingIndicator;
    }

    /**
     * Sets the value of the callWaitingIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallWaitingIndicator(String value) {
        this.callWaitingIndicator = value;
    }

    /**
     * Gets the value of the attCallWaitingIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttCallWaitingIndicator() {
        return attCallWaitingIndicator;
    }

    /**
     * Sets the value of the attCallWaitingIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttCallWaitingIndicator(String value) {
        this.attCallWaitingIndicator = value;
    }

    /**
     * Gets the value of the adjunctSupervision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdjunctSupervision() {
        return adjunctSupervision;
    }

    /**
     * Sets the value of the adjunctSupervision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdjunctSupervision(String value) {
        this.adjunctSupervision = value;
    }

    /**
     * Gets the value of the ipHoteling property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPHoteling() {
        return ipHoteling;
    }

    /**
     * Sets the value of the ipHoteling property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPHoteling(String value) {
        this.ipHoteling = value;
    }

    /**
     * Gets the value of the ipSoftphone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPSoftphone() {
        return ipSoftphone;
    }

    /**
     * Sets the value of the ipSoftphone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPSoftphone(String value) {
        this.ipSoftphone = value;
    }

    /**
     * Gets the value of the ipVideo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPVideo() {
        return ipVideo;
    }

    /**
     * Sets the value of the ipVideo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPVideo(String value) {
        this.ipVideo = value;
    }

    /**
     * Gets the value of the ec500State property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEC500State() {
        return ec500State;
    }

    /**
     * Sets the value of the ec500State property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEC500State(String value) {
        this.ec500State = value;
    }

    /**
     * Gets the value of the nativeName1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNativeName1() {
        return nativeName1;
    }

    /**
     * Sets the value of the nativeName1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNativeName1(String value) {
        this.nativeName1 = value;
    }

    /**
     * Gets the value of the nativeName2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNativeName2() {
        return nativeName2;
    }

    /**
     * Sets the value of the nativeName2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNativeName2(String value) {
        this.nativeName2 = value;
    }

    /**
     * Gets the value of the nativeName3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNativeName3() {
        return nativeName3;
    }

    /**
     * Sets the value of the nativeName3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNativeName3(String value) {
        this.nativeName3 = value;
    }

    /**
     * Gets the value of the nativeName4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNativeName4() {
        return nativeName4;
    }

    /**
     * Sets the value of the nativeName4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNativeName4(String value) {
        this.nativeName4 = value;
    }

    /**
     * Gets the value of the nativeName5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNativeName5() {
        return nativeName5;
    }

    /**
     * Sets the value of the nativeName5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNativeName5(String value) {
        this.nativeName5 = value;
    }

    /**
     * Gets the value of the nativeNameScripts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNativeNameScripts() {
        return nativeNameScripts;
    }

    /**
     * Sets the value of the nativeNameScripts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNativeNameScripts(String value) {
        this.nativeNameScripts = value;
    }

    /**
     * Gets the value of the unconditionalForInternalCallsTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnconditionalForInternalCallsTo() {
        return unconditionalForInternalCallsTo;
    }

    /**
     * Sets the value of the unconditionalForInternalCallsTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnconditionalForInternalCallsTo(String value) {
        this.unconditionalForInternalCallsTo = value;
    }

    /**
     * Gets the value of the unconditionalForInternalCallsToActive property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnconditionalForInternalCallsToActive() {
        return unconditionalForInternalCallsToActive;
    }

    /**
     * Sets the value of the unconditionalForInternalCallsToActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnconditionalForInternalCallsToActive(String value) {
        this.unconditionalForInternalCallsToActive = value;
    }

    /**
     * Gets the value of the unconditionalForExternalCallsTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnconditionalForExternalCallsTo() {
        return unconditionalForExternalCallsTo;
    }

    /**
     * Sets the value of the unconditionalForExternalCallsTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnconditionalForExternalCallsTo(String value) {
        this.unconditionalForExternalCallsTo = value;
    }

    /**
     * Gets the value of the unconditionalForExternalCallsToActive property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnconditionalForExternalCallsToActive() {
        return unconditionalForExternalCallsToActive;
    }

    /**
     * Sets the value of the unconditionalForExternalCallsToActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnconditionalForExternalCallsToActive(String value) {
        this.unconditionalForExternalCallsToActive = value;
    }

    /**
     * Gets the value of the busyForInternalCallsTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusyForInternalCallsTo() {
        return busyForInternalCallsTo;
    }

    /**
     * Sets the value of the busyForInternalCallsTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusyForInternalCallsTo(String value) {
        this.busyForInternalCallsTo = value;
    }

    /**
     * Gets the value of the busyForInternalCallsToActive property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusyForInternalCallsToActive() {
        return busyForInternalCallsToActive;
    }

    /**
     * Sets the value of the busyForInternalCallsToActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusyForInternalCallsToActive(String value) {
        this.busyForInternalCallsToActive = value;
    }

    /**
     * Gets the value of the busyForExternalCallsTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusyForExternalCallsTo() {
        return busyForExternalCallsTo;
    }

    /**
     * Sets the value of the busyForExternalCallsTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusyForExternalCallsTo(String value) {
        this.busyForExternalCallsTo = value;
    }

    /**
     * Gets the value of the busyForExternalCallsToActive property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusyForExternalCallsToActive() {
        return busyForExternalCallsToActive;
    }

    /**
     * Sets the value of the busyForExternalCallsToActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusyForExternalCallsToActive(String value) {
        this.busyForExternalCallsToActive = value;
    }

    /**
     * Gets the value of the noReplyForInternalCallsTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoReplyForInternalCallsTo() {
        return noReplyForInternalCallsTo;
    }

    /**
     * Sets the value of the noReplyForInternalCallsTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoReplyForInternalCallsTo(String value) {
        this.noReplyForInternalCallsTo = value;
    }

    /**
     * Gets the value of the noReplyForInternalCallsToActive property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoReplyForInternalCallsToActive() {
        return noReplyForInternalCallsToActive;
    }

    /**
     * Sets the value of the noReplyForInternalCallsToActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoReplyForInternalCallsToActive(String value) {
        this.noReplyForInternalCallsToActive = value;
    }

    /**
     * Gets the value of the noReplyForExternalCallsTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoReplyForExternalCallsTo() {
        return noReplyForExternalCallsTo;
    }

    /**
     * Sets the value of the noReplyForExternalCallsTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoReplyForExternalCallsTo(String value) {
        this.noReplyForExternalCallsTo = value;
    }

    /**
     * Gets the value of the noReplyForExternalCallsToActive property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoReplyForExternalCallsToActive() {
        return noReplyForExternalCallsToActive;
    }

    /**
     * Sets the value of the noReplyForExternalCallsToActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoReplyForExternalCallsToActive(String value) {
        this.noReplyForExternalCallsToActive = value;
    }

    /**
     * Gets the value of the set property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSet() {
        return set;
    }

    /**
     * Sets the value of the set property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSet(String value) {
        this.set = value;
    }

    /**
     * Gets the value of the dataOption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataOption() {
        return dataOption;
    }

    /**
     * Sets the value of the dataOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataOption(String value) {
        this.dataOption = value;
    }

    /**
     * Gets the value of the offPremisesStations property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffPremisesStations() {
        return offPremisesStations;
    }

    /**
     * Sets the value of the offPremisesStations property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffPremisesStations(String value) {
        this.offPremisesStations = value;
    }

    /**
     * Gets the value of the rBalanceNetwork property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRBalanceNetwork() {
        return rBalanceNetwork;
    }

    /**
     * Sets the value of the rBalanceNetwork property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRBalanceNetwork(String value) {
        this.rBalanceNetwork = value;
    }

    /**
     * Gets the value of the passageway property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassageway() {
        return passageway;
    }

    /**
     * Sets the value of the passageway property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassageway(String value) {
        this.passageway = value;
    }

    /**
     * Gets the value of the model property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModel() {
        return model;
    }

    /**
     * Sets the value of the model property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModel(String value) {
        this.model = value;
    }

    /**
     * Gets the value of the displayCartridge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayCartridge() {
        return displayCartridge;
    }

    /**
     * Sets the value of the displayCartridge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayCartridge(String value) {
        this.displayCartridge = value;
    }

    /**
     * Gets the value of the muteButtonEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMuteButtonEnabled() {
        return muteButtonEnabled;
    }

    /**
     * Sets the value of the muteButtonEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMuteButtonEnabled(String value) {
        this.muteButtonEnabled = value;
    }

    /**
     * Gets the value of the customizableLabels property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomizableLabels() {
        return customizableLabels;
    }

    /**
     * Sets the value of the customizableLabels property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomizableLabels(String value) {
        this.customizableLabels = value;
    }

    /**
     * Gets the value of the displayCallerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayCallerID() {
        return displayCallerID;
    }

    /**
     * Sets the value of the displayCallerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayCallerID(String value) {
        this.displayCallerID = value;
    }

    /**
     * Gets the value of the callerIDMessageWaitingIndication property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallerIDMessageWaitingIndication() {
        return callerIDMessageWaitingIndication;
    }

    /**
     * Sets the value of the callerIDMessageWaitingIndication property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallerIDMessageWaitingIndication(String value) {
        this.callerIDMessageWaitingIndication = value;
    }

    /**
     * Gets the value of the xid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXID() {
        return xid;
    }

    /**
     * Sets the value of the xid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXID(String value) {
        this.xid = value;
    }

    /**
     * Gets the value of the fixedTEI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFixedTEI() {
        return fixedTEI;
    }

    /**
     * Sets the value of the fixedTEI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFixedTEI(String value) {
        this.fixedTEI = value;
    }

    /**
     * Gets the value of the tei property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTEI() {
        return tei;
    }

    /**
     * Sets the value of the tei property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTEI(String value) {
        this.tei = value;
    }

    /**
     * Gets the value of the secureTerminalEquipment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecureTerminalEquipment() {
        return secureTerminalEquipment;
    }

    /**
     * Sets the value of the secureTerminalEquipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecureTerminalEquipment(String value) {
        this.secureTerminalEquipment = value;
    }

    /**
     * Gets the value of the mimSupport property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMIMSupport() {
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
    public void setMIMSupport(String value) {
        this.mimSupport = value;
    }

    /**
     * Gets the value of the mimMaintenanceAndManagement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMIMMaintenanceAndManagement() {
        return mimMaintenanceAndManagement;
    }

    /**
     * Sets the value of the mimMaintenanceAndManagement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMIMMaintenanceAndManagement(String value) {
        this.mimMaintenanceAndManagement = value;
    }

    /**
     * Gets the value of the spid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPID() {
        return spid;
    }

    /**
     * Sets the value of the spid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPID(String value) {
        this.spid = value;
    }

    /**
     * Gets the value of the survivableCOR property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurvivableCOR() {
        return survivableCOR;
    }

    /**
     * Sets the value of the survivableCOR property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurvivableCOR(String value) {
        this.survivableCOR = value;
    }

    /**
     * Gets the value of the survivableTrunkDestination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurvivableTrunkDestination() {
        return survivableTrunkDestination;
    }

    /**
     * Sets the value of the survivableTrunkDestination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurvivableTrunkDestination(String value) {
        this.survivableTrunkDestination = value;
    }

    /**
     * Gets the value of the dtmfOverIP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTMFOverIP() {
        return dtmfOverIP;
    }

    /**
     * Sets the value of the dtmfOverIP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTMFOverIP(String value) {
        this.dtmfOverIP = value;
    }

    /**
     * Gets the value of the recallRotaryDigit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecallRotaryDigit() {
        return recallRotaryDigit;
    }

    /**
     * Sets the value of the recallRotaryDigit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecallRotaryDigit(String value) {
        this.recallRotaryDigit = value;
    }

    /**
     * Gets the value of the alwaysUse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlwaysUse() {
        return alwaysUse;
    }

    /**
     * Sets the value of the alwaysUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlwaysUse(String value) {
        this.alwaysUse = value;
    }

    /**
     * Gets the value of the emuLoginAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMULoginAllowed() {
        return emuLoginAllowed;
    }

    /**
     * Sets the value of the emuLoginAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMULoginAllowed(String value) {
        this.emuLoginAllowed = value;
    }

    /**
     * Gets the value of the callsAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallsAllowed() {
        return callsAllowed;
    }

    /**
     * Sets the value of the callsAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallsAllowed(String value) {
        this.callsAllowed = value;
    }

    /**
     * Gets the value of the endptInit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndptInit() {
        return endptInit;
    }

    /**
     * Sets the value of the endptInit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndptInit(String value) {
        this.endptInit = value;
    }

    /**
     * Gets the value of the blockAlertingIfIPPrincipalLoggedOff property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlockAlertingIfIPPrincipalLoggedOff() {
        return blockAlertingIfIPPrincipalLoggedOff;
    }

    /**
     * Sets the value of the blockAlertingIfIPPrincipalLoggedOff property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlockAlertingIfIPPrincipalLoggedOff(String value) {
        this.blockAlertingIfIPPrincipalLoggedOff = value;
    }

    /**
     * Gets the value of the bridgedAppearanceOriginationRestriction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBridgedAppearanceOriginationRestriction() {
        return bridgedAppearanceOriginationRestriction;
    }

    /**
     * Sets the value of the bridgedAppearanceOriginationRestriction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBridgedAppearanceOriginationRestriction(String value) {
        this.bridgedAppearanceOriginationRestriction = value;
    }

    /**
     * Gets the value of the busyAutoCallbackWithoutFlash property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusyAutoCallbackWithoutFlash() {
        return busyAutoCallbackWithoutFlash;
    }

    /**
     * Sets the value of the busyAutoCallbackWithoutFlash property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusyAutoCallbackWithoutFlash(String value) {
        this.busyAutoCallbackWithoutFlash = value;
    }

    /**
     * Gets the value of the buttonModules property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getButtonModules() {
        return buttonModules;
    }

    /**
     * Sets the value of the buttonModules property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setButtonModules(String value) {
        this.buttonModules = value;
    }

    /**
     * Gets the value of the callAppearanceDisplayFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallAppearanceDisplayFormat() {
        return callAppearanceDisplayFormat;
    }

    /**
     * Sets the value of the callAppearanceDisplayFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallAppearanceDisplayFormat(String value) {
        this.callAppearanceDisplayFormat = value;
    }

    /**
     * Gets the value of the ipPhoneGroupID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPPhoneGroupID() {
        return ipPhoneGroupID;
    }

    /**
     * Sets the value of the ipPhoneGroupID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPPhoneGroupID(String value) {
        this.ipPhoneGroupID = value;
    }

    /**
     * Gets the value of the precedenceCallWaiting property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrecedenceCallWaiting() {
        return precedenceCallWaiting;
    }

    /**
     * Sets the value of the precedenceCallWaiting property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrecedenceCallWaiting(String value) {
        this.precedenceCallWaiting = value;
    }

    /**
     * Gets the value of the saccfOverride property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSACCFOverride() {
        return saccfOverride;
    }

    /**
     * Sets the value of the saccfOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSACCFOverride(String value) {
        this.saccfOverride = value;
    }

    /**
     * Gets the value of the sipTrunk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSIPTrunk() {
        return sipTrunk;
    }

    /**
     * Sets the value of the sipTrunk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSIPTrunk(String value) {
        this.sipTrunk = value;
    }

    /**
     * Gets the value of the timeOfDayLockTable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeOfDayLockTable() {
        return timeOfDayLockTable;
    }

    /**
     * Sets the value of the timeOfDayLockTable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeOfDayLockTable(String value) {
        this.timeOfDayLockTable = value;
    }

    /**
     * Gets the value of the typeOf3PCCEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeOf3PCCEnabled() {
        return typeOf3PCCEnabled;
    }

    /**
     * Sets the value of the typeOf3PCCEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeOf3PCCEnabled(String value) {
        this.typeOf3PCCEnabled = value;
    }

    /**
     * Gets the value of the xoipEndpointType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXOIPEndpointType() {
        return xoipEndpointType;
    }

    /**
     * Sets the value of the xoipEndpointType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXOIPEndpointType(String value) {
        this.xoipEndpointType = value;
    }

    /**
     * Gets the value of the resultPort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultPort() {
        return resultPort;
    }

    /**
     * Sets the value of the resultPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultPort(String value) {
        this.resultPort = value;
    }

    /**
     * Gets the value of the maintenanceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaintenanceName() {
        return maintenanceName;
    }

    /**
     * Sets the value of the maintenanceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaintenanceName(String value) {
        this.maintenanceName = value;
    }

    /**
     * Gets the value of the altName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltName() {
        return altName;
    }

    /**
     * Sets the value of the altName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltName(String value) {
        this.altName = value;
    }

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResult(String value) {
        this.result = value;
    }

    /**
     * Gets the value of the errorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorCode(String value) {
        this.errorCode = value;
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
     * Gets the value of the abbreviatedDialingListType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the abbreviatedDialingListType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAbbreviatedDialingListType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getAbbreviatedDialingListType() {
        if (abbreviatedDialingListType == null) {
            abbreviatedDialingListType = new ArrayList<ArrayType>();
        }
        return this.abbreviatedDialingListType;
    }

    /**
     * Gets the value of the abbreviatedDialingListNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the abbreviatedDialingListNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAbbreviatedDialingListNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getAbbreviatedDialingListNumber() {
        if (abbreviatedDialingListNumber == null) {
            abbreviatedDialingListNumber = new ArrayList<ArrayType>();
        }
        return this.abbreviatedDialingListNumber;
    }

    /**
     * Gets the value of the buttonData1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the buttonData1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getButtonData1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getButtonData1() {
        if (buttonData1 == null) {
            buttonData1 = new ArrayList<ArrayType>();
        }
        return this.buttonData1;
    }

    /**
     * Gets the value of the buttonData2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the buttonData2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getButtonData2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getButtonData2() {
        if (buttonData2 == null) {
            buttonData2 = new ArrayList<ArrayType>();
        }
        return this.buttonData2;
    }

    /**
     * Gets the value of the buttonData3 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the buttonData3 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getButtonData3().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getButtonData3() {
        if (buttonData3 == null) {
            buttonData3 = new ArrayList<ArrayType>();
        }
        return this.buttonData3;
    }

    /**
     * Gets the value of the buttonData4 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the buttonData4 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getButtonData4().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getButtonData4() {
        if (buttonData4 == null) {
            buttonData4 = new ArrayList<ArrayType>();
        }
        return this.buttonData4;
    }

    /**
     * Gets the value of the buttonData5 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the buttonData5 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getButtonData5().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getButtonData5() {
        if (buttonData5 == null) {
            buttonData5 = new ArrayList<ArrayType>();
        }
        return this.buttonData5;
    }

    /**
     * Gets the value of the buttonData6 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the buttonData6 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getButtonData6().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getButtonData6() {
        if (buttonData6 == null) {
            buttonData6 = new ArrayList<ArrayType>();
        }
        return this.buttonData6;
    }

    /**
     * Gets the value of the buttonData7 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the buttonData7 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getButtonData7().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getButtonData7() {
        if (buttonData7 == null) {
            buttonData7 = new ArrayList<ArrayType>();
        }
        return this.buttonData7;
    }

    /**
     * Gets the value of the dataList1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataList1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataList1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getDataList1() {
        if (dataList1 == null) {
            dataList1 = new ArrayList<ArrayType>();
        }
        return this.dataList1;
    }

    /**
     * Gets the value of the dataPersonalListNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataPersonalListNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataPersonalListNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getDataPersonalListNumber() {
        if (dataPersonalListNumber == null) {
            dataPersonalListNumber = new ArrayList<ArrayType>();
        }
        return this.dataPersonalListNumber;
    }

}
