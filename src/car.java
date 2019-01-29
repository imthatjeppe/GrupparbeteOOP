import javafx.scene.paint.Color;

public abstract class car implements Movable{

	public double enginePower; // Engine power of the car
	public double currentSpeed; // The current speed of the car
	public Color color; // Color of the car
	public String modelName; // The car model name
	private int x = 0;
	private int y = 0;
	private int dir = 1;

	public car(Color c, double ep, String m) {
		color = c;
		enginePower = ep;
		modelName = m;
		currentSpeed = 0;
	}

	public double getEnginePower() {
		return enginePower;
	}

	public double getCurrentSpeed() {
		return currentSpeed;
	}

	public Color getColor() {
		return color;
	}

	public void startEngine() {
		currentSpeed = 0.1;
	}

	public void stopEngine() {
		currentSpeed = 0;
	}

	public abstract double speedFactor();

	public void incrementSpeed(double amount) {
		currentSpeed = getCurrentSpeed() + speedFactor() * amount;
	}

	public void decrementSpeed(double amount) {
		currentSpeed = getCurrentSpeed() - speedFactor() * amount;
	}

	public void gas(double amount) {
		incrementSpeed(amount);
	}

	public void brake(double amount) {
		decrementSpeed(amount);
	}
	@Override
	public void move() {
		switch(dir) {
			case 1 :
				y++;
				break;
	
			case 2 :
				x++;
				break;
			
			case 3 :
				y--;
				break;
			
			case 4 :
				x--;
				break;
		}
	}

	@Override
	public void turnleft() {
		if(dir == 1) {
			dir = 4;
		}
		else {
			dir--;
		}
	}

	@Override
	public void turnright() {
		if(dir == 4) {
			dir = 1;
		}
		else {
			dir++;
		}
	}
}
