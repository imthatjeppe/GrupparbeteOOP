
import javafx.scene.paint.Color;

public class cartransporttrailer extends trailer {

	public cartransporttrailer(Color c) {
		super(c, "cartransporttrailer");
	}
	
	private carLoaderDelegate carLoader;
	
	public void loadCar(car c) {
		carLoader.loadCar(c);
	}
	
	public car unloadCar() {
		return carLoader.unloadLastCar();
	}	
}
