package command.classes;

public class Car implements Vehicle {

	@Override
	public void start() {
		System.out.println("Estic arrencant un cotxe.");

	}

	@Override
	public void accelerate() {
		System.out.println("Estic accelerant un cotxe.");

	}

	@Override
	public void brake() {
		System.out.println("Estic frenant un cotxe.");

	}

	@Override
	public String toString() {
		return "Car";
	}

	
}
