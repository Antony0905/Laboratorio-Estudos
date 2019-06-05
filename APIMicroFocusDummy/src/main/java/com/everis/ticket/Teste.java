//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2019.02.28 às 05:31:42 PM BRT 
//


package com.everis.ticket;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de teste complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="teste">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IncidentId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Category" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Priority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Urgency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AssignmentGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AffectedCI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Assignee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContactPerson" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Company" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Level1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Level2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Level3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserImpact" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServiceRecipient" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrentAmbit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CoordinatorGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BusinessImpact" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InitialAmbit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Level4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Level5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IdCat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Metal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TypeEntry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="attachments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "teste", propOrder = {
    "number",
    "incidentId",
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
    "idCat",
    "metal",
    "typeEntry",
    "attachments"
})
public class Teste {

    @XmlElement(required = true)
    protected String number;
    @XmlElement(name = "IncidentId", required = true)
    protected String incidentId;
    @XmlElementRef(name = "Category", namespace = "http://everis.com/ticket", type = JAXBElement.class, required = false)
    protected JAXBElement<String> category;
    @XmlElementRef(name = "Priority", namespace = "http://everis.com/ticket", type = JAXBElement.class, required = false)
    protected JAXBElement<String> priority;
    @XmlElementRef(name = "Urgency", namespace = "http://everis.com/ticket", type = JAXBElement.class, required = false)
    protected JAXBElement<String> urgency;
    @XmlElementRef(name = "AssignmentGroup", namespace = "http://everis.com/ticket", type = JAXBElement.class, required = false)
    protected JAXBElement<String> assignmentGroup;
    @XmlElementRef(name = "AffectedCI", namespace = "http://everis.com/ticket", type = JAXBElement.class, required = false)
    protected JAXBElement<String> affectedCI;
    @XmlElement(name = "Description")
    protected List<String> description;
    @XmlElementRef(name = "Assignee", namespace = "http://everis.com/ticket", type = JAXBElement.class, required = false)
    protected JAXBElement<String> assignee;
    @XmlElementRef(name = "ContactPerson", namespace = "http://everis.com/ticket", type = JAXBElement.class, required = false)
    protected JAXBElement<String> contactPerson;
    @XmlElementRef(name = "Company", namespace = "http://everis.com/ticket", type = JAXBElement.class, required = false)
    protected JAXBElement<String> company;
    @XmlElementRef(name = "Title", namespace = "http://everis.com/ticket", type = JAXBElement.class, required = false)
    protected JAXBElement<String> title;
    @XmlElementRef(name = "Level1", namespace = "http://everis.com/ticket", type = JAXBElement.class, required = false)
    protected JAXBElement<String> level1;
    @XmlElementRef(name = "Level2", namespace = "http://everis.com/ticket", type = JAXBElement.class, required = false)
    protected JAXBElement<String> level2;
    @XmlElementRef(name = "Level3", namespace = "http://everis.com/ticket", type = JAXBElement.class, required = false)
    protected JAXBElement<String> level3;
    @XmlElementRef(name = "UserImpact", namespace = "http://everis.com/ticket", type = JAXBElement.class, required = false)
    protected JAXBElement<String> userImpact;
    @XmlElementRef(name = "ServiceRecipient", namespace = "http://everis.com/ticket", type = JAXBElement.class, required = false)
    protected JAXBElement<String> serviceRecipient;
    @XmlElementRef(name = "CurrentAmbit", namespace = "http://everis.com/ticket", type = JAXBElement.class, required = false)
    protected JAXBElement<String> currentAmbit;
    @XmlElementRef(name = "CoordinatorGroup", namespace = "http://everis.com/ticket", type = JAXBElement.class, required = false)
    protected JAXBElement<String> coordinatorGroup;
    @XmlElementRef(name = "BusinessImpact", namespace = "http://everis.com/ticket", type = JAXBElement.class, required = false)
    protected JAXBElement<String> businessImpact;
    @XmlElementRef(name = "InitialAmbit", namespace = "http://everis.com/ticket", type = JAXBElement.class, required = false)
    protected JAXBElement<String> initialAmbit;
    @XmlElementRef(name = "Level4", namespace = "http://everis.com/ticket", type = JAXBElement.class, required = false)
    protected JAXBElement<String> level4;
    @XmlElementRef(name = "Level5", namespace = "http://everis.com/ticket", type = JAXBElement.class, required = false)
    protected JAXBElement<String> level5;
    @XmlElementRef(name = "IdCat", namespace = "http://everis.com/ticket", type = JAXBElement.class, required = false)
    protected JAXBElement<String> idCat;
    @XmlElementRef(name = "Metal", namespace = "http://everis.com/ticket", type = JAXBElement.class, required = false)
    protected JAXBElement<String> metal;
    @XmlElementRef(name = "TypeEntry", namespace = "http://everis.com/ticket", type = JAXBElement.class, required = false)
    protected JAXBElement<String> typeEntry;
    @XmlElementRef(name = "attachments", namespace = "http://everis.com/ticket", type = JAXBElement.class, required = false)
    protected JAXBElement<String> attachments;
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
     * Obtém o valor da propriedade incidentId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncidentId() {
        return incidentId;
    }

    /**
     * Define o valor da propriedade incidentId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncidentId(String value) {
        this.incidentId = value;
    }

    /**
     * Obtém o valor da propriedade category.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCategory() {
        return category;
    }

    /**
     * Define o valor da propriedade category.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCategory(JAXBElement<String> value) {
        this.category = value;
    }

    /**
     * Obtém o valor da propriedade priority.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPriority() {
        return priority;
    }

    /**
     * Define o valor da propriedade priority.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPriority(JAXBElement<String> value) {
        this.priority = value;
    }

    /**
     * Obtém o valor da propriedade urgency.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUrgency() {
        return urgency;
    }

    /**
     * Define o valor da propriedade urgency.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUrgency(JAXBElement<String> value) {
        this.urgency = value;
    }

    /**
     * Obtém o valor da propriedade assignmentGroup.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAssignmentGroup() {
        return assignmentGroup;
    }

    /**
     * Define o valor da propriedade assignmentGroup.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAssignmentGroup(JAXBElement<String> value) {
        this.assignmentGroup = value;
    }

    /**
     * Obtém o valor da propriedade affectedCI.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAffectedCI() {
        return affectedCI;
    }

    /**
     * Define o valor da propriedade affectedCI.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAffectedCI(JAXBElement<String> value) {
        this.affectedCI = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the description property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDescription() {
        if (description == null) {
            description = new ArrayList<String>();
        }
        return this.description;
    }

    /**
     * Obtém o valor da propriedade assignee.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAssignee() {
        return assignee;
    }

    /**
     * Define o valor da propriedade assignee.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAssignee(JAXBElement<String> value) {
        this.assignee = value;
    }

    /**
     * Obtém o valor da propriedade contactPerson.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getContactPerson() {
        return contactPerson;
    }

    /**
     * Define o valor da propriedade contactPerson.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setContactPerson(JAXBElement<String> value) {
        this.contactPerson = value;
    }

    /**
     * Obtém o valor da propriedade company.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCompany() {
        return company;
    }

    /**
     * Define o valor da propriedade company.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCompany(JAXBElement<String> value) {
        this.company = value;
    }

    /**
     * Obtém o valor da propriedade title.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTitle() {
        return title;
    }

    /**
     * Define o valor da propriedade title.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTitle(JAXBElement<String> value) {
        this.title = value;
    }

    /**
     * Obtém o valor da propriedade level1.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLevel1() {
        return level1;
    }

    /**
     * Define o valor da propriedade level1.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLevel1(JAXBElement<String> value) {
        this.level1 = value;
    }

    /**
     * Obtém o valor da propriedade level2.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLevel2() {
        return level2;
    }

    /**
     * Define o valor da propriedade level2.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLevel2(JAXBElement<String> value) {
        this.level2 = value;
    }

    /**
     * Obtém o valor da propriedade level3.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLevel3() {
        return level3;
    }

    /**
     * Define o valor da propriedade level3.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLevel3(JAXBElement<String> value) {
        this.level3 = value;
    }

    /**
     * Obtém o valor da propriedade userImpact.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserImpact() {
        return userImpact;
    }

    /**
     * Define o valor da propriedade userImpact.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserImpact(JAXBElement<String> value) {
        this.userImpact = value;
    }

    /**
     * Obtém o valor da propriedade serviceRecipient.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getServiceRecipient() {
        return serviceRecipient;
    }

    /**
     * Define o valor da propriedade serviceRecipient.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setServiceRecipient(JAXBElement<String> value) {
        this.serviceRecipient = value;
    }

    /**
     * Obtém o valor da propriedade currentAmbit.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurrentAmbit() {
        return currentAmbit;
    }

    /**
     * Define o valor da propriedade currentAmbit.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurrentAmbit(JAXBElement<String> value) {
        this.currentAmbit = value;
    }

    /**
     * Obtém o valor da propriedade coordinatorGroup.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCoordinatorGroup() {
        return coordinatorGroup;
    }

    /**
     * Define o valor da propriedade coordinatorGroup.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCoordinatorGroup(JAXBElement<String> value) {
        this.coordinatorGroup = value;
    }

    /**
     * Obtém o valor da propriedade businessImpact.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBusinessImpact() {
        return businessImpact;
    }

    /**
     * Define o valor da propriedade businessImpact.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBusinessImpact(JAXBElement<String> value) {
        this.businessImpact = value;
    }

    /**
     * Obtém o valor da propriedade initialAmbit.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInitialAmbit() {
        return initialAmbit;
    }

    /**
     * Define o valor da propriedade initialAmbit.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInitialAmbit(JAXBElement<String> value) {
        this.initialAmbit = value;
    }

    /**
     * Obtém o valor da propriedade level4.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLevel4() {
        return level4;
    }

    /**
     * Define o valor da propriedade level4.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLevel4(JAXBElement<String> value) {
        this.level4 = value;
    }

    /**
     * Obtém o valor da propriedade level5.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLevel5() {
        return level5;
    }

    /**
     * Define o valor da propriedade level5.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLevel5(JAXBElement<String> value) {
        this.level5 = value;
    }

    /**
     * Obtém o valor da propriedade idCat.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdCat() {
        return idCat;
    }

    /**
     * Define o valor da propriedade idCat.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdCat(JAXBElement<String> value) {
        this.idCat = value;
    }

    /**
     * Obtém o valor da propriedade metal.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMetal() {
        return metal;
    }

    /**
     * Define o valor da propriedade metal.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMetal(JAXBElement<String> value) {
        this.metal = value;
    }

    /**
     * Obtém o valor da propriedade typeEntry.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTypeEntry() {
        return typeEntry;
    }

    /**
     * Define o valor da propriedade typeEntry.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTypeEntry(JAXBElement<String> value) {
        this.typeEntry = value;
    }

    /**
     * Obtém o valor da propriedade attachments.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAttachments() {
        return attachments;
    }

    /**
     * Define o valor da propriedade attachments.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAttachments(JAXBElement<String> value) {
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
