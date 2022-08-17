package d15_08_2022;

public class Zadatak5domaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Metoda prima dva parametra N i karakter za stampu. Metoda stampa N karaktera.
//		Ako se za N prosledi 5 i za karakter prosledi npr kosa crta (/) stampa se
//		/ / / / /
//		Napomena: Metoda nista ne vraca.

	printKarakter(5, "/");
	
	
	
	}

	public static void printKarakter(int n, String karakter) {
	
		for(int i = 1; i <= n; i++) {
		
		System.out.println(karakter);
	}
	
	
	
}
