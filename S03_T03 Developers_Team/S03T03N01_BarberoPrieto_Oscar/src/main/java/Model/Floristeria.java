package Model;

import java.util.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Floristeria {

	private String name;
	private List<Arbre> stockTrees;
	private List<Flor> stockFlowers;
	private List<Decoracio> stockDecors;
	private List<Ticket> sales;
	private double fullValue;
	private double sumaTotal;

	public Floristeria(String name) {
		this.name = name;
		stockTrees = new ArrayList<Arbre>();
		stockFlowers = new ArrayList<Flor>();
		stockDecors = new ArrayList<Decoracio>();
		sales = new ArrayList<Ticket>();
		fullValue = 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addTree(Arbre tree) {

		stockTrees.add(tree);
		fullValue += tree.getPrice();
	}

	public void addFlower(Flor flower) {

		stockFlowers.add(flower);
		fullValue += flower.getPrice();
	}

	public void addDecor(Decoracio decor) {

		stockDecors.add(decor);
		fullValue += decor.getPrice();
	}

	public void addTicket(Ticket ticket) {

		sales.add(ticket);
	}

	public Arbre searchTree(int ref) {

		Arbre element = null;

		for (Arbre item : stockTrees) {

			if (item.getRef() == ref) {
				element = item;
			}
		}
		return element;

	}

	public Flor searchFlower(int ref) {

		Flor element = null;

		for (Flor item : stockFlowers) {

			if (item.getRef() == ref) {
				element = item;
			}
		}
		return element;
	}

	public Decoracio searchDecor(int ref) {

		Decoracio element = null;

		for (Decoracio item : stockDecors) {

			if (item.getRef() == ref) {
				element = item;
			}
		}
		return element;
	}

	public void removeTree(int ref) {

		for (Arbre item : stockTrees) {

			if (item.getRef() == ref) {
				stockTrees.remove(item);
				fullValue -= item.getPrice();
			}
		}
	}

	public void removeFlower(int ref) {

		for (Flor item : stockFlowers) {

			if (item.getRef() == ref) {
				stockFlowers.remove(item);
				fullValue -= item.getPrice();

			}
		}
	}

	public void removeDecor(int ref) {

		for (Decoracio item : stockDecors) {

			if (item.getRef() == ref) {
				stockDecors.remove(item);
				fullValue -= item.getPrice();

			}
		}
	}

	public void stocksQuantities() {

		System.out.println("Unitats d'arbres : " + stockTrees.size());
		System.out.println("Unitats de flors : " + stockFlowers.size());
		System.out.println("Unitats d'articles de decoració : " + stockDecors.size());
	}

	public void salesHistory() {

		sales.forEach(x -> x.showTicket());
	}

	public double profits() {

		double valor = 0;

		for (Ticket item : sales) {

			valor = item.getTotal();
			sumaTotal += valor;
		}

		return sumaTotal;
	}

	public double fullValue() {

		return fullValue;

	}

	public void writerStockFlorist() throws IOException {

		String name = "src/main/java/View/stockFlorist.txt";
		File file = new File(name);
		BufferedWriter bw = new BufferedWriter(new FileWriter(name));

		try {
			bw.write("\n-------------------- Stock Arbres --------------------------\n");

			for (Arbre element : stockTrees) {

				bw.write(element.toString());
				bw.newLine();
			}
			bw.write("\n-------------------- Stock Flors ----------------------------\n");
			for (Flor element : stockFlowers) {

				bw.write(element.toString());
				bw.newLine();
			}
			bw.write("\n-------------------- Stock Decoracions ------------------\n");
			for (Decoracio element : stockDecors) {

				bw.write(element.toString());
				bw.newLine();
			}

			bw.close();
		} catch (IOException e) {
			System.out.println("Error : " + e);
		}
	}

	public void readStockFlorist() throws FileNotFoundException {
		String name = "src/main/java/View/stockFlorist.txt";
		String str;
		BufferedReader br = new BufferedReader(new FileReader(name));

		try {
			str = br.readLine();
			while (str != null) {
				System.out.println(str);
				str = br.readLine();
			}
		} catch (Exception e) {
			System.out.println("Error : " + e);
		}
	}

	public void writerSalesHistory() throws IOException {

		String name = "src/main/java/View/historicalTickets.txt";
		File file = new File(name);
		BufferedWriter bw = new BufferedWriter(new FileWriter(name));

		try {

			for (Ticket element : sales) {

				bw.write(element.toString());
				bw.newLine();
			}

			bw.close();
		} catch (IOException e) {
			System.out.println("Error : " + e);
		}
	}
}