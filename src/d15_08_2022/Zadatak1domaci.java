package d15_08_2022;

import java.util.Scanner;

public class Zadatak1domaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Napisati metodu stampajVrednostZa10Vecu u kojoj se stampa prosledjena vrednost za 10 veca. Iz
//		main-a pozvati izvrsenje metode za razlicite vrednosti.

		stampajVrednostZa10Vecu(5);
		stampajVrednostZa10Vecu(6);
		stampajVrednostZa10Vecu(7);
		stampajVrednostZa10Vecu(8);

	}

	public static void stampajVrednostZa10Vecu(int n) {
		int vrednost = n + 10;
		System.out.println("Vrednost za 10 veca je: " + vrednost);
	}
}
