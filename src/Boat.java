import javafx.scene.paint.Color;

public abstract class Boat extends Vehicle{
	
	/**
	 * Konstruktor för att skapa en båt
	 * @param c anger färgen båten ska ha
	 * @param ep anger motorns kraft
	 * @param m anger båtens modell
	 */
	public Boat(Color c, int ep, String m) {
		super(c,ep,m);
	}
}
