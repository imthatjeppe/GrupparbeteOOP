import javafx.scene.paint.Color;

public class Saab95 extends car{

	public boolean turboOn;

	/**
	 * Konstruktorn specifik för bilmodellen Saab95
	 */
	public Saab95(Color c) {
		super(c, 125, "Saab95");
		stopEngine();
	}

	/**
	 * Ändrar boolean-variabeln turboOn till true
	 */
	public void setTurboOn() {
		turboOn = true;
	}
	
	/**
	 * Ändrar boolean-variabeln turboOn till false
	 */
	public void setTurboOff() {
		turboOn = false;
	}

	/**
	 * Returnerar hastighetsfaktorn för den individuella bilmodellen
	 */
	public double speedFactor() {
		double turbo = 1;
		if (turboOn)
			turbo = 1.3;
		return enginePower * 0.01 * turbo;
	}
}