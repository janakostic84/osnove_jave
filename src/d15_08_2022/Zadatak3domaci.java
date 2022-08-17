package d15_08_2022;

public class Zadatak3domaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Napisati funkciju koja za dva jednocifrena broja koja su ulazni parametri funkcije
//		vraca novu vrednost koja se formira kao na primeru. METODA NISTA NE STAMPA.
//		ako je prvi broj =2, a drugi =3 vraca novu vrednost 23.
//		ako je prvi broj =6, a drugi =2 vraca novu vrednost 62.

		novaVrednost(3, 5);

	}

	public static int novaVrednost(int a, int b) {

		if (a > 0 && a < 10 && b > 0 && b < 10) {

			int novaVrednost = a * 10 + b;
			return novaVrednost;
		} else {
			return 0;

		}

	}
}
