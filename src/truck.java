import javafx.scene.paint.Color;

public abstract class truck extends vehicle{
	
	/**
	 * Konstruktor f�r att skapa en b�t
	 * @param c anger f�rgen b�ten ska ha
	 * @param ep anger motorns kraft
	 * @param m anger b�tens modell
	 */
	public truck(Color c, int ep, String m) {
		super(c,ep,m);
	}

}
