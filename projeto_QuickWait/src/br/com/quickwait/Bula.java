package br.com.quickwait;

public class Bula { // Classe que persiste os dados da bula de um medicamento
	
	private String contraindicacoes;
	private String prescricao;
	private String preparacao;
	private String administracao;
	private String advertencia;
	
	// Constructor
	
	public Bula(String contraindicacoes, String prescricao, String preparacao, String administracao,
			String advertencia) {
		super();
		this.contraindicacoes = contraindicacoes;
		this.prescricao = prescricao;
		this.preparacao = preparacao;
		this.administracao = administracao;
		this.advertencia = advertencia;
	}
	
	// Getters and Setters

	public String getContraindicacoes() {
		return contraindicacoes;
	}

	public void setContraindicacoes(String contraindicacoes) {
		this.contraindicacoes = contraindicacoes;
	}

	public String getPrescricao() {
		return prescricao;
	}

	public void setPrescricao(String prescricao) {
		this.prescricao = prescricao;
	}

	public String getPreparacao() {
		return preparacao;
	}

	public void setPreparacao(String preparacao) {
		this.preparacao = preparacao;
	}

	public String getAdministracao() {
		return administracao;
	}

	public void setAdministracao(String administracao) {
		this.administracao = administracao;
	}

	public String getAdvertencia() {
		return advertencia;
	}

	public void setAdvertencia(String advertencia) {
		this.advertencia = advertencia;
	}
	
	
	
	
}
