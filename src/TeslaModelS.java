import javafx.scene.paint.Color;

public class TeslaModelS extends car{

	/**
	 * Konstruktorn specifik f�r bilmodellen Tesla Model S
	 */
	public TeslaModelS() {
		super(Color.BLACK, 150, "TeslaModelS");
		stopEngine();
	}

	/**
	 * Returnerar hastighetsfaktorn f�r den individuella bilmodellen
	 */
	public double speedFactor() {
		return enginePower * 0.01;
	}
}