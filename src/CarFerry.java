
import javafx.scene.paint.Color;

public class CarFerry extends Boat {

	public CarFerry(Color c) {
		super(c, 2000, "CarFerry");
	}
	
	private VehicleLoaderDelegate vehicleLoader;
	
	public void loadVehicle(Vehicle v) {
		vehicleLoader.loadVehicle(v, this.getModelName());
	}
	
	public Vehicle unloadCar() {
		return vehicleLoader.unloadFirstVehicle();
	}

	@Override
	public double speedFactor() {
		return enginePower * 0.01;
	}
	
	@Override
	public void move() {
		super.move();
		vehicleLoader.updatePosition(this.getX(), this.getY());
	}
}
