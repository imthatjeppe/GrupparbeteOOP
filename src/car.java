import javafx.scene.paint.Color;

public abstract class car extends vehicle implements Movable{

	
	
	/**
	 * Konstruktor f�r att skapa en bil
	 * @param c anger f�rgen bilen ska ha
	 * @param ep anger motorns kraft
	 * @param m anger bilens modell
	 */
	public car(Color c, double ep, String m) {
		super(c, ep, m);
	}
	
}