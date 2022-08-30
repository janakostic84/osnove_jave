package d26_08_2022;

public class Igrac extends Osoba {

//	Kreirati klasu Osoba koja ima:
//	ime i prezime
//	jmbg
//	godinu rodjenja
//	default-ni konstuktor
//	konstuktor sa parametrima
//	gettere i settere 
//	metodu stampaj koja stampa u formatu:
//	(ime i prezime), (jmbg), (godina rodjenja)
//
//	Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima:
//	broj (broj koji igrac nosi)
//	poziciju koju igra (odbrambeni, napadac, … )
//	kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
//	default-ni konstuktor
//	konstuktor sa parametrima
//	gettere i settere za broj, kapiten i poziciju
//	metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu
//
//	Kreirati klasu Trener koja nasledjuje klasu Osoba i koja ima:
//	godine iskustva
//	tip trenera (kondicioni, za igru, pomocni, personalni)
//	metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o treneru.
//
//	U glavnom programu kreirati 2 igraca i 2 trenera, i istestirati metode.

	private int broj;
	private String pozicijaIgraca;
	private boolean kapiten;

	public Igrac() {
		super();
	}

	public Igrac(int broj, String pozicijaIgraca, boolean kapiten) {
		super();
		this.broj = broj;
		this.pozicijaIgraca = pozicijaIgraca;
		this.kapiten = kapiten;
	}

	public int getBroj() {
		return broj;
	}

	public void setBroj(int broj) {
		this.broj = broj;
	}

	public String getPozicijaIgraca() {
		return pozicijaIgraca;
	}

	public void setPozicijaIgraca(String pozicijaIgraca) {
		this.pozicijaIgraca = pozicijaIgraca;
	}

	public boolean isKapiten() {
		return kapiten;
	}

	public void setKapiten(boolean kapiten) {
		this.kapiten = kapiten;
	}

	@Override
	public void print() {
		super.print();
		System.out.println(this.imeIPrezime + ", " + this.jmbg + ", " + this.godinaRodjenja);
		System.out.println("Broj: " + this.broj);
		System.out.println("Pozicija:" + this.pozicijaIgraca);
		System.out.println("Kapiten: " + this.kapiten);
	}

}
