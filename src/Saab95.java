import javafx.scene.paint.Color;

public class Saab95 extends car implements Movable{

	public boolean turboOn;

	public Saab95() {
		super(Color.BLACK, 125, "Saab95");
		stopEngine();
	}

	public void setTurboOn() {
		turboOn = true;
	}

	public void setTurboOff() {
		turboOn = false;
	}

	public double speedFactor() {
		double turbo = 1;
		if (turboOn)
			turbo = 1.3;
		return enginePower * 0.01 * turbo;
	}
}