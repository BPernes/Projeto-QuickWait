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
	
	
	// -- M�todos -- 
	
	public void atualizarNoticias(){} // M�todo que ir� atualizar noticias do aplicativo
	
	public void incrementarNoticia(){} // M�todo que ir� adicionar uma nova not�cia a lista

	public List<Noticia> getNoticias() {
		return noticias;
	}

	
	
	// Getter and Setter
	
	public void setNoticias(List<Noticia> noticias) {
		this.noticias = noticias;
	}
	
	
	
	
}
