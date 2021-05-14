package br.com.quickwait;

// Classe responsável por caracterizar o tipo da unidade de saúde no mapa
public class TipoUnidadeSaude {
	
	private int id;
	private String descricao;
	
	
	// Constructor 
	
	public TipoUnidadeSaude(int id, String descricao) {
		this.id = id;
		this.descricao = descricao;
	}
	
	
	
	// Getters and Setters 

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}
