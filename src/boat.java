import javafx.scene.paint.Color;

public abstract class boat extends vehicle{
	
	/**
	 * Konstruktor f�r att skapa en b�t
	 * @param c anger f�rgen b�ten ska ha
	 * @param ep anger motorns kraft
	 * @param m anger b�tens modell
	 */
	public boat(Color c, int ep, String m) {
		super(c,ep,m);
	}

}
