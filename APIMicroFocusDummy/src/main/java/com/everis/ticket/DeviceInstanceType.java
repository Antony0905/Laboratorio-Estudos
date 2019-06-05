//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2019.04.08 às 05:43:26 PM BRT 
//


package com.everis.ticket;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de DeviceInstanceType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DeviceInstanceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="file.device">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="LogicalName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Vendor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Model" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="SerialNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Location" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Istatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Subtype" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Comments">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Building" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Manufacturer" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Assignment" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="LocationComments" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="IpAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="TempType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="DisplayName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="SmDeviceDisplayName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="MapfreFunctionalOwner" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="MapfreInfrastructureOwner" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="MapfreOperationalOwner" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="MapfreMultienvironment">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="MapfreMultienvironment" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="MapfreVerificationStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="MapfreNameAlliases" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="MapfreRack" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="MapfreName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="MapfreHostname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="file.node">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PhysicalMemTotal" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="OsVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="MapfreOsName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="MapfrePrimaryDns" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="MapfreRack" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="MapfreRemoteConsoleIp" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="MapfreTotalDisk" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="MapfreProcessorIdOkArray">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="MapfreProcessorIdOkArray" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="MapfreProcessorSpeedOkArray">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="MapfreProcessorSpeedOkArray" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="MapfreNetInterfaceOkArray">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="MapfreNetInterfaceOkArray" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="MapfreNetIpOkArray">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="MapfreNetIpOkArray" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="MapfreNetMacOkArray">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="MapfreNetMacOkArray" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="MapfreNetMaskOkArray">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="MapfreNetMaskOkArray" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="MapfreNetCommentsOkArray">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="MapfreNetCommentsOkArray" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="MapfreOsPlatform" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="MapfreHostname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="attachments" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *       &lt;attribute name="query" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="uniquequery" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="recordid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="updatecounter" type="{http://www.w3.org/2001/XMLSchema}long" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceInstanceType", propOrder = {
    "fileDevice",
    "fileNode",
    "attachments"
})
public class DeviceInstanceType {

    @XmlElement(name = "file.device", required = true)
    protected DeviceInstanceType.FileDevice fileDevice;
    @XmlElement(name = "file.node", required = true)
    protected DeviceInstanceType.FileNode fileNode;
    @XmlElement(required = true, nillable = true)
    protected String attachments;
    @XmlAttribute(name = "query")
    protected String query;
    @XmlAttribute(name = "uniquequery")
    protected String uniquequery;
    @XmlAttribute(name = "recordid")
    protected String recordid;
    @XmlAttribute(name = "updatecounter")
    protected Long updatecounter;

    /**
     * Obtém o valor da propriedade fileDevice.
     * 
     * @return
     *     possible object is
     *     {@link DeviceInstanceType.FileDevice }
     *     
     */
    public DeviceInstanceType.FileDevice getFileDevice() {
        return fileDevice;
    }

    /**
     * Define o valor da propriedade fileDevice.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceInstanceType.FileDevice }
     *     
     */
    public void setFileDevice(DeviceInstanceType.FileDevice value) {
        this.fileDevice = value;
    }

    /**
     * Obtém o valor da propriedade fileNode.
     * 
     * @return
     *     possible object is
     *     {@link DeviceInstanceType.FileNode }
     *     
     */
    public DeviceInstanceType.FileNode getFileNode() {
        return fileNode;
    }

    /**
     * Define o valor da propriedade fileNode.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceInstanceType.FileNode }
     *     
     */
    public void setFileNode(DeviceInstanceType.FileNode value) {
        this.fileNode = value;
    }

    /**
     * Obtém o valor da propriedade attachments.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttachments() {
        return attachments;
    }

    /**
     * Define o valor da propriedade attachments.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttachments(String value) {
        this.attachments = value;
    }

    /**
     * Obtém o valor da propriedade query.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuery() {
        return query;
    }

    /**
     * Define o valor da propriedade query.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuery(String value) {
        this.query = value;
    }

    /**
     * Obtém o valor da propriedade uniquequery.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniquequery() {
        return uniquequery;
    }

    /**
     * Define o valor da propriedade uniquequery.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniquequery(String value) {
        this.uniquequery = value;
    }

    /**
     * Obtém o valor da propriedade recordid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordid() {
        return recordid;
    }

    /**
     * Define o valor da propriedade recordid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordid(String value) {
        this.recordid = value;
    }

    /**
     * Obtém o valor da propriedade updatecounter.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUpdatecounter() {
        return updatecounter;
    }

    /**
     * Define o valor da propriedade updatecounter.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUpdatecounter(Long value) {
        this.updatecounter = value;
    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="LogicalName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Vendor" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Model" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="SerialNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Location" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Istatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Subtype" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Comments">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Building" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Manufacturer" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Assignment" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="LocationComments" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="IpAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="TempType" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="DisplayName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="SmDeviceDisplayName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="MapfreFunctionalOwner" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="MapfreInfrastructureOwner" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="MapfreOperationalOwner" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="MapfreMultienvironment">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="MapfreMultienvironment" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="MapfreVerificationStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="MapfreNameAlliases" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="MapfreRack" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="MapfreName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="MapfreHostname" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "logicalName",
        "vendor",
        "model",
        "serialNo",
        "location",
        "type",
        "description",
        "istatus",
        "version",
        "subtype",
        "comments",
        "building",
        "manufacturer",
        "assignment",
        "locationComments",
        "ipAddress",
        "tempType",
        "displayName",
        "smDeviceDisplayName",
        "mapfreFunctionalOwner",
        "mapfreInfrastructureOwner",
        "mapfreOperationalOwner",
        "mapfreMultienvironment",
        "mapfreVerificationStatus",
        "mapfreNameAlliases",
        "mapfreRack",
        "mapfreName",
        "mapfreHostname"
    })
    public static class FileDevice {

        @XmlElement(name = "LogicalName", required = true, nillable = true)
        protected String logicalName;
        @XmlElement(name = "Vendor", required = true, nillable = true)
        protected String vendor;
        @XmlElement(name = "Model", required = true, nillable = true)
        protected String model;
        @XmlElement(name = "SerialNo", required = true, nillable = true)
        protected String serialNo;
        @XmlElement(name = "Location", required = true, nillable = true)
        protected String location;
        @XmlElement(name = "Type", required = true, nillable = true)
        protected String type;
        @XmlElement(name = "Description", required = true, nillable = true)
        protected String description;
        @XmlElement(name = "Istatus", required = true, nillable = true)
        protected String istatus;
        @XmlElement(name = "Version", required = true, nillable = true)
        protected String version;
        @XmlElement(name = "Subtype", required = true, nillable = true)
        protected String subtype;
        @XmlElement(name = "Comments", required = true)
        protected DeviceInstanceType.FileDevice.Comments comments;
        @XmlElement(name = "Building", required = true, nillable = true)
        protected String building;
        @XmlElement(name = "Manufacturer", required = true, nillable = true)
        protected String manufacturer;
        @XmlElement(name = "Assignment", required = true, nillable = true)
        protected String assignment;
        @XmlElement(name = "LocationComments", required = true)
        protected String locationComments;
        @XmlElement(name = "IpAddress", required = true, nillable = true)
        protected String ipAddress;
        @XmlElement(name = "TempType", required = true, nillable = true)
        protected String tempType;
        @XmlElement(name = "DisplayName", required = true, nillable = true)
        protected String displayName;
        @XmlElement(name = "SmDeviceDisplayName", required = true, nillable = true)
        protected String smDeviceDisplayName;
        @XmlElement(name = "MapfreFunctionalOwner", required = true, nillable = true)
        protected String mapfreFunctionalOwner;
        @XmlElement(name = "MapfreInfrastructureOwner", required = true, nillable = true)
        protected String mapfreInfrastructureOwner;
        @XmlElement(name = "MapfreOperationalOwner", required = true, nillable = true)
        protected String mapfreOperationalOwner;
        @XmlElement(name = "MapfreMultienvironment", required = true)
        protected DeviceInstanceType.FileDevice.MapfreMultienvironment mapfreMultienvironment;
        @XmlElement(name = "MapfreVerificationStatus", required = true, nillable = true)
        protected String mapfreVerificationStatus;
        @XmlElement(name = "MapfreNameAlliases", required = true, nillable = true)
        protected String mapfreNameAlliases;
        @XmlElement(name = "MapfreRack", required = true, nillable = true)
        protected String mapfreRack;
        @XmlElement(name = "MapfreName", required = true, nillable = true)
        protected String mapfreName;
        @XmlElement(name = "MapfreHostname", required = true, nillable = true)
        protected String mapfreHostname;

        /**
         * Obtém o valor da propriedade logicalName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLogicalName() {
            return logicalName;
        }

        /**
         * Define o valor da propriedade logicalName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLogicalName(String value) {
            this.logicalName = value;
        }

        /**
         * Obtém o valor da propriedade vendor.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVendor() {
            return vendor;
        }

        /**
         * Define o valor da propriedade vendor.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVendor(String value) {
            this.vendor = value;
        }

        /**
         * Obtém o valor da propriedade model.
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
         * Define o valor da propriedade model.
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
         * Obtém o valor da propriedade serialNo.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSerialNo() {
            return serialNo;
        }

        /**
         * Define o valor da propriedade serialNo.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSerialNo(String value) {
            this.serialNo = value;
        }

        /**
         * Obtém o valor da propriedade location.
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
         * Define o valor da propriedade location.
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
         * Obtém o valor da propriedade type.
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
         * Define o valor da propriedade type.
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
         * Obtém o valor da propriedade description.
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
         * Define o valor da propriedade description.
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
         * Obtém o valor da propriedade istatus.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIstatus() {
            return istatus;
        }

        /**
         * Define o valor da propriedade istatus.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIstatus(String value) {
            this.istatus = value;
        }

        /**
         * Obtém o valor da propriedade version.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVersion() {
            return version;
        }

        /**
         * Define o valor da propriedade version.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVersion(String value) {
            this.version = value;
        }

        /**
         * Obtém o valor da propriedade subtype.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSubtype() {
            return subtype;
        }

        /**
         * Define o valor da propriedade subtype.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSubtype(String value) {
            this.subtype = value;
        }

        /**
         * Obtém o valor da propriedade comments.
         * 
         * @return
         *     possible object is
         *     {@link DeviceInstanceType.FileDevice.Comments }
         *     
         */
        public DeviceInstanceType.FileDevice.Comments getComments() {
            return comments;
        }

        /**
         * Define o valor da propriedade comments.
         * 
         * @param value
         *     allowed object is
         *     {@link DeviceInstanceType.FileDevice.Comments }
         *     
         */
        public void setComments(DeviceInstanceType.FileDevice.Comments value) {
            this.comments = value;
        }

        /**
         * Obtém o valor da propriedade building.
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
         * Define o valor da propriedade building.
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
         * Obtém o valor da propriedade manufacturer.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getManufacturer() {
            return manufacturer;
        }

        /**
         * Define o valor da propriedade manufacturer.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setManufacturer(String value) {
            this.manufacturer = value;
        }

        /**
         * Obtém o valor da propriedade assignment.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssignment() {
            return assignment;
        }

        /**
         * Define o valor da propriedade assignment.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssignment(String value) {
            this.assignment = value;
        }

        /**
         * Obtém o valor da propriedade locationComments.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLocationComments() {
            return locationComments;
        }

        /**
         * Define o valor da propriedade locationComments.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLocationComments(String value) {
            this.locationComments = value;
        }

        /**
         * Obtém o valor da propriedade ipAddress.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIpAddress() {
            return ipAddress;
        }

        /**
         * Define o valor da propriedade ipAddress.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIpAddress(String value) {
            this.ipAddress = value;
        }

        /**
         * Obtém o valor da propriedade tempType.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTempType() {
            return tempType;
        }

        /**
         * Define o valor da propriedade tempType.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTempType(String value) {
            this.tempType = value;
        }

        /**
         * Obtém o valor da propriedade displayName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDisplayName() {
            return displayName;
        }

        /**
         * Define o valor da propriedade displayName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDisplayName(String value) {
            this.displayName = value;
        }

        /**
         * Obtém o valor da propriedade smDeviceDisplayName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSmDeviceDisplayName() {
            return smDeviceDisplayName;
        }

        /**
         * Define o valor da propriedade smDeviceDisplayName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSmDeviceDisplayName(String value) {
            this.smDeviceDisplayName = value;
        }

        /**
         * Obtém o valor da propriedade mapfreFunctionalOwner.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMapfreFunctionalOwner() {
            return mapfreFunctionalOwner;
        }

        /**
         * Define o valor da propriedade mapfreFunctionalOwner.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMapfreFunctionalOwner(String value) {
            this.mapfreFunctionalOwner = value;
        }

        /**
         * Obtém o valor da propriedade mapfreInfrastructureOwner.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMapfreInfrastructureOwner() {
            return mapfreInfrastructureOwner;
        }

        /**
         * Define o valor da propriedade mapfreInfrastructureOwner.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMapfreInfrastructureOwner(String value) {
            this.mapfreInfrastructureOwner = value;
        }

        /**
         * Obtém o valor da propriedade mapfreOperationalOwner.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMapfreOperationalOwner() {
            return mapfreOperationalOwner;
        }

        /**
         * Define o valor da propriedade mapfreOperationalOwner.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMapfreOperationalOwner(String value) {
            this.mapfreOperationalOwner = value;
        }

        /**
         * Obtém o valor da propriedade mapfreMultienvironment.
         * 
         * @return
         *     possible object is
         *     {@link DeviceInstanceType.FileDevice.MapfreMultienvironment }
         *     
         */
        public DeviceInstanceType.FileDevice.MapfreMultienvironment getMapfreMultienvironment() {
            return mapfreMultienvironment;
        }

        /**
         * Define o valor da propriedade mapfreMultienvironment.
         * 
         * @param value
         *     allowed object is
         *     {@link DeviceInstanceType.FileDevice.MapfreMultienvironment }
         *     
         */
        public void setMapfreMultienvironment(DeviceInstanceType.FileDevice.MapfreMultienvironment value) {
            this.mapfreMultienvironment = value;
        }

        /**
         * Obtém o valor da propriedade mapfreVerificationStatus.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMapfreVerificationStatus() {
            return mapfreVerificationStatus;
        }

        /**
         * Define o valor da propriedade mapfreVerificationStatus.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMapfreVerificationStatus(String value) {
            this.mapfreVerificationStatus = value;
        }

        /**
         * Obtém o valor da propriedade mapfreNameAlliases.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMapfreNameAlliases() {
            return mapfreNameAlliases;
        }

        /**
         * Define o valor da propriedade mapfreNameAlliases.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMapfreNameAlliases(String value) {
            this.mapfreNameAlliases = value;
        }

        /**
         * Obtém o valor da propriedade mapfreRack.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMapfreRack() {
            return mapfreRack;
        }

        /**
         * Define o valor da propriedade mapfreRack.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMapfreRack(String value) {
            this.mapfreRack = value;
        }

        /**
         * Obtém o valor da propriedade mapfreName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMapfreName() {
            return mapfreName;
        }

        /**
         * Define o valor da propriedade mapfreName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMapfreName(String value) {
            this.mapfreName = value;
        }

        /**
         * Obtém o valor da propriedade mapfreHostname.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMapfreHostname() {
            return mapfreHostname;
        }

        /**
         * Define o valor da propriedade mapfreHostname.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMapfreHostname(String value) {
            this.mapfreHostname = value;
        }


        /**
         * <p>Classe Java de anonymous complex type.
         * 
         * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "comments"
        })
        public static class Comments {

            @XmlElement(name = "Comments", required = true)
            protected List<String> comments;

            /**
             * Gets the value of the comments property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the comments property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getComments().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getComments() {
                if (comments == null) {
                    comments = new ArrayList<String>();
                }
                return this.comments;
            }

        }


        /**
         * <p>Classe Java de anonymous complex type.
         * 
         * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="MapfreMultienvironment" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "mapfreMultienvironment"
        })
        public static class MapfreMultienvironment {

            @XmlElement(name = "MapfreMultienvironment", required = true)
            protected List<String> mapfreMultienvironment;

            /**
             * Gets the value of the mapfreMultienvironment property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the mapfreMultienvironment property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getMapfreMultienvironment().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getMapfreMultienvironment() {
                if (mapfreMultienvironment == null) {
                    mapfreMultienvironment = new ArrayList<String>();
                }
                return this.mapfreMultienvironment;
            }

        }

    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="PhysicalMemTotal" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="OsVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="MapfreOsName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="MapfrePrimaryDns" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="MapfreRack" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="MapfreRemoteConsoleIp" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="MapfreTotalDisk" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="MapfreProcessorIdOkArray">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="MapfreProcessorIdOkArray" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="MapfreProcessorSpeedOkArray">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="MapfreProcessorSpeedOkArray" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="MapfreNetInterfaceOkArray">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="MapfreNetInterfaceOkArray" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="MapfreNetIpOkArray">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="MapfreNetIpOkArray" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="MapfreNetMacOkArray">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="MapfreNetMacOkArray" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="MapfreNetMaskOkArray">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="MapfreNetMaskOkArray" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="MapfreNetCommentsOkArray">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="MapfreNetCommentsOkArray" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="MapfreOsPlatform" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="MapfreHostname" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "physicalMemTotal",
        "osVersion",
        "mapfreOsName",
        "mapfrePrimaryDns",
        "mapfreRack",
        "mapfreRemoteConsoleIp",
        "mapfreTotalDisk",
        "mapfreProcessorIdOkArray",
        "mapfreProcessorSpeedOkArray",
        "mapfreNetInterfaceOkArray",
        "mapfreNetIpOkArray",
        "mapfreNetMacOkArray",
        "mapfreNetMaskOkArray",
        "mapfreNetCommentsOkArray",
        "mapfreOsPlatform",
        "mapfreHostname"
    })
    public static class FileNode {

        @XmlElement(name = "PhysicalMemTotal", required = true, nillable = true)
        protected BigInteger physicalMemTotal;
        @XmlElement(name = "OsVersion", required = true, nillable = true)
        protected String osVersion;
        @XmlElement(name = "MapfreOsName", required = true, nillable = true)
        protected String mapfreOsName;
        @XmlElement(name = "MapfrePrimaryDns", required = true, nillable = true)
        protected String mapfrePrimaryDns;
        @XmlElement(name = "MapfreRack", required = true, nillable = true)
        protected String mapfreRack;
        @XmlElement(name = "MapfreRemoteConsoleIp", required = true, nillable = true)
        protected String mapfreRemoteConsoleIp;
        @XmlElement(name = "MapfreTotalDisk", required = true, nillable = true)
        protected String mapfreTotalDisk;
        @XmlElement(name = "MapfreProcessorIdOkArray", required = true)
        protected DeviceInstanceType.FileNode.MapfreProcessorIdOkArray mapfreProcessorIdOkArray;
        @XmlElement(name = "MapfreProcessorSpeedOkArray", required = true)
        protected DeviceInstanceType.FileNode.MapfreProcessorSpeedOkArray mapfreProcessorSpeedOkArray;
        @XmlElement(name = "MapfreNetInterfaceOkArray", required = true)
        protected DeviceInstanceType.FileNode.MapfreNetInterfaceOkArray mapfreNetInterfaceOkArray;
        @XmlElement(name = "MapfreNetIpOkArray", required = true)
        protected DeviceInstanceType.FileNode.MapfreNetIpOkArray mapfreNetIpOkArray;
        @XmlElement(name = "MapfreNetMacOkArray", required = true)
        protected DeviceInstanceType.FileNode.MapfreNetMacOkArray mapfreNetMacOkArray;
        @XmlElement(name = "MapfreNetMaskOkArray", required = true)
        protected DeviceInstanceType.FileNode.MapfreNetMaskOkArray mapfreNetMaskOkArray;
        @XmlElement(name = "MapfreNetCommentsOkArray", required = true)
        protected DeviceInstanceType.FileNode.MapfreNetCommentsOkArray mapfreNetCommentsOkArray;
        @XmlElement(name = "MapfreOsPlatform", required = true, nillable = true)
        protected String mapfreOsPlatform;
        @XmlElement(name = "MapfreHostname", required = true, nillable = true)
        protected String mapfreHostname;

        /**
         * Obtém o valor da propriedade physicalMemTotal.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getPhysicalMemTotal() {
            return physicalMemTotal;
        }

        /**
         * Define o valor da propriedade physicalMemTotal.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setPhysicalMemTotal(BigInteger value) {
            this.physicalMemTotal = value;
        }

        /**
         * Obtém o valor da propriedade osVersion.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOsVersion() {
            return osVersion;
        }

        /**
         * Define o valor da propriedade osVersion.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOsVersion(String value) {
            this.osVersion = value;
        }

        /**
         * Obtém o valor da propriedade mapfreOsName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMapfreOsName() {
            return mapfreOsName;
        }

        /**
         * Define o valor da propriedade mapfreOsName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMapfreOsName(String value) {
            this.mapfreOsName = value;
        }

        /**
         * Obtém o valor da propriedade mapfrePrimaryDns.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMapfrePrimaryDns() {
            return mapfrePrimaryDns;
        }

        /**
         * Define o valor da propriedade mapfrePrimaryDns.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMapfrePrimaryDns(String value) {
            this.mapfrePrimaryDns = value;
        }

        /**
         * Obtém o valor da propriedade mapfreRack.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMapfreRack() {
            return mapfreRack;
        }

        /**
         * Define o valor da propriedade mapfreRack.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMapfreRack(String value) {
            this.mapfreRack = value;
        }

        /**
         * Obtém o valor da propriedade mapfreRemoteConsoleIp.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMapfreRemoteConsoleIp() {
            return mapfreRemoteConsoleIp;
        }

        /**
         * Define o valor da propriedade mapfreRemoteConsoleIp.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMapfreRemoteConsoleIp(String value) {
            this.mapfreRemoteConsoleIp = value;
        }

        /**
         * Obtém o valor da propriedade mapfreTotalDisk.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMapfreTotalDisk() {
            return mapfreTotalDisk;
        }

        /**
         * Define o valor da propriedade mapfreTotalDisk.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMapfreTotalDisk(String value) {
            this.mapfreTotalDisk = value;
        }

        /**
         * Obtém o valor da propriedade mapfreProcessorIdOkArray.
         * 
         * @return
         *     possible object is
         *     {@link DeviceInstanceType.FileNode.MapfreProcessorIdOkArray }
         *     
         */
        public DeviceInstanceType.FileNode.MapfreProcessorIdOkArray getMapfreProcessorIdOkArray() {
            return mapfreProcessorIdOkArray;
        }

        /**
         * Define o valor da propriedade mapfreProcessorIdOkArray.
         * 
         * @param value
         *     allowed object is
         *     {@link DeviceInstanceType.FileNode.MapfreProcessorIdOkArray }
         *     
         */
        public void setMapfreProcessorIdOkArray(DeviceInstanceType.FileNode.MapfreProcessorIdOkArray value) {
            this.mapfreProcessorIdOkArray = value;
        }

        /**
         * Obtém o valor da propriedade mapfreProcessorSpeedOkArray.
         * 
         * @return
         *     possible object is
         *     {@link DeviceInstanceType.FileNode.MapfreProcessorSpeedOkArray }
         *     
         */
        public DeviceInstanceType.FileNode.MapfreProcessorSpeedOkArray getMapfreProcessorSpeedOkArray() {
            return mapfreProcessorSpeedOkArray;
        }

        /**
         * Define o valor da propriedade mapfreProcessorSpeedOkArray.
         * 
         * @param value
         *     allowed object is
         *     {@link DeviceInstanceType.FileNode.MapfreProcessorSpeedOkArray }
         *     
         */
        public void setMapfreProcessorSpeedOkArray(DeviceInstanceType.FileNode.MapfreProcessorSpeedOkArray value) {
            this.mapfreProcessorSpeedOkArray = value;
        }

        /**
         * Obtém o valor da propriedade mapfreNetInterfaceOkArray.
         * 
         * @return
         *     possible object is
         *     {@link DeviceInstanceType.FileNode.MapfreNetInterfaceOkArray }
         *     
         */
        public DeviceInstanceType.FileNode.MapfreNetInterfaceOkArray getMapfreNetInterfaceOkArray() {
            return mapfreNetInterfaceOkArray;
        }

        /**
         * Define o valor da propriedade mapfreNetInterfaceOkArray.
         * 
         * @param value
         *     allowed object is
         *     {@link DeviceInstanceType.FileNode.MapfreNetInterfaceOkArray }
         *     
         */
        public void setMapfreNetInterfaceOkArray(DeviceInstanceType.FileNode.MapfreNetInterfaceOkArray value) {
            this.mapfreNetInterfaceOkArray = value;
        }

        /**
         * Obtém o valor da propriedade mapfreNetIpOkArray.
         * 
         * @return
         *     possible object is
         *     {@link DeviceInstanceType.FileNode.MapfreNetIpOkArray }
         *     
         */
        public DeviceInstanceType.FileNode.MapfreNetIpOkArray getMapfreNetIpOkArray() {
            return mapfreNetIpOkArray;
        }

        /**
         * Define o valor da propriedade mapfreNetIpOkArray.
         * 
         * @param value
         *     allowed object is
         *     {@link DeviceInstanceType.FileNode.MapfreNetIpOkArray }
         *     
         */
        public void setMapfreNetIpOkArray(DeviceInstanceType.FileNode.MapfreNetIpOkArray value) {
            this.mapfreNetIpOkArray = value;
        }

        /**
         * Obtém o valor da propriedade mapfreNetMacOkArray.
         * 
         * @return
         *     possible object is
         *     {@link DeviceInstanceType.FileNode.MapfreNetMacOkArray }
         *     
         */
        public DeviceInstanceType.FileNode.MapfreNetMacOkArray getMapfreNetMacOkArray() {
            return mapfreNetMacOkArray;
        }

        /**
         * Define o valor da propriedade mapfreNetMacOkArray.
         * 
         * @param value
         *     allowed object is
         *     {@link DeviceInstanceType.FileNode.MapfreNetMacOkArray }
         *     
         */
        public void setMapfreNetMacOkArray(DeviceInstanceType.FileNode.MapfreNetMacOkArray value) {
            this.mapfreNetMacOkArray = value;
        }

        /**
         * Obtém o valor da propriedade mapfreNetMaskOkArray.
         * 
         * @return
         *     possible object is
         *     {@link DeviceInstanceType.FileNode.MapfreNetMaskOkArray }
         *     
         */
        public DeviceInstanceType.FileNode.MapfreNetMaskOkArray getMapfreNetMaskOkArray() {
            return mapfreNetMaskOkArray;
        }

        /**
         * Define o valor da propriedade mapfreNetMaskOkArray.
         * 
         * @param value
         *     allowed object is
         *     {@link DeviceInstanceType.FileNode.MapfreNetMaskOkArray }
         *     
         */
        public void setMapfreNetMaskOkArray(DeviceInstanceType.FileNode.MapfreNetMaskOkArray value) {
            this.mapfreNetMaskOkArray = value;
        }

        /**
         * Obtém o valor da propriedade mapfreNetCommentsOkArray.
         * 
         * @return
         *     possible object is
         *     {@link DeviceInstanceType.FileNode.MapfreNetCommentsOkArray }
         *     
         */
        public DeviceInstanceType.FileNode.MapfreNetCommentsOkArray getMapfreNetCommentsOkArray() {
            return mapfreNetCommentsOkArray;
        }

        /**
         * Define o valor da propriedade mapfreNetCommentsOkArray.
         * 
         * @param value
         *     allowed object is
         *     {@link DeviceInstanceType.FileNode.MapfreNetCommentsOkArray }
         *     
         */
        public void setMapfreNetCommentsOkArray(DeviceInstanceType.FileNode.MapfreNetCommentsOkArray value) {
            this.mapfreNetCommentsOkArray = value;
        }

        /**
         * Obtém o valor da propriedade mapfreOsPlatform.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMapfreOsPlatform() {
            return mapfreOsPlatform;
        }

        /**
         * Define o valor da propriedade mapfreOsPlatform.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMapfreOsPlatform(String value) {
            this.mapfreOsPlatform = value;
        }

        /**
         * Obtém o valor da propriedade mapfreHostname.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMapfreHostname() {
            return mapfreHostname;
        }

        /**
         * Define o valor da propriedade mapfreHostname.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMapfreHostname(String value) {
            this.mapfreHostname = value;
        }


        /**
         * <p>Classe Java de anonymous complex type.
         * 
         * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="MapfreNetCommentsOkArray" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "mapfreNetCommentsOkArray"
        })
        public static class MapfreNetCommentsOkArray {

            @XmlElement(name = "MapfreNetCommentsOkArray", required = true)
            protected List<String> mapfreNetCommentsOkArray;

            /**
             * Gets the value of the mapfreNetCommentsOkArray property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the mapfreNetCommentsOkArray property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getMapfreNetCommentsOkArray().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getMapfreNetCommentsOkArray() {
                if (mapfreNetCommentsOkArray == null) {
                    mapfreNetCommentsOkArray = new ArrayList<String>();
                }
                return this.mapfreNetCommentsOkArray;
            }

        }


        /**
         * <p>Classe Java de anonymous complex type.
         * 
         * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="MapfreNetInterfaceOkArray" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "mapfreNetInterfaceOkArray"
        })
        public static class MapfreNetInterfaceOkArray {

            @XmlElement(name = "MapfreNetInterfaceOkArray", required = true)
            protected List<String> mapfreNetInterfaceOkArray;

            /**
             * Gets the value of the mapfreNetInterfaceOkArray property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the mapfreNetInterfaceOkArray property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getMapfreNetInterfaceOkArray().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getMapfreNetInterfaceOkArray() {
                if (mapfreNetInterfaceOkArray == null) {
                    mapfreNetInterfaceOkArray = new ArrayList<String>();
                }
                return this.mapfreNetInterfaceOkArray;
            }

        }


        /**
         * <p>Classe Java de anonymous complex type.
         * 
         * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="MapfreNetIpOkArray" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "mapfreNetIpOkArray"
        })
        public static class MapfreNetIpOkArray {

            @XmlElement(name = "MapfreNetIpOkArray", required = true)
            protected List<String> mapfreNetIpOkArray;

            /**
             * Gets the value of the mapfreNetIpOkArray property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the mapfreNetIpOkArray property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getMapfreNetIpOkArray().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getMapfreNetIpOkArray() {
                if (mapfreNetIpOkArray == null) {
                    mapfreNetIpOkArray = new ArrayList<String>();
                }
                return this.mapfreNetIpOkArray;
            }

        }


        /**
         * <p>Classe Java de anonymous complex type.
         * 
         * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="MapfreNetMacOkArray" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "mapfreNetMacOkArray"
        })
        public static class MapfreNetMacOkArray {

            @XmlElement(name = "MapfreNetMacOkArray", required = true)
            protected List<String> mapfreNetMacOkArray;

            /**
             * Gets the value of the mapfreNetMacOkArray property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the mapfreNetMacOkArray property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getMapfreNetMacOkArray().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getMapfreNetMacOkArray() {
                if (mapfreNetMacOkArray == null) {
                    mapfreNetMacOkArray = new ArrayList<String>();
                }
                return this.mapfreNetMacOkArray;
            }

        }


        /**
         * <p>Classe Java de anonymous complex type.
         * 
         * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="MapfreNetMaskOkArray" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "mapfreNetMaskOkArray"
        })
        public static class MapfreNetMaskOkArray {

            @XmlElement(name = "MapfreNetMaskOkArray", required = true)
            protected List<String> mapfreNetMaskOkArray;

            /**
             * Gets the value of the mapfreNetMaskOkArray property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the mapfreNetMaskOkArray property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getMapfreNetMaskOkArray().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getMapfreNetMaskOkArray() {
                if (mapfreNetMaskOkArray == null) {
                    mapfreNetMaskOkArray = new ArrayList<String>();
                }
                return this.mapfreNetMaskOkArray;
            }

        }


        /**
         * <p>Classe Java de anonymous complex type.
         * 
         * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="MapfreProcessorIdOkArray" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "mapfreProcessorIdOkArray"
        })
        public static class MapfreProcessorIdOkArray {

            @XmlElement(name = "MapfreProcessorIdOkArray", required = true)
            protected List<String> mapfreProcessorIdOkArray;

            /**
             * Gets the value of the mapfreProcessorIdOkArray property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the mapfreProcessorIdOkArray property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getMapfreProcessorIdOkArray().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getMapfreProcessorIdOkArray() {
                if (mapfreProcessorIdOkArray == null) {
                    mapfreProcessorIdOkArray = new ArrayList<String>();
                }
                return this.mapfreProcessorIdOkArray;
            }

        }


        /**
         * <p>Classe Java de anonymous complex type.
         * 
         * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="MapfreProcessorSpeedOkArray" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "mapfreProcessorSpeedOkArray"
        })
        public static class MapfreProcessorSpeedOkArray {

            @XmlElement(name = "MapfreProcessorSpeedOkArray", required = true)
            protected List<String> mapfreProcessorSpeedOkArray;

            /**
             * Gets the value of the mapfreProcessorSpeedOkArray property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the mapfreProcessorSpeedOkArray property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getMapfreProcessorSpeedOkArray().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getMapfreProcessorSpeedOkArray() {
                if (mapfreProcessorSpeedOkArray == null) {
                    mapfreProcessorSpeedOkArray = new ArrayList<String>();
                }
                return this.mapfreProcessorSpeedOkArray;
            }

        }

    }

}
