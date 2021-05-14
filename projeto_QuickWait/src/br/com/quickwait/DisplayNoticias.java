package br.com.quickwait;

import java.util.ArrayList;
import java.util.List;

public class DisplayNoticias {
	
	
	// Constructor 
	public DisplayNoticias(List<Noticia> noticias) {
		this.noticias = noticias;
	}

	// -- Lista para armazenar noticias --
	private List<Noticia> noticias = new ArrayList<>();
	
	
	// -- Métodos -- 
	
	public void atualizarNoticias(){} // Método que irá atualizar noticias do aplicativo
	
	public void incrementarNoticia(){} // Método que irá adicionar uma nova notícia a lista

	public List<Noticia> getNoticias() {
		return noticias;
	}

	
	
	// Getter and Setter
	
	public void setNoticias(List<Noticia> noticias) {
		this.noticias = noticias;
	}
	
	
	
	
}
