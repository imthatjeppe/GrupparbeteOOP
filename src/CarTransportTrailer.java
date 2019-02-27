
import javafx.scene.paint.Color;

public class CarTransportTrailer extends Trailer {

	public CarTransportTrailer(Color c) {
		super(c, "CarTransportTrailer");
	}
	
	private VehicleLoaderDelegate vehicleLoader;
	
	public void loadCar(Vehicle v) {
		vehicleLoader.loadVehicle(v, this.getModelName());
	}
	
	public Vehicle unloadCar() {
		return vehicleLoader.unloadLastVehicle();
	}
	
	@Override
	public void updatePosition(double x, double y) {
		super.updatePosition(x, y);
		vehicleLoader.updatePosition(x, y);
	}
}
