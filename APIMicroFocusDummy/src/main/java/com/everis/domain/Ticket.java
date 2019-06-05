package com.everis.domain;

public class Ticket {
	private String titulo;
	private String descricao;
	private String abertoPor;
	private String contato;
	private String destinatario;
	private String localizacao;
	private String entorno;
	private String ambito;
	private String ambitoInicial;

	private String ci;
	private String impacto;
	private String urgencia;
	private String idAlerta;
	private String Idcat;

	public String getCi() {
		return ci;
	}

	public void setCi(String ci) {
		this.ci = ci;
	}

	public String getImpacto() {
		return impacto;
	}

	public void setImpacto(String impacto) {
		this.impacto = impacto;
	}

	public String getUrgencia() {
		return urgencia;
	}

	public void setUrgencia(String urgencia) {
		this.urgencia = urgencia;
	}

	public String getIdAlerta() {
		return idAlerta;
	}

	public void setIdAlerta(String idAlerta) {
		this.idAlerta = idAlerta;
	}

	public String getIdcat() {
		return Idcat;
	}

	public void setIdcat(String idcat) {
		Idcat = idcat;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
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

}
