package command.classes;

import java.util.*;

import command.commands.*;

public class Parking {

	static List<Vehicle> parking = new ArrayList<>();

	public static void main(String[] args) {

		Airplane veh1 = new Airplane();
		Bicycle veh2 = new Bicycle();
		Car veh3 = new Car();
		Ship veh4 = new Ship();

		park(veh1);
		park(veh2);
		park(veh3);
		park(veh4);

		Command accelerate1 = new AccelerateCommandAirplane(veh1);
		Command brake1= new BrakeCommandAirplane(veh1);
		Command start1 = new StartCommandAirplane(veh1);
		
		Command accelerate2= new AccelerateCommandBicycle(veh2);
		Command brake2 = new BrakeCommandBicycle(veh2);
		Command start2 = new StartCommandBicycle(veh2);
		
		Command accelerate3 = new AccelerateCommandCar(veh3);
		Command brake3 = new BrakeCommandCar(veh3);
		Command start3 = new StartCommandCar(veh3);
		
		Command accelerate4 = new AccelerateCommandShip(veh4);
		Command brake4 = new BrakeCommandShip(veh4);
		Command start4 = new StartCommandShip(veh4);
		
		Menu menu1 = new Menu(accelerate1, brake1, start1);
		
		Menu menu2 = new Menu(accelerate2, brake2, start2);
		
		Menu menu3 = new Menu(accelerate3, brake3, start3);

		Menu menu4 = new Menu(accelerate4, brake4, start4);
		

		menu1.actionAccelerate();
		menu1.actionBrake();
		menu1.actionStart();
		System.out.println("----------------------------------------");
		menu2.actionAccelerate();
		menu2.actionBrake();
		menu2.actionStart();
		System.out.println("-----------------------------------------");
		menu3.actionAccelerate();
		menu3.actionBrake();
		menu3.actionStart();
		System.out.println("-----------------------------------------");
		menu4.actionAccelerate();
		menu4.actionBrake();
		menu4.actionStart();

	}

	private static void park(Vehicle vehicle) {

		parking.add(vehicle);

	}

	private static void unPark(Vehicle vehicle) {

		parking.remove(vehicle);
	}

}
