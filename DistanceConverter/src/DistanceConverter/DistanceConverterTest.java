package DistanceConverter;

import static org.junit.Assert.*;

import org.junit.Test;

public class DistanceConverterTest {
	/*	double feet, meters, inches, cm;

	@Test
	public void testConvertFeettoMeters() {
		feet = 1;
		meters = DistanceConverter.convertFeettoMeters(feet);
		assertEquals(meters, 0.3048, 0.001);
	}*/
		double feet, meters, inches, cm;

	@Test
	public void testConvertFeettoMeters() {
		feet = 1;
		meters = DistanceConverter.convertFeettoMeters(feet);
		assertEquals(meters, 0.3048, 0.001);
	}
	/*	public static double convertMeterstoFeet(double meters){
		return meters * 3.2808;
	}*/

	@Test
	public void testConvertMeterstoFeet() {
		meters = 1;
		feet = 1;
		fail("Not yet implemented");
	}

	@Test
	public void testConvertFeettoInches() {
		fail("Not yet implemented");
	}

	@Test
	public void testConvertInchestoFeet() {
		fail("Not yet implemented");
	}

	@Test
	public void testConvertCmtoFeet() {
		fail("Not yet implemented");
	}

	@Test
	public void testConvertFeettoCm() {
		fail("Not yet implemented");
	}

	@Test
	public void testConvertCmtoInches() {
		fail("Not yet implemented");
	}

	@Test
	public void testConvertInchestoCm() {
		fail("Not yet implemented");
	}

}
