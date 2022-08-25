package d22_08_2022;

public class Knjiga {

	// TODO Auto-generated constructor stub
//	Kreirati klasu Autor koja ima
//	-ime i prezime
//	-konstuktore koje mislite da su vam potrebni
//	-gettere i settere za atribute
//	-metodu print koja stampa u formatu:
//	(ime autora) (prezime autora)
//
//	Kreirati klasu Knjiga koji ima:
//	-ISBN
//	-naziv
//	-godina izdanja
//	-autor
//	-konstuktore koje mislite da su vam potrebni
//	-gettere i settere za atribute
//	-metodu print koja stampa u formatu (izbegavati dupliranje koda):
//	(ISBN)
//	(naziv) - (godina izdanja)
//	autor: (ime autora) (prezime autora) 
//
//		U glavnom programu napraviti vise autora sa vise knjiga.

	// TODO Auto-generated constructor stub

	private String isbn;
	private String naziv;
	private int godinaIzdanja;
	private Autor autor;

	public Knjiga(String isbn, String naziv, int godinaIzdanja) {
		this.isbn = isbn;
		this.naziv = naziv;
		this.godinaIzdanja = godinaIzdanja;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public int getGodinaIzdanja() {
		return godinaIzdanja;
	}

	public void setGodinaIzdanja(int godinaIzdanja) {
		this.godinaIzdanja = godinaIzdanja;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public void print() {
		System.out.println(this.isbn);
		System.out.println(this.naziv + " - " + this.godinaIzdanja);
		System.out.println("autor: " + this.autor.getimeIPrezime());

	}

}
