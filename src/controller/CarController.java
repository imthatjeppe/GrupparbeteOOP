package controller;

import javafx.animation.AnimationTimer;
import model.Vehicle;
import view.CarPane;

public class CarController {

	private Vehicle model;

	public CarController(CarPane cp) {
/**
 *  Detta är en konstruktor
 */
		AnimationTimer at = new AnimationTimer() {
			@Override
			public void handle(long now) {
				if (model != null) {
					model.move();
					cp.move(model.getX(), model.getY());
					cp.update();
				}
			}
		};
		at.start();
	}
	/**
	 * Här bestäms vilken modell som bilen är
	 * @param v
	 */
	public void setModel(Vehicle v) {
		model = v;
	}
	/**
	 *  Detta är en metod som gör att bilen kan gasa, genom knapar
	 */
	public void gas(double amount) {
		model.gas(amount);
	}
	/**
	 *  Detta är en metod som gör att bilen kan bromsa, genom knappar
	 */
	public void brake(double amount) {
		model.brake(amount);
	}

}
