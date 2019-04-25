package model;

import java.util.ArrayList;

import javafx.scene.paint.Color;

public class CarModel {

	static ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();

	public static void main(String[] args) {
		vehicles.add(new Volvo740(Color.WHITE));
		vehicles.add(new Saab95(Color.PINK));
		vehicles.add(new Scania(Color.BLACK, new Flatbed()));
	}

	public void addVehicle(Vehicle v) {
		vehicles.add(v);
	}

	public ArrayList<Vehicle> getVehicles() {
		return vehicles;
	}

	public void moveAll() {
		for (Vehicle vehicle : vehicles) {
			vehicle.move();
		}
	}

	public void gasAll(double amount) {
		for (Vehicle vehicle : vehicles) {
			vehicle.gas(amount);
		}
	}

	public void brakeAll(double amount) {
		for (Vehicle vehicle : vehicles) {
			vehicle.brake(amount);
		}
	}

	public void turboAll() {
		for (Vehicle vehicle : vehicles) {
			if(vehicle instanceof Saab95) {
				((Saab95) vehicle).turboSwitch();
			}
		}
	}
	
	public void flatbedAll() {
		for (Vehicle vehicle : vehicles) {
			if(vehicle instanceof Truck) {
				if(((Truck) vehicle).isFlatbedTruck()) {
					Flatbed.flatbedSwitch(vehicle.getCurrentSpeed());
				}
			}
		}
	}
}
