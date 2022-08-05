package datamodels;

//import java.util.Objects;


	public class CatologoItem { //implements  {
		
		
		private String codiceISBN;
		private String titolo;
		private int annoPubblicato;
		private int numeroPagine;
		
		public CatologoItem(String codiceISBN, String titolo, int annoPubblicato, int numeroPagine) {
			this.codiceISBN = codiceISBN;
			this.titolo = titolo;
			this.annoPubblicato = annoPubblicato;
			this.numeroPagine = numeroPagine;
		}
		
		public CatologoItem() {

		}

		public String getCodiceISBN() {
			return codiceISBN;
		}

		public void setCodiceISBN(String codiceISBN) {
			this.codiceISBN = codiceISBN;
		}

		public String getTitolo() {
			return titolo;
		}

		public void setTitolo(String titolo) {
			this.titolo = titolo;
		}

		public int getAnnoPubblicato() {
			return annoPubblicato;
		}

		public void setAnnoPubblicato(int annoPubblicato) {
			this.annoPubblicato = annoPubblicato;
		}

		public int getNumeroPagine() {
			return numeroPagine;
		}

		public void setNumeroPagine(int numeroPagine) {
			this.numeroPagine = numeroPagine;
		}

		
		public String toString() {
			return 
			String.format("Items{codiceISBN: %s, titolo: %s, annoPubblicato: %s, numeroPagine: %s", codiceISBN, titolo, annoPubblicato, numeroPagine);
			
				
			}
	
//
//		 @Override
//		public String toCsv() {
//			// csv comune a tutti gli elementi:
//			// isbn;titolo;anno di pubblicazione;pagine
//			return String.format("%s;%s;%d;%d", isbn, title, publishedYear, pages);
//		}

//		/**
//		 * Recupera la parte di propria competenza dal csv.
//		 * 
//		 * @param csv     il csv da leggere.
//		 * @param startAt il campo da cui partire nella lettura.
//		 * @return il campo a cui è arrivata la lettura.
//		 */
//		protected int fromCsv(String csv, int startAt) {
//			String[] parts = csv.split(";");
//			isbn = parts[startAt];
//			title = parts[startAt + 1];
//			publishedYear = Integer.parseInt(parts[startAt + 2]);
//			pages = Integer.parseInt(parts[startAt + 3]);
//			return 4 + startAt;
//		}
//
//		@Override
//		public int fromCsv(String csv) {
//			return fromCsv(csv, 0);
//		}
//
//		/**
//		 * Uguaglianza tra oggetti della stessa classe e con medesimo
//		 * {@code hashCode()}.
//		 */
//		@Override
//		public boolean equals(Object obj) {
//			return obj != null && obj.getClass().equals(getClass()) && obj.hashCode() == hashCode();
//		}
//
//		/**
//		 * Hash code basato sul campo {@code isbn}.
//		 */
//		@Override
//		public int hashCode() {
//			return Objects.hash(isbn);
//		}
//
//		/**
//		 * Ordinamento di default basato su codice ISBN.
//		 * 
//		 * @param other oggetto da confrontare.
//		 * @return <strong>{@code -1}</strong> se {@code this} è minore di
//		 *         {@code other}, <strong>{@code 0}</strong> se sono uguali,
//		 *         <strong>{@code 1}</strong> se {@code other} è maggiore di
//		 *         {@code this}.
//		 */
//		@Override
//		public int compareTo(LibraryItem other) {
//			return isbn.compareTo(other.isbn);
//		}
	}

