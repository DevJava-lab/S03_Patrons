package command.commands;

import command.classes.Ship;

public class BrakeCommandShip implements Command {

	private Ship ship;

	public BrakeCommandShip(Ship ship) {
		this.ship = ship;
	}

	@Override
	public void execute() {

		ship.accelerate();

	}

}
