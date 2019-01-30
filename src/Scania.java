import javafx.scene.paint.Color;

public class Scania extends car{

	public int flatbedAngle = 0;

	/**
	 * Det �r en konstruktor f�r Scania lastbilar
	 * @param c lastbilens f�rg
	 * @param ep engine power
	 * @param m modell namn
	 */
	public Scania(Color c, double ep, String m) {
		super(Color.WHITE, 750, "Scania");
		stopEngine();
	}
	
	/**
	 * Returnernar hastighetsfaktorn f�r den individuella modellen.
	 */
	public double speedFactor() {
		return enginePower * 0.01;
	}

	/**
	 * H�jer flatbed och f�r�ndrar flatbed positivt
	 * @param amount Hur mycket det �ndras
	 */
	public void higherFlatbed(int amount){
		if(currentSpeed > 0) return;
		if(amount < 0) return;
		if(flatbedAngle + amount > 70){
			flatbedAngle = 70;
		}
		else{
			flatbedAngle += amount;
		}
	}
	
	/**
	 * S�nker flatbed och f�r�ndrar flatbed negativt
	 * @param amount Hur mycket det �ndras
	 */
	public void lowerFlatbed(int amount){
		if(currentSpeed > 0) return;
		if(amount < 0) return;
		if(flatbedAngle - amount < 0){
			flatbedAngle = 0;
		}
		else{
			flatbedAngle -= amount;
		}
	}
}
