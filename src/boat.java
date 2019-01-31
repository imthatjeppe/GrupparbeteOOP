import javafx.scene.paint.Color;

public abstract class boat extends vehicle{
	
	/**
	 * Konstruktor för att skapa en båt
	 * @param c anger färgen båten ska ha
	 * @param ep anger motorns kraft
	 * @param m anger båtens modell
	 */
	public boat(Color c, int ep, String m) {
		super(c,ep,m);
	}

}
