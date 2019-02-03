import javafx.scene.paint.Color;

public abstract class truck extends vehicle{
	
	private flatbed flatbed = null;
	private trailer trailer = null;
	
	/**
	 * Konstruktor för att skapa en truck
	 * @param c anger färgen trucken ska ha
	 * @param ep anger motorns kraft
	 * @param m anger truckens modell
	 */
	public truck(Color c, int ep, String m, flatbed f) {
		super(c,ep,m);
		
		if(f != null) {
			flatbed = f;
		}
	}
	
	@Override
	public void gas(double amount) {
		if(flatbed.flatbedAngle != 0) return;
		if(amount > 1 || amount < 0) return;
		incrementSpeed(amount);
	}
	
	public boolean hasTrailer() {
		return trailer != null;
	}
	
	public boolean isFlatbedTruck() {
		return flatbed != null;
	}
	
	public void connectTrailer(trailer t) {
		trailer = t;
	}
	
	public void disconnectTrailer() {
		trailer = null;
	}
}
