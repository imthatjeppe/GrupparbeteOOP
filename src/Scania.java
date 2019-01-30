import javafx.scene.paint.Color;

public class Scania extends car{

	public Scania(Color c, double ep, String m) {
		super(Color.WHITE, 750, "Scania");
		stopEngine();
	}

	public double speedFactor() {
		return enginePower * 0.01;
	}
}
