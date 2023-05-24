package observer;

import java.util.*;

public class Agent {

	private List<Observador> agencies = new ArrayList<>();
	private String valor;

	public String getEstat() {
		return valor;
	}

	public void setEstat(String valor) {
		this.valor = valor;
		notificarObservador();
	}

	public void registrarObservador(Observador o) {
		agencies.add(o);

	}

	public void eliminarObservador(Observador o) {
		agencies.remove(o);

	}

	public void notificarObservador() {

		agencies.forEach(x -> x.update());

	}
}
