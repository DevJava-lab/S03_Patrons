package command.commands;

import command.classes.Bicycle;

public class BrakeCommandBicycle implements Command {

	private Bicycle bicy;

	public BrakeCommandBicycle(Bicycle bicy) {
		this.bicy = bicy;
	}

	@Override
	public void execute() {

		bicy.brake();

	}

}
