package model;

import javafx.scene.paint.Color;

public abstract class Truck extends Vehicle {

	private Flatbed flatbed = null;
	private Trailer trailer = null;

	/**
	 * Konstruktor för att skapa en truck
	 * 
	 * @param c  anger färgen trucken ska ha
	 * @param ep anger motorns kraft
	 * @param m  anger truckens modell
	 */
	public Truck(Color c, int ep, String m, Flatbed f) {
		super(c, ep, m);

		if (f != null) {
			flatbed = f;
		}
	}

	@Override
	public void gas(double amount) {
		if (flatbed.flatbedAngle != 0)
			return;
		if (amount > 1 || amount < 0)
			return;
		incrementSpeed(amount);
	}

	/**
	 * Detta beskriver om lastbilen har ett släp
	 * 
	 * @return Den returnerar en boolean
	 */
	public boolean hasTrailer() {
		return trailer != null;
	}

	public Trailer getTrailer() {
		return trailer;
	}
	
	/**
	 * Kollar om lastbilen är en flatbed
	 * 
	 * @return Den returnerar en boolean
	 */
	public boolean isFlatbedTruck() {
		return flatbed != null;
	}

	/**
	 * Den kopplar på en trailer till lastbilen.
	 * 
	 * @param Man skickar med en trailer
	 */
	public void connectTrailer(Trailer t) {
		trailer = t;
	}

	/**
	 * Den kopplar av en trailer ifrån lastbilen.
	 */
	public void disconnectTrailer() {
		trailer = null;
	}

	@Override
	public void move() {
		super.move();
		if(hasTrailer()) {
			trailer.updatePosition(getX(), getY());
		}
	}
}
