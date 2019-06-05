//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2019.02.10 às 11:06:41 PM BRST 
//


package com.hp.schemas.sm._7;

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
 *         &lt;element name="titulo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="descricao" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ci" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="impacto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="urgencia" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="idAlerta" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Idcat" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="abertoPor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="contato" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="destinatario" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="localizacao" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="entorno" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ambito" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ambitoInicial" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "titulo",
    "descricao",
    "ci",
    "impacto",
    "urgencia",
    "idAlerta",
    "idcat",
    "abertoPor",
    "contato",
    "destinatario",
    "localizacao",
    "entorno",
    "ambito",
    "ambitoInicial"
})
@XmlRootElement(name = "postTicketRequest")
public class PostTicketRequest {

    @XmlElement(required = true)
    protected String titulo;
    @XmlElement(required = true)
    protected String descricao;
    @XmlElement(required = true)
    protected String ci;
    @XmlElement(required = true)
    protected String impacto;
    @XmlElement(required = true)
    protected String urgencia;
    @XmlElement(required = true)
    protected String idAlerta;
    @XmlElement(name = "Idcat", required = true)
    protected String idcat;
    @XmlElement(required = true)
    protected String abertoPor;
    @XmlElement(required = true)
    protected String contato;
    @XmlElement(required = true)
    protected String destinatario;
    @XmlElement(required = true)
    protected String localizacao;
    @XmlElement(required = true)
    protected String entorno;
    @XmlElement(required = true)
    protected String ambito;
    @XmlElement(required = true)
    protected String ambitoInicial;

    /**
     * Obtém o valor da propriedade titulo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Define o valor da propriedade titulo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitulo(String value) {
        this.titulo = value;
    }

    /**
     * Obtém o valor da propriedade descricao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Define o valor da propriedade descricao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricao(String value) {
        this.descricao = value;
    }

    /**
     * Obtém o valor da propriedade ci.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCi() {
        return ci;
    }

    /**
     * Define o valor da propriedade ci.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCi(String value) {
        this.ci = value;
    }

    /**
     * Obtém o valor da propriedade impacto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImpacto() {
        return impacto;
    }

    /**
     * Define o valor da propriedade impacto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImpacto(String value) {
        this.impacto = value;
    }

    /**
     * Obtém o valor da propriedade urgencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrgencia() {
        return urgencia;
    }

    /**
     * Define o valor da propriedade urgencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrgencia(String value) {
        this.urgencia = value;
    }

    /**
     * Obtém o valor da propriedade idAlerta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdAlerta() {
        return idAlerta;
    }

    /**
     * Define o valor da propriedade idAlerta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdAlerta(String value) {
        this.idAlerta = value;
    }

    /**
     * Obtém o valor da propriedade idcat.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdcat() {
        return idcat;
    }

    /**
     * Define o valor da propriedade idcat.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdcat(String value) {
        this.idcat = value;
    }

    /**
     * Obtém o valor da propriedade abertoPor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbertoPor() {
        return abertoPor;
    }

    /**
     * Define o valor da propriedade abertoPor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbertoPor(String value) {
        this.abertoPor = value;
    }

    /**
     * Obtém o valor da propriedade contato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContato() {
        return contato;
    }

    /**
     * Define o valor da propriedade contato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContato(String value) {
        this.contato = value;
    }

    /**
     * Obtém o valor da propriedade destinatario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinatario() {
        return destinatario;
    }

    /**
     * Define o valor da propriedade destinatario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinatario(String value) {
        this.destinatario = value;
    }

    /**
     * Obtém o valor da propriedade localizacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalizacao() {
        return localizacao;
    }

    /**
     * Define o valor da propriedade localizacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalizacao(String value) {
        this.localizacao = value;
    }

    /**
     * Obtém o valor da propriedade entorno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntorno() {
        return entorno;
    }

    /**
     * Define o valor da propriedade entorno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntorno(String value) {
        this.entorno = value;
    }

    /**
     * Obtém o valor da propriedade ambito.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmbito() {
        return ambito;
    }

    /**
     * Define o valor da propriedade ambito.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmbito(String value) {
        this.ambito = value;
    }

    /**
     * Obtém o valor da propriedade ambitoInicial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmbitoInicial() {
        return ambitoInicial;
    }

    /**
     * Define o valor da propriedade ambitoInicial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmbitoInicial(String value) {
        this.ambitoInicial = value;
    }

}
