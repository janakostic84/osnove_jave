package d06_09_2022;

public class StaklenaAmbalaza extends Ambalaza {

//	Kreirati abstraktnu klasu Ambalaza koja ima:
//	barkod (primer: 328232-2823)
//	naziv artikla
//	neto tezinu
//	bruto tezinu
//	konstuktore (default-ni i sa parametrima)
//	gettere i settere
//	metodu koja racuna tezinu pakovanja kao razliku bruto i neto tezine.
//	abstraktnu metodu koja vraca cenu artikla
//	abstraktnu metodu stampaj
//
//	Kreirati klasu Tetrapak koja nasledjuje klasu Ambalaza koja ima:
//	atribut koji kaze da li se moze reciklirati
//	osnovna cena
//	gettere i setter za atribute
//	konstuktori koji su vam potrebni
//	racuna cenu tako da ispunjava uslova:
//	ako je od recikliranog materijala, ( tezina pakovanja ) * 1.5 + (osnovna cena);
//	ako nije u cenu ulazi samo osnovna cena
//	metoda stampaj stampa sve podatke iz klase tetrapak.
//
//	Kreirati klasu StaklenaAmbalaza koja nasledjuje klasu Ambalaza koja ima:
//	kaucija za flasu
//	atribut koji kaze da li se za flasu placa kaucija
//	osnovna cena
//	gettere i setter za atribute
//	konstuktori koji su vam potrebni
//	racuna cenu
//	ako se kaucija placa, (osnovna cena) * 1.2 + (kaucija);
//	ako se ne placa, (osnovna cena) * 1.2
//	metoda stampaj stampa sve podatke iz klase staklena flasa.
//
//	Kreirati klasu SuperKartica koja ima:
//	broj kartice
//	ime i prezime vlasnika
//	popust (200, 500, … )
//	konstuktore (default-ni i sa parametrima)
//	gettere i settere 
//	metodu stampaj koja stampa karticu u formatu:
//	(broj kartice), (ime i prezime)
//
//    Kreirati klasu Korpa koja ima:
//	niz ambalaza
//	metodu dodaj ambalazu
//	metodu izbaci ambalazu, u funkciju se prosledjuje barkod flase (String) koju treba izbaciti
//	privatnu metodu koja vraca cenu svih ambalaza sa popustom, metoda kao parametar prima popust. 
//	metodu koja racuna i vraca ukupncu cenu korpe (sabira sve cene ambalze), kao parametar funkcije
//	se prima Super karticu iz koje se cita popust.
//
//	U glavnom programu kreirati jednu Korpu i u nju dodati nekoliko Ambalaza razlicitih tipova i
//	istestirati sve metode i ispisati ukupnu cenu sa popustom.

	private double kaucijaZaFlasu;
	private boolean daLiSePlacaKaucija;
	private double osnovnaCena;

	public StaklenaAmbalaza() {
		super();
	}

	public StaklenaAmbalaza(String barkod, String nazivArtikla, double netoTezina, double brutoTezina, 
			double kaucijaZaFlasu, boolean daLiSePlacaKaucija, double osnovnaCena) {
		super(barkod, nazivArtikla, netoTezina, brutoTezina);
		this.kaucijaZaFlasu = kaucijaZaFlasu;
		this.daLiSePlacaKaucija = daLiSePlacaKaucija;
		this.osnovnaCena = osnovnaCena;
	}

	public double getKaucijaZaFlasu() {
		return kaucijaZaFlasu;
	}

	public void setKaucijaZaFlasu(double kaucijaZaFlasu) {
		this.kaucijaZaFlasu = kaucijaZaFlasu;
	}

	public boolean isDaLiSePlacaKaucija() {
		return daLiSePlacaKaucija;
	}

	public void setDaLiSePlacaKaucija(boolean daLiSePlacaKaucija) {
		this.daLiSePlacaKaucija = daLiSePlacaKaucija;
	}

	public double getOsnovnaCena() {
		return osnovnaCena;
	}

	public void setOsnovnaCena(double osnovnaCena) {
		this.osnovnaCena = osnovnaCena;
	}

	@Override
	public double cena() {
		if (this.daLiSePlacaKaucija == true) {
			return this.osnovnaCena * 1.2 + this.kaucijaZaFlasu;
		} else
			return this.osnovnaCena * 1.2;
	}

	@Override
	public void stampaj() {
		System.out.println("Barkod: " + this.barkod);
		System.out.println("Naziv artikla: " + this.nazivArtikla);
		System.out.println("Neto tezina: " + this.netoTezina);
		System.out.println("Bruto tezina: " + this.brutoTezina);
		System.out.println("Kaucija za flasu: " + this.kaucijaZaFlasu);
		System.out.println("Da li se placa kaucija: " + this.daLiSePlacaKaucija);
		System.out.println("Osnovna cena: " + this.osnovnaCena);

	}

}
