package command.classes;

import command.commands.Command;

public class Menu {

	private Command push1;
	private Command push2;
	private Command push3;

	public Menu(Command push1, Command push2, Command push3) {
		this.push1 = push1;
		this.push2 = push2;
		this.push3 = push3;
	}

	public void actionAccelerate() {
		push1.execute();
	}

	public void actionBrake() {
		push2.execute();
	}

	public void actionStart() {
		push3.execute();
	}

}
