package model;

public class Flatbed {
	
	public int flatbedAngle = 0;
	
	/**
	 * Höjer flatbed och förändrar flatbed positivt
	 * @param amount Hur mycket det ändras
	 */
	public void higherFlatbed(int amount, double currentSpeed){
		if(currentSpeed > 0) return;
		if(amount < 0) return;
		flatbedAngle += amount;
		if(amount > 70){
			flatbedAngle = 70;
		}
	}
	
	/**
	 * Sänker flatbed och förändrar flatbed negativt
	 * @param amount Hur mycket det ändras
	 */
	public void lowerFlatbed(int amount, double currentSpeed){
		if(currentSpeed > 0) return;
		if(amount < 0) return;
		flatbedAngle -= amount;
		if(amount < 0){
			flatbedAngle = 0;
		}
	}

	public static void flatbedSwitch(double speed) {
		if(flatbedAngle == 0) higherFlatbed(70, speed);
		else lowerFlatbed(70, speed);
	}
}
