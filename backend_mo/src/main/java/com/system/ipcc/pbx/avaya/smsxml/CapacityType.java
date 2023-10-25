
package com.system.ipcc.pbx.avaya.smsxml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CapacityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CapacityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Current_Sys_Mem_Config" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Aar_Ars_Patterns_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Aar_Ars_Patterns_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Aar_Ars_Pattrn_Sys_Lim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Aar_Ars_IDS_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Aar_Ars_IDS_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Aar_Ars_IDS_Sys_Limit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AD_Entries_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AD_Entries_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AD_Entries_Sys_Limit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AD_Pers_Lists_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AD_Pers_Lists_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AD_Pers_Lists_Sys_Limit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ASAI_ACont_Assoc_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ASAI_ACont_Assoc_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ASAI_ACont_Assoc_Sys_Lim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ASAI_Notif_Req_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ASAI_Notif_Req_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ASAI_Notif_Req_SysLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ASAI_SAACC_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ASAI_SAACC_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ASAI_SAACC_Sys_Limit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Attendant_Pos_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Attendant_Pos_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Attendant_Pos_Sys_Lim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Attendant_Queue_Len_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Attendant_Queue_Len_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Attndant_Que_Len_Sys_Lim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Attndant_Stat_But_Usd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Attndant_Stat_But_Avl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Atndt_Stat_But_Sys_Lim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Auth_Codes_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Auth_Codes_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Auth_Codes_Sys_Limit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BCMS_Meas_Agents_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BCMS_Meas_Agents_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BCMS_Meas_Agents_SysLim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BCMS_Meas_ACDm_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BCMS_Meas_ACDm_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BCMS_Meas_ACDm_Sys_Limit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BCMS_Split_Skills_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BCMS_Split_Skills_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BCMS_Split_Skl_Sys_Lim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BCMS_Meas_VDNS_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BCMS_Meas_VDNS_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BCMS_Meas_VDNS_Sys_Limit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Call_Cov_Ans_Group_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Call_Cov_Ans_Group_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Call_Cov_Ans_Grp_Sys_Lim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Call_Cov_Path_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Call_Cov_Path_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Call_Cov_Path_Sys_Limit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Call_Cov_Pckp_Grp_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Call_Cov_Pckp_Grp_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Call_Cov_Pkp_Grp_Sy_Lim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Call_Records_Sys_Limit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Total_VDN_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Total_VDN_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Total_VDN_Sys_Limit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Meet_Me_VDN_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Meet_Me_VDN_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Meet_Me_VDN_Sys_Limit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Meet_Me_Conf_Ports_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Meet_Me_Conf_Ports_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Meet_Me_Cnf_Port_Sys_Lim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Total_Vectors_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Total_Vectors_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Total_Vectors_Sys_Limit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Meet_Me_Vectors_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Meet_Me_Vectors_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Meet_Me_Vectors_Sys_Limit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BSR_App_Loc_Pairs_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BSR_App_Loc_Pairs_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BSR_App_Loc_Pairs_Sys_Lim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Back_BSR_Poll_VDN_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Back_BSR_Poll_VDN_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Back_BSR_Poll_VDN_Sys_Lim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Administered_Cons_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Administered_Cons_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Administered_Cons_Sys_Lim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Alpha_Dial_Entries_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Alpha_Dial_Entries_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Alpha_Dial_Ent_Sys_Lim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Dial_Plan_Ext_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Dial_Plan_Ext_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Dial_Plan_Ext_Sys_Limit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Misc_Dial_Plan_Ext_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Misc_Dial_Plan_Ext_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Misc_Dl_Pln_Ex_Sys_Lim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UDP_Ext_Recores_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UDP_Ext_Recores_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UDP_Ext_Recores_Sys_Limit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Digital_Data_End_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Digital_Data_End_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Dig_Data_End_Sys_Lim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Exp_Port_Net_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Exp_Port_Net_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Exp_Port_Net_Sys_Limit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Facility_Busy_Ind_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Facility_Busy_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Faclty_Bsy_Ind_Sys_Lim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Group_Spit_Skills_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Group_Spit_Skills_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Group_Spit_Skills_Sys_Limit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Admin_Log_Age_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Admin_Log_Age_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Admin_Log_Age_Sys_Limit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Admin_Log_Age_Skill_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Admin_Log_Age_Skill_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Admin_Log_Age_Skl_Sys_Lim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Logged_In_ACDs_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Logged_In_ACDs_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Logged_In_ACDs_Sys_Limit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Logged_In_Advocates_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Logged_In_Advocates_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Logged_In_Advcts_Sys_Lim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Logged_In_IPSoft_Agt_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Logged_In_IPSoft_Agt_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Lgn_IPSft_Agt_Sys_Lim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Group_Members_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Group_Members_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Group_Members_Sys_Limit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CMSACD_Members_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CMSACD_Members_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CMSACD_Mem_Sys_Limit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Dynamic_Queue_Sl_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Dynamic_Queue_Sl_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Dynamic_Quel_Sys_Lim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Queue_Call_Stat_But_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Queue_Call_Stat_But_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Queue_Call_Stat_But_Sys_Lim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Intercom_Groups_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Intercom_Groups_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Intercom_Grp_Sys_Lim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Modem_Pool_Groups_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Modem_Pool_Groups_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Modem_Pool_Grps_Sys_Lim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PCOL_Trunk_Groups_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PCOL_Trunk_Groups_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PCOL_Trn_Groups_Sys_Lim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Analog_Queue_Slots_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Analog_Queue_Slots_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Analog_Que_Slot_Sys_Lim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ext_Source_Combo_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ext_Source_Combo_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ext_Src_Combo_Sys_Lim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TN2501_VAL_Board_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TN2501_VAL_Board_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TN2501_VAL_Board_Sys_Limit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Media_Gate_vVAL_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Media_Gate_vVAL_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Media_Gate_vVAL_Sys_Limit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TN2602_B80_VOIP_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TN2602_B80_VOIP_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TN2602_B80_VOIP_Sys_Limit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TN2602_B320_VOIP_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TN2602_B320_VOIP_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TN2602_B320_VOIP_Sys_Lim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Admins_TSCs_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Admins_TSCs_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Admins_TSCs_Sys_Limit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NCATSC_Calls_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NCATSC_Calls_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NCATSC_Calls_Sys_Limit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DS1_Circuit_Packs_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DS1_Circuit_Packs_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DS1_Crct_Pack_Sys_Lim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DS1_with_Echo_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DS1_with_Echo_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DS1_with_Echo_Sys_Limit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ICHTIS_DNS_IP_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ICHTIS_DNS_IP_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ICHTIS_DNS_IP_Sys_Limit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ISDN_CBC_Service_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ISDN_CBC_Service_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ISDN_CBC_ServSys_Lim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Trunk_Groups_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Trunk_Groups_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Trunk_Groups_Sys_Limit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Trunk_Ports_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Trunk_Ports_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Trunk_Ports_Sys_Limit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="H323_Trunks_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="H323_Trunks_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="H323_Trunks_Sys_Limit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Rem_Ofice_Trks_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Rem_Ofice_Trks_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Rem_Ofice_Trk_Sys_Lim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SBS_Trunks_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SBS_Trunks_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SBS_Trunks_Sys_Limit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SIP_Trunks_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SIP_Trunks_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SIP_Trunks_Sys_Limit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Station_But_Mem_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Station_But_Mem_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Station_But_Mem_Sys_Limit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Custom_But_Labels_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Custom_But_Labels_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Custom_But_Labels_Sys_Lim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Station_Records_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Station_Records_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Station_Rec_Sys_Lim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Station_Rec_TTI_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Station_Rec_TTI_Shrd_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BRI_Stations_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Stations_With_Port_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Stations_WOut_Port_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Other_Stations_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TTI_Ports_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Auto_Move_Stations_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Auto_Move_Stations_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Auto_Mve_Station_Sys_Lim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Adm_IPSoft_Phone_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Video_H323_Stat_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Video_H323_Stat_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Vid_H323_Sta_Sys_Lim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Video_IPSoftphones_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Video_IPSoftphones_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Vid_IPSft_Ph_Sys_Lim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ISDN_BRI_End_Trk_Port_Usd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ISDN_BRI_End_Trk_Port_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ISDN_BRI_End_Trunk_Port_Sys_Lim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Station_Trk_Ports_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Station_Trk_Ports_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Station_Trk_Prt_Sys_Lim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Station_Capacity_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Station_Capacity_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Station_Capacity_Sys_Limit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SBS_Stations_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SBS_Stations_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SBS_Stations_Sys_Limit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Radio_Controllers_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Radio_Controllers_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Radio_Ctrlr_Sys_Lim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Wireless_Terminals_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Wireless_Terminals_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Wireless_Terml_Sys_Lim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XMobile_Stations_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XMobile_Stations_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XMobile_Sta_Sys_Lim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EC500_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DECT_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PHS_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OffPBX_EC500_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OffPBX_EC500_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OffPBX_EC500_Sys_Limit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OffPBX_OPS_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OffPBX_OPS_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OffPBX_OPS_Sys_Limit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OffPBX_SCCAN_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OffPBX_SCCAN_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OffPBX_SCCAN_Sys_Limit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OffPBX_Memory_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OffPBX_Memory_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OffPBX_Memory_Sys_Limit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IP_Stations_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IP_Stations_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IP_Stations_Sys_Limit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IP_Stationsin_TTI_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IP_Attendant_Cons_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IP_Attendant_Cons_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IP_Atdt_Cons_Sys_Lim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Remote_Offic_Stat_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Remote_Offic_Stat_Aval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Remote_OffcS_tat_Sys_Lim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UnAuth_H323_Stat_Used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UnAuth_H323_Sta_Ava" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UnAuth_H323_Stat_Sys_Lim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Software_Load" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Memory_Configuration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Offer_Catagory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Last_Software_Load" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Last_Memory_Config" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Last_Offer_Catagory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;group ref="{http://xml.avaya.com/sms}CapacityArrayGroup"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CapacityType", propOrder = {
    "currentSysMemConfig",
    "aarArsPatternsUsed",
    "aarArsPatternsAval",
    "aarArsPattrnSysLim",
    "aarArsIDSUsed",
    "aarArsIDSAval",
    "aarArsIDSSysLimit",
    "adEntriesUsed",
    "adEntriesAval",
    "adEntriesSysLimit",
    "adPersListsUsed",
    "adPersListsAval",
    "adPersListsSysLimit",
    "asaiaContAssocUsed",
    "asaiaContAssocAval",
    "asaiaContAssocSysLim",
    "asaiNotifReqUsed",
    "asaiNotifReqAval",
    "asaiNotifReqSysLimit",
    "asaisaaccUsed",
    "asaisaaccAval",
    "asaisaaccSysLimit",
    "attendantPosUsed",
    "attendantPosAval",
    "attendantPosSysLim",
    "attendantQueueLenUsed",
    "attendantQueueLenAval",
    "attndantQueLenSysLim",
    "attndantStatButUsd",
    "attndantStatButAvl",
    "atndtStatButSysLim",
    "authCodesUsed",
    "authCodesAval",
    "authCodesSysLimit",
    "bcmsMeasAgentsUsed",
    "bcmsMeasAgentsAval",
    "bcmsMeasAgentsSysLim",
    "bcmsMeasACDmUsed",
    "bcmsMeasACDmAval",
    "bcmsMeasACDmSysLimit",
    "bcmsSplitSkillsUsed",
    "bcmsSplitSkillsAval",
    "bcmsSplitSklSysLim",
    "bcmsMeasVDNSUsed",
    "bcmsMeasVDNSAval",
    "bcmsMeasVDNSSysLimit",
    "callCovAnsGroupUsed",
    "callCovAnsGroupAval",
    "callCovAnsGrpSysLim",
    "callCovPathUsed",
    "callCovPathAval",
    "callCovPathSysLimit",
    "callCovPckpGrpUsed",
    "callCovPckpGrpAval",
    "callCovPkpGrpSyLim",
    "callRecordsSysLimit",
    "totalVDNUsed",
    "totalVDNAval",
    "totalVDNSysLimit",
    "meetMeVDNUsed",
    "meetMeVDNAval",
    "meetMeVDNSysLimit",
    "meetMeConfPortsUsed",
    "meetMeConfPortsAval",
    "meetMeCnfPortSysLim",
    "totalVectorsUsed",
    "totalVectorsAval",
    "totalVectorsSysLimit",
    "meetMeVectorsUsed",
    "meetMeVectorsAval",
    "meetMeVectorsSysLimit",
    "bsrAppLocPairsUsed",
    "bsrAppLocPairsAval",
    "bsrAppLocPairsSysLim",
    "backBSRPollVDNUsed",
    "backBSRPollVDNAval",
    "backBSRPollVDNSysLim",
    "administeredConsUsed",
    "administeredConsAval",
    "administeredConsSysLim",
    "alphaDialEntriesUsed",
    "alphaDialEntriesAval",
    "alphaDialEntSysLim",
    "dialPlanExtUsed",
    "dialPlanExtAval",
    "dialPlanExtSysLimit",
    "miscDialPlanExtUsed",
    "miscDialPlanExtAval",
    "miscDlPlnExSysLim",
    "udpExtRecoresUsed",
    "udpExtRecoresAval",
    "udpExtRecoresSysLimit",
    "digitalDataEndUsed",
    "digitalDataEndAval",
    "digDataEndSysLim",
    "expPortNetUsed",
    "expPortNetAval",
    "expPortNetSysLimit",
    "facilityBusyIndUsed",
    "facilityBusyAval",
    "facltyBsyIndSysLim",
    "groupSpitSkillsUsed",
    "groupSpitSkillsAval",
    "groupSpitSkillsSysLimit",
    "adminLogAgeUsed",
    "adminLogAgeAval",
    "adminLogAgeSysLimit",
    "adminLogAgeSkillUsed",
    "adminLogAgeSkillAval",
    "adminLogAgeSklSysLim",
    "loggedInACDsUsed",
    "loggedInACDsAval",
    "loggedInACDsSysLimit",
    "loggedInAdvocatesUsed",
    "loggedInAdvocatesAval",
    "loggedInAdvctsSysLim",
    "loggedInIPSoftAgtUsed",
    "loggedInIPSoftAgtAval",
    "lgnIPSftAgtSysLim",
    "groupMembersUsed",
    "groupMembersAval",
    "groupMembersSysLimit",
    "cmsacdMembersUsed",
    "cmsacdMembersAval",
    "cmsacdMemSysLimit",
    "dynamicQueueSlUsed",
    "dynamicQueueSlAval",
    "dynamicQuelSysLim",
    "queueCallStatButUsed",
    "queueCallStatButAval",
    "queueCallStatButSysLim",
    "intercomGroupsUsed",
    "intercomGroupsAval",
    "intercomGrpSysLim",
    "modemPoolGroupsUsed",
    "modemPoolGroupsAval",
    "modemPoolGrpsSysLim",
    "pcolTrunkGroupsUsed",
    "pcolTrunkGroupsAval",
    "pcolTrnGroupsSysLim",
    "analogQueueSlotsUsed",
    "analogQueueSlotsAval",
    "analogQueSlotSysLim",
    "extSourceComboUsed",
    "extSourceComboAval",
    "extSrcComboSysLim",
    "tn2501VALBoardUsed",
    "tn2501VALBoardAval",
    "tn2501VALBoardSysLimit",
    "mediaGateVVALUsed",
    "mediaGateVVALAval",
    "mediaGateVVALSysLimit",
    "tn2602B80VOIPUsed",
    "tn2602B80VOIPAval",
    "tn2602B80VOIPSysLimit",
    "tn2602B320VOIPUsed",
    "tn2602B320VOIPAval",
    "tn2602B320VOIPSysLim",
    "adminsTSCsUsed",
    "adminsTSCsAval",
    "adminsTSCsSysLimit",
    "ncatscCallsUsed",
    "ncatscCallsAval",
    "ncatscCallsSysLimit",
    "ds1CircuitPacksUsed",
    "ds1CircuitPacksAval",
    "ds1CrctPackSysLim",
    "ds1WithEchoUsed",
    "ds1WithEchoAval",
    "ds1WithEchoSysLimit",
    "ichtisdnsipUsed",
    "ichtisdnsipAval",
    "ichtisdnsipSysLimit",
    "isdncbcServiceUsed",
    "isdncbcServiceAval",
    "isdncbcServSysLim",
    "trunkGroupsUsed",
    "trunkGroupsAval",
    "trunkGroupsSysLimit",
    "trunkPortsUsed",
    "trunkPortsAval",
    "trunkPortsSysLimit",
    "h323TrunksUsed",
    "h323TrunksAval",
    "h323TrunksSysLimit",
    "remOficeTrksUsed",
    "remOficeTrksAval",
    "remOficeTrkSysLim",
    "sbsTrunksUsed",
    "sbsTrunksAval",
    "sbsTrunksSysLimit",
    "sipTrunksUsed",
    "sipTrunksAval",
    "sipTrunksSysLimit",
    "stationButMemUsed",
    "stationButMemAval",
    "stationButMemSysLimit",
    "customButLabelsUsed",
    "customButLabelsAval",
    "customButLabelsSysLim",
    "stationRecordsUsed",
    "stationRecordsAval",
    "stationRecSysLim",
    "stationRecTTIUsed",
    "stationRecTTIShrdUsed",
    "briStationsUsed",
    "stationsWithPortUsed",
    "stationsWOutPortUsed",
    "otherStationsUsed",
    "ttiPortsUsed",
    "autoMoveStationsUsed",
    "autoMoveStationsAval",
    "autoMveStationSysLim",
    "admIPSoftPhoneUsed",
    "videoH323StatUsed",
    "videoH323StatAval",
    "vidH323StaSysLim",
    "videoIPSoftphonesUsed",
    "videoIPSoftphonesAval",
    "vidIPSftPhSysLim",
    "isdnbriEndTrkPortUsd",
    "isdnbriEndTrkPortAval",
    "isdnbriEndTrunkPortSysLim",
    "stationTrkPortsUsed",
    "stationTrkPortsAval",
    "stationTrkPrtSysLim",
    "stationCapacityUsed",
    "stationCapacityAval",
    "stationCapacitySysLimit",
    "sbsStationsUsed",
    "sbsStationsAval",
    "sbsStationsSysLimit",
    "radioControllersUsed",
    "radioControllersAval",
    "radioCtrlrSysLim",
    "wirelessTerminalsUsed",
    "wirelessTerminalsAval",
    "wirelessTermlSysLim",
    "xMobileStationsUsed",
    "xMobileStationsAval",
    "xMobileStaSysLim",
    "ec500Used",
    "dectUsed",
    "phsUsed",
    "offPBXEC500Used",
    "offPBXEC500Aval",
    "offPBXEC500SysLimit",
    "offPBXOPSUsed",
    "offPBXOPSAval",
    "offPBXOPSSysLimit",
    "offPBXSCCANUsed",
    "offPBXSCCANAval",
    "offPBXSCCANSysLimit",
    "offPBXMemoryUsed",
    "offPBXMemoryAval",
    "offPBXMemorySysLimit",
    "ipStationsUsed",
    "ipStationsAval",
    "ipStationsSysLimit",
    "ipStationsinTTIUsed",
    "ipAttendantConsUsed",
    "ipAttendantConsAval",
    "ipAtdtConsSysLim",
    "remoteOfficStatUsed",
    "remoteOfficStatAval",
    "remoteOffcSTatSysLim",
    "unAuthH323StatUsed",
    "unAuthH323StaAva",
    "unAuthH323StatSysLim",
    "softwareLoad",
    "memoryConfiguration",
    "offerCatagory",
    "lastSoftwareLoad",
    "lastMemoryConfig",
    "lastOfferCatagory",
    "currentRegID",
    "currentRegRel",
    "currentRegRegist",
    "currentRegAvail",
    "currentRegSysLim"
})
public class CapacityType {

    @XmlElement(name = "Current_Sys_Mem_Config")
    protected String currentSysMemConfig;
    @XmlElement(name = "Aar_Ars_Patterns_Used")
    protected String aarArsPatternsUsed;
    @XmlElement(name = "Aar_Ars_Patterns_Aval")
    protected String aarArsPatternsAval;
    @XmlElement(name = "Aar_Ars_Pattrn_Sys_Lim")
    protected String aarArsPattrnSysLim;
    @XmlElement(name = "Aar_Ars_IDS_Used")
    protected String aarArsIDSUsed;
    @XmlElement(name = "Aar_Ars_IDS_Aval")
    protected String aarArsIDSAval;
    @XmlElement(name = "Aar_Ars_IDS_Sys_Limit")
    protected String aarArsIDSSysLimit;
    @XmlElement(name = "AD_Entries_Used")
    protected String adEntriesUsed;
    @XmlElement(name = "AD_Entries_Aval")
    protected String adEntriesAval;
    @XmlElement(name = "AD_Entries_Sys_Limit")
    protected String adEntriesSysLimit;
    @XmlElement(name = "AD_Pers_Lists_Used")
    protected String adPersListsUsed;
    @XmlElement(name = "AD_Pers_Lists_Aval")
    protected String adPersListsAval;
    @XmlElement(name = "AD_Pers_Lists_Sys_Limit")
    protected String adPersListsSysLimit;
    @XmlElement(name = "ASAI_ACont_Assoc_Used")
    protected String asaiaContAssocUsed;
    @XmlElement(name = "ASAI_ACont_Assoc_Aval")
    protected String asaiaContAssocAval;
    @XmlElement(name = "ASAI_ACont_Assoc_Sys_Lim")
    protected String asaiaContAssocSysLim;
    @XmlElement(name = "ASAI_Notif_Req_Used")
    protected String asaiNotifReqUsed;
    @XmlElement(name = "ASAI_Notif_Req_Aval")
    protected String asaiNotifReqAval;
    @XmlElement(name = "ASAI_Notif_Req_SysLimit")
    protected String asaiNotifReqSysLimit;
    @XmlElement(name = "ASAI_SAACC_Used")
    protected String asaisaaccUsed;
    @XmlElement(name = "ASAI_SAACC_Aval")
    protected String asaisaaccAval;
    @XmlElement(name = "ASAI_SAACC_Sys_Limit")
    protected String asaisaaccSysLimit;
    @XmlElement(name = "Attendant_Pos_Used")
    protected String attendantPosUsed;
    @XmlElement(name = "Attendant_Pos_Aval")
    protected String attendantPosAval;
    @XmlElement(name = "Attendant_Pos_Sys_Lim")
    protected String attendantPosSysLim;
    @XmlElement(name = "Attendant_Queue_Len_Used")
    protected String attendantQueueLenUsed;
    @XmlElement(name = "Attendant_Queue_Len_Aval")
    protected String attendantQueueLenAval;
    @XmlElement(name = "Attndant_Que_Len_Sys_Lim")
    protected String attndantQueLenSysLim;
    @XmlElement(name = "Attndant_Stat_But_Usd")
    protected String attndantStatButUsd;
    @XmlElement(name = "Attndant_Stat_But_Avl")
    protected String attndantStatButAvl;
    @XmlElement(name = "Atndt_Stat_But_Sys_Lim")
    protected String atndtStatButSysLim;
    @XmlElement(name = "Auth_Codes_Used")
    protected String authCodesUsed;
    @XmlElement(name = "Auth_Codes_Aval")
    protected String authCodesAval;
    @XmlElement(name = "Auth_Codes_Sys_Limit")
    protected String authCodesSysLimit;
    @XmlElement(name = "BCMS_Meas_Agents_Used")
    protected String bcmsMeasAgentsUsed;
    @XmlElement(name = "BCMS_Meas_Agents_Aval")
    protected String bcmsMeasAgentsAval;
    @XmlElement(name = "BCMS_Meas_Agents_SysLim")
    protected String bcmsMeasAgentsSysLim;
    @XmlElement(name = "BCMS_Meas_ACDm_Used")
    protected String bcmsMeasACDmUsed;
    @XmlElement(name = "BCMS_Meas_ACDm_Aval")
    protected String bcmsMeasACDmAval;
    @XmlElement(name = "BCMS_Meas_ACDm_Sys_Limit")
    protected String bcmsMeasACDmSysLimit;
    @XmlElement(name = "BCMS_Split_Skills_Used")
    protected String bcmsSplitSkillsUsed;
    @XmlElement(name = "BCMS_Split_Skills_Aval")
    protected String bcmsSplitSkillsAval;
    @XmlElement(name = "BCMS_Split_Skl_Sys_Lim")
    protected String bcmsSplitSklSysLim;
    @XmlElement(name = "BCMS_Meas_VDNS_Used")
    protected String bcmsMeasVDNSUsed;
    @XmlElement(name = "BCMS_Meas_VDNS_Aval")
    protected String bcmsMeasVDNSAval;
    @XmlElement(name = "BCMS_Meas_VDNS_Sys_Limit")
    protected String bcmsMeasVDNSSysLimit;
    @XmlElement(name = "Call_Cov_Ans_Group_Used")
    protected String callCovAnsGroupUsed;
    @XmlElement(name = "Call_Cov_Ans_Group_Aval")
    protected String callCovAnsGroupAval;
    @XmlElement(name = "Call_Cov_Ans_Grp_Sys_Lim")
    protected String callCovAnsGrpSysLim;
    @XmlElement(name = "Call_Cov_Path_Used")
    protected String callCovPathUsed;
    @XmlElement(name = "Call_Cov_Path_Aval")
    protected String callCovPathAval;
    @XmlElement(name = "Call_Cov_Path_Sys_Limit")
    protected String callCovPathSysLimit;
    @XmlElement(name = "Call_Cov_Pckp_Grp_Used")
    protected String callCovPckpGrpUsed;
    @XmlElement(name = "Call_Cov_Pckp_Grp_Aval")
    protected String callCovPckpGrpAval;
    @XmlElement(name = "Call_Cov_Pkp_Grp_Sy_Lim")
    protected String callCovPkpGrpSyLim;
    @XmlElement(name = "Call_Records_Sys_Limit")
    protected String callRecordsSysLimit;
    @XmlElement(name = "Total_VDN_Used")
    protected String totalVDNUsed;
    @XmlElement(name = "Total_VDN_Aval")
    protected String totalVDNAval;
    @XmlElement(name = "Total_VDN_Sys_Limit")
    protected String totalVDNSysLimit;
    @XmlElement(name = "Meet_Me_VDN_Used")
    protected String meetMeVDNUsed;
    @XmlElement(name = "Meet_Me_VDN_Aval")
    protected String meetMeVDNAval;
    @XmlElement(name = "Meet_Me_VDN_Sys_Limit")
    protected String meetMeVDNSysLimit;
    @XmlElement(name = "Meet_Me_Conf_Ports_Used")
    protected String meetMeConfPortsUsed;
    @XmlElement(name = "Meet_Me_Conf_Ports_Aval")
    protected String meetMeConfPortsAval;
    @XmlElement(name = "Meet_Me_Cnf_Port_Sys_Lim")
    protected String meetMeCnfPortSysLim;
    @XmlElement(name = "Total_Vectors_Used")
    protected String totalVectorsUsed;
    @XmlElement(name = "Total_Vectors_Aval")
    protected String totalVectorsAval;
    @XmlElement(name = "Total_Vectors_Sys_Limit")
    protected String totalVectorsSysLimit;
    @XmlElement(name = "Meet_Me_Vectors_Used")
    protected String meetMeVectorsUsed;
    @XmlElement(name = "Meet_Me_Vectors_Aval")
    protected String meetMeVectorsAval;
    @XmlElement(name = "Meet_Me_Vectors_Sys_Limit")
    protected String meetMeVectorsSysLimit;
    @XmlElement(name = "BSR_App_Loc_Pairs_Used")
    protected String bsrAppLocPairsUsed;
    @XmlElement(name = "BSR_App_Loc_Pairs_Aval")
    protected String bsrAppLocPairsAval;
    @XmlElement(name = "BSR_App_Loc_Pairs_Sys_Lim")
    protected String bsrAppLocPairsSysLim;
    @XmlElement(name = "Back_BSR_Poll_VDN_Used")
    protected String backBSRPollVDNUsed;
    @XmlElement(name = "Back_BSR_Poll_VDN_Aval")
    protected String backBSRPollVDNAval;
    @XmlElement(name = "Back_BSR_Poll_VDN_Sys_Lim")
    protected String backBSRPollVDNSysLim;
    @XmlElement(name = "Administered_Cons_Used")
    protected String administeredConsUsed;
    @XmlElement(name = "Administered_Cons_Aval")
    protected String administeredConsAval;
    @XmlElement(name = "Administered_Cons_Sys_Lim")
    protected String administeredConsSysLim;
    @XmlElement(name = "Alpha_Dial_Entries_Used")
    protected String alphaDialEntriesUsed;
    @XmlElement(name = "Alpha_Dial_Entries_Aval")
    protected String alphaDialEntriesAval;
    @XmlElement(name = "Alpha_Dial_Ent_Sys_Lim")
    protected String alphaDialEntSysLim;
    @XmlElement(name = "Dial_Plan_Ext_Used")
    protected String dialPlanExtUsed;
    @XmlElement(name = "Dial_Plan_Ext_Aval")
    protected String dialPlanExtAval;
    @XmlElement(name = "Dial_Plan_Ext_Sys_Limit")
    protected String dialPlanExtSysLimit;
    @XmlElement(name = "Misc_Dial_Plan_Ext_Used")
    protected String miscDialPlanExtUsed;
    @XmlElement(name = "Misc_Dial_Plan_Ext_Aval")
    protected String miscDialPlanExtAval;
    @XmlElement(name = "Misc_Dl_Pln_Ex_Sys_Lim")
    protected String miscDlPlnExSysLim;
    @XmlElement(name = "UDP_Ext_Recores_Used")
    protected String udpExtRecoresUsed;
    @XmlElement(name = "UDP_Ext_Recores_Aval")
    protected String udpExtRecoresAval;
    @XmlElement(name = "UDP_Ext_Recores_Sys_Limit")
    protected String udpExtRecoresSysLimit;
    @XmlElement(name = "Digital_Data_End_Used")
    protected String digitalDataEndUsed;
    @XmlElement(name = "Digital_Data_End_Aval")
    protected String digitalDataEndAval;
    @XmlElement(name = "Dig_Data_End_Sys_Lim")
    protected String digDataEndSysLim;
    @XmlElement(name = "Exp_Port_Net_Used")
    protected String expPortNetUsed;
    @XmlElement(name = "Exp_Port_Net_Aval")
    protected String expPortNetAval;
    @XmlElement(name = "Exp_Port_Net_Sys_Limit")
    protected String expPortNetSysLimit;
    @XmlElement(name = "Facility_Busy_Ind_Used")
    protected String facilityBusyIndUsed;
    @XmlElement(name = "Facility_Busy_Aval")
    protected String facilityBusyAval;
    @XmlElement(name = "Faclty_Bsy_Ind_Sys_Lim")
    protected String facltyBsyIndSysLim;
    @XmlElement(name = "Group_Spit_Skills_Used")
    protected String groupSpitSkillsUsed;
    @XmlElement(name = "Group_Spit_Skills_Aval")
    protected String groupSpitSkillsAval;
    @XmlElement(name = "Group_Spit_Skills_Sys_Limit")
    protected String groupSpitSkillsSysLimit;
    @XmlElement(name = "Admin_Log_Age_Used")
    protected String adminLogAgeUsed;
    @XmlElement(name = "Admin_Log_Age_Aval")
    protected String adminLogAgeAval;
    @XmlElement(name = "Admin_Log_Age_Sys_Limit")
    protected String adminLogAgeSysLimit;
    @XmlElement(name = "Admin_Log_Age_Skill_Used")
    protected String adminLogAgeSkillUsed;
    @XmlElement(name = "Admin_Log_Age_Skill_Aval")
    protected String adminLogAgeSkillAval;
    @XmlElement(name = "Admin_Log_Age_Skl_Sys_Lim")
    protected String adminLogAgeSklSysLim;
    @XmlElement(name = "Logged_In_ACDs_Used")
    protected String loggedInACDsUsed;
    @XmlElement(name = "Logged_In_ACDs_Aval")
    protected String loggedInACDsAval;
    @XmlElement(name = "Logged_In_ACDs_Sys_Limit")
    protected String loggedInACDsSysLimit;
    @XmlElement(name = "Logged_In_Advocates_Used")
    protected String loggedInAdvocatesUsed;
    @XmlElement(name = "Logged_In_Advocates_Aval")
    protected String loggedInAdvocatesAval;
    @XmlElement(name = "Logged_In_Advcts_Sys_Lim")
    protected String loggedInAdvctsSysLim;
    @XmlElement(name = "Logged_In_IPSoft_Agt_Used")
    protected String loggedInIPSoftAgtUsed;
    @XmlElement(name = "Logged_In_IPSoft_Agt_Aval")
    protected String loggedInIPSoftAgtAval;
    @XmlElement(name = "Lgn_IPSft_Agt_Sys_Lim")
    protected String lgnIPSftAgtSysLim;
    @XmlElement(name = "Group_Members_Used")
    protected String groupMembersUsed;
    @XmlElement(name = "Group_Members_Aval")
    protected String groupMembersAval;
    @XmlElement(name = "Group_Members_Sys_Limit")
    protected String groupMembersSysLimit;
    @XmlElement(name = "CMSACD_Members_Used")
    protected String cmsacdMembersUsed;
    @XmlElement(name = "CMSACD_Members_Aval")
    protected String cmsacdMembersAval;
    @XmlElement(name = "CMSACD_Mem_Sys_Limit")
    protected String cmsacdMemSysLimit;
    @XmlElement(name = "Dynamic_Queue_Sl_Used")
    protected String dynamicQueueSlUsed;
    @XmlElement(name = "Dynamic_Queue_Sl_Aval")
    protected String dynamicQueueSlAval;
    @XmlElement(name = "Dynamic_Quel_Sys_Lim")
    protected String dynamicQuelSysLim;
    @XmlElement(name = "Queue_Call_Stat_But_Used")
    protected String queueCallStatButUsed;
    @XmlElement(name = "Queue_Call_Stat_But_Aval")
    protected String queueCallStatButAval;
    @XmlElement(name = "Queue_Call_Stat_But_Sys_Lim")
    protected String queueCallStatButSysLim;
    @XmlElement(name = "Intercom_Groups_Used")
    protected String intercomGroupsUsed;
    @XmlElement(name = "Intercom_Groups_Aval")
    protected String intercomGroupsAval;
    @XmlElement(name = "Intercom_Grp_Sys_Lim")
    protected String intercomGrpSysLim;
    @XmlElement(name = "Modem_Pool_Groups_Used")
    protected String modemPoolGroupsUsed;
    @XmlElement(name = "Modem_Pool_Groups_Aval")
    protected String modemPoolGroupsAval;
    @XmlElement(name = "Modem_Pool_Grps_Sys_Lim")
    protected String modemPoolGrpsSysLim;
    @XmlElement(name = "PCOL_Trunk_Groups_Used")
    protected String pcolTrunkGroupsUsed;
    @XmlElement(name = "PCOL_Trunk_Groups_Aval")
    protected String pcolTrunkGroupsAval;
    @XmlElement(name = "PCOL_Trn_Groups_Sys_Lim")
    protected String pcolTrnGroupsSysLim;
    @XmlElement(name = "Analog_Queue_Slots_Used")
    protected String analogQueueSlotsUsed;
    @XmlElement(name = "Analog_Queue_Slots_Aval")
    protected String analogQueueSlotsAval;
    @XmlElement(name = "Analog_Que_Slot_Sys_Lim")
    protected String analogQueSlotSysLim;
    @XmlElement(name = "Ext_Source_Combo_Used")
    protected String extSourceComboUsed;
    @XmlElement(name = "Ext_Source_Combo_Aval")
    protected String extSourceComboAval;
    @XmlElement(name = "Ext_Src_Combo_Sys_Lim")
    protected String extSrcComboSysLim;
    @XmlElement(name = "TN2501_VAL_Board_Used")
    protected String tn2501VALBoardUsed;
    @XmlElement(name = "TN2501_VAL_Board_Aval")
    protected String tn2501VALBoardAval;
    @XmlElement(name = "TN2501_VAL_Board_Sys_Limit")
    protected String tn2501VALBoardSysLimit;
    @XmlElement(name = "Media_Gate_vVAL_Used")
    protected String mediaGateVVALUsed;
    @XmlElement(name = "Media_Gate_vVAL_Aval")
    protected String mediaGateVVALAval;
    @XmlElement(name = "Media_Gate_vVAL_Sys_Limit")
    protected String mediaGateVVALSysLimit;
    @XmlElement(name = "TN2602_B80_VOIP_Used")
    protected String tn2602B80VOIPUsed;
    @XmlElement(name = "TN2602_B80_VOIP_Aval")
    protected String tn2602B80VOIPAval;
    @XmlElement(name = "TN2602_B80_VOIP_Sys_Limit")
    protected String tn2602B80VOIPSysLimit;
    @XmlElement(name = "TN2602_B320_VOIP_Used")
    protected String tn2602B320VOIPUsed;
    @XmlElement(name = "TN2602_B320_VOIP_Aval")
    protected String tn2602B320VOIPAval;
    @XmlElement(name = "TN2602_B320_VOIP_Sys_Lim")
    protected String tn2602B320VOIPSysLim;
    @XmlElement(name = "Admins_TSCs_Used")
    protected String adminsTSCsUsed;
    @XmlElement(name = "Admins_TSCs_Aval")
    protected String adminsTSCsAval;
    @XmlElement(name = "Admins_TSCs_Sys_Limit")
    protected String adminsTSCsSysLimit;
    @XmlElement(name = "NCATSC_Calls_Used")
    protected String ncatscCallsUsed;
    @XmlElement(name = "NCATSC_Calls_Aval")
    protected String ncatscCallsAval;
    @XmlElement(name = "NCATSC_Calls_Sys_Limit")
    protected String ncatscCallsSysLimit;
    @XmlElement(name = "DS1_Circuit_Packs_Used")
    protected String ds1CircuitPacksUsed;
    @XmlElement(name = "DS1_Circuit_Packs_Aval")
    protected String ds1CircuitPacksAval;
    @XmlElement(name = "DS1_Crct_Pack_Sys_Lim")
    protected String ds1CrctPackSysLim;
    @XmlElement(name = "DS1_with_Echo_Used")
    protected String ds1WithEchoUsed;
    @XmlElement(name = "DS1_with_Echo_Aval")
    protected String ds1WithEchoAval;
    @XmlElement(name = "DS1_with_Echo_Sys_Limit")
    protected String ds1WithEchoSysLimit;
    @XmlElement(name = "ICHTIS_DNS_IP_Used")
    protected String ichtisdnsipUsed;
    @XmlElement(name = "ICHTIS_DNS_IP_Aval")
    protected String ichtisdnsipAval;
    @XmlElement(name = "ICHTIS_DNS_IP_Sys_Limit")
    protected String ichtisdnsipSysLimit;
    @XmlElement(name = "ISDN_CBC_Service_Used")
    protected String isdncbcServiceUsed;
    @XmlElement(name = "ISDN_CBC_Service_Aval")
    protected String isdncbcServiceAval;
    @XmlElement(name = "ISDN_CBC_ServSys_Lim")
    protected String isdncbcServSysLim;
    @XmlElement(name = "Trunk_Groups_Used")
    protected String trunkGroupsUsed;
    @XmlElement(name = "Trunk_Groups_Aval")
    protected String trunkGroupsAval;
    @XmlElement(name = "Trunk_Groups_Sys_Limit")
    protected String trunkGroupsSysLimit;
    @XmlElement(name = "Trunk_Ports_Used")
    protected String trunkPortsUsed;
    @XmlElement(name = "Trunk_Ports_Aval")
    protected String trunkPortsAval;
    @XmlElement(name = "Trunk_Ports_Sys_Limit")
    protected String trunkPortsSysLimit;
    @XmlElement(name = "H323_Trunks_Used")
    protected String h323TrunksUsed;
    @XmlElement(name = "H323_Trunks_Aval")
    protected String h323TrunksAval;
    @XmlElement(name = "H323_Trunks_Sys_Limit")
    protected String h323TrunksSysLimit;
    @XmlElement(name = "Rem_Ofice_Trks_Used")
    protected String remOficeTrksUsed;
    @XmlElement(name = "Rem_Ofice_Trks_Aval")
    protected String remOficeTrksAval;
    @XmlElement(name = "Rem_Ofice_Trk_Sys_Lim")
    protected String remOficeTrkSysLim;
    @XmlElement(name = "SBS_Trunks_Used")
    protected String sbsTrunksUsed;
    @XmlElement(name = "SBS_Trunks_Aval")
    protected String sbsTrunksAval;
    @XmlElement(name = "SBS_Trunks_Sys_Limit")
    protected String sbsTrunksSysLimit;
    @XmlElement(name = "SIP_Trunks_Used")
    protected String sipTrunksUsed;
    @XmlElement(name = "SIP_Trunks_Aval")
    protected String sipTrunksAval;
    @XmlElement(name = "SIP_Trunks_Sys_Limit")
    protected String sipTrunksSysLimit;
    @XmlElement(name = "Station_But_Mem_Used")
    protected String stationButMemUsed;
    @XmlElement(name = "Station_But_Mem_Aval")
    protected String stationButMemAval;
    @XmlElement(name = "Station_But_Mem_Sys_Limit")
    protected String stationButMemSysLimit;
    @XmlElement(name = "Custom_But_Labels_Used")
    protected String customButLabelsUsed;
    @XmlElement(name = "Custom_But_Labels_Aval")
    protected String customButLabelsAval;
    @XmlElement(name = "Custom_But_Labels_Sys_Lim")
    protected String customButLabelsSysLim;
    @XmlElement(name = "Station_Records_Used")
    protected String stationRecordsUsed;
    @XmlElement(name = "Station_Records_Aval")
    protected String stationRecordsAval;
    @XmlElement(name = "Station_Rec_Sys_Lim")
    protected String stationRecSysLim;
    @XmlElement(name = "Station_Rec_TTI_Used")
    protected String stationRecTTIUsed;
    @XmlElement(name = "Station_Rec_TTI_Shrd_Used")
    protected String stationRecTTIShrdUsed;
    @XmlElement(name = "BRI_Stations_Used")
    protected String briStationsUsed;
    @XmlElement(name = "Stations_With_Port_Used")
    protected String stationsWithPortUsed;
    @XmlElement(name = "Stations_WOut_Port_Used")
    protected String stationsWOutPortUsed;
    @XmlElement(name = "Other_Stations_Used")
    protected String otherStationsUsed;
    @XmlElement(name = "TTI_Ports_Used")
    protected String ttiPortsUsed;
    @XmlElement(name = "Auto_Move_Stations_Used")
    protected String autoMoveStationsUsed;
    @XmlElement(name = "Auto_Move_Stations_Aval")
    protected String autoMoveStationsAval;
    @XmlElement(name = "Auto_Mve_Station_Sys_Lim")
    protected String autoMveStationSysLim;
    @XmlElement(name = "Adm_IPSoft_Phone_Used")
    protected String admIPSoftPhoneUsed;
    @XmlElement(name = "Video_H323_Stat_Used")
    protected String videoH323StatUsed;
    @XmlElement(name = "Video_H323_Stat_Aval")
    protected String videoH323StatAval;
    @XmlElement(name = "Vid_H323_Sta_Sys_Lim")
    protected String vidH323StaSysLim;
    @XmlElement(name = "Video_IPSoftphones_Used")
    protected String videoIPSoftphonesUsed;
    @XmlElement(name = "Video_IPSoftphones_Aval")
    protected String videoIPSoftphonesAval;
    @XmlElement(name = "Vid_IPSft_Ph_Sys_Lim")
    protected String vidIPSftPhSysLim;
    @XmlElement(name = "ISDN_BRI_End_Trk_Port_Usd")
    protected String isdnbriEndTrkPortUsd;
    @XmlElement(name = "ISDN_BRI_End_Trk_Port_Aval")
    protected String isdnbriEndTrkPortAval;
    @XmlElement(name = "ISDN_BRI_End_Trunk_Port_Sys_Lim")
    protected String isdnbriEndTrunkPortSysLim;
    @XmlElement(name = "Station_Trk_Ports_Used")
    protected String stationTrkPortsUsed;
    @XmlElement(name = "Station_Trk_Ports_Aval")
    protected String stationTrkPortsAval;
    @XmlElement(name = "Station_Trk_Prt_Sys_Lim")
    protected String stationTrkPrtSysLim;
    @XmlElement(name = "Station_Capacity_Used")
    protected String stationCapacityUsed;
    @XmlElement(name = "Station_Capacity_Aval")
    protected String stationCapacityAval;
    @XmlElement(name = "Station_Capacity_Sys_Limit")
    protected String stationCapacitySysLimit;
    @XmlElement(name = "SBS_Stations_Used")
    protected String sbsStationsUsed;
    @XmlElement(name = "SBS_Stations_Aval")
    protected String sbsStationsAval;
    @XmlElement(name = "SBS_Stations_Sys_Limit")
    protected String sbsStationsSysLimit;
    @XmlElement(name = "Radio_Controllers_Used")
    protected String radioControllersUsed;
    @XmlElement(name = "Radio_Controllers_Aval")
    protected String radioControllersAval;
    @XmlElement(name = "Radio_Ctrlr_Sys_Lim")
    protected String radioCtrlrSysLim;
    @XmlElement(name = "Wireless_Terminals_Used")
    protected String wirelessTerminalsUsed;
    @XmlElement(name = "Wireless_Terminals_Aval")
    protected String wirelessTerminalsAval;
    @XmlElement(name = "Wireless_Terml_Sys_Lim")
    protected String wirelessTermlSysLim;
    @XmlElement(name = "XMobile_Stations_Used")
    protected String xMobileStationsUsed;
    @XmlElement(name = "XMobile_Stations_Aval")
    protected String xMobileStationsAval;
    @XmlElement(name = "XMobile_Sta_Sys_Lim")
    protected String xMobileStaSysLim;
    @XmlElement(name = "EC500_Used")
    protected String ec500Used;
    @XmlElement(name = "DECT_Used")
    protected String dectUsed;
    @XmlElement(name = "PHS_Used")
    protected String phsUsed;
    @XmlElement(name = "OffPBX_EC500_Used")
    protected String offPBXEC500Used;
    @XmlElement(name = "OffPBX_EC500_Aval")
    protected String offPBXEC500Aval;
    @XmlElement(name = "OffPBX_EC500_Sys_Limit")
    protected String offPBXEC500SysLimit;
    @XmlElement(name = "OffPBX_OPS_Used")
    protected String offPBXOPSUsed;
    @XmlElement(name = "OffPBX_OPS_Aval")
    protected String offPBXOPSAval;
    @XmlElement(name = "OffPBX_OPS_Sys_Limit")
    protected String offPBXOPSSysLimit;
    @XmlElement(name = "OffPBX_SCCAN_Used")
    protected String offPBXSCCANUsed;
    @XmlElement(name = "OffPBX_SCCAN_Aval")
    protected String offPBXSCCANAval;
    @XmlElement(name = "OffPBX_SCCAN_Sys_Limit")
    protected String offPBXSCCANSysLimit;
    @XmlElement(name = "OffPBX_Memory_Used")
    protected String offPBXMemoryUsed;
    @XmlElement(name = "OffPBX_Memory_Aval")
    protected String offPBXMemoryAval;
    @XmlElement(name = "OffPBX_Memory_Sys_Limit")
    protected String offPBXMemorySysLimit;
    @XmlElement(name = "IP_Stations_Used")
    protected String ipStationsUsed;
    @XmlElement(name = "IP_Stations_Aval")
    protected String ipStationsAval;
    @XmlElement(name = "IP_Stations_Sys_Limit")
    protected String ipStationsSysLimit;
    @XmlElement(name = "IP_Stationsin_TTI_Used")
    protected String ipStationsinTTIUsed;
    @XmlElement(name = "IP_Attendant_Cons_Used")
    protected String ipAttendantConsUsed;
    @XmlElement(name = "IP_Attendant_Cons_Aval")
    protected String ipAttendantConsAval;
    @XmlElement(name = "IP_Atdt_Cons_Sys_Lim")
    protected String ipAtdtConsSysLim;
    @XmlElement(name = "Remote_Offic_Stat_Used")
    protected String remoteOfficStatUsed;
    @XmlElement(name = "Remote_Offic_Stat_Aval")
    protected String remoteOfficStatAval;
    @XmlElement(name = "Remote_OffcS_tat_Sys_Lim")
    protected String remoteOffcSTatSysLim;
    @XmlElement(name = "UnAuth_H323_Stat_Used")
    protected String unAuthH323StatUsed;
    @XmlElement(name = "UnAuth_H323_Sta_Ava")
    protected String unAuthH323StaAva;
    @XmlElement(name = "UnAuth_H323_Stat_Sys_Lim")
    protected String unAuthH323StatSysLim;
    @XmlElement(name = "Software_Load")
    protected String softwareLoad;
    @XmlElement(name = "Memory_Configuration")
    protected String memoryConfiguration;
    @XmlElement(name = "Offer_Catagory")
    protected String offerCatagory;
    @XmlElement(name = "Last_Software_Load")
    protected String lastSoftwareLoad;
    @XmlElement(name = "Last_Memory_Config")
    protected String lastMemoryConfig;
    @XmlElement(name = "Last_Offer_Catagory")
    protected String lastOfferCatagory;
    @XmlElement(name = "Current_Reg_ID")
    protected List<ArrayType> currentRegID;
    @XmlElement(name = "Current_Reg_Rel")
    protected List<ArrayType> currentRegRel;
    @XmlElement(name = "Current_Reg_Regist")
    protected List<ArrayType> currentRegRegist;
    @XmlElement(name = "Current_Reg_Avail")
    protected List<ArrayType> currentRegAvail;
    @XmlElement(name = "Current_Reg_Sys_Lim")
    protected List<ArrayType> currentRegSysLim;

    /**
     * Gets the value of the currentSysMemConfig property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentSysMemConfig() {
        return currentSysMemConfig;
    }

    /**
     * Sets the value of the currentSysMemConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentSysMemConfig(String value) {
        this.currentSysMemConfig = value;
    }

    /**
     * Gets the value of the aarArsPatternsUsed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAarArsPatternsUsed() {
        return aarArsPatternsUsed;
    }

    /**
     * Sets the value of the aarArsPatternsUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAarArsPatternsUsed(String value) {
        this.aarArsPatternsUsed = value;
    }

    /**
     * Gets the value of the aarArsPatternsAval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAarArsPatternsAval() {
        return aarArsPatternsAval;
    }

    /**
     * Sets the value of the aarArsPatternsAval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAarArsPatternsAval(String value) {
        this.aarArsPatternsAval = value;
    }

    /**
     * Gets the value of the aarArsPattrnSysLim property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAarArsPattrnSysLim() {
        return aarArsPattrnSysLim;
    }

    /**
     * Sets the value of the aarArsPattrnSysLim property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAarArsPattrnSysLim(String value) {
        this.aarArsPattrnSysLim = value;
    }

    /**
     * Gets the value of the aarArsIDSUsed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAarArsIDSUsed() {
        return aarArsIDSUsed;
    }

    /**
     * Sets the value of the aarArsIDSUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAarArsIDSUsed(String value) {
        this.aarArsIDSUsed = value;
    }

    /**
     * Gets the value of the aarArsIDSAval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAarArsIDSAval() {
        return aarArsIDSAval;
    }

    /**
     * Sets the value of the aarArsIDSAval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAarArsIDSAval(String value) {
        this.aarArsIDSAval = value;
    }

    /**
     * Gets the value of the aarArsIDSSysLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAarArsIDSSysLimit() {
        return aarArsIDSSysLimit;
    }

    /**
     * Sets the value of the aarArsIDSSysLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAarArsIDSSysLimit(String value) {
        this.aarArsIDSSysLimit = value;
    }

    /**
     * Gets the value of the adEntriesUsed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADEntriesUsed() {
        return adEntriesUsed;
    }

    /**
     * Sets the value of the adEntriesUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADEntriesUsed(String value) {
        this.adEntriesUsed = value;
    }

    /**
     * Gets the value of the adEntriesAval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADEntriesAval() {
        return adEntriesAval;
    }

    /**
     * Sets the value of the adEntriesAval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADEntriesAval(String value) {
        this.adEntriesAval = value;
    }

    /**
     * Gets the value of the adEntriesSysLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADEntriesSysLimit() {
        return adEntriesSysLimit;
    }

    /**
     * Sets the value of the adEntriesSysLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADEntriesSysLimit(String value) {
        this.adEntriesSysLimit = value;
    }

    /**
     * Gets the value of the adPersListsUsed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADPersListsUsed() {
        return adPersListsUsed;
    }

    /**
     * Sets the value of the adPersListsUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADPersListsUsed(String value) {
        this.adPersListsUsed = value;
    }

    /**
     * Gets the value of the adPersListsAval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADPersListsAval() {
        return adPersListsAval;
    }

    /**
     * Sets the value of the adPersListsAval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADPersListsAval(String value) {
        this.adPersListsAval = value;
    }

    /**
     * Gets the value of the adPersListsSysLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADPersListsSysLimit() {
        return adPersListsSysLimit;
    }

    /**
     * Sets the value of the adPersListsSysLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADPersListsSysLimit(String value) {
        this.adPersListsSysLimit = value;
    }

    /**
     * Gets the value of the asaiaContAssocUsed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getASAIAContAssocUsed() {
        return asaiaContAssocUsed;
    }

    /**
     * Sets the value of the asaiaContAssocUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setASAIAContAssocUsed(String value) {
        this.asaiaContAssocUsed = value;
    }

    /**
     * Gets the value of the asaiaContAssocAval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getASAIAContAssocAval() {
        return asaiaContAssocAval;
    }

    /**
     * Sets the value of the asaiaContAssocAval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setASAIAContAssocAval(String value) {
        this.asaiaContAssocAval = value;
    }

    /**
     * Gets the value of the asaiaContAssocSysLim property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getASAIAContAssocSysLim() {
        return asaiaContAssocSysLim;
    }

    /**
     * Sets the value of the asaiaContAssocSysLim property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setASAIAContAssocSysLim(String value) {
        this.asaiaContAssocSysLim = value;
    }

    /**
     * Gets the value of the asaiNotifReqUsed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getASAINotifReqUsed() {
        return asaiNotifReqUsed;
    }

    /**
     * Sets the value of the asaiNotifReqUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setASAINotifReqUsed(String value) {
        this.asaiNotifReqUsed = value;
    }

    /**
     * Gets the value of the asaiNotifReqAval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getASAINotifReqAval() {
        return asaiNotifReqAval;
    }

    /**
     * Sets the value of the asaiNotifReqAval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setASAINotifReqAval(String value) {
        this.asaiNotifReqAval = value;
    }

    /**
     * Gets the value of the asaiNotifReqSysLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getASAINotifReqSysLimit() {
        return asaiNotifReqSysLimit;
    }

    /**
     * Sets the value of the asaiNotifReqSysLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setASAINotifReqSysLimit(String value) {
        this.asaiNotifReqSysLimit = value;
    }

    /**
     * Gets the value of the asaisaaccUsed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getASAISAACCUsed() {
        return asaisaaccUsed;
    }

    /**
     * Sets the value of the asaisaaccUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setASAISAACCUsed(String value) {
        this.asaisaaccUsed = value;
    }

    /**
     * Gets the value of the asaisaaccAval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getASAISAACCAval() {
        return asaisaaccAval;
    }

    /**
     * Sets the value of the asaisaaccAval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setASAISAACCAval(String value) {
        this.asaisaaccAval = value;
    }

    /**
     * Gets the value of the asaisaaccSysLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getASAISAACCSysLimit() {
        return asaisaaccSysLimit;
    }

    /**
     * Sets the value of the asaisaaccSysLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setASAISAACCSysLimit(String value) {
        this.asaisaaccSysLimit = value;
    }

    /**
     * Gets the value of the attendantPosUsed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttendantPosUsed() {
        return attendantPosUsed;
    }

    /**
     * Sets the value of the attendantPosUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttendantPosUsed(String value) {
        this.attendantPosUsed = value;
    }

    /**
     * Gets the value of the attendantPosAval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttendantPosAval() {
        return attendantPosAval;
    }

    /**
     * Sets the value of the attendantPosAval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttendantPosAval(String value) {
        this.attendantPosAval = value;
    }

    /**
     * Gets the value of the attendantPosSysLim property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttendantPosSysLim() {
        return attendantPosSysLim;
    }

    /**
     * Sets the value of the attendantPosSysLim property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttendantPosSysLim(String value) {
        this.attendantPosSysLim = value;
    }

    /**
     * Gets the value of the attendantQueueLenUsed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttendantQueueLenUsed() {
        return attendantQueueLenUsed;
    }

    /**
     * Sets the value of the attendantQueueLenUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttendantQueueLenUsed(String value) {
        this.attendantQueueLenUsed = value;
    }

    /**
     * Gets the value of the attendantQueueLenAval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttendantQueueLenAval() {
        return attendantQueueLenAval;
    }

    /**
     * Sets the value of the attendantQueueLenAval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttendantQueueLenAval(String value) {
        this.attendantQueueLenAval = value;
    }

    /**
     * Gets the value of the attndantQueLenSysLim property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttndantQueLenSysLim() {
        return attndantQueLenSysLim;
    }

    /**
     * Sets the value of the attndantQueLenSysLim property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttndantQueLenSysLim(String value) {
        this.attndantQueLenSysLim = value;
    }

    /**
     * Gets the value of the attndantStatButUsd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttndantStatButUsd() {
        return attndantStatButUsd;
    }

    /**
     * Sets the value of the attndantStatButUsd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttndantStatButUsd(String value) {
        this.attndantStatButUsd = value;
    }

    /**
     * Gets the value of the attndantStatButAvl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttndantStatButAvl() {
        return attndantStatButAvl;
    }

    /**
     * Sets the value of the attndantStatButAvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttndantStatButAvl(String value) {
        this.attndantStatButAvl = value;
    }

    /**
     * Gets the value of the atndtStatButSysLim property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAtndtStatButSysLim() {
        return atndtStatButSysLim;
    }

    /**
     * Sets the value of the atndtStatButSysLim property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAtndtStatButSysLim(String value) {
        this.atndtStatButSysLim = value;
    }

    /**
     * Gets the value of the authCodesUsed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthCodesUsed() {
        return authCodesUsed;
    }

    /**
     * Sets the value of the authCodesUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthCodesUsed(String value) {
        this.authCodesUsed = value;
    }

    /**
     * Gets the value of the authCodesAval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthCodesAval() {
        return authCodesAval;
    }

    /**
     * Sets the value of the authCodesAval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthCodesAval(String value) {
        this.authCodesAval = value;
    }

    /**
     * Gets the value of the authCodesSysLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthCodesSysLimit() {
        return authCodesSysLimit;
    }

    /**
     * Sets the value of the authCodesSysLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthCodesSysLimit(String value) {
        this.authCodesSysLimit = value;
    }

    /**
     * Gets the value of the bcmsMeasAgentsUsed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBCMSMeasAgentsUsed() {
        return bcmsMeasAgentsUsed;
    }

    /**
     * Sets the value of the bcmsMeasAgentsUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBCMSMeasAgentsUsed(String value) {
        this.bcmsMeasAgentsUsed = value;
    }

    /**
     * Gets the value of the bcmsMeasAgentsAval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBCMSMeasAgentsAval() {
        return bcmsMeasAgentsAval;
    }

    /**
     * Sets the value of the bcmsMeasAgentsAval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBCMSMeasAgentsAval(String value) {
        this.bcmsMeasAgentsAval = value;
    }

    /**
     * Gets the value of the bcmsMeasAgentsSysLim property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBCMSMeasAgentsSysLim() {
        return bcmsMeasAgentsSysLim;
    }

    /**
     * Sets the value of the bcmsMeasAgentsSysLim property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBCMSMeasAgentsSysLim(String value) {
        this.bcmsMeasAgentsSysLim = value;
    }

    /**
     * Gets the value of the bcmsMeasACDmUsed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBCMSMeasACDmUsed() {
        return bcmsMeasACDmUsed;
    }

    /**
     * Sets the value of the bcmsMeasACDmUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBCMSMeasACDmUsed(String value) {
        this.bcmsMeasACDmUsed = value;
    }

    /**
     * Gets the value of the bcmsMeasACDmAval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBCMSMeasACDmAval() {
        return bcmsMeasACDmAval;
    }

    /**
     * Sets the value of the bcmsMeasACDmAval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBCMSMeasACDmAval(String value) {
        this.bcmsMeasACDmAval = value;
    }

    /**
     * Gets the value of the bcmsMeasACDmSysLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBCMSMeasACDmSysLimit() {
        return bcmsMeasACDmSysLimit;
    }

    /**
     * Sets the value of the bcmsMeasACDmSysLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBCMSMeasACDmSysLimit(String value) {
        this.bcmsMeasACDmSysLimit = value;
    }

    /**
     * Gets the value of the bcmsSplitSkillsUsed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBCMSSplitSkillsUsed() {
        return bcmsSplitSkillsUsed;
    }

    /**
     * Sets the value of the bcmsSplitSkillsUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBCMSSplitSkillsUsed(String value) {
        this.bcmsSplitSkillsUsed = value;
    }

    /**
     * Gets the value of the bcmsSplitSkillsAval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBCMSSplitSkillsAval() {
        return bcmsSplitSkillsAval;
    }

    /**
     * Sets the value of the bcmsSplitSkillsAval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBCMSSplitSkillsAval(String value) {
        this.bcmsSplitSkillsAval = value;
    }

    /**
     * Gets the value of the bcmsSplitSklSysLim property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBCMSSplitSklSysLim() {
        return bcmsSplitSklSysLim;
    }

    /**
     * Sets the value of the bcmsSplitSklSysLim property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBCMSSplitSklSysLim(String value) {
        this.bcmsSplitSklSysLim = value;
    }

    /**
     * Gets the value of the bcmsMeasVDNSUsed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBCMSMeasVDNSUsed() {
        return bcmsMeasVDNSUsed;
    }

    /**
     * Sets the value of the bcmsMeasVDNSUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBCMSMeasVDNSUsed(String value) {
        this.bcmsMeasVDNSUsed = value;
    }

    /**
     * Gets the value of the bcmsMeasVDNSAval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBCMSMeasVDNSAval() {
        return bcmsMeasVDNSAval;
    }

    /**
     * Sets the value of the bcmsMeasVDNSAval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBCMSMeasVDNSAval(String value) {
        this.bcmsMeasVDNSAval = value;
    }

    /**
     * Gets the value of the bcmsMeasVDNSSysLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBCMSMeasVDNSSysLimit() {
        return bcmsMeasVDNSSysLimit;
    }

    /**
     * Sets the value of the bcmsMeasVDNSSysLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBCMSMeasVDNSSysLimit(String value) {
        this.bcmsMeasVDNSSysLimit = value;
    }

    /**
     * Gets the value of the callCovAnsGroupUsed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallCovAnsGroupUsed() {
        return callCovAnsGroupUsed;
    }

    /**
     * Sets the value of the callCovAnsGroupUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallCovAnsGroupUsed(String value) {
        this.callCovAnsGroupUsed = value;
    }

    /**
     * Gets the value of the callCovAnsGroupAval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallCovAnsGroupAval() {
        return callCovAnsGroupAval;
    }

    /**
     * Sets the value of the callCovAnsGroupAval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallCovAnsGroupAval(String value) {
        this.callCovAnsGroupAval = value;
    }

    /**
     * Gets the value of the callCovAnsGrpSysLim property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallCovAnsGrpSysLim() {
        return callCovAnsGrpSysLim;
    }

    /**
     * Sets the value of the callCovAnsGrpSysLim property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallCovAnsGrpSysLim(String value) {
        this.callCovAnsGrpSysLim = value;
    }

    /**
     * Gets the value of the callCovPathUsed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallCovPathUsed() {
        return callCovPathUsed;
    }

    /**
     * Sets the value of the callCovPathUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallCovPathUsed(String value) {
        this.callCovPathUsed = value;
    }

    /**
     * Gets the value of the callCovPathAval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallCovPathAval() {
        return callCovPathAval;
    }

    /**
     * Sets the value of the callCovPathAval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallCovPathAval(String value) {
        this.callCovPathAval = value;
    }

    /**
     * Gets the value of the callCovPathSysLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallCovPathSysLimit() {
        return callCovPathSysLimit;
    }

    /**
     * Sets the value of the callCovPathSysLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallCovPathSysLimit(String value) {
        this.callCovPathSysLimit = value;
    }

    /**
     * Gets the value of the callCovPckpGrpUsed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallCovPckpGrpUsed() {
        return callCovPckpGrpUsed;
    }

    /**
     * Sets the value of the callCovPckpGrpUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallCovPckpGrpUsed(String value) {
        this.callCovPckpGrpUsed = value;
    }

    /**
     * Gets the value of the callCovPckpGrpAval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallCovPckpGrpAval() {
        return callCovPckpGrpAval;
    }

    /**
     * Sets the value of the callCovPckpGrpAval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallCovPckpGrpAval(String value) {
        this.callCovPckpGrpAval = value;
    }

    /**
     * Gets the value of the callCovPkpGrpSyLim property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallCovPkpGrpSyLim() {
        return callCovPkpGrpSyLim;
    }

    /**
     * Sets the value of the callCovPkpGrpSyLim property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallCovPkpGrpSyLim(String value) {
        this.callCovPkpGrpSyLim = value;
    }

    /**
     * Gets the value of the callRecordsSysLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallRecordsSysLimit() {
        return callRecordsSysLimit;
    }

    /**
     * Sets the value of the callRecordsSysLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallRecordsSysLimit(String value) {
        this.callRecordsSysLimit = value;
    }

    /**
     * Gets the value of the totalVDNUsed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalVDNUsed() {
        return totalVDNUsed;
    }

    /**
     * Sets the value of the totalVDNUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalVDNUsed(String value) {
        this.totalVDNUsed = value;
    }

    /**
     * Gets the value of the totalVDNAval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalVDNAval() {
        return totalVDNAval;
    }

    /**
     * Sets the value of the totalVDNAval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalVDNAval(String value) {
        this.totalVDNAval = value;
    }

    /**
     * Gets the value of the totalVDNSysLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalVDNSysLimit() {
        return totalVDNSysLimit;
    }

    /**
     * Sets the value of the totalVDNSysLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalVDNSysLimit(String value) {
        this.totalVDNSysLimit = value;
    }

    /**
     * Gets the value of the meetMeVDNUsed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeetMeVDNUsed() {
        return meetMeVDNUsed;
    }

    /**
     * Sets the value of the meetMeVDNUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeetMeVDNUsed(String value) {
        this.meetMeVDNUsed = value;
    }

    /**
     * Gets the value of the meetMeVDNAval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeetMeVDNAval() {
        return meetMeVDNAval;
    }

    /**
     * Sets the value of the meetMeVDNAval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeetMeVDNAval(String value) {
        this.meetMeVDNAval = value;
    }

    /**
     * Gets the value of the meetMeVDNSysLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeetMeVDNSysLimit() {
        return meetMeVDNSysLimit;
    }

    /**
     * Sets the value of the meetMeVDNSysLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeetMeVDNSysLimit(String value) {
        this.meetMeVDNSysLimit = value;
    }

    /**
     * Gets the value of the meetMeConfPortsUsed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeetMeConfPortsUsed() {
        return meetMeConfPortsUsed;
    }

    /**
     * Sets the value of the meetMeConfPortsUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeetMeConfPortsUsed(String value) {
        this.meetMeConfPortsUsed = value;
    }

    /**
     * Gets the value of the meetMeConfPortsAval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeetMeConfPortsAval() {
        return meetMeConfPortsAval;
    }

    /**
     * Sets the value of the meetMeConfPortsAval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeetMeConfPortsAval(String value) {
        this.meetMeConfPortsAval = value;
    }

    /**
     * Gets the value of the meetMeCnfPortSysLim property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeetMeCnfPortSysLim() {
        return meetMeCnfPortSysLim;
    }

    /**
     * Sets the value of the meetMeCnfPortSysLim property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeetMeCnfPortSysLim(String value) {
        this.meetMeCnfPortSysLim = value;
    }

    /**
     * Gets the value of the totalVectorsUsed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalVectorsUsed() {
        return totalVectorsUsed;
    }

    /**
     * Sets the value of the totalVectorsUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalVectorsUsed(String value) {
        this.totalVectorsUsed = value;
    }

    /**
     * Gets the value of the totalVectorsAval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalVectorsAval() {
        return totalVectorsAval;
    }

    /**
     * Sets the value of the totalVectorsAval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalVectorsAval(String value) {
        this.totalVectorsAval = value;
    }

    /**
     * Gets the value of the totalVectorsSysLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalVectorsSysLimit() {
        return totalVectorsSysLimit;
    }

    /**
     * Sets the value of the totalVectorsSysLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalVectorsSysLimit(String value) {
        this.totalVectorsSysLimit = value;
    }

    /**
     * Gets the value of the meetMeVectorsUsed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeetMeVectorsUsed() {
        return meetMeVectorsUsed;
    }

    /**
     * Sets the value of the meetMeVectorsUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeetMeVectorsUsed(String value) {
        this.meetMeVectorsUsed = value;
    }

    /**
     * Gets the value of the meetMeVectorsAval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeetMeVectorsAval() {
        return meetMeVectorsAval;
    }

    /**
     * Sets the value of the meetMeVectorsAval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeetMeVectorsAval(String value) {
        this.meetMeVectorsAval = value;
    }

    /**
     * Gets the value of the meetMeVectorsSysLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeetMeVectorsSysLimit() {
        return meetMeVectorsSysLimit;
    }

    /**
     * Sets the value of the meetMeVectorsSysLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeetMeVectorsSysLimit(String value) {
        this.meetMeVectorsSysLimit = value;
    }

    /**
     * Gets the value of the bsrAppLocPairsUsed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBSRAppLocPairsUsed() {
        return bsrAppLocPairsUsed;
    }

    /**
     * Sets the value of the bsrAppLocPairsUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBSRAppLocPairsUsed(String value) {
        this.bsrAppLocPairsUsed = value;
    }

    /**
     * Gets the value of the bsrAppLocPairsAval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBSRAppLocPairsAval() {
        return bsrAppLocPairsAval;
    }

    /**
     * Sets the value of the bsrAppLocPairsAval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBSRAppLocPairsAval(String value) {
        this.bsrAppLocPairsAval = value;
    }

    /**
     * Gets the value of the bsrAppLocPairsSysLim property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBSRAppLocPairsSysLim() {
        return bsrAppLocPairsSysLim;
    }

    /**
     * Sets the value of the bsrAppLocPairsSysLim property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBSRAppLocPairsSysLim(String value) {
        this.bsrAppLocPairsSysLim = value;
    }

    /**
     * Gets the value of the backBSRPollVDNUsed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackBSRPollVDNUsed() {
        return backBSRPollVDNUsed;
    }

    /**
     * Sets the value of the backBSRPollVDNUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackBSRPollVDNUsed(String value) {
        this.backBSRPollVDNUsed = value;
    }

    /**
     * Gets the value of the backBSRPollVDNAval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackBSRPollVDNAval() {
        return backBSRPollVDNAval;
    }

    /**
     * Sets the value of the backBSRPollVDNAval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackBSRPollVDNAval(String value) {
        this.backBSRPollVDNAval = value;
    }

    /**
     * Gets the value of the backBSRPollVDNSysLim property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackBSRPollVDNSysLim() {
        return backBSRPollVDNSysLim;
    }

    /**
     * Sets the value of the backBSRPollVDNSysLim property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackBSRPollVDNSysLim(String value) {
        this.backBSRPollVDNSysLim = value;
    }

    /**
     * Gets the value of the administeredConsUsed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdministeredConsUsed() {
        return administeredConsUsed;
    }

    /**
     * Sets the value of the administeredConsUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdministeredConsUsed(String value) {
        this.administeredConsUsed = value;
    }

    /**
     * Gets the value of the administeredConsAval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdministeredConsAval() {
        return administeredConsAval;
    }

    /**
     * Sets the value of the administeredConsAval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdministeredConsAval(String value) {
        this.administeredConsAval = value;
    }

    /**
     * Gets the value of the administeredConsSysLim property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdministeredConsSysLim() {
        return administeredConsSysLim;
    }

    /**
     * Sets the value of the administeredConsSysLim property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdministeredConsSysLim(String value) {
        this.administeredConsSysLim = value;
    }

    /**
     * Gets the value of the alphaDialEntriesUsed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlphaDialEntriesUsed() {
        return alphaDialEntriesUsed;
    }

    /**
     * Sets the value of the alphaDialEntriesUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlphaDialEntriesUsed(String value) {
        this.alphaDialEntriesUsed = value;
    }

    /**
     * Gets the value of the alphaDialEntriesAval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlphaDialEntriesAval() {
        return alphaDialEntriesAval;
    }

    /**
     * Sets the value of the alphaDialEntriesAval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlphaDialEntriesAval(String value) {
        this.alphaDialEntriesAval = value;
    }

    /**
     * Gets the value of the alphaDialEntSysLim property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlphaDialEntSysLim() {
        return alphaDialEntSysLim;
    }

    /**
     * Sets the value of the alphaDialEntSysLim property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlphaDialEntSysLim(String value) {
        this.alphaDialEntSysLim = value;
    }

    /**
     * Gets the value of the dialPlanExtUsed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDialPlanExtUsed() {
        return dialPlanExtUsed;
    }

    /**
     * Sets the value of the dialPlanExtUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDialPlanExtUsed(String value) {
        this.dialPlanExtUsed = value;
    }

    /**
     * Gets the value of the dialPlanExtAval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDialPlanExtAval() {
        return dialPlanExtAval;
    }

    /**
     * Sets the value of the dialPlanExtAval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDialPlanExtAval(String value) {
        this.dialPlanExtAval = value;
    }

    /**
     * Gets the value of the dialPlanExtSysLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDialPlanExtSysLimit() {
        return dialPlanExtSysLimit;
    }

    /**
     * Sets the value of the dialPlanExtSysLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDialPlanExtSysLimit(String value) {
        this.dialPlanExtSysLimit = value;
    }

    /**
     * Gets the value of the miscDialPlanExtUsed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiscDialPlanExtUsed() {
        return miscDialPlanExtUsed;
    }

    /**
     * Sets the value of the miscDialPlanExtUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiscDialPlanExtUsed(String value) {
        this.miscDialPlanExtUsed = value;
    }

    /**
     * Gets the value of the miscDialPlanExtAval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiscDialPlanExtAval() {
        return miscDialPlanExtAval;
    }

    /**
     * Sets the value of the miscDialPlanExtAval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiscDialPlanExtAval(String value) {
        this.miscDialPlanExtAval = value;
    }

    /**
     * Gets the value of the miscDlPlnExSysLim property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiscDlPlnExSysLim() {
        return miscDlPlnExSysLim;
    }

    /**
     * Sets the value of the miscDlPlnExSysLim property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiscDlPlnExSysLim(String value) {
        this.miscDlPlnExSysLim = value;
    }

    /**
     * Gets the value of the udpExtRecoresUsed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUDPExtRecoresUsed() {
        return udpExtRecoresUsed;
    }

    /**
     * Sets the value of the udpExtRecoresUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUDPExtRecoresUsed(String value) {
        this.udpExtRecoresUsed = value;
    }

    /**
     * Gets the value of the udpExtRecoresAval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUDPExtRecoresAval() {
        return udpExtRecoresAval;
    }

    /**
     * Sets the value of the udpExtRecoresAval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUDPExtRecoresAval(String value) {
        this.udpExtRecoresAval = value;
    }

    /**
     * Gets the value of the udpExtRecoresSysLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUDPExtRecoresSysLimit() {
        return udpExtRecoresSysLimit;
    }

    /**
     * Sets the value of the udpExtRecoresSysLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUDPExtRecoresSysLimit(String value) {
        this.udpExtRecoresSysLimit = value;
    }

    /**
     * Gets the value of the digitalDataEndUsed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDigitalDataEndUsed() {
        return digitalDataEndUsed;
    }

    /**
     * Sets the value of the digitalDataEndUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDigitalDataEndUsed(String value) {
        this.digitalDataEndUsed = value;
    }

    /**
     * Gets the value of the digitalDataEndAval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDigitalDataEndAval() {
        return digitalDataEndAval;
    }

    /**
     * Sets the value of the digitalDataEndAval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDigitalDataEndAval(String value) {
        this.digitalDataEndAval = value;
    }

    /**
     * Gets the value of the digDataEndSysLim property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDigDataEndSysLim() {
        return digDataEndSysLim;
    }

    /**
     * Sets the value of the digDataEndSysLim property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDigDataEndSysLim(String value) {
        this.digDataEndSysLim = value;
    }

    /**
     * Gets the value of the expPortNetUsed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpPortNetUsed() {
        return expPortNetUsed;
    }

    /**
     * Sets the value of the expPortNetUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpPortNetUsed(String value) {
        this.expPortNetUsed = value;
    }

    /**
     * Gets the value of the expPortNetAval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpPortNetAval() {
        return expPortNetAval;
    }

    /**
     * Sets the value of the expPortNetAval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpPortNetAval(String value) {
        this.expPortNetAval = value;
    }

    /**
     * Gets the value of the expPortNetSysLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpPortNetSysLimit() {
        return expPortNetSysLimit;
    }

    /**
     * Sets the value of the expPortNetSysLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpPortNetSysLimit(String value) {
        this.expPortNetSysLimit = value;
    }

    /**
     * Gets the value of the facilityBusyIndUsed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacilityBusyIndUsed() {
        return facilityBusyIndUsed;
    }

    /**
     * Sets the value of the facilityBusyIndUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacilityBusyIndUsed(String value) {
        this.facilityBusyIndUsed = value;
    }

    /**
     * Gets the value of the facilityBusyAval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacilityBusyAval() {
        return facilityBusyAval;
    }

    /**
     * Sets the value of the facilityBusyAval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacilityBusyAval(String value) {
        this.facilityBusyAval = value;
    }

    /**
     * Gets the value of the facltyBsyIndSysLim property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacltyBsyIndSysLim() {
        return facltyBsyIndSysLim;
    }

    /**
     * Sets the value of the facltyBsyIndSysLim property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacltyBsyIndSysLim(String value) {
        this.facltyBsyIndSysLim = value;
    }

    /**
     * Gets the value of the groupSpitSkillsUsed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupSpitSkillsUsed() {
        return groupSpitSkillsUsed;
    }

    /**
     * Sets the value of the groupSpitSkillsUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupSpitSkillsUsed(String value) {
        this.groupSpitSkillsUsed = value;
    }

    /**
     * Gets the value of the groupSpitSkillsAval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupSpitSkillsAval() {
        return groupSpitSkillsAval;
    }

    /**
     * Sets the value of the groupSpitSkillsAval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupSpitSkillsAval(String value) {
        this.groupSpitSkillsAval = value;
    }

    /**
     * Gets the value of the groupSpitSkillsSysLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupSpitSkillsSysLimit() {
        return groupSpitSkillsSysLimit;
    }

    /**
     * Sets the value of the groupSpitSkillsSysLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupSpitSkillsSysLimit(String value) {
        this.groupSpitSkillsSysLimit = value;
    }

    /**
     * Gets the value of the adminLogAgeUsed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdminLogAgeUsed() {
        return adminLogAgeUsed;
    }

    /**
     * Sets the value of the adminLogAgeUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdminLogAgeUsed(String value) {
        this.adminLogAgeUsed = value;
    }

    /**
     * Gets the value of the adminLogAgeAval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdminLogAgeAval() {
        return adminLogAgeAval;
    }

    /**
     * Sets the value of the adminLogAgeAval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdminLogAgeAval(String value) {
        this.adminLogAgeAval = value;
    }

    /**
     * Gets the value of the adminLogAgeSysLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdminLogAgeSysLimit() {
        return adminLogAgeSysLimit;
    }

    /**
     * Sets the value of the adminLogAgeSysLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdminLogAgeSysLimit(String value) {
        this.adminLogAgeSysLimit = value;
    }

    /**
     * Gets the value of the adminLogAgeSkillUsed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdminLogAgeSkillUsed() {
        return adminLogAgeSkillUsed;
    }

    /**
     * Sets the value of the adminLogAgeSkillUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdminLogAgeSkillUsed(String value) {
        this.adminLogAgeSkillUsed = value;
    }

    /**
     * Gets the value of the adminLogAgeSkillAval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdminLogAgeSkillAval() {
        return adminLogAgeSkillAval;
    }

    /**
     * Sets the value of the adminLogAgeSkillAval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdminLogAgeSkillAval(String value) {
        this.adminLogAgeSkillAval = value;
    }

    /**
     * Gets the value of the adminLogAgeSklSysLim property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdminLogAgeSklSysLim() {
        return adminLogAgeSklSysLim;
    }

    /**
     * Sets the value of the adminLogAgeSklSysLim property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdminLogAgeSklSysLim(String value) {
        this.adminLogAgeSklSysLim = value;
    }

    /**
     * Gets the value of the loggedInACDsUsed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoggedInACDsUsed() {
        return loggedInACDsUsed;
    }

    /**
     * Sets the value of the loggedInACDsUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoggedInACDsUsed(String value) {
        this.loggedInACDsUsed = value;
    }

    /**
     * Gets the value of the loggedInACDsAval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoggedInACDsAval() {
        return loggedInACDsAval;
    }

    /**
     * Sets the value of the loggedInACDsAval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoggedInACDsAval(String value) {
        this.loggedInACDsAval = value;
    }

    /**
     * Gets the value of the loggedInACDsSysLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoggedInACDsSysLimit() {
        return loggedInACDsSysLimit;
    }

    /**
     * Sets the value of the loggedInACDsSysLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoggedInACDsSysLimit(String value) {
        this.loggedInACDsSysLimit = value;
    }

    /**
     * Gets the value of the loggedInAdvocatesUsed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoggedInAdvocatesUsed() {
        return loggedInAdvocatesUsed;
    }

    /**
     * Sets the value of the loggedInAdvocatesUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoggedInAdvocatesUsed(String value) {
        this.loggedInAdvocatesUsed = value;
    }

    /**
     * Gets the value of the loggedInAdvocatesAval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoggedInAdvocatesAval() {
        return loggedInAdvocatesAval;
    }

    /**
     * Sets the value of the loggedInAdvocatesAval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoggedInAdvocatesAval(String value) {
        this.loggedInAdvocatesAval = value;
    }

    /**
     * Gets the value of the loggedInAdvctsSysLim property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoggedInAdvctsSysLim() {
        return loggedInAdvctsSysLim;
    }

    /**
     * Sets the value of the loggedInAdvctsSysLim property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoggedInAdvctsSysLim(String value) {
        this.loggedInAdvctsSysLim = value;
    }

    /**
     * Gets the value of the loggedInIPSoftAgtUsed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoggedInIPSoftAgtUsed() {
        return loggedInIPSoftAgtUsed;
    }

    /**
     * Sets the value of the loggedInIPSoftAgtUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoggedInIPSoftAgtUsed(String value) {
        this.loggedInIPSoftAgtUsed = value;
    }

    /**
     * Gets the value of the loggedInIPSoftAgtAval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoggedInIPSoftAgtAval() {
        return loggedInIPSoftAgtAval;
    }

    /**
     * Sets the value of the loggedInIPSoftAgtAval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoggedInIPSoftAgtAval(String value) {
        this.loggedInIPSoftAgtAval = value;
    }

    /**
     * Gets the value of the lgnIPSftAgtSysLim property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLgnIPSftAgtSysLim() {
        return lgnIPSftAgtSysLim;
    }

    /**
     * Sets the value of the lgnIPSftAgtSysLim property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLgnIPSftAgtSysLim(String value) {
        this.lgnIPSftAgtSysLim = value;
    }

    /**
     * Gets the value of the groupMembersUsed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupMembersUsed() {
        return groupMembersUsed;
    }

    /**
     * Sets the value of the groupMembersUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupMembersUsed(String value) {
        this.groupMembersUsed = value;
    }

    /**
     * Gets the value of the groupMembersAval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupMembersAval() {
        return groupMembersAval;
    }

    /**
     * Sets the value of the groupMembersAval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupMembersAval(String value) {
        this.groupMembersAval = value;
    }

    /**
     * Gets the value of the groupMembersSysLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupMembersSysLimit() {
        return groupMembersSysLimit;
    }

    /**
     * Sets the value of the groupMembersSysLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupMembersSysLimit(String value) {
        this.groupMembersSysLimit = value;
    }

    /**
     * Gets the value of the cmsacdMembersUsed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCMSACDMembersUsed() {
        return cmsacdMembersUsed;
    }

    /**
     * Sets the value of the cmsacdMembersUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCMSACDMembersUsed(String value) {
        this.cmsacdMembersUsed = value;
    }

    /**
     * Gets the value of the cmsacdMembersAval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCMSACDMembersAval() {
        return cmsacdMembersAval;
    }

    /**
     * Sets the value of the cmsacdMembersAval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCMSACDMembersAval(String value) {
        this.cmsacdMembersAval = value;
    }

    /**
     * Gets the value of the cmsacdMemSysLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCMSACDMemSysLimit() {
        return cmsacdMemSysLimit;
    }

    /**
     * Sets the value of the cmsacdMemSysLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCMSACDMemSysLimit(String value) {
        this.cmsacdMemSysLimit = value;
    }

    /**
     * Gets the value of the dynamicQueueSlUsed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDynamicQueueSlUsed() {
        return dynamicQueueSlUsed;
    }

    /**
     * Sets the value of the dynamicQueueSlUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDynamicQueueSlUsed(String value) {
        this.dynamicQueueSlUsed = value;
    }

    /**
     * Gets the value of the dynamicQueueSlAval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDynamicQueueSlAval() {
        return dynamicQueueSlAval;
    }

    /**
     * Sets the value of the dynamicQueueSlAval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDynamicQueueSlAval(String value) {
        this.dynamicQueueSlAval = value;
    }

    /**
     * Gets the value of the dynamicQuelSysLim property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDynamicQuelSysLim() {
        return dynamicQuelSysLim;
    }

    /**
     * Sets the value of the dynamicQuelSysLim property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDynamicQuelSysLim(String value) {
        this.dynamicQuelSysLim = value;
    }

    /**
     * Gets the value of the queueCallStatButUsed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueueCallStatButUsed() {
        return queueCallStatButUsed;
    }

    /**
     * Sets the value of the queueCallStatButUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueueCallStatButUsed(String value) {
        this.queueCallStatButUsed = value;
    }

    /**
     * Gets the value of the queueCallStatButAval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueueCallStatButAval() {
        return queueCallStatButAval;
    }

    /**
     * Sets the value of the queueCallStatButAval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueueCallStatButAval(String value) {
        this.queueCallStatButAval = value;
    }

    /**
     * Gets the value of the queueCallStatButSysLim property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueueCallStatButSysLim() {
        return queueCallStatButSysLim;
    }

    /**
     * Sets the value of the queueCallStatButSysLim property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueueCallStatButSysLim(String value) {
        this.queueCallStatButSysLim = value;
    }

    /**
     * Gets the value of the intercomGroupsUsed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntercomGroupsUsed() {
        return intercomGroupsUsed;
    }

    /**
     * Sets the value of the intercomGroupsUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntercomGroupsUsed(String value) {
        this.intercomGroupsUsed = value;
    }

    /**
     * Gets the value of the intercomGroupsAval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntercomGroupsAval() {
        return intercomGroupsAval;
    }

    /**
     * Sets the value of the intercomGroupsAval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntercomGroupsAval(String value) {
        this.intercomGroupsAval = value;
    }

    /**
     * Gets the value of the intercomGrpSysLim property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntercomGrpSysLim() {
        return intercomGrpSysLim;
    }

    /**
     * Sets the value of the intercomGrpSysLim property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntercomGrpSysLim(String value) {
        this.intercomGrpSysLim = value;
    }

    /**
     * Gets the value of the modemPoolGroupsUsed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModemPoolGroupsUsed() {
        return modemPoolGroupsUsed;
    }

    /**
     * Sets the value of the modemPoolGroupsUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModemPoolGroupsUsed(String value) {
        this.modemPoolGroupsUsed = value;
    }

    /**
     * Gets the value of the modemPoolGroupsAval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModemPoolGroupsAval() {
        return modemPoolGroupsAval;
    }

    /**
     * Sets the value of the modemPoolGroupsAval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModemPoolGroupsAval(String value) {
        this.modemPoolGroupsAval = value;
    }

    /**
     * Gets the value of the modemPoolGrpsSysLim property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModemPoolGrpsSysLim() {
        return modemPoolGrpsSysLim;
    }

    /**
     * Sets the value of the modemPoolGrpsSysLim property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModemPoolGrpsSysLim(String value) {
        this.modemPoolGrpsSysLim = value;
    }

    /**
     * Gets the value of the pcolTrunkGroupsUsed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPCOLTrunkGroupsUsed() {
        return pcolTrunkGroupsUsed;
    }

    /**
     * Sets the value of the pcolTrunkGroupsUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPCOLTrunkGroupsUsed(String value) {
        this.pcolTrunkGroupsUsed = value;
    }

    /**
     * Gets the value of the pcolTrunkGroupsAval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPCOLTrunkGroupsAval() {
        return pcolTrunkGroupsAval;
    }

    /**
     * Sets the value of the pcolTrunkGroupsAval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPCOLTrunkGroupsAval(String value) {
        this.pcolTrunkGroupsAval = value;
    }

    /**
     * Gets the value of the pcolTrnGroupsSysLim property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPCOLTrnGroupsSysLim() {
        return pcolTrnGroupsSysLim;
    }

    /**
     * Sets the value of the pcolTrnGroupsSysLim property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPCOLTrnGroupsSysLim(String value) {
        this.pcolTrnGroupsSysLim = value;
    }

    /**
     * Gets the value of the analogQueueSlotsUsed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnalogQueueSlotsUsed() {
        return analogQueueSlotsUsed;
    }

    /**
     * Sets the value of the analogQueueSlotsUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnalogQueueSlotsUsed(String value) {
        this.analogQueueSlotsUsed = value;
    }

    /**
     * Gets the value of the analogQueueSlotsAval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnalogQueueSlotsAval() {
        return analogQueueSlotsAval;
    }

    /**
     * Sets the value of the analogQueueSlotsAval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnalogQueueSlotsAval(String value) {
        this.analogQueueSlotsAval = value;
    }

    /**
     * Gets the value of the analogQueSlotSysLim property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnalogQueSlotSysLim() {
        return analogQueSlotSysLim;
    }

    /**
     * Sets the value of the analogQueSlotSysLim property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnalogQueSlotSysLim(String value) {
        this.analogQueSlotSysLim = value;
    }

    /**
     * Gets the value of the extSourceComboUsed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtSourceComboUsed() {
        return extSourceComboUsed;
    }

    /**
     * Sets the value of the extSourceComboUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtSourceComboUsed(String value) {
        this.extSourceComboUsed = value;
    }

    /**
     * Gets the value of the extSourceComboAval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtSourceComboAval() {
        return extSourceComboAval;
    }

    /**
     * Sets the value of the extSourceComboAval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtSourceComboAval(String value) {
        this.extSourceComboAval = value;
    }

    /**
     * Gets the value of the extSrcComboSysLim property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtSrcComboSysLim() {
        return extSrcComboSysLim;
    }

    /**
     * Sets the value of the extSrcComboSysLim property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtSrcComboSysLim(String value) {
        this.extSrcComboSysLim = value;
    }

    /**
     * Gets the value of the tn2501VALBoardUsed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTN2501VALBoardUsed() {
        return tn2501VALBoardUsed;
    }

    /**
     * Sets the value of the tn2501VALBoardUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTN2501VALBoardUsed(String value) {
        this.tn2501VALBoardUsed = value;
    }

    /**
     * Gets the value of the tn2501VALBoardAval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTN2501VALBoardAval() {
        return tn2501VALBoardAval;
    }

    /**
     * Sets the value of the tn2501VALBoardAval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTN2501VALBoardAval(String value) {
        this.tn2501VALBoardAval = value;
    }

    /**
     * Gets the value of the tn2501VALBoardSysLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTN2501VALBoardSysLimit() {
        return tn2501VALBoardSysLimit;
    }

    /**
     * Sets the value of the tn2501VALBoardSysLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTN2501VALBoardSysLimit(String value) {
        this.tn2501VALBoardSysLimit = value;
    }

    /**
     * Gets the value of the mediaGateVVALUsed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaGateVVALUsed() {
        return mediaGateVVALUsed;
    }

    /**
     * Sets the value of the mediaGateVVALUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaGateVVALUsed(String value) {
        this.mediaGateVVALUsed = value;
    }

    /**
     * Gets the value of the mediaGateVVALAval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaGateVVALAval() {
        return mediaGateVVALAval;
    }

    /**
     * Sets the value of the mediaGateVVALAval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaGateVVALAval(String value) {
        this.mediaGateVVALAval = value;
    }

    /**
     * Gets the value of the mediaGateVVALSysLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaGateVVALSysLimit() {
        return mediaGateVVALSysLimit;
    }

    /**
     * Sets the value of the mediaGateVVALSysLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaGateVVALSysLimit(String value) {
        this.mediaGateVVALSysLimit = value;
    }

    /**
     * Gets the value of the tn2602B80VOIPUsed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTN2602B80VOIPUsed() {
        return tn2602B80VOIPUsed;
    }

    /**
     * Sets the value of the tn2602B80VOIPUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTN2602B80VOIPUsed(String value) {
        this.tn2602B80VOIPUsed = value;
    }

    /**
     * Gets the value of the tn2602B80VOIPAval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTN2602B80VOIPAval() {
        return tn2602B80VOIPAval;
    }

    /**
     * Sets the value of the tn2602B80VOIPAval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTN2602B80VOIPAval(String value) {
        this.tn2602B80VOIPAval = value;
    }

    /**
     * Gets the value of the tn2602B80VOIPSysLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTN2602B80VOIPSysLimit() {
        return tn2602B80VOIPSysLimit;
    }

    /**
     * Sets the value of the tn2602B80VOIPSysLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTN2602B80VOIPSysLimit(String value) {
        this.tn2602B80VOIPSysLimit = value;
    }

    /**
     * Gets the value of the tn2602B320VOIPUsed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTN2602B320VOIPUsed() {
        return tn2602B320VOIPUsed;
    }

    /**
     * Sets the value of the tn2602B320VOIPUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTN2602B320VOIPUsed(String value) {
        this.tn2602B320VOIPUsed = value;
    }

    /**
     * Gets the value of the tn2602B320VOIPAval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTN2602B320VOIPAval() {
        return tn2602B320VOIPAval;
    }

    /**
     * Sets the value of the tn2602B320VOIPAval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTN2602B320VOIPAval(String value) {
        this.tn2602B320VOIPAval = value;
    }

    /**
     * Gets the value of the tn2602B320VOIPSysLim property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTN2602B320VOIPSysLim() {
        return tn2602B320VOIPSysLim;
    }

    /**
     * Sets the value of the tn2602B320VOIPSysLim property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTN2602B320VOIPSysLim(String value) {
        this.tn2602B320VOIPSysLim = value;
    }

    /**
     * Gets the value of the adminsTSCsUsed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdminsTSCsUsed() {
        return adminsTSCsUsed;
    }

    /**
     * Sets the value of the adminsTSCsUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdminsTSCsUsed(String value) {
        this.adminsTSCsUsed = value;
    }

    /**
     * Gets the value of the adminsTSCsAval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdminsTSCsAval() {
        return adminsTSCsAval;
    }

    /**
     * Sets the value of the adminsTSCsAval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdminsTSCsAval(String value) {
        this.adminsTSCsAval = value;
    }

    /**
     * Gets the value of the adminsTSCsSysLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdminsTSCsSysLimit() {
        return adminsTSCsSysLimit;
    }

    /**
     * Sets the value of the adminsTSCsSysLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdminsTSCsSysLimit(String value) {
        this.adminsTSCsSysLimit = value;
    }

    /**
     * Gets the value of the ncatscCallsUsed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNCATSCCallsUsed() {
        return ncatscCallsUsed;
    }

    /**
     * Sets the value of the ncatscCallsUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNCATSCCallsUsed(String value) {
        this.ncatscCallsUsed = value;
    }

    /**
     * Gets the value of the ncatscCallsAval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNCATSCCallsAval() {
        return ncatscCallsAval;
    }

    /**
     * Sets the value of the ncatscCallsAval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNCATSCCallsAval(String value) {
        this.ncatscCallsAval = value;
    }

    /**
     * Gets the value of the ncatscCallsSysLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNCATSCCallsSysLimit() {
        return ncatscCallsSysLimit;
    }

    /**
     * Sets the value of the ncatscCallsSysLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNCATSCCallsSysLimit(String value) {
        this.ncatscCallsSysLimit = value;
    }

    /**
     * Gets the value of the ds1CircuitPacksUsed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDS1CircuitPacksUsed() {
        return ds1CircuitPacksUsed;
    }

    /**
     * Sets the value of the ds1CircuitPacksUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDS1CircuitPacksUsed(String value) {
        this.ds1CircuitPacksUsed = value;
    }

    /**
     * Gets the value of the ds1CircuitPacksAval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDS1CircuitPacksAval() {
        return ds1CircuitPacksAval;
    }

    /**
     * Sets the value of the ds1CircuitPacksAval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDS1CircuitPacksAval(String value) {
        this.ds1CircuitPacksAval = value;
    }

    /**
     * Gets the value of the ds1CrctPackSysLim property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDS1CrctPackSysLim() {
        return ds1CrctPackSysLim;
    }

    /**
     * Sets the value of the ds1CrctPackSysLim property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDS1CrctPackSysLim(String value) {
        this.ds1CrctPackSysLim = value;
    }

    /**
     * Gets the value of the ds1WithEchoUsed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDS1WithEchoUsed() {
        return ds1WithEchoUsed;
    }

    /**
     * Sets the value of the ds1WithEchoUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDS1WithEchoUsed(String value) {
        this.ds1WithEchoUsed = value;
    }

    /**
     * Gets the value of the ds1WithEchoAval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDS1WithEchoAval() {
        return ds1WithEchoAval;
    }

    /**
     * Sets the value of the ds1WithEchoAval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDS1WithEchoAval(String value) {
        this.ds1WithEchoAval = value;
    }

    /**
     * Gets the value of the ds1WithEchoSysLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDS1WithEchoSysLimit() {
        return ds1WithEchoSysLimit;
    }

    /**
     * Sets the value of the ds1WithEchoSysLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDS1WithEchoSysLimit(String value) {
        this.ds1WithEchoSysLimit = value;
    }

    /**
     * Gets the value of the ichtisdnsipUsed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getICHTISDNSIPUsed() {
        return ichtisdnsipUsed;
    }

    /**
     * Sets the value of the ichtisdnsipUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setICHTISDNSIPUsed(String value) {
        this.ichtisdnsipUsed = value;
    }

    /**
     * Gets the value of the ichtisdnsipAval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getICHTISDNSIPAval() {
        return ichtisdnsipAval;
    }

    /**
     * Sets the value of the ichtisdnsipAval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setICHTISDNSIPAval(String value) {
        this.ichtisdnsipAval = value;
    }

    /**
     * Gets the value of the ichtisdnsipSysLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getICHTISDNSIPSysLimit() {
        return ichtisdnsipSysLimit;
    }

    /**
     * Sets the value of the ichtisdnsipSysLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setICHTISDNSIPSysLimit(String value) {
        this.ichtisdnsipSysLimit = value;
    }

    /**
     * Gets the value of the isdncbcServiceUsed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISDNCBCServiceUsed() {
        return isdncbcServiceUsed;
    }

    /**
     * Sets the value of the isdncbcServiceUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISDNCBCServiceUsed(String value) {
        this.isdncbcServiceUsed = value;
    }

    /**
     * Gets the value of the isdncbcServiceAval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISDNCBCServiceAval() {
        return isdncbcServiceAval;
    }

    /**
     * Sets the value of the isdncbcServiceAval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISDNCBCServiceAval(String value) {
        this.isdncbcServiceAval = value;
    }

    /**
     * Gets the value of the isdncbcServSysLim property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISDNCBCServSysLim() {
        return isdncbcServSysLim;
    }

    /**
     * Sets the value of the isdncbcServSysLim property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISDNCBCServSysLim(String value) {
        this.isdncbcServSysLim = value;
    }

    /**
     * Gets the value of the trunkGroupsUsed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrunkGroupsUsed() {
        return trunkGroupsUsed;
    }

    /**
     * Sets the value of the trunkGroupsUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrunkGroupsUsed(String value) {
        this.trunkGroupsUsed = value;
    }

    /**
     * Gets the value of the trunkGroupsAval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrunkGroupsAval() {
        return trunkGroupsAval;
    }

    /**
     * Sets the value of the trunkGroupsAval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrunkGroupsAval(String value) {
        this.trunkGroupsAval = value;
    }

    /**
     * Gets the value of the trunkGroupsSysLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrunkGroupsSysLimit() {
        return trunkGroupsSysLimit;
    }

    /**
     * Sets the value of the trunkGroupsSysLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrunkGroupsSysLimit(String value) {
        this.trunkGroupsSysLimit = value;
    }

    /**
     * Gets the value of the trunkPortsUsed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrunkPortsUsed() {
        return trunkPortsUsed;
    }

    /**
     * Sets the value of the trunkPortsUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrunkPortsUsed(String value) {
        this.trunkPortsUsed = value;
    }

    /**
     * Gets the value of the trunkPortsAval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrunkPortsAval() {
        return trunkPortsAval;
    }

    /**
     * Sets the value of the trunkPortsAval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrunkPortsAval(String value) {
        this.trunkPortsAval = value;
    }

    /**
     * Gets the value of the trunkPortsSysLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrunkPortsSysLimit() {
        return trunkPortsSysLimit;
    }

    /**
     * Sets the value of the trunkPortsSysLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrunkPortsSysLimit(String value) {
        this.trunkPortsSysLimit = value;
    }

    /**
     * Gets the value of the h323TrunksUsed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getH323TrunksUsed() {
        return h323TrunksUsed;
    }

    /**
     * Sets the value of the h323TrunksUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setH323TrunksUsed(String value) {
        this.h323TrunksUsed = value;
    }

    /**
     * Gets the value of the h323TrunksAval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getH323TrunksAval() {
        return h323TrunksAval;
    }

    /**
     * Sets the value of the h323TrunksAval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setH323TrunksAval(String value) {
        this.h323TrunksAval = value;
    }

    /**
     * Gets the value of the h323TrunksSysLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getH323TrunksSysLimit() {
        return h323TrunksSysLimit;
    }

    /**
     * Sets the value of the h323TrunksSysLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setH323TrunksSysLimit(String value) {
        this.h323TrunksSysLimit = value;
    }

    /**
     * Gets the value of the remOficeTrksUsed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemOficeTrksUsed() {
        return remOficeTrksUsed;
    }

    /**
     * Sets the value of the remOficeTrksUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemOficeTrksUsed(String value) {
        this.remOficeTrksUsed = value;
    }

    /**
     * Gets the value of the remOficeTrksAval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemOficeTrksAval() {
        return remOficeTrksAval;
    }

    /**
     * Sets the value of the remOficeTrksAval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemOficeTrksAval(String value) {
        this.remOficeTrksAval = value;
    }

    /**
     * Gets the value of the remOficeTrkSysLim property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemOficeTrkSysLim() {
        return remOficeTrkSysLim;
    }

    /**
     * Sets the value of the remOficeTrkSysLim property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemOficeTrkSysLim(String value) {
        this.remOficeTrkSysLim = value;
    }

    /**
     * Gets the value of the sbsTrunksUsed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSBSTrunksUsed() {
        return sbsTrunksUsed;
    }

    /**
     * Sets the value of the sbsTrunksUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSBSTrunksUsed(String value) {
        this.sbsTrunksUsed = value;
    }

    /**
     * Gets the value of the sbsTrunksAval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSBSTrunksAval() {
        return sbsTrunksAval;
    }

    /**
     * Sets the value of the sbsTrunksAval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSBSTrunksAval(String value) {
        this.sbsTrunksAval = value;
    }

    /**
     * Gets the value of the sbsTrunksSysLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSBSTrunksSysLimit() {
        return sbsTrunksSysLimit;
    }

    /**
     * Sets the value of the sbsTrunksSysLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSBSTrunksSysLimit(String value) {
        this.sbsTrunksSysLimit = value;
    }

    /**
     * Gets the value of the sipTrunksUsed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSIPTrunksUsed() {
        return sipTrunksUsed;
    }

    /**
     * Sets the value of the sipTrunksUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSIPTrunksUsed(String value) {
        this.sipTrunksUsed = value;
    }

    /**
     * Gets the value of the sipTrunksAval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSIPTrunksAval() {
        return sipTrunksAval;
    }

    /**
     * Sets the value of the sipTrunksAval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSIPTrunksAval(String value) {
        this.sipTrunksAval = value;
    }

    /**
     * Gets the value of the sipTrunksSysLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSIPTrunksSysLimit() {
        return sipTrunksSysLimit;
    }

    /**
     * Sets the value of the sipTrunksSysLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSIPTrunksSysLimit(String value) {
        this.sipTrunksSysLimit = value;
    }

    /**
     * Gets the value of the stationButMemUsed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStationButMemUsed() {
        return stationButMemUsed;
    }

    /**
     * Sets the value of the stationButMemUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStationButMemUsed(String value) {
        this.stationButMemUsed = value;
    }

    /**
     * Gets the value of the stationButMemAval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStationButMemAval() {
        return stationButMemAval;
    }

    /**
     * Sets the value of the stationButMemAval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStationButMemAval(String value) {
        this.stationButMemAval = value;
    }

    /**
     * Gets the value of the stationButMemSysLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStationButMemSysLimit() {
        return stationButMemSysLimit;
    }

    /**
     * Sets the value of the stationButMemSysLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStationButMemSysLimit(String value) {
        this.stationButMemSysLimit = value;
    }

    /**
     * Gets the value of the customButLabelsUsed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomButLabelsUsed() {
        return customButLabelsUsed;
    }

    /**
     * Sets the value of the customButLabelsUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomButLabelsUsed(String value) {
        this.customButLabelsUsed = value;
    }

    /**
     * Gets the value of the customButLabelsAval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomButLabelsAval() {
        return customButLabelsAval;
    }

    /**
     * Sets the value of the customButLabelsAval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomButLabelsAval(String value) {
        this.customButLabelsAval = value;
    }

    /**
     * Gets the value of the customButLabelsSysLim property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomButLabelsSysLim() {
        return customButLabelsSysLim;
    }

    /**
     * Sets the value of the customButLabelsSysLim property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomButLabelsSysLim(String value) {
        this.customButLabelsSysLim = value;
    }

    /**
     * Gets the value of the stationRecordsUsed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStationRecordsUsed() {
        return stationRecordsUsed;
    }

    /**
     * Sets the value of the stationRecordsUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStationRecordsUsed(String value) {
        this.stationRecordsUsed = value;
    }

    /**
     * Gets the value of the stationRecordsAval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStationRecordsAval() {
        return stationRecordsAval;
    }

    /**
     * Sets the value of the stationRecordsAval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStationRecordsAval(String value) {
        this.stationRecordsAval = value;
    }

    /**
     * Gets the value of the stationRecSysLim property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStationRecSysLim() {
        return stationRecSysLim;
    }

    /**
     * Sets the value of the stationRecSysLim property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStationRecSysLim(String value) {
        this.stationRecSysLim = value;
    }

    /**
     * Gets the value of the stationRecTTIUsed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStationRecTTIUsed() {
        return stationRecTTIUsed;
    }

    /**
     * Sets the value of the stationRecTTIUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStationRecTTIUsed(String value) {
        this.stationRecTTIUsed = value;
    }

    /**
     * Gets the value of the stationRecTTIShrdUsed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStationRecTTIShrdUsed() {
        return stationRecTTIShrdUsed;
    }

    /**
     * Sets the value of the stationRecTTIShrdUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStationRecTTIShrdUsed(String value) {
        this.stationRecTTIShrdUsed = value;
    }

    /**
     * Gets the value of the briStationsUsed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBRIStationsUsed() {
        return briStationsUsed;
    }

    /**
     * Sets the value of the briStationsUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBRIStationsUsed(String value) {
        this.briStationsUsed = value;
    }

    /**
     * Gets the value of the stationsWithPortUsed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStationsWithPortUsed() {
        return stationsWithPortUsed;
    }

    /**
     * Sets the value of the stationsWithPortUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStationsWithPortUsed(String value) {
        this.stationsWithPortUsed = value;
    }

    /**
     * Gets the value of the stationsWOutPortUsed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStationsWOutPortUsed() {
        return stationsWOutPortUsed;
    }

    /**
     * Sets the value of the stationsWOutPortUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStationsWOutPortUsed(String value) {
        this.stationsWOutPortUsed = value;
    }

    /**
     * Gets the value of the otherStationsUsed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherStationsUsed() {
        return otherStationsUsed;
    }

    /**
     * Sets the value of the otherStationsUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherStationsUsed(String value) {
        this.otherStationsUsed = value;
    }

    /**
     * Gets the value of the ttiPortsUsed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTTIPortsUsed() {
        return ttiPortsUsed;
    }

    /**
     * Sets the value of the ttiPortsUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTTIPortsUsed(String value) {
        this.ttiPortsUsed = value;
    }

    /**
     * Gets the value of the autoMoveStationsUsed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoMoveStationsUsed() {
        return autoMoveStationsUsed;
    }

    /**
     * Sets the value of the autoMoveStationsUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutoMoveStationsUsed(String value) {
        this.autoMoveStationsUsed = value;
    }

    /**
     * Gets the value of the autoMoveStationsAval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoMoveStationsAval() {
        return autoMoveStationsAval;
    }

    /**
     * Sets the value of the autoMoveStationsAval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutoMoveStationsAval(String value) {
        this.autoMoveStationsAval = value;
    }

    /**
     * Gets the value of the autoMveStationSysLim property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoMveStationSysLim() {
        return autoMveStationSysLim;
    }

    /**
     * Sets the value of the autoMveStationSysLim property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutoMveStationSysLim(String value) {
        this.autoMveStationSysLim = value;
    }

    /**
     * Gets the value of the admIPSoftPhoneUsed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdmIPSoftPhoneUsed() {
        return admIPSoftPhoneUsed;
    }

    /**
     * Sets the value of the admIPSoftPhoneUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdmIPSoftPhoneUsed(String value) {
        this.admIPSoftPhoneUsed = value;
    }

    /**
     * Gets the value of the videoH323StatUsed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVideoH323StatUsed() {
        return videoH323StatUsed;
    }

    /**
     * Sets the value of the videoH323StatUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVideoH323StatUsed(String value) {
        this.videoH323StatUsed = value;
    }

    /**
     * Gets the value of the videoH323StatAval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVideoH323StatAval() {
        return videoH323StatAval;
    }

    /**
     * Sets the value of the videoH323StatAval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVideoH323StatAval(String value) {
        this.videoH323StatAval = value;
    }

    /**
     * Gets the value of the vidH323StaSysLim property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVidH323StaSysLim() {
        return vidH323StaSysLim;
    }

    /**
     * Sets the value of the vidH323StaSysLim property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVidH323StaSysLim(String value) {
        this.vidH323StaSysLim = value;
    }

    /**
     * Gets the value of the videoIPSoftphonesUsed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVideoIPSoftphonesUsed() {
        return videoIPSoftphonesUsed;
    }

    /**
     * Sets the value of the videoIPSoftphonesUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVideoIPSoftphonesUsed(String value) {
        this.videoIPSoftphonesUsed = value;
    }

    /**
     * Gets the value of the videoIPSoftphonesAval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVideoIPSoftphonesAval() {
        return videoIPSoftphonesAval;
    }

    /**
     * Sets the value of the videoIPSoftphonesAval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVideoIPSoftphonesAval(String value) {
        this.videoIPSoftphonesAval = value;
    }

    /**
     * Gets the value of the vidIPSftPhSysLim property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVidIPSftPhSysLim() {
        return vidIPSftPhSysLim;
    }

    /**
     * Sets the value of the vidIPSftPhSysLim property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVidIPSftPhSysLim(String value) {
        this.vidIPSftPhSysLim = value;
    }

    /**
     * Gets the value of the isdnbriEndTrkPortUsd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISDNBRIEndTrkPortUsd() {
        return isdnbriEndTrkPortUsd;
    }

    /**
     * Sets the value of the isdnbriEndTrkPortUsd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISDNBRIEndTrkPortUsd(String value) {
        this.isdnbriEndTrkPortUsd = value;
    }

    /**
     * Gets the value of the isdnbriEndTrkPortAval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISDNBRIEndTrkPortAval() {
        return isdnbriEndTrkPortAval;
    }

    /**
     * Sets the value of the isdnbriEndTrkPortAval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISDNBRIEndTrkPortAval(String value) {
        this.isdnbriEndTrkPortAval = value;
    }

    /**
     * Gets the value of the isdnbriEndTrunkPortSysLim property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISDNBRIEndTrunkPortSysLim() {
        return isdnbriEndTrunkPortSysLim;
    }

    /**
     * Sets the value of the isdnbriEndTrunkPortSysLim property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISDNBRIEndTrunkPortSysLim(String value) {
        this.isdnbriEndTrunkPortSysLim = value;
    }

    /**
     * Gets the value of the stationTrkPortsUsed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStationTrkPortsUsed() {
        return stationTrkPortsUsed;
    }

    /**
     * Sets the value of the stationTrkPortsUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStationTrkPortsUsed(String value) {
        this.stationTrkPortsUsed = value;
    }

    /**
     * Gets the value of the stationTrkPortsAval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStationTrkPortsAval() {
        return stationTrkPortsAval;
    }

    /**
     * Sets the value of the stationTrkPortsAval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStationTrkPortsAval(String value) {
        this.stationTrkPortsAval = value;
    }

    /**
     * Gets the value of the stationTrkPrtSysLim property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStationTrkPrtSysLim() {
        return stationTrkPrtSysLim;
    }

    /**
     * Sets the value of the stationTrkPrtSysLim property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStationTrkPrtSysLim(String value) {
        this.stationTrkPrtSysLim = value;
    }

    /**
     * Gets the value of the stationCapacityUsed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStationCapacityUsed() {
        return stationCapacityUsed;
    }

    /**
     * Sets the value of the stationCapacityUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStationCapacityUsed(String value) {
        this.stationCapacityUsed = value;
    }

    /**
     * Gets the value of the stationCapacityAval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStationCapacityAval() {
        return stationCapacityAval;
    }

    /**
     * Sets the value of the stationCapacityAval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStationCapacityAval(String value) {
        this.stationCapacityAval = value;
    }

    /**
     * Gets the value of the stationCapacitySysLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStationCapacitySysLimit() {
        return stationCapacitySysLimit;
    }

    /**
     * Sets the value of the stationCapacitySysLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStationCapacitySysLimit(String value) {
        this.stationCapacitySysLimit = value;
    }

    /**
     * Gets the value of the sbsStationsUsed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSBSStationsUsed() {
        return sbsStationsUsed;
    }

    /**
     * Sets the value of the sbsStationsUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSBSStationsUsed(String value) {
        this.sbsStationsUsed = value;
    }

    /**
     * Gets the value of the sbsStationsAval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSBSStationsAval() {
        return sbsStationsAval;
    }

    /**
     * Sets the value of the sbsStationsAval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSBSStationsAval(String value) {
        this.sbsStationsAval = value;
    }

    /**
     * Gets the value of the sbsStationsSysLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSBSStationsSysLimit() {
        return sbsStationsSysLimit;
    }

    /**
     * Sets the value of the sbsStationsSysLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSBSStationsSysLimit(String value) {
        this.sbsStationsSysLimit = value;
    }

    /**
     * Gets the value of the radioControllersUsed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRadioControllersUsed() {
        return radioControllersUsed;
    }

    /**
     * Sets the value of the radioControllersUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRadioControllersUsed(String value) {
        this.radioControllersUsed = value;
    }

    /**
     * Gets the value of the radioControllersAval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRadioControllersAval() {
        return radioControllersAval;
    }

    /**
     * Sets the value of the radioControllersAval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRadioControllersAval(String value) {
        this.radioControllersAval = value;
    }

    /**
     * Gets the value of the radioCtrlrSysLim property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRadioCtrlrSysLim() {
        return radioCtrlrSysLim;
    }

    /**
     * Sets the value of the radioCtrlrSysLim property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRadioCtrlrSysLim(String value) {
        this.radioCtrlrSysLim = value;
    }

    /**
     * Gets the value of the wirelessTerminalsUsed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWirelessTerminalsUsed() {
        return wirelessTerminalsUsed;
    }

    /**
     * Sets the value of the wirelessTerminalsUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWirelessTerminalsUsed(String value) {
        this.wirelessTerminalsUsed = value;
    }

    /**
     * Gets the value of the wirelessTerminalsAval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWirelessTerminalsAval() {
        return wirelessTerminalsAval;
    }

    /**
     * Sets the value of the wirelessTerminalsAval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWirelessTerminalsAval(String value) {
        this.wirelessTerminalsAval = value;
    }

    /**
     * Gets the value of the wirelessTermlSysLim property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWirelessTermlSysLim() {
        return wirelessTermlSysLim;
    }

    /**
     * Sets the value of the wirelessTermlSysLim property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWirelessTermlSysLim(String value) {
        this.wirelessTermlSysLim = value;
    }

    /**
     * Gets the value of the xMobileStationsUsed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXMobileStationsUsed() {
        return xMobileStationsUsed;
    }

    /**
     * Sets the value of the xMobileStationsUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXMobileStationsUsed(String value) {
        this.xMobileStationsUsed = value;
    }

    /**
     * Gets the value of the xMobileStationsAval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXMobileStationsAval() {
        return xMobileStationsAval;
    }

    /**
     * Sets the value of the xMobileStationsAval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXMobileStationsAval(String value) {
        this.xMobileStationsAval = value;
    }

    /**
     * Gets the value of the xMobileStaSysLim property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXMobileStaSysLim() {
        return xMobileStaSysLim;
    }

    /**
     * Sets the value of the xMobileStaSysLim property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXMobileStaSysLim(String value) {
        this.xMobileStaSysLim = value;
    }

    /**
     * Gets the value of the ec500Used property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEC500Used() {
        return ec500Used;
    }

    /**
     * Sets the value of the ec500Used property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEC500Used(String value) {
        this.ec500Used = value;
    }

    /**
     * Gets the value of the dectUsed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDECTUsed() {
        return dectUsed;
    }

    /**
     * Sets the value of the dectUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDECTUsed(String value) {
        this.dectUsed = value;
    }

    /**
     * Gets the value of the phsUsed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPHSUsed() {
        return phsUsed;
    }

    /**
     * Sets the value of the phsUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPHSUsed(String value) {
        this.phsUsed = value;
    }

    /**
     * Gets the value of the offPBXEC500Used property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffPBXEC500Used() {
        return offPBXEC500Used;
    }

    /**
     * Sets the value of the offPBXEC500Used property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffPBXEC500Used(String value) {
        this.offPBXEC500Used = value;
    }

    /**
     * Gets the value of the offPBXEC500Aval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffPBXEC500Aval() {
        return offPBXEC500Aval;
    }

    /**
     * Sets the value of the offPBXEC500Aval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffPBXEC500Aval(String value) {
        this.offPBXEC500Aval = value;
    }

    /**
     * Gets the value of the offPBXEC500SysLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffPBXEC500SysLimit() {
        return offPBXEC500SysLimit;
    }

    /**
     * Sets the value of the offPBXEC500SysLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffPBXEC500SysLimit(String value) {
        this.offPBXEC500SysLimit = value;
    }

    /**
     * Gets the value of the offPBXOPSUsed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffPBXOPSUsed() {
        return offPBXOPSUsed;
    }

    /**
     * Sets the value of the offPBXOPSUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffPBXOPSUsed(String value) {
        this.offPBXOPSUsed = value;
    }

    /**
     * Gets the value of the offPBXOPSAval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffPBXOPSAval() {
        return offPBXOPSAval;
    }

    /**
     * Sets the value of the offPBXOPSAval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffPBXOPSAval(String value) {
        this.offPBXOPSAval = value;
    }

    /**
     * Gets the value of the offPBXOPSSysLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffPBXOPSSysLimit() {
        return offPBXOPSSysLimit;
    }

    /**
     * Sets the value of the offPBXOPSSysLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffPBXOPSSysLimit(String value) {
        this.offPBXOPSSysLimit = value;
    }

    /**
     * Gets the value of the offPBXSCCANUsed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffPBXSCCANUsed() {
        return offPBXSCCANUsed;
    }

    /**
     * Sets the value of the offPBXSCCANUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffPBXSCCANUsed(String value) {
        this.offPBXSCCANUsed = value;
    }

    /**
     * Gets the value of the offPBXSCCANAval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffPBXSCCANAval() {
        return offPBXSCCANAval;
    }

    /**
     * Sets the value of the offPBXSCCANAval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffPBXSCCANAval(String value) {
        this.offPBXSCCANAval = value;
    }

    /**
     * Gets the value of the offPBXSCCANSysLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffPBXSCCANSysLimit() {
        return offPBXSCCANSysLimit;
    }

    /**
     * Sets the value of the offPBXSCCANSysLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffPBXSCCANSysLimit(String value) {
        this.offPBXSCCANSysLimit = value;
    }

    /**
     * Gets the value of the offPBXMemoryUsed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffPBXMemoryUsed() {
        return offPBXMemoryUsed;
    }

    /**
     * Sets the value of the offPBXMemoryUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffPBXMemoryUsed(String value) {
        this.offPBXMemoryUsed = value;
    }

    /**
     * Gets the value of the offPBXMemoryAval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffPBXMemoryAval() {
        return offPBXMemoryAval;
    }

    /**
     * Sets the value of the offPBXMemoryAval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffPBXMemoryAval(String value) {
        this.offPBXMemoryAval = value;
    }

    /**
     * Gets the value of the offPBXMemorySysLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffPBXMemorySysLimit() {
        return offPBXMemorySysLimit;
    }

    /**
     * Sets the value of the offPBXMemorySysLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffPBXMemorySysLimit(String value) {
        this.offPBXMemorySysLimit = value;
    }

    /**
     * Gets the value of the ipStationsUsed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPStationsUsed() {
        return ipStationsUsed;
    }

    /**
     * Sets the value of the ipStationsUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPStationsUsed(String value) {
        this.ipStationsUsed = value;
    }

    /**
     * Gets the value of the ipStationsAval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPStationsAval() {
        return ipStationsAval;
    }

    /**
     * Sets the value of the ipStationsAval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPStationsAval(String value) {
        this.ipStationsAval = value;
    }

    /**
     * Gets the value of the ipStationsSysLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPStationsSysLimit() {
        return ipStationsSysLimit;
    }

    /**
     * Sets the value of the ipStationsSysLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPStationsSysLimit(String value) {
        this.ipStationsSysLimit = value;
    }

    /**
     * Gets the value of the ipStationsinTTIUsed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPStationsinTTIUsed() {
        return ipStationsinTTIUsed;
    }

    /**
     * Sets the value of the ipStationsinTTIUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPStationsinTTIUsed(String value) {
        this.ipStationsinTTIUsed = value;
    }

    /**
     * Gets the value of the ipAttendantConsUsed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPAttendantConsUsed() {
        return ipAttendantConsUsed;
    }

    /**
     * Sets the value of the ipAttendantConsUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPAttendantConsUsed(String value) {
        this.ipAttendantConsUsed = value;
    }

    /**
     * Gets the value of the ipAttendantConsAval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPAttendantConsAval() {
        return ipAttendantConsAval;
    }

    /**
     * Sets the value of the ipAttendantConsAval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPAttendantConsAval(String value) {
        this.ipAttendantConsAval = value;
    }

    /**
     * Gets the value of the ipAtdtConsSysLim property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPAtdtConsSysLim() {
        return ipAtdtConsSysLim;
    }

    /**
     * Sets the value of the ipAtdtConsSysLim property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPAtdtConsSysLim(String value) {
        this.ipAtdtConsSysLim = value;
    }

    /**
     * Gets the value of the remoteOfficStatUsed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteOfficStatUsed() {
        return remoteOfficStatUsed;
    }

    /**
     * Sets the value of the remoteOfficStatUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteOfficStatUsed(String value) {
        this.remoteOfficStatUsed = value;
    }

    /**
     * Gets the value of the remoteOfficStatAval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteOfficStatAval() {
        return remoteOfficStatAval;
    }

    /**
     * Sets the value of the remoteOfficStatAval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteOfficStatAval(String value) {
        this.remoteOfficStatAval = value;
    }

    /**
     * Gets the value of the remoteOffcSTatSysLim property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteOffcSTatSysLim() {
        return remoteOffcSTatSysLim;
    }

    /**
     * Sets the value of the remoteOffcSTatSysLim property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteOffcSTatSysLim(String value) {
        this.remoteOffcSTatSysLim = value;
    }

    /**
     * Gets the value of the unAuthH323StatUsed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnAuthH323StatUsed() {
        return unAuthH323StatUsed;
    }

    /**
     * Sets the value of the unAuthH323StatUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnAuthH323StatUsed(String value) {
        this.unAuthH323StatUsed = value;
    }

    /**
     * Gets the value of the unAuthH323StaAva property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnAuthH323StaAva() {
        return unAuthH323StaAva;
    }

    /**
     * Sets the value of the unAuthH323StaAva property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnAuthH323StaAva(String value) {
        this.unAuthH323StaAva = value;
    }

    /**
     * Gets the value of the unAuthH323StatSysLim property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnAuthH323StatSysLim() {
        return unAuthH323StatSysLim;
    }

    /**
     * Sets the value of the unAuthH323StatSysLim property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnAuthH323StatSysLim(String value) {
        this.unAuthH323StatSysLim = value;
    }

    /**
     * Gets the value of the softwareLoad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoftwareLoad() {
        return softwareLoad;
    }

    /**
     * Sets the value of the softwareLoad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoftwareLoad(String value) {
        this.softwareLoad = value;
    }

    /**
     * Gets the value of the memoryConfiguration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemoryConfiguration() {
        return memoryConfiguration;
    }

    /**
     * Sets the value of the memoryConfiguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemoryConfiguration(String value) {
        this.memoryConfiguration = value;
    }

    /**
     * Gets the value of the offerCatagory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferCatagory() {
        return offerCatagory;
    }

    /**
     * Sets the value of the offerCatagory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferCatagory(String value) {
        this.offerCatagory = value;
    }

    /**
     * Gets the value of the lastSoftwareLoad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastSoftwareLoad() {
        return lastSoftwareLoad;
    }

    /**
     * Sets the value of the lastSoftwareLoad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastSoftwareLoad(String value) {
        this.lastSoftwareLoad = value;
    }

    /**
     * Gets the value of the lastMemoryConfig property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastMemoryConfig() {
        return lastMemoryConfig;
    }

    /**
     * Sets the value of the lastMemoryConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastMemoryConfig(String value) {
        this.lastMemoryConfig = value;
    }

    /**
     * Gets the value of the lastOfferCatagory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastOfferCatagory() {
        return lastOfferCatagory;
    }

    /**
     * Sets the value of the lastOfferCatagory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastOfferCatagory(String value) {
        this.lastOfferCatagory = value;
    }

    /**
     * Gets the value of the currentRegID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the currentRegID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCurrentRegID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getCurrentRegID() {
        if (currentRegID == null) {
            currentRegID = new ArrayList<ArrayType>();
        }
        return this.currentRegID;
    }

    /**
     * Gets the value of the currentRegRel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the currentRegRel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCurrentRegRel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getCurrentRegRel() {
        if (currentRegRel == null) {
            currentRegRel = new ArrayList<ArrayType>();
        }
        return this.currentRegRel;
    }

    /**
     * Gets the value of the currentRegRegist property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the currentRegRegist property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCurrentRegRegist().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getCurrentRegRegist() {
        if (currentRegRegist == null) {
            currentRegRegist = new ArrayList<ArrayType>();
        }
        return this.currentRegRegist;
    }

    /**
     * Gets the value of the currentRegAvail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the currentRegAvail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCurrentRegAvail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getCurrentRegAvail() {
        if (currentRegAvail == null) {
            currentRegAvail = new ArrayList<ArrayType>();
        }
        return this.currentRegAvail;
    }

    /**
     * Gets the value of the currentRegSysLim property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the currentRegSysLim property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCurrentRegSysLim().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getCurrentRegSysLim() {
        if (currentRegSysLim == null) {
            currentRegSysLim = new ArrayList<ArrayType>();
        }
        return this.currentRegSysLim;
    }

}
