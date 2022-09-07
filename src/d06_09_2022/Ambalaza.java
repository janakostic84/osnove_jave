package d06_09_2022;

public abstract class Ambalaza {

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

	protected String barkod;
	protected String nazivArtikla;
	protected double netoTezina;
	protected double brutoTezina;

	public Ambalaza() {
		super();
	}

	public Ambalaza(String barkod, String nazivArtikla, double netoTezina, double brutoTezina) {
		super();
		this.barkod = barkod;
		this.nazivArtikla = nazivArtikla;
		this.netoTezina = netoTezina;
		this.brutoTezina = brutoTezina;
	}

	public String getBarkod() {
		return barkod;
	}

	public void setBarkod(String barkod) {
		this.barkod = barkod;
	}

	public String getNazivArtikla() {
		return nazivArtikla;
	}

	public void setNazivArtikla(String nazivArtikla) {
		this.nazivArtikla = nazivArtikla;
	}

	public double getNetoTezina() {
		return netoTezina;
	}

	public void setNetoTezina(double netoTezina) {
		this.netoTezina = netoTezina;
	}

	public double getBrutoTezina() {
		return brutoTezina;
	}

	public void setBrutoTezina(double brutoTezina) {
		this.brutoTezina = brutoTezina;
	}

	public double tezinaPakovanja() {
		return this.brutoTezina - this.netoTezina;
	}

	public abstract double cena();

	public abstract void stampaj();

}
