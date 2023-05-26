package command.classes;

public class Airplane implements Vehicle {

	@Override
	public void start() {
		System.out.println("Estic arrencant un avió.");

	}

	@Override
	public void accelerate() {
		System.out.println("Estic accelerant un avió.");

	}

	@Override
	public void brake() {
		System.out.println("Estic frenant un avió.");

	}

	@Override
	public String toString() {
		return "Airplane";
	}
	
	
}
