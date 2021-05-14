package br.com.quickwait;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

// Classe que persiste dados de um lembrete e gerencia lembretes
public class LembreteRemedio {
	
	private List<String> listaLembretes = new ArrayList<>();
	
	private LocalDateTime horaLembrete;
	private LocalDateTime diaSemana;
	private String lembrete;
	private String recomendacao;
	
	// Constructor 
	public LembreteRemedio(LocalDateTime horaLembrete, LocalDateTime diaSemana,
			String lembrete, String recomendacao) {
		this.horaLembrete = horaLembrete;
		this.diaSemana = diaSemana;
		this.lembrete = lembrete;
		this.recomendacao = recomendacao;
	}
	
	//Métodos
	
	public void criarLembrete() {};
	
	public void alterarLembrete() {};
	
	public void definirHorario() {};
	
	//	Getters and Setters 

	public List<String> getListaLembretes() {
		return listaLembretes;
	}

	public void setListaLembretes(List<String> listaLembretes) {
		this.listaLembretes = listaLembretes;
	}

	public LocalDateTime getHoraLembrete() {
		return horaLembrete;
	}

	public void setHoraLembrete(LocalDateTime horaLembrete) {
		this.horaLembrete = horaLembrete;
	}

	public LocalDateTime getDiaSemana() {
		return diaSemana;
	}

	public void setDiaSemana(LocalDateTime diaSemana) {
		this.diaSemana = diaSemana;
	}

	public String getLembrete() {
		return lembrete;
	}

	public void setLembrete(String lembrete) {
		this.lembrete = lembrete;
	}

	public String getRecomendacao() {
		return recomendacao;
	}

	public void setRecomendacao(String recomendacao) {
		this.recomendacao = recomendacao;
	}
	
	
	
	
}
