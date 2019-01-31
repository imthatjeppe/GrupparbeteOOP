import javafx.scene.paint.Color;

public abstract class truck extends vehicle{
	
	/**
	 * Konstruktor f�r att skapa en b�t
	 * @param c anger f�rgen b�ten ska ha
	 * @param ep anger motorns kraft
	 * @param m anger b�tens modell
	 */
	
	private flatbed flatbed = new flatbed();
	
	public truck(Color c, int ep, String m) {
		super(c,ep,m);
	}
	
	/**
	 * H�jer flatbed och f�r�ndrar flatbed positivt
	 * @param amount Hur mycket det �ndras
	 */
	public void higherFlatbed(int amount){
		if(currentSpeed > 0) return;
		if(amount < 0) return;
		flatbed.flatbedAngle += amount;
		if(amount > 70){
			flatbed.flatbedAngle = 70;
		}
	}
	
	/**
	 * S�nker flatbed och f�r�ndrar flatbed negativt
	 * @param amount Hur mycket det �ndras
	 */
	public void lowerFlatbed(int amount){
		if(currentSpeed > 0) return;
		if(amount < 0) return;
		flatbed.flatbedAngle -= amount;
		if(amount < 0){
			flatbed.flatbedAngle = 0;
		}
	}
}
