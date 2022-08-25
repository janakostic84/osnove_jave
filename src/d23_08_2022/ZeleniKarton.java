package d23_08_2022;

public class ZeleniKarton {

	// TODO Auto-generated method stub

//	Zadatak
//	Kreirati klasu ZeleniKarton koja ima:
//	ime i prezime studenta 
//	broj indeksa 
//	naziv predmeta
//	ime i prezime profesora
//	ocenu - od 5 do 10
//	gettere i settere
//	konstruktore
//	metodu koja vraca da li je ispit polozen ili ne (ispit je polozen ako je ocena veca od 5)
//	metodu stampaj koja stampa podatke u formatu:
//			(naziv predmeta) - (ocena)
//			Student: ime i prezime, broj indeksa
//			Profesor: ime i prezime
//
//		U glavnoj klasi:
//	kreirati niz od 10tak zelenih kartona za ispite i odstampati podatke za sve ispite

	private String imeIPrezimeStudenta;
	private String brojIndeksa;
	private String nazivPredmeta;
	private String imeIPrezimeProfesora;
	private int ocena;

	public ZeleniKarton(String imeIPrezimeStudenta, String brojIndeksa, String nazivPredmeta,
			String imeIPrezimeProfesora, int ocena) {

		this.imeIPrezimeStudenta = imeIPrezimeStudenta;
		this.brojIndeksa = brojIndeksa;
		this.nazivPredmeta = nazivPredmeta;
		this.imeIPrezimeProfesora = imeIPrezimeProfesora;
		this.ocena = ocena;

	}

	public String getImeIPrezimeStudenta() {
		return imeIPrezimeStudenta;
	}

	public void setImeIPrezimeStudenta(String imeIPrezimeStudenta) {
		this.imeIPrezimeStudenta = imeIPrezimeStudenta;
	}

	public String getBrojIndeksa() {
		return brojIndeksa;
	}

	public void setBrojIndeksa(String brojIndeksa) {
		this.brojIndeksa = brojIndeksa;
	}

	public String getNazivPredmeta() {
		return nazivPredmeta;
	}

	public void setNazivPredmeta(String nazivPredmeta) {
		this.nazivPredmeta = nazivPredmeta;
	}

	public String getImeIPrezimeProfesora() {
		return imeIPrezimeProfesora;
	}

	public void setImeIPrezimeProfesora(String imeIPrezimeProfesora) {
		this.imeIPrezimeProfesora = imeIPrezimeProfesora;
	}

	public int getOcena() {
		return ocena;
	}

	public void setOcena(int ocena) {
		this.ocena = ocena;
	}

	public boolean polozioIspit() {
		if(ocena > 5) {
		
		return true;}
		else {
		return false;}
		
		
		public void print() {
			System.out.println(this.nazivPredmeta + " - " + this.ocena);
			System.out.println("Student: " + this.imeIPrezimeStudenta + ", " + this.brojIndeksa);
			System.out.println("Profesor: " + this.imeIPrezimeProfesora);
		
	}
	
	}

};
