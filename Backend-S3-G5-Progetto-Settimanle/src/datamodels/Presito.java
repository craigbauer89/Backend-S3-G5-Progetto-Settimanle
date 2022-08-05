package datamodels;

import java.util.Date;

public class Presito {
	
	
	private Utente utente;
	private CatologoItem catologoItem;
	private Date inizioPrestito;
	private Date restituzionePrestito; // (calcolata automaticamente a 30 gg dalla data inizio prestito)
	private Date restituzioneEffettiva;
	
	
	public Presito(Utente utente, CatologoItem catologoItem, Date inizioPrestito, Date restituzionePrestito,
			Date restituzioneEffettiva) {
		this.utente = utente;
		this.catologoItem = catologoItem;
		this.inizioPrestito = inizioPrestito;
		this.restituzionePrestito = restituzionePrestito;
		this.restituzioneEffettiva = restituzioneEffettiva;
	}

	public Presito() {
		
	}

	public Utente getUtente() {
		return utente;
	}

	public void setUtente(Utente utente) {
		this.utente = utente;
	}

	public CatologoItem getCatologoItem() {
		return catologoItem;
	}

	public void setCatologoItem(CatologoItem catologoItem) {
		this.catologoItem = catologoItem;
	}

	public Date getInizioPrestito() {
		return inizioPrestito;
	}

	public void setInizioPrestito(Date inizioPrestito) {
		this.inizioPrestito = inizioPrestito;
	}

	public Date getRestituzionePrestito() {
		return restituzionePrestito;
	}

	public void setRestituzionePrestito(Date restituzionePrestito) {
		this.restituzionePrestito = restituzionePrestito;
	}

	public Date getRestituzioneEffettiva() {
		return restituzioneEffettiva;
	}

	public void setRestituzioneEffettiva(Date restituzioneEffettiva) {
		this.restituzioneEffettiva = restituzioneEffettiva;
	}

	

}
