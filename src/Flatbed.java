
public class Flatbed {
	
	public int flatbedAngle = 0;
	
	/**
	 * H�jer flatbed och f�r�ndrar flatbed positivt
	 * @param amount Hur mycket det �ndras
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
	 * S�nker flatbed och f�r�ndrar flatbed negativt
	 * @param amount Hur mycket det �ndras
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
