import javafx.scene.paint.Color;

public abstract class Trailer extends GameObject{
	
	private Color color;
	/**
	 * konstruktor för trailer
	 * @param c Färg på trailer
	 * @param m modelnamnet
	 */
	public Trailer(Color c, String m) {
		super(m);
		color = c;
	}
	/**
	 * Hämtar färgen
	 * @return returnar färgen
	 */
	public Color getColor() {
		return this.color;
	}
	/**
	 * Uppdaterar position på trailern
	 * @param x  x koordinatern
	 * @param y  y koordinatern
	 */
	public void updatePosition(double x, double y) {
		setX(x);
		setY(y);
	}
}
