import javafx.scene.paint.Color;

public class Saab95 extends car implements Movable{

	public boolean turboOn;

	public double enginePower; // Engine power of the car
	public double currentSpeed; // The current speed of the car
	public Color color; // Color of the car
	public String modelName; // The car model name

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

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void turnleft() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void turnright() {
		// TODO Auto-generated method stub
		
	}
}