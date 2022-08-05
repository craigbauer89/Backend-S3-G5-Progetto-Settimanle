package datamodels;

//import it.epicode.serialization.exceptions.ClassMismatchException;
//import it.epicode.serialization.exceptions.VersionMismatchException;

public class Libro extends CatologoItem {
	
	
	private String autore;
	private String genere;
	
	
	public Libro(String codiceISBN, String titolo, int annoPubblicato, int numeroPagine, String autore, String genere) {
		super(codiceISBN, titolo, annoPubblicato, numeroPagine);
		this.autore = autore;
		this.genere = genere;
	}
	
	public Libro() {
		super();
	}


	public String getAutore() {
		return autore;
	}


	public void setAutore(String autore) {
		this.autore = autore;
	}


	public String getGenere() {
		return genere;
	}


	public void setGenere(String genere) {
		this.genere = genere;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		return obj instanceof Libro; //&& this.hashCode() == obj.hashCode();
	}


	@Override
	public String toString() {
		return 
		String.format("Items{codiceISBN: %s, titolo: %s, annoPubblicato: %s, numeroPagine: %s, autore: %s, genere: %s", getCodiceISBN(), getTitolo(), getAnnoPubblicato(), getNumeroPagine(), autore, genere);
		
			
		}
	
	
//	@Override
//	public String toCsv() {
//		// determina la stringa di rappresentazione in csv, nel formato:
//		// identificativo di classe;versione;elementi della superclasse;autore;genere
//		return String.format("%s;%s;%s;%s;%s", BOOK_STORE_ID, BOOK_STORE_VERSION, super.toCsv(), author, genre);
//	}
//
//	@Override
//	protected int fromCsv(String csv, int startAt) {
//		String[] parts = csv.split(";");
//		// controlla che si tratti di un libro
//		if (!parts[0].equals(BOOK_STORE_ID))
//			throw new ClassMismatchException();
//		// controlla la corrispondenza della versione
//		if (!parts[1].equals(BOOK_STORE_VERSION))
//			throw new VersionMismatchException();
//		// recupera i campi della superclasse
//		int start = super.fromCsv(csv, 2);
//		// imposta i campi propri
//		author = parts[start];
//		genre = parts[start + 1];
//		return start + 2;
//	}
//
//
//
//	
//	
//	
	


}

