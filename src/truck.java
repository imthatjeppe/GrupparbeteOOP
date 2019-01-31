import javafx.scene.paint.Color;

public abstract class truck extends vehicle{
	
	/**
	 * Konstruktor för att skapa en båt
	 * @param c anger färgen båten ska ha
	 * @param ep anger motorns kraft
	 * @param m anger båtens modell
	 */
	public truck(Color c, int ep, String m) {
		super(c,ep,m);
	}

}
