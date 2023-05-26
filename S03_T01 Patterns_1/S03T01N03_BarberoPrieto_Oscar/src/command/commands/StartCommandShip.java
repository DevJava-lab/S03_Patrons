package command.commands;

import command.classes.Ship;

public class StartCommandShip implements Command {

	private Ship ship;

	public StartCommandShip(Ship ship) {
		this.ship = ship;
	}

	@Override
	public void execute() {

		ship.start();

	}

}
