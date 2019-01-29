import javafx.scene.paint.Color;

public class Volvo740 extends car{

	public final static double trimFactor = 1.25;

	/**
	 * Konstruktorn specifik f�r bilmodellen Volvo740
	 */
	public Volvo740() {
		super(Color.RED, 100, "Volvo740");
		stopEngine();
	}

	/**
	 * Returnerar hastighetsfaktorn f�r den individuella bilmodellen
	 */
	public double speedFactor() {
		return enginePower * 0.01 * trimFactor;
	}	
}