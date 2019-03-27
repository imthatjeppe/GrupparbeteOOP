package model;

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
		
		hej.startEngine();
		assertEquals(0.1, hej.getCurrentSpeed(), "Startar inte");
		
	    assertEquals(Color.BLACK, hej.getColor(), "Color");
	    
	    assertEquals(100, hej.getEnginePower(), "EnginePower");
	    
	    Scania sca = new Scania(Color.WHITE, new Flatbed());
	    
	    assertEquals(true, sca.isFlatbedTruck(), "is flatbed");
	    
	    sca.connectTrailer(new CarTransportTrailer(Color.PINK));
	    
	    assertEquals(true, sca.hasTrailer(), "har trailer");
	    
	    assertEquals(Color.PINK , sca.getTrailer().getColor(), "färgen på släpet");
	    
	    sca.getTrailer().updatePosition(10, 10);
	    
	    assertEquals(10, sca.getTrailer().getX(), "släpets x position");
	    
	    assertEquals(10, sca.getTrailer().getY(), "släpets y position");
	    
	    ((CarTransportTrailer) sca.getTrailer()).loadCar(new Saab95(Color.ORANGE));
	    
	    ((CarTransportTrailer) sca.getTrailer()).unloadCar();
	    
	    sca.disconnectTrailer();
	    
	    assertEquals(false, sca.hasTrailer(), "har trailer");
	    
	    assertEquals(7.5, sca.speedFactor(), "speedfactor scania");
	    
	}
}
