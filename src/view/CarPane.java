package view;

import java.util.ArrayList;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.transform.Rotate;
import model.CarModel;
import model.Vehicle;

public class CarPane extends Pane {

	private ArrayList<ImageView> images;

	private CarModel model;

	public CarPane(CarModel cm) {
		model = cm;
		images = new ArrayList<ImageView>();
	}

	public void addNewVolvo() {
		ImageView volvoImage = new ImageView(new Image("/pics/Volvo740.jpg"));
		this.getChildren().add(volvoImage);
		images.add(volvoImage);
	}

	public void addNewSaab() {
		ImageView saabImage = new ImageView(new Image("/pics/Saab95.jpg"));
		this.getChildren().add(saabImage);
		images.add(saabImage);
	}

	public void addNewScania() {
		ImageView scaniaImage = new ImageView(new Image("/pics/Scania.jpg"));
		this.getChildren().add(scaniaImage);
		images.add(scaniaImage);
	}

	public void update() {
		for (int i = 0; i < model.getVehicles().size(); i++) {
			Vehicle v = model.getVehicles().get(i);

			if (i > images.size() - 1) {
				System.out.println(v.getModelName());
				System.out.println(model.getVehicles());
				addNewImage(v.getModelName());
			}

			ImageView img = images.get(i);
			img.setTranslateX(v.getX());
			img.setTranslateY(v.getY());
			if(v.getDir() == 2) {
				img.setScaleX(1);				
			}
			if(v.getDir() == 4) {
				img.setScaleX(-1);				
			}
		}

	}

	private void addNewImage(String modelName) {
		if (modelName.equals("Volvo740")) {
			addNewVolvo();
		}
		if (modelName.equals("Saab95")) {
			addNewSaab();
		}
		if (modelName.equals("Scania")) {
			addNewScania();
		}
	}

}
