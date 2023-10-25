
package com.system.ipcc.pbx.avaya.smsxml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CORType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CORType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="COR_Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FRL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CanBeServiceObserved" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CanBeServiceObserver" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="APLT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Calling_Party_Restriction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Called_Party_Restriction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Partitioned_Group_Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Forced_Entry_of_Account_Codes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Priority_Queuing" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Direct_Agent_Calling" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Restriction_Override" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Facility_Access_Trunk_Test" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Restricted_Call_List" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Can_Change_Coverage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Access_to_MCT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Fully_Restricted_Service" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Group_II_Category_For_MFC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Hear_VDN_of_Origin_Annc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Send_ANI_for_MFE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Add_Remove_Agent_Skills" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MF_ANI_Prefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Automatic_Charge_Display" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Hear_System_Music_on_Hold" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PASTE_Display_PBX_Data_on_Phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Can_Be_Picked_Up_By_Directed_Call_Pickup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Attendant_Queue_Priority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Can_Use_Directed_Call_Pickup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Group_Controlled_Restriction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Omit_Extension_Room_Display" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MF_Incoming_Call_Trace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Brazil_Collect_Call_Blocking" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Block_Transfer_Display" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Remote_Logout_of_Agent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Can_Use_Station_User_Admin_of_FBI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Can_Be_Used_for_Station_User_Admin_of_FBI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Station_Lock_COR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TODSL_Release_Interval_hours" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Outgoing_Trunk_Disconnect_Timer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Line_Load_Control" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_Precedence_Level" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Preemptable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MLPP_Service_Domain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Block_Enhanced_Call_Pickup_Alerting" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Block_Enhanced_Conference_Transfer_Displays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Station_Button_Display_of_UUI_IE_Data" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Display_Names_on_Bridged_Appearance_Labels" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Remove_Caller_Id_from_Set_Display" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Service_Observing_by_Recording_Device" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Dissociate_or_unmerge_this_phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EMU_login_or_logoff_at_this_phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Mask_CPN_NAME_for_Internal_Calls" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SAC_CF_Override_by_Team_Btn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SAC_CF_Override_by_Priority_Call" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SAC_CF_Override_by_Dialing" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SAC_CF_Override_Protection_for_Team_Btn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SAC_CF_Override_Protection_for_Priority_Call" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SAC_CF_Override_Protection_for_Dialing" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Team_Btn_Silent_if_Active" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Team_Btn_Priority_Ring" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Team_Btn_Display_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Team_Btn_Pick_Up_by_Going_Off_Hook" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="One_X_Server_Access" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CPN_to_Send_for_Redirected_Calls" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Can_Force_A_Work_State_Change" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Work_State_Change_Can_Be_Forced" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;group ref="{http://xml.avaya.com/sms}CORArrayGroup"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CORType", propOrder = {
    "corNumber",
    "description",
    "frl",
    "canBeServiceObserved",
    "canBeServiceObserver",
    "aplt",
    "callingPartyRestriction",
    "calledPartyRestriction",
    "partitionedGroupNumber",
    "forcedEntryOfAccountCodes",
    "priorityQueuing",
    "directAgentCalling",
    "restrictionOverride",
    "facilityAccessTrunkTest",
    "restrictedCallList",
    "canChangeCoverage",
    "accessToMCT",
    "fullyRestrictedService",
    "groupIICategoryForMFC",
    "hearVDNOfOriginAnnc",
    "sendANIForMFE",
    "addRemoveAgentSkills",
    "mfaniPrefix",
    "automaticChargeDisplay",
    "hearSystemMusicOnHold",
    "pasteDisplayPBXDataOnPhone",
    "canBePickedUpByDirectedCallPickup",
    "attendantQueuePriority",
    "canUseDirectedCallPickup",
    "groupControlledRestriction",
    "omitExtensionRoomDisplay",
    "mfIncomingCallTrace",
    "brazilCollectCallBlocking",
    "blockTransferDisplay",
    "remoteLogoutOfAgent",
    "canUseStationUserAdminOfFBI",
    "canBeUsedForStationUserAdminOfFBI",
    "stationLockCOR",
    "todslReleaseIntervalHours",
    "outgoingTrunkDisconnectTimer",
    "lineLoadControl",
    "maximumPrecedenceLevel",
    "preemptable",
    "mlppServiceDomain",
    "blockEnhancedCallPickupAlerting",
    "blockEnhancedConferenceTransferDisplays",
    "stationButtonDisplayOfUUIIEData",
    "displayNamesOnBridgedAppearanceLabels",
    "removeCallerIdFromSetDisplay",
    "serviceObservingByRecordingDevice",
    "dissociateOrUnmergeThisPhone",
    "emuLoginOrLogoffAtThisPhone",
    "maskCPNNAMEForInternalCalls",
    "saccfOverrideByTeamBtn",
    "saccfOverrideByPriorityCall",
    "saccfOverrideByDialing",
    "saccfOverrideProtectionForTeamBtn",
    "saccfOverrideProtectionForPriorityCall",
    "saccfOverrideProtectionForDialing",
    "teamBtnSilentIfActive",
    "teamBtnPriorityRing",
    "teamBtnDisplayName",
    "teamBtnPickUpByGoingOffHook",
    "oneXServerAccess",
    "cpnToSendForRedirectedCalls",
    "canForceAWorkStateChange",
    "workStateChangeCanBeForced",
    "unrestrictedCallList",
    "callingPermission",
    "callingPermission1",
    "callingPermission2",
    "callingPermission3",
    "callingPermission4",
    "callingPermission5",
    "callingPermission6",
    "callingPermission7",
    "callingPermission8",
    "callingPermission9",
    "soPermission",
    "soPermission1",
    "soPermission2",
    "soPermission3",
    "soPermission4",
    "soPermission5",
    "soPermission6",
    "soPermission7",
    "soPermission8",
    "soPermission9",
    "authorizationCodePermissions",
    "authorizationCodePermissions1",
    "authorizationCodePermissions2",
    "authorizationCodePermissions3",
    "authorizationCodePermissions4",
    "authorizationCodePermissions5",
    "authorizationCodePermissions6",
    "authorizationCodePermissions7",
    "authorizationCodePermissions8",
    "authorizationCodePermissions9"
})
public class CORType {

    @XmlElement(name = "COR_Number")
    protected String corNumber;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "FRL")
    protected String frl;
    @XmlElement(name = "CanBeServiceObserved")
    protected String canBeServiceObserved;
    @XmlElement(name = "CanBeServiceObserver")
    protected String canBeServiceObserver;
    @XmlElement(name = "APLT")
    protected String aplt;
    @XmlElement(name = "Calling_Party_Restriction")
    protected String callingPartyRestriction;
    @XmlElement(name = "Called_Party_Restriction")
    protected String calledPartyRestriction;
    @XmlElement(name = "Partitioned_Group_Number")
    protected String partitionedGroupNumber;
    @XmlElement(name = "Forced_Entry_of_Account_Codes")
    protected String forcedEntryOfAccountCodes;
    @XmlElement(name = "Priority_Queuing")
    protected String priorityQueuing;
    @XmlElement(name = "Direct_Agent_Calling")
    protected String directAgentCalling;
    @XmlElement(name = "Restriction_Override")
    protected String restrictionOverride;
    @XmlElement(name = "Facility_Access_Trunk_Test")
    protected String facilityAccessTrunkTest;
    @XmlElement(name = "Restricted_Call_List")
    protected String restrictedCallList;
    @XmlElement(name = "Can_Change_Coverage")
    protected String canChangeCoverage;
    @XmlElement(name = "Access_to_MCT")
    protected String accessToMCT;
    @XmlElement(name = "Fully_Restricted_Service")
    protected String fullyRestrictedService;
    @XmlElement(name = "Group_II_Category_For_MFC")
    protected String groupIICategoryForMFC;
    @XmlElement(name = "Hear_VDN_of_Origin_Annc")
    protected String hearVDNOfOriginAnnc;
    @XmlElement(name = "Send_ANI_for_MFE")
    protected String sendANIForMFE;
    @XmlElement(name = "Add_Remove_Agent_Skills")
    protected String addRemoveAgentSkills;
    @XmlElement(name = "MF_ANI_Prefix")
    protected String mfaniPrefix;
    @XmlElement(name = "Automatic_Charge_Display")
    protected String automaticChargeDisplay;
    @XmlElement(name = "Hear_System_Music_on_Hold")
    protected String hearSystemMusicOnHold;
    @XmlElement(name = "PASTE_Display_PBX_Data_on_Phone")
    protected String pasteDisplayPBXDataOnPhone;
    @XmlElement(name = "Can_Be_Picked_Up_By_Directed_Call_Pickup")
    protected String canBePickedUpByDirectedCallPickup;
    @XmlElement(name = "Attendant_Queue_Priority")
    protected String attendantQueuePriority;
    @XmlElement(name = "Can_Use_Directed_Call_Pickup")
    protected String canUseDirectedCallPickup;
    @XmlElement(name = "Group_Controlled_Restriction")
    protected String groupControlledRestriction;
    @XmlElement(name = "Omit_Extension_Room_Display")
    protected String omitExtensionRoomDisplay;
    @XmlElement(name = "MF_Incoming_Call_Trace")
    protected String mfIncomingCallTrace;
    @XmlElement(name = "Brazil_Collect_Call_Blocking")
    protected String brazilCollectCallBlocking;
    @XmlElement(name = "Block_Transfer_Display")
    protected String blockTransferDisplay;
    @XmlElement(name = "Remote_Logout_of_Agent")
    protected String remoteLogoutOfAgent;
    @XmlElement(name = "Can_Use_Station_User_Admin_of_FBI")
    protected String canUseStationUserAdminOfFBI;
    @XmlElement(name = "Can_Be_Used_for_Station_User_Admin_of_FBI")
    protected String canBeUsedForStationUserAdminOfFBI;
    @XmlElement(name = "Station_Lock_COR")
    protected String stationLockCOR;
    @XmlElement(name = "TODSL_Release_Interval_hours")
    protected String todslReleaseIntervalHours;
    @XmlElement(name = "Outgoing_Trunk_Disconnect_Timer")
    protected String outgoingTrunkDisconnectTimer;
    @XmlElement(name = "Line_Load_Control")
    protected String lineLoadControl;
    @XmlElement(name = "Maximum_Precedence_Level")
    protected String maximumPrecedenceLevel;
    @XmlElement(name = "Preemptable")
    protected String preemptable;
    @XmlElement(name = "MLPP_Service_Domain")
    protected String mlppServiceDomain;
    @XmlElement(name = "Block_Enhanced_Call_Pickup_Alerting")
    protected String blockEnhancedCallPickupAlerting;
    @XmlElement(name = "Block_Enhanced_Conference_Transfer_Displays")
    protected String blockEnhancedConferenceTransferDisplays;
    @XmlElement(name = "Station_Button_Display_of_UUI_IE_Data")
    protected String stationButtonDisplayOfUUIIEData;
    @XmlElement(name = "Display_Names_on_Bridged_Appearance_Labels")
    protected String displayNamesOnBridgedAppearanceLabels;
    @XmlElement(name = "Remove_Caller_Id_from_Set_Display")
    protected String removeCallerIdFromSetDisplay;
    @XmlElement(name = "Service_Observing_by_Recording_Device")
    protected String serviceObservingByRecordingDevice;
    @XmlElement(name = "Dissociate_or_unmerge_this_phone")
    protected String dissociateOrUnmergeThisPhone;
    @XmlElement(name = "EMU_login_or_logoff_at_this_phone")
    protected String emuLoginOrLogoffAtThisPhone;
    @XmlElement(name = "Mask_CPN_NAME_for_Internal_Calls")
    protected String maskCPNNAMEForInternalCalls;
    @XmlElement(name = "SAC_CF_Override_by_Team_Btn")
    protected String saccfOverrideByTeamBtn;
    @XmlElement(name = "SAC_CF_Override_by_Priority_Call")
    protected String saccfOverrideByPriorityCall;
    @XmlElement(name = "SAC_CF_Override_by_Dialing")
    protected String saccfOverrideByDialing;
    @XmlElement(name = "SAC_CF_Override_Protection_for_Team_Btn")
    protected String saccfOverrideProtectionForTeamBtn;
    @XmlElement(name = "SAC_CF_Override_Protection_for_Priority_Call")
    protected String saccfOverrideProtectionForPriorityCall;
    @XmlElement(name = "SAC_CF_Override_Protection_for_Dialing")
    protected String saccfOverrideProtectionForDialing;
    @XmlElement(name = "Team_Btn_Silent_if_Active")
    protected String teamBtnSilentIfActive;
    @XmlElement(name = "Team_Btn_Priority_Ring")
    protected String teamBtnPriorityRing;
    @XmlElement(name = "Team_Btn_Display_Name")
    protected String teamBtnDisplayName;
    @XmlElement(name = "Team_Btn_Pick_Up_by_Going_Off_Hook")
    protected String teamBtnPickUpByGoingOffHook;
    @XmlElement(name = "One_X_Server_Access")
    protected String oneXServerAccess;
    @XmlElement(name = "CPN_to_Send_for_Redirected_Calls")
    protected String cpnToSendForRedirectedCalls;
    @XmlElement(name = "Can_Force_A_Work_State_Change")
    protected String canForceAWorkStateChange;
    @XmlElement(name = "Work_State_Change_Can_Be_Forced")
    protected String workStateChangeCanBeForced;
    @XmlElement(name = "Unrestricted_Call_List")
    protected List<ArrayType> unrestrictedCallList;
    @XmlElement(name = "Calling_Permission")
    protected List<ArrayType> callingPermission;
    @XmlElement(name = "Calling_Permission1")
    protected List<ArrayType> callingPermission1;
    @XmlElement(name = "Calling_Permission2")
    protected List<ArrayType> callingPermission2;
    @XmlElement(name = "Calling_Permission3")
    protected List<ArrayType> callingPermission3;
    @XmlElement(name = "Calling_Permission4")
    protected List<ArrayType> callingPermission4;
    @XmlElement(name = "Calling_Permission5")
    protected List<ArrayType> callingPermission5;
    @XmlElement(name = "Calling_Permission6")
    protected List<ArrayType> callingPermission6;
    @XmlElement(name = "Calling_Permission7")
    protected List<ArrayType> callingPermission7;
    @XmlElement(name = "Calling_Permission8")
    protected List<ArrayType> callingPermission8;
    @XmlElement(name = "Calling_Permission9")
    protected List<ArrayType> callingPermission9;
    @XmlElement(name = "SO_Permission")
    protected List<ArrayType> soPermission;
    @XmlElement(name = "SO_Permission1")
    protected List<ArrayType> soPermission1;
    @XmlElement(name = "SO_Permission2")
    protected List<ArrayType> soPermission2;
    @XmlElement(name = "SO_Permission3")
    protected List<ArrayType> soPermission3;
    @XmlElement(name = "SO_Permission4")
    protected List<ArrayType> soPermission4;
    @XmlElement(name = "SO_Permission5")
    protected List<ArrayType> soPermission5;
    @XmlElement(name = "SO_Permission6")
    protected List<ArrayType> soPermission6;
    @XmlElement(name = "SO_Permission7")
    protected List<ArrayType> soPermission7;
    @XmlElement(name = "SO_Permission8")
    protected List<ArrayType> soPermission8;
    @XmlElement(name = "SO_Permission9")
    protected List<ArrayType> soPermission9;
    @XmlElement(name = "Authorization_Code_Permissions")
    protected List<ArrayType> authorizationCodePermissions;
    @XmlElement(name = "Authorization_Code_Permissions1")
    protected List<ArrayType> authorizationCodePermissions1;
    @XmlElement(name = "Authorization_Code_Permissions2")
    protected List<ArrayType> authorizationCodePermissions2;
    @XmlElement(name = "Authorization_Code_Permissions3")
    protected List<ArrayType> authorizationCodePermissions3;
    @XmlElement(name = "Authorization_Code_Permissions4")
    protected List<ArrayType> authorizationCodePermissions4;
    @XmlElement(name = "Authorization_Code_Permissions5")
    protected List<ArrayType> authorizationCodePermissions5;
    @XmlElement(name = "Authorization_Code_Permissions6")
    protected List<ArrayType> authorizationCodePermissions6;
    @XmlElement(name = "Authorization_Code_Permissions7")
    protected List<ArrayType> authorizationCodePermissions7;
    @XmlElement(name = "Authorization_Code_Permissions8")
    protected List<ArrayType> authorizationCodePermissions8;
    @XmlElement(name = "Authorization_Code_Permissions9")
    protected List<ArrayType> authorizationCodePermissions9;

    /**
     * Gets the value of the corNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCORNumber() {
        return corNumber;
    }

    /**
     * Sets the value of the corNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCORNumber(String value) {
        this.corNumber = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the frl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFRL() {
        return frl;
    }

    /**
     * Sets the value of the frl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFRL(String value) {
        this.frl = value;
    }

    /**
     * Gets the value of the canBeServiceObserved property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCanBeServiceObserved() {
        return canBeServiceObserved;
    }

    /**
     * Sets the value of the canBeServiceObserved property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCanBeServiceObserved(String value) {
        this.canBeServiceObserved = value;
    }

    /**
     * Gets the value of the canBeServiceObserver property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCanBeServiceObserver() {
        return canBeServiceObserver;
    }

    /**
     * Sets the value of the canBeServiceObserver property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCanBeServiceObserver(String value) {
        this.canBeServiceObserver = value;
    }

    /**
     * Gets the value of the aplt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPLT() {
        return aplt;
    }

    /**
     * Sets the value of the aplt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPLT(String value) {
        this.aplt = value;
    }

    /**
     * Gets the value of the callingPartyRestriction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallingPartyRestriction() {
        return callingPartyRestriction;
    }

    /**
     * Sets the value of the callingPartyRestriction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallingPartyRestriction(String value) {
        this.callingPartyRestriction = value;
    }

    /**
     * Gets the value of the calledPartyRestriction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalledPartyRestriction() {
        return calledPartyRestriction;
    }

    /**
     * Sets the value of the calledPartyRestriction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalledPartyRestriction(String value) {
        this.calledPartyRestriction = value;
    }

    /**
     * Gets the value of the partitionedGroupNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartitionedGroupNumber() {
        return partitionedGroupNumber;
    }

    /**
     * Sets the value of the partitionedGroupNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartitionedGroupNumber(String value) {
        this.partitionedGroupNumber = value;
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
     * Gets the value of the priorityQueuing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriorityQueuing() {
        return priorityQueuing;
    }

    /**
     * Sets the value of the priorityQueuing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriorityQueuing(String value) {
        this.priorityQueuing = value;
    }

    /**
     * Gets the value of the directAgentCalling property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectAgentCalling() {
        return directAgentCalling;
    }

    /**
     * Sets the value of the directAgentCalling property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectAgentCalling(String value) {
        this.directAgentCalling = value;
    }

    /**
     * Gets the value of the restrictionOverride property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRestrictionOverride() {
        return restrictionOverride;
    }

    /**
     * Sets the value of the restrictionOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRestrictionOverride(String value) {
        this.restrictionOverride = value;
    }

    /**
     * Gets the value of the facilityAccessTrunkTest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacilityAccessTrunkTest() {
        return facilityAccessTrunkTest;
    }

    /**
     * Sets the value of the facilityAccessTrunkTest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacilityAccessTrunkTest(String value) {
        this.facilityAccessTrunkTest = value;
    }

    /**
     * Gets the value of the restrictedCallList property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRestrictedCallList() {
        return restrictedCallList;
    }

    /**
     * Sets the value of the restrictedCallList property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRestrictedCallList(String value) {
        this.restrictedCallList = value;
    }

    /**
     * Gets the value of the canChangeCoverage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCanChangeCoverage() {
        return canChangeCoverage;
    }

    /**
     * Sets the value of the canChangeCoverage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCanChangeCoverage(String value) {
        this.canChangeCoverage = value;
    }

    /**
     * Gets the value of the accessToMCT property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessToMCT() {
        return accessToMCT;
    }

    /**
     * Sets the value of the accessToMCT property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessToMCT(String value) {
        this.accessToMCT = value;
    }

    /**
     * Gets the value of the fullyRestrictedService property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullyRestrictedService() {
        return fullyRestrictedService;
    }

    /**
     * Sets the value of the fullyRestrictedService property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullyRestrictedService(String value) {
        this.fullyRestrictedService = value;
    }

    /**
     * Gets the value of the groupIICategoryForMFC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupIICategoryForMFC() {
        return groupIICategoryForMFC;
    }

    /**
     * Sets the value of the groupIICategoryForMFC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupIICategoryForMFC(String value) {
        this.groupIICategoryForMFC = value;
    }

    /**
     * Gets the value of the hearVDNOfOriginAnnc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHearVDNOfOriginAnnc() {
        return hearVDNOfOriginAnnc;
    }

    /**
     * Sets the value of the hearVDNOfOriginAnnc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHearVDNOfOriginAnnc(String value) {
        this.hearVDNOfOriginAnnc = value;
    }

    /**
     * Gets the value of the sendANIForMFE property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendANIForMFE() {
        return sendANIForMFE;
    }

    /**
     * Sets the value of the sendANIForMFE property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendANIForMFE(String value) {
        this.sendANIForMFE = value;
    }

    /**
     * Gets the value of the addRemoveAgentSkills property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddRemoveAgentSkills() {
        return addRemoveAgentSkills;
    }

    /**
     * Sets the value of the addRemoveAgentSkills property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddRemoveAgentSkills(String value) {
        this.addRemoveAgentSkills = value;
    }

    /**
     * Gets the value of the mfaniPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMFANIPrefix() {
        return mfaniPrefix;
    }

    /**
     * Sets the value of the mfaniPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMFANIPrefix(String value) {
        this.mfaniPrefix = value;
    }

    /**
     * Gets the value of the automaticChargeDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutomaticChargeDisplay() {
        return automaticChargeDisplay;
    }

    /**
     * Sets the value of the automaticChargeDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutomaticChargeDisplay(String value) {
        this.automaticChargeDisplay = value;
    }

    /**
     * Gets the value of the hearSystemMusicOnHold property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHearSystemMusicOnHold() {
        return hearSystemMusicOnHold;
    }

    /**
     * Sets the value of the hearSystemMusicOnHold property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHearSystemMusicOnHold(String value) {
        this.hearSystemMusicOnHold = value;
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
     * Gets the value of the canBePickedUpByDirectedCallPickup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCanBePickedUpByDirectedCallPickup() {
        return canBePickedUpByDirectedCallPickup;
    }

    /**
     * Sets the value of the canBePickedUpByDirectedCallPickup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCanBePickedUpByDirectedCallPickup(String value) {
        this.canBePickedUpByDirectedCallPickup = value;
    }

    /**
     * Gets the value of the attendantQueuePriority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttendantQueuePriority() {
        return attendantQueuePriority;
    }

    /**
     * Sets the value of the attendantQueuePriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttendantQueuePriority(String value) {
        this.attendantQueuePriority = value;
    }

    /**
     * Gets the value of the canUseDirectedCallPickup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCanUseDirectedCallPickup() {
        return canUseDirectedCallPickup;
    }

    /**
     * Sets the value of the canUseDirectedCallPickup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCanUseDirectedCallPickup(String value) {
        this.canUseDirectedCallPickup = value;
    }

    /**
     * Gets the value of the groupControlledRestriction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupControlledRestriction() {
        return groupControlledRestriction;
    }

    /**
     * Sets the value of the groupControlledRestriction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupControlledRestriction(String value) {
        this.groupControlledRestriction = value;
    }

    /**
     * Gets the value of the omitExtensionRoomDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOmitExtensionRoomDisplay() {
        return omitExtensionRoomDisplay;
    }

    /**
     * Sets the value of the omitExtensionRoomDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOmitExtensionRoomDisplay(String value) {
        this.omitExtensionRoomDisplay = value;
    }

    /**
     * Gets the value of the mfIncomingCallTrace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMFIncomingCallTrace() {
        return mfIncomingCallTrace;
    }

    /**
     * Sets the value of the mfIncomingCallTrace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMFIncomingCallTrace(String value) {
        this.mfIncomingCallTrace = value;
    }

    /**
     * Gets the value of the brazilCollectCallBlocking property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrazilCollectCallBlocking() {
        return brazilCollectCallBlocking;
    }

    /**
     * Sets the value of the brazilCollectCallBlocking property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrazilCollectCallBlocking(String value) {
        this.brazilCollectCallBlocking = value;
    }

    /**
     * Gets the value of the blockTransferDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlockTransferDisplay() {
        return blockTransferDisplay;
    }

    /**
     * Sets the value of the blockTransferDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlockTransferDisplay(String value) {
        this.blockTransferDisplay = value;
    }

    /**
     * Gets the value of the remoteLogoutOfAgent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteLogoutOfAgent() {
        return remoteLogoutOfAgent;
    }

    /**
     * Sets the value of the remoteLogoutOfAgent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteLogoutOfAgent(String value) {
        this.remoteLogoutOfAgent = value;
    }

    /**
     * Gets the value of the canUseStationUserAdminOfFBI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCanUseStationUserAdminOfFBI() {
        return canUseStationUserAdminOfFBI;
    }

    /**
     * Sets the value of the canUseStationUserAdminOfFBI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCanUseStationUserAdminOfFBI(String value) {
        this.canUseStationUserAdminOfFBI = value;
    }

    /**
     * Gets the value of the canBeUsedForStationUserAdminOfFBI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCanBeUsedForStationUserAdminOfFBI() {
        return canBeUsedForStationUserAdminOfFBI;
    }

    /**
     * Sets the value of the canBeUsedForStationUserAdminOfFBI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCanBeUsedForStationUserAdminOfFBI(String value) {
        this.canBeUsedForStationUserAdminOfFBI = value;
    }

    /**
     * Gets the value of the stationLockCOR property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStationLockCOR() {
        return stationLockCOR;
    }

    /**
     * Sets the value of the stationLockCOR property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStationLockCOR(String value) {
        this.stationLockCOR = value;
    }

    /**
     * Gets the value of the todslReleaseIntervalHours property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTODSLReleaseIntervalHours() {
        return todslReleaseIntervalHours;
    }

    /**
     * Sets the value of the todslReleaseIntervalHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTODSLReleaseIntervalHours(String value) {
        this.todslReleaseIntervalHours = value;
    }

    /**
     * Gets the value of the outgoingTrunkDisconnectTimer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutgoingTrunkDisconnectTimer() {
        return outgoingTrunkDisconnectTimer;
    }

    /**
     * Sets the value of the outgoingTrunkDisconnectTimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutgoingTrunkDisconnectTimer(String value) {
        this.outgoingTrunkDisconnectTimer = value;
    }

    /**
     * Gets the value of the lineLoadControl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineLoadControl() {
        return lineLoadControl;
    }

    /**
     * Sets the value of the lineLoadControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineLoadControl(String value) {
        this.lineLoadControl = value;
    }

    /**
     * Gets the value of the maximumPrecedenceLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumPrecedenceLevel() {
        return maximumPrecedenceLevel;
    }

    /**
     * Sets the value of the maximumPrecedenceLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumPrecedenceLevel(String value) {
        this.maximumPrecedenceLevel = value;
    }

    /**
     * Gets the value of the preemptable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreemptable() {
        return preemptable;
    }

    /**
     * Sets the value of the preemptable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreemptable(String value) {
        this.preemptable = value;
    }

    /**
     * Gets the value of the mlppServiceDomain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMLPPServiceDomain() {
        return mlppServiceDomain;
    }

    /**
     * Sets the value of the mlppServiceDomain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMLPPServiceDomain(String value) {
        this.mlppServiceDomain = value;
    }

    /**
     * Gets the value of the blockEnhancedCallPickupAlerting property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlockEnhancedCallPickupAlerting() {
        return blockEnhancedCallPickupAlerting;
    }

    /**
     * Sets the value of the blockEnhancedCallPickupAlerting property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlockEnhancedCallPickupAlerting(String value) {
        this.blockEnhancedCallPickupAlerting = value;
    }

    /**
     * Gets the value of the blockEnhancedConferenceTransferDisplays property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlockEnhancedConferenceTransferDisplays() {
        return blockEnhancedConferenceTransferDisplays;
    }

    /**
     * Sets the value of the blockEnhancedConferenceTransferDisplays property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlockEnhancedConferenceTransferDisplays(String value) {
        this.blockEnhancedConferenceTransferDisplays = value;
    }

    /**
     * Gets the value of the stationButtonDisplayOfUUIIEData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStationButtonDisplayOfUUIIEData() {
        return stationButtonDisplayOfUUIIEData;
    }

    /**
     * Sets the value of the stationButtonDisplayOfUUIIEData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStationButtonDisplayOfUUIIEData(String value) {
        this.stationButtonDisplayOfUUIIEData = value;
    }

    /**
     * Gets the value of the displayNamesOnBridgedAppearanceLabels property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayNamesOnBridgedAppearanceLabels() {
        return displayNamesOnBridgedAppearanceLabels;
    }

    /**
     * Sets the value of the displayNamesOnBridgedAppearanceLabels property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayNamesOnBridgedAppearanceLabels(String value) {
        this.displayNamesOnBridgedAppearanceLabels = value;
    }

    /**
     * Gets the value of the removeCallerIdFromSetDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoveCallerIdFromSetDisplay() {
        return removeCallerIdFromSetDisplay;
    }

    /**
     * Sets the value of the removeCallerIdFromSetDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoveCallerIdFromSetDisplay(String value) {
        this.removeCallerIdFromSetDisplay = value;
    }

    /**
     * Gets the value of the serviceObservingByRecordingDevice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceObservingByRecordingDevice() {
        return serviceObservingByRecordingDevice;
    }

    /**
     * Sets the value of the serviceObservingByRecordingDevice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceObservingByRecordingDevice(String value) {
        this.serviceObservingByRecordingDevice = value;
    }

    /**
     * Gets the value of the dissociateOrUnmergeThisPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDissociateOrUnmergeThisPhone() {
        return dissociateOrUnmergeThisPhone;
    }

    /**
     * Sets the value of the dissociateOrUnmergeThisPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDissociateOrUnmergeThisPhone(String value) {
        this.dissociateOrUnmergeThisPhone = value;
    }

    /**
     * Gets the value of the emuLoginOrLogoffAtThisPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMULoginOrLogoffAtThisPhone() {
        return emuLoginOrLogoffAtThisPhone;
    }

    /**
     * Sets the value of the emuLoginOrLogoffAtThisPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMULoginOrLogoffAtThisPhone(String value) {
        this.emuLoginOrLogoffAtThisPhone = value;
    }

    /**
     * Gets the value of the maskCPNNAMEForInternalCalls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaskCPNNAMEForInternalCalls() {
        return maskCPNNAMEForInternalCalls;
    }

    /**
     * Sets the value of the maskCPNNAMEForInternalCalls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaskCPNNAMEForInternalCalls(String value) {
        this.maskCPNNAMEForInternalCalls = value;
    }

    /**
     * Gets the value of the saccfOverrideByTeamBtn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSACCFOverrideByTeamBtn() {
        return saccfOverrideByTeamBtn;
    }

    /**
     * Sets the value of the saccfOverrideByTeamBtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSACCFOverrideByTeamBtn(String value) {
        this.saccfOverrideByTeamBtn = value;
    }

    /**
     * Gets the value of the saccfOverrideByPriorityCall property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSACCFOverrideByPriorityCall() {
        return saccfOverrideByPriorityCall;
    }

    /**
     * Sets the value of the saccfOverrideByPriorityCall property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSACCFOverrideByPriorityCall(String value) {
        this.saccfOverrideByPriorityCall = value;
    }

    /**
     * Gets the value of the saccfOverrideByDialing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSACCFOverrideByDialing() {
        return saccfOverrideByDialing;
    }

    /**
     * Sets the value of the saccfOverrideByDialing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSACCFOverrideByDialing(String value) {
        this.saccfOverrideByDialing = value;
    }

    /**
     * Gets the value of the saccfOverrideProtectionForTeamBtn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSACCFOverrideProtectionForTeamBtn() {
        return saccfOverrideProtectionForTeamBtn;
    }

    /**
     * Sets the value of the saccfOverrideProtectionForTeamBtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSACCFOverrideProtectionForTeamBtn(String value) {
        this.saccfOverrideProtectionForTeamBtn = value;
    }

    /**
     * Gets the value of the saccfOverrideProtectionForPriorityCall property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSACCFOverrideProtectionForPriorityCall() {
        return saccfOverrideProtectionForPriorityCall;
    }

    /**
     * Sets the value of the saccfOverrideProtectionForPriorityCall property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSACCFOverrideProtectionForPriorityCall(String value) {
        this.saccfOverrideProtectionForPriorityCall = value;
    }

    /**
     * Gets the value of the saccfOverrideProtectionForDialing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSACCFOverrideProtectionForDialing() {
        return saccfOverrideProtectionForDialing;
    }

    /**
     * Sets the value of the saccfOverrideProtectionForDialing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSACCFOverrideProtectionForDialing(String value) {
        this.saccfOverrideProtectionForDialing = value;
    }

    /**
     * Gets the value of the teamBtnSilentIfActive property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTeamBtnSilentIfActive() {
        return teamBtnSilentIfActive;
    }

    /**
     * Sets the value of the teamBtnSilentIfActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTeamBtnSilentIfActive(String value) {
        this.teamBtnSilentIfActive = value;
    }

    /**
     * Gets the value of the teamBtnPriorityRing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTeamBtnPriorityRing() {
        return teamBtnPriorityRing;
    }

    /**
     * Sets the value of the teamBtnPriorityRing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTeamBtnPriorityRing(String value) {
        this.teamBtnPriorityRing = value;
    }

    /**
     * Gets the value of the teamBtnDisplayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTeamBtnDisplayName() {
        return teamBtnDisplayName;
    }

    /**
     * Sets the value of the teamBtnDisplayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTeamBtnDisplayName(String value) {
        this.teamBtnDisplayName = value;
    }

    /**
     * Gets the value of the teamBtnPickUpByGoingOffHook property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTeamBtnPickUpByGoingOffHook() {
        return teamBtnPickUpByGoingOffHook;
    }

    /**
     * Sets the value of the teamBtnPickUpByGoingOffHook property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTeamBtnPickUpByGoingOffHook(String value) {
        this.teamBtnPickUpByGoingOffHook = value;
    }

    /**
     * Gets the value of the oneXServerAccess property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOneXServerAccess() {
        return oneXServerAccess;
    }

    /**
     * Sets the value of the oneXServerAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOneXServerAccess(String value) {
        this.oneXServerAccess = value;
    }

    /**
     * Gets the value of the cpnToSendForRedirectedCalls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCPNToSendForRedirectedCalls() {
        return cpnToSendForRedirectedCalls;
    }

    /**
     * Sets the value of the cpnToSendForRedirectedCalls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCPNToSendForRedirectedCalls(String value) {
        this.cpnToSendForRedirectedCalls = value;
    }

    /**
     * Gets the value of the canForceAWorkStateChange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCanForceAWorkStateChange() {
        return canForceAWorkStateChange;
    }

    /**
     * Sets the value of the canForceAWorkStateChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCanForceAWorkStateChange(String value) {
        this.canForceAWorkStateChange = value;
    }

    /**
     * Gets the value of the workStateChangeCanBeForced property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkStateChangeCanBeForced() {
        return workStateChangeCanBeForced;
    }

    /**
     * Sets the value of the workStateChangeCanBeForced property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkStateChangeCanBeForced(String value) {
        this.workStateChangeCanBeForced = value;
    }

    /**
     * Gets the value of the unrestrictedCallList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unrestrictedCallList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnrestrictedCallList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getUnrestrictedCallList() {
        if (unrestrictedCallList == null) {
            unrestrictedCallList = new ArrayList<ArrayType>();
        }
        return this.unrestrictedCallList;
    }

    /**
     * Gets the value of the callingPermission property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the callingPermission property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCallingPermission().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getCallingPermission() {
        if (callingPermission == null) {
            callingPermission = new ArrayList<ArrayType>();
        }
        return this.callingPermission;
    }

    /**
     * Gets the value of the callingPermission1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the callingPermission1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCallingPermission1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getCallingPermission1() {
        if (callingPermission1 == null) {
            callingPermission1 = new ArrayList<ArrayType>();
        }
        return this.callingPermission1;
    }

    /**
     * Gets the value of the callingPermission2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the callingPermission2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCallingPermission2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getCallingPermission2() {
        if (callingPermission2 == null) {
            callingPermission2 = new ArrayList<ArrayType>();
        }
        return this.callingPermission2;
    }

    /**
     * Gets the value of the callingPermission3 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the callingPermission3 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCallingPermission3().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getCallingPermission3() {
        if (callingPermission3 == null) {
            callingPermission3 = new ArrayList<ArrayType>();
        }
        return this.callingPermission3;
    }

    /**
     * Gets the value of the callingPermission4 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the callingPermission4 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCallingPermission4().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getCallingPermission4() {
        if (callingPermission4 == null) {
            callingPermission4 = new ArrayList<ArrayType>();
        }
        return this.callingPermission4;
    }

    /**
     * Gets the value of the callingPermission5 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the callingPermission5 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCallingPermission5().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getCallingPermission5() {
        if (callingPermission5 == null) {
            callingPermission5 = new ArrayList<ArrayType>();
        }
        return this.callingPermission5;
    }

    /**
     * Gets the value of the callingPermission6 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the callingPermission6 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCallingPermission6().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getCallingPermission6() {
        if (callingPermission6 == null) {
            callingPermission6 = new ArrayList<ArrayType>();
        }
        return this.callingPermission6;
    }

    /**
     * Gets the value of the callingPermission7 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the callingPermission7 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCallingPermission7().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getCallingPermission7() {
        if (callingPermission7 == null) {
            callingPermission7 = new ArrayList<ArrayType>();
        }
        return this.callingPermission7;
    }

    /**
     * Gets the value of the callingPermission8 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the callingPermission8 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCallingPermission8().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getCallingPermission8() {
        if (callingPermission8 == null) {
            callingPermission8 = new ArrayList<ArrayType>();
        }
        return this.callingPermission8;
    }

    /**
     * Gets the value of the callingPermission9 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the callingPermission9 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCallingPermission9().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getCallingPermission9() {
        if (callingPermission9 == null) {
            callingPermission9 = new ArrayList<ArrayType>();
        }
        return this.callingPermission9;
    }

    /**
     * Gets the value of the soPermission property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the soPermission property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSOPermission().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getSOPermission() {
        if (soPermission == null) {
            soPermission = new ArrayList<ArrayType>();
        }
        return this.soPermission;
    }

    /**
     * Gets the value of the soPermission1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the soPermission1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSOPermission1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getSOPermission1() {
        if (soPermission1 == null) {
            soPermission1 = new ArrayList<ArrayType>();
        }
        return this.soPermission1;
    }

    /**
     * Gets the value of the soPermission2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the soPermission2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSOPermission2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getSOPermission2() {
        if (soPermission2 == null) {
            soPermission2 = new ArrayList<ArrayType>();
        }
        return this.soPermission2;
    }

    /**
     * Gets the value of the soPermission3 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the soPermission3 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSOPermission3().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getSOPermission3() {
        if (soPermission3 == null) {
            soPermission3 = new ArrayList<ArrayType>();
        }
        return this.soPermission3;
    }

    /**
     * Gets the value of the soPermission4 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the soPermission4 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSOPermission4().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getSOPermission4() {
        if (soPermission4 == null) {
            soPermission4 = new ArrayList<ArrayType>();
        }
        return this.soPermission4;
    }

    /**
     * Gets the value of the soPermission5 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the soPermission5 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSOPermission5().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getSOPermission5() {
        if (soPermission5 == null) {
            soPermission5 = new ArrayList<ArrayType>();
        }
        return this.soPermission5;
    }

    /**
     * Gets the value of the soPermission6 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the soPermission6 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSOPermission6().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getSOPermission6() {
        if (soPermission6 == null) {
            soPermission6 = new ArrayList<ArrayType>();
        }
        return this.soPermission6;
    }

    /**
     * Gets the value of the soPermission7 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the soPermission7 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSOPermission7().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getSOPermission7() {
        if (soPermission7 == null) {
            soPermission7 = new ArrayList<ArrayType>();
        }
        return this.soPermission7;
    }

    /**
     * Gets the value of the soPermission8 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the soPermission8 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSOPermission8().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getSOPermission8() {
        if (soPermission8 == null) {
            soPermission8 = new ArrayList<ArrayType>();
        }
        return this.soPermission8;
    }

    /**
     * Gets the value of the soPermission9 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the soPermission9 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSOPermission9().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getSOPermission9() {
        if (soPermission9 == null) {
            soPermission9 = new ArrayList<ArrayType>();
        }
        return this.soPermission9;
    }

    /**
     * Gets the value of the authorizationCodePermissions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the authorizationCodePermissions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthorizationCodePermissions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getAuthorizationCodePermissions() {
        if (authorizationCodePermissions == null) {
            authorizationCodePermissions = new ArrayList<ArrayType>();
        }
        return this.authorizationCodePermissions;
    }

    /**
     * Gets the value of the authorizationCodePermissions1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the authorizationCodePermissions1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthorizationCodePermissions1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getAuthorizationCodePermissions1() {
        if (authorizationCodePermissions1 == null) {
            authorizationCodePermissions1 = new ArrayList<ArrayType>();
        }
        return this.authorizationCodePermissions1;
    }

    /**
     * Gets the value of the authorizationCodePermissions2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the authorizationCodePermissions2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthorizationCodePermissions2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getAuthorizationCodePermissions2() {
        if (authorizationCodePermissions2 == null) {
            authorizationCodePermissions2 = new ArrayList<ArrayType>();
        }
        return this.authorizationCodePermissions2;
    }

    /**
     * Gets the value of the authorizationCodePermissions3 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the authorizationCodePermissions3 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthorizationCodePermissions3().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getAuthorizationCodePermissions3() {
        if (authorizationCodePermissions3 == null) {
            authorizationCodePermissions3 = new ArrayList<ArrayType>();
        }
        return this.authorizationCodePermissions3;
    }

    /**
     * Gets the value of the authorizationCodePermissions4 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the authorizationCodePermissions4 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthorizationCodePermissions4().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getAuthorizationCodePermissions4() {
        if (authorizationCodePermissions4 == null) {
            authorizationCodePermissions4 = new ArrayList<ArrayType>();
        }
        return this.authorizationCodePermissions4;
    }

    /**
     * Gets the value of the authorizationCodePermissions5 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the authorizationCodePermissions5 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthorizationCodePermissions5().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getAuthorizationCodePermissions5() {
        if (authorizationCodePermissions5 == null) {
            authorizationCodePermissions5 = new ArrayList<ArrayType>();
        }
        return this.authorizationCodePermissions5;
    }

    /**
     * Gets the value of the authorizationCodePermissions6 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the authorizationCodePermissions6 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthorizationCodePermissions6().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getAuthorizationCodePermissions6() {
        if (authorizationCodePermissions6 == null) {
            authorizationCodePermissions6 = new ArrayList<ArrayType>();
        }
        return this.authorizationCodePermissions6;
    }

    /**
     * Gets the value of the authorizationCodePermissions7 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the authorizationCodePermissions7 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthorizationCodePermissions7().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getAuthorizationCodePermissions7() {
        if (authorizationCodePermissions7 == null) {
            authorizationCodePermissions7 = new ArrayList<ArrayType>();
        }
        return this.authorizationCodePermissions7;
    }

    /**
     * Gets the value of the authorizationCodePermissions8 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the authorizationCodePermissions8 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthorizationCodePermissions8().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getAuthorizationCodePermissions8() {
        if (authorizationCodePermissions8 == null) {
            authorizationCodePermissions8 = new ArrayList<ArrayType>();
        }
        return this.authorizationCodePermissions8;
    }

    /**
     * Gets the value of the authorizationCodePermissions9 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the authorizationCodePermissions9 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthorizationCodePermissions9().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getAuthorizationCodePermissions9() {
        if (authorizationCodePermissions9 == null) {
            authorizationCodePermissions9 = new ArrayList<ArrayType>();
        }
        return this.authorizationCodePermissions9;
    }

}
