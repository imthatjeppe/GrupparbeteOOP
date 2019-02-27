
public abstract class GameObject {
	
	protected double x = 0;
	protected double y = 0;
	protected String modelName; // The car model name
	
	public GameObject(String m) {
		modelName = m;
	}
	
	/**
	 * Returnerar x
	 * @return double
	 */
	public double getX() {
		return x;
	}
	
	/**
	 * Returnerar y
	 * @return double
	 */
	public double getY() {
		return y;
	}
	
	public void setX(double d) {
		x = d;
	}
	
	public void setY(double d) {
		x = d;
	}
	
	/**
	 * Returnerar modellnamnet
	 * @return String
	 */
	public String getModelName() {
		return modelName;
	}
}
