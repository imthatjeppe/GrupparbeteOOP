package model;

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
		y = d;
	}
	
	/**
	 * Uppdaterar position på trailern
	 * @param x  x koordinaten
	 * @param y  y koordinaten
	 */
	public void updatePosition(double x, double y) {
		this.setX(x);
		this.setY(y);
	}
	
	public void resetPosition() {
		this.setX(0);
		this.setY(0);
	}
	
	/**
	 * Returnerar modellnamnet
	 * @return String
	 */
	public String getModelName() {
		return modelName;
	}
}
