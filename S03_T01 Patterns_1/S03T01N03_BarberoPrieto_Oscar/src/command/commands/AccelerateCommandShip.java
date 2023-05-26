package command.commands;

import command.classes.Ship;

public class AccelerateCommandShip implements Command {

	private Ship ship;

	public AccelerateCommandShip(Ship ship) {
		this.ship = ship;
	}

	@Override
	public void execute() {

		ship.brake();
		
	}

}
