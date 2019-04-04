package controller;

import javafx.animation.AnimationTimer;
import model.CarModel;
import model.Vehicle;
import view.CarPane;

public class CarController {

	private CarModel model;

/**
 *  Detta �r en konstruktor
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
		model.gasAll(amount);
	}
	/**
	 *  Detta �r en metod som g�r att bilen kan bromsa, genom knappar
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
