package datamodels;

public class Utente {
	
	private String nome;
	private String  cognome;
	private int dataNascita;
	private String numeroTessera;
	
	
	public Utente(String nome, String cognome, int dataNascita, String numeroTessera) {

		this.nome = nome;
		this.cognome = cognome;
		this.dataNascita = dataNascita;
		this.numeroTessera = numeroTessera;
	}
	
	
	public Utente() {

		
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCognome() {
		return cognome;
	}


	public void setCognome(String cognome) {
		this.cognome = cognome;
	}


	public int getDataNascita() {
		return dataNascita;
	}


	public void setDataNascita(int dataNascita) {
		this.dataNascita = dataNascita;
	}


	public String getNumeroTessera() {
		return numeroTessera;
	}


	public void setNumeroTessera(String numeroTessera) {
		this.numeroTessera = numeroTessera;
	}


	@Override
	public String toString() {
		return String.format("Utente [nome=%s, cognome=%s, dataNascita=%s, numeroTessera=%s]", nome, cognome,
				dataNascita, numeroTessera);
	}
	
	
	
	

}
