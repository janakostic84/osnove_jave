package d05_09_2022;

import java.util.ArrayList;

public abstract class Radnik {

//	Kreirati klasu Sektor koja ima:
//	 naziv sektora
//	 platu koja je za taj sektor
//
//	Kreirati abstraktnu klasu Radnik koja ima:
//	 ime i prezime
//	 niz sektora u kojima radi
//	 abstraktnu metodu koja vraca platu radnika
//	 metodu zaposli u sektor, kojoj se prosledjuje sektor u kom radnik pocinje sa radom
//
//	Kreirati klasu Menadzer koja nasledjuje klasu Radnik koja ima:
//	 override uje metodu za platu. Plata se racuna kao suma svih plata po sektorima.
//
//	Kreirati klasu Magacioner koja nasledjuje klasu Radnik koja:
//	 ima privatnu metodu koja racuna prosecnu platu za sektore u kojima radi radnik kao:
//	 suma plata svih sektor / broj sektora * 0.5
//	 override uje metodu za platu, tako da se plata racuna po formuli:
//	(prosecna plata za sve sektore u kojima radi) * (broj sektora).
//
//	U glavnom programu kreirati jednog magacionera i jednog menadzera, postaviti sektore u
//	kojima rade i ispisati platu za svakog

	
	protected String imeIPrezime;
	protected ArrayList<Sektor> sektori = new ArrayList<Sektor>();
	
	public Radnik() {
		super();
	}
	
	public Radnik(String imeIPrezime) {
		super();
		this.imeIPrezime = imeIPrezime;
	}
	
	public String getImeIPrezime() {
		return imeIPrezime;
	}

	public void setImeIPrezime(String imeIPrezime) {
		this.imeIPrezime = imeIPrezime;
	}

	public ArrayList<Sektor> getSektori() {
		return sektori;
	}
	
	public abstract double plataRadnika();
	
	public void zaposliUSektor(Sektor sektor) {
		this.sektori.add(sektor);
	}

	
	
	
}
