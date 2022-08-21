package d19_08_2022;

public class ZadatakDomaci {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		
//		1.Kreirati klasu FacebookPost koja ima:
//		   Od atributa:
//		ime i prezime korisnika koji je objavio post
//		ime i prezime korisnika na kom je profilu objavljen post (posto na fejsbuku mozete da
//				postavite objavu na tudjem profilu)
//		tekst objave
//		broj lajkova
//		broj deljenja
//		 Konstruktore:
//		difoltni konstuktor
//		konstuktor koji postavlja ime i prezime korisnika ko je objavio, korisnika na kom je
//		profilu objavnljen i tekst objave
//		  Od metoda:
//		like(), koja povecava broj lajkova za 1.
//		dislike(), koja smanjuje broj lajkova za 1 (broj lajkova ne moze da bude manji od nule)
//		share(), koja povecava broj deljenja za 1
//		print(), koja stampa objavu u formatu:
//		(ime i prezime osobe koja je objavila) >>> (ime i prezime na cijem profilu)
//		(tekst objave)
//		Likes (broj lajkova) | Shares (broj deljenja)
//
//		U glavnoj klasi napraviti minimum dva FacebookPost-a i nad svakim pozvati svaku funkciju.
//
//
//		Primer stampanja:
//		Milan Jovanovic >>> Pera Peric
//		Ovo je tekst objave
//		Likes 3 | Shares 1

		
		FacebookPost f = new FacebookPost;
		
		//f.getImeIPrezimeKorisnika1();
		//f.getImeiPrezimeKorisnika2();
		//f.getTekstObjave();
		
		
		
		
		
	}

	public static void like(int brojLajkova) {
		for(int i = 0; i > brojLajkova; i++) {
			//brojLajkova + 1;
		}
		
		
	public static void dislike(int brojDislajkova) {
		for(int i = brojLajkova; i >= 0; i--) {
			brojLajkova - brojDislajkova;
		}
	}
		
	public static void share(int brojDeljenja) {
			for(int i = brojDeljenja; i > 0; i++);
		}
	
	public static void print() {
		System.out.println("Milan Jovanovic " + ">>> " + "Pera Peric ");
		System.out.println("Ovo je tekst objave");
		System.out.println("Likes 3 | Shares 1");
	}
	
	
	
	}
	
	
	
	
	
	
}
