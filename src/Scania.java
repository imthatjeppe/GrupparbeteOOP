import javafx.scene.paint.Color;

public class Scania extends car{

	public int flatbedAngle = 0;

	public Scania(Color c, double ep, String m) {
		super(Color.WHITE, 750, "Scania");
		stopEngine();
	}

	public double speedFactor() {
		return enginePower * 0.01;
	}

	public void higherFlatbed(int amount){
		if(currentSpeed > 0) return;
		if(amount < 0) return;
		if(flatbedAngle + amount > 70){
			flatbedAngle = 70;
		}
		else{
			flatbedAngle += amount;
		}
	}

	public void lowerFlatbed(int amount){
		if(currentSpeed > 0) return;
		if(amount < 0) return;
		if(flatbedAngle - amount < 0){
			flatbedAngle = 0;
		}
		else{
			flatbedAngle -= amount;
		}
	}
}
