package Model;

public class Decoracio extends Producte {

	private String material;
	private static int cont = 0;
	private int ref;

	public Decoracio(String name, double price, String material) {
		super(name, price);
		this.material = material;
		cont++;
		ref = cont;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public int getRef() {
		return ref;
	}

	public void setRef(int ref) {
		this.ref = ref;
	}

	@Override
	public String toString() {
		return "cod : " + ref + " -> Art. decoració = " + super.getName() + " , Preu = " + super.getPrice()
				+ " € , Material = " + material;
	}

}
