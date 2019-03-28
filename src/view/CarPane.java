package view;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class CarPane extends Pane {

	private ImageView volvoImage;
	private double xPos;
	private double yPos;
	

	private ImageView ScaniaImage;
	private double scaniaXPos;
	private double scaniaYPos;
	

	private ImageView Saab95Image;
	private double Saab95XPos;
	private double Saab95YPos;

	public CarPane() {
		volvoImage = new ImageView(new Image("/pics/Volvo740.jpg"));
		this.getChildren().add(volvoImage);
		
		ScaniaImage = new ImageView(new Image("/pics/Scania.jpg"));
		this.getChildren().add(ScaniaImage);
		scaniaYPos = 100;
		ScaniaImage.setTranslateY(scaniaYPos);

		Saab95Image = new ImageView(new Image("/pics/Saab95.jpg"));
		this.getChildren().add(Saab95Image);
		Saab95YPos = 200;
		Saab95Image.setTranslateY(Saab95YPos);
		
		
		
	}

	public void move(double x, double y) {
		xPos = x;
		yPos = y;
	}

	public void moveScania(double x, double y) {
		xPos = x;
		yPos = y;
	}

	public void moveSaab95(double x, double y) {
		xPos = x;
		yPos = y;
	}

	public void update() {
		volvoImage.setTranslateX(xPos);
		volvoImage.setTranslateY(yPos);
		ScaniaImage.setX(xPos);
		ScaniaImage.setTranslateY(scaniaYPos);
		Saab95Image.setX(xPos);
		Saab95Image.setTranslateY(Saab95YPos);
	}

}
