package com.everis.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table
public class Update implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "ticket_simulacion_generator")
	@SequenceGenerator(name = "ticket_simulacion_generator", sequenceName = "ticket_simulacion_generator", initialValue = 1, allocationSize = 1)
	@Column(name = "id", unique = true, nullable = false)
	private Integer id;

	private String tituloTicket;
	private String descricaoTicket;
	private String abertoPor;
	private String contato;
	private String destinatario;
	private String localizacao;
	private String entorno;
	private String ambito;
	private String ambitoInicial;
	private Long time;
	private String ciTicket;
	private String impactoUsuarioTicket;
	private String urgenciaTicket;
	private String idIncidenteTicket;
	private String idCatTicket;

	private String acao;
	private Date dataProcessamento;

	private String statusTicket;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAcao() {
		return acao;
	}

	public void setAcao(String acao) {
		this.acao = acao;
	}

	public Date getDataProcessamento() {
		return dataProcessamento;
	}

	public void setDataProcessamento(Date dataProcessamento) {
		this.dataProcessamento = dataProcessamento;
	}

	public String getTituloTicket() {
		return tituloTicket;
	}

	public void setTituloTicket(String tituloTicket) {
		this.tituloTicket = tituloTicket;
	}

	public String getDescricaoTicket() {
		return descricaoTicket;
	}

	public void setDescricaoTicket(String descricaoTicket) {
		this.descricaoTicket = descricaoTicket;
	}

	public String getAbertoPor() {
		return abertoPor;
	}

	public void setAbertoPor(String abertoPor) {
		this.abertoPor = abertoPor;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	public String getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public String getEntorno() {
		return entorno;
	}

	public void setEntorno(String entorno) {
		this.entorno = entorno;
	}

	public String getAmbito() {
		return ambito;
	}

	public void setAmbito(String ambito) {
		this.ambito = ambito;
	}

	public String getAmbitoInicial() {
		return ambitoInicial;
	}

	public void setAmbitoInicial(String ambitoInicial) {
		this.ambitoInicial = ambitoInicial;
	}

	public String getCiTicket() {
		return ciTicket;
	}

	public void setCiTicket(String ciTicket) {
		this.ciTicket = ciTicket;
	}

	public String getImpactoUsuarioTicket() {
		return impactoUsuarioTicket;
	}

	public void setImpactoUsuarioTicket(String impactoUsuarioTicket) {
		this.impactoUsuarioTicket = impactoUsuarioTicket;
	}

	public String getUrgenciaTicket() {
		return urgenciaTicket;
	}

	public void setUrgenciaTicket(String urgenciaTicket) {
		this.urgenciaTicket = urgenciaTicket;
	}

	public String getIdIncidenteTicket() {
		return idIncidenteTicket;
	}

	public void setIdIncidenteTicket(String idIncidenteTicket) {
		this.idIncidenteTicket = idIncidenteTicket;
	}

	public String getIdCatTicket() {
		return idCatTicket;
	}

	public void setIdCatTicket(String idCatTicket) {
		this.idCatTicket = idCatTicket;
	}

	public Long getTime() {
		return time;
	}

	public void setTime(Long time) {
		this.time = time;
	}

	public String getStatusTicket() {
		return statusTicket;
	}

	public void setStatusTicket(String statusTicket) {
		this.statusTicket = statusTicket;
	}

}
