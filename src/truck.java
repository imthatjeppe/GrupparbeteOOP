import javafx.scene.paint.Color;

public abstract class truck extends vehicle{
	
	private boolean isFlatbedTruck;
	private flatbed flatbed;
	
	private trailer trailer;
	
	/**
	 * Konstruktor för att skapa en truck
	 * @param c anger färgen trucken ska ha
	 * @param ep anger motorns kraft
	 * @param m anger truckens modell
	 */
	public truck(Color c, int ep, String m, Boolean b) {
		super(c,ep,m);
		isFlatbedTruck = b;
	}
	
	@Override
	public void gas(double amount) {
		if(flatbed.flatbedAngle != 0) return;
		if(amount > 1 || amount < 0) return;
		incrementSpeed(amount);
	}
	
	public void addTrailer() {
		trailer = new trailer();
	}
	
	public void removeTrailer() {
		trailer = null;
	}
	
	public void addFlatbed() {
		flatbed = new flatbed();
	}
	
	public void removeFlatbed() {
		flatbed = null;
	}
}
