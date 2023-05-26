package command.classes;

public class Bicycle implements Vehicle {

	@Override
	public void start() {
		System.out.println("Estic arrencant una bicicleta.");

	}

	@Override
	public void accelerate() {
		System.out.println("Estic accelerant una bicicleta.");

	}

	@Override
	public void brake() {
		System.out.println("Estic frenant una bicicleta.");

	}

	@Override
	public String toString() {
		return "Bicycle";
	}

	
}
