package controller;

import javafx.animation.AnimationTimer;
import model.CarModel;
import model.Vehicle;
import view.CarPane;

public class CarController {

	private CarModel model;

/**
 *  Detta är en konstruktor
 */
	public CarController(CarPane cp, CarModel cm) {
		this.model = cm;

		AnimationTimer at = new AnimationTimer() {
			@Override
			public void handle(long now) {
				if (model != null) {
					model.moveAll();
					checkCollision();
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
		model.gasAll(amount);
	}
	/**
	 *  Detta är en metod som gör att bilen kan bromsa, genom knappar
	 */
	public void brake(double amount) {
		model.brakeAll(amount);
	}

	private void checkCollision() {
		for (Vehicle v : model.getVehicles()) {
			if (v.getX() > 1100 || v.getX() < 0) {				
				v.turnleft();
				v.turnleft();
				v.move();
				v.stopEngine();
			}
		}
	}
}
