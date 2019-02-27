import javafx.scene.paint.Color;

public abstract class Trailer extends GameObject{
	
	private Color color;

	public Trailer(Color c, String m) {
		super(m);
		color = c;
	}
	
	public Color getColor() {
		return this.color;
	}

	public void updatePosition(double x, double y) {
		setX(x);
		setY(y);
	}
}
