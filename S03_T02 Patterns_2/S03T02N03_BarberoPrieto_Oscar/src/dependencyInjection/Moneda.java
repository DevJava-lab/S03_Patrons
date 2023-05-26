package dependencyInjection;

public class Moneda {
	
	public double canviMoneda(double preu, String divisa) {

		double canvi = 0;

		if (divisa == "Lliures") {
			canvi = preu * 0.86;
		} else if (divisa == "Dòlars") {
			canvi = preu * 1.072;
		} else if (divisa == "Yens") {
			canvi = preu * 149.88;
		}

		return canvi;

	}

}
