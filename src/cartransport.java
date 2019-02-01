import javafx.scene.paint.Color;

public class cartransport extends truck {

	public cartransport(Color c) {
		super(c, 750, "cartransport", false);
		stopEngine();
	}

	public double speedFactor() {
		return enginePower * 0.01;
	}

}
