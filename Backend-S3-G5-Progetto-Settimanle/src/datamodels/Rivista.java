package datamodels;

import javax.persistence.Entity;
import javax.persistence.Table;

//import it.epicode.datamodels.Frequency;
//import it.epicode.serialization.exceptions.ClassMismatchException;
//import it.epicode.serialization.exceptions.VersionMismatchException;

@Entity
@Table(name = "riviste")
public class Rivista extends CatologoItem {

	private Period period;
	
	public Rivista(String codiceISBN, String titolo, int annoPubblicato, int numeroPagine, 
			Period period) {
		super(codiceISBN, titolo, annoPubblicato, numeroPagine);
		this.period = period;
	}
	
	public Rivista(int id, String codiceISBN, String titolo, int annoPubblicato, int numeroPagine, 
			Period period) {
		super(id, codiceISBN, titolo, annoPubblicato, numeroPagine);
		this.period = period;
	}

	public Rivista() {
		super();
	}

	public Period getPeriod() {
		return period;
	}

	public void setPeriod(Period period) {
		this.period = period;
	}


	@Override
	public String toString() {
		return String.format("Rivista [period=%s]",super.toString(), period);
	}

	

//	@Override
//	public String toCsv() {
//		// formato csv:
//		// identificativo di classe;versione;csv della superclasse;frequenza (in formato
//		// numerico)
//		return String.format("%s;%s;%s;%d", MAGAZINE_STORE_ID, MAGAZINE_STORE_VERSION, super.toCsv(),
//				frequency.ordinal());
//	}
//
//	@Override
//	protected int fromCsv(String csv, int startAt) {
//		String[] parts = csv.split(";");
//		// verifica la classe
//		if (!parts[0].equals(MAGAZINE_STORE_ID))
//			throw new ClassMismatchException();
//		// verifica la versione
//		if (!parts[1].equals(MAGAZINE_STORE_VERSION))
//			throw new VersionMismatchException();
//		// legge i campi della superclasse
//		int start = super.fromCsv(csv, startAt + 2);
//		// legge la periodicit√†
//		int idx = Integer.parseInt(parts[start]); // legge la frequenza come numero
//		frequency = Frequency // questa √® la enum
//				.values()[idx]; // dall'array dei valori prende quello letto
//		return start + 1;
//	}

}
