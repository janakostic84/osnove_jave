package d25_08_2022;

import java.util.ArrayList;

public class Student {

//	Napisati klasu Student koja ima
//	broj indeksa
//	ime i prezime
//	tip studija (osnovne, master, doktorske)
//	niz ispita
//	konstuktore koje mislite da ce vam trebati
//	gettere i settere za indeks, ime i prezime, tip studija
//	getter za niz predmeta
//	metodu dodaj ispit u niz ispita
//	metodu koja racuna prosek na studijama (u prosek se ubrajaju samo polozeni ispiti)
//	metodu stampaj koja stampa u formatu:
//	(broj indeksa) - (ime i prezime) - (tip studija)
//	Predmeti:
//	(naziv predmeta) - (profesor) - (ocena)
//	(naziv predmeta) - (profesor) - (ocena)
//	(naziv predmeta) - (profesor) - (ocena)
//	Prosecna ocena: (prosecna ocena)
//
//
//	Napisati klasu Ispit koja ima
//	naziv predmeta
//	ocenu (u rasponu od 5 do 10)
//	Ime i prezime profesora koji predaje predmet
//	konstuktore koje mislite da ce vam trebati
//	gettere i settere za sve atribute
//	metodu koja kaze da li je ispit polozen (polozen je ako je ocena od 6 do 10)
//	metodu koja stampa ispit u formatu:
//	(naziv predmeta) - (profesor) - (ocena)

	private String brojIndexa;
	private String imePrezime;
	private String tipStudija;
	private ArrayList<Ispit> ispiti = new ArrayList<Ispit>();
	
	public Student(String brojIndexa, String imePrezime, String tipStudija, ArrayList<Ispit> ispiti) {
		super();
		this.brojIndexa = brojIndexa;
		this.imePrezime = imePrezime;
		this.tipStudija = tipStudija;
		this.ispiti = ispiti;
	}
	
	public Student() {
		super();
	}

	public String getBrojIndexa() {
		return brojIndexa;
	}

	public void setBrojIndexa(String brojIndexa) {
		this.brojIndexa = brojIndexa;
	}

	public String getImePrezime() {
		return imePrezime;
	}

	public void setImePrezime(String imePrezime) {
		this.imePrezime = imePrezime;
	}

	public String getTipStudija() {
		return tipStudija;
	}

	public void setTipStudija(String tipStudija) {
		this.tipStudija = tipStudija;
	}

	public ArrayList<Ispit> getPredmeti() {
		return ispiti;
	}

	public void dodajPredmet(Ispit ispit) {
		ispiti.add(ispit);
	}
	public double prosecnaOcena() {
		int sumaOcenaPolozenihIspita = 0;
		int brojPolozenihIspita = 0;
		for(Ispit ispit : ispiti) {
			if(ispit.polozenIspit()) {
				sumaOcenaPolozenihIspita = sumaOcenaPolozenihIspita + ispit.getOcena();
				brojPolozenihIspita = brojPolozenihIspita + 1;
			}
		
		}
		double prosecnaOcena = sumaOcenaPolozenihIspita / brojPolozenihIspita;
		return prosecnaOcena;
	}
	public void print() {
		System.out.println(this.brojIndexa + " - " + this.imePrezime + " - " + this.tipStudija);
		System.out.println("Predmeti: ");
		
		for(int i = 0; i < ispiti.size(); i++) {
			Ispit ispit = ispiti.get(i);
			System.out.println(ispit.getNazivPredmeta() + " - " + ispit.getImeIPrezimeProfesora() 
			+ " - " + ispit.getOcena());
		}
		System.out.println("Prosecna ocena: " + prosecnaOcena());
	}
	
	
}
