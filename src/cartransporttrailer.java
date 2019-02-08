
import javafx.scene.paint.Color;

public class cartransporttrailer extends trailer {

	public cartransporttrailer(Color c) {
		super(c, "cartransporttrailer");
	}
	
	private carLoaderDelegate vehicleLoader;
	
	public void loadCar(vehicle v) {
		vehicleLoader.loadVehicle(v, this.getModelName());
	}
	
	public vehicle unloadCar() {
		return vehicleLoader.unloadLastVehicle();
	}	
}
