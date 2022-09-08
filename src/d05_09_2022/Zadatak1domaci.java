package d05_09_2022;

public class Zadatak1domaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Kreirati klasu Sektor koja ima:
//			 naziv sektora
//			 platu koja je za taj sektor
//
//			Kreirati abstraktnu klasu Radnik koja ima:
//			 ime i prezime
//			 niz sektora u kojima radi
//			 abstraktnu metodu koja vraca platu radnika
//			 metodu zaposli u sektor, kojoj se prosledjuje sektor u kom radnik pocinje sa radom
//
//			Kreirati klasu Menadzer koja nasledjuje klasu Radnik koja ima:
//			 override uje metodu za platu. Plata se racuna kao suma svih plata po sektorima.
//
//			Kreirati klasu Magacioner koja nasledjuje klasu Radnik koja:
//			 ima privatnu metodu koja racuna prosecnu platu za sektore u kojima radi radnik kao:
//			 suma plata svih sektor / broj sektora * 0.5
//			 override uje metodu za platu, tako da se plata racuna po formuli:
//			(prosecna plata za sve sektore u kojima radi) * (broj sektora).
//
//			U glavnom programu kreirati jednog magacionera i jednog menadzera, postaviti sektore u
//			kojima rade i ispisati platu za svakog

		   Magacioner magacioner = new Magacioner("Pera Peric");
		   Menadzer menadzer = new Menadzer("Nikola Ilic");
		
		   Sektor sektorA = new Sektor("proizvodnja", 56000.00);
		   Sektor sektorB = new Sektor("racunovodstvo", 90000.00);
		   Sektor sektorC = new Sektor("marketing", 80000.00);
		   
		   magacioner.zaposliUSektor(sektorA);
		   menadzer.zaposliUSektor(sektorB);
		   menadzer.zaposliUSektor(sektorC);
		   
		   System.out.println("Plata magacionera: " + magacioner.plataRadnika());
		   System.out.println("Plata menadzera: " + menadzer.plataRadnika());
		
	}

}
