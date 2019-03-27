package model;

import javafx.scene.paint.Color;

public class Scania extends Truck{

	/**
	 * Det �r en konstruktor f�r Scania lastbilar
	 * @param c lastbilens f�rg
	 * @param ep engine power
	 * @param m modell namn
	 */
	public Scania(Color c, Flatbed f) {
		super(c, 750, "Scania", f);
		stopEngine();
	}
	
	/**
	 * Returnernar hastighetsfaktorn f�r den individuella modellen.
	 */
	public double speedFactor() {
		return enginePower * 0.01;
	}
}
