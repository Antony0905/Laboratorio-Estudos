package com.everis.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import org.springframework.beans.BeanUtils;

public class Evento implements Serializable {

	private static final long serialVersionUID = 1L;

	public Evento() {
		super();
	}

	private Integer id;

	// NAGIOS
	private String idLogico;
	private String currentAttempt;
	private String maxAttempts;
	private String stateType;
	private String hostAddress;
	private String status;
	private String timeStamp;
	private String executioTime;
	private String hostName;
	private String servico;
	private String statusText;
	private String performance;
	private Date inicioDownTime;
	private Date fimDownTime;
	private String indicadorDownTime;

	// ESTADO EVENTO
	private Date alta;
	private Date baixa;
	private String estadoAtual;
	private String estadoAnterior;
	private Date dataEstadoAtual;
	private Date dataEstadoAnterior;
	private String motivoAtual;
	private String motivoAnterior;
	private String contratoLegal;
	private String notification1;
	private String notification2;
	private String notification3;
	private int notificationFlag;

	// CRITICIDADE
	private String criticidadeHost;

	// RESTRICAO ABERTURA
	private String indicadorAbertura;

	// CMDB
	private String type;
	private String subType;
	private String pais;
	private String ciTicket;
	private String sistemaOperacional;

	// TEMPLATE ABERTURA
	private String tituloTicket;
	private String descricaoTicket;
	private String abertoPor;
	private String contato;
	private String destinatario;
	private String localizacao;
	private String entorno;
	private String ambito;
	private String ambitoInicial;

	// TICKET RAW DATA
	private String idIncidenteTicket;
	private String marcacaoTicket;
	private String statusTicket;

	// CANAL ATENDIMENTO CAT
	private String idCatTicket;
	private String categorizacao;

	// CANAL ATENDIMENTO PRIORIDADE
	private String impactoUsuarioTicket;
	private String urgenciaTicket;

	// ALERTA TICKET
	private String idAlertaTicket;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getIdLogico() {
		return idLogico;
	}

	public void setIdLogico(String idLogico) {
		this.idLogico = idLogico;
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

	public String getIndicadorAbertura() {
		return indicadorAbertura;
	}

	public void setIndicadorAbertura(String indicadorAbertura) {
		this.indicadorAbertura = indicadorAbertura;
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

	public String getCurrentAttempt() {
		return currentAttempt;
	}

	public void setCurrentAttempt(String currentAttempt) {
		this.currentAttempt = currentAttempt;
	}

	public String getMaxAttempts() {
		return maxAttempts;
	}

	public void setMaxAttempts(String maxAttempts) {
		this.maxAttempts = maxAttempts;
	}

	public String getStateType() {
		return stateType;
	}

	public void setStateType(String stateType) {
		this.stateType = stateType;
	}

	public String getHostAddress() {
		return hostAddress;
	}

	public void setHostAddress(String hostAddress) {
		this.hostAddress = hostAddress;
	}

	public String getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}

	public String getExecutioTime() {
		return executioTime;
	}

	public void setExecutioTime(String executioTime) {
		this.executioTime = executioTime;
	}

	public String getHostName() {
		return hostName;
	}

	public void setHostName(String hostName) {
		this.hostName = hostName;
	}

	public String getServico() {
		return servico;
	}

	public void setServico(String servico) {
		this.servico = servico;
	}

	public String getStatusText() {
		return statusText;
	}

	public void setStatusText(String statusText) {
		this.statusText = statusText;
	}

	public String getPerformance() {
		return performance;
	}

	public void setPerformance(String performance) {
		this.performance = performance;
	}

	public Date getInicioDownTime() {
		return inicioDownTime;
	}

	public void setInicioDownTime(Date inicioDownTime) {
		this.inicioDownTime = inicioDownTime;
	}

	public Date getFimDownTime() {
		return fimDownTime;
	}

	public void setFimDownTime(Date fimDownTime) {
		this.fimDownTime = fimDownTime;
	}

	public String getIndicadorDownTime() {
		return indicadorDownTime;
	}

	public void setIndicadorDownTime(String indicadorDownTime) {
		this.indicadorDownTime = indicadorDownTime;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getCiTicket() {
		return ciTicket;
	}

	public void setCiTicket(String ciTicket) {
		this.ciTicket = ciTicket;
	}

	public String getSistemaOperacional() {
		return sistemaOperacional;
	}

	public void setSistemaOperacional(String sistemaOperacional) {
		this.sistemaOperacional = sistemaOperacional;
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

	public String getIdCatTicket() {
		return idCatTicket;
	}

	public void setIdCatTicket(String idCatTicket) {
		this.idCatTicket = idCatTicket;
	}

	public String getIdIncidenteTicket() {
		return idIncidenteTicket;
	}

	public void setIdIncidenteTicket(String idIncidenteTicket) {
		this.idIncidenteTicket = idIncidenteTicket;
	}

	public String getMarcacaoTicket() {
		return marcacaoTicket;
	}

	public void setMarcacaoTicket(String marcacaoTicket) {
		this.marcacaoTicket = marcacaoTicket;
	}

	public String getStatusTicket() {
		return statusTicket;
	}

	public void setStatusTicket(String statusTicket) {
		this.statusTicket = statusTicket;
	}

	public String getCriticidadeHost() {
		return criticidadeHost;
	}

	public void setCriticidadeHost(String criticidadeHost) {
		this.criticidadeHost = criticidadeHost;
	}

	public String getCategorizacao() {
		return categorizacao;
	}

	public void setCategorizacao(String categorizacao) {
		this.categorizacao = categorizacao;
	}

	public String getEstadoAtual() {
		return estadoAtual;
	}

	public void setEstadoAtual(String estadoAtual) {
		this.estadoAtual = estadoAtual;
	}

	public String getMotivoAtual() {
		return motivoAtual;
	}

	public void setMotivoAtual(String motivoAtual) {
		this.motivoAtual = motivoAtual;
	}

	public String getEstadoAnterior() {
		return estadoAnterior;
	}

	public void setEstadoAnterior(String estadoAnterior) {
		this.estadoAnterior = estadoAnterior;
	}

	public String getMotivoAnterior() {
		return motivoAnterior;
	}

	public void setMotivoAnterior(String motivoAnterior) {
		this.motivoAnterior = motivoAnterior;
	}

	public Date getDataEstadoAtual() {
		return dataEstadoAtual;
	}

	public void setDataEstadoAtual(Date dataEstadoAtual) {
		this.dataEstadoAtual = dataEstadoAtual;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getDataEstadoAnterior() {
		return dataEstadoAnterior;
	}

	public void setDataEstadoAnterior(Date dataEstadoAnterior) {
		this.dataEstadoAnterior = dataEstadoAnterior;
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

	public String getIdAlertaTicket() {
		return idAlertaTicket;
	}

	public void setIdAlertaTicket(String idAlertaTicket) {
		this.idAlertaTicket = idAlertaTicket;
	}

	public String getContratoLegal() {
		return contratoLegal;
	}

	public void setContratoLegal(String contratoLegal) {
		this.contratoLegal = contratoLegal;
	}

	public Date getAlta() {
		return alta;
	}

	public void setAlta(Date alta) {
		this.alta = alta;
	}

	public Date getBaixa() {
		return baixa;
	}

	public void setBaixa(Date baixa) {
		this.baixa = baixa;
	}

	public String getNotification1() {
		return notification1;
	}

	public void setNotification1(String notification1) {
		this.notification1 = notification1;
	}

	public String getNotification2() {
		return notification2;
	}

	public void setNotification2(String notification2) {
		this.notification2 = notification2;
	}

	public String getNotification3() {
		return notification3;
	}

	public void setNotification3(String notification3) {
		this.notification3 = notification3;
	}

	public int getNotificationFlag() {
		return notificationFlag;
	}

	public void setNotificationFlag(int notificationFlag) {
		this.notificationFlag = notificationFlag;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSubType() {
		return subType;
	}

	public void setSubType(String subType) {
		this.subType = subType;
	}

	public Evento getEventoByMap(HashMap<String, Object> mapContext) {
		Set<String> chaves = mapContext.keySet();
		Evento evento = new Evento();

		for (Iterator<String> iterator = chaves.iterator(); iterator.hasNext();) {
			String chave = iterator.next();
			if (chave != null) {
				try {
					BeanUtils.copyProperties(mapContext.get(chave), evento);
				} catch (Exception e) {
				}
			}
		}

		return evento;

	}

	public String getTicketAtributes() {
		return this.tituloTicket + this.descricaoTicket + this.abertoPor + this.contato + this.destinatario
				+ this.localizacao + this.entorno + this.ambito + this.ambitoInicial + this.ciTicket
				+ this.impactoUsuarioTicket + this.urgenciaTicket + this.idIncidenteTicket + this.idCatTicket;
	}

}
