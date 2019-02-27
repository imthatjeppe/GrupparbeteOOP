
public class Flatbed {
	
	public int flatbedAngle = 0;
	
	/**
	 * Höjer flatbed och förändrar flatbed positivt
	 * @param amount Hur mycket det ändras
	 */
	public void higherFlatbed(int amount, int currentSpeed){
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
	public void lowerFlatbed(int amount, int currentSpeed){
		if(currentSpeed > 0) return;
		if(amount < 0) return;
		flatbedAngle -= amount;
		if(amount < 0){
			flatbedAngle = 0;
		}
	}
}
