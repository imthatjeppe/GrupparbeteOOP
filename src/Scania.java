import javafx.scene.paint.Color;

public class Scania extends truck{

	/**
	 * Det �r en konstruktor f�r Scania lastbilar
	 * @param c lastbilens f�rg
	 * @param ep engine power
	 * @param m modell namn
	 */
	public Scania(Color c, Boolean b) {
		super(c, 750, "Scania", b);
		stopEngine();
	}
	
	/**
	 * Returnernar hastighetsfaktorn f�r den individuella modellen.
	 */
	public double speedFactor() {
		return enginePower * 0.01;
	}
}
