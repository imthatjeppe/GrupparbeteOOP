import javafx.scene.paint.Color;

public class Beetle extends car{

	/**
	 * Konstruktorn specifik f�r bilmodellen VW Beetle
	 */
	public Beetle(Color c) {
		super(c, 75, "Beetle");
		stopEngine();
	}

	/**
	 * Returnerar hastighetsfaktorn f�r den individuella bilmodellen
	 */
	public double speedFactor() {
		return enginePower * 0.01;
	}
}
