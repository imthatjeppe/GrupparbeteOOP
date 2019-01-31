import javafx.scene.paint.Color;

public abstract class car implements Movable{

	protected double enginePower; // Engine power of the car
	protected double currentSpeed; // The current speed of the car
	private Color color; // Color of the car
	private String modelName; // The car model name
	private int x = 0;
	private int y = 0;
	private int dir = 1;
	
	/**
	 * Konstruktor f�r att skapa en bil
	 * @param c anger f�rgen bilen ska ha
	 * @param ep anger motorns kraft
	 * @param m anger bilens modell
	 */
	public car(Color c, double ep, String m) {
		color = c;
		enginePower = ep;
		modelName = m;
		currentSpeed = 0;
	}
	
	/**
	 * getEnginePower returnerar enginePower f�r den angivna bilen
	 * @return double
	 */
	public double getEnginePower() {
		return enginePower;
	}
	
	/**
	 * getCurrentSpeed returnerar currentSpeed f�r den angivna bilen
	 * @return double
	 */
	public double getCurrentSpeed() {
		return currentSpeed;
	}
	
	/**
	 * getColor returnerar Color f�r den angivna bilen
	 * @return Color
	 */
	public Color getColor() {
		return color;
	}
	
	/**
	 * startEngine startar bilen och ger den en currentSpeed p� 0.1
	 */
	public void startEngine() {
		currentSpeed = 0.1;
	}
	
	/**
	 * startEngine stoppar bilen och ger den en currentSpeed p� 0
	 */
	public void stopEngine() {
		currentSpeed = 0;
	}
	
	public abstract double speedFactor();

	/**
	 * incrementSpeed �kar currentSpeed baserat p� den individuella bilmodellens speedfactor och det angivna talet
	 * @param amount anger hur mycket currentSpeed ska �ka
	 */
	public void incrementSpeed(double amount) {
		if(currentSpeed + amount > enginePower) {
			currentSpeed = enginePower;
		}
		else {
			currentSpeed = getCurrentSpeed() + speedFactor() * amount;
		}
	}
	
	/**
	 * incrementSpeed minskar currentSpeed baserat p� den individuella bilmodellens speedfactor och det angivna talet
	 * @param amount anger hur mycket currentSpeed ska minska
	 */
	public void decrementSpeed(double amount) {
		if(currentSpeed + amount < 0) {
			currentSpeed = 0;
		}
		else {
			currentSpeed = getCurrentSpeed() - speedFactor() * amount;
		}
	}
	
	/**
	 * Metoden kallar p� incrementSpeed f�r att �ka currentSpeed
	 * @param amount anger hur mycket som den ska �ka med
	 */
	public void gas(double amount) {
		if(amount > 1 || amount < 0) return;
		incrementSpeed(amount);
	}
	
	/**
	 * Metoden kallar p� decementSpeed f�r att minska currentSpeed
	 * @param amount anger hur mycket som den ska minska med
	 */
	public void brake(double amount) {
		if(amount > 1 || amount < 0) return;
		decrementSpeed(amount);
	}
	
	/**
	 * Metoden f�rflyttar bilens x & y koordinater beroende p� dens riktning och currentSpeed
	 */
	public void move() {
		switch(dir) {
		case 1 :
			y += currentSpeed;
			break;

		case 2 :
			x += currentSpeed;
			break;

		case 3 :
			y -= currentSpeed;
			break;

		case 4 :
			x -= currentSpeed;
			break;
		}
	}
	
	/**
	 * �ndrar bilens riktning genom att minska variabeln dir med 1, om den �r 1 b�rjar den om p� 4
	 */
	public void turnleft() {
		if(dir == 1) {
			dir = 4;
		}
		else {
			dir--;
		}
	}
	
	/**
	 * �ndrar bilens riktning genom att �ka variabeln dir med 1, om den �r 4 b�rjar den om p� 1
	 */
	public void turnright() {
		if(dir == 4) {
			dir = 1;
		}
		else {
			dir++;
		}
	}
}
