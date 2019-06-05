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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de IncidentInstanceType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="IncidentInstanceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MapfreEnvironment" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="timeStamp" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Category" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Priority" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Urgency" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AssignmentGroup" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AffectedCI" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Assignee" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ContactPerson" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Company" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Level1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Level2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Level3" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="UserImpact" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ServiceRecipient" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CurrentAmbit" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CoordinatorGroup" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BusinessImpact" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="InitialAmbit" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Level4" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Level5" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MapfreIdcat" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Metal" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TypeEntry" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="attachments" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *       &lt;attribute name="query" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "IncidentInstanceType", propOrder = {
    "number",
    "mapfreEnvironment",
    "timeStamp",
    "status",
    "category",
    "priority",
    "urgency",
    "assignmentGroup",
    "affectedCI",
    "description",
    "assignee",
    "contactPerson",
    "company",
    "title",
    "level1",
    "level2",
    "level3",
    "userImpact",
    "serviceRecipient",
    "currentAmbit",
    "coordinatorGroup",
    "businessImpact",
    "initialAmbit",
    "level4",
    "level5",
    "mapfreIdcat",
    "metal",
    "typeEntry",
    "attachments"
})
public class IncidentInstanceType {

    @XmlElement(required = true)
    protected String number;
    @XmlElement(name = "MapfreEnvironment", required = true)
    protected String mapfreEnvironment;
    protected long timeStamp;
    @XmlElement(required = true)
    protected String status;
    @XmlElement(name = "Category", required = true)
    protected String category;
    @XmlElement(name = "Priority", required = true)
    protected String priority;
    @XmlElement(name = "Urgency", required = true)
    protected String urgency;
    @XmlElement(name = "AssignmentGroup", required = true)
    protected String assignmentGroup;
    @XmlElement(name = "AffectedCI", required = true)
    protected String affectedCI;
    @XmlElement(name = "Description", required = true)
    protected String description;
    @XmlElement(name = "Assignee", required = true)
    protected String assignee;
    @XmlElement(name = "ContactPerson", required = true)
    protected String contactPerson;
    @XmlElement(name = "Company", required = true)
    protected String company;
    @XmlElement(name = "Title", required = true)
    protected String title;
    @XmlElement(name = "Level1", required = true)
    protected String level1;
    @XmlElement(name = "Level2", required = true)
    protected String level2;
    @XmlElement(name = "Level3", required = true)
    protected String level3;
    @XmlElement(name = "UserImpact", required = true)
    protected String userImpact;
    @XmlElement(name = "ServiceRecipient", required = true)
    protected String serviceRecipient;
    @XmlElement(name = "CurrentAmbit", required = true)
    protected String currentAmbit;
    @XmlElement(name = "CoordinatorGroup", required = true)
    protected String coordinatorGroup;
    @XmlElement(name = "BusinessImpact", required = true)
    protected String businessImpact;
    @XmlElement(name = "InitialAmbit", required = true)
    protected String initialAmbit;
    @XmlElement(name = "Level4", required = true)
    protected String level4;
    @XmlElement(name = "Level5", required = true)
    protected String level5;
    @XmlElement(name = "MapfreIdcat", required = true)
    protected String mapfreIdcat;
    @XmlElement(name = "Metal", required = true)
    protected String metal;
    @XmlElement(name = "TypeEntry", required = true)
    protected String typeEntry;
    @XmlElement(required = true)
    protected String attachments;
    @XmlAttribute(name = "query")
    protected String query;
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
     * Obtém o valor da propriedade timeStamp.
     * 
     */
    public long getTimeStamp() {
        return timeStamp;
    }

    /**
     * Define o valor da propriedade timeStamp.
     * 
     */
    public void setTimeStamp(long value) {
        this.timeStamp = value;
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
     * Obtém o valor da propriedade category.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * Define o valor da propriedade category.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
    }

    /**
     * Obtém o valor da propriedade priority.
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
     * Define o valor da propriedade priority.
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
     * Obtém o valor da propriedade assignmentGroup.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssignmentGroup() {
        return assignmentGroup;
    }

    /**
     * Define o valor da propriedade assignmentGroup.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssignmentGroup(String value) {
        this.assignmentGroup = value;
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
     * Obtém o valor da propriedade assignee.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssignee() {
        return assignee;
    }

    /**
     * Define o valor da propriedade assignee.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssignee(String value) {
        this.assignee = value;
    }

    /**
     * Obtém o valor da propriedade contactPerson.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactPerson() {
        return contactPerson;
    }

    /**
     * Define o valor da propriedade contactPerson.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactPerson(String value) {
        this.contactPerson = value;
    }

    /**
     * Obtém o valor da propriedade company.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompany() {
        return company;
    }

    /**
     * Define o valor da propriedade company.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompany(String value) {
        this.company = value;
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
     * Obtém o valor da propriedade level1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLevel1() {
        return level1;
    }

    /**
     * Define o valor da propriedade level1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLevel1(String value) {
        this.level1 = value;
    }

    /**
     * Obtém o valor da propriedade level2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLevel2() {
        return level2;
    }

    /**
     * Define o valor da propriedade level2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLevel2(String value) {
        this.level2 = value;
    }

    /**
     * Obtém o valor da propriedade level3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLevel3() {
        return level3;
    }

    /**
     * Define o valor da propriedade level3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLevel3(String value) {
        this.level3 = value;
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
     * Obtém o valor da propriedade serviceRecipient.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceRecipient() {
        return serviceRecipient;
    }

    /**
     * Define o valor da propriedade serviceRecipient.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceRecipient(String value) {
        this.serviceRecipient = value;
    }

    /**
     * Obtém o valor da propriedade currentAmbit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentAmbit() {
        return currentAmbit;
    }

    /**
     * Define o valor da propriedade currentAmbit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentAmbit(String value) {
        this.currentAmbit = value;
    }

    /**
     * Obtém o valor da propriedade coordinatorGroup.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoordinatorGroup() {
        return coordinatorGroup;
    }

    /**
     * Define o valor da propriedade coordinatorGroup.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoordinatorGroup(String value) {
        this.coordinatorGroup = value;
    }

    /**
     * Obtém o valor da propriedade businessImpact.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessImpact() {
        return businessImpact;
    }

    /**
     * Define o valor da propriedade businessImpact.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessImpact(String value) {
        this.businessImpact = value;
    }

    /**
     * Obtém o valor da propriedade initialAmbit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitialAmbit() {
        return initialAmbit;
    }

    /**
     * Define o valor da propriedade initialAmbit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitialAmbit(String value) {
        this.initialAmbit = value;
    }

    /**
     * Obtém o valor da propriedade level4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLevel4() {
        return level4;
    }

    /**
     * Define o valor da propriedade level4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLevel4(String value) {
        this.level4 = value;
    }

    /**
     * Obtém o valor da propriedade level5.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLevel5() {
        return level5;
    }

    /**
     * Define o valor da propriedade level5.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLevel5(String value) {
        this.level5 = value;
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
     * Obtém o valor da propriedade metal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetal() {
        return metal;
    }

    /**
     * Define o valor da propriedade metal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetal(String value) {
        this.metal = value;
    }

    /**
     * Obtém o valor da propriedade typeEntry.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeEntry() {
        return typeEntry;
    }

    /**
     * Define o valor da propriedade typeEntry.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeEntry(String value) {
        this.typeEntry = value;
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
