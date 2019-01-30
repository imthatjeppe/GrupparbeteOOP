import javafx.scene.paint.Color;

public class Scania extends car{

	public int flatbedAngle = 0;

	/**
	 * Det är en konstruktor för Scania lastbilar
	 * @param c lastbilens färg
	 * @param ep engine power
	 * @param m modell namn
	 */
	public Scania(Color c, double ep, String m) {
		super(Color.WHITE, 750, "Scania");
		stopEngine();
	}
	
	/**
	 * Returnernar hastighetsfaktorn för den individuella modellen.
	 */
	public double speedFactor() {
		return enginePower * 0.01;
	}

	/**
	 * Höjer flatbed och förändrar flatbed positivt
	 * @param amount Hur mycket det ändras
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
	 * Sänker flatbed och förändrar flatbed negativt
	 * @param amount Hur mycket det ändras
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
