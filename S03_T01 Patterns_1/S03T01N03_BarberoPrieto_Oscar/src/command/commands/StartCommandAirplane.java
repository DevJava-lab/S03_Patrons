package command.commands;

import command.classes.Airplane;

public class StartCommandAirplane implements Command {
	
	private Airplane airplane;
	
	public StartCommandAirplane(Airplane airplane) {
		this.airplane = airplane;
	}

	@Override
	public void execute() {
		
		airplane.start();

	}

}
