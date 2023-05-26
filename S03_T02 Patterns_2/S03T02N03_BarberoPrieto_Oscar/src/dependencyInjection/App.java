package dependencyInjection;

public class App {

	public static void main(String[] args) {
	
		Article art = new Article("jersei",24.0,new Moneda());
		
		art.converse("Dòlars");

	}

}
