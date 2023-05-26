package command.commands;

import command.classes.Airplane;

public class BrakeCommandAirplane implements Command {

	private Airplane airplane;

	public BrakeCommandAirplane(Airplane airplane) {
		this.airplane = airplane;
	}

	@Override
	public void execute() {

		airplane.brake();

	}

}
