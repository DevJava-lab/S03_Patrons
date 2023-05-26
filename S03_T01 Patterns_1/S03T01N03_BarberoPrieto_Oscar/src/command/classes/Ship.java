package command.classes;

public class Ship implements Vehicle {

	@Override
	public void start() {
		System.out.println("Estic arrencant un vaixell.");

	}

	@Override
	public void accelerate() {
		System.out.println("Estic accelerant un vaixell.");

	}

	@Override
	public void brake() {
		System.out.println("Estic frenant un vaixell.");

	}

	@Override
	public String toString() {
		return "Ship";
	}
	
	

}
