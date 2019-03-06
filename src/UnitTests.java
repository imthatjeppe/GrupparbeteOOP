import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import javafx.scene.paint.Color;

public class UnitTests {

	@Test
	public void Tests() {

		Volvo740 hej = new Volvo740(Color.BLACK);

		assertEquals(1.25, hej.speedFactor(), "Fel speedFactor!");
		
		assertEquals(100, hej.getEnginePower(), "Fel EnginePower!");
		
		hej.gas(1);
		
		assertEquals(1.25, hej.getCurrentSpeed(), "Fel CurrentSpeed!");
		
		hej.brake(1);
		
		assertEquals(0, hej.getCurrentSpeed(), "Fel CurrentSpeed!");
		
		hej.move();
		
		assertEquals(0, hej.getY(), "Fel Y");
		assertEquals(0, hej.getX(), "Fel X");
		
		hej.gas(1);
		hej.move();
		
		assertEquals(1.25, hej.getY(), "Fel Y");
		assertEquals(0, hej.getX(), "Fel X");
		
		hej.resetPosition();
		assertEquals(0, hej.getY(), "Fel Y");
		assertEquals(0, hej.getX(), "Fel X");
		
		hej.turnright();
		hej.move();
		
		assertEquals(0, hej.getY(), "Fel Y");
		assertEquals(1.25, hej.getX(), "Fel X");
		
		hej.resetPosition();
		assertEquals(0, hej.getY(), "Fel Y");
		assertEquals(0, hej.getX(), "Fel X");
		
		hej.turnright();
		hej.move();
		
		assertEquals(-1.25, hej.getY(), "Fel Y");
		assertEquals(0, hej.getX(), "Fel X");
		
		hej.resetPosition();
		assertEquals(0, hej.getY(), "Fel Y");
		assertEquals(0, hej.getX(), "Fel X");
		
		hej.turnright();
		hej.move();
		
		assertEquals(0, hej.getY(), "Fel Y");
		assertEquals(-1.25, hej.getX(), "Fel X");
		
		hej.resetPosition();
		assertEquals(0, hej.getY(), "Fel Y");
		assertEquals(0, hej.getX(), "Fel X");
		
		hej.turnleft();
		hej.move();
		
		assertEquals(-1.25, hej.getY(), "Fel Y");
		assertEquals(0, hej.getX(), "Fel X");
	}
}
