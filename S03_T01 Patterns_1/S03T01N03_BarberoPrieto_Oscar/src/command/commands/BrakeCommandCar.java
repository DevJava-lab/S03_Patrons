package command.commands;

import command.classes.Car;

public class BrakeCommandCar implements Command {

	private Car car;

	public BrakeCommandCar(Car car) {
		this.car = car;
	}

	@Override
	public void execute() {

		car.brake();
		
	}

}
