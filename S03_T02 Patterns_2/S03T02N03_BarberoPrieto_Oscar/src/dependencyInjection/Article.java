package dependencyInjection;

public class Article {

	private String nom;
	private double preu;
	private Moneda moneda;

	public Article(String nom, double preu, Moneda moneda) {
		this.nom = nom;
		this.preu = preu;
		this.moneda = moneda;
	}

	public double getPreu() {
		return preu;
	}

	public void setPreu(double preu) {
		this.preu = preu;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void converse(String divisa) {

		double canvi = moneda.canviMoneda(preu, divisa);
		System.out.println("Preu actualitzat = " + canvi + " " + divisa);

	}

}
