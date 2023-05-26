package command.commands;

import command.classes.Bicycle;

public class AccelerateCommandBicycle implements Command {

	private Bicycle bicy;

	public AccelerateCommandBicycle(Bicycle bicy) {
		this.bicy = bicy;
	}

	@Override
	public void execute() {

		bicy.accelerate();

	}

}
