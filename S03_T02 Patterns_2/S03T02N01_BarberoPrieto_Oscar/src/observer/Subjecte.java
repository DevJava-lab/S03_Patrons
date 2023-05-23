package observer;

public interface Subjecte  {

	void registrarObservador(Observador o);
	void eliminarObservador(Observador o);
	void notificarObservador(String str); 
}
