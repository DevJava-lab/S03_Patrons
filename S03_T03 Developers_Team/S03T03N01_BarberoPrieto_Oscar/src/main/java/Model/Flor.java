package Model;

public class Flor extends Producte {

	private String color;
	private static int cont = 0;
	private int ref;

	public Flor(String name, double price, String color) {
		super(name, price);
		this.color = color;
		cont++;
		ref = cont;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getRef() {
		return ref;
	}

	public void setRef(int ref) {
		this.ref = ref;
	}

	@Override
	public String toString() {
		return "cod : " + ref + " -> Nom = " + super.getName() + " , Preu = " + super.getPrice() + " € , Color = "
				+ color;
	}

}
