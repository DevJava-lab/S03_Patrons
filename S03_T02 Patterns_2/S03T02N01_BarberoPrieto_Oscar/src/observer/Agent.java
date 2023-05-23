package observer;

import java.util.*;

public class Agent implements Subjecte {

	private List<Observador> agencies = new ArrayList<>();


	@Override
	public void registrarObservador(Observador o) {
		agencies.add(o);

	}

	@Override
	public void eliminarObservador(Observador o) {
		agencies.remove(o);

	}

	@Override
	public void notificarObservador(String noticia) {
		for (Observador observador : agencies) {

			System.out.println("Informe per l' "+observador.toString());
			observador.update(noticia);

		}
	}

}
