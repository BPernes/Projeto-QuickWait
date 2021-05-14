package br.com.quickwait;

	// Classe responsável por persistir dados da notícia 
public class Noticia {
	
	private String titulo;
	private String autor;
	private String descricao;
	private String editora;
	
	// Constructor
	public Noticia(String titulo, String autor, String descricao, String editora) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.descricao = descricao;
		this.editora = editora;
	}

	// Getters and Setters 
	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public String getEditora() {
		return editora;
	}


	public void setEditora(String editora) {
		this.editora = editora;
	}
	
	
}

	// Está classe persiste os atributos
	// que serão mostrados na classe "DisplayNoticias"
