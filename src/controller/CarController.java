package controller;

import javafx.animation.AnimationTimer;
import model.Vehicle;
import view.CarPane;

public class CarController {

	private Vehicle model;

	public CarController(CarPane cp) {

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

	public void setModel(Vehicle v) {
		model = v;
	}

	public void gas(double amount) {
		model.gas(amount);
	}

	public void brake(double amount) {
		model.brake(amount);
	}

}
