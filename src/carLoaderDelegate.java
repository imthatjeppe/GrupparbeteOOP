import java.util.ArrayList;

public abstract class carLoaderDelegate {
	
	ArrayList<vehicle> vehicles = new ArrayList<vehicle>();
	
	public void loadVehicle(vehicle v, String modelname) {
		if(modelname == "cartransporttrailer") {
			if(!(v instanceof car)) return;
		}
		else if(modelname == "carFerry") {
			if(!(v instanceof car) && !(v instanceof truck)) return;
		}
		vehicles.add(v);
	}
	
	public vehicle unloadLastVehicle() {
		vehicle v = vehicles.get(vehicles.size()-1);
		vehicles.remove(v);
		return v;
	}
	
	public vehicle unloadFirstVehicle() {
		vehicle v = vehicles.get(0);
		vehicles.remove(v);
		return v;
	}
}
