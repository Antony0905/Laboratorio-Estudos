//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2019.04.08 às 05:43:26 PM BRT 
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
 *         &lt;element name="ArrayOfIncidentInstanceType" type="{http://everis.com/ticket}ArrayOfIncidentInstanceType"/>
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
    "arrayOfIncidentInstanceType"
})
@XmlRootElement(name = "RetrieveIncidentListResponse")
public class RetrieveIncidentListResponse {

    @XmlElement(name = "ArrayOfIncidentInstanceType", required = true)
    protected ArrayOfIncidentInstanceType arrayOfIncidentInstanceType;

    /**
     * Obtém o valor da propriedade arrayOfIncidentInstanceType.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfIncidentInstanceType }
     *     
     */
    public ArrayOfIncidentInstanceType getArrayOfIncidentInstanceType() {
        return arrayOfIncidentInstanceType;
    }

    /**
     * Define o valor da propriedade arrayOfIncidentInstanceType.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfIncidentInstanceType }
     *     
     */
    public void setArrayOfIncidentInstanceType(ArrayOfIncidentInstanceType value) {
        this.arrayOfIncidentInstanceType = value;
    }

}
