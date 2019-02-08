import javafx.scene.paint.Color;

public abstract class trailer {
	
	private String modelname;
	private Color color;

	public trailer(Color c, String m) {
		modelname = m;
		color = c;
	}
	
	public Color getColor() {
		return this.color;
	}
	
	public String getModelName() {
		return this.modelname;
	}
}
