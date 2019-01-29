import javafx.scene.paint.Color;

public class Saab95 extends car implements Movable{

	public boolean turboOn;

	/**
	 * Konstruktorn specifik f�r bilmodellen Saab95
	 */
	public Saab95() {
		super(Color.BLACK, 125, "Saab95");
		stopEngine();
	}

	/**
	 * �ndrar boolean-variabeln turboOn till true
	 */
	public void setTurboOn() {
		turboOn = true;
	}
	
	/**
	 * �ndrar boolean-variabeln turboOn till false
	 */
	public void setTurboOff() {
		turboOn = false;
	}

	/**
	 * Returnerar hastighetsfaktorn f�r den individuella bilmodellen
	 */
	public double speedFactor() {
		double turbo = 1;
		if (turboOn)
			turbo = 1.3;
		return enginePower * 0.01 * turbo;
	}
}