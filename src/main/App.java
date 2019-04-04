package main;

import controller.CarController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import model.CarModel;
import model.Flatbed;
import model.Saab95;
import model.Scania;
import model.Vehicle;
import model.Volvo740;
import view.ButtonBox;
import view.CarPane;

public class App extends Application {

	private final static double WIDTH = 1200;
	private final static double HEIGHT = 700;

	@Override
	public void start(Stage primaryStage) throws Exception {

		CarModel cm = new CarModel();

		Vehicle volvo = new Volvo740(Color.RED);
		Vehicle saab = new Saab95(Color.RED);
		saab.setY(100);
		Vehicle scania = new Scania(Color.RED, new Flatbed());
		scania.setY(200);

		cm.addVehicle(volvo);
		cm.addVehicle(saab);
		cm.addVehicle(scania);

		CarPane cp = new CarPane(cm);

		CarController cc = new CarController(cp, cm);

		ButtonBox cbp = new ButtonBox(cc);

		BorderPane root = new BorderPane();

		root.setTop(cp);
		root.setBottom(cbp);

		Scene scene = new Scene(root, WIDTH, HEIGHT, Color.SKYBLUE);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Car Simulator");
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch();
	}

}
