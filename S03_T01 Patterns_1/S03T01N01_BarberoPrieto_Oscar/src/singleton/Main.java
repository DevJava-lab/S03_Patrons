package singleton;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		Undo comanda = Undo.getInstancia();

		System.out.println("------------- MENÚ -------------");
		System.out.println("\n1. Afegir comanda.");
		System.out.println("2. Eliminar comanda.");
		System.out.println("3. Històric comandes.");
		System.out.println("4. Sortir.\n");

		try {
			Scanner sc = new Scanner(System.in);
			int opcio;
			boolean sortir = false;


			do {

				System.out.println("Escull una opció :");
				opcio = sc.nextInt();

				switch (opcio) {
				case 1:
					comanda.add(resposta("Indica comanda :"));
					System.out.println("Comanda acceptada.\n");
					break;
				case 2:
					comanda.erase(resposta("Indica comanda :"));
					System.out.println("Comanda eliminada.\n");
					break;
				case 3:
					comanda.history();
					break;
				case 4:
					sortir = true;
					break;
				default:
					System.out.println("Només números 1 - 4.\n");
				}
			} while (!sortir);

		} catch (Exception e) {
			System.out.println("Només números.");
		}
	}

	public static String resposta(String missatge) {

		Scanner sc = new Scanner(System.in);
		System.out.println(missatge);
		String resposta = sc.nextLine();
		return resposta;
	}

}
