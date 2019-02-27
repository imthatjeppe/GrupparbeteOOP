import javafx.scene.paint.Color;

public abstract class Car extends Vehicle{

	/**
	 * Konstruktor f�r att skapa en bil
	 * @param c anger f�rgen bilen ska ha
	 * @param ep anger motorns kraft
	 * @param m anger bilens modell
	 */
	public Car(Color c, double ep, String m) {
		super(c, ep, m);
	}
}