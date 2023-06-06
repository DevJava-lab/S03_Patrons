package Controller;

import Model.*;
import java.util.*;
import java.io.File;
import java.io.FileWriter;

public class Menu {

	public static void main(String[] args) {

		Floristeria botiga = null;
		Arbre tree;
		Flor flower;
		Decoracio decor;
		Ticket ticket;
		String product;

		boolean esc = false;
		int opcioMenu;

		while (!esc) {
			System.out.println("\n--------------------- MENÚ ---------------------");
			System.out.println("\n 1.  Crear Floristeria.");
			System.out.println(" 2.  Afegir arbre.");
			System.out.println(" 3.  Afegir flor.");
			System.out.println(" 4.  Afegir decoració.");
			System.out.println(" 5.  Stock floristeria.");
			System.out.println(" 6.  Eliminar arbre.");
			System.out.println(" 7.  Eliminar flor.");
			System.out.println(" 8.  Eliminar article decoració.");
			System.out.println(" 9.  Total articles en stock.");
			System.out.println("10.  Total valor floristeria.");
			System.out.println("11.  Ticket compra.");
			System.out.println("12.  Historial compres.");
			System.out.println("13.  Total vendes.");
			System.out.println("14.  Sortir.\n");

			try {
				opcioMenu = introNumber("Escull una opció : ");
				switch (opcioMenu) {

				case 1:
					botiga = createFlorist();
					break;
				case 2:
					if (botiga == null) {
						botiga = createFlorist();
					}
					tree = createTree();
					botiga.addTree(tree);
					break;
				case 3:
					if (botiga == null) {
						botiga = createFlorist();
					}
					flower = createFlower();
					botiga.addFlower(flower);
					break;
				case 4:
					if (botiga == null) {
						botiga = createFlorist();
					}
					decor = createDecor();
					botiga.addDecor(decor);
					break;
				case 5:
					if (botiga == null) {
						botiga = createFlorist();
					}
					botiga.writerStockFlorist();
					botiga.readStockFlorist();
					break;
				case 6:
					if (botiga == null) {
						botiga = createFlorist();
					}
					botiga.removeTree(introNumber("Referència de l'arbre : "));
					break;
				case 7:
					if (botiga == null) {
						botiga = createFlorist();
					}
					botiga.removeFlower(introNumber("Referència de la flor : "));
					break;
				case 8:
					if (botiga == null) {
						botiga = createFlorist();
					}
					botiga.removeDecor(introNumber("Referència de l'article : "));
					break;
				case 9:
					if (botiga == null) {
						botiga = createFlorist();
					}
					botiga.stocksQuantities();
					break;
				case 10:
					if (botiga == null) {
						botiga = createFlorist();
					}
					System.out.println("Total valor floristeria : "+botiga.fullValue() + " €");
					break;
				case 11:
					if (botiga == null) {
						botiga = createFlorist();
					}
					ticket = new Ticket(botiga);
					try {
						boolean opcio = false;
						while (!opcio) {

							product = introString("Producte per afegir : (per sortir click dues vegades) :");
							switch (product) {
							case "ARBRE":
								tree = botiga.searchTree(introNumber("Referència de l'arbre : "));
								ticket.shopping(tree);
								break;
							case "FLOR":
								flower = botiga.searchFlower(introNumber("Referència de la flor : "));
								ticket.shopping(flower);
								break;
							case "DECORACIO":
								decor = botiga.searchDecor(introNumber("Referència de l'article : "));
								ticket.shopping(decor);
								break;
							default:
								if (product != "ARBRE" || product != "FLOR" || product != "DECORACIO") {
									System.out.println("Article no existent.");
								}
								opcio = true;
								ticket.writerTicket();
								break;
							}
						}

					} catch (Exception e) {
						System.out.println("Error");
					}

					break;
				case 12:
					if (botiga == null) {
						botiga = createFlorist();
					}
					botiga.salesHistory();
					botiga.writerSalesHistory();
					break;
				case 13:
					if (botiga == null) {
						botiga = createFlorist();
					}
					System.out.println(botiga.profits() + " €");
					break;
				case 14:
					esc = true;
					break;
				default:
					System.out.println("Solament números entre 1 - 14.\n");
				}
			} catch (Exception e) {
				System.out.println("Cal ficar un número.\n");
			}

		}

	}

	public static Floristeria createFlorist() {

		return new Floristeria(introString("Nom de la floristeria : "));
	}

	public static Arbre createTree() {

		return new Arbre(introString("Nom de l'arbre : "), introNumber("Preu : "), introNumber("Alçada : "));

	}

	public static Flor createFlower() {

		return new Flor(introString("Nom de la flor : "), introNumber("Preu : "), introString("Color : "));

	}

	public static Decoracio createDecor() {

		return new Decoracio(introString("Nom article : "), introNumber("Preu : "),
				introString("Material (Fusta / Plàstic) : "));

	}

	public static String introString(String misatge) {

		Scanner sc = new Scanner(System.in);
		System.out.println(misatge);

		return sc.nextLine().toUpperCase();
	}

	public static int introNumber(String misatge) {

		Scanner sc = new Scanner(System.in);
		System.out.println(misatge);

		return sc.nextInt();
	}

}
