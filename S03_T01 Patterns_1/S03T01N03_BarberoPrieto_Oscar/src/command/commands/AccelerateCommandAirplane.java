package command.commands;

import command.classes.Airplane;

public class AccelerateCommandAirplane implements Command {

	private Airplane airplane;

	public AccelerateCommandAirplane(Airplane airplane) {
		this.airplane = airplane;
	}

	@Override
	public void execute() {

		airplane.accelerate();

	}

}
