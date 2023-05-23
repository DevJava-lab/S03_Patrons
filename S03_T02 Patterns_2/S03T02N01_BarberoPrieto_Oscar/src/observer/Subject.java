package observer;

public interface Subject  {

	void registrarObservador(Observador o);
	void eliminarObservador(Observador o);
	void notificarObservador(String str); 
}
