package observer;

public class Main {

	public static void main(String[] args) {
		
		Agent agentBorsa = new Agent();
		
		Agencia agenciaBorsa1 = new Agencia("Els Numeros");
		Agencia agenciaBorsa2 = new Agencia("Un pas Endevant");
		
		
		agentBorsa.registrarObservador(agenciaBorsa1);
		agentBorsa.registrarObservador(agenciaBorsa2);
		
		agentBorsa.notificarObservador("Ha hagut fallida a la Borsa");
		agentBorsa.notificarObservador("Fake News");

	}

}
