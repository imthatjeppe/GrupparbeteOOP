import javafx.scene.paint.Color;

public abstract class truck extends vehicle{
	
	private flatbed flatbed = null;
	private trailer trailer = null;
	
	/**
	 * Konstruktor f�r att skapa en truck
	 * @param c anger f�rgen trucken ska ha
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
	/**
	 * Detta beskriver om lastbilen har ett sl�p
	 * @return Den returnerar en boolean
	 */
	public boolean hasTrailer() {
		return trailer != null;
	}
	
	/**
	 * Kollar om lastbilen �r en flatbed
	 * @return Den returnerar en boolean
	 */
	public boolean isFlatbedTruck() {
		return flatbed != null;
	}
	
	/**
	 * Den kopplar p� en trailer till lastbilen.
	 * @param Man skickar med en trailer
	 */
	public void connectTrailer(trailer t) {
		trailer = t;
	}
	
	/**
	 * Den kopplar av en trailer ifr�n lastbilen.
	 */
	public void disconnectTrailer() {
		trailer = null;
	}
}
