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
 * <p>Classe Java de DeviceModelType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DeviceModelType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="keys" type="{http://everis.com/ticket}DeviceKeysType"/>
 *         &lt;element name="instance" type="{http://everis.com/ticket}DeviceInstanceType"/>
 *         &lt;element name="messages" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "DeviceModelType", propOrder = {
    "keys",
    "instance",
    "messages"
})
public class DeviceModelType {

    @XmlElement(required = true)
    protected DeviceKeysType keys;
    @XmlElement(required = true)
    protected DeviceInstanceType instance;
    @XmlElement(required = true)
    protected String messages;
    @XmlAttribute(name = "query")
    protected String query;

    /**
     * Obtém o valor da propriedade keys.
     * 
     * @return
     *     possible object is
     *     {@link DeviceKeysType }
     *     
     */
    public DeviceKeysType getKeys() {
        return keys;
    }

    /**
     * Define o valor da propriedade keys.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceKeysType }
     *     
     */
    public void setKeys(DeviceKeysType value) {
        this.keys = value;
    }

    /**
     * Obtém o valor da propriedade instance.
     * 
     * @return
     *     possible object is
     *     {@link DeviceInstanceType }
     *     
     */
    public DeviceInstanceType getInstance() {
        return instance;
    }

    /**
     * Define o valor da propriedade instance.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceInstanceType }
     *     
     */
    public void setInstance(DeviceInstanceType value) {
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
