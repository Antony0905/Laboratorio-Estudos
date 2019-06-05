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
 * <p>Classe Java de DeviceKeysType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DeviceKeysType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LogicalName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *       &lt;attribute name="query" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="updatecounter" type="{http://www.w3.org/2001/XMLSchema}long" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceKeysType", propOrder = {
    "logicalName"
})
public class DeviceKeysType {

    @XmlElement(name = "LogicalName", required = true, nillable = true)
    protected String logicalName;
    @XmlAttribute(name = "query")
    protected String query;
    @XmlAttribute(name = "updatecounter")
    protected Long updatecounter;

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

}
