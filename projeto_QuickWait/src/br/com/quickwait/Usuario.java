package br.com.quickwait;

	// Classe respons�vel por persistir os dados de usu�rio no sistema
public class Usuario {
	
	private int id;
	private String nome;
	private String email;
	private String senha;
	private String cpf;
	
	// Constructors 
	
	public Usuario(int id, String nome, String email, String senha, String cpf) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.cpf = cpf;
	}	
	
	// Getters - Setters 
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
