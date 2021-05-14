package br.com.quickwait;

	// Classe que persiste os dados de um medicamento
public class Medicamento {
	
	private String id;
	private String nome;
	private Float quantidade;
	private String tarja;
	
	// Constructor 
	
	public Medicamento(String id, String nome, Float quantidade, String tarja) {
		super();
		this.id = id;
		this.nome = nome;
		this.quantidade = quantidade;
		this.tarja = tarja;
	}
	
	// Gettters and Setters 

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Float getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Float quantidade) {
		this.quantidade = quantidade;
	}

	public String getTarja() {
		return tarja;
	}

	public void setTarja(String tarja) {
		this.tarja = tarja;
	} 
	
	
	
}
