package singleton;

import java.util.List;
import java.util.ArrayList;

public class Undo {

	private static Undo instancia;
	private List<String> historial;

	private Undo() {
		historial = new ArrayList<>();
	}

	public static Undo getInstancia() {

		if (instancia == null) {
			instancia = new Undo();
		}
		return instancia;
	}

	public void add(String comanda) {

		historial.add(comanda);

	}

	public void erase(String comanda) {

		historial.remove(comanda);

	}

	public void history() {

		for (String element : historial) {

			System.out.println(element);

		}
	}

}
