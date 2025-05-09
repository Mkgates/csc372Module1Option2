package csc372Module8Option2PP;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VehicleTest {

    @Test
    public void testConstructorAndGetters() {
        Vehicle v = new Vehicle("Toyota", "Corolla", 32.5);

        assertEquals("Toyota", v.getMake());
        assertEquals("Corolla", v.getModel());
        assertEquals(32.5, v.getMpg(), 0.001);
    }

    @Test
    public void testToStringFormat() {
        Vehicle v = new Vehicle("Honda", "Civic", 40.0);
        String expected = "Honda Civic - MPG: 40.0";
        assertEquals(expected, v.toString());
    }

    @Test
    public void testNegativeMPG() {
        Vehicle v = new Vehicle("Test", "Invalid", -10.0);
        assertEquals(-10.0, v.getMpg(), 0.001); // May want to add validation later
    }

	@Test
	public void testInvalidMPGThrowsException() {
		Exception exception = assertThrows(IllegalArgumentException.class, () -> {
			new Vehicle("Test", "Car", 0);
    });
    assertEquals("Miles per gallon must be greater than zero.", exception.getMessage());
	}
	
}

