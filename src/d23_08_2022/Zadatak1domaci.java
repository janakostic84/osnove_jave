package d23_08_2022;

import java.util.ArrayList;

public class Zadatak1domaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Zadatak
//		Kreirati klasu ZeleniKarton koja ima:
//		ime i prezime studenta 
//		broj indeksa 
//		naziv predmeta
//		ime i prezime profesora
//		ocenu - od 5 do 10
//		gettere i settere
//		konstruktore
//		metodu koja vraca da li je ispit polozen ili ne (ispit je polozen ako je ocena veca od 5)
//		metodu stampaj koja stampa podatke u formatu:
//				(naziv predmeta) - (ocena)
//				Student: ime i prezime, broj indeksa
//				Profesor: ime i prezime
//
//			U glavnoj klasi:
//		kreirati niz od 10tak zelenih kartona za ispite i odstampati podatke za sve ispite

		ArrayList<ZeleniKarton>lista = new ArrayList<ZeleniKarton>();
		
		
		
		
		
		ZeleniKarton a = new ZeleniKarton("Pera Peric", "1346", "Istorija muzike", "Sonja Cvetkovic", 6);
		ZeleniKarton b = new ZeleniKarton("Nikola Nikolic", "1347", "Istorija pijanizma", "Nebojsa todorovic", 8);
		ZeleniKarton c = new ZeleniKarton("Sara Saric", "1348", "Engleski jezik", "Snezana Matic", 10);
		ZeleniKarton d = new ZeleniKarton("Mara Maric", "1349", "Italijanski jezik", "Zoran Jancic", 6);
		ZeleniKarton e = new ZeleniKarton("Buba Bubic", "1332", "Klavir", "Dusan Jocic", 7);
		ZeleniKarton f = new ZeleniKarton("Bojana Bojanic", "1333", "Solfedjo", "Sonja Markovic", 9);
		ZeleniKarton g = new ZeleniKarton("Ana Petrovic", "1334", "Harmonija sa harmonskom analizom", "Milos Milosevic", 6);
		ZeleniKarton h = new ZeleniKarton("Milos Mitic", "1335", "Kamerna muzika", "Ana Mitrovic", 7);
		ZeleniKarton i = new ZeleniKarton("Mila Tasic", "1336", "Sociologija", "Ivan Stevic", 10);
		ZeleniKarton j = new ZeleniKarton("Milan Popovic", "1337", "Psihologija", "Dragoljub Petrovic", 7);
		
		
		lista.add(a);
		lista.add(b);
		lista.add(c);
		lista.add(d);
		lista.add(e);
		lista.add(f);
		lista.add(g);
		lista.add(h);
		lista.add(i);
		lista.add(j);
		
		
		for(int i = 0; i < lista.size(); i++) {
			lista.get(i).print();
			System.out.println();
		}
	}

}
