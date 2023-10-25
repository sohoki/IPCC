
package com.system.ipcc.pbx.avaya.smsxml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RegisteredIPStationsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegisteredIPStationsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Station_Extension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Set_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Product_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Product_Rel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Station_IP_Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Network_Region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Gatekeeper_IP_Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TCP_Skt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Orig_Port" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_1_Station_Extension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_1_Set_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_1_Product_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_1_Product_Rel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_1_Station_IP_Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_1_Network_Region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_1_Gatekeeper_IP_Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_1_TCP_Skt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_2_Station_Extension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_2_Set_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_2_Product_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_2_Product_Rel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_2_Station_IP_Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_2_Network_Region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_2_Gatekeeper_IP_Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_2_TCP_Skt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_3_Station_Extension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_3_Set_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_3_Product_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_3_Product_Rel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_3_Station_IP_Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_3_Network_Region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_3_Gatekeeper_IP_Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_3_TCP_Skt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_4_Station_Extension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_4_Set_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_4_Product_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_4_Product_Rel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_4_Station_IP_Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_4_Network_Region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_4_Gatekeeper_IP_Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_4_TCP_Skt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_5_Station_Extension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_5_Set_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_5_Product_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_5_Product_Rel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_5_Station_IP_Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_5_Network_Region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_5_Gatekeeper_IP_Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_5_TCP_Skt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_6_Station_Extension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_6_Set_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_6_Product_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_6_Product_Rel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_6_Station_IP_Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_6_Network_Region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_6_Gatekeeper_IP_Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_6_TCP_Skt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_7_Station_Extension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_7_Set_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_7_Product_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_7_Product_Rel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_7_Station_IP_Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_7_Network_Region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_7_Gatekeeper_IP_Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_7_TCP_Skt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_8_Station_Extension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_8_Set_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_8_Product_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_8_Product_Rel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_8_Station_IP_Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_8_Network_Region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_8_Gatekeeper_IP_Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_8_TCP_Skt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_9_Station_Extension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_9_Set_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_9_Product_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_9_Product_Rel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_9_Station_IP_Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_9_Network_Region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_9_Gatekeeper_IP_Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_9_TCP_Skt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_10_Station_Extension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_10_Set_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_10_Product_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_10_Product_Rel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_10_Station_IP_Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_10_Network_Region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_10_Gatekeeper_IP_Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_10_TCP_Skt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_11_Station_Extension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_11_Set_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_11_Product_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_11_Product_Rel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_11_Station_IP_Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_11_Network_Region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_11_Gatekeeper_IP_Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_11_TCP_Skt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_12_Station_Extension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_12_Set_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_12_Product_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_12_Product_Rel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_12_Station_IP_Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_12_Network_Region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_12_Gatekeeper_IP_Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared_12_TCP_Skt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegisteredIPStationsType", propOrder = {
    "stationExtension",
    "setType",
    "productID",
    "productRel",
    "stationIPAddress",
    "networkRegion",
    "gatekeeperIPAddress",
    "tcpSkt",
    "origPort",
    "shared1StationExtension",
    "shared1SetType",
    "shared1ProductID",
    "shared1ProductRel",
    "shared1StationIPAddress",
    "shared1NetworkRegion",
    "shared1GatekeeperIPAddress",
    "shared1TCPSkt",
    "shared2StationExtension",
    "shared2SetType",
    "shared2ProductID",
    "shared2ProductRel",
    "shared2StationIPAddress",
    "shared2NetworkRegion",
    "shared2GatekeeperIPAddress",
    "shared2TCPSkt",
    "shared3StationExtension",
    "shared3SetType",
    "shared3ProductID",
    "shared3ProductRel",
    "shared3StationIPAddress",
    "shared3NetworkRegion",
    "shared3GatekeeperIPAddress",
    "shared3TCPSkt",
    "shared4StationExtension",
    "shared4SetType",
    "shared4ProductID",
    "shared4ProductRel",
    "shared4StationIPAddress",
    "shared4NetworkRegion",
    "shared4GatekeeperIPAddress",
    "shared4TCPSkt",
    "shared5StationExtension",
    "shared5SetType",
    "shared5ProductID",
    "shared5ProductRel",
    "shared5StationIPAddress",
    "shared5NetworkRegion",
    "shared5GatekeeperIPAddress",
    "shared5TCPSkt",
    "shared6StationExtension",
    "shared6SetType",
    "shared6ProductID",
    "shared6ProductRel",
    "shared6StationIPAddress",
    "shared6NetworkRegion",
    "shared6GatekeeperIPAddress",
    "shared6TCPSkt",
    "shared7StationExtension",
    "shared7SetType",
    "shared7ProductID",
    "shared7ProductRel",
    "shared7StationIPAddress",
    "shared7NetworkRegion",
    "shared7GatekeeperIPAddress",
    "shared7TCPSkt",
    "shared8StationExtension",
    "shared8SetType",
    "shared8ProductID",
    "shared8ProductRel",
    "shared8StationIPAddress",
    "shared8NetworkRegion",
    "shared8GatekeeperIPAddress",
    "shared8TCPSkt",
    "shared9StationExtension",
    "shared9SetType",
    "shared9ProductID",
    "shared9ProductRel",
    "shared9StationIPAddress",
    "shared9NetworkRegion",
    "shared9GatekeeperIPAddress",
    "shared9TCPSkt",
    "shared10StationExtension",
    "shared10SetType",
    "shared10ProductID",
    "shared10ProductRel",
    "shared10StationIPAddress",
    "shared10NetworkRegion",
    "shared10GatekeeperIPAddress",
    "shared10TCPSkt",
    "shared11StationExtension",
    "shared11SetType",
    "shared11ProductID",
    "shared11ProductRel",
    "shared11StationIPAddress",
    "shared11NetworkRegion",
    "shared11GatekeeperIPAddress",
    "shared11TCPSkt",
    "shared12StationExtension",
    "shared12SetType",
    "shared12ProductID",
    "shared12ProductRel",
    "shared12StationIPAddress",
    "shared12NetworkRegion",
    "shared12GatekeeperIPAddress",
    "shared12TCPSkt"
})
public class RegisteredIPStationsType {

    @XmlElement(name = "Station_Extension")
    protected String stationExtension;
    @XmlElement(name = "Set_Type")
    protected String setType;
    @XmlElement(name = "Product_ID")
    protected String productID;
    @XmlElement(name = "Product_Rel")
    protected String productRel;
    @XmlElement(name = "Station_IP_Address")
    protected String stationIPAddress;
    @XmlElement(name = "Network_Region")
    protected String networkRegion;
    @XmlElement(name = "Gatekeeper_IP_Address")
    protected String gatekeeperIPAddress;
    @XmlElement(name = "TCP_Skt")
    protected String tcpSkt;
    @XmlElement(name = "Orig_Port")
    protected String origPort;
    @XmlElement(name = "Shared_1_Station_Extension")
    protected String shared1StationExtension;
    @XmlElement(name = "Shared_1_Set_Type")
    protected String shared1SetType;
    @XmlElement(name = "Shared_1_Product_ID")
    protected String shared1ProductID;
    @XmlElement(name = "Shared_1_Product_Rel")
    protected String shared1ProductRel;
    @XmlElement(name = "Shared_1_Station_IP_Address")
    protected String shared1StationIPAddress;
    @XmlElement(name = "Shared_1_Network_Region")
    protected String shared1NetworkRegion;
    @XmlElement(name = "Shared_1_Gatekeeper_IP_Address")
    protected String shared1GatekeeperIPAddress;
    @XmlElement(name = "Shared_1_TCP_Skt")
    protected String shared1TCPSkt;
    @XmlElement(name = "Shared_2_Station_Extension")
    protected String shared2StationExtension;
    @XmlElement(name = "Shared_2_Set_Type")
    protected String shared2SetType;
    @XmlElement(name = "Shared_2_Product_ID")
    protected String shared2ProductID;
    @XmlElement(name = "Shared_2_Product_Rel")
    protected String shared2ProductRel;
    @XmlElement(name = "Shared_2_Station_IP_Address")
    protected String shared2StationIPAddress;
    @XmlElement(name = "Shared_2_Network_Region")
    protected String shared2NetworkRegion;
    @XmlElement(name = "Shared_2_Gatekeeper_IP_Address")
    protected String shared2GatekeeperIPAddress;
    @XmlElement(name = "Shared_2_TCP_Skt")
    protected String shared2TCPSkt;
    @XmlElement(name = "Shared_3_Station_Extension")
    protected String shared3StationExtension;
    @XmlElement(name = "Shared_3_Set_Type")
    protected String shared3SetType;
    @XmlElement(name = "Shared_3_Product_ID")
    protected String shared3ProductID;
    @XmlElement(name = "Shared_3_Product_Rel")
    protected String shared3ProductRel;
    @XmlElement(name = "Shared_3_Station_IP_Address")
    protected String shared3StationIPAddress;
    @XmlElement(name = "Shared_3_Network_Region")
    protected String shared3NetworkRegion;
    @XmlElement(name = "Shared_3_Gatekeeper_IP_Address")
    protected String shared3GatekeeperIPAddress;
    @XmlElement(name = "Shared_3_TCP_Skt")
    protected String shared3TCPSkt;
    @XmlElement(name = "Shared_4_Station_Extension")
    protected String shared4StationExtension;
    @XmlElement(name = "Shared_4_Set_Type")
    protected String shared4SetType;
    @XmlElement(name = "Shared_4_Product_ID")
    protected String shared4ProductID;
    @XmlElement(name = "Shared_4_Product_Rel")
    protected String shared4ProductRel;
    @XmlElement(name = "Shared_4_Station_IP_Address")
    protected String shared4StationIPAddress;
    @XmlElement(name = "Shared_4_Network_Region")
    protected String shared4NetworkRegion;
    @XmlElement(name = "Shared_4_Gatekeeper_IP_Address")
    protected String shared4GatekeeperIPAddress;
    @XmlElement(name = "Shared_4_TCP_Skt")
    protected String shared4TCPSkt;
    @XmlElement(name = "Shared_5_Station_Extension")
    protected String shared5StationExtension;
    @XmlElement(name = "Shared_5_Set_Type")
    protected String shared5SetType;
    @XmlElement(name = "Shared_5_Product_ID")
    protected String shared5ProductID;
    @XmlElement(name = "Shared_5_Product_Rel")
    protected String shared5ProductRel;
    @XmlElement(name = "Shared_5_Station_IP_Address")
    protected String shared5StationIPAddress;
    @XmlElement(name = "Shared_5_Network_Region")
    protected String shared5NetworkRegion;
    @XmlElement(name = "Shared_5_Gatekeeper_IP_Address")
    protected String shared5GatekeeperIPAddress;
    @XmlElement(name = "Shared_5_TCP_Skt")
    protected String shared5TCPSkt;
    @XmlElement(name = "Shared_6_Station_Extension")
    protected String shared6StationExtension;
    @XmlElement(name = "Shared_6_Set_Type")
    protected String shared6SetType;
    @XmlElement(name = "Shared_6_Product_ID")
    protected String shared6ProductID;
    @XmlElement(name = "Shared_6_Product_Rel")
    protected String shared6ProductRel;
    @XmlElement(name = "Shared_6_Station_IP_Address")
    protected String shared6StationIPAddress;
    @XmlElement(name = "Shared_6_Network_Region")
    protected String shared6NetworkRegion;
    @XmlElement(name = "Shared_6_Gatekeeper_IP_Address")
    protected String shared6GatekeeperIPAddress;
    @XmlElement(name = "Shared_6_TCP_Skt")
    protected String shared6TCPSkt;
    @XmlElement(name = "Shared_7_Station_Extension")
    protected String shared7StationExtension;
    @XmlElement(name = "Shared_7_Set_Type")
    protected String shared7SetType;
    @XmlElement(name = "Shared_7_Product_ID")
    protected String shared7ProductID;
    @XmlElement(name = "Shared_7_Product_Rel")
    protected String shared7ProductRel;
    @XmlElement(name = "Shared_7_Station_IP_Address")
    protected String shared7StationIPAddress;
    @XmlElement(name = "Shared_7_Network_Region")
    protected String shared7NetworkRegion;
    @XmlElement(name = "Shared_7_Gatekeeper_IP_Address")
    protected String shared7GatekeeperIPAddress;
    @XmlElement(name = "Shared_7_TCP_Skt")
    protected String shared7TCPSkt;
    @XmlElement(name = "Shared_8_Station_Extension")
    protected String shared8StationExtension;
    @XmlElement(name = "Shared_8_Set_Type")
    protected String shared8SetType;
    @XmlElement(name = "Shared_8_Product_ID")
    protected String shared8ProductID;
    @XmlElement(name = "Shared_8_Product_Rel")
    protected String shared8ProductRel;
    @XmlElement(name = "Shared_8_Station_IP_Address")
    protected String shared8StationIPAddress;
    @XmlElement(name = "Shared_8_Network_Region")
    protected String shared8NetworkRegion;
    @XmlElement(name = "Shared_8_Gatekeeper_IP_Address")
    protected String shared8GatekeeperIPAddress;
    @XmlElement(name = "Shared_8_TCP_Skt")
    protected String shared8TCPSkt;
    @XmlElement(name = "Shared_9_Station_Extension")
    protected String shared9StationExtension;
    @XmlElement(name = "Shared_9_Set_Type")
    protected String shared9SetType;
    @XmlElement(name = "Shared_9_Product_ID")
    protected String shared9ProductID;
    @XmlElement(name = "Shared_9_Product_Rel")
    protected String shared9ProductRel;
    @XmlElement(name = "Shared_9_Station_IP_Address")
    protected String shared9StationIPAddress;
    @XmlElement(name = "Shared_9_Network_Region")
    protected String shared9NetworkRegion;
    @XmlElement(name = "Shared_9_Gatekeeper_IP_Address")
    protected String shared9GatekeeperIPAddress;
    @XmlElement(name = "Shared_9_TCP_Skt")
    protected String shared9TCPSkt;
    @XmlElement(name = "Shared_10_Station_Extension")
    protected String shared10StationExtension;
    @XmlElement(name = "Shared_10_Set_Type")
    protected String shared10SetType;
    @XmlElement(name = "Shared_10_Product_ID")
    protected String shared10ProductID;
    @XmlElement(name = "Shared_10_Product_Rel")
    protected String shared10ProductRel;
    @XmlElement(name = "Shared_10_Station_IP_Address")
    protected String shared10StationIPAddress;
    @XmlElement(name = "Shared_10_Network_Region")
    protected String shared10NetworkRegion;
    @XmlElement(name = "Shared_10_Gatekeeper_IP_Address")
    protected String shared10GatekeeperIPAddress;
    @XmlElement(name = "Shared_10_TCP_Skt")
    protected String shared10TCPSkt;
    @XmlElement(name = "Shared_11_Station_Extension")
    protected String shared11StationExtension;
    @XmlElement(name = "Shared_11_Set_Type")
    protected String shared11SetType;
    @XmlElement(name = "Shared_11_Product_ID")
    protected String shared11ProductID;
    @XmlElement(name = "Shared_11_Product_Rel")
    protected String shared11ProductRel;
    @XmlElement(name = "Shared_11_Station_IP_Address")
    protected String shared11StationIPAddress;
    @XmlElement(name = "Shared_11_Network_Region")
    protected String shared11NetworkRegion;
    @XmlElement(name = "Shared_11_Gatekeeper_IP_Address")
    protected String shared11GatekeeperIPAddress;
    @XmlElement(name = "Shared_11_TCP_Skt")
    protected String shared11TCPSkt;
    @XmlElement(name = "Shared_12_Station_Extension")
    protected String shared12StationExtension;
    @XmlElement(name = "Shared_12_Set_Type")
    protected String shared12SetType;
    @XmlElement(name = "Shared_12_Product_ID")
    protected String shared12ProductID;
    @XmlElement(name = "Shared_12_Product_Rel")
    protected String shared12ProductRel;
    @XmlElement(name = "Shared_12_Station_IP_Address")
    protected String shared12StationIPAddress;
    @XmlElement(name = "Shared_12_Network_Region")
    protected String shared12NetworkRegion;
    @XmlElement(name = "Shared_12_Gatekeeper_IP_Address")
    protected String shared12GatekeeperIPAddress;
    @XmlElement(name = "Shared_12_TCP_Skt")
    protected String shared12TCPSkt;

    /**
     * Gets the value of the stationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStationExtension() {
        return stationExtension;
    }

    /**
     * Sets the value of the stationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStationExtension(String value) {
        this.stationExtension = value;
    }

    /**
     * Gets the value of the setType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSetType() {
        return setType;
    }

    /**
     * Sets the value of the setType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSetType(String value) {
        this.setType = value;
    }

    /**
     * Gets the value of the productID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductID() {
        return productID;
    }

    /**
     * Sets the value of the productID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductID(String value) {
        this.productID = value;
    }

    /**
     * Gets the value of the productRel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductRel() {
        return productRel;
    }

    /**
     * Sets the value of the productRel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductRel(String value) {
        this.productRel = value;
    }

    /**
     * Gets the value of the stationIPAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStationIPAddress() {
        return stationIPAddress;
    }

    /**
     * Sets the value of the stationIPAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStationIPAddress(String value) {
        this.stationIPAddress = value;
    }

    /**
     * Gets the value of the networkRegion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkRegion() {
        return networkRegion;
    }

    /**
     * Sets the value of the networkRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkRegion(String value) {
        this.networkRegion = value;
    }

    /**
     * Gets the value of the gatekeeperIPAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGatekeeperIPAddress() {
        return gatekeeperIPAddress;
    }

    /**
     * Sets the value of the gatekeeperIPAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGatekeeperIPAddress(String value) {
        this.gatekeeperIPAddress = value;
    }

    /**
     * Gets the value of the tcpSkt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTCPSkt() {
        return tcpSkt;
    }

    /**
     * Sets the value of the tcpSkt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTCPSkt(String value) {
        this.tcpSkt = value;
    }

    /**
     * Gets the value of the origPort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigPort() {
        return origPort;
    }

    /**
     * Sets the value of the origPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigPort(String value) {
        this.origPort = value;
    }

    /**
     * Gets the value of the shared1StationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared1StationExtension() {
        return shared1StationExtension;
    }

    /**
     * Sets the value of the shared1StationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared1StationExtension(String value) {
        this.shared1StationExtension = value;
    }

    /**
     * Gets the value of the shared1SetType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared1SetType() {
        return shared1SetType;
    }

    /**
     * Sets the value of the shared1SetType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared1SetType(String value) {
        this.shared1SetType = value;
    }

    /**
     * Gets the value of the shared1ProductID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared1ProductID() {
        return shared1ProductID;
    }

    /**
     * Sets the value of the shared1ProductID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared1ProductID(String value) {
        this.shared1ProductID = value;
    }

    /**
     * Gets the value of the shared1ProductRel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared1ProductRel() {
        return shared1ProductRel;
    }

    /**
     * Sets the value of the shared1ProductRel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared1ProductRel(String value) {
        this.shared1ProductRel = value;
    }

    /**
     * Gets the value of the shared1StationIPAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared1StationIPAddress() {
        return shared1StationIPAddress;
    }

    /**
     * Sets the value of the shared1StationIPAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared1StationIPAddress(String value) {
        this.shared1StationIPAddress = value;
    }

    /**
     * Gets the value of the shared1NetworkRegion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared1NetworkRegion() {
        return shared1NetworkRegion;
    }

    /**
     * Sets the value of the shared1NetworkRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared1NetworkRegion(String value) {
        this.shared1NetworkRegion = value;
    }

    /**
     * Gets the value of the shared1GatekeeperIPAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared1GatekeeperIPAddress() {
        return shared1GatekeeperIPAddress;
    }

    /**
     * Sets the value of the shared1GatekeeperIPAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared1GatekeeperIPAddress(String value) {
        this.shared1GatekeeperIPAddress = value;
    }

    /**
     * Gets the value of the shared1TCPSkt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared1TCPSkt() {
        return shared1TCPSkt;
    }

    /**
     * Sets the value of the shared1TCPSkt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared1TCPSkt(String value) {
        this.shared1TCPSkt = value;
    }

    /**
     * Gets the value of the shared2StationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared2StationExtension() {
        return shared2StationExtension;
    }

    /**
     * Sets the value of the shared2StationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared2StationExtension(String value) {
        this.shared2StationExtension = value;
    }

    /**
     * Gets the value of the shared2SetType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared2SetType() {
        return shared2SetType;
    }

    /**
     * Sets the value of the shared2SetType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared2SetType(String value) {
        this.shared2SetType = value;
    }

    /**
     * Gets the value of the shared2ProductID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared2ProductID() {
        return shared2ProductID;
    }

    /**
     * Sets the value of the shared2ProductID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared2ProductID(String value) {
        this.shared2ProductID = value;
    }

    /**
     * Gets the value of the shared2ProductRel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared2ProductRel() {
        return shared2ProductRel;
    }

    /**
     * Sets the value of the shared2ProductRel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared2ProductRel(String value) {
        this.shared2ProductRel = value;
    }

    /**
     * Gets the value of the shared2StationIPAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared2StationIPAddress() {
        return shared2StationIPAddress;
    }

    /**
     * Sets the value of the shared2StationIPAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared2StationIPAddress(String value) {
        this.shared2StationIPAddress = value;
    }

    /**
     * Gets the value of the shared2NetworkRegion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared2NetworkRegion() {
        return shared2NetworkRegion;
    }

    /**
     * Sets the value of the shared2NetworkRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared2NetworkRegion(String value) {
        this.shared2NetworkRegion = value;
    }

    /**
     * Gets the value of the shared2GatekeeperIPAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared2GatekeeperIPAddress() {
        return shared2GatekeeperIPAddress;
    }

    /**
     * Sets the value of the shared2GatekeeperIPAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared2GatekeeperIPAddress(String value) {
        this.shared2GatekeeperIPAddress = value;
    }

    /**
     * Gets the value of the shared2TCPSkt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared2TCPSkt() {
        return shared2TCPSkt;
    }

    /**
     * Sets the value of the shared2TCPSkt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared2TCPSkt(String value) {
        this.shared2TCPSkt = value;
    }

    /**
     * Gets the value of the shared3StationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared3StationExtension() {
        return shared3StationExtension;
    }

    /**
     * Sets the value of the shared3StationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared3StationExtension(String value) {
        this.shared3StationExtension = value;
    }

    /**
     * Gets the value of the shared3SetType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared3SetType() {
        return shared3SetType;
    }

    /**
     * Sets the value of the shared3SetType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared3SetType(String value) {
        this.shared3SetType = value;
    }

    /**
     * Gets the value of the shared3ProductID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared3ProductID() {
        return shared3ProductID;
    }

    /**
     * Sets the value of the shared3ProductID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared3ProductID(String value) {
        this.shared3ProductID = value;
    }

    /**
     * Gets the value of the shared3ProductRel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared3ProductRel() {
        return shared3ProductRel;
    }

    /**
     * Sets the value of the shared3ProductRel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared3ProductRel(String value) {
        this.shared3ProductRel = value;
    }

    /**
     * Gets the value of the shared3StationIPAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared3StationIPAddress() {
        return shared3StationIPAddress;
    }

    /**
     * Sets the value of the shared3StationIPAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared3StationIPAddress(String value) {
        this.shared3StationIPAddress = value;
    }

    /**
     * Gets the value of the shared3NetworkRegion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared3NetworkRegion() {
        return shared3NetworkRegion;
    }

    /**
     * Sets the value of the shared3NetworkRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared3NetworkRegion(String value) {
        this.shared3NetworkRegion = value;
    }

    /**
     * Gets the value of the shared3GatekeeperIPAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared3GatekeeperIPAddress() {
        return shared3GatekeeperIPAddress;
    }

    /**
     * Sets the value of the shared3GatekeeperIPAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared3GatekeeperIPAddress(String value) {
        this.shared3GatekeeperIPAddress = value;
    }

    /**
     * Gets the value of the shared3TCPSkt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared3TCPSkt() {
        return shared3TCPSkt;
    }

    /**
     * Sets the value of the shared3TCPSkt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared3TCPSkt(String value) {
        this.shared3TCPSkt = value;
    }

    /**
     * Gets the value of the shared4StationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared4StationExtension() {
        return shared4StationExtension;
    }

    /**
     * Sets the value of the shared4StationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared4StationExtension(String value) {
        this.shared4StationExtension = value;
    }

    /**
     * Gets the value of the shared4SetType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared4SetType() {
        return shared4SetType;
    }

    /**
     * Sets the value of the shared4SetType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared4SetType(String value) {
        this.shared4SetType = value;
    }

    /**
     * Gets the value of the shared4ProductID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared4ProductID() {
        return shared4ProductID;
    }

    /**
     * Sets the value of the shared4ProductID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared4ProductID(String value) {
        this.shared4ProductID = value;
    }

    /**
     * Gets the value of the shared4ProductRel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared4ProductRel() {
        return shared4ProductRel;
    }

    /**
     * Sets the value of the shared4ProductRel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared4ProductRel(String value) {
        this.shared4ProductRel = value;
    }

    /**
     * Gets the value of the shared4StationIPAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared4StationIPAddress() {
        return shared4StationIPAddress;
    }

    /**
     * Sets the value of the shared4StationIPAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared4StationIPAddress(String value) {
        this.shared4StationIPAddress = value;
    }

    /**
     * Gets the value of the shared4NetworkRegion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared4NetworkRegion() {
        return shared4NetworkRegion;
    }

    /**
     * Sets the value of the shared4NetworkRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared4NetworkRegion(String value) {
        this.shared4NetworkRegion = value;
    }

    /**
     * Gets the value of the shared4GatekeeperIPAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared4GatekeeperIPAddress() {
        return shared4GatekeeperIPAddress;
    }

    /**
     * Sets the value of the shared4GatekeeperIPAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared4GatekeeperIPAddress(String value) {
        this.shared4GatekeeperIPAddress = value;
    }

    /**
     * Gets the value of the shared4TCPSkt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared4TCPSkt() {
        return shared4TCPSkt;
    }

    /**
     * Sets the value of the shared4TCPSkt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared4TCPSkt(String value) {
        this.shared4TCPSkt = value;
    }

    /**
     * Gets the value of the shared5StationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared5StationExtension() {
        return shared5StationExtension;
    }

    /**
     * Sets the value of the shared5StationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared5StationExtension(String value) {
        this.shared5StationExtension = value;
    }

    /**
     * Gets the value of the shared5SetType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared5SetType() {
        return shared5SetType;
    }

    /**
     * Sets the value of the shared5SetType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared5SetType(String value) {
        this.shared5SetType = value;
    }

    /**
     * Gets the value of the shared5ProductID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared5ProductID() {
        return shared5ProductID;
    }

    /**
     * Sets the value of the shared5ProductID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared5ProductID(String value) {
        this.shared5ProductID = value;
    }

    /**
     * Gets the value of the shared5ProductRel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared5ProductRel() {
        return shared5ProductRel;
    }

    /**
     * Sets the value of the shared5ProductRel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared5ProductRel(String value) {
        this.shared5ProductRel = value;
    }

    /**
     * Gets the value of the shared5StationIPAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared5StationIPAddress() {
        return shared5StationIPAddress;
    }

    /**
     * Sets the value of the shared5StationIPAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared5StationIPAddress(String value) {
        this.shared5StationIPAddress = value;
    }

    /**
     * Gets the value of the shared5NetworkRegion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared5NetworkRegion() {
        return shared5NetworkRegion;
    }

    /**
     * Sets the value of the shared5NetworkRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared5NetworkRegion(String value) {
        this.shared5NetworkRegion = value;
    }

    /**
     * Gets the value of the shared5GatekeeperIPAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared5GatekeeperIPAddress() {
        return shared5GatekeeperIPAddress;
    }

    /**
     * Sets the value of the shared5GatekeeperIPAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared5GatekeeperIPAddress(String value) {
        this.shared5GatekeeperIPAddress = value;
    }

    /**
     * Gets the value of the shared5TCPSkt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared5TCPSkt() {
        return shared5TCPSkt;
    }

    /**
     * Sets the value of the shared5TCPSkt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared5TCPSkt(String value) {
        this.shared5TCPSkt = value;
    }

    /**
     * Gets the value of the shared6StationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared6StationExtension() {
        return shared6StationExtension;
    }

    /**
     * Sets the value of the shared6StationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared6StationExtension(String value) {
        this.shared6StationExtension = value;
    }

    /**
     * Gets the value of the shared6SetType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared6SetType() {
        return shared6SetType;
    }

    /**
     * Sets the value of the shared6SetType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared6SetType(String value) {
        this.shared6SetType = value;
    }

    /**
     * Gets the value of the shared6ProductID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared6ProductID() {
        return shared6ProductID;
    }

    /**
     * Sets the value of the shared6ProductID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared6ProductID(String value) {
        this.shared6ProductID = value;
    }

    /**
     * Gets the value of the shared6ProductRel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared6ProductRel() {
        return shared6ProductRel;
    }

    /**
     * Sets the value of the shared6ProductRel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared6ProductRel(String value) {
        this.shared6ProductRel = value;
    }

    /**
     * Gets the value of the shared6StationIPAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared6StationIPAddress() {
        return shared6StationIPAddress;
    }

    /**
     * Sets the value of the shared6StationIPAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared6StationIPAddress(String value) {
        this.shared6StationIPAddress = value;
    }

    /**
     * Gets the value of the shared6NetworkRegion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared6NetworkRegion() {
        return shared6NetworkRegion;
    }

    /**
     * Sets the value of the shared6NetworkRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared6NetworkRegion(String value) {
        this.shared6NetworkRegion = value;
    }

    /**
     * Gets the value of the shared6GatekeeperIPAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared6GatekeeperIPAddress() {
        return shared6GatekeeperIPAddress;
    }

    /**
     * Sets the value of the shared6GatekeeperIPAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared6GatekeeperIPAddress(String value) {
        this.shared6GatekeeperIPAddress = value;
    }

    /**
     * Gets the value of the shared6TCPSkt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared6TCPSkt() {
        return shared6TCPSkt;
    }

    /**
     * Sets the value of the shared6TCPSkt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared6TCPSkt(String value) {
        this.shared6TCPSkt = value;
    }

    /**
     * Gets the value of the shared7StationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared7StationExtension() {
        return shared7StationExtension;
    }

    /**
     * Sets the value of the shared7StationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared7StationExtension(String value) {
        this.shared7StationExtension = value;
    }

    /**
     * Gets the value of the shared7SetType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared7SetType() {
        return shared7SetType;
    }

    /**
     * Sets the value of the shared7SetType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared7SetType(String value) {
        this.shared7SetType = value;
    }

    /**
     * Gets the value of the shared7ProductID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared7ProductID() {
        return shared7ProductID;
    }

    /**
     * Sets the value of the shared7ProductID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared7ProductID(String value) {
        this.shared7ProductID = value;
    }

    /**
     * Gets the value of the shared7ProductRel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared7ProductRel() {
        return shared7ProductRel;
    }

    /**
     * Sets the value of the shared7ProductRel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared7ProductRel(String value) {
        this.shared7ProductRel = value;
    }

    /**
     * Gets the value of the shared7StationIPAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared7StationIPAddress() {
        return shared7StationIPAddress;
    }

    /**
     * Sets the value of the shared7StationIPAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared7StationIPAddress(String value) {
        this.shared7StationIPAddress = value;
    }

    /**
     * Gets the value of the shared7NetworkRegion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared7NetworkRegion() {
        return shared7NetworkRegion;
    }

    /**
     * Sets the value of the shared7NetworkRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared7NetworkRegion(String value) {
        this.shared7NetworkRegion = value;
    }

    /**
     * Gets the value of the shared7GatekeeperIPAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared7GatekeeperIPAddress() {
        return shared7GatekeeperIPAddress;
    }

    /**
     * Sets the value of the shared7GatekeeperIPAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared7GatekeeperIPAddress(String value) {
        this.shared7GatekeeperIPAddress = value;
    }

    /**
     * Gets the value of the shared7TCPSkt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared7TCPSkt() {
        return shared7TCPSkt;
    }

    /**
     * Sets the value of the shared7TCPSkt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared7TCPSkt(String value) {
        this.shared7TCPSkt = value;
    }

    /**
     * Gets the value of the shared8StationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared8StationExtension() {
        return shared8StationExtension;
    }

    /**
     * Sets the value of the shared8StationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared8StationExtension(String value) {
        this.shared8StationExtension = value;
    }

    /**
     * Gets the value of the shared8SetType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared8SetType() {
        return shared8SetType;
    }

    /**
     * Sets the value of the shared8SetType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared8SetType(String value) {
        this.shared8SetType = value;
    }

    /**
     * Gets the value of the shared8ProductID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared8ProductID() {
        return shared8ProductID;
    }

    /**
     * Sets the value of the shared8ProductID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared8ProductID(String value) {
        this.shared8ProductID = value;
    }

    /**
     * Gets the value of the shared8ProductRel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared8ProductRel() {
        return shared8ProductRel;
    }

    /**
     * Sets the value of the shared8ProductRel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared8ProductRel(String value) {
        this.shared8ProductRel = value;
    }

    /**
     * Gets the value of the shared8StationIPAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared8StationIPAddress() {
        return shared8StationIPAddress;
    }

    /**
     * Sets the value of the shared8StationIPAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared8StationIPAddress(String value) {
        this.shared8StationIPAddress = value;
    }

    /**
     * Gets the value of the shared8NetworkRegion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared8NetworkRegion() {
        return shared8NetworkRegion;
    }

    /**
     * Sets the value of the shared8NetworkRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared8NetworkRegion(String value) {
        this.shared8NetworkRegion = value;
    }

    /**
     * Gets the value of the shared8GatekeeperIPAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared8GatekeeperIPAddress() {
        return shared8GatekeeperIPAddress;
    }

    /**
     * Sets the value of the shared8GatekeeperIPAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared8GatekeeperIPAddress(String value) {
        this.shared8GatekeeperIPAddress = value;
    }

    /**
     * Gets the value of the shared8TCPSkt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared8TCPSkt() {
        return shared8TCPSkt;
    }

    /**
     * Sets the value of the shared8TCPSkt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared8TCPSkt(String value) {
        this.shared8TCPSkt = value;
    }

    /**
     * Gets the value of the shared9StationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared9StationExtension() {
        return shared9StationExtension;
    }

    /**
     * Sets the value of the shared9StationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared9StationExtension(String value) {
        this.shared9StationExtension = value;
    }

    /**
     * Gets the value of the shared9SetType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared9SetType() {
        return shared9SetType;
    }

    /**
     * Sets the value of the shared9SetType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared9SetType(String value) {
        this.shared9SetType = value;
    }

    /**
     * Gets the value of the shared9ProductID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared9ProductID() {
        return shared9ProductID;
    }

    /**
     * Sets the value of the shared9ProductID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared9ProductID(String value) {
        this.shared9ProductID = value;
    }

    /**
     * Gets the value of the shared9ProductRel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared9ProductRel() {
        return shared9ProductRel;
    }

    /**
     * Sets the value of the shared9ProductRel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared9ProductRel(String value) {
        this.shared9ProductRel = value;
    }

    /**
     * Gets the value of the shared9StationIPAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared9StationIPAddress() {
        return shared9StationIPAddress;
    }

    /**
     * Sets the value of the shared9StationIPAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared9StationIPAddress(String value) {
        this.shared9StationIPAddress = value;
    }

    /**
     * Gets the value of the shared9NetworkRegion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared9NetworkRegion() {
        return shared9NetworkRegion;
    }

    /**
     * Sets the value of the shared9NetworkRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared9NetworkRegion(String value) {
        this.shared9NetworkRegion = value;
    }

    /**
     * Gets the value of the shared9GatekeeperIPAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared9GatekeeperIPAddress() {
        return shared9GatekeeperIPAddress;
    }

    /**
     * Sets the value of the shared9GatekeeperIPAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared9GatekeeperIPAddress(String value) {
        this.shared9GatekeeperIPAddress = value;
    }

    /**
     * Gets the value of the shared9TCPSkt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared9TCPSkt() {
        return shared9TCPSkt;
    }

    /**
     * Sets the value of the shared9TCPSkt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared9TCPSkt(String value) {
        this.shared9TCPSkt = value;
    }

    /**
     * Gets the value of the shared10StationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared10StationExtension() {
        return shared10StationExtension;
    }

    /**
     * Sets the value of the shared10StationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared10StationExtension(String value) {
        this.shared10StationExtension = value;
    }

    /**
     * Gets the value of the shared10SetType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared10SetType() {
        return shared10SetType;
    }

    /**
     * Sets the value of the shared10SetType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared10SetType(String value) {
        this.shared10SetType = value;
    }

    /**
     * Gets the value of the shared10ProductID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared10ProductID() {
        return shared10ProductID;
    }

    /**
     * Sets the value of the shared10ProductID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared10ProductID(String value) {
        this.shared10ProductID = value;
    }

    /**
     * Gets the value of the shared10ProductRel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared10ProductRel() {
        return shared10ProductRel;
    }

    /**
     * Sets the value of the shared10ProductRel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared10ProductRel(String value) {
        this.shared10ProductRel = value;
    }

    /**
     * Gets the value of the shared10StationIPAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared10StationIPAddress() {
        return shared10StationIPAddress;
    }

    /**
     * Sets the value of the shared10StationIPAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared10StationIPAddress(String value) {
        this.shared10StationIPAddress = value;
    }

    /**
     * Gets the value of the shared10NetworkRegion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared10NetworkRegion() {
        return shared10NetworkRegion;
    }

    /**
     * Sets the value of the shared10NetworkRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared10NetworkRegion(String value) {
        this.shared10NetworkRegion = value;
    }

    /**
     * Gets the value of the shared10GatekeeperIPAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared10GatekeeperIPAddress() {
        return shared10GatekeeperIPAddress;
    }

    /**
     * Sets the value of the shared10GatekeeperIPAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared10GatekeeperIPAddress(String value) {
        this.shared10GatekeeperIPAddress = value;
    }

    /**
     * Gets the value of the shared10TCPSkt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared10TCPSkt() {
        return shared10TCPSkt;
    }

    /**
     * Sets the value of the shared10TCPSkt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared10TCPSkt(String value) {
        this.shared10TCPSkt = value;
    }

    /**
     * Gets the value of the shared11StationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared11StationExtension() {
        return shared11StationExtension;
    }

    /**
     * Sets the value of the shared11StationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared11StationExtension(String value) {
        this.shared11StationExtension = value;
    }

    /**
     * Gets the value of the shared11SetType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared11SetType() {
        return shared11SetType;
    }

    /**
     * Sets the value of the shared11SetType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared11SetType(String value) {
        this.shared11SetType = value;
    }

    /**
     * Gets the value of the shared11ProductID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared11ProductID() {
        return shared11ProductID;
    }

    /**
     * Sets the value of the shared11ProductID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared11ProductID(String value) {
        this.shared11ProductID = value;
    }

    /**
     * Gets the value of the shared11ProductRel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared11ProductRel() {
        return shared11ProductRel;
    }

    /**
     * Sets the value of the shared11ProductRel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared11ProductRel(String value) {
        this.shared11ProductRel = value;
    }

    /**
     * Gets the value of the shared11StationIPAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared11StationIPAddress() {
        return shared11StationIPAddress;
    }

    /**
     * Sets the value of the shared11StationIPAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared11StationIPAddress(String value) {
        this.shared11StationIPAddress = value;
    }

    /**
     * Gets the value of the shared11NetworkRegion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared11NetworkRegion() {
        return shared11NetworkRegion;
    }

    /**
     * Sets the value of the shared11NetworkRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared11NetworkRegion(String value) {
        this.shared11NetworkRegion = value;
    }

    /**
     * Gets the value of the shared11GatekeeperIPAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared11GatekeeperIPAddress() {
        return shared11GatekeeperIPAddress;
    }

    /**
     * Sets the value of the shared11GatekeeperIPAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared11GatekeeperIPAddress(String value) {
        this.shared11GatekeeperIPAddress = value;
    }

    /**
     * Gets the value of the shared11TCPSkt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared11TCPSkt() {
        return shared11TCPSkt;
    }

    /**
     * Sets the value of the shared11TCPSkt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared11TCPSkt(String value) {
        this.shared11TCPSkt = value;
    }

    /**
     * Gets the value of the shared12StationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared12StationExtension() {
        return shared12StationExtension;
    }

    /**
     * Sets the value of the shared12StationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared12StationExtension(String value) {
        this.shared12StationExtension = value;
    }

    /**
     * Gets the value of the shared12SetType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared12SetType() {
        return shared12SetType;
    }

    /**
     * Sets the value of the shared12SetType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared12SetType(String value) {
        this.shared12SetType = value;
    }

    /**
     * Gets the value of the shared12ProductID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared12ProductID() {
        return shared12ProductID;
    }

    /**
     * Sets the value of the shared12ProductID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared12ProductID(String value) {
        this.shared12ProductID = value;
    }

    /**
     * Gets the value of the shared12ProductRel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared12ProductRel() {
        return shared12ProductRel;
    }

    /**
     * Sets the value of the shared12ProductRel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared12ProductRel(String value) {
        this.shared12ProductRel = value;
    }

    /**
     * Gets the value of the shared12StationIPAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared12StationIPAddress() {
        return shared12StationIPAddress;
    }

    /**
     * Sets the value of the shared12StationIPAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared12StationIPAddress(String value) {
        this.shared12StationIPAddress = value;
    }

    /**
     * Gets the value of the shared12NetworkRegion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared12NetworkRegion() {
        return shared12NetworkRegion;
    }

    /**
     * Sets the value of the shared12NetworkRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared12NetworkRegion(String value) {
        this.shared12NetworkRegion = value;
    }

    /**
     * Gets the value of the shared12GatekeeperIPAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared12GatekeeperIPAddress() {
        return shared12GatekeeperIPAddress;
    }

    /**
     * Sets the value of the shared12GatekeeperIPAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared12GatekeeperIPAddress(String value) {
        this.shared12GatekeeperIPAddress = value;
    }

    /**
     * Gets the value of the shared12TCPSkt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShared12TCPSkt() {
        return shared12TCPSkt;
    }

    /**
     * Sets the value of the shared12TCPSkt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShared12TCPSkt(String value) {
        this.shared12TCPSkt = value;
    }

}
