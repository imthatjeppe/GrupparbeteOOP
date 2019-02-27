import javafx.scene.paint.Color;

public class Beetle extends Car{

	/**
	 * Konstruktorn specifik för bilmodellen VW Beetle
	 */
	public Beetle(Color c) {
		super(c, 75, "Beetle");
		stopEngine();
	}

	/**
	 * Returnerar hastighetsfaktorn för den individuella bilmodellen
	 */
	public double speedFactor() {
		return enginePower * 0.01;
	}
}
