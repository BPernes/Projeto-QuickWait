package br.com.quickwait;

	// Classe respons�vel por persistir dados do Gps e tamb�m gerenciar opera��es referente ao Mapa do aplicativo 
public class Gps {
	
	private String latitude;
	private String longitude;
	
	
	// Constructor 
	public Gps(String latitude, String longitude) {
		super();
		this.latitude = latitude;
		this.longitude = longitude;
	}
	
	
	
	// All Methods
	
	// Localiza Hospitais no mapa
	public void localizarHospitais() {};
	
	// Busca melhores rotas at� os hospitais
	public void buscarRotas() {};
	
	// Situa o usu�rio no mapa
	public void localizarUsuario() {};
	
	// Localiza postos de saude
	public void localizarPostos() {};
	
	// Respons�vel pela barra de pesquisa por unidades 
	public void pesquisarPorUnidades() {}
	
	
	
	
	
	
	// Getters and Setters 
	public String getLatitude() {
		return latitude;
	}


	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}


	public String getLongitude() {
		return longitude;
	}


	public void setLongitude(String longitude) {
		this.longitude = longitude;
	};	
	
	
	
	

}
