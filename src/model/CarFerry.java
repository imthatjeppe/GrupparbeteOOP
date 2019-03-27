package model;

import javafx.scene.paint.Color;

public class CarFerry extends Boat {

	public CarFerry(Color c) {
		super(c, 2000, "CarFerry");
	}
	
	private VehicleLoaderDelegate vehicleLoader;
	/**
	 * Lastar bilar p� b�ten
	 * @param v Man s�ger vilket fordon som ska lastas
	 */
	public void loadVehicle(Vehicle v) {
		vehicleLoader.loadVehicle(v, this.getModelName());
	}
	/**
	 * Lastar av ett fordon fr�n b�ten
	 * @return ett fordon
	 */
	public Vehicle unloadCar() {
		return vehicleLoader.unloadFirstVehicle();
	}
   /**
    * Returnerar fart faktorn
    */
	@Override
	public double speedFactor() {
		return enginePower * 0.01;
	}
	/**
	 * S�tter fordonets position.
	 */
	@Override
	public void move() {
		super.move();
		vehicleLoader.updatePosition(this.getX(), this.getY());
	}
}
