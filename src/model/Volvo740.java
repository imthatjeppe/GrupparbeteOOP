package model;

import javafx.scene.paint.Color;

public class Volvo740 extends Car{

	public final static double trimFactor = 1.25;

	/**
	 * Konstruktorn specifik för bilmodellen Volvo740
	 */
	public Volvo740(Color c) {
		super(c, 100, "Volvo740");
		stopEngine();
	}

	/**
	 * Returnerar hastighetsfaktorn för den individuella bilmodellen
	 */
	public double speedFactor() {
		return enginePower * 0.01 * trimFactor;
	}	
}