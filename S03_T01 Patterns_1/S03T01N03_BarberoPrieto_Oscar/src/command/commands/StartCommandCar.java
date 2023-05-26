package command.commands;

import command.classes.Car;

public class StartCommandCar implements Command {
	
	private Car car;
	
	public StartCommandCar(Car car) {
		this.car = car;
	}

	@Override
	public void execute() {
		
		car.start();

	}

}
