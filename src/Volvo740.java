import javafx.scene.paint.Color;

public class Volvo740 extends car implements Movable{

	public final static double trimFactor = 1.25;

	public double enginePower; // Engine power of the car
	public double currentSpeed; // The current speed of the car
	public Color color; // Color of the car
	public String modelName; // The car model name

	public Volvo740() {
		super(Color.RED, 100, "Volvo740");
		stopEngine();
	}

	public double speedFactor() {
		return enginePower * 0.01 * trimFactor;
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