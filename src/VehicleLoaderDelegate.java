import java.util.ArrayList;

public abstract class VehicleLoaderDelegate {
	
	ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
	
	public void loadVehicle(Vehicle v, String modelname) {
		if(modelname == "cartransporttrailer") {
			if(!(v instanceof Car)) return;
		}
		else if(modelname == "carFerry") {
			if(!(v instanceof Car) && !(v instanceof Truck)) return;
		}
		vehicles.add(v);
	}
	
	public Vehicle unloadLastVehicle() {
		Vehicle v = vehicles.get(vehicles.size()-1);
		vehicles.remove(v);
		return v;
	}
	
	public Vehicle unloadFirstVehicle() {
		Vehicle v = vehicles.get(0);
		vehicles.remove(v);
		return v;
	}
	
	public void updatePosition(double x, double y) {
		for (Vehicle vehicle : vehicles) {
			vehicle.setX(x);
			vehicle.setY(y);
		}
	}
}
