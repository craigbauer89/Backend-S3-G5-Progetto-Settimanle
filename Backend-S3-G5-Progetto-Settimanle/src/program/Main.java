package program;

import datamodels.Libro;
import services.CatologoItemDAO;

public class Main {

	public static void main(String[] args) {
		
		
		
		
		Libro item1 = new Libro("122", "Amazing Places", 1996, 430, "Tim Lovejoy", "Action");
//		elementi.add(new Libro(123, "Arturo La Grande", 2005, 859, "Marco Mauri", "Drama"));
//		elementi.add(new Libro(123, "La Grande Bellezza", 2022, 789, "Marco Rossi", "Crimi"));
//		elementi.add(new Libro(124, "Dancing in the Sun", 2022, 510, "Marco Bruno", "Love"));
//		elementi.add(new Libro(124, "A Wonderful life", 2007, 560, "Marco Bruno", "Love"));
//		elementi.add(new Libro(124, "Chi sapremmo", 2022, 560, "Marco Bruno", "Crimi"));
//		elementi.add(new Libro(125, "La Bella Vita", 2008, 200, "Jane Verdi", "Drama"));
//		elementi.add(new Rivista(546, "Mens Health",  2022, 15, Period.MENSILE));
//		elementi.add(new Rivista(547, "Hello",  2022, 22, Period.MENSILE));
//		elementi.add(new Rivista(548, "Vogue",  2021, 29, Period.MENSILE));
//		elementi.add(new Rivista(549, "A Magazine",  2021, 29, Period.MENSILE));
		
		 CatologoItemDAO.inserisciLibro(item1);
		
		
		
//		aggiunte()
//		rimuovere(String ISBN)
//		ricercaperISBN(String ISBN)
//		ricercaperanno(int anno)
//		ricercaperautore(String autore)
//		ricercapertitolo(String titolo) // o parte di esso
//		ricercaperinprestito(String numerotessera)
//		ricercaprestitiscaduti(String ISBN.scaduti)

	}

}
