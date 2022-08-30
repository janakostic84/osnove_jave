package d26_08_2022;

public class Zadatak1domaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Kreirati klasu Osoba koja ima:
//			ime i prezime
//			jmbg
//			godinu rodjenja
//			default-ni konstuktor
//			konstuktor sa parametrima
//			gettere i settere 
//			metodu stampaj koja stampa u formatu:
//			(ime i prezime), (jmbg), (godina rodjenja)
//
//			Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima:
//			broj (broj koji igrac nosi)
//			poziciju koju igra (odbrambeni, napadac, … )
//			kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
//			default-ni konstuktor
//			konstuktor sa parametrima
//			gettere i settere za broj, kapiten i poziciju
//			metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu
//
//			Kreirati klasu Trener koja nasledjuje klasu Osoba i koja ima:
//			godine iskustva
//			tip trenera (kondicioni, za igru, pomocni, personalni)
//			metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o treneru.
//
//			U glavnom programu kreirati 2 igraca i 2 trenera, i istestirati metode.

		Osoba o = new Osoba("Pera Peric", "211009834", 1990);
		Osoba p = new Osoba("Nikola Nikolic", "45987829587", 1987);
		o.print();
		p.print();

		
		Trener t = new Trener(15, "personalni");
		Trener v = new Trener(5, "kondicioni");
		t.print();
		v.print();
		
		Igrac i = new Igrac(5, "napadac", true);
		Igrac j = new Igrac(8, "odbrambeni", false);
		i.print();
		j.print();

	}

}
