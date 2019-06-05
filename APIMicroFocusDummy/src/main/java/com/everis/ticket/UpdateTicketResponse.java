//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2019.02.11 às 12:07:18 PM BRST 
//


package com.everis.ticket;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="idTicket" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "idTicket"
})
@XmlRootElement(name = "updateTicketResponse")
public class UpdateTicketResponse {

    @XmlElement(required = true)
    protected String idTicket;

    /**
     * Obtém o valor da propriedade idTicket.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdTicket() {
        return idTicket;
    }

    /**
     * Define o valor da propriedade idTicket.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdTicket(String value) {
        this.idTicket = value;
    }

}
