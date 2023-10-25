
package com.system.ipcc.pbx.avaya.smsxml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for modelChoices complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="modelChoices">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="AARAnalysis" type="{http://xml.avaya.com/sms}AARAnalysisType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AARDigitConversion" type="{http://xml.avaya.com/sms}AARDigitConversionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AESvcsCTILink" type="{http://xml.avaya.com/sms}AESvcsCTILinkType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AESvcsInterface" type="{http://xml.avaya.com/sms}AESvcsInterfaceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AESvcsLink" type="{http://xml.avaya.com/sms}AESvcsLinkType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ARSAnalysis" type="{http://xml.avaya.com/sms}ARSAnalysisType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ARSDigitConversion" type="{http://xml.avaya.com/sms}ARSDigitConversionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AbbreviatedDialing7103" type="{http://xml.avaya.com/sms}AbbreviatedDialing7103Type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AbbreviatedDialingEnhanced" type="{http://xml.avaya.com/sms}AbbreviatedDialingEnhancedType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AbbreviatedDialingGroup" type="{http://xml.avaya.com/sms}AbbreviatedDialingGroupType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AbbreviatedDialingPersonal" type="{http://xml.avaya.com/sms}AbbreviatedDialingPersonalType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AbbreviatedDialingSystem" type="{http://xml.avaya.com/sms}AbbreviatedDialingSystemType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Agent" type="{http://xml.avaya.com/sms}AgentType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AliasStation" type="{http://xml.avaya.com/sms}AliasStationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Amw" type="{http://xml.avaya.com/sms}AmwType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Announcement" type="{http://xml.avaya.com/sms}AnnouncementType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AudioGroup" type="{http://xml.avaya.com/sms}AudioGroupType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AudixNodeNames" type="{http://xml.avaya.com/sms}AudixNodeNamesType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AuthorizationCode" type="{http://xml.avaya.com/sms}AuthorizationCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BCMSAgentReport" type="{http://xml.avaya.com/sms}BCMSAgentReportType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BCMSSkillReport" type="{http://xml.avaya.com/sms}BCMSSkillReportType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BCMSTrunkReport" type="{http://xml.avaya.com/sms}BCMSTrunkReportType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BCMSVDNReport" type="{http://xml.avaya.com/sms}BCMSVDNReportType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BestServiceRouting" type="{http://xml.avaya.com/sms}BestServiceRoutingType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Board" type="{http://xml.avaya.com/sms}BoardType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CAMANumbering" type="{http://xml.avaya.com/sms}CAMANumberingType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="COR" type="{http://xml.avaya.com/sms}CORType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="COS" type="{http://xml.avaya.com/sms}COSType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CTILink" type="{http://xml.avaya.com/sms}CTILinkType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Cabinet" type="{http://xml.avaya.com/sms}CabinetType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Capacity" type="{http://xml.avaya.com/sms}CapacityType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Configuration" type="{http://xml.avaya.com/sms}ConfigurationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CoverageAnswerGroup" type="{http://xml.avaya.com/sms}CoverageAnswerGroupType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CoveragePath" type="{http://xml.avaya.com/sms}CoveragePathType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CoverageRemote" type="{http://xml.avaya.com/sms}CoverageRemoteType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CoverageTimeOfDay" type="{http://xml.avaya.com/sms}CoverageTimeOfDayType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CustomerOptions" type="{http://xml.avaya.com/sms}CustomerOptionsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DataModule" type="{http://xml.avaya.com/sms}DataModuleType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DefaultRegion" type="{http://xml.avaya.com/sms}DefaultRegionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DialPlan" type="{http://xml.avaya.com/sms}DialPlanType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DialPlanParameters" type="{http://xml.avaya.com/sms}DialPlanParametersType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DisplayParameters" type="{http://xml.avaya.com/sms}DisplayParametersType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EcdControlledSkills" type="{http://xml.avaya.com/sms}EcdControlledSkillsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ExtendedPickUpGroup" type="{http://xml.avaya.com/sms}ExtendedPickUpGroupType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ExtensionStation" type="{http://xml.avaya.com/sms}ExtensionStationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ExtensionType" type="{http://xml.avaya.com/sms}ExtensionTypeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FeatureAccessCodes" type="{http://xml.avaya.com/sms}FeatureAccessCodesType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FileTransfer" type="{http://xml.avaya.com/sms}FileTransferType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="HolidayTable" type="{http://xml.avaya.com/sms}HolidayTableType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="HuntGroup" type="{http://xml.avaya.com/sms}HuntGroupType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="IPAddressUsage" type="{http://xml.avaya.com/sms}IPAddressUsageType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="IPCodec" type="{http://xml.avaya.com/sms}IPCodecType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="IPHoteling" type="{http://xml.avaya.com/sms}IPHotelingType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="IPInterface" type="{http://xml.avaya.com/sms}IPInterfaceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="IPNetworkMap" type="{http://xml.avaya.com/sms}IPNetworkMapType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="IPNetworkRegion" type="{http://xml.avaya.com/sms}IPNetworkRegionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="IPNetworkRegionStatus" type="{http://xml.avaya.com/sms}IPNetworkRegionStatusType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="IPNodeNames" type="{http://xml.avaya.com/sms}IPNodeNamesType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="IPOptions" type="{http://xml.avaya.com/sms}IPOptionsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="IPRegTTI" type="{http://xml.avaya.com/sms}IPRegTTIType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="IPRegistration" type="{http://xml.avaya.com/sms}IPRegistrationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="IPServerInterface" type="{http://xml.avaya.com/sms}IPServerInterfaceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="IPServices" type="{http://xml.avaya.com/sms}IPServicesType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="IPStations" type="{http://xml.avaya.com/sms}IPStationsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="IPStations5" type="{http://xml.avaya.com/sms}IPStations5Type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="IPStations6" type="{http://xml.avaya.com/sms}IPStations6Type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="IncomingCallHandling" type="{http://xml.avaya.com/sms}IncomingCallHandlingType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="IntercomGroup" type="{http://xml.avaya.com/sms}IntercomGroupType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ListExtensionType" type="{http://xml.avaya.com/sms}ListExtensionTypeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ListHistory" type="{http://xml.avaya.com/sms}ListHistoryType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ListIPInterface" type="{http://xml.avaya.com/sms}ListIPInterfaceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ListIPNetworkRegionMonitor" type="{http://xml.avaya.com/sms}ListIPNetworkRegionMonitorType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ListNodeNames" type="{http://xml.avaya.com/sms}ListNodeNamesType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ListSurvivable" type="{http://xml.avaya.com/sms}ListSurvivableType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ListTTIRegistration" type="{http://xml.avaya.com/sms}ListTTIRegistrationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ListUsageExtension" type="{http://xml.avaya.com/sms}ListUsageExtensionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Locations" type="{http://xml.avaya.com/sms}LocationsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Logins" type="{http://xml.avaya.com/sms}LoginsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MOHGroup" type="{http://xml.avaya.com/sms}MOHGroupType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MediaGateway" type="{http://xml.avaya.com/sms}MediaGatewayType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OffPbxFeatureNameExtensions" type="{http://xml.avaya.com/sms}OffPbxFeatureNameExtensionsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OffPbxStationMapping" type="{http://xml.avaya.com/sms}OffPbxStationMappingType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PersonalCOLine" type="{http://xml.avaya.com/sms}PersonalCOLineType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PickUpGroup" type="{http://xml.avaya.com/sms}PickUpGroupType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Port" type="{http://xml.avaya.com/sms}PortType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ProcessorIPInterface" type="{http://xml.avaya.com/sms}ProcessorIPInterfaceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PublicUnknownNumbering" type="{http://xml.avaya.com/sms}PublicUnknownNumberingType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RHNPA" type="{http://xml.avaya.com/sms}RHNPAType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ReasonCodeNames" type="{http://xml.avaya.com/sms}ReasonCodeNamesType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RegisteredIPStations" type="{http://xml.avaya.com/sms}RegisteredIPStationsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RemoteAccess" type="{http://xml.avaya.com/sms}RemoteAccessType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RoutePattern" type="{http://xml.avaya.com/sms}RoutePatternType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ServiceHoursTable" type="{http://xml.avaya.com/sms}ServiceHoursTableType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SignalingGroup" type="{http://xml.avaya.com/sms}SignalingGroupType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SiteData" type="{http://xml.avaya.com/sms}SiteDataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SoftwareVersion" type="{http://xml.avaya.com/sms}SoftwareVersionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SpecialApplications" type="{http://xml.avaya.com/sms}SpecialApplicationsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Station" type="{http://xml.avaya.com/sms}StationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="StationStatus" type="{http://xml.avaya.com/sms}StationStatusType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="System" type="{http://xml.avaya.com/sms}SystemType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SystemFeatures" type="{http://xml.avaya.com/sms}SystemFeaturesType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SystemParameters" type="{http://xml.avaya.com/sms}SystemParametersType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SystemParametersCustomer" type="{http://xml.avaya.com/sms}SystemParametersCustomerType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SystemParametersFeatures" type="{http://xml.avaya.com/sms}SystemParametersFeaturesType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SystemParametersSpecial" type="{http://xml.avaya.com/sms}SystemParametersSpecialType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SystemSecurity" type="{http://xml.avaya.com/sms}SystemSecurityType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Tenant" type="{http://xml.avaya.com/sms}TenantType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TerminatingExtensionGroup" type="{http://xml.avaya.com/sms}TerminatingExtensionGroupType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TollAnalysis" type="{http://xml.avaya.com/sms}TollAnalysisType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Translation" type="{http://xml.avaya.com/sms}TranslationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TrunkGroup" type="{http://xml.avaya.com/sms}TrunkGroupType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TrunkStatus" type="{http://xml.avaya.com/sms}TrunkStatusType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="UniformDialplan" type="{http://xml.avaya.com/sms}UniformDialplanType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="VDN" type="{http://xml.avaya.com/sms}VDNType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="VRT" type="{http://xml.avaya.com/sms}VRTType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Vector" type="{http://xml.avaya.com/sms}VectorType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="VectorVariables" type="{http://xml.avaya.com/sms}VectorVariablesType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="WitnessStation" type="{http://xml.avaya.com/sms}WitnessStationType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "modelChoices", propOrder = {
    "aarAnalysis",
    "aarDigitConversion",
    "aeSvcsCTILink",
    "aeSvcsInterface",
    "aeSvcsLink",
    "arsAnalysis",
    "arsDigitConversion",
    "abbreviatedDialing7103",
    "abbreviatedDialingEnhanced",
    "abbreviatedDialingGroup",
    "abbreviatedDialingPersonal",
    "abbreviatedDialingSystem",
    "agent",
    "aliasStation",
    "amw",
    "announcement",
    "audioGroup",
    "audixNodeNames",
    "authorizationCode",
    "bcmsAgentReport",
    "bcmsSkillReport",
    "bcmsTrunkReport",
    "bcmsvdnReport",
    "bestServiceRouting",
    "board",
    "camaNumbering",
    "cor",
    "cos",
    "ctiLink",
    "cabinet",
    "capacity",
    "configuration",
    "coverageAnswerGroup",
    "coveragePath",
    "coverageRemote",
    "coverageTimeOfDay",
    "customerOptions",
    "dataModule",
    "defaultRegion",
    "dialPlan",
    "dialPlanParameters",
    "displayParameters",
    "ecdControlledSkills",
    "extendedPickUpGroup",
    "extensionStation",
    "extensionType",
    "featureAccessCodes",
    "fileTransfer",
    "holidayTable",
    "huntGroup",
    "ipAddressUsage",
    "ipCodec",
    "ipHoteling",
    "ipInterface",
    "ipNetworkMap",
    "ipNetworkRegion",
    "ipNetworkRegionStatus",
    "ipNodeNames",
    "ipOptions",
    "ipRegTTI",
    "ipRegistration",
    "ipServerInterface",
    "ipServices",
    "ipStations",
    "ipStations5",
    "ipStations6",
    "incomingCallHandling",
    "intercomGroup",
    "listExtensionType",
    "listHistory",
    "listIPInterface",
    "listIPNetworkRegionMonitor",
    "listNodeNames",
    "listSurvivable",
    "listTTIRegistration",
    "listUsageExtension",
    "locations",
    "logins",
    "mohGroup",
    "mediaGateway",
    "offPbxFeatureNameExtensions",
    "offPbxStationMapping",
    "personalCOLine",
    "pickUpGroup",
    "port",
    "processorIPInterface",
    "publicUnknownNumbering",
    "rhnpa",
    "reasonCodeNames",
    "registeredIPStations",
    "remoteAccess",
    "routePattern",
    "serviceHoursTable",
    "signalingGroup",
    "siteData",
    "softwareVersion",
    "specialApplications",
    "station",
    "stationStatus",
    "system",
    "systemFeatures",
    "systemParameters",
    "systemParametersCustomer",
    "systemParametersFeatures",
    "systemParametersSpecial",
    "systemSecurity",
    "tenant",
    "terminatingExtensionGroup",
    "tollAnalysis",
    "translation",
    "trunkGroup",
    "trunkStatus",
    "uniformDialplan",
    "vdn",
    "vrt",
    "vector",
    "vectorVariables",
    "witnessStation"
})
public class ModelChoices {

    @XmlElement(name = "AARAnalysis")
    protected List<AARAnalysisType> aarAnalysis;
    @XmlElement(name = "AARDigitConversion")
    protected List<AARDigitConversionType> aarDigitConversion;
    @XmlElement(name = "AESvcsCTILink")
    protected List<AESvcsCTILinkType> aeSvcsCTILink;
    @XmlElement(name = "AESvcsInterface")
    protected List<AESvcsInterfaceType> aeSvcsInterface;
    @XmlElement(name = "AESvcsLink")
    protected List<AESvcsLinkType> aeSvcsLink;
    @XmlElement(name = "ARSAnalysis")
    protected List<ARSAnalysisType> arsAnalysis;
    @XmlElement(name = "ARSDigitConversion")
    protected List<ARSDigitConversionType> arsDigitConversion;
    @XmlElement(name = "AbbreviatedDialing7103")
    protected List<AbbreviatedDialing7103Type> abbreviatedDialing7103;
    @XmlElement(name = "AbbreviatedDialingEnhanced")
    protected List<AbbreviatedDialingEnhancedType> abbreviatedDialingEnhanced;
    @XmlElement(name = "AbbreviatedDialingGroup")
    protected List<AbbreviatedDialingGroupType> abbreviatedDialingGroup;
    @XmlElement(name = "AbbreviatedDialingPersonal")
    protected List<AbbreviatedDialingPersonalType> abbreviatedDialingPersonal;
    @XmlElement(name = "AbbreviatedDialingSystem")
    protected List<AbbreviatedDialingSystemType> abbreviatedDialingSystem;
    @XmlElement(name = "Agent")
    protected List<AgentType> agent;
    @XmlElement(name = "AliasStation")
    protected List<AliasStationType> aliasStation;
    @XmlElement(name = "Amw")
    protected List<AmwType> amw;
    @XmlElement(name = "Announcement")
    protected List<AnnouncementType> announcement;
    @XmlElement(name = "AudioGroup")
    protected List<AudioGroupType> audioGroup;
    @XmlElement(name = "AudixNodeNames")
    protected List<AudixNodeNamesType> audixNodeNames;
    @XmlElement(name = "AuthorizationCode")
    protected List<AuthorizationCodeType> authorizationCode;
    @XmlElement(name = "BCMSAgentReport")
    protected List<BCMSAgentReportType> bcmsAgentReport;
    @XmlElement(name = "BCMSSkillReport")
    protected List<BCMSSkillReportType> bcmsSkillReport;
    @XmlElement(name = "BCMSTrunkReport")
    protected List<BCMSTrunkReportType> bcmsTrunkReport;
    @XmlElement(name = "BCMSVDNReport")
    protected List<BCMSVDNReportType> bcmsvdnReport;
    @XmlElement(name = "BestServiceRouting")
    protected List<BestServiceRoutingType> bestServiceRouting;
    @XmlElement(name = "Board")
    protected List<BoardType> board;
    @XmlElement(name = "CAMANumbering")
    protected List<CAMANumberingType> camaNumbering;
    @XmlElement(name = "COR")
    protected List<CORType> cor;
    @XmlElement(name = "COS")
    protected List<COSType> cos;
    @XmlElement(name = "CTILink")
    protected List<CTILinkType> ctiLink;
    @XmlElement(name = "Cabinet")
    protected List<CabinetType> cabinet;
    @XmlElement(name = "Capacity")
    protected List<CapacityType> capacity;
    @XmlElement(name = "Configuration")
    protected List<ConfigurationType> configuration;
    @XmlElement(name = "CoverageAnswerGroup")
    protected List<CoverageAnswerGroupType> coverageAnswerGroup;
    @XmlElement(name = "CoveragePath")
    protected List<CoveragePathType> coveragePath;
    @XmlElement(name = "CoverageRemote")
    protected List<CoverageRemoteType> coverageRemote;
    @XmlElement(name = "CoverageTimeOfDay")
    protected List<CoverageTimeOfDayType> coverageTimeOfDay;
    @XmlElement(name = "CustomerOptions")
    protected List<CustomerOptionsType> customerOptions;
    @XmlElement(name = "DataModule")
    protected List<DataModuleType> dataModule;
    @XmlElement(name = "DefaultRegion")
    protected List<DefaultRegionType> defaultRegion;
    @XmlElement(name = "DialPlan")
    protected List<DialPlanType> dialPlan;
    @XmlElement(name = "DialPlanParameters")
    protected List<DialPlanParametersType> dialPlanParameters;
    @XmlElement(name = "DisplayParameters")
    protected List<DisplayParametersType> displayParameters;
    @XmlElement(name = "EcdControlledSkills")
    protected List<EcdControlledSkillsType> ecdControlledSkills;
    @XmlElement(name = "ExtendedPickUpGroup")
    protected List<ExtendedPickUpGroupType> extendedPickUpGroup;
    @XmlElement(name = "ExtensionStation")
    protected List<ExtensionStationType> extensionStation;
    @XmlElement(name = "ExtensionType")
    protected List<ExtensionTypeType> extensionType;
    @XmlElement(name = "FeatureAccessCodes")
    protected List<FeatureAccessCodesType> featureAccessCodes;
    @XmlElement(name = "FileTransfer")
    protected List<FileTransferType> fileTransfer;
    @XmlElement(name = "HolidayTable")
    protected List<HolidayTableType> holidayTable;
    @XmlElement(name = "HuntGroup")
    protected List<HuntGroupType> huntGroup;
    @XmlElement(name = "IPAddressUsage")
    protected List<IPAddressUsageType> ipAddressUsage;
    @XmlElement(name = "IPCodec")
    protected List<IPCodecType> ipCodec;
    @XmlElement(name = "IPHoteling")
    protected List<IPHotelingType> ipHoteling;
    @XmlElement(name = "IPInterface")
    protected List<IPInterfaceType> ipInterface;
    @XmlElement(name = "IPNetworkMap")
    protected List<IPNetworkMapType> ipNetworkMap;
    @XmlElement(name = "IPNetworkRegion")
    protected List<IPNetworkRegionType> ipNetworkRegion;
    @XmlElement(name = "IPNetworkRegionStatus")
    protected List<IPNetworkRegionStatusType> ipNetworkRegionStatus;
    @XmlElement(name = "IPNodeNames")
    protected List<IPNodeNamesType> ipNodeNames;
    @XmlElement(name = "IPOptions")
    protected List<IPOptionsType> ipOptions;
    @XmlElement(name = "IPRegTTI")
    protected List<IPRegTTIType> ipRegTTI;
    @XmlElement(name = "IPRegistration")
    protected List<IPRegistrationType> ipRegistration;
    @XmlElement(name = "IPServerInterface")
    protected List<IPServerInterfaceType> ipServerInterface;
    @XmlElement(name = "IPServices")
    protected List<IPServicesType> ipServices;
    @XmlElement(name = "IPStations")
    protected List<IPStationsType> ipStations;
    @XmlElement(name = "IPStations5")
    protected List<IPStations5Type> ipStations5;
    @XmlElement(name = "IPStations6")
    protected List<IPStations6Type> ipStations6;
    @XmlElement(name = "IncomingCallHandling")
    protected List<IncomingCallHandlingType> incomingCallHandling;
    @XmlElement(name = "IntercomGroup")
    protected List<IntercomGroupType> intercomGroup;
    @XmlElement(name = "ListExtensionType")
    protected List<ListExtensionTypeType> listExtensionType;
    @XmlElement(name = "ListHistory")
    protected List<ListHistoryType> listHistory;
    @XmlElement(name = "ListIPInterface")
    protected List<ListIPInterfaceType> listIPInterface;
    @XmlElement(name = "ListIPNetworkRegionMonitor")
    protected List<ListIPNetworkRegionMonitorType> listIPNetworkRegionMonitor;
    @XmlElement(name = "ListNodeNames")
    protected List<ListNodeNamesType> listNodeNames;
    @XmlElement(name = "ListSurvivable")
    protected List<ListSurvivableType> listSurvivable;
    @XmlElement(name = "ListTTIRegistration")
    protected List<ListTTIRegistrationType> listTTIRegistration;
    @XmlElement(name = "ListUsageExtension")
    protected List<ListUsageExtensionType> listUsageExtension;
    @XmlElement(name = "Locations")
    protected List<LocationsType> locations;
    @XmlElement(name = "Logins")
    protected List<LoginsType> logins;
    @XmlElement(name = "MOHGroup")
    protected List<MOHGroupType> mohGroup;
    @XmlElement(name = "MediaGateway")
    protected List<MediaGatewayType> mediaGateway;
    @XmlElement(name = "OffPbxFeatureNameExtensions")
    protected List<OffPbxFeatureNameExtensionsType> offPbxFeatureNameExtensions;
    @XmlElement(name = "OffPbxStationMapping")
    protected List<OffPbxStationMappingType> offPbxStationMapping;
    @XmlElement(name = "PersonalCOLine")
    protected List<PersonalCOLineType> personalCOLine;
    @XmlElement(name = "PickUpGroup")
    protected List<PickUpGroupType> pickUpGroup;
    @XmlElement(name = "Port")
    protected List<PortType> port;
    @XmlElement(name = "ProcessorIPInterface")
    protected List<ProcessorIPInterfaceType> processorIPInterface;
    @XmlElement(name = "PublicUnknownNumbering")
    protected List<PublicUnknownNumberingType> publicUnknownNumbering;
    @XmlElement(name = "RHNPA")
    protected List<RHNPAType> rhnpa;
    @XmlElement(name = "ReasonCodeNames")
    protected List<ReasonCodeNamesType> reasonCodeNames;
    @XmlElement(name = "RegisteredIPStations")
    protected List<RegisteredIPStationsType> registeredIPStations;
    @XmlElement(name = "RemoteAccess")
    protected List<RemoteAccessType> remoteAccess;
    @XmlElement(name = "RoutePattern")
    protected List<RoutePatternType> routePattern;
    @XmlElement(name = "ServiceHoursTable")
    protected List<ServiceHoursTableType> serviceHoursTable;
    @XmlElement(name = "SignalingGroup")
    protected List<SignalingGroupType> signalingGroup;
    @XmlElement(name = "SiteData")
    protected List<SiteDataType> siteData;
    @XmlElement(name = "SoftwareVersion")
    protected List<SoftwareVersionType> softwareVersion;
    @XmlElement(name = "SpecialApplications")
    protected List<SpecialApplicationsType> specialApplications;
    @XmlElement(name = "Station")
    protected List<StationType> station;
    @XmlElement(name = "StationStatus")
    protected List<StationStatusType> stationStatus;
    @XmlElement(name = "System")
    protected List<SystemType> system;
    @XmlElement(name = "SystemFeatures")
    protected List<SystemFeaturesType> systemFeatures;
    @XmlElement(name = "SystemParameters")
    protected List<SystemParametersType> systemParameters;
    @XmlElement(name = "SystemParametersCustomer")
    protected List<SystemParametersCustomerType> systemParametersCustomer;
    @XmlElement(name = "SystemParametersFeatures")
    protected List<SystemParametersFeaturesType> systemParametersFeatures;
    @XmlElement(name = "SystemParametersSpecial")
    protected List<SystemParametersSpecialType> systemParametersSpecial;
    @XmlElement(name = "SystemSecurity")
    protected List<SystemSecurityType> systemSecurity;
    @XmlElement(name = "Tenant")
    protected List<TenantType> tenant;
    @XmlElement(name = "TerminatingExtensionGroup")
    protected List<TerminatingExtensionGroupType> terminatingExtensionGroup;
    @XmlElement(name = "TollAnalysis")
    protected List<TollAnalysisType> tollAnalysis;
    @XmlElement(name = "Translation")
    protected List<TranslationType> translation;
    @XmlElement(name = "TrunkGroup")
    protected List<TrunkGroupType> trunkGroup;
    @XmlElement(name = "TrunkStatus")
    protected List<TrunkStatusType> trunkStatus;
    @XmlElement(name = "UniformDialplan")
    protected List<UniformDialplanType> uniformDialplan;
    @XmlElement(name = "VDN")
    protected List<VDNType> vdn;
    @XmlElement(name = "VRT")
    protected List<VRTType> vrt;
    @XmlElement(name = "Vector")
    protected List<VectorType> vector;
    @XmlElement(name = "VectorVariables")
    protected List<VectorVariablesType> vectorVariables;
    @XmlElement(name = "WitnessStation")
    protected List<WitnessStationType> witnessStation;

    /**
     * Gets the value of the aarAnalysis property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aarAnalysis property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAARAnalysis().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AARAnalysisType }
     * 
     * 
     */
    public List<AARAnalysisType> getAARAnalysis() {
        if (aarAnalysis == null) {
            aarAnalysis = new ArrayList<AARAnalysisType>();
        }
        return this.aarAnalysis;
    }

    /**
     * Gets the value of the aarDigitConversion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aarDigitConversion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAARDigitConversion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AARDigitConversionType }
     * 
     * 
     */
    public List<AARDigitConversionType> getAARDigitConversion() {
        if (aarDigitConversion == null) {
            aarDigitConversion = new ArrayList<AARDigitConversionType>();
        }
        return this.aarDigitConversion;
    }

    /**
     * Gets the value of the aeSvcsCTILink property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aeSvcsCTILink property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAESvcsCTILink().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AESvcsCTILinkType }
     * 
     * 
     */
    public List<AESvcsCTILinkType> getAESvcsCTILink() {
        if (aeSvcsCTILink == null) {
            aeSvcsCTILink = new ArrayList<AESvcsCTILinkType>();
        }
        return this.aeSvcsCTILink;
    }

    /**
     * Gets the value of the aeSvcsInterface property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aeSvcsInterface property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAESvcsInterface().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AESvcsInterfaceType }
     * 
     * 
     */
    public List<AESvcsInterfaceType> getAESvcsInterface() {
        if (aeSvcsInterface == null) {
            aeSvcsInterface = new ArrayList<AESvcsInterfaceType>();
        }
        return this.aeSvcsInterface;
    }

    /**
     * Gets the value of the aeSvcsLink property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aeSvcsLink property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAESvcsLink().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AESvcsLinkType }
     * 
     * 
     */
    public List<AESvcsLinkType> getAESvcsLink() {
        if (aeSvcsLink == null) {
            aeSvcsLink = new ArrayList<AESvcsLinkType>();
        }
        return this.aeSvcsLink;
    }

    /**
     * Gets the value of the arsAnalysis property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the arsAnalysis property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getARSAnalysis().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ARSAnalysisType }
     * 
     * 
     */
    public List<ARSAnalysisType> getARSAnalysis() {
        if (arsAnalysis == null) {
            arsAnalysis = new ArrayList<ARSAnalysisType>();
        }
        return this.arsAnalysis;
    }

    /**
     * Gets the value of the arsDigitConversion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the arsDigitConversion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getARSDigitConversion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ARSDigitConversionType }
     * 
     * 
     */
    public List<ARSDigitConversionType> getARSDigitConversion() {
        if (arsDigitConversion == null) {
            arsDigitConversion = new ArrayList<ARSDigitConversionType>();
        }
        return this.arsDigitConversion;
    }

    /**
     * Gets the value of the abbreviatedDialing7103 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the abbreviatedDialing7103 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAbbreviatedDialing7103().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbbreviatedDialing7103Type }
     * 
     * 
     */
    public List<AbbreviatedDialing7103Type> getAbbreviatedDialing7103() {
        if (abbreviatedDialing7103 == null) {
            abbreviatedDialing7103 = new ArrayList<AbbreviatedDialing7103Type>();
        }
        return this.abbreviatedDialing7103;
    }

    /**
     * Gets the value of the abbreviatedDialingEnhanced property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the abbreviatedDialingEnhanced property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAbbreviatedDialingEnhanced().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbbreviatedDialingEnhancedType }
     * 
     * 
     */
    public List<AbbreviatedDialingEnhancedType> getAbbreviatedDialingEnhanced() {
        if (abbreviatedDialingEnhanced == null) {
            abbreviatedDialingEnhanced = new ArrayList<AbbreviatedDialingEnhancedType>();
        }
        return this.abbreviatedDialingEnhanced;
    }

    /**
     * Gets the value of the abbreviatedDialingGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the abbreviatedDialingGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAbbreviatedDialingGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbbreviatedDialingGroupType }
     * 
     * 
     */
    public List<AbbreviatedDialingGroupType> getAbbreviatedDialingGroup() {
        if (abbreviatedDialingGroup == null) {
            abbreviatedDialingGroup = new ArrayList<AbbreviatedDialingGroupType>();
        }
        return this.abbreviatedDialingGroup;
    }

    /**
     * Gets the value of the abbreviatedDialingPersonal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the abbreviatedDialingPersonal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAbbreviatedDialingPersonal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbbreviatedDialingPersonalType }
     * 
     * 
     */
    public List<AbbreviatedDialingPersonalType> getAbbreviatedDialingPersonal() {
        if (abbreviatedDialingPersonal == null) {
            abbreviatedDialingPersonal = new ArrayList<AbbreviatedDialingPersonalType>();
        }
        return this.abbreviatedDialingPersonal;
    }

    /**
     * Gets the value of the abbreviatedDialingSystem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the abbreviatedDialingSystem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAbbreviatedDialingSystem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbbreviatedDialingSystemType }
     * 
     * 
     */
    public List<AbbreviatedDialingSystemType> getAbbreviatedDialingSystem() {
        if (abbreviatedDialingSystem == null) {
            abbreviatedDialingSystem = new ArrayList<AbbreviatedDialingSystemType>();
        }
        return this.abbreviatedDialingSystem;
    }

    /**
     * Gets the value of the agent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the agent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAgent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgentType }
     * 
     * 
     */
    public List<AgentType> getAgent() {
        if (agent == null) {
            agent = new ArrayList<AgentType>();
        }
        return this.agent;
    }

    /**
     * Gets the value of the aliasStation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aliasStation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAliasStation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AliasStationType }
     * 
     * 
     */
    public List<AliasStationType> getAliasStation() {
        if (aliasStation == null) {
            aliasStation = new ArrayList<AliasStationType>();
        }
        return this.aliasStation;
    }

    /**
     * Gets the value of the amw property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the amw property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAmw().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmwType }
     * 
     * 
     */
    public List<AmwType> getAmw() {
        if (amw == null) {
            amw = new ArrayList<AmwType>();
        }
        return this.amw;
    }

    /**
     * Gets the value of the announcement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the announcement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnnouncement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AnnouncementType }
     * 
     * 
     */
    public List<AnnouncementType> getAnnouncement() {
        if (announcement == null) {
            announcement = new ArrayList<AnnouncementType>();
        }
        return this.announcement;
    }

    /**
     * Gets the value of the audioGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the audioGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAudioGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AudioGroupType }
     * 
     * 
     */
    public List<AudioGroupType> getAudioGroup() {
        if (audioGroup == null) {
            audioGroup = new ArrayList<AudioGroupType>();
        }
        return this.audioGroup;
    }

    /**
     * Gets the value of the audixNodeNames property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the audixNodeNames property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAudixNodeNames().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AudixNodeNamesType }
     * 
     * 
     */
    public List<AudixNodeNamesType> getAudixNodeNames() {
        if (audixNodeNames == null) {
            audixNodeNames = new ArrayList<AudixNodeNamesType>();
        }
        return this.audixNodeNames;
    }

    /**
     * Gets the value of the authorizationCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the authorizationCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthorizationCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AuthorizationCodeType }
     * 
     * 
     */
    public List<AuthorizationCodeType> getAuthorizationCode() {
        if (authorizationCode == null) {
            authorizationCode = new ArrayList<AuthorizationCodeType>();
        }
        return this.authorizationCode;
    }

    /**
     * Gets the value of the bcmsAgentReport property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bcmsAgentReport property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBCMSAgentReport().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BCMSAgentReportType }
     * 
     * 
     */
    public List<BCMSAgentReportType> getBCMSAgentReport() {
        if (bcmsAgentReport == null) {
            bcmsAgentReport = new ArrayList<BCMSAgentReportType>();
        }
        return this.bcmsAgentReport;
    }

    /**
     * Gets the value of the bcmsSkillReport property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bcmsSkillReport property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBCMSSkillReport().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BCMSSkillReportType }
     * 
     * 
     */
    public List<BCMSSkillReportType> getBCMSSkillReport() {
        if (bcmsSkillReport == null) {
            bcmsSkillReport = new ArrayList<BCMSSkillReportType>();
        }
        return this.bcmsSkillReport;
    }

    /**
     * Gets the value of the bcmsTrunkReport property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bcmsTrunkReport property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBCMSTrunkReport().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BCMSTrunkReportType }
     * 
     * 
     */
    public List<BCMSTrunkReportType> getBCMSTrunkReport() {
        if (bcmsTrunkReport == null) {
            bcmsTrunkReport = new ArrayList<BCMSTrunkReportType>();
        }
        return this.bcmsTrunkReport;
    }

    /**
     * Gets the value of the bcmsvdnReport property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bcmsvdnReport property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBCMSVDNReport().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BCMSVDNReportType }
     * 
     * 
     */
    public List<BCMSVDNReportType> getBCMSVDNReport() {
        if (bcmsvdnReport == null) {
            bcmsvdnReport = new ArrayList<BCMSVDNReportType>();
        }
        return this.bcmsvdnReport;
    }

    /**
     * Gets the value of the bestServiceRouting property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bestServiceRouting property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBestServiceRouting().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BestServiceRoutingType }
     * 
     * 
     */
    public List<BestServiceRoutingType> getBestServiceRouting() {
        if (bestServiceRouting == null) {
            bestServiceRouting = new ArrayList<BestServiceRoutingType>();
        }
        return this.bestServiceRouting;
    }

    /**
     * Gets the value of the board property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the board property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBoard().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BoardType }
     * 
     * 
     */
    public List<BoardType> getBoard() {
        if (board == null) {
            board = new ArrayList<BoardType>();
        }
        return this.board;
    }

    /**
     * Gets the value of the camaNumbering property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the camaNumbering property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCAMANumbering().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CAMANumberingType }
     * 
     * 
     */
    public List<CAMANumberingType> getCAMANumbering() {
        if (camaNumbering == null) {
            camaNumbering = new ArrayList<CAMANumberingType>();
        }
        return this.camaNumbering;
    }

    /**
     * Gets the value of the cor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCOR().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CORType }
     * 
     * 
     */
    public List<CORType> getCOR() {
        if (cor == null) {
            cor = new ArrayList<CORType>();
        }
        return this.cor;
    }

    /**
     * Gets the value of the cos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCOS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COSType }
     * 
     * 
     */
    public List<COSType> getCOS() {
        if (cos == null) {
            cos = new ArrayList<COSType>();
        }
        return this.cos;
    }

    /**
     * Gets the value of the ctiLink property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ctiLink property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCTILink().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTILinkType }
     * 
     * 
     */
    public List<CTILinkType> getCTILink() {
        if (ctiLink == null) {
            ctiLink = new ArrayList<CTILinkType>();
        }
        return this.ctiLink;
    }

    /**
     * Gets the value of the cabinet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cabinet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCabinet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CabinetType }
     * 
     * 
     */
    public List<CabinetType> getCabinet() {
        if (cabinet == null) {
            cabinet = new ArrayList<CabinetType>();
        }
        return this.cabinet;
    }

    /**
     * Gets the value of the capacity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the capacity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCapacity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CapacityType }
     * 
     * 
     */
    public List<CapacityType> getCapacity() {
        if (capacity == null) {
            capacity = new ArrayList<CapacityType>();
        }
        return this.capacity;
    }

    /**
     * Gets the value of the configuration property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the configuration property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConfiguration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConfigurationType }
     * 
     * 
     */
    public List<ConfigurationType> getConfiguration() {
        if (configuration == null) {
            configuration = new ArrayList<ConfigurationType>();
        }
        return this.configuration;
    }

    /**
     * Gets the value of the coverageAnswerGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coverageAnswerGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCoverageAnswerGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CoverageAnswerGroupType }
     * 
     * 
     */
    public List<CoverageAnswerGroupType> getCoverageAnswerGroup() {
        if (coverageAnswerGroup == null) {
            coverageAnswerGroup = new ArrayList<CoverageAnswerGroupType>();
        }
        return this.coverageAnswerGroup;
    }

    /**
     * Gets the value of the coveragePath property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coveragePath property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCoveragePath().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CoveragePathType }
     * 
     * 
     */
    public List<CoveragePathType> getCoveragePath() {
        if (coveragePath == null) {
            coveragePath = new ArrayList<CoveragePathType>();
        }
        return this.coveragePath;
    }

    /**
     * Gets the value of the coverageRemote property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coverageRemote property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCoverageRemote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CoverageRemoteType }
     * 
     * 
     */
    public List<CoverageRemoteType> getCoverageRemote() {
        if (coverageRemote == null) {
            coverageRemote = new ArrayList<CoverageRemoteType>();
        }
        return this.coverageRemote;
    }

    /**
     * Gets the value of the coverageTimeOfDay property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coverageTimeOfDay property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCoverageTimeOfDay().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CoverageTimeOfDayType }
     * 
     * 
     */
    public List<CoverageTimeOfDayType> getCoverageTimeOfDay() {
        if (coverageTimeOfDay == null) {
            coverageTimeOfDay = new ArrayList<CoverageTimeOfDayType>();
        }
        return this.coverageTimeOfDay;
    }

    /**
     * Gets the value of the customerOptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customerOptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomerOptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerOptionsType }
     * 
     * 
     */
    public List<CustomerOptionsType> getCustomerOptions() {
        if (customerOptions == null) {
            customerOptions = new ArrayList<CustomerOptionsType>();
        }
        return this.customerOptions;
    }

    /**
     * Gets the value of the dataModule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataModule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataModule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataModuleType }
     * 
     * 
     */
    public List<DataModuleType> getDataModule() {
        if (dataModule == null) {
            dataModule = new ArrayList<DataModuleType>();
        }
        return this.dataModule;
    }

    /**
     * Gets the value of the defaultRegion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the defaultRegion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDefaultRegion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DefaultRegionType }
     * 
     * 
     */
    public List<DefaultRegionType> getDefaultRegion() {
        if (defaultRegion == null) {
            defaultRegion = new ArrayList<DefaultRegionType>();
        }
        return this.defaultRegion;
    }

    /**
     * Gets the value of the dialPlan property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dialPlan property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDialPlan().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DialPlanType }
     * 
     * 
     */
    public List<DialPlanType> getDialPlan() {
        if (dialPlan == null) {
            dialPlan = new ArrayList<DialPlanType>();
        }
        return this.dialPlan;
    }

    /**
     * Gets the value of the dialPlanParameters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dialPlanParameters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDialPlanParameters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DialPlanParametersType }
     * 
     * 
     */
    public List<DialPlanParametersType> getDialPlanParameters() {
        if (dialPlanParameters == null) {
            dialPlanParameters = new ArrayList<DialPlanParametersType>();
        }
        return this.dialPlanParameters;
    }

    /**
     * Gets the value of the displayParameters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the displayParameters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDisplayParameters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DisplayParametersType }
     * 
     * 
     */
    public List<DisplayParametersType> getDisplayParameters() {
        if (displayParameters == null) {
            displayParameters = new ArrayList<DisplayParametersType>();
        }
        return this.displayParameters;
    }

    /**
     * Gets the value of the ecdControlledSkills property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ecdControlledSkills property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEcdControlledSkills().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EcdControlledSkillsType }
     * 
     * 
     */
    public List<EcdControlledSkillsType> getEcdControlledSkills() {
        if (ecdControlledSkills == null) {
            ecdControlledSkills = new ArrayList<EcdControlledSkillsType>();
        }
        return this.ecdControlledSkills;
    }

    /**
     * Gets the value of the extendedPickUpGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extendedPickUpGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtendedPickUpGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtendedPickUpGroupType }
     * 
     * 
     */
    public List<ExtendedPickUpGroupType> getExtendedPickUpGroup() {
        if (extendedPickUpGroup == null) {
            extendedPickUpGroup = new ArrayList<ExtendedPickUpGroupType>();
        }
        return this.extendedPickUpGroup;
    }

    /**
     * Gets the value of the extensionStation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extensionStation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtensionStation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtensionStationType }
     * 
     * 
     */
    public List<ExtensionStationType> getExtensionStation() {
        if (extensionStation == null) {
            extensionStation = new ArrayList<ExtensionStationType>();
        }
        return this.extensionStation;
    }

    /**
     * Gets the value of the extensionType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extensionType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtensionType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtensionTypeType }
     * 
     * 
     */
    public List<ExtensionTypeType> getExtensionType() {
        if (extensionType == null) {
            extensionType = new ArrayList<ExtensionTypeType>();
        }
        return this.extensionType;
    }

    /**
     * Gets the value of the featureAccessCodes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the featureAccessCodes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeatureAccessCodes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeatureAccessCodesType }
     * 
     * 
     */
    public List<FeatureAccessCodesType> getFeatureAccessCodes() {
        if (featureAccessCodes == null) {
            featureAccessCodes = new ArrayList<FeatureAccessCodesType>();
        }
        return this.featureAccessCodes;
    }

    /**
     * Gets the value of the fileTransfer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fileTransfer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFileTransfer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FileTransferType }
     * 
     * 
     */
    public List<FileTransferType> getFileTransfer() {
        if (fileTransfer == null) {
            fileTransfer = new ArrayList<FileTransferType>();
        }
        return this.fileTransfer;
    }

    /**
     * Gets the value of the holidayTable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the holidayTable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHolidayTable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HolidayTableType }
     * 
     * 
     */
    public List<HolidayTableType> getHolidayTable() {
        if (holidayTable == null) {
            holidayTable = new ArrayList<HolidayTableType>();
        }
        return this.holidayTable;
    }

    /**
     * Gets the value of the huntGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the huntGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHuntGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HuntGroupType }
     * 
     * 
     */
    public List<HuntGroupType> getHuntGroup() {
        if (huntGroup == null) {
            huntGroup = new ArrayList<HuntGroupType>();
        }
        return this.huntGroup;
    }

    /**
     * Gets the value of the ipAddressUsage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ipAddressUsage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIPAddressUsage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IPAddressUsageType }
     * 
     * 
     */
    public List<IPAddressUsageType> getIPAddressUsage() {
        if (ipAddressUsage == null) {
            ipAddressUsage = new ArrayList<IPAddressUsageType>();
        }
        return this.ipAddressUsage;
    }

    /**
     * Gets the value of the ipCodec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ipCodec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIPCodec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IPCodecType }
     * 
     * 
     */
    public List<IPCodecType> getIPCodec() {
        if (ipCodec == null) {
            ipCodec = new ArrayList<IPCodecType>();
        }
        return this.ipCodec;
    }

    /**
     * Gets the value of the ipHoteling property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ipHoteling property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIPHoteling().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IPHotelingType }
     * 
     * 
     */
    public List<IPHotelingType> getIPHoteling() {
        if (ipHoteling == null) {
            ipHoteling = new ArrayList<IPHotelingType>();
        }
        return this.ipHoteling;
    }

    /**
     * Gets the value of the ipInterface property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ipInterface property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIPInterface().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IPInterfaceType }
     * 
     * 
     */
    public List<IPInterfaceType> getIPInterface() {
        if (ipInterface == null) {
            ipInterface = new ArrayList<IPInterfaceType>();
        }
        return this.ipInterface;
    }

    /**
     * Gets the value of the ipNetworkMap property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ipNetworkMap property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIPNetworkMap().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IPNetworkMapType }
     * 
     * 
     */
    public List<IPNetworkMapType> getIPNetworkMap() {
        if (ipNetworkMap == null) {
            ipNetworkMap = new ArrayList<IPNetworkMapType>();
        }
        return this.ipNetworkMap;
    }

    /**
     * Gets the value of the ipNetworkRegion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ipNetworkRegion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIPNetworkRegion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IPNetworkRegionType }
     * 
     * 
     */
    public List<IPNetworkRegionType> getIPNetworkRegion() {
        if (ipNetworkRegion == null) {
            ipNetworkRegion = new ArrayList<IPNetworkRegionType>();
        }
        return this.ipNetworkRegion;
    }

    /**
     * Gets the value of the ipNetworkRegionStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ipNetworkRegionStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIPNetworkRegionStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IPNetworkRegionStatusType }
     * 
     * 
     */
    public List<IPNetworkRegionStatusType> getIPNetworkRegionStatus() {
        if (ipNetworkRegionStatus == null) {
            ipNetworkRegionStatus = new ArrayList<IPNetworkRegionStatusType>();
        }
        return this.ipNetworkRegionStatus;
    }

    /**
     * Gets the value of the ipNodeNames property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ipNodeNames property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIPNodeNames().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IPNodeNamesType }
     * 
     * 
     */
    public List<IPNodeNamesType> getIPNodeNames() {
        if (ipNodeNames == null) {
            ipNodeNames = new ArrayList<IPNodeNamesType>();
        }
        return this.ipNodeNames;
    }

    /**
     * Gets the value of the ipOptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ipOptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIPOptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IPOptionsType }
     * 
     * 
     */
    public List<IPOptionsType> getIPOptions() {
        if (ipOptions == null) {
            ipOptions = new ArrayList<IPOptionsType>();
        }
        return this.ipOptions;
    }

    /**
     * Gets the value of the ipRegTTI property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ipRegTTI property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIPRegTTI().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IPRegTTIType }
     * 
     * 
     */
    public List<IPRegTTIType> getIPRegTTI() {
        if (ipRegTTI == null) {
            ipRegTTI = new ArrayList<IPRegTTIType>();
        }
        return this.ipRegTTI;
    }

    /**
     * Gets the value of the ipRegistration property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ipRegistration property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIPRegistration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IPRegistrationType }
     * 
     * 
     */
    public List<IPRegistrationType> getIPRegistration() {
        if (ipRegistration == null) {
            ipRegistration = new ArrayList<IPRegistrationType>();
        }
        return this.ipRegistration;
    }

    /**
     * Gets the value of the ipServerInterface property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ipServerInterface property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIPServerInterface().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IPServerInterfaceType }
     * 
     * 
     */
    public List<IPServerInterfaceType> getIPServerInterface() {
        if (ipServerInterface == null) {
            ipServerInterface = new ArrayList<IPServerInterfaceType>();
        }
        return this.ipServerInterface;
    }

    /**
     * Gets the value of the ipServices property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ipServices property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIPServices().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IPServicesType }
     * 
     * 
     */
    public List<IPServicesType> getIPServices() {
        if (ipServices == null) {
            ipServices = new ArrayList<IPServicesType>();
        }
        return this.ipServices;
    }

    /**
     * Gets the value of the ipStations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ipStations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIPStations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IPStationsType }
     * 
     * 
     */
    public List<IPStationsType> getIPStations() {
        if (ipStations == null) {
            ipStations = new ArrayList<IPStationsType>();
        }
        return this.ipStations;
    }

    /**
     * Gets the value of the ipStations5 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ipStations5 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIPStations5().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IPStations5Type }
     * 
     * 
     */
    public List<IPStations5Type> getIPStations5() {
        if (ipStations5 == null) {
            ipStations5 = new ArrayList<IPStations5Type>();
        }
        return this.ipStations5;
    }

    /**
     * Gets the value of the ipStations6 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ipStations6 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIPStations6().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IPStations6Type }
     * 
     * 
     */
    public List<IPStations6Type> getIPStations6() {
        if (ipStations6 == null) {
            ipStations6 = new ArrayList<IPStations6Type>();
        }
        return this.ipStations6;
    }

    /**
     * Gets the value of the incomingCallHandling property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the incomingCallHandling property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncomingCallHandling().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IncomingCallHandlingType }
     * 
     * 
     */
    public List<IncomingCallHandlingType> getIncomingCallHandling() {
        if (incomingCallHandling == null) {
            incomingCallHandling = new ArrayList<IncomingCallHandlingType>();
        }
        return this.incomingCallHandling;
    }

    /**
     * Gets the value of the intercomGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the intercomGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntercomGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IntercomGroupType }
     * 
     * 
     */
    public List<IntercomGroupType> getIntercomGroup() {
        if (intercomGroup == null) {
            intercomGroup = new ArrayList<IntercomGroupType>();
        }
        return this.intercomGroup;
    }

    /**
     * Gets the value of the listExtensionType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listExtensionType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListExtensionType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListExtensionTypeType }
     * 
     * 
     */
    public List<ListExtensionTypeType> getListExtensionType() {
        if (listExtensionType == null) {
            listExtensionType = new ArrayList<ListExtensionTypeType>();
        }
        return this.listExtensionType;
    }

    /**
     * Gets the value of the listHistory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listHistory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListHistory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListHistoryType }
     * 
     * 
     */
    public List<ListHistoryType> getListHistory() {
        if (listHistory == null) {
            listHistory = new ArrayList<ListHistoryType>();
        }
        return this.listHistory;
    }

    /**
     * Gets the value of the listIPInterface property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listIPInterface property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListIPInterface().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListIPInterfaceType }
     * 
     * 
     */
    public List<ListIPInterfaceType> getListIPInterface() {
        if (listIPInterface == null) {
            listIPInterface = new ArrayList<ListIPInterfaceType>();
        }
        return this.listIPInterface;
    }

    /**
     * Gets the value of the listIPNetworkRegionMonitor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listIPNetworkRegionMonitor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListIPNetworkRegionMonitor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListIPNetworkRegionMonitorType }
     * 
     * 
     */
    public List<ListIPNetworkRegionMonitorType> getListIPNetworkRegionMonitor() {
        if (listIPNetworkRegionMonitor == null) {
            listIPNetworkRegionMonitor = new ArrayList<ListIPNetworkRegionMonitorType>();
        }
        return this.listIPNetworkRegionMonitor;
    }

    /**
     * Gets the value of the listNodeNames property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listNodeNames property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListNodeNames().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListNodeNamesType }
     * 
     * 
     */
    public List<ListNodeNamesType> getListNodeNames() {
        if (listNodeNames == null) {
            listNodeNames = new ArrayList<ListNodeNamesType>();
        }
        return this.listNodeNames;
    }

    /**
     * Gets the value of the listSurvivable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listSurvivable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListSurvivable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListSurvivableType }
     * 
     * 
     */
    public List<ListSurvivableType> getListSurvivable() {
        if (listSurvivable == null) {
            listSurvivable = new ArrayList<ListSurvivableType>();
        }
        return this.listSurvivable;
    }

    /**
     * Gets the value of the listTTIRegistration property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listTTIRegistration property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListTTIRegistration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListTTIRegistrationType }
     * 
     * 
     */
    public List<ListTTIRegistrationType> getListTTIRegistration() {
        if (listTTIRegistration == null) {
            listTTIRegistration = new ArrayList<ListTTIRegistrationType>();
        }
        return this.listTTIRegistration;
    }

    /**
     * Gets the value of the listUsageExtension property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listUsageExtension property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListUsageExtension().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListUsageExtensionType }
     * 
     * 
     */
    public List<ListUsageExtensionType> getListUsageExtension() {
        if (listUsageExtension == null) {
            listUsageExtension = new ArrayList<ListUsageExtensionType>();
        }
        return this.listUsageExtension;
    }

    /**
     * Gets the value of the locations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocationsType }
     * 
     * 
     */
    public List<LocationsType> getLocations() {
        if (locations == null) {
            locations = new ArrayList<LocationsType>();
        }
        return this.locations;
    }

    /**
     * Gets the value of the logins property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the logins property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLogins().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoginsType }
     * 
     * 
     */
    public List<LoginsType> getLogins() {
        if (logins == null) {
            logins = new ArrayList<LoginsType>();
        }
        return this.logins;
    }

    /**
     * Gets the value of the mohGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mohGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMOHGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MOHGroupType }
     * 
     * 
     */
    public List<MOHGroupType> getMOHGroup() {
        if (mohGroup == null) {
            mohGroup = new ArrayList<MOHGroupType>();
        }
        return this.mohGroup;
    }

    /**
     * Gets the value of the mediaGateway property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mediaGateway property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMediaGateway().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MediaGatewayType }
     * 
     * 
     */
    public List<MediaGatewayType> getMediaGateway() {
        if (mediaGateway == null) {
            mediaGateway = new ArrayList<MediaGatewayType>();
        }
        return this.mediaGateway;
    }

    /**
     * Gets the value of the offPbxFeatureNameExtensions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the offPbxFeatureNameExtensions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOffPbxFeatureNameExtensions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OffPbxFeatureNameExtensionsType }
     * 
     * 
     */
    public List<OffPbxFeatureNameExtensionsType> getOffPbxFeatureNameExtensions() {
        if (offPbxFeatureNameExtensions == null) {
            offPbxFeatureNameExtensions = new ArrayList<OffPbxFeatureNameExtensionsType>();
        }
        return this.offPbxFeatureNameExtensions;
    }

    /**
     * Gets the value of the offPbxStationMapping property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the offPbxStationMapping property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOffPbxStationMapping().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OffPbxStationMappingType }
     * 
     * 
     */
    public List<OffPbxStationMappingType> getOffPbxStationMapping() {
        if (offPbxStationMapping == null) {
            offPbxStationMapping = new ArrayList<OffPbxStationMappingType>();
        }
        return this.offPbxStationMapping;
    }

    /**
     * Gets the value of the personalCOLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personalCOLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonalCOLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonalCOLineType }
     * 
     * 
     */
    public List<PersonalCOLineType> getPersonalCOLine() {
        if (personalCOLine == null) {
            personalCOLine = new ArrayList<PersonalCOLineType>();
        }
        return this.personalCOLine;
    }

    /**
     * Gets the value of the pickUpGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pickUpGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPickUpGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PickUpGroupType }
     * 
     * 
     */
    public List<PickUpGroupType> getPickUpGroup() {
        if (pickUpGroup == null) {
            pickUpGroup = new ArrayList<PickUpGroupType>();
        }
        return this.pickUpGroup;
    }

    /**
     * Gets the value of the port property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the port property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPort().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PortType }
     * 
     * 
     */
    public List<PortType> getPort() {
        if (port == null) {
            port = new ArrayList<PortType>();
        }
        return this.port;
    }

    /**
     * Gets the value of the processorIPInterface property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the processorIPInterface property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProcessorIPInterface().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProcessorIPInterfaceType }
     * 
     * 
     */
    public List<ProcessorIPInterfaceType> getProcessorIPInterface() {
        if (processorIPInterface == null) {
            processorIPInterface = new ArrayList<ProcessorIPInterfaceType>();
        }
        return this.processorIPInterface;
    }

    /**
     * Gets the value of the publicUnknownNumbering property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the publicUnknownNumbering property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPublicUnknownNumbering().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PublicUnknownNumberingType }
     * 
     * 
     */
    public List<PublicUnknownNumberingType> getPublicUnknownNumbering() {
        if (publicUnknownNumbering == null) {
            publicUnknownNumbering = new ArrayList<PublicUnknownNumberingType>();
        }
        return this.publicUnknownNumbering;
    }

    /**
     * Gets the value of the rhnpa property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rhnpa property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRHNPA().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RHNPAType }
     * 
     * 
     */
    public List<RHNPAType> getRHNPA() {
        if (rhnpa == null) {
            rhnpa = new ArrayList<RHNPAType>();
        }
        return this.rhnpa;
    }

    /**
     * Gets the value of the reasonCodeNames property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reasonCodeNames property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReasonCodeNames().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReasonCodeNamesType }
     * 
     * 
     */
    public List<ReasonCodeNamesType> getReasonCodeNames() {
        if (reasonCodeNames == null) {
            reasonCodeNames = new ArrayList<ReasonCodeNamesType>();
        }
        return this.reasonCodeNames;
    }

    /**
     * Gets the value of the registeredIPStations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the registeredIPStations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegisteredIPStations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegisteredIPStationsType }
     * 
     * 
     */
    public List<RegisteredIPStationsType> getRegisteredIPStations() {
        if (registeredIPStations == null) {
            registeredIPStations = new ArrayList<RegisteredIPStationsType>();
        }
        return this.registeredIPStations;
    }

    /**
     * Gets the value of the remoteAccess property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the remoteAccess property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemoteAccess().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RemoteAccessType }
     * 
     * 
     */
    public List<RemoteAccessType> getRemoteAccess() {
        if (remoteAccess == null) {
            remoteAccess = new ArrayList<RemoteAccessType>();
        }
        return this.remoteAccess;
    }

    /**
     * Gets the value of the routePattern property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the routePattern property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoutePattern().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RoutePatternType }
     * 
     * 
     */
    public List<RoutePatternType> getRoutePattern() {
        if (routePattern == null) {
            routePattern = new ArrayList<RoutePatternType>();
        }
        return this.routePattern;
    }

    /**
     * Gets the value of the serviceHoursTable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceHoursTable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceHoursTable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceHoursTableType }
     * 
     * 
     */
    public List<ServiceHoursTableType> getServiceHoursTable() {
        if (serviceHoursTable == null) {
            serviceHoursTable = new ArrayList<ServiceHoursTableType>();
        }
        return this.serviceHoursTable;
    }

    /**
     * Gets the value of the signalingGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the signalingGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSignalingGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SignalingGroupType }
     * 
     * 
     */
    public List<SignalingGroupType> getSignalingGroup() {
        if (signalingGroup == null) {
            signalingGroup = new ArrayList<SignalingGroupType>();
        }
        return this.signalingGroup;
    }

    /**
     * Gets the value of the siteData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the siteData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSiteData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SiteDataType }
     * 
     * 
     */
    public List<SiteDataType> getSiteData() {
        if (siteData == null) {
            siteData = new ArrayList<SiteDataType>();
        }
        return this.siteData;
    }

    /**
     * Gets the value of the softwareVersion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the softwareVersion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSoftwareVersion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SoftwareVersionType }
     * 
     * 
     */
    public List<SoftwareVersionType> getSoftwareVersion() {
        if (softwareVersion == null) {
            softwareVersion = new ArrayList<SoftwareVersionType>();
        }
        return this.softwareVersion;
    }

    /**
     * Gets the value of the specialApplications property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialApplications property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialApplications().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecialApplicationsType }
     * 
     * 
     */
    public List<SpecialApplicationsType> getSpecialApplications() {
        if (specialApplications == null) {
            specialApplications = new ArrayList<SpecialApplicationsType>();
        }
        return this.specialApplications;
    }

    /**
     * Gets the value of the station property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the station property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StationType }
     * 
     * 
     */
    public List<StationType> getStation() {
        if (station == null) {
            station = new ArrayList<StationType>();
        }
        return this.station;
    }

    /**
     * Gets the value of the stationStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stationStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStationStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StationStatusType }
     * 
     * 
     */
    public List<StationStatusType> getStationStatus() {
        if (stationStatus == null) {
            stationStatus = new ArrayList<StationStatusType>();
        }
        return this.stationStatus;
    }

    /**
     * Gets the value of the system property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the system property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSystem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SystemType }
     * 
     * 
     */
    public List<SystemType> getSystem() {
        if (system == null) {
            system = new ArrayList<SystemType>();
        }
        return this.system;
    }

    /**
     * Gets the value of the systemFeatures property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the systemFeatures property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSystemFeatures().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SystemFeaturesType }
     * 
     * 
     */
    public List<SystemFeaturesType> getSystemFeatures() {
        if (systemFeatures == null) {
            systemFeatures = new ArrayList<SystemFeaturesType>();
        }
        return this.systemFeatures;
    }

    /**
     * Gets the value of the systemParameters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the systemParameters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSystemParameters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SystemParametersType }
     * 
     * 
     */
    public List<SystemParametersType> getSystemParameters() {
        if (systemParameters == null) {
            systemParameters = new ArrayList<SystemParametersType>();
        }
        return this.systemParameters;
    }

    /**
     * Gets the value of the systemParametersCustomer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the systemParametersCustomer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSystemParametersCustomer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SystemParametersCustomerType }
     * 
     * 
     */
    public List<SystemParametersCustomerType> getSystemParametersCustomer() {
        if (systemParametersCustomer == null) {
            systemParametersCustomer = new ArrayList<SystemParametersCustomerType>();
        }
        return this.systemParametersCustomer;
    }

    /**
     * Gets the value of the systemParametersFeatures property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the systemParametersFeatures property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSystemParametersFeatures().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SystemParametersFeaturesType }
     * 
     * 
     */
    public List<SystemParametersFeaturesType> getSystemParametersFeatures() {
        if (systemParametersFeatures == null) {
            systemParametersFeatures = new ArrayList<SystemParametersFeaturesType>();
        }
        return this.systemParametersFeatures;
    }

    /**
     * Gets the value of the systemParametersSpecial property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the systemParametersSpecial property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSystemParametersSpecial().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SystemParametersSpecialType }
     * 
     * 
     */
    public List<SystemParametersSpecialType> getSystemParametersSpecial() {
        if (systemParametersSpecial == null) {
            systemParametersSpecial = new ArrayList<SystemParametersSpecialType>();
        }
        return this.systemParametersSpecial;
    }

    /**
     * Gets the value of the systemSecurity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the systemSecurity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSystemSecurity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SystemSecurityType }
     * 
     * 
     */
    public List<SystemSecurityType> getSystemSecurity() {
        if (systemSecurity == null) {
            systemSecurity = new ArrayList<SystemSecurityType>();
        }
        return this.systemSecurity;
    }

    /**
     * Gets the value of the tenant property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tenant property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTenant().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TenantType }
     * 
     * 
     */
    public List<TenantType> getTenant() {
        if (tenant == null) {
            tenant = new ArrayList<TenantType>();
        }
        return this.tenant;
    }

    /**
     * Gets the value of the terminatingExtensionGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the terminatingExtensionGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTerminatingExtensionGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TerminatingExtensionGroupType }
     * 
     * 
     */
    public List<TerminatingExtensionGroupType> getTerminatingExtensionGroup() {
        if (terminatingExtensionGroup == null) {
            terminatingExtensionGroup = new ArrayList<TerminatingExtensionGroupType>();
        }
        return this.terminatingExtensionGroup;
    }

    /**
     * Gets the value of the tollAnalysis property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tollAnalysis property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTollAnalysis().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TollAnalysisType }
     * 
     * 
     */
    public List<TollAnalysisType> getTollAnalysis() {
        if (tollAnalysis == null) {
            tollAnalysis = new ArrayList<TollAnalysisType>();
        }
        return this.tollAnalysis;
    }

    /**
     * Gets the value of the translation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the translation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTranslation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TranslationType }
     * 
     * 
     */
    public List<TranslationType> getTranslation() {
        if (translation == null) {
            translation = new ArrayList<TranslationType>();
        }
        return this.translation;
    }

    /**
     * Gets the value of the trunkGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trunkGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrunkGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrunkGroupType }
     * 
     * 
     */
    public List<TrunkGroupType> getTrunkGroup() {
        if (trunkGroup == null) {
            trunkGroup = new ArrayList<TrunkGroupType>();
        }
        return this.trunkGroup;
    }

    /**
     * Gets the value of the trunkStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trunkStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrunkStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrunkStatusType }
     * 
     * 
     */
    public List<TrunkStatusType> getTrunkStatus() {
        if (trunkStatus == null) {
            trunkStatus = new ArrayList<TrunkStatusType>();
        }
        return this.trunkStatus;
    }

    /**
     * Gets the value of the uniformDialplan property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uniformDialplan property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUniformDialplan().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UniformDialplanType }
     * 
     * 
     */
    public List<UniformDialplanType> getUniformDialplan() {
        if (uniformDialplan == null) {
            uniformDialplan = new ArrayList<UniformDialplanType>();
        }
        return this.uniformDialplan;
    }

    /**
     * Gets the value of the vdn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vdn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVDN().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VDNType }
     * 
     * 
     */
    public List<VDNType> getVDN() {
        if (vdn == null) {
            vdn = new ArrayList<VDNType>();
        }
        return this.vdn;
    }

    /**
     * Gets the value of the vrt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vrt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVRT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VRTType }
     * 
     * 
     */
    public List<VRTType> getVRT() {
        if (vrt == null) {
            vrt = new ArrayList<VRTType>();
        }
        return this.vrt;
    }

    /**
     * Gets the value of the vector property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vector property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVector().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VectorType }
     * 
     * 
     */
    public List<VectorType> getVector() {
        if (vector == null) {
            vector = new ArrayList<VectorType>();
        }
        return this.vector;
    }

    /**
     * Gets the value of the vectorVariables property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vectorVariables property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVectorVariables().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VectorVariablesType }
     * 
     * 
     */
    public List<VectorVariablesType> getVectorVariables() {
        if (vectorVariables == null) {
            vectorVariables = new ArrayList<VectorVariablesType>();
        }
        return this.vectorVariables;
    }

    /**
     * Gets the value of the witnessStation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the witnessStation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWitnessStation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WitnessStationType }
     * 
     * 
     */
    public List<WitnessStationType> getWitnessStation() {
        if (witnessStation == null) {
            witnessStation = new ArrayList<WitnessStationType>();
        }
        return this.witnessStation;
    }

}
