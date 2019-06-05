//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2019.04.02 às 03:13:45 PM BRT 
//


package com.everis.ticket;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de IncidentModelType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="IncidentModelType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="keys" type="{http://everis.com/ticket}IncidentKeysType"/>
 *         &lt;element name="instance" type="{http://everis.com/ticket}IncidentInstanceType"/>
 *         &lt;element name="messages" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="query" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IncidentModelType", propOrder = {
    "keys",
    "instance",
    "messages"
})
public class IncidentModelType {

    @XmlElement(required = true)
    protected IncidentKeysType keys;
    @XmlElement(required = true)
    protected IncidentInstanceType instance;
    protected String messages;
    @XmlAttribute(name = "query")
    protected String query;

    /**
     * Obtém o valor da propriedade keys.
     * 
     * @return
     *     possible object is
     *     {@link IncidentKeysType }
     *     
     */
    public IncidentKeysType getKeys() {
        return keys;
    }

    /**
     * Define o valor da propriedade keys.
     * 
     * @param value
     *     allowed object is
     *     {@link IncidentKeysType }
     *     
     */
    public void setKeys(IncidentKeysType value) {
        this.keys = value;
    }

    /**
     * Obtém o valor da propriedade instance.
     * 
     * @return
     *     possible object is
     *     {@link IncidentInstanceType }
     *     
     */
    public IncidentInstanceType getInstance() {
        return instance;
    }

    /**
     * Define o valor da propriedade instance.
     * 
     * @param value
     *     allowed object is
     *     {@link IncidentInstanceType }
     *     
     */
    public void setInstance(IncidentInstanceType value) {
        this.instance = value;
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

}
