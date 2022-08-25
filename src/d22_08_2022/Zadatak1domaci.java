package d22_08_2022;

public class Zadatak1domaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Kreirati klasu Autor koja ima
//		-ime i prezime
//		-konstuktore koje mislite da su vam potrebni
//		-gettere i settere za atribute
//		-metodu print koja stampa u formatu:
//		(ime autora) (prezime autora)
//
//		Kreirati klasu Knjiga koji ima:
//		-ISBN
//		-naziv
//		-godina izdanja
//		-autor
//		-konstuktore koje mislite da su vam potrebni
//		-gettere i settere za atribute
//		-metodu print koja stampa u formatu (izbegavati dupliranje koda):
//		(ISBN)
//		(naziv) - (godina izdanja)
//		autor: (ime autora) (prezime autora) 
//
//			U glavnom programu napraviti vise autora sa vise knjiga.

		Autor a = new Autor("Karlos Kastaneda");
		Autor b = new Autor("Irvin Jalom");
		Autor c = new Autor("Napoleon Hil");

		a.print();
		b.print();
		c.print();

		Knjiga k = new Knjiga("628347619", "Odvojena stvarnost", 1971);

		k.setAutor(a);
		k.print();

		Knjiga l = new Knjiga("6283578", "Lezanje na kaucu", 2015);

		l.setAutor(b);
		l.print();

		Knjiga m = new Knjiga("23576245", "Misli i obogati se", 1937);

		m.setAutor(c);
		m.print();

	}

}
