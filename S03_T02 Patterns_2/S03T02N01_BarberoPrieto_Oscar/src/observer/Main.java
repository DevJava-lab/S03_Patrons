package observer;

public class Main {

	public static void main(String[] args) {

		Agent agent = new Agent();

		new Agencia("Els Numeros", agent);
		new Agencia("Un pas Endevant", agent);

		agent.setEstat("La Borsa ha pujat tres punts.");
		agent.setEstat("Valors estabilitzats.");

	}

}
