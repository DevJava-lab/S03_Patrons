package Model;

public class Arbre extends Producte {

	private double height;
	private static int cont=0;
	private int ref;

	public Arbre(String name, double price, double height) {
		super(name, price);
		this.height = height;
		cont++;
		ref = cont;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double alçada) {
		this.height = alçada;
	}

	public int getRef() {
		return ref;
	}

	public  void setRef(int ref) {
		this.ref = ref;
	}

	@Override
	public String toString() {
		return "cod : " + ref + " -> Nom = " + super.getName() + " , Preu = " + super.getPrice() + " € , Alçada = " + height + " m.";
	}

}
