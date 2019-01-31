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
	 * Konstruktor för att skapa en bil
	 * @param c anger färgen bilen ska ha
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
	 * getEnginePower returnerar enginePower för den angivna bilen
	 * @return double
	 */
	public double getEnginePower() {
		return enginePower;
	}
	
	/**
	 * getCurrentSpeed returnerar currentSpeed för den angivna bilen
	 * @return double
	 */
	public double getCurrentSpeed() {
		return currentSpeed;
	}
	
	/**
	 * getColor returnerar Color för den angivna bilen
	 * @return Color
	 */
	public Color getColor() {
		return color;
	}
	
	/**
	 * startEngine startar bilen och ger den en currentSpeed på 0.1
	 */
	public void startEngine() {
		currentSpeed = 0.1;
	}
	
	/**
	 * startEngine stoppar bilen och ger den en currentSpeed på 0
	 */
	public void stopEngine() {
		currentSpeed = 0;
	}
	
	public abstract double speedFactor();

	/**
	 * incrementSpeed ökar currentSpeed baserat på den individuella bilmodellens speedfactor och det angivna talet
	 * @param amount anger hur mycket currentSpeed ska öka
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
	 * incrementSpeed minskar currentSpeed baserat på den individuella bilmodellens speedfactor och det angivna talet
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
	 * Metoden kallar på incrementSpeed för att öka currentSpeed
	 * @param amount anger hur mycket som den ska öka med
	 */
	public void gas(double amount) {
		if(amount > 1 || amount < 0) return;
		incrementSpeed(amount);
	}
	
	/**
	 * Metoden kallar på decementSpeed för att minska currentSpeed
	 * @param amount anger hur mycket som den ska minska med
	 */
	public void brake(double amount) {
		if(amount > 1 || amount < 0) return;
		decrementSpeed(amount);
	}
	
	/**
	 * Metoden förflyttar bilens x & y koordinater beroende på dens riktning och currentSpeed
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
	 * Ändrar bilens riktning genom att minska variabeln dir med 1, om den är 1 börjar den om på 4
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
	 * Ändrar bilens riktning genom att öka variabeln dir med 1, om den är 4 börjar den om på 1
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
