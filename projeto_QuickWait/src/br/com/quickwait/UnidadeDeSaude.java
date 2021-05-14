package br.com.quickwait;

import java.time.LocalDateTime;

// Classe responsável por persistir dados de unidade de saude e armazenar as mesmas
public class UnidadeDeSaude {
	
	private String nome;
	private String cnpj;
	private int pacientesEmEspera;
	private int numeroDeleitos;
	private String statusHospital;
	private String tipoUnidadeDeSaude;
	private LocalDateTime horarioDeFuncionamento;
	
	// -- Constructor --
	public UnidadeDeSaude(String nome, String cnpj, int pacientesEmEspera, int numeroDeleitos, String statusHospital,
			String tipoUnidadeDeSaude, LocalDateTime horarioDeFuncionamento) {
		super();
		this.nome = nome;
		this.cnpj = cnpj;
		this.pacientesEmEspera = pacientesEmEspera;
		this.numeroDeleitos = numeroDeleitos;
		this.statusHospital = statusHospital;
		this.tipoUnidadeDeSaude = tipoUnidadeDeSaude;
		this.horarioDeFuncionamento = horarioDeFuncionamento;
	}
	
	// Responsável por gravar unidades de interesse do usuário
	public void gravarUnidade() {}

	
	
	
	
	// Getters and Setters
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public int getPacientesEmEspera() {
		return pacientesEmEspera;
	}

	public void setPacientesEmEspera(int pacientesEmEspera) {
		this.pacientesEmEspera = pacientesEmEspera;
	}

	public int getNumeroDeleitos() {
		return numeroDeleitos;
	}

	public void setNumeroDeleitos(int numeroDeleitos) {
		this.numeroDeleitos = numeroDeleitos;
	}

	public String getStatusHospital() {
		return statusHospital;
	}

	public void setStatusHospital(String statusHospital) {
		this.statusHospital = statusHospital;
	}

	public String getTipoUnidadeDeSaude() {
		return tipoUnidadeDeSaude;
	}

	public void setTipoUnidadeDeSaude(String tipoUnidadeDeSaude) {
		this.tipoUnidadeDeSaude = tipoUnidadeDeSaude;
	}

	public LocalDateTime getHorarioDeFuncionamento() {
		return horarioDeFuncionamento;
	}

	public void setHorarioDeFuncionamento(LocalDateTime horarioDeFuncionamento) {
		this.horarioDeFuncionamento = horarioDeFuncionamento;
	};
	
	
}
