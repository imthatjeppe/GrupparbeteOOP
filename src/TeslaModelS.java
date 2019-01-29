import javafx.scene.paint.Color;

public class TeslaModelS extends car{

	/**
	 * Konstruktorn specifik för bilmodellen Tesla Model S
	 */
	public TeslaModelS() {
		super(Color.BLACK, 150, "TeslaModelS");
		stopEngine();
	}

	/**
	 * Returnerar hastighetsfaktorn för den individuella bilmodellen
	 */
	public double speedFactor() {
		return enginePower * 0.01;
	}
}
