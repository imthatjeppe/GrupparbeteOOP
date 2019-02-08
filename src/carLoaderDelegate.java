import java.util.ArrayList;

public abstract class carLoaderDelegate {
	
	ArrayList<car> cars = new ArrayList<car>();
	
	public void loadCar(car c) {
		cars.add(c);
	}
	
	public car unloadLastCar() {
		car car = cars.get(cars.size()-1);
		cars.remove(car);
		return car;
	}
	
	public car unloadFirstCar() {
		car car = cars.get(0);
		cars.remove(car);
		return car;
	}
}
