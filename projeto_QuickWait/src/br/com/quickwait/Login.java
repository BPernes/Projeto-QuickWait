package br.com.quickwait;

import java.time.LocalDateTime;

		// Classe respons�vel por capturar login do usuario
public class Login {
	
	private int id;
	private LocalDateTime dataHoraLogin;
	
	
	// Constructor 
	
	public Login(int id, LocalDateTime dataHoraLogin) {
		super();
		this.id = id;
		this.dataHoraLogin = dataHoraLogin;
	}
	
	// -- M�todos --

	// Respons�vel por criar e validar usu�rio 
	public boolean cadastrarUsuario() {return false;};
	
	// Respons�vel por validar o login do usu�rio
	public boolean efetuarLogin(Usuario email, Usuario senha) {return false;};
	
	// Respons�vel por enviar c�digo de recupera��o da senha
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
