
import javafx.scene.paint.Color;

public class CarTransportTrailer extends Trailer {
	
	/**
	 * Konstruktor f�r trailer
	 * @param c F�rgen p� trailern
	 */
	public CarTransportTrailer(Color c) {
		super(c, "CarTransportTrailer");
	}
	
	private VehicleLoaderDelegate vehicleLoader;
	/**
	 * Lastar bilar
	 * @param v Modelnamnet
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
	 * s�tter positionen p� fordonet.
	 */
	@Override
	public void updatePosition(double x, double y) {
		super.updatePosition(x, y);
		vehicleLoader.updatePosition(x, y);
	}
}
