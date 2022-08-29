package d25_08_2022;

public class Zadatak1domaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Napisati klasu Student koja ima
//		broj indeksa
//		ime i prezime
//		tip studija (osnovne, master, doktorske)
//		niz ispita
//		konstuktore koje mislite da ce vam trebati
//		gettere i settere za indeks, ime i prezime, tip studija
//		getter za niz predmeta
//		metodu dodaj ispit u niz ispita
//		metodu koja racuna prosek na studijama (u prosek se ubrajaju samo polozeni ispiti)
//		metodu stampaj koja stampa u formatu:
//		(broj indeksa) - (ime i prezime) - (tip studija)
//		Predmeti:
//		(naziv predmeta) - (profesor) - (ocena)
//		(naziv predmeta) - (profesor) - (ocena)
//		(naziv predmeta) - (profesor) - (ocena)
//		Prosecna ocena: (prosecna ocena)
	//
	//
//		Napisati klasu Ispit koja ima
//		naziv predmeta
//		ocenu (u rasponu od 5 do 10)
//		Ime i prezime profesora koji predaje predmet
//		konstuktore koje mislite da ce vam trebati
//		gettere i settere za sve atribute
//		metodu koja kaze da li je ispit polozen (polozen je ako je ocena od 6 do 10)
//		metodu koja stampa ispit u formatu:
//		(naziv predmeta) - (profesor) - (ocena)

		Ispit ispit = new Ispit("Istorija muzike", 9, "Nebojsa Todorovic");
		Ispit ispit2 = new Ispit("Istorija pijanizma", 8, "Nebojsa Todorovic");
		Ispit ispit3 = new Ispit("Solfedjo", 7, "Nikola Nikolic");
		Ispit ispit4 = new Ispit("Harmonija", 5, "Sara Saric");
		
		Student student = new Student();
		student.setImePrezime("Pera Peric");
		student.setBrojIndexa("1657/2015");
		student.setTipStudija("osnovne");
		student.dodajPredmet(ispit);
		student.dodajPredmet(ispit2);
		student.dodajPredmet(ispit3);
		student.dodajPredmet(ispit4);
		
		student.print();
		
		
	}

}
