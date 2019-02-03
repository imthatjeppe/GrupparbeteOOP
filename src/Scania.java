import javafx.scene.paint.Color;

public class Scania extends truck{

	/**
	 * Det är en konstruktor för Scania lastbilar
	 * @param c lastbilens färg
	 * @param ep engine power
	 * @param m modell namn
	 */
	public Scania(Color c, flatbed f) {
		super(c, 750, "Scania", f);
		stopEngine();
	}
	
	/**
	 * Returnernar hastighetsfaktorn för den individuella modellen.
	 */
	public double speedFactor() {
		return enginePower * 0.01;
	}
}
