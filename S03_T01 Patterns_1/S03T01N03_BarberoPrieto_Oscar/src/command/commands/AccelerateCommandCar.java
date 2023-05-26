package command.commands;

import command.classes.Car;

public class AccelerateCommandCar implements Command {

	private Car car;

	public AccelerateCommandCar(Car car) {
		this.car = car;
	}

	@Override
	public void execute() {

		car.accelerate();
		
	}

}
