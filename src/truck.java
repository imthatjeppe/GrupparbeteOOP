import javafx.scene.paint.Color;

public abstract class truck extends vehicle{
	
	/**
	 * Konstruktor för att skapa en båt
	 * @param c anger färgen båten ska ha
	 * @param ep anger motorns kraft
	 * @param m anger båtens modell
	 */
	
	private flatbed flatbed = new flatbed();
	
	public truck(Color c, int ep, String m) {
		super(c,ep,m);
	}
	
	/**
	 * Höjer flatbed och förändrar flatbed positivt
	 * @param amount Hur mycket det ändras
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
	 * Sänker flatbed och förändrar flatbed negativt
	 * @param amount Hur mycket det ändras
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
