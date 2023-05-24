package observer;

public class Agencia extends Observador {

	private String nom;

	public Agencia(String nom,Agent agent) {
		this.nom = nom;
		this.agent=agent;
		agent.registrarObservador(this);
	}

	@Override
	public void update() {
		
		System.out.println(nom +" : "+ agent.getEstat());

	}	

}
