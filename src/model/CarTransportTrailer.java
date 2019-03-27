package model;

import javafx.scene.paint.Color;

public class CarTransportTrailer extends Trailer {
	
	/**
	 * Konstruktor för trailer
	 * @param c Färgen på trailern
	 */
	public CarTransportTrailer(Color c) {
		super(c, "CarTransportTrailer");
	}
	
	private VehicleLoaderDelegate vehicleLoader = new VehicleLoaderDelegate() {};
	/**
	 * Lastar bilar
	 * @param v Fordonet
	 */
	public void loadCar(Vehicle v) {
		vehicleLoader.loadVehicle(v, this.getModelName());
	}
	/**
	 * lastar av bilar
	 * @return returnerar vilket fordon som lastats av.
	 */
	public Vehicle unloadCar() {
		return vehicleLoader.unloadLastVehicle();
	}
	/**
	 * sätter positionen på fordonet.
	 */
	@Override
	public void updatePosition(double x, double y) {
		super.updatePosition(x, y);
		vehicleLoader.updatePosition(x, y);
	}
}
