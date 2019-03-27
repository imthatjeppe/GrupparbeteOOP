package model;

import javafx.scene.paint.Color;

public abstract class Trailer extends GameObject{
	
	private Color color;
	/**
	 * konstruktor f�r trailer
	 * @param c F�rg p� trailer
	 * @param m modelnamnet
	 */
	public Trailer(Color c, String m) {
		super(m);
		color = c;
	}
	/**
	 * H�mtar f�rgen
	 * @return returnar f�rgen
	 */
	public Color getColor() {
		return this.color;
	}
}
