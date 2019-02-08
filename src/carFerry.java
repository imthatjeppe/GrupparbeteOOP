
import javafx.scene.paint.Color;

public class carFerry extends boat {

	public carFerry(Color c) {
		super(c, 2000, "carFerry");
	}
	
	private carLoaderDelegate vehicleLoader;
	
	public void loadVehicle(vehicle v) {
		vehicleLoader.loadVehicle(v, this.getModelName());
	}
	
	public vehicle unloadCar() {
		return vehicleLoader.unloadLastVehicle();
	}

	@Override
	public double speedFactor() {
		return enginePower * 0.01;
	}
}
