package Model;

import java.util.List;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Ticket {

	private List<Producte> shopping;
	private static int cont = 0;
	private int num;
	private Date date;
	private Floristeria florist;
	private double total = 0;

	public Ticket(Floristeria florist) {
		this.florist = florist;
		shopping = new ArrayList<>();
		cont++;
		num = cont;
		date = new Date();
		florist.addTicket(this);
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public void shopping(Producte pr) {

		shopping.add(pr);
		total += pr.getPrice();

	}

	public void showTicket() {

		System.out.println("\nFloristeria : " + florist.getName());
		System.out.println("Número ticket : " + num);
		System.out.println("Data : " + (new SimpleDateFormat("dd/MM/yyyy").format(date)));
		System.out.println("---------------------------------------------------------------------");
		shopping.forEach(x -> System.out.println(x));
		System.out.println("Total : " + total + " €");

	}

	public void writerTicket() throws IOException {

		String name = "src/main/java/View/tickets.txt";
		File file = new File(name);
		BufferedWriter bw = new BufferedWriter(new FileWriter(name));

		try {

			bw.write("\nFloristeria : " + florist.getName());
			bw.write("\nNúmero ticket : " + num);
			bw.write("\nData : " + (new SimpleDateFormat("dd/MM/yyyy").format(date)));
			bw.write("\n---------------------------------------------------------------------\n");

			for (Producte element : shopping) {

				bw.write(element.toString());
				bw.newLine();
			}
			bw.write("\nTotal : " + total + " €");
			bw.close();
		} catch (IOException e) {
			System.out.println("Error : " + e);
		}
	}

	@Override
	public String toString() {

		return "\nFloristeria : " + florist.getName() + "\nNúmero ticket : " + num + "\nData : "
				+ new SimpleDateFormat("dd/MM/yyyy").format(date) + "\nTotal : " + total + " €";
	}

}
