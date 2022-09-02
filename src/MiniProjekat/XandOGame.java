package MiniProjekat;

import java.util.ArrayList;

public class XandOGame {
//	Kreirati klasu Player koja ima:
//	ime i prezime
//	gettere i settere
//	konstuktore
//	metodu print, koja stampa ime i prezime igraca
//
//	Kreirati klasu XandOGame koja ima:
//	table - niz koji cuva stanje igre. Npr: table = x, x, 0, 0, x, 0, x, 0, x
//	nextPlayer - atribut koji cuva informaciju ko igra sledeci. Moze da ima vrednosti x ili o
//	playerX - igrac X
//	playerO - igrac O
//	Difoltni konstuktor koji u niz dodaje 9 elemenata. Svaki element u nizu je “ “
//	Kontuktor koji prima dva parametra, igraca x i igraca o i ovaj kontuktor radi sve sto radi i
//	difoltni samo sto dodatno postavlja i igraca
//	gettere i settere za igrace
//	Metodu print koja stampa tablu sliku kao na slici. Stampanje se vrsi petljom. Ako je niz iz
//	primera iznad stampa izgleda:
//	x | x | 0 |
//	0 | x | 0 |
//	x | 0 | x |
//
//	Metodu startGame, metoda postavlja sve elemente niza na prazan string “ “ i zatim postavlja da je
//	na redu igrac X.
//	Metodu isGameOver, igra je gotova ako su sva polja popunjena.
//	Metodu isFieldFree, koja vraca da li je trazeno polje slobodno. Metoda od parametara prima niz i
//	poziciju za kojju se proverava. Polje je slobodno ako u njemu ne pise x ili o
//	Metodu playNext, metoda prebacuje potez na sledeceg igraca, ako je bio igrac x prebacuje ga na o
//	i obrnuto
//	Metodu makeAMove, metoda prima poziciju gde moze da odigra potez.
//	Ako je trenutno stanje u igri i sledeci na redu je igrac x
//	x | x | 0 |
//	0 |   |   |
//	x |   |   |
//	I pozove se metoda makeAMove za poziciju 5, novo stanje u igri je 
//	x | x | 0 |
//	0 |   | x |
//	x |   |   |
//	Metodu isWinnerX - metoda vraca rezultat igre za igraca X. Pobednik je ukoliko prosledjeni igrac ima
//	3 vezana svoja znaka ili po koloni ili po redu ili po dijgonalama
//	Metodu isWinnerO -  metoda vraca rezultat igre za igraca O. Pobednik je ukoliko prosledjeni igrac ima
//	3 vezana svoja znaka ili po koloni ili po redu ili po dijgonalama
//	Metodu isValidMove koja vraca informaciju da li je pozicija na koju igrac zeli da odigra potez validna.
//	Pozicija je validna ako je u opsegu od 0 do 8
//	Metodu gameScore, metoda vraca informaciju za kraj igre.
//	Ukoliko je pobednik igrac x, metoda vraca 1
//	Ukoliko je pobednik igrac o, metoda vraca 2
//	Ukoliko nemam pobednika vracamo 0
//
//
//	Glavni program (main):
//	Ucitati podatke za igrace
//	Kreirajte objekat klase XandOGame 
//	Startujte igru, tada je na potezu igrac X
//	Saveti za dobar zadatak
//	Igra treba da traje dok (while petlja)
//	nije kraj igre - imamo metodu za to
//	Ili dok ne dobijemo pobednika
//	U petlji
//	Trazimo od aktuelnog igraca da unese potez
//	Ukoliko je pozicija validna i ako je to slobodno mesto, igramo potez
//	Prebacujemo red na drugog igraca
//	Stampamo tablu
//	Ukoliko nije validna pozicija ili nije slobodno mesto stampamo poruku "You enter invalid position."
//	Nakon zavrsetka igre, racunamo skor i stampamo rezultat igre i podatke za igrace

	private ArrayList<String> table = new ArrayList<String>();
	private String nextPlayer;
	private String igracX;
	private String igracO;

	public XandOGame() {
		table.add(" ");
		table.add(" ");
		table.add(" ");
		table.add(" ");
		table.add(" ");
		table.add(" ");
		table.add(" ");
		table.add(" ");
		table.add(" ");
		
	}

	public XandOGame(String igracX, String igracO) {
		super();
		this.igracX = igracX;
		this.igracO = igracO;

		table.add(" ");
		table.add(" ");
		table.add(" ");
		table.add(" ");
		table.add(" ");
		table.add(" ");
		table.add(" ");
		table.add(" ");
		table.add(" ");
	}

	public String getIgracX() {
		return igracX;
	}

	public void setIgracX(String igracX) {
		this.igracX = igracX;
	}

	public String getIgracO() {
		return igracO;
	}

	public void setIgracO(String igracO) {
		this.igracO = igracO;
	}
	
	public void print() {
		String prviRed = " ";
		String drugiRed = " ";
		String treciRed = " ";
		for(int i = 0; i < table.size(); i++) {
			if(i >= 0 && i < 3) {
				prviRed = prviRed + table.get(i) + " | ";
			}
			if(i >= 3 && i < 6) {
				drugiRed = drugiRed + table.get(i) + " | ";
			}
			if(i >= 6 && i < 9) {
				treciRed = treciRed + table.get(i) + " | ";
			}
			
		}
		
		System.out.println(prviRed);
		System.out.println(drugiRed);
		System.out.println(treciRed);
	}
	public void startGame() {
		for (int i = 0; i < table.size(); i++) {
			table.set(i, " ");
		}
		this.nextPlayer = "X";
	}

	public boolean isGameOver() {
		int brojPopunjenih = 0;
		for (int i = 0; i < table.size(); i++) {
			if (table.get(i) != " ") {
				brojPopunjenih = brojPopunjenih + 1;
			}
		}

		if (brojPopunjenih == table.size()) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isFieldFree(ArrayList<String> table, int pozicija) {
		if (table.get(pozicija) != "X" || table.get(pozicija) != "O") {
			return true;
		} else
			return false;
	}

	public void playNext() {
		if (this.nextPlayer.equals("X")) {
			this.nextPlayer = "O";
		} else {
			this.nextPlayer = "X";
		}

	}

	public void makeAMove(int pozicija) {
		this.table.set(pozicija, nextPlayer);
		

	}

	public boolean isWinnerX() {
		
		String rezultatPrviRed = this.table.get(0) + this.table.get(1) + this.table.get(2);
	
		String rezultatDrugiRed = this.table.get(3) + this.table.get(4) + this.table.get(5);
			
		String rezultatTreciRed = this.table.get(6) + this.table.get(7) + this.table.get(8);
		
		String rezultatVertikalnoPrviRed = this.table.get(0) + this.table.get(3) + this.table.get(6);
		
		String rezultatVertikalnoDrugiRed = this.table.get(1) + this.table.get(4) + this.table.get(7);
		
		String rezultatVertikalnoTreciRed = this.table.get(2) + this.table.get(5) + this.table.get(8);
		
		String rezultatDijagonalaPrva = this.table.get(0) + this.table.get(4) + this.table.get(8);
		
		String rezultatDijagonalaDruga = this.table.get(2) + this.table.get(4) + this.table.get(6);
		
		if(rezultatPrviRed.equals("XXX") || rezultatDrugiRed.equals("XXX") || rezultatTreciRed.equals("XXX")
				|| rezultatVertikalnoPrviRed.equals("XXX") || rezultatVertikalnoDrugiRed.equals("XXX") ||
				rezultatVertikalnoTreciRed.equals("XXX") || rezultatDijagonalaPrva.equals("XXX")
				|| rezultatDijagonalaDruga.equals("XXX")) {
			return true;
		}
		else {
			return false;
		}
		
	
	}
public boolean isWinnerO() {
		
		String rezultatPrviRed = this.table.get(0) + this.table.get(1) + this.table.get(2);
	
		String rezultatDrugiRed = this.table.get(3) + this.table.get(4) + this.table.get(5);
			
		String rezultatTreciRed = this.table.get(3) + this.table.get(4) + this.table.get(5);
		
		String rezultatVertikalnoPrviRed = this.table.get(0) + this.table.get(3) + this.table.get(6);
		
		String rezultatVertikalnoDrugiRed = this.table.get(1) + this.table.get(4) + this.table.get(7);
		
		String rezultatVertikalnoTreciRed = this.table.get(2) + this.table.get(5) + this.table.get(8);
		
		String rezultatDijagonalaPrva = this.table.get(0) + this.table.get(4) + this.table.get(8);
		
		String rezultatDijagonalaDruga = this.table.get(2) + this.table.get(4) + this.table.get(6);
		
		if(rezultatPrviRed.equals("OOO") || rezultatDrugiRed.equals("OOO") || rezultatTreciRed.equals("OOO")
				|| rezultatVertikalnoPrviRed.equals("OOO") || rezultatVertikalnoDrugiRed.equals("OOO") ||
				rezultatVertikalnoTreciRed.equals("OOO") || rezultatDijagonalaPrva.equals("OOO")
				|| rezultatDijagonalaDruga.equals("OOO")) {
			return true;
		}
		else {
			return false;
		}
		
	
	}
	
	
	
	
	public boolean isValidMove(int pozicija) {
		if(pozicija >= 0 && pozicija <= 8) {
			return true;
		}
		else {
			return false;
		}
	}
	
    public int gameScore() {
		if(isWinnerX() == true) {
			return 1;
		}
		else if(isWinnerO() == true) {
			return 2;
			
		}
		else {
			return 0;
		}
	}

	public ArrayList<String> getTable() {
		return table;
	}

	public void setTable(ArrayList<String> table) {
		this.table = table;
	}
//	public void print2() {
//		String prviRed = " ";
//		String drugiRed = " ";
//		String treciRed = " ";
//		for(int i = 0; i < table.size(); i++) {
//			if(i >= 0 && i < 3) {
//				prviRed = prviRed + table.get(i) + " | ";
//				prviRed = " " + X + |;
//				prviRed = " " + X + | + O + |;
//				prviRed = " "  X  |  O  |  X  |;
//			}
//			if(i >= 3 && i < 6) {
//				drugiRed = drugiRed + table.get(i) + " | ";
//			}
//			if(i >= 6 && i < 9) {
//				treciRed = treciRed + table.get(i) + " | ";
//			}
//			
//		}
//		
//		System.out.println(prviRed);
//		System.out.println(drugiRed);
//		System.out.println(treciRed);
//	}	
	
	
	
	
	}

