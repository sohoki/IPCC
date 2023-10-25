
package com.system.ipcc.pbx.avaya.smsxml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SystemParametersFeaturesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SystemParametersFeaturesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SelfStaDispEnable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AutCirAssurEnable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WithoutFlash" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RecDelayTimerMsec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ApyRdyInTnPrtCall" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IntApyPerAltTnSec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RequireSecCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SeNISDNTkGpNmCnNm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DisConNaNmISDNDCS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SeISDNTkGrNmeTndm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SeCusMsgQSIG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QSIGTSCExtension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AbrDilPrgrmAsList" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MWINoDigitsVMSubs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FeaturePlusExt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NationalCPNPrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PassPrfxCPNASAI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unknNumItrnlAUDIX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="USNICallNaOutgCal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PthRplacMeasrment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QSIGPthRplacExt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PthRplacQueVector" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AtoAbrDelTranIntR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CpnAniIclidRepRes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CpnAniIclidRepUna" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LocalCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IntrnlAccessCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EnEnblcDlWoARSFAC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PullTransfer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutplsWithoutTone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MisOperatnAlert" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AllowConfviaFlash" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VecDisconTimrMins" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProCallerIDAnaTer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HearZpTnFollowVOA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UpdtTransRingPtrn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WaitAnswSuprTimer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RepeCallWaitingTn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IntrTrtFailedTrTr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StaToneForDisconn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LevToneDetection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ChgDispUpdtFrqSec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateFormatOnTerminals" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OnHookDialingTerminals" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DisCallNoRRCalIDC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ItalanProtEnabled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EASEnabled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MinAgtLogIDPwdLen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DirectAgentAnnExt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MsgWtLmpIndStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConFirstDataDelay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConvSignalToneMs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PromptTimeoutsecs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InterflwqposEWTTh" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RevStrPndDgtColSt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MaxMsgsPerStation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AvailbleAgtAdjBSR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SecondDataDelay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PauseMsec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SerObsWarningTone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CalClsAfterAsrSup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SendUCIDtoASAI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MIAAcrsSplitSkill" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACWAgtsCnsdrdIdle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CallSlectnMeasure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServLvlSprClSelOv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MaxExCallLogStati" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AutoReserveAgents" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CpyASAIUUIConfTra" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AuxWrkRsnCodeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LogoutRsnCodeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdjunctCMSRelease" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACDLgnIdentiLgth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BCMSVuStatLgnIDs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BCMSVuStatMsrtInt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BCMSVuStatAbClTrS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VdBCMSVuStatLgnID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MsgWaitIndExtCall" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClrVuStatsSftData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RemIaBCMSVuStatAg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SwHkQryRepnsTimeo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AutanrIPFailAxReC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MaxAgtOccupPercen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MaxAgtOccupAuxReC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AutoExclusionCOS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AutoExclnCovrHold" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AutoExclnWhispPag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RecallRotaryDigit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DrnCallTmrDispSec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DirIpIpAudioConne" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IPAudioHairpinnig" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Retry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="T2BckSigActnTirSe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProbtBrdgCalDtaPr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EnhAbrDialLen34" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RecSubFailHisLog" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RecPMSADTraHisLog" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RecIPRegHisLog" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DefMulOutTrParSel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TTIEnabled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TTIState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TTISecurityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DOPstAsrFailRryLt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TrunkTrunkTransf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConPwdQryTOutsecs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DOFailRtryItrlMin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DOOvrlFalreRryLim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MusicToneonHold" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MusicToneonHoldMu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Port" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACARefCalls" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACARefCallsLocPr1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACARefCallsLocPr2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACARefCallsLocPr3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACARefCallsRemote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACARemotePBXIdent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACAReferDestinati" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACAShtHldTmOrgExt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACALngHldTmOrgExt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TIsdnClBUrACASHTC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CpnAniPSADisedSet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Unnamed_Registrations_and_PSA_for_IP_Telephones" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContTerResDoNtDsA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContTerResDoNtDsE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContOutResInrTrtA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContOutResInrTrtE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContStaStaRestricA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContStaStaRestricE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContTollResIrtTr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContTollResIrtTrA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContTollResIrtTrE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InvldNumDldItrcTA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Announcement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VMHuntGroupExt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MaximumLength" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MinimumDigLength" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RepCallWaitInterv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ApplyInrcptLocal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EnforcePNTPNTRest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumbSessionwAllo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CongestionTimer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SessTimeout" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CongnClearedTr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SignalingGroupLt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DCSMessageFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Delay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClearCallrInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SysParRingerOffwithAuto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RecCTAPSATTIHisLg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EnhPSALocDisIfoEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AutoCallbNoAnTOIn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DefCORPSADissSets" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CTAEnabled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResSlotAttPriQue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TimebfrOffhookAlt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmergAccRedirExt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmergClsAldAttQue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CallPickupAlert" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TempBrgApcClPickU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CallPickupIntrcmC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DirectedCallPckup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CallPrkTOInterMin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExtGroupCallPckup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DxPagCalPkTimOrig" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContOutResInrTrmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContTerResDoNtDst" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContStaStaRestric" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AuthCodesEnabled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AuthCodeLength" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AuthCodeCancelSym" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AtteTimeOutFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DisplAuthorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OffPmTnDctTOInSec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContrTollResRepla" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SysPrinterEndpoint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LinesPerPage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmerExtForwMin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SwitchName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ApplyMCTWarnTone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MCTVoiceRecTrGrp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DelSendRelSecs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SendAllCallsAppls" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AutoInspectSACs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AARARSDialToneReq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreateUCID___" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UCIDNetworkNodeID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PblcNetTrkCnfCall" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CnfPrtPubNrkTrk" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CnfPrtWoPubNrkTrk" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NightSerDisTimeSc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShrtInrdgtTimerSc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UAnsDIDCalTmrSecs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LnItrcptToneTmrSc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LngHldRecTmerSecs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MusicSlnceTraTrnk" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RstShftTmrSecs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StaCallTnsRclTrSc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DIDBusyTreatment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InvldNumDldItrcTr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AlAarArsAcDidDiod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AlANIResAARARS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UseTrCOROutTrDsct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumericDisplay7405ND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumericDisplay7434ND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AutoStart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AutoHold" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EMU_Inactivity_Interval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DIDTieISDNSIPInTr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AttendantTone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BridgingTone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConferenceTone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IntrusionTone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecialDialTone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ModeCodeInterface" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Internal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="External" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Priority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IntAtoAnAtdExtTra" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AttOriginateCalls" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DTMFTeFbkSglVRUCn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Disconnection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AbortTransfer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TransfrUponHangUp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AbtConfUponHangUp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NoHoldConfTimeout" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NoDialToneConfrnc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SelLnApprConfrnc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Unhold" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Allow_Two_Observers_in_Same_Call" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Service_Level_Algorithm_for_SLM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Externally_Controlled_Distribution" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ecd_Exception_Timer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ECD_Service_Route_Timer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;group ref="{http://xml.avaya.com/sms}SystemParametersFeaturesArrayGroup"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SystemParametersFeaturesType", propOrder = {
    "selfStaDispEnable",
    "autCirAssurEnable",
    "withoutFlash",
    "recDelayTimerMsec",
    "apyRdyInTnPrtCall",
    "intApyPerAltTnSec",
    "requireSecCode",
    "seNISDNTkGpNmCnNm",
    "disConNaNmISDNDCS",
    "seISDNTkGrNmeTndm",
    "seCusMsgQSIG",
    "qsigtscExtension",
    "abrDilPrgrmAsList",
    "mwiNoDigitsVMSubs",
    "featurePlusExt",
    "nationalCPNPrefix",
    "passPrfxCPNASAI",
    "unknNumItrnlAUDIX",
    "usniCallNaOutgCal",
    "pthRplacMeasrment",
    "qsigPthRplacExt",
    "pthRplacQueVector",
    "atoAbrDelTranIntR",
    "cpnAniIclidRepRes",
    "cpnAniIclidRepUna",
    "localCountryCode",
    "intrnlAccessCode",
    "enEnblcDlWoARSFAC",
    "pullTransfer",
    "outplsWithoutTone",
    "misOperatnAlert",
    "allowConfviaFlash",
    "vecDisconTimrMins",
    "proCallerIDAnaTer",
    "hearZpTnFollowVOA",
    "updtTransRingPtrn",
    "waitAnswSuprTimer",
    "repeCallWaitingTn",
    "intrTrtFailedTrTr",
    "staToneForDisconn",
    "levToneDetection",
    "chgDispUpdtFrqSec",
    "dateFormatOnTerminals",
    "onHookDialingTerminals",
    "disCallNoRRCalIDC",
    "italanProtEnabled",
    "easEnabled",
    "minAgtLogIDPwdLen",
    "directAgentAnnExt",
    "msgWtLmpIndStatus",
    "conFirstDataDelay",
    "convSignalToneMs",
    "promptTimeoutsecs",
    "interflwqposEWTTh",
    "revStrPndDgtColSt",
    "maxMsgsPerStation",
    "availbleAgtAdjBSR",
    "secondDataDelay",
    "pauseMsec",
    "serObsWarningTone",
    "calClsAfterAsrSup",
    "sendUCIDtoASAI",
    "miaAcrsSplitSkill",
    "acwAgtsCnsdrdIdle",
    "callSlectnMeasure",
    "servLvlSprClSelOv",
    "maxExCallLogStati",
    "autoReserveAgents",
    "cpyASAIUUIConfTra",
    "auxWrkRsnCodeType",
    "logoutRsnCodeType",
    "adjunctCMSRelease",
    "acdLgnIdentiLgth",
    "bcmsVuStatLgnIDs",
    "bcmsVuStatMsrtInt",
    "bcmsVuStatAbClTrS",
    "vdBCMSVuStatLgnID",
    "msgWaitIndExtCall",
    "clrVuStatsSftData",
    "remIaBCMSVuStatAg",
    "swHkQryRepnsTimeo",
    "autanrIPFailAxReC",
    "maxAgtOccupPercen",
    "maxAgtOccupAuxReC",
    "autoExclusionCOS",
    "autoExclnCovrHold",
    "autoExclnWhispPag",
    "recallRotaryDigit",
    "drnCallTmrDispSec",
    "dirIpIpAudioConne",
    "ipAudioHairpinnig",
    "retry",
    "t2BckSigActnTirSe",
    "probtBrdgCalDtaPr",
    "enhAbrDialLen34",
    "recSubFailHisLog",
    "recPMSADTraHisLog",
    "recIPRegHisLog",
    "defMulOutTrParSel",
    "ttiEnabled",
    "ttiState",
    "ttiSecurityCode",
    "doPstAsrFailRryLt",
    "trunkTrunkTransf",
    "conPwdQryTOutsecs",
    "doFailRtryItrlMin",
    "doOvrlFalreRryLim",
    "musicToneonHold",
    "musicToneonHoldMu",
    "port",
    "acaRefCalls",
    "acaRefCallsLocPr1",
    "acaRefCallsLocPr2",
    "acaRefCallsLocPr3",
    "acaRefCallsRemote",
    "acaRemotePBXIdent",
    "acaReferDestinati",
    "acaShtHldTmOrgExt",
    "acaLngHldTmOrgExt",
    "tIsdnClBUrACASHTC",
    "cpnAniPSADisedSet",
    "unnamedRegistrationsAndPSAForIPTelephones",
    "contTerResDoNtDsA",
    "contTerResDoNtDsE",
    "contOutResInrTrtA",
    "contOutResInrTrtE",
    "contStaStaRestricA",
    "contStaStaRestricE",
    "contTollResIrtTr",
    "contTollResIrtTrA",
    "contTollResIrtTrE",
    "invldNumDldItrcTA",
    "announcement",
    "vmHuntGroupExt",
    "maximumLength",
    "minimumDigLength",
    "repCallWaitInterv",
    "applyInrcptLocal",
    "enforcePNTPNTRest",
    "numbSessionwAllo",
    "congestionTimer",
    "sessTimeout",
    "congnClearedTr",
    "signalingGroupLt",
    "dcsMessageFormat",
    "delay",
    "clearCallrInfo",
    "sysParRingerOffwithAuto",
    "recCTAPSATTIHisLg",
    "enhPSALocDisIfoEn",
    "autoCallbNoAnTOIn",
    "defCORPSADissSets",
    "ctaEnabled",
    "resSlotAttPriQue",
    "timebfrOffhookAlt",
    "emergAccRedirExt",
    "emergClsAldAttQue",
    "callPickupAlert",
    "tempBrgApcClPickU",
    "callPickupIntrcmC",
    "directedCallPckup",
    "callPrkTOInterMin",
    "extGroupCallPckup",
    "dxPagCalPkTimOrig",
    "contOutResInrTrmt",
    "contTerResDoNtDst",
    "contStaStaRestric",
    "authCodesEnabled",
    "authCodeLength",
    "authCodeCancelSym",
    "atteTimeOutFlag",
    "displAuthorCode",
    "offPmTnDctTOInSec",
    "contrTollResRepla",
    "sysPrinterEndpoint",
    "linesPerPage",
    "emerExtForwMin",
    "switchName",
    "applyMCTWarnTone",
    "mctVoiceRecTrGrp",
    "delSendRelSecs",
    "sendAllCallsAppls",
    "autoInspectSACs",
    "aararsDialToneReq",
    "createUCID",
    "ucidNetworkNodeID",
    "pblcNetTrkCnfCall",
    "cnfPrtPubNrkTrk",
    "cnfPrtWoPubNrkTrk",
    "nightSerDisTimeSc",
    "shrtInrdgtTimerSc",
    "uAnsDIDCalTmrSecs",
    "lnItrcptToneTmrSc",
    "lngHldRecTmerSecs",
    "musicSlnceTraTrnk",
    "rstShftTmrSecs",
    "staCallTnsRclTrSc",
    "didBusyTreatment",
    "invldNumDldItrcTr",
    "alAarArsAcDidDiod",
    "alANIResAARARS",
    "useTrCOROutTrDsct",
    "numericDisplay7405ND",
    "numericDisplay7434ND",
    "autoStart",
    "autoHold",
    "emuInactivityInterval",
    "didTieISDNSIPInTr",
    "attendantTone",
    "bridgingTone",
    "conferenceTone",
    "intrusionTone",
    "specialDialTone",
    "modeCodeInterface",
    "internal",
    "external",
    "priority",
    "intAtoAnAtdExtTra",
    "attOriginateCalls",
    "dtmfTeFbkSglVRUCn",
    "disconnection",
    "abortTransfer",
    "transfrUponHangUp",
    "abtConfUponHangUp",
    "noHoldConfTimeout",
    "noDialToneConfrnc",
    "selLnApprConfrnc",
    "unhold",
    "allowTwoObserversInSameCall",
    "serviceLevelAlgorithmForSLM",
    "externallyControlledDistribution",
    "ecdExceptionTimer",
    "ecdServiceRouteTimer",
    "stationSysWRetPn1",
    "rdoCoDownlServPn1",
    "dcsMessageFormat1"
})
public class SystemParametersFeaturesType {

    @XmlElement(name = "SelfStaDispEnable")
    protected String selfStaDispEnable;
    @XmlElement(name = "AutCirAssurEnable")
    protected String autCirAssurEnable;
    @XmlElement(name = "WithoutFlash")
    protected String withoutFlash;
    @XmlElement(name = "RecDelayTimerMsec")
    protected String recDelayTimerMsec;
    @XmlElement(name = "ApyRdyInTnPrtCall")
    protected String apyRdyInTnPrtCall;
    @XmlElement(name = "IntApyPerAltTnSec")
    protected String intApyPerAltTnSec;
    @XmlElement(name = "RequireSecCode")
    protected String requireSecCode;
    @XmlElement(name = "SeNISDNTkGpNmCnNm")
    protected String seNISDNTkGpNmCnNm;
    @XmlElement(name = "DisConNaNmISDNDCS")
    protected String disConNaNmISDNDCS;
    @XmlElement(name = "SeISDNTkGrNmeTndm")
    protected String seISDNTkGrNmeTndm;
    @XmlElement(name = "SeCusMsgQSIG")
    protected String seCusMsgQSIG;
    @XmlElement(name = "QSIGTSCExtension")
    protected String qsigtscExtension;
    @XmlElement(name = "AbrDilPrgrmAsList")
    protected String abrDilPrgrmAsList;
    @XmlElement(name = "MWINoDigitsVMSubs")
    protected String mwiNoDigitsVMSubs;
    @XmlElement(name = "FeaturePlusExt")
    protected String featurePlusExt;
    @XmlElement(name = "NationalCPNPrefix")
    protected String nationalCPNPrefix;
    @XmlElement(name = "PassPrfxCPNASAI")
    protected String passPrfxCPNASAI;
    protected String unknNumItrnlAUDIX;
    @XmlElement(name = "USNICallNaOutgCal")
    protected String usniCallNaOutgCal;
    @XmlElement(name = "PthRplacMeasrment")
    protected String pthRplacMeasrment;
    @XmlElement(name = "QSIGPthRplacExt")
    protected String qsigPthRplacExt;
    @XmlElement(name = "PthRplacQueVector")
    protected String pthRplacQueVector;
    @XmlElement(name = "AtoAbrDelTranIntR")
    protected String atoAbrDelTranIntR;
    @XmlElement(name = "CpnAniIclidRepRes")
    protected String cpnAniIclidRepRes;
    @XmlElement(name = "CpnAniIclidRepUna")
    protected String cpnAniIclidRepUna;
    @XmlElement(name = "LocalCountryCode")
    protected String localCountryCode;
    @XmlElement(name = "IntrnlAccessCode")
    protected String intrnlAccessCode;
    @XmlElement(name = "EnEnblcDlWoARSFAC")
    protected String enEnblcDlWoARSFAC;
    @XmlElement(name = "PullTransfer")
    protected String pullTransfer;
    @XmlElement(name = "OutplsWithoutTone")
    protected String outplsWithoutTone;
    @XmlElement(name = "MisOperatnAlert")
    protected String misOperatnAlert;
    @XmlElement(name = "AllowConfviaFlash")
    protected String allowConfviaFlash;
    @XmlElement(name = "VecDisconTimrMins")
    protected String vecDisconTimrMins;
    @XmlElement(name = "ProCallerIDAnaTer")
    protected String proCallerIDAnaTer;
    @XmlElement(name = "HearZpTnFollowVOA")
    protected String hearZpTnFollowVOA;
    @XmlElement(name = "UpdtTransRingPtrn")
    protected String updtTransRingPtrn;
    @XmlElement(name = "WaitAnswSuprTimer")
    protected String waitAnswSuprTimer;
    @XmlElement(name = "RepeCallWaitingTn")
    protected String repeCallWaitingTn;
    @XmlElement(name = "IntrTrtFailedTrTr")
    protected String intrTrtFailedTrTr;
    @XmlElement(name = "StaToneForDisconn")
    protected String staToneForDisconn;
    @XmlElement(name = "LevToneDetection")
    protected String levToneDetection;
    @XmlElement(name = "ChgDispUpdtFrqSec")
    protected String chgDispUpdtFrqSec;
    @XmlElement(name = "DateFormatOnTerminals")
    protected String dateFormatOnTerminals;
    @XmlElement(name = "OnHookDialingTerminals")
    protected String onHookDialingTerminals;
    @XmlElement(name = "DisCallNoRRCalIDC")
    protected String disCallNoRRCalIDC;
    @XmlElement(name = "ItalanProtEnabled")
    protected String italanProtEnabled;
    @XmlElement(name = "EASEnabled")
    protected String easEnabled;
    @XmlElement(name = "MinAgtLogIDPwdLen")
    protected String minAgtLogIDPwdLen;
    @XmlElement(name = "DirectAgentAnnExt")
    protected String directAgentAnnExt;
    @XmlElement(name = "MsgWtLmpIndStatus")
    protected String msgWtLmpIndStatus;
    @XmlElement(name = "ConFirstDataDelay")
    protected String conFirstDataDelay;
    @XmlElement(name = "ConvSignalToneMs")
    protected String convSignalToneMs;
    @XmlElement(name = "PromptTimeoutsecs")
    protected String promptTimeoutsecs;
    @XmlElement(name = "InterflwqposEWTTh")
    protected String interflwqposEWTTh;
    @XmlElement(name = "RevStrPndDgtColSt")
    protected String revStrPndDgtColSt;
    @XmlElement(name = "MaxMsgsPerStation")
    protected String maxMsgsPerStation;
    @XmlElement(name = "AvailbleAgtAdjBSR")
    protected String availbleAgtAdjBSR;
    @XmlElement(name = "SecondDataDelay")
    protected String secondDataDelay;
    @XmlElement(name = "PauseMsec")
    protected String pauseMsec;
    @XmlElement(name = "SerObsWarningTone")
    protected String serObsWarningTone;
    @XmlElement(name = "CalClsAfterAsrSup")
    protected String calClsAfterAsrSup;
    @XmlElement(name = "SendUCIDtoASAI")
    protected String sendUCIDtoASAI;
    @XmlElement(name = "MIAAcrsSplitSkill")
    protected String miaAcrsSplitSkill;
    @XmlElement(name = "ACWAgtsCnsdrdIdle")
    protected String acwAgtsCnsdrdIdle;
    @XmlElement(name = "CallSlectnMeasure")
    protected String callSlectnMeasure;
    @XmlElement(name = "ServLvlSprClSelOv")
    protected String servLvlSprClSelOv;
    @XmlElement(name = "MaxExCallLogStati")
    protected String maxExCallLogStati;
    @XmlElement(name = "AutoReserveAgents")
    protected String autoReserveAgents;
    @XmlElement(name = "CpyASAIUUIConfTra")
    protected String cpyASAIUUIConfTra;
    @XmlElement(name = "AuxWrkRsnCodeType")
    protected String auxWrkRsnCodeType;
    @XmlElement(name = "LogoutRsnCodeType")
    protected String logoutRsnCodeType;
    @XmlElement(name = "AdjunctCMSRelease")
    protected String adjunctCMSRelease;
    @XmlElement(name = "ACDLgnIdentiLgth")
    protected String acdLgnIdentiLgth;
    @XmlElement(name = "BCMSVuStatLgnIDs")
    protected String bcmsVuStatLgnIDs;
    @XmlElement(name = "BCMSVuStatMsrtInt")
    protected String bcmsVuStatMsrtInt;
    @XmlElement(name = "BCMSVuStatAbClTrS")
    protected String bcmsVuStatAbClTrS;
    @XmlElement(name = "VdBCMSVuStatLgnID")
    protected String vdBCMSVuStatLgnID;
    @XmlElement(name = "MsgWaitIndExtCall")
    protected String msgWaitIndExtCall;
    @XmlElement(name = "ClrVuStatsSftData")
    protected String clrVuStatsSftData;
    @XmlElement(name = "RemIaBCMSVuStatAg")
    protected String remIaBCMSVuStatAg;
    @XmlElement(name = "SwHkQryRepnsTimeo")
    protected String swHkQryRepnsTimeo;
    @XmlElement(name = "AutanrIPFailAxReC")
    protected String autanrIPFailAxReC;
    @XmlElement(name = "MaxAgtOccupPercen")
    protected String maxAgtOccupPercen;
    @XmlElement(name = "MaxAgtOccupAuxReC")
    protected String maxAgtOccupAuxReC;
    @XmlElement(name = "AutoExclusionCOS")
    protected String autoExclusionCOS;
    @XmlElement(name = "AutoExclnCovrHold")
    protected String autoExclnCovrHold;
    @XmlElement(name = "AutoExclnWhispPag")
    protected String autoExclnWhispPag;
    @XmlElement(name = "RecallRotaryDigit")
    protected String recallRotaryDigit;
    @XmlElement(name = "DrnCallTmrDispSec")
    protected String drnCallTmrDispSec;
    @XmlElement(name = "DirIpIpAudioConne")
    protected String dirIpIpAudioConne;
    @XmlElement(name = "IPAudioHairpinnig")
    protected String ipAudioHairpinnig;
    @XmlElement(name = "Retry")
    protected String retry;
    @XmlElement(name = "T2BckSigActnTirSe")
    protected String t2BckSigActnTirSe;
    @XmlElement(name = "ProbtBrdgCalDtaPr")
    protected String probtBrdgCalDtaPr;
    @XmlElement(name = "EnhAbrDialLen34")
    protected String enhAbrDialLen34;
    @XmlElement(name = "RecSubFailHisLog")
    protected String recSubFailHisLog;
    @XmlElement(name = "RecPMSADTraHisLog")
    protected String recPMSADTraHisLog;
    @XmlElement(name = "RecIPRegHisLog")
    protected String recIPRegHisLog;
    @XmlElement(name = "DefMulOutTrParSel")
    protected String defMulOutTrParSel;
    @XmlElement(name = "TTIEnabled")
    protected String ttiEnabled;
    @XmlElement(name = "TTIState")
    protected String ttiState;
    @XmlElement(name = "TTISecurityCode")
    protected String ttiSecurityCode;
    @XmlElement(name = "DOPstAsrFailRryLt")
    protected String doPstAsrFailRryLt;
    @XmlElement(name = "TrunkTrunkTransf")
    protected String trunkTrunkTransf;
    @XmlElement(name = "ConPwdQryTOutsecs")
    protected String conPwdQryTOutsecs;
    @XmlElement(name = "DOFailRtryItrlMin")
    protected String doFailRtryItrlMin;
    @XmlElement(name = "DOOvrlFalreRryLim")
    protected String doOvrlFalreRryLim;
    @XmlElement(name = "MusicToneonHold")
    protected String musicToneonHold;
    @XmlElement(name = "MusicToneonHoldMu")
    protected String musicToneonHoldMu;
    @XmlElement(name = "Port")
    protected String port;
    @XmlElement(name = "ACARefCalls")
    protected String acaRefCalls;
    @XmlElement(name = "ACARefCallsLocPr1")
    protected String acaRefCallsLocPr1;
    @XmlElement(name = "ACARefCallsLocPr2")
    protected String acaRefCallsLocPr2;
    @XmlElement(name = "ACARefCallsLocPr3")
    protected String acaRefCallsLocPr3;
    @XmlElement(name = "ACARefCallsRemote")
    protected String acaRefCallsRemote;
    @XmlElement(name = "ACARemotePBXIdent")
    protected String acaRemotePBXIdent;
    @XmlElement(name = "ACAReferDestinati")
    protected String acaReferDestinati;
    @XmlElement(name = "ACAShtHldTmOrgExt")
    protected String acaShtHldTmOrgExt;
    @XmlElement(name = "ACALngHldTmOrgExt")
    protected String acaLngHldTmOrgExt;
    @XmlElement(name = "TIsdnClBUrACASHTC")
    protected String tIsdnClBUrACASHTC;
    @XmlElement(name = "CpnAniPSADisedSet")
    protected String cpnAniPSADisedSet;
    @XmlElement(name = "Unnamed_Registrations_and_PSA_for_IP_Telephones")
    protected String unnamedRegistrationsAndPSAForIPTelephones;
    @XmlElement(name = "ContTerResDoNtDsA")
    protected String contTerResDoNtDsA;
    @XmlElement(name = "ContTerResDoNtDsE")
    protected String contTerResDoNtDsE;
    @XmlElement(name = "ContOutResInrTrtA")
    protected String contOutResInrTrtA;
    @XmlElement(name = "ContOutResInrTrtE")
    protected String contOutResInrTrtE;
    @XmlElement(name = "ContStaStaRestricA")
    protected String contStaStaRestricA;
    @XmlElement(name = "ContStaStaRestricE")
    protected String contStaStaRestricE;
    @XmlElement(name = "ContTollResIrtTr")
    protected String contTollResIrtTr;
    @XmlElement(name = "ContTollResIrtTrA")
    protected String contTollResIrtTrA;
    @XmlElement(name = "ContTollResIrtTrE")
    protected String contTollResIrtTrE;
    @XmlElement(name = "InvldNumDldItrcTA")
    protected String invldNumDldItrcTA;
    @XmlElement(name = "Announcement")
    protected String announcement;
    @XmlElement(name = "VMHuntGroupExt")
    protected String vmHuntGroupExt;
    @XmlElement(name = "MaximumLength")
    protected String maximumLength;
    @XmlElement(name = "MinimumDigLength")
    protected String minimumDigLength;
    @XmlElement(name = "RepCallWaitInterv")
    protected String repCallWaitInterv;
    @XmlElement(name = "ApplyInrcptLocal")
    protected String applyInrcptLocal;
    @XmlElement(name = "EnforcePNTPNTRest")
    protected String enforcePNTPNTRest;
    @XmlElement(name = "NumbSessionwAllo")
    protected String numbSessionwAllo;
    @XmlElement(name = "CongestionTimer")
    protected String congestionTimer;
    @XmlElement(name = "SessTimeout")
    protected String sessTimeout;
    @XmlElement(name = "CongnClearedTr")
    protected String congnClearedTr;
    @XmlElement(name = "SignalingGroupLt")
    protected String signalingGroupLt;
    @XmlElement(name = "DCSMessageFormat")
    protected String dcsMessageFormat;
    @XmlElement(name = "Delay")
    protected String delay;
    @XmlElement(name = "ClearCallrInfo")
    protected String clearCallrInfo;
    @XmlElement(name = "SysParRingerOffwithAuto")
    protected String sysParRingerOffwithAuto;
    @XmlElement(name = "RecCTAPSATTIHisLg")
    protected String recCTAPSATTIHisLg;
    @XmlElement(name = "EnhPSALocDisIfoEn")
    protected String enhPSALocDisIfoEn;
    @XmlElement(name = "AutoCallbNoAnTOIn")
    protected String autoCallbNoAnTOIn;
    @XmlElement(name = "DefCORPSADissSets")
    protected String defCORPSADissSets;
    @XmlElement(name = "CTAEnabled")
    protected String ctaEnabled;
    @XmlElement(name = "ResSlotAttPriQue")
    protected String resSlotAttPriQue;
    @XmlElement(name = "TimebfrOffhookAlt")
    protected String timebfrOffhookAlt;
    @XmlElement(name = "EmergAccRedirExt")
    protected String emergAccRedirExt;
    @XmlElement(name = "EmergClsAldAttQue")
    protected String emergClsAldAttQue;
    @XmlElement(name = "CallPickupAlert")
    protected String callPickupAlert;
    @XmlElement(name = "TempBrgApcClPickU")
    protected String tempBrgApcClPickU;
    @XmlElement(name = "CallPickupIntrcmC")
    protected String callPickupIntrcmC;
    @XmlElement(name = "DirectedCallPckup")
    protected String directedCallPckup;
    @XmlElement(name = "CallPrkTOInterMin")
    protected String callPrkTOInterMin;
    @XmlElement(name = "ExtGroupCallPckup")
    protected String extGroupCallPckup;
    @XmlElement(name = "DxPagCalPkTimOrig")
    protected String dxPagCalPkTimOrig;
    @XmlElement(name = "ContOutResInrTrmt")
    protected String contOutResInrTrmt;
    @XmlElement(name = "ContTerResDoNtDst")
    protected String contTerResDoNtDst;
    @XmlElement(name = "ContStaStaRestric")
    protected String contStaStaRestric;
    @XmlElement(name = "AuthCodesEnabled")
    protected String authCodesEnabled;
    @XmlElement(name = "AuthCodeLength")
    protected String authCodeLength;
    @XmlElement(name = "AuthCodeCancelSym")
    protected String authCodeCancelSym;
    @XmlElement(name = "AtteTimeOutFlag")
    protected String atteTimeOutFlag;
    @XmlElement(name = "DisplAuthorCode")
    protected String displAuthorCode;
    @XmlElement(name = "OffPmTnDctTOInSec")
    protected String offPmTnDctTOInSec;
    @XmlElement(name = "ContrTollResRepla")
    protected String contrTollResRepla;
    @XmlElement(name = "SysPrinterEndpoint")
    protected String sysPrinterEndpoint;
    @XmlElement(name = "LinesPerPage")
    protected String linesPerPage;
    @XmlElement(name = "EmerExtForwMin")
    protected String emerExtForwMin;
    @XmlElement(name = "SwitchName")
    protected String switchName;
    @XmlElement(name = "ApplyMCTWarnTone")
    protected String applyMCTWarnTone;
    @XmlElement(name = "MCTVoiceRecTrGrp")
    protected String mctVoiceRecTrGrp;
    @XmlElement(name = "DelSendRelSecs")
    protected String delSendRelSecs;
    @XmlElement(name = "SendAllCallsAppls")
    protected String sendAllCallsAppls;
    @XmlElement(name = "AutoInspectSACs")
    protected String autoInspectSACs;
    @XmlElement(name = "AARARSDialToneReq")
    protected String aararsDialToneReq;
    @XmlElement(name = "CreateUCID___")
    protected String createUCID;
    @XmlElement(name = "UCIDNetworkNodeID")
    protected String ucidNetworkNodeID;
    @XmlElement(name = "PblcNetTrkCnfCall")
    protected String pblcNetTrkCnfCall;
    @XmlElement(name = "CnfPrtPubNrkTrk")
    protected String cnfPrtPubNrkTrk;
    @XmlElement(name = "CnfPrtWoPubNrkTrk")
    protected String cnfPrtWoPubNrkTrk;
    @XmlElement(name = "NightSerDisTimeSc")
    protected String nightSerDisTimeSc;
    @XmlElement(name = "ShrtInrdgtTimerSc")
    protected String shrtInrdgtTimerSc;
    @XmlElement(name = "UAnsDIDCalTmrSecs")
    protected String uAnsDIDCalTmrSecs;
    @XmlElement(name = "LnItrcptToneTmrSc")
    protected String lnItrcptToneTmrSc;
    @XmlElement(name = "LngHldRecTmerSecs")
    protected String lngHldRecTmerSecs;
    @XmlElement(name = "MusicSlnceTraTrnk")
    protected String musicSlnceTraTrnk;
    @XmlElement(name = "RstShftTmrSecs")
    protected String rstShftTmrSecs;
    @XmlElement(name = "StaCallTnsRclTrSc")
    protected String staCallTnsRclTrSc;
    @XmlElement(name = "DIDBusyTreatment")
    protected String didBusyTreatment;
    @XmlElement(name = "InvldNumDldItrcTr")
    protected String invldNumDldItrcTr;
    @XmlElement(name = "AlAarArsAcDidDiod")
    protected String alAarArsAcDidDiod;
    @XmlElement(name = "AlANIResAARARS")
    protected String alANIResAARARS;
    @XmlElement(name = "UseTrCOROutTrDsct")
    protected String useTrCOROutTrDsct;
    @XmlElement(name = "NumericDisplay7405ND")
    protected String numericDisplay7405ND;
    @XmlElement(name = "NumericDisplay7434ND")
    protected String numericDisplay7434ND;
    @XmlElement(name = "AutoStart")
    protected String autoStart;
    @XmlElement(name = "AutoHold")
    protected String autoHold;
    @XmlElement(name = "EMU_Inactivity_Interval")
    protected String emuInactivityInterval;
    @XmlElement(name = "DIDTieISDNSIPInTr")
    protected String didTieISDNSIPInTr;
    @XmlElement(name = "AttendantTone")
    protected String attendantTone;
    @XmlElement(name = "BridgingTone")
    protected String bridgingTone;
    @XmlElement(name = "ConferenceTone")
    protected String conferenceTone;
    @XmlElement(name = "IntrusionTone")
    protected String intrusionTone;
    @XmlElement(name = "SpecialDialTone")
    protected String specialDialTone;
    @XmlElement(name = "ModeCodeInterface")
    protected String modeCodeInterface;
    @XmlElement(name = "Internal")
    protected String internal;
    @XmlElement(name = "External")
    protected String external;
    @XmlElement(name = "Priority")
    protected String priority;
    @XmlElement(name = "IntAtoAnAtdExtTra")
    protected String intAtoAnAtdExtTra;
    @XmlElement(name = "AttOriginateCalls")
    protected String attOriginateCalls;
    @XmlElement(name = "DTMFTeFbkSglVRUCn")
    protected String dtmfTeFbkSglVRUCn;
    @XmlElement(name = "Disconnection")
    protected String disconnection;
    @XmlElement(name = "AbortTransfer")
    protected String abortTransfer;
    @XmlElement(name = "TransfrUponHangUp")
    protected String transfrUponHangUp;
    @XmlElement(name = "AbtConfUponHangUp")
    protected String abtConfUponHangUp;
    @XmlElement(name = "NoHoldConfTimeout")
    protected String noHoldConfTimeout;
    @XmlElement(name = "NoDialToneConfrnc")
    protected String noDialToneConfrnc;
    @XmlElement(name = "SelLnApprConfrnc")
    protected String selLnApprConfrnc;
    @XmlElement(name = "Unhold")
    protected String unhold;
    @XmlElement(name = "Allow_Two_Observers_in_Same_Call")
    protected String allowTwoObserversInSameCall;
    @XmlElement(name = "Service_Level_Algorithm_for_SLM")
    protected String serviceLevelAlgorithmForSLM;
    @XmlElement(name = "Externally_Controlled_Distribution")
    protected String externallyControlledDistribution;
    @XmlElement(name = "Ecd_Exception_Timer")
    protected String ecdExceptionTimer;
    @XmlElement(name = "ECD_Service_Route_Timer")
    protected String ecdServiceRouteTimer;
    @XmlElement(name = "StationSysWRetPn1")
    protected List<ArrayType> stationSysWRetPn1;
    @XmlElement(name = "RdoCoDownlServPn1")
    protected List<ArrayType> rdoCoDownlServPn1;
    @XmlElement(name = "DCSMessageFormat1")
    protected List<ArrayType> dcsMessageFormat1;

    /**
     * Gets the value of the selfStaDispEnable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelfStaDispEnable() {
        return selfStaDispEnable;
    }

    /**
     * Sets the value of the selfStaDispEnable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelfStaDispEnable(String value) {
        this.selfStaDispEnable = value;
    }

    /**
     * Gets the value of the autCirAssurEnable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutCirAssurEnable() {
        return autCirAssurEnable;
    }

    /**
     * Sets the value of the autCirAssurEnable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutCirAssurEnable(String value) {
        this.autCirAssurEnable = value;
    }

    /**
     * Gets the value of the withoutFlash property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWithoutFlash() {
        return withoutFlash;
    }

    /**
     * Sets the value of the withoutFlash property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWithoutFlash(String value) {
        this.withoutFlash = value;
    }

    /**
     * Gets the value of the recDelayTimerMsec property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecDelayTimerMsec() {
        return recDelayTimerMsec;
    }

    /**
     * Sets the value of the recDelayTimerMsec property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecDelayTimerMsec(String value) {
        this.recDelayTimerMsec = value;
    }

    /**
     * Gets the value of the apyRdyInTnPrtCall property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApyRdyInTnPrtCall() {
        return apyRdyInTnPrtCall;
    }

    /**
     * Sets the value of the apyRdyInTnPrtCall property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApyRdyInTnPrtCall(String value) {
        this.apyRdyInTnPrtCall = value;
    }

    /**
     * Gets the value of the intApyPerAltTnSec property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntApyPerAltTnSec() {
        return intApyPerAltTnSec;
    }

    /**
     * Sets the value of the intApyPerAltTnSec property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntApyPerAltTnSec(String value) {
        this.intApyPerAltTnSec = value;
    }

    /**
     * Gets the value of the requireSecCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequireSecCode() {
        return requireSecCode;
    }

    /**
     * Sets the value of the requireSecCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequireSecCode(String value) {
        this.requireSecCode = value;
    }

    /**
     * Gets the value of the seNISDNTkGpNmCnNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeNISDNTkGpNmCnNm() {
        return seNISDNTkGpNmCnNm;
    }

    /**
     * Sets the value of the seNISDNTkGpNmCnNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeNISDNTkGpNmCnNm(String value) {
        this.seNISDNTkGpNmCnNm = value;
    }

    /**
     * Gets the value of the disConNaNmISDNDCS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisConNaNmISDNDCS() {
        return disConNaNmISDNDCS;
    }

    /**
     * Sets the value of the disConNaNmISDNDCS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisConNaNmISDNDCS(String value) {
        this.disConNaNmISDNDCS = value;
    }

    /**
     * Gets the value of the seISDNTkGrNmeTndm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeISDNTkGrNmeTndm() {
        return seISDNTkGrNmeTndm;
    }

    /**
     * Sets the value of the seISDNTkGrNmeTndm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeISDNTkGrNmeTndm(String value) {
        this.seISDNTkGrNmeTndm = value;
    }

    /**
     * Gets the value of the seCusMsgQSIG property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeCusMsgQSIG() {
        return seCusMsgQSIG;
    }

    /**
     * Sets the value of the seCusMsgQSIG property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeCusMsgQSIG(String value) {
        this.seCusMsgQSIG = value;
    }

    /**
     * Gets the value of the qsigtscExtension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQSIGTSCExtension() {
        return qsigtscExtension;
    }

    /**
     * Sets the value of the qsigtscExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQSIGTSCExtension(String value) {
        this.qsigtscExtension = value;
    }

    /**
     * Gets the value of the abrDilPrgrmAsList property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbrDilPrgrmAsList() {
        return abrDilPrgrmAsList;
    }

    /**
     * Sets the value of the abrDilPrgrmAsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbrDilPrgrmAsList(String value) {
        this.abrDilPrgrmAsList = value;
    }

    /**
     * Gets the value of the mwiNoDigitsVMSubs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMWINoDigitsVMSubs() {
        return mwiNoDigitsVMSubs;
    }

    /**
     * Sets the value of the mwiNoDigitsVMSubs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMWINoDigitsVMSubs(String value) {
        this.mwiNoDigitsVMSubs = value;
    }

    /**
     * Gets the value of the featurePlusExt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeaturePlusExt() {
        return featurePlusExt;
    }

    /**
     * Sets the value of the featurePlusExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeaturePlusExt(String value) {
        this.featurePlusExt = value;
    }

    /**
     * Gets the value of the nationalCPNPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationalCPNPrefix() {
        return nationalCPNPrefix;
    }

    /**
     * Sets the value of the nationalCPNPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationalCPNPrefix(String value) {
        this.nationalCPNPrefix = value;
    }

    /**
     * Gets the value of the passPrfxCPNASAI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassPrfxCPNASAI() {
        return passPrfxCPNASAI;
    }

    /**
     * Sets the value of the passPrfxCPNASAI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassPrfxCPNASAI(String value) {
        this.passPrfxCPNASAI = value;
    }

    /**
     * Gets the value of the unknNumItrnlAUDIX property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnknNumItrnlAUDIX() {
        return unknNumItrnlAUDIX;
    }

    /**
     * Sets the value of the unknNumItrnlAUDIX property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnknNumItrnlAUDIX(String value) {
        this.unknNumItrnlAUDIX = value;
    }

    /**
     * Gets the value of the usniCallNaOutgCal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSNICallNaOutgCal() {
        return usniCallNaOutgCal;
    }

    /**
     * Sets the value of the usniCallNaOutgCal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSNICallNaOutgCal(String value) {
        this.usniCallNaOutgCal = value;
    }

    /**
     * Gets the value of the pthRplacMeasrment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPthRplacMeasrment() {
        return pthRplacMeasrment;
    }

    /**
     * Sets the value of the pthRplacMeasrment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPthRplacMeasrment(String value) {
        this.pthRplacMeasrment = value;
    }

    /**
     * Gets the value of the qsigPthRplacExt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQSIGPthRplacExt() {
        return qsigPthRplacExt;
    }

    /**
     * Sets the value of the qsigPthRplacExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQSIGPthRplacExt(String value) {
        this.qsigPthRplacExt = value;
    }

    /**
     * Gets the value of the pthRplacQueVector property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPthRplacQueVector() {
        return pthRplacQueVector;
    }

    /**
     * Sets the value of the pthRplacQueVector property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPthRplacQueVector(String value) {
        this.pthRplacQueVector = value;
    }

    /**
     * Gets the value of the atoAbrDelTranIntR property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAtoAbrDelTranIntR() {
        return atoAbrDelTranIntR;
    }

    /**
     * Sets the value of the atoAbrDelTranIntR property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAtoAbrDelTranIntR(String value) {
        this.atoAbrDelTranIntR = value;
    }

    /**
     * Gets the value of the cpnAniIclidRepRes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpnAniIclidRepRes() {
        return cpnAniIclidRepRes;
    }

    /**
     * Sets the value of the cpnAniIclidRepRes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpnAniIclidRepRes(String value) {
        this.cpnAniIclidRepRes = value;
    }

    /**
     * Gets the value of the cpnAniIclidRepUna property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpnAniIclidRepUna() {
        return cpnAniIclidRepUna;
    }

    /**
     * Sets the value of the cpnAniIclidRepUna property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpnAniIclidRepUna(String value) {
        this.cpnAniIclidRepUna = value;
    }

    /**
     * Gets the value of the localCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalCountryCode() {
        return localCountryCode;
    }

    /**
     * Sets the value of the localCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalCountryCode(String value) {
        this.localCountryCode = value;
    }

    /**
     * Gets the value of the intrnlAccessCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntrnlAccessCode() {
        return intrnlAccessCode;
    }

    /**
     * Sets the value of the intrnlAccessCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntrnlAccessCode(String value) {
        this.intrnlAccessCode = value;
    }

    /**
     * Gets the value of the enEnblcDlWoARSFAC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnEnblcDlWoARSFAC() {
        return enEnblcDlWoARSFAC;
    }

    /**
     * Sets the value of the enEnblcDlWoARSFAC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnEnblcDlWoARSFAC(String value) {
        this.enEnblcDlWoARSFAC = value;
    }

    /**
     * Gets the value of the pullTransfer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPullTransfer() {
        return pullTransfer;
    }

    /**
     * Sets the value of the pullTransfer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPullTransfer(String value) {
        this.pullTransfer = value;
    }

    /**
     * Gets the value of the outplsWithoutTone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutplsWithoutTone() {
        return outplsWithoutTone;
    }

    /**
     * Sets the value of the outplsWithoutTone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutplsWithoutTone(String value) {
        this.outplsWithoutTone = value;
    }

    /**
     * Gets the value of the misOperatnAlert property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMisOperatnAlert() {
        return misOperatnAlert;
    }

    /**
     * Sets the value of the misOperatnAlert property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMisOperatnAlert(String value) {
        this.misOperatnAlert = value;
    }

    /**
     * Gets the value of the allowConfviaFlash property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllowConfviaFlash() {
        return allowConfviaFlash;
    }

    /**
     * Sets the value of the allowConfviaFlash property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllowConfviaFlash(String value) {
        this.allowConfviaFlash = value;
    }

    /**
     * Gets the value of the vecDisconTimrMins property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVecDisconTimrMins() {
        return vecDisconTimrMins;
    }

    /**
     * Sets the value of the vecDisconTimrMins property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVecDisconTimrMins(String value) {
        this.vecDisconTimrMins = value;
    }

    /**
     * Gets the value of the proCallerIDAnaTer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProCallerIDAnaTer() {
        return proCallerIDAnaTer;
    }

    /**
     * Sets the value of the proCallerIDAnaTer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProCallerIDAnaTer(String value) {
        this.proCallerIDAnaTer = value;
    }

    /**
     * Gets the value of the hearZpTnFollowVOA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHearZpTnFollowVOA() {
        return hearZpTnFollowVOA;
    }

    /**
     * Sets the value of the hearZpTnFollowVOA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHearZpTnFollowVOA(String value) {
        this.hearZpTnFollowVOA = value;
    }

    /**
     * Gets the value of the updtTransRingPtrn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdtTransRingPtrn() {
        return updtTransRingPtrn;
    }

    /**
     * Sets the value of the updtTransRingPtrn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdtTransRingPtrn(String value) {
        this.updtTransRingPtrn = value;
    }

    /**
     * Gets the value of the waitAnswSuprTimer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWaitAnswSuprTimer() {
        return waitAnswSuprTimer;
    }

    /**
     * Sets the value of the waitAnswSuprTimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWaitAnswSuprTimer(String value) {
        this.waitAnswSuprTimer = value;
    }

    /**
     * Gets the value of the repeCallWaitingTn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepeCallWaitingTn() {
        return repeCallWaitingTn;
    }

    /**
     * Sets the value of the repeCallWaitingTn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepeCallWaitingTn(String value) {
        this.repeCallWaitingTn = value;
    }

    /**
     * Gets the value of the intrTrtFailedTrTr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntrTrtFailedTrTr() {
        return intrTrtFailedTrTr;
    }

    /**
     * Sets the value of the intrTrtFailedTrTr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntrTrtFailedTrTr(String value) {
        this.intrTrtFailedTrTr = value;
    }

    /**
     * Gets the value of the staToneForDisconn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStaToneForDisconn() {
        return staToneForDisconn;
    }

    /**
     * Sets the value of the staToneForDisconn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStaToneForDisconn(String value) {
        this.staToneForDisconn = value;
    }

    /**
     * Gets the value of the levToneDetection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLevToneDetection() {
        return levToneDetection;
    }

    /**
     * Sets the value of the levToneDetection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLevToneDetection(String value) {
        this.levToneDetection = value;
    }

    /**
     * Gets the value of the chgDispUpdtFrqSec property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChgDispUpdtFrqSec() {
        return chgDispUpdtFrqSec;
    }

    /**
     * Sets the value of the chgDispUpdtFrqSec property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChgDispUpdtFrqSec(String value) {
        this.chgDispUpdtFrqSec = value;
    }

    /**
     * Gets the value of the dateFormatOnTerminals property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateFormatOnTerminals() {
        return dateFormatOnTerminals;
    }

    /**
     * Sets the value of the dateFormatOnTerminals property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateFormatOnTerminals(String value) {
        this.dateFormatOnTerminals = value;
    }

    /**
     * Gets the value of the onHookDialingTerminals property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnHookDialingTerminals() {
        return onHookDialingTerminals;
    }

    /**
     * Sets the value of the onHookDialingTerminals property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnHookDialingTerminals(String value) {
        this.onHookDialingTerminals = value;
    }

    /**
     * Gets the value of the disCallNoRRCalIDC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisCallNoRRCalIDC() {
        return disCallNoRRCalIDC;
    }

    /**
     * Sets the value of the disCallNoRRCalIDC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisCallNoRRCalIDC(String value) {
        this.disCallNoRRCalIDC = value;
    }

    /**
     * Gets the value of the italanProtEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItalanProtEnabled() {
        return italanProtEnabled;
    }

    /**
     * Sets the value of the italanProtEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItalanProtEnabled(String value) {
        this.italanProtEnabled = value;
    }

    /**
     * Gets the value of the easEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEASEnabled() {
        return easEnabled;
    }

    /**
     * Sets the value of the easEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEASEnabled(String value) {
        this.easEnabled = value;
    }

    /**
     * Gets the value of the minAgtLogIDPwdLen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinAgtLogIDPwdLen() {
        return minAgtLogIDPwdLen;
    }

    /**
     * Sets the value of the minAgtLogIDPwdLen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinAgtLogIDPwdLen(String value) {
        this.minAgtLogIDPwdLen = value;
    }

    /**
     * Gets the value of the directAgentAnnExt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectAgentAnnExt() {
        return directAgentAnnExt;
    }

    /**
     * Sets the value of the directAgentAnnExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectAgentAnnExt(String value) {
        this.directAgentAnnExt = value;
    }

    /**
     * Gets the value of the msgWtLmpIndStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgWtLmpIndStatus() {
        return msgWtLmpIndStatus;
    }

    /**
     * Sets the value of the msgWtLmpIndStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgWtLmpIndStatus(String value) {
        this.msgWtLmpIndStatus = value;
    }

    /**
     * Gets the value of the conFirstDataDelay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConFirstDataDelay() {
        return conFirstDataDelay;
    }

    /**
     * Sets the value of the conFirstDataDelay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConFirstDataDelay(String value) {
        this.conFirstDataDelay = value;
    }

    /**
     * Gets the value of the convSignalToneMs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConvSignalToneMs() {
        return convSignalToneMs;
    }

    /**
     * Sets the value of the convSignalToneMs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConvSignalToneMs(String value) {
        this.convSignalToneMs = value;
    }

    /**
     * Gets the value of the promptTimeoutsecs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromptTimeoutsecs() {
        return promptTimeoutsecs;
    }

    /**
     * Sets the value of the promptTimeoutsecs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromptTimeoutsecs(String value) {
        this.promptTimeoutsecs = value;
    }

    /**
     * Gets the value of the interflwqposEWTTh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterflwqposEWTTh() {
        return interflwqposEWTTh;
    }

    /**
     * Sets the value of the interflwqposEWTTh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterflwqposEWTTh(String value) {
        this.interflwqposEWTTh = value;
    }

    /**
     * Gets the value of the revStrPndDgtColSt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevStrPndDgtColSt() {
        return revStrPndDgtColSt;
    }

    /**
     * Sets the value of the revStrPndDgtColSt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevStrPndDgtColSt(String value) {
        this.revStrPndDgtColSt = value;
    }

    /**
     * Gets the value of the maxMsgsPerStation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxMsgsPerStation() {
        return maxMsgsPerStation;
    }

    /**
     * Sets the value of the maxMsgsPerStation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxMsgsPerStation(String value) {
        this.maxMsgsPerStation = value;
    }

    /**
     * Gets the value of the availbleAgtAdjBSR property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvailbleAgtAdjBSR() {
        return availbleAgtAdjBSR;
    }

    /**
     * Sets the value of the availbleAgtAdjBSR property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvailbleAgtAdjBSR(String value) {
        this.availbleAgtAdjBSR = value;
    }

    /**
     * Gets the value of the secondDataDelay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondDataDelay() {
        return secondDataDelay;
    }

    /**
     * Sets the value of the secondDataDelay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondDataDelay(String value) {
        this.secondDataDelay = value;
    }

    /**
     * Gets the value of the pauseMsec property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPauseMsec() {
        return pauseMsec;
    }

    /**
     * Sets the value of the pauseMsec property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPauseMsec(String value) {
        this.pauseMsec = value;
    }

    /**
     * Gets the value of the serObsWarningTone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerObsWarningTone() {
        return serObsWarningTone;
    }

    /**
     * Sets the value of the serObsWarningTone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerObsWarningTone(String value) {
        this.serObsWarningTone = value;
    }

    /**
     * Gets the value of the calClsAfterAsrSup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalClsAfterAsrSup() {
        return calClsAfterAsrSup;
    }

    /**
     * Sets the value of the calClsAfterAsrSup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalClsAfterAsrSup(String value) {
        this.calClsAfterAsrSup = value;
    }

    /**
     * Gets the value of the sendUCIDtoASAI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendUCIDtoASAI() {
        return sendUCIDtoASAI;
    }

    /**
     * Sets the value of the sendUCIDtoASAI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendUCIDtoASAI(String value) {
        this.sendUCIDtoASAI = value;
    }

    /**
     * Gets the value of the miaAcrsSplitSkill property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMIAAcrsSplitSkill() {
        return miaAcrsSplitSkill;
    }

    /**
     * Sets the value of the miaAcrsSplitSkill property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMIAAcrsSplitSkill(String value) {
        this.miaAcrsSplitSkill = value;
    }

    /**
     * Gets the value of the acwAgtsCnsdrdIdle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACWAgtsCnsdrdIdle() {
        return acwAgtsCnsdrdIdle;
    }

    /**
     * Sets the value of the acwAgtsCnsdrdIdle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACWAgtsCnsdrdIdle(String value) {
        this.acwAgtsCnsdrdIdle = value;
    }

    /**
     * Gets the value of the callSlectnMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallSlectnMeasure() {
        return callSlectnMeasure;
    }

    /**
     * Sets the value of the callSlectnMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallSlectnMeasure(String value) {
        this.callSlectnMeasure = value;
    }

    /**
     * Gets the value of the servLvlSprClSelOv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServLvlSprClSelOv() {
        return servLvlSprClSelOv;
    }

    /**
     * Sets the value of the servLvlSprClSelOv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServLvlSprClSelOv(String value) {
        this.servLvlSprClSelOv = value;
    }

    /**
     * Gets the value of the maxExCallLogStati property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxExCallLogStati() {
        return maxExCallLogStati;
    }

    /**
     * Sets the value of the maxExCallLogStati property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxExCallLogStati(String value) {
        this.maxExCallLogStati = value;
    }

    /**
     * Gets the value of the autoReserveAgents property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoReserveAgents() {
        return autoReserveAgents;
    }

    /**
     * Sets the value of the autoReserveAgents property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutoReserveAgents(String value) {
        this.autoReserveAgents = value;
    }

    /**
     * Gets the value of the cpyASAIUUIConfTra property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpyASAIUUIConfTra() {
        return cpyASAIUUIConfTra;
    }

    /**
     * Sets the value of the cpyASAIUUIConfTra property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpyASAIUUIConfTra(String value) {
        this.cpyASAIUUIConfTra = value;
    }

    /**
     * Gets the value of the auxWrkRsnCodeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuxWrkRsnCodeType() {
        return auxWrkRsnCodeType;
    }

    /**
     * Sets the value of the auxWrkRsnCodeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuxWrkRsnCodeType(String value) {
        this.auxWrkRsnCodeType = value;
    }

    /**
     * Gets the value of the logoutRsnCodeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogoutRsnCodeType() {
        return logoutRsnCodeType;
    }

    /**
     * Sets the value of the logoutRsnCodeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogoutRsnCodeType(String value) {
        this.logoutRsnCodeType = value;
    }

    /**
     * Gets the value of the adjunctCMSRelease property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdjunctCMSRelease() {
        return adjunctCMSRelease;
    }

    /**
     * Sets the value of the adjunctCMSRelease property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdjunctCMSRelease(String value) {
        this.adjunctCMSRelease = value;
    }

    /**
     * Gets the value of the acdLgnIdentiLgth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACDLgnIdentiLgth() {
        return acdLgnIdentiLgth;
    }

    /**
     * Sets the value of the acdLgnIdentiLgth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACDLgnIdentiLgth(String value) {
        this.acdLgnIdentiLgth = value;
    }

    /**
     * Gets the value of the bcmsVuStatLgnIDs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBCMSVuStatLgnIDs() {
        return bcmsVuStatLgnIDs;
    }

    /**
     * Sets the value of the bcmsVuStatLgnIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBCMSVuStatLgnIDs(String value) {
        this.bcmsVuStatLgnIDs = value;
    }

    /**
     * Gets the value of the bcmsVuStatMsrtInt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBCMSVuStatMsrtInt() {
        return bcmsVuStatMsrtInt;
    }

    /**
     * Sets the value of the bcmsVuStatMsrtInt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBCMSVuStatMsrtInt(String value) {
        this.bcmsVuStatMsrtInt = value;
    }

    /**
     * Gets the value of the bcmsVuStatAbClTrS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBCMSVuStatAbClTrS() {
        return bcmsVuStatAbClTrS;
    }

    /**
     * Sets the value of the bcmsVuStatAbClTrS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBCMSVuStatAbClTrS(String value) {
        this.bcmsVuStatAbClTrS = value;
    }

    /**
     * Gets the value of the vdBCMSVuStatLgnID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVdBCMSVuStatLgnID() {
        return vdBCMSVuStatLgnID;
    }

    /**
     * Sets the value of the vdBCMSVuStatLgnID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVdBCMSVuStatLgnID(String value) {
        this.vdBCMSVuStatLgnID = value;
    }

    /**
     * Gets the value of the msgWaitIndExtCall property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgWaitIndExtCall() {
        return msgWaitIndExtCall;
    }

    /**
     * Sets the value of the msgWaitIndExtCall property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgWaitIndExtCall(String value) {
        this.msgWaitIndExtCall = value;
    }

    /**
     * Gets the value of the clrVuStatsSftData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClrVuStatsSftData() {
        return clrVuStatsSftData;
    }

    /**
     * Sets the value of the clrVuStatsSftData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClrVuStatsSftData(String value) {
        this.clrVuStatsSftData = value;
    }

    /**
     * Gets the value of the remIaBCMSVuStatAg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemIaBCMSVuStatAg() {
        return remIaBCMSVuStatAg;
    }

    /**
     * Sets the value of the remIaBCMSVuStatAg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemIaBCMSVuStatAg(String value) {
        this.remIaBCMSVuStatAg = value;
    }

    /**
     * Gets the value of the swHkQryRepnsTimeo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSwHkQryRepnsTimeo() {
        return swHkQryRepnsTimeo;
    }

    /**
     * Sets the value of the swHkQryRepnsTimeo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSwHkQryRepnsTimeo(String value) {
        this.swHkQryRepnsTimeo = value;
    }

    /**
     * Gets the value of the autanrIPFailAxReC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutanrIPFailAxReC() {
        return autanrIPFailAxReC;
    }

    /**
     * Sets the value of the autanrIPFailAxReC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutanrIPFailAxReC(String value) {
        this.autanrIPFailAxReC = value;
    }

    /**
     * Gets the value of the maxAgtOccupPercen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxAgtOccupPercen() {
        return maxAgtOccupPercen;
    }

    /**
     * Sets the value of the maxAgtOccupPercen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxAgtOccupPercen(String value) {
        this.maxAgtOccupPercen = value;
    }

    /**
     * Gets the value of the maxAgtOccupAuxReC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxAgtOccupAuxReC() {
        return maxAgtOccupAuxReC;
    }

    /**
     * Sets the value of the maxAgtOccupAuxReC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxAgtOccupAuxReC(String value) {
        this.maxAgtOccupAuxReC = value;
    }

    /**
     * Gets the value of the autoExclusionCOS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoExclusionCOS() {
        return autoExclusionCOS;
    }

    /**
     * Sets the value of the autoExclusionCOS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutoExclusionCOS(String value) {
        this.autoExclusionCOS = value;
    }

    /**
     * Gets the value of the autoExclnCovrHold property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoExclnCovrHold() {
        return autoExclnCovrHold;
    }

    /**
     * Sets the value of the autoExclnCovrHold property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutoExclnCovrHold(String value) {
        this.autoExclnCovrHold = value;
    }

    /**
     * Gets the value of the autoExclnWhispPag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoExclnWhispPag() {
        return autoExclnWhispPag;
    }

    /**
     * Sets the value of the autoExclnWhispPag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutoExclnWhispPag(String value) {
        this.autoExclnWhispPag = value;
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
     * Gets the value of the drnCallTmrDispSec property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrnCallTmrDispSec() {
        return drnCallTmrDispSec;
    }

    /**
     * Sets the value of the drnCallTmrDispSec property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrnCallTmrDispSec(String value) {
        this.drnCallTmrDispSec = value;
    }

    /**
     * Gets the value of the dirIpIpAudioConne property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirIpIpAudioConne() {
        return dirIpIpAudioConne;
    }

    /**
     * Sets the value of the dirIpIpAudioConne property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirIpIpAudioConne(String value) {
        this.dirIpIpAudioConne = value;
    }

    /**
     * Gets the value of the ipAudioHairpinnig property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPAudioHairpinnig() {
        return ipAudioHairpinnig;
    }

    /**
     * Sets the value of the ipAudioHairpinnig property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPAudioHairpinnig(String value) {
        this.ipAudioHairpinnig = value;
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
     * Gets the value of the t2BckSigActnTirSe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getT2BckSigActnTirSe() {
        return t2BckSigActnTirSe;
    }

    /**
     * Sets the value of the t2BckSigActnTirSe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setT2BckSigActnTirSe(String value) {
        this.t2BckSigActnTirSe = value;
    }

    /**
     * Gets the value of the probtBrdgCalDtaPr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProbtBrdgCalDtaPr() {
        return probtBrdgCalDtaPr;
    }

    /**
     * Sets the value of the probtBrdgCalDtaPr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProbtBrdgCalDtaPr(String value) {
        this.probtBrdgCalDtaPr = value;
    }

    /**
     * Gets the value of the enhAbrDialLen34 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnhAbrDialLen34() {
        return enhAbrDialLen34;
    }

    /**
     * Sets the value of the enhAbrDialLen34 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnhAbrDialLen34(String value) {
        this.enhAbrDialLen34 = value;
    }

    /**
     * Gets the value of the recSubFailHisLog property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecSubFailHisLog() {
        return recSubFailHisLog;
    }

    /**
     * Sets the value of the recSubFailHisLog property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecSubFailHisLog(String value) {
        this.recSubFailHisLog = value;
    }

    /**
     * Gets the value of the recPMSADTraHisLog property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecPMSADTraHisLog() {
        return recPMSADTraHisLog;
    }

    /**
     * Sets the value of the recPMSADTraHisLog property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecPMSADTraHisLog(String value) {
        this.recPMSADTraHisLog = value;
    }

    /**
     * Gets the value of the recIPRegHisLog property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecIPRegHisLog() {
        return recIPRegHisLog;
    }

    /**
     * Sets the value of the recIPRegHisLog property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecIPRegHisLog(String value) {
        this.recIPRegHisLog = value;
    }

    /**
     * Gets the value of the defMulOutTrParSel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefMulOutTrParSel() {
        return defMulOutTrParSel;
    }

    /**
     * Sets the value of the defMulOutTrParSel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefMulOutTrParSel(String value) {
        this.defMulOutTrParSel = value;
    }

    /**
     * Gets the value of the ttiEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTTIEnabled() {
        return ttiEnabled;
    }

    /**
     * Sets the value of the ttiEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTTIEnabled(String value) {
        this.ttiEnabled = value;
    }

    /**
     * Gets the value of the ttiState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTTIState() {
        return ttiState;
    }

    /**
     * Sets the value of the ttiState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTTIState(String value) {
        this.ttiState = value;
    }

    /**
     * Gets the value of the ttiSecurityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTTISecurityCode() {
        return ttiSecurityCode;
    }

    /**
     * Sets the value of the ttiSecurityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTTISecurityCode(String value) {
        this.ttiSecurityCode = value;
    }

    /**
     * Gets the value of the doPstAsrFailRryLt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDOPstAsrFailRryLt() {
        return doPstAsrFailRryLt;
    }

    /**
     * Sets the value of the doPstAsrFailRryLt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDOPstAsrFailRryLt(String value) {
        this.doPstAsrFailRryLt = value;
    }

    /**
     * Gets the value of the trunkTrunkTransf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrunkTrunkTransf() {
        return trunkTrunkTransf;
    }

    /**
     * Sets the value of the trunkTrunkTransf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrunkTrunkTransf(String value) {
        this.trunkTrunkTransf = value;
    }

    /**
     * Gets the value of the conPwdQryTOutsecs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConPwdQryTOutsecs() {
        return conPwdQryTOutsecs;
    }

    /**
     * Sets the value of the conPwdQryTOutsecs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConPwdQryTOutsecs(String value) {
        this.conPwdQryTOutsecs = value;
    }

    /**
     * Gets the value of the doFailRtryItrlMin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDOFailRtryItrlMin() {
        return doFailRtryItrlMin;
    }

    /**
     * Sets the value of the doFailRtryItrlMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDOFailRtryItrlMin(String value) {
        this.doFailRtryItrlMin = value;
    }

    /**
     * Gets the value of the doOvrlFalreRryLim property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDOOvrlFalreRryLim() {
        return doOvrlFalreRryLim;
    }

    /**
     * Sets the value of the doOvrlFalreRryLim property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDOOvrlFalreRryLim(String value) {
        this.doOvrlFalreRryLim = value;
    }

    /**
     * Gets the value of the musicToneonHold property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMusicToneonHold() {
        return musicToneonHold;
    }

    /**
     * Sets the value of the musicToneonHold property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMusicToneonHold(String value) {
        this.musicToneonHold = value;
    }

    /**
     * Gets the value of the musicToneonHoldMu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMusicToneonHoldMu() {
        return musicToneonHoldMu;
    }

    /**
     * Sets the value of the musicToneonHoldMu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMusicToneonHoldMu(String value) {
        this.musicToneonHoldMu = value;
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
     * Gets the value of the acaRefCalls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACARefCalls() {
        return acaRefCalls;
    }

    /**
     * Sets the value of the acaRefCalls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACARefCalls(String value) {
        this.acaRefCalls = value;
    }

    /**
     * Gets the value of the acaRefCallsLocPr1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACARefCallsLocPr1() {
        return acaRefCallsLocPr1;
    }

    /**
     * Sets the value of the acaRefCallsLocPr1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACARefCallsLocPr1(String value) {
        this.acaRefCallsLocPr1 = value;
    }

    /**
     * Gets the value of the acaRefCallsLocPr2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACARefCallsLocPr2() {
        return acaRefCallsLocPr2;
    }

    /**
     * Sets the value of the acaRefCallsLocPr2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACARefCallsLocPr2(String value) {
        this.acaRefCallsLocPr2 = value;
    }

    /**
     * Gets the value of the acaRefCallsLocPr3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACARefCallsLocPr3() {
        return acaRefCallsLocPr3;
    }

    /**
     * Sets the value of the acaRefCallsLocPr3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACARefCallsLocPr3(String value) {
        this.acaRefCallsLocPr3 = value;
    }

    /**
     * Gets the value of the acaRefCallsRemote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACARefCallsRemote() {
        return acaRefCallsRemote;
    }

    /**
     * Sets the value of the acaRefCallsRemote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACARefCallsRemote(String value) {
        this.acaRefCallsRemote = value;
    }

    /**
     * Gets the value of the acaRemotePBXIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACARemotePBXIdent() {
        return acaRemotePBXIdent;
    }

    /**
     * Sets the value of the acaRemotePBXIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACARemotePBXIdent(String value) {
        this.acaRemotePBXIdent = value;
    }

    /**
     * Gets the value of the acaReferDestinati property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACAReferDestinati() {
        return acaReferDestinati;
    }

    /**
     * Sets the value of the acaReferDestinati property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACAReferDestinati(String value) {
        this.acaReferDestinati = value;
    }

    /**
     * Gets the value of the acaShtHldTmOrgExt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACAShtHldTmOrgExt() {
        return acaShtHldTmOrgExt;
    }

    /**
     * Sets the value of the acaShtHldTmOrgExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACAShtHldTmOrgExt(String value) {
        this.acaShtHldTmOrgExt = value;
    }

    /**
     * Gets the value of the acaLngHldTmOrgExt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACALngHldTmOrgExt() {
        return acaLngHldTmOrgExt;
    }

    /**
     * Sets the value of the acaLngHldTmOrgExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACALngHldTmOrgExt(String value) {
        this.acaLngHldTmOrgExt = value;
    }

    /**
     * Gets the value of the tIsdnClBUrACASHTC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIsdnClBUrACASHTC() {
        return tIsdnClBUrACASHTC;
    }

    /**
     * Sets the value of the tIsdnClBUrACASHTC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIsdnClBUrACASHTC(String value) {
        this.tIsdnClBUrACASHTC = value;
    }

    /**
     * Gets the value of the cpnAniPSADisedSet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpnAniPSADisedSet() {
        return cpnAniPSADisedSet;
    }

    /**
     * Sets the value of the cpnAniPSADisedSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpnAniPSADisedSet(String value) {
        this.cpnAniPSADisedSet = value;
    }

    /**
     * Gets the value of the unnamedRegistrationsAndPSAForIPTelephones property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnnamedRegistrationsAndPSAForIPTelephones() {
        return unnamedRegistrationsAndPSAForIPTelephones;
    }

    /**
     * Sets the value of the unnamedRegistrationsAndPSAForIPTelephones property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnnamedRegistrationsAndPSAForIPTelephones(String value) {
        this.unnamedRegistrationsAndPSAForIPTelephones = value;
    }

    /**
     * Gets the value of the contTerResDoNtDsA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContTerResDoNtDsA() {
        return contTerResDoNtDsA;
    }

    /**
     * Sets the value of the contTerResDoNtDsA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContTerResDoNtDsA(String value) {
        this.contTerResDoNtDsA = value;
    }

    /**
     * Gets the value of the contTerResDoNtDsE property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContTerResDoNtDsE() {
        return contTerResDoNtDsE;
    }

    /**
     * Sets the value of the contTerResDoNtDsE property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContTerResDoNtDsE(String value) {
        this.contTerResDoNtDsE = value;
    }

    /**
     * Gets the value of the contOutResInrTrtA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContOutResInrTrtA() {
        return contOutResInrTrtA;
    }

    /**
     * Sets the value of the contOutResInrTrtA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContOutResInrTrtA(String value) {
        this.contOutResInrTrtA = value;
    }

    /**
     * Gets the value of the contOutResInrTrtE property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContOutResInrTrtE() {
        return contOutResInrTrtE;
    }

    /**
     * Sets the value of the contOutResInrTrtE property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContOutResInrTrtE(String value) {
        this.contOutResInrTrtE = value;
    }

    /**
     * Gets the value of the contStaStaRestricA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContStaStaRestricA() {
        return contStaStaRestricA;
    }

    /**
     * Sets the value of the contStaStaRestricA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContStaStaRestricA(String value) {
        this.contStaStaRestricA = value;
    }

    /**
     * Gets the value of the contStaStaRestricE property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContStaStaRestricE() {
        return contStaStaRestricE;
    }

    /**
     * Sets the value of the contStaStaRestricE property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContStaStaRestricE(String value) {
        this.contStaStaRestricE = value;
    }

    /**
     * Gets the value of the contTollResIrtTr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContTollResIrtTr() {
        return contTollResIrtTr;
    }

    /**
     * Sets the value of the contTollResIrtTr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContTollResIrtTr(String value) {
        this.contTollResIrtTr = value;
    }

    /**
     * Gets the value of the contTollResIrtTrA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContTollResIrtTrA() {
        return contTollResIrtTrA;
    }

    /**
     * Sets the value of the contTollResIrtTrA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContTollResIrtTrA(String value) {
        this.contTollResIrtTrA = value;
    }

    /**
     * Gets the value of the contTollResIrtTrE property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContTollResIrtTrE() {
        return contTollResIrtTrE;
    }

    /**
     * Sets the value of the contTollResIrtTrE property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContTollResIrtTrE(String value) {
        this.contTollResIrtTrE = value;
    }

    /**
     * Gets the value of the invldNumDldItrcTA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvldNumDldItrcTA() {
        return invldNumDldItrcTA;
    }

    /**
     * Sets the value of the invldNumDldItrcTA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvldNumDldItrcTA(String value) {
        this.invldNumDldItrcTA = value;
    }

    /**
     * Gets the value of the announcement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnnouncement() {
        return announcement;
    }

    /**
     * Sets the value of the announcement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnnouncement(String value) {
        this.announcement = value;
    }

    /**
     * Gets the value of the vmHuntGroupExt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVMHuntGroupExt() {
        return vmHuntGroupExt;
    }

    /**
     * Sets the value of the vmHuntGroupExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVMHuntGroupExt(String value) {
        this.vmHuntGroupExt = value;
    }

    /**
     * Gets the value of the maximumLength property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumLength() {
        return maximumLength;
    }

    /**
     * Sets the value of the maximumLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumLength(String value) {
        this.maximumLength = value;
    }

    /**
     * Gets the value of the minimumDigLength property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinimumDigLength() {
        return minimumDigLength;
    }

    /**
     * Sets the value of the minimumDigLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinimumDigLength(String value) {
        this.minimumDigLength = value;
    }

    /**
     * Gets the value of the repCallWaitInterv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepCallWaitInterv() {
        return repCallWaitInterv;
    }

    /**
     * Sets the value of the repCallWaitInterv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepCallWaitInterv(String value) {
        this.repCallWaitInterv = value;
    }

    /**
     * Gets the value of the applyInrcptLocal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplyInrcptLocal() {
        return applyInrcptLocal;
    }

    /**
     * Sets the value of the applyInrcptLocal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplyInrcptLocal(String value) {
        this.applyInrcptLocal = value;
    }

    /**
     * Gets the value of the enforcePNTPNTRest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnforcePNTPNTRest() {
        return enforcePNTPNTRest;
    }

    /**
     * Sets the value of the enforcePNTPNTRest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnforcePNTPNTRest(String value) {
        this.enforcePNTPNTRest = value;
    }

    /**
     * Gets the value of the numbSessionwAllo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumbSessionwAllo() {
        return numbSessionwAllo;
    }

    /**
     * Sets the value of the numbSessionwAllo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumbSessionwAllo(String value) {
        this.numbSessionwAllo = value;
    }

    /**
     * Gets the value of the congestionTimer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCongestionTimer() {
        return congestionTimer;
    }

    /**
     * Sets the value of the congestionTimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCongestionTimer(String value) {
        this.congestionTimer = value;
    }

    /**
     * Gets the value of the sessTimeout property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessTimeout() {
        return sessTimeout;
    }

    /**
     * Sets the value of the sessTimeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessTimeout(String value) {
        this.sessTimeout = value;
    }

    /**
     * Gets the value of the congnClearedTr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCongnClearedTr() {
        return congnClearedTr;
    }

    /**
     * Sets the value of the congnClearedTr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCongnClearedTr(String value) {
        this.congnClearedTr = value;
    }

    /**
     * Gets the value of the signalingGroupLt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignalingGroupLt() {
        return signalingGroupLt;
    }

    /**
     * Sets the value of the signalingGroupLt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignalingGroupLt(String value) {
        this.signalingGroupLt = value;
    }

    /**
     * Gets the value of the dcsMessageFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDCSMessageFormat() {
        return dcsMessageFormat;
    }

    /**
     * Sets the value of the dcsMessageFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDCSMessageFormat(String value) {
        this.dcsMessageFormat = value;
    }

    /**
     * Gets the value of the delay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelay() {
        return delay;
    }

    /**
     * Sets the value of the delay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelay(String value) {
        this.delay = value;
    }

    /**
     * Gets the value of the clearCallrInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClearCallrInfo() {
        return clearCallrInfo;
    }

    /**
     * Sets the value of the clearCallrInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClearCallrInfo(String value) {
        this.clearCallrInfo = value;
    }

    /**
     * Gets the value of the sysParRingerOffwithAuto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSysParRingerOffwithAuto() {
        return sysParRingerOffwithAuto;
    }

    /**
     * Sets the value of the sysParRingerOffwithAuto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSysParRingerOffwithAuto(String value) {
        this.sysParRingerOffwithAuto = value;
    }

    /**
     * Gets the value of the recCTAPSATTIHisLg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecCTAPSATTIHisLg() {
        return recCTAPSATTIHisLg;
    }

    /**
     * Sets the value of the recCTAPSATTIHisLg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecCTAPSATTIHisLg(String value) {
        this.recCTAPSATTIHisLg = value;
    }

    /**
     * Gets the value of the enhPSALocDisIfoEn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnhPSALocDisIfoEn() {
        return enhPSALocDisIfoEn;
    }

    /**
     * Sets the value of the enhPSALocDisIfoEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnhPSALocDisIfoEn(String value) {
        this.enhPSALocDisIfoEn = value;
    }

    /**
     * Gets the value of the autoCallbNoAnTOIn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoCallbNoAnTOIn() {
        return autoCallbNoAnTOIn;
    }

    /**
     * Sets the value of the autoCallbNoAnTOIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutoCallbNoAnTOIn(String value) {
        this.autoCallbNoAnTOIn = value;
    }

    /**
     * Gets the value of the defCORPSADissSets property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefCORPSADissSets() {
        return defCORPSADissSets;
    }

    /**
     * Sets the value of the defCORPSADissSets property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefCORPSADissSets(String value) {
        this.defCORPSADissSets = value;
    }

    /**
     * Gets the value of the ctaEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCTAEnabled() {
        return ctaEnabled;
    }

    /**
     * Sets the value of the ctaEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCTAEnabled(String value) {
        this.ctaEnabled = value;
    }

    /**
     * Gets the value of the resSlotAttPriQue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResSlotAttPriQue() {
        return resSlotAttPriQue;
    }

    /**
     * Sets the value of the resSlotAttPriQue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResSlotAttPriQue(String value) {
        this.resSlotAttPriQue = value;
    }

    /**
     * Gets the value of the timebfrOffhookAlt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimebfrOffhookAlt() {
        return timebfrOffhookAlt;
    }

    /**
     * Sets the value of the timebfrOffhookAlt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimebfrOffhookAlt(String value) {
        this.timebfrOffhookAlt = value;
    }

    /**
     * Gets the value of the emergAccRedirExt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmergAccRedirExt() {
        return emergAccRedirExt;
    }

    /**
     * Sets the value of the emergAccRedirExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmergAccRedirExt(String value) {
        this.emergAccRedirExt = value;
    }

    /**
     * Gets the value of the emergClsAldAttQue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmergClsAldAttQue() {
        return emergClsAldAttQue;
    }

    /**
     * Sets the value of the emergClsAldAttQue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmergClsAldAttQue(String value) {
        this.emergClsAldAttQue = value;
    }

    /**
     * Gets the value of the callPickupAlert property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallPickupAlert() {
        return callPickupAlert;
    }

    /**
     * Sets the value of the callPickupAlert property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallPickupAlert(String value) {
        this.callPickupAlert = value;
    }

    /**
     * Gets the value of the tempBrgApcClPickU property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTempBrgApcClPickU() {
        return tempBrgApcClPickU;
    }

    /**
     * Sets the value of the tempBrgApcClPickU property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTempBrgApcClPickU(String value) {
        this.tempBrgApcClPickU = value;
    }

    /**
     * Gets the value of the callPickupIntrcmC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallPickupIntrcmC() {
        return callPickupIntrcmC;
    }

    /**
     * Sets the value of the callPickupIntrcmC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallPickupIntrcmC(String value) {
        this.callPickupIntrcmC = value;
    }

    /**
     * Gets the value of the directedCallPckup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectedCallPckup() {
        return directedCallPckup;
    }

    /**
     * Sets the value of the directedCallPckup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectedCallPckup(String value) {
        this.directedCallPckup = value;
    }

    /**
     * Gets the value of the callPrkTOInterMin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallPrkTOInterMin() {
        return callPrkTOInterMin;
    }

    /**
     * Sets the value of the callPrkTOInterMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallPrkTOInterMin(String value) {
        this.callPrkTOInterMin = value;
    }

    /**
     * Gets the value of the extGroupCallPckup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtGroupCallPckup() {
        return extGroupCallPckup;
    }

    /**
     * Sets the value of the extGroupCallPckup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtGroupCallPckup(String value) {
        this.extGroupCallPckup = value;
    }

    /**
     * Gets the value of the dxPagCalPkTimOrig property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDxPagCalPkTimOrig() {
        return dxPagCalPkTimOrig;
    }

    /**
     * Sets the value of the dxPagCalPkTimOrig property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDxPagCalPkTimOrig(String value) {
        this.dxPagCalPkTimOrig = value;
    }

    /**
     * Gets the value of the contOutResInrTrmt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContOutResInrTrmt() {
        return contOutResInrTrmt;
    }

    /**
     * Sets the value of the contOutResInrTrmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContOutResInrTrmt(String value) {
        this.contOutResInrTrmt = value;
    }

    /**
     * Gets the value of the contTerResDoNtDst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContTerResDoNtDst() {
        return contTerResDoNtDst;
    }

    /**
     * Sets the value of the contTerResDoNtDst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContTerResDoNtDst(String value) {
        this.contTerResDoNtDst = value;
    }

    /**
     * Gets the value of the contStaStaRestric property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContStaStaRestric() {
        return contStaStaRestric;
    }

    /**
     * Sets the value of the contStaStaRestric property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContStaStaRestric(String value) {
        this.contStaStaRestric = value;
    }

    /**
     * Gets the value of the authCodesEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthCodesEnabled() {
        return authCodesEnabled;
    }

    /**
     * Sets the value of the authCodesEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthCodesEnabled(String value) {
        this.authCodesEnabled = value;
    }

    /**
     * Gets the value of the authCodeLength property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthCodeLength() {
        return authCodeLength;
    }

    /**
     * Sets the value of the authCodeLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthCodeLength(String value) {
        this.authCodeLength = value;
    }

    /**
     * Gets the value of the authCodeCancelSym property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthCodeCancelSym() {
        return authCodeCancelSym;
    }

    /**
     * Sets the value of the authCodeCancelSym property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthCodeCancelSym(String value) {
        this.authCodeCancelSym = value;
    }

    /**
     * Gets the value of the atteTimeOutFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAtteTimeOutFlag() {
        return atteTimeOutFlag;
    }

    /**
     * Sets the value of the atteTimeOutFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAtteTimeOutFlag(String value) {
        this.atteTimeOutFlag = value;
    }

    /**
     * Gets the value of the displAuthorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplAuthorCode() {
        return displAuthorCode;
    }

    /**
     * Sets the value of the displAuthorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplAuthorCode(String value) {
        this.displAuthorCode = value;
    }

    /**
     * Gets the value of the offPmTnDctTOInSec property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffPmTnDctTOInSec() {
        return offPmTnDctTOInSec;
    }

    /**
     * Sets the value of the offPmTnDctTOInSec property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffPmTnDctTOInSec(String value) {
        this.offPmTnDctTOInSec = value;
    }

    /**
     * Gets the value of the contrTollResRepla property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContrTollResRepla() {
        return contrTollResRepla;
    }

    /**
     * Sets the value of the contrTollResRepla property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContrTollResRepla(String value) {
        this.contrTollResRepla = value;
    }

    /**
     * Gets the value of the sysPrinterEndpoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSysPrinterEndpoint() {
        return sysPrinterEndpoint;
    }

    /**
     * Sets the value of the sysPrinterEndpoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSysPrinterEndpoint(String value) {
        this.sysPrinterEndpoint = value;
    }

    /**
     * Gets the value of the linesPerPage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinesPerPage() {
        return linesPerPage;
    }

    /**
     * Sets the value of the linesPerPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinesPerPage(String value) {
        this.linesPerPage = value;
    }

    /**
     * Gets the value of the emerExtForwMin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmerExtForwMin() {
        return emerExtForwMin;
    }

    /**
     * Sets the value of the emerExtForwMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmerExtForwMin(String value) {
        this.emerExtForwMin = value;
    }

    /**
     * Gets the value of the switchName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSwitchName() {
        return switchName;
    }

    /**
     * Sets the value of the switchName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSwitchName(String value) {
        this.switchName = value;
    }

    /**
     * Gets the value of the applyMCTWarnTone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplyMCTWarnTone() {
        return applyMCTWarnTone;
    }

    /**
     * Sets the value of the applyMCTWarnTone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplyMCTWarnTone(String value) {
        this.applyMCTWarnTone = value;
    }

    /**
     * Gets the value of the mctVoiceRecTrGrp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMCTVoiceRecTrGrp() {
        return mctVoiceRecTrGrp;
    }

    /**
     * Sets the value of the mctVoiceRecTrGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMCTVoiceRecTrGrp(String value) {
        this.mctVoiceRecTrGrp = value;
    }

    /**
     * Gets the value of the delSendRelSecs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelSendRelSecs() {
        return delSendRelSecs;
    }

    /**
     * Sets the value of the delSendRelSecs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelSendRelSecs(String value) {
        this.delSendRelSecs = value;
    }

    /**
     * Gets the value of the sendAllCallsAppls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendAllCallsAppls() {
        return sendAllCallsAppls;
    }

    /**
     * Sets the value of the sendAllCallsAppls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendAllCallsAppls(String value) {
        this.sendAllCallsAppls = value;
    }

    /**
     * Gets the value of the autoInspectSACs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoInspectSACs() {
        return autoInspectSACs;
    }

    /**
     * Sets the value of the autoInspectSACs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutoInspectSACs(String value) {
        this.autoInspectSACs = value;
    }

    /**
     * Gets the value of the aararsDialToneReq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAARARSDialToneReq() {
        return aararsDialToneReq;
    }

    /**
     * Sets the value of the aararsDialToneReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAARARSDialToneReq(String value) {
        this.aararsDialToneReq = value;
    }

    /**
     * Gets the value of the createUCID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateUCID() {
        return createUCID;
    }

    /**
     * Sets the value of the createUCID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateUCID(String value) {
        this.createUCID = value;
    }

    /**
     * Gets the value of the ucidNetworkNodeID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUCIDNetworkNodeID() {
        return ucidNetworkNodeID;
    }

    /**
     * Sets the value of the ucidNetworkNodeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUCIDNetworkNodeID(String value) {
        this.ucidNetworkNodeID = value;
    }

    /**
     * Gets the value of the pblcNetTrkCnfCall property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPblcNetTrkCnfCall() {
        return pblcNetTrkCnfCall;
    }

    /**
     * Sets the value of the pblcNetTrkCnfCall property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPblcNetTrkCnfCall(String value) {
        this.pblcNetTrkCnfCall = value;
    }

    /**
     * Gets the value of the cnfPrtPubNrkTrk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCnfPrtPubNrkTrk() {
        return cnfPrtPubNrkTrk;
    }

    /**
     * Sets the value of the cnfPrtPubNrkTrk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCnfPrtPubNrkTrk(String value) {
        this.cnfPrtPubNrkTrk = value;
    }

    /**
     * Gets the value of the cnfPrtWoPubNrkTrk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCnfPrtWoPubNrkTrk() {
        return cnfPrtWoPubNrkTrk;
    }

    /**
     * Sets the value of the cnfPrtWoPubNrkTrk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCnfPrtWoPubNrkTrk(String value) {
        this.cnfPrtWoPubNrkTrk = value;
    }

    /**
     * Gets the value of the nightSerDisTimeSc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNightSerDisTimeSc() {
        return nightSerDisTimeSc;
    }

    /**
     * Sets the value of the nightSerDisTimeSc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNightSerDisTimeSc(String value) {
        this.nightSerDisTimeSc = value;
    }

    /**
     * Gets the value of the shrtInrdgtTimerSc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShrtInrdgtTimerSc() {
        return shrtInrdgtTimerSc;
    }

    /**
     * Sets the value of the shrtInrdgtTimerSc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShrtInrdgtTimerSc(String value) {
        this.shrtInrdgtTimerSc = value;
    }

    /**
     * Gets the value of the uAnsDIDCalTmrSecs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUAnsDIDCalTmrSecs() {
        return uAnsDIDCalTmrSecs;
    }

    /**
     * Sets the value of the uAnsDIDCalTmrSecs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUAnsDIDCalTmrSecs(String value) {
        this.uAnsDIDCalTmrSecs = value;
    }

    /**
     * Gets the value of the lnItrcptToneTmrSc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLnItrcptToneTmrSc() {
        return lnItrcptToneTmrSc;
    }

    /**
     * Sets the value of the lnItrcptToneTmrSc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLnItrcptToneTmrSc(String value) {
        this.lnItrcptToneTmrSc = value;
    }

    /**
     * Gets the value of the lngHldRecTmerSecs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLngHldRecTmerSecs() {
        return lngHldRecTmerSecs;
    }

    /**
     * Sets the value of the lngHldRecTmerSecs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLngHldRecTmerSecs(String value) {
        this.lngHldRecTmerSecs = value;
    }

    /**
     * Gets the value of the musicSlnceTraTrnk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMusicSlnceTraTrnk() {
        return musicSlnceTraTrnk;
    }

    /**
     * Sets the value of the musicSlnceTraTrnk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMusicSlnceTraTrnk(String value) {
        this.musicSlnceTraTrnk = value;
    }

    /**
     * Gets the value of the rstShftTmrSecs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRstShftTmrSecs() {
        return rstShftTmrSecs;
    }

    /**
     * Sets the value of the rstShftTmrSecs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRstShftTmrSecs(String value) {
        this.rstShftTmrSecs = value;
    }

    /**
     * Gets the value of the staCallTnsRclTrSc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStaCallTnsRclTrSc() {
        return staCallTnsRclTrSc;
    }

    /**
     * Sets the value of the staCallTnsRclTrSc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStaCallTnsRclTrSc(String value) {
        this.staCallTnsRclTrSc = value;
    }

    /**
     * Gets the value of the didBusyTreatment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDIDBusyTreatment() {
        return didBusyTreatment;
    }

    /**
     * Sets the value of the didBusyTreatment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDIDBusyTreatment(String value) {
        this.didBusyTreatment = value;
    }

    /**
     * Gets the value of the invldNumDldItrcTr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvldNumDldItrcTr() {
        return invldNumDldItrcTr;
    }

    /**
     * Sets the value of the invldNumDldItrcTr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvldNumDldItrcTr(String value) {
        this.invldNumDldItrcTr = value;
    }

    /**
     * Gets the value of the alAarArsAcDidDiod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlAarArsAcDidDiod() {
        return alAarArsAcDidDiod;
    }

    /**
     * Sets the value of the alAarArsAcDidDiod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlAarArsAcDidDiod(String value) {
        this.alAarArsAcDidDiod = value;
    }

    /**
     * Gets the value of the alANIResAARARS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlANIResAARARS() {
        return alANIResAARARS;
    }

    /**
     * Sets the value of the alANIResAARARS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlANIResAARARS(String value) {
        this.alANIResAARARS = value;
    }

    /**
     * Gets the value of the useTrCOROutTrDsct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseTrCOROutTrDsct() {
        return useTrCOROutTrDsct;
    }

    /**
     * Sets the value of the useTrCOROutTrDsct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseTrCOROutTrDsct(String value) {
        this.useTrCOROutTrDsct = value;
    }

    /**
     * Gets the value of the numericDisplay7405ND property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumericDisplay7405ND() {
        return numericDisplay7405ND;
    }

    /**
     * Sets the value of the numericDisplay7405ND property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumericDisplay7405ND(String value) {
        this.numericDisplay7405ND = value;
    }

    /**
     * Gets the value of the numericDisplay7434ND property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumericDisplay7434ND() {
        return numericDisplay7434ND;
    }

    /**
     * Sets the value of the numericDisplay7434ND property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumericDisplay7434ND(String value) {
        this.numericDisplay7434ND = value;
    }

    /**
     * Gets the value of the autoStart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoStart() {
        return autoStart;
    }

    /**
     * Sets the value of the autoStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutoStart(String value) {
        this.autoStart = value;
    }

    /**
     * Gets the value of the autoHold property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoHold() {
        return autoHold;
    }

    /**
     * Sets the value of the autoHold property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutoHold(String value) {
        this.autoHold = value;
    }

    /**
     * Gets the value of the emuInactivityInterval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMUInactivityInterval() {
        return emuInactivityInterval;
    }

    /**
     * Sets the value of the emuInactivityInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMUInactivityInterval(String value) {
        this.emuInactivityInterval = value;
    }

    /**
     * Gets the value of the didTieISDNSIPInTr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDIDTieISDNSIPInTr() {
        return didTieISDNSIPInTr;
    }

    /**
     * Sets the value of the didTieISDNSIPInTr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDIDTieISDNSIPInTr(String value) {
        this.didTieISDNSIPInTr = value;
    }

    /**
     * Gets the value of the attendantTone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttendantTone() {
        return attendantTone;
    }

    /**
     * Sets the value of the attendantTone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttendantTone(String value) {
        this.attendantTone = value;
    }

    /**
     * Gets the value of the bridgingTone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBridgingTone() {
        return bridgingTone;
    }

    /**
     * Sets the value of the bridgingTone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBridgingTone(String value) {
        this.bridgingTone = value;
    }

    /**
     * Gets the value of the conferenceTone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConferenceTone() {
        return conferenceTone;
    }

    /**
     * Sets the value of the conferenceTone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConferenceTone(String value) {
        this.conferenceTone = value;
    }

    /**
     * Gets the value of the intrusionTone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntrusionTone() {
        return intrusionTone;
    }

    /**
     * Sets the value of the intrusionTone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntrusionTone(String value) {
        this.intrusionTone = value;
    }

    /**
     * Gets the value of the specialDialTone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialDialTone() {
        return specialDialTone;
    }

    /**
     * Sets the value of the specialDialTone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialDialTone(String value) {
        this.specialDialTone = value;
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
     * Gets the value of the internal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternal() {
        return internal;
    }

    /**
     * Sets the value of the internal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternal(String value) {
        this.internal = value;
    }

    /**
     * Gets the value of the external property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternal() {
        return external;
    }

    /**
     * Sets the value of the external property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternal(String value) {
        this.external = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriority(String value) {
        this.priority = value;
    }

    /**
     * Gets the value of the intAtoAnAtdExtTra property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntAtoAnAtdExtTra() {
        return intAtoAnAtdExtTra;
    }

    /**
     * Sets the value of the intAtoAnAtdExtTra property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntAtoAnAtdExtTra(String value) {
        this.intAtoAnAtdExtTra = value;
    }

    /**
     * Gets the value of the attOriginateCalls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttOriginateCalls() {
        return attOriginateCalls;
    }

    /**
     * Sets the value of the attOriginateCalls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttOriginateCalls(String value) {
        this.attOriginateCalls = value;
    }

    /**
     * Gets the value of the dtmfTeFbkSglVRUCn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTMFTeFbkSglVRUCn() {
        return dtmfTeFbkSglVRUCn;
    }

    /**
     * Sets the value of the dtmfTeFbkSglVRUCn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTMFTeFbkSglVRUCn(String value) {
        this.dtmfTeFbkSglVRUCn = value;
    }

    /**
     * Gets the value of the disconnection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisconnection() {
        return disconnection;
    }

    /**
     * Sets the value of the disconnection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisconnection(String value) {
        this.disconnection = value;
    }

    /**
     * Gets the value of the abortTransfer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbortTransfer() {
        return abortTransfer;
    }

    /**
     * Sets the value of the abortTransfer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbortTransfer(String value) {
        this.abortTransfer = value;
    }

    /**
     * Gets the value of the transfrUponHangUp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransfrUponHangUp() {
        return transfrUponHangUp;
    }

    /**
     * Sets the value of the transfrUponHangUp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransfrUponHangUp(String value) {
        this.transfrUponHangUp = value;
    }

    /**
     * Gets the value of the abtConfUponHangUp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbtConfUponHangUp() {
        return abtConfUponHangUp;
    }

    /**
     * Sets the value of the abtConfUponHangUp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbtConfUponHangUp(String value) {
        this.abtConfUponHangUp = value;
    }

    /**
     * Gets the value of the noHoldConfTimeout property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoHoldConfTimeout() {
        return noHoldConfTimeout;
    }

    /**
     * Sets the value of the noHoldConfTimeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoHoldConfTimeout(String value) {
        this.noHoldConfTimeout = value;
    }

    /**
     * Gets the value of the noDialToneConfrnc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoDialToneConfrnc() {
        return noDialToneConfrnc;
    }

    /**
     * Sets the value of the noDialToneConfrnc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoDialToneConfrnc(String value) {
        this.noDialToneConfrnc = value;
    }

    /**
     * Gets the value of the selLnApprConfrnc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelLnApprConfrnc() {
        return selLnApprConfrnc;
    }

    /**
     * Sets the value of the selLnApprConfrnc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelLnApprConfrnc(String value) {
        this.selLnApprConfrnc = value;
    }

    /**
     * Gets the value of the unhold property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnhold() {
        return unhold;
    }

    /**
     * Sets the value of the unhold property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnhold(String value) {
        this.unhold = value;
    }

    /**
     * Gets the value of the allowTwoObserversInSameCall property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllowTwoObserversInSameCall() {
        return allowTwoObserversInSameCall;
    }

    /**
     * Sets the value of the allowTwoObserversInSameCall property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllowTwoObserversInSameCall(String value) {
        this.allowTwoObserversInSameCall = value;
    }

    /**
     * Gets the value of the serviceLevelAlgorithmForSLM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceLevelAlgorithmForSLM() {
        return serviceLevelAlgorithmForSLM;
    }

    /**
     * Sets the value of the serviceLevelAlgorithmForSLM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceLevelAlgorithmForSLM(String value) {
        this.serviceLevelAlgorithmForSLM = value;
    }

    /**
     * Gets the value of the externallyControlledDistribution property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternallyControlledDistribution() {
        return externallyControlledDistribution;
    }

    /**
     * Sets the value of the externallyControlledDistribution property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternallyControlledDistribution(String value) {
        this.externallyControlledDistribution = value;
    }

    /**
     * Gets the value of the ecdExceptionTimer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEcdExceptionTimer() {
        return ecdExceptionTimer;
    }

    /**
     * Sets the value of the ecdExceptionTimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEcdExceptionTimer(String value) {
        this.ecdExceptionTimer = value;
    }

    /**
     * Gets the value of the ecdServiceRouteTimer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getECDServiceRouteTimer() {
        return ecdServiceRouteTimer;
    }

    /**
     * Sets the value of the ecdServiceRouteTimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setECDServiceRouteTimer(String value) {
        this.ecdServiceRouteTimer = value;
    }

    /**
     * Gets the value of the stationSysWRetPn1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stationSysWRetPn1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStationSysWRetPn1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getStationSysWRetPn1() {
        if (stationSysWRetPn1 == null) {
            stationSysWRetPn1 = new ArrayList<ArrayType>();
        }
        return this.stationSysWRetPn1;
    }

    /**
     * Gets the value of the rdoCoDownlServPn1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rdoCoDownlServPn1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRdoCoDownlServPn1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getRdoCoDownlServPn1() {
        if (rdoCoDownlServPn1 == null) {
            rdoCoDownlServPn1 = new ArrayList<ArrayType>();
        }
        return this.rdoCoDownlServPn1;
    }

    /**
     * Gets the value of the dcsMessageFormat1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dcsMessageFormat1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDCSMessageFormat1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getDCSMessageFormat1() {
        if (dcsMessageFormat1 == null) {
            dcsMessageFormat1 = new ArrayList<ArrayType>();
        }
        return this.dcsMessageFormat1;
    }

}
