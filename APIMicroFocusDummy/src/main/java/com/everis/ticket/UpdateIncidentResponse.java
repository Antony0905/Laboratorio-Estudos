//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2019.04.08 às 05:43:26 PM BRT 
//


package com.everis.ticket;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="query" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="messages" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Urgency" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="updateTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CauseCodeL1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AffectedCI" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Resolution" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="UserImpact" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MapfreAmbit" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MapfreEnvironment" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CauseCodeL2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MapfreIdcat" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MapfreMonitorAlertId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="attachments" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *       &lt;attribute name="updatecounter" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="attachmentInfo" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="attachmentData" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="ignoreEmptyElements" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *       &lt;attribute name="updateconstraint" type="{http://www.w3.org/2001/XMLSchema}long" default="-1" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "query",
    "number",
    "messages",
    "urgency",
    "updateTime",
    "causeCodeL1",
    "affectedCI",
    "description",
    "resolution",
    "title",
    "status",
    "userImpact",
    "mapfreAmbit",
    "mapfreEnvironment",
    "causeCodeL2",
    "mapfreIdcat",
    "mapfreMonitorAlertId",
    "attachments"
})
@XmlRootElement(name = "UpdateIncidentResponse")
public class UpdateIncidentResponse {

    @XmlElement(required = true)
    protected String query;
    @XmlElement(required = true)
    protected String number;
    @XmlElement(required = true)
    protected String messages;
    @XmlElement(name = "Urgency", required = true)
    protected String urgency;
    @XmlElement(required = true)
    protected String updateTime;
    @XmlElement(name = "CauseCodeL1", required = true)
    protected String causeCodeL1;
    @XmlElement(name = "AffectedCI", required = true)
    protected String affectedCI;
    @XmlElement(name = "Description", required = true)
    protected String description;
    @XmlElement(name = "Resolution", required = true)
    protected String resolution;
    @XmlElement(name = "Title", required = true)
    protected String title;
    @XmlElement(name = "Status", required = true)
    protected String status;
    @XmlElement(name = "UserImpact", required = true)
    protected String userImpact;
    @XmlElement(name = "MapfreAmbit", required = true)
    protected String mapfreAmbit;
    @XmlElement(name = "MapfreEnvironment", required = true)
    protected String mapfreEnvironment;
    @XmlElement(name = "CauseCodeL2", required = true)
    protected String causeCodeL2;
    @XmlElement(name = "MapfreIdcat", required = true)
    protected String mapfreIdcat;
    @XmlElement(name = "MapfreMonitorAlertId", required = true)
    protected String mapfreMonitorAlertId;
    @XmlElement(required = true)
    protected String attachments;
    @XmlAttribute(name = "updatecounter")
    protected Long updatecounter;
    @XmlAttribute(name = "attachmentInfo")
    protected Boolean attachmentInfo;
    @XmlAttribute(name = "attachmentData")
    protected Boolean attachmentData;
    @XmlAttribute(name = "ignoreEmptyElements")
    protected Boolean ignoreEmptyElements;
    @XmlAttribute(name = "updateconstraint")
    protected Long updateconstraint;

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
     * Obtém o valor da propriedade number.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Define o valor da propriedade number.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Obtém o valor da propriedade messages.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessages() {
        return messages;
    }

    /**
     * Define o valor da propriedade messages.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessages(String value) {
        this.messages = value;
    }

    /**
     * Obtém o valor da propriedade urgency.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrgency() {
        return urgency;
    }

    /**
     * Define o valor da propriedade urgency.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrgency(String value) {
        this.urgency = value;
    }

    /**
     * Obtém o valor da propriedade updateTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * Define o valor da propriedade updateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdateTime(String value) {
        this.updateTime = value;
    }

    /**
     * Obtém o valor da propriedade causeCodeL1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCauseCodeL1() {
        return causeCodeL1;
    }

    /**
     * Define o valor da propriedade causeCodeL1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCauseCodeL1(String value) {
        this.causeCodeL1 = value;
    }

    /**
     * Obtém o valor da propriedade affectedCI.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAffectedCI() {
        return affectedCI;
    }

    /**
     * Define o valor da propriedade affectedCI.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAffectedCI(String value) {
        this.affectedCI = value;
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
     * Obtém o valor da propriedade resolution.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResolution() {
        return resolution;
    }

    /**
     * Define o valor da propriedade resolution.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResolution(String value) {
        this.resolution = value;
    }

    /**
     * Obtém o valor da propriedade title.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Define o valor da propriedade title.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Obtém o valor da propriedade status.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Define o valor da propriedade status.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Obtém o valor da propriedade userImpact.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserImpact() {
        return userImpact;
    }

    /**
     * Define o valor da propriedade userImpact.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserImpact(String value) {
        this.userImpact = value;
    }

    /**
     * Obtém o valor da propriedade mapfreAmbit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMapfreAmbit() {
        return mapfreAmbit;
    }

    /**
     * Define o valor da propriedade mapfreAmbit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMapfreAmbit(String value) {
        this.mapfreAmbit = value;
    }

    /**
     * Obtém o valor da propriedade mapfreEnvironment.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMapfreEnvironment() {
        return mapfreEnvironment;
    }

    /**
     * Define o valor da propriedade mapfreEnvironment.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMapfreEnvironment(String value) {
        this.mapfreEnvironment = value;
    }

    /**
     * Obtém o valor da propriedade causeCodeL2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCauseCodeL2() {
        return causeCodeL2;
    }

    /**
     * Define o valor da propriedade causeCodeL2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCauseCodeL2(String value) {
        this.causeCodeL2 = value;
    }

    /**
     * Obtém o valor da propriedade mapfreIdcat.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMapfreIdcat() {
        return mapfreIdcat;
    }

    /**
     * Define o valor da propriedade mapfreIdcat.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMapfreIdcat(String value) {
        this.mapfreIdcat = value;
    }

    /**
     * Obtém o valor da propriedade mapfreMonitorAlertId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMapfreMonitorAlertId() {
        return mapfreMonitorAlertId;
    }

    /**
     * Define o valor da propriedade mapfreMonitorAlertId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMapfreMonitorAlertId(String value) {
        this.mapfreMonitorAlertId = value;
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
     * Obtém o valor da propriedade attachmentInfo.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAttachmentInfo() {
        return attachmentInfo;
    }

    /**
     * Define o valor da propriedade attachmentInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAttachmentInfo(Boolean value) {
        this.attachmentInfo = value;
    }

    /**
     * Obtém o valor da propriedade attachmentData.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAttachmentData() {
        return attachmentData;
    }

    /**
     * Define o valor da propriedade attachmentData.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAttachmentData(Boolean value) {
        this.attachmentData = value;
    }

    /**
     * Obtém o valor da propriedade ignoreEmptyElements.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIgnoreEmptyElements() {
        if (ignoreEmptyElements == null) {
            return true;
        } else {
            return ignoreEmptyElements;
        }
    }

    /**
     * Define o valor da propriedade ignoreEmptyElements.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgnoreEmptyElements(Boolean value) {
        this.ignoreEmptyElements = value;
    }

    /**
     * Obtém o valor da propriedade updateconstraint.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public long getUpdateconstraint() {
        if (updateconstraint == null) {
            return -1L;
        } else {
            return updateconstraint;
        }
    }

    /**
     * Define o valor da propriedade updateconstraint.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUpdateconstraint(Long value) {
        this.updateconstraint = value;
    }

}
