package command.commands;

import command.classes.Bicycle;

public class StartCommandBicycle implements Command {
	
	private Bicycle bicy;
	
	public StartCommandBicycle(Bicycle bicy) {
		this.bicy = bicy;
	}

	@Override
	public void execute() {
		
		bicy.start();

	}

}
