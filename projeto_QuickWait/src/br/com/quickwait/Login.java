package br.com.quickwait;

import java.time.LocalDateTime;

		// Classe responsável por capturar login do usuario
public class Login {
	
	private int id;
	private LocalDateTime dataHoraLogin;
	
	
	// Constructor 
	
	public Login(int id, LocalDateTime dataHoraLogin) {
		super();
		this.id = id;
		this.dataHoraLogin = dataHoraLogin;
	}
	
	// -- Métodos --

	// Responsável por criar e validar usuário 
	public boolean cadastrarUsuario() {return false;};
	
	// Responsável por validar o login do usuário
	public boolean efetuarLogin(Usuario email, Usuario senha) {return false;};
	
	// Responsável por enviar código de recuperação da senha
	public void recuperarSenha() {}
	
	
	// -- Getters and Setters --
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDateTime getDataHoraLogin() {
		return dataHoraLogin;
	}

	public void setDataHoraLogin(LocalDateTime dataHoraLogin) {
		this.dataHoraLogin = dataHoraLogin;
	};
	
	
}
