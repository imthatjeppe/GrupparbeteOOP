package controller;

import javafx.animation.AnimationTimer;
import model.Vehicle;
import view.CarPane;

public class CarController {

	private Vehicle model;

	public CarController(CarPane cp) {
/**
 *  Detta �r en konstruktor
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
	 * H�r best�ms vilken modell som bilen �r
	 * @param v
	 */
	public void setModel(Vehicle v) {
		model = v;
	}
	/**
	 *  Detta �r en metod som g�r att bilen kan gasa, genom knapar
	 */
	public void gas(double amount) {
		model.gas(amount);
	}
	/**
	 *  Detta �r en metod som g�r att bilen kan bromsa, genom knappar
	 */
	public void brake(double amount) {
		model.brake(amount);
	}

}
