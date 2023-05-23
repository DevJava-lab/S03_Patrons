package observer;

public class Agencia implements Observador {

	private String nom;

	public Agencia(String nom) {
		this.nom = nom;
	}

	@Override
	public void update(String str) {
		System.out.println(str);

	}

	@Override
	public String toString() {
		return "Agencia = " + nom ;
	}
	
	

}
