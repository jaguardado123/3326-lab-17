import static org.junit.Assert.*;
import org.junit.Test;

public class DealershipTest {
	
	@Test
	public void testing_Car() {
		Car car = new Car("Toyota", "Tundra", 2010, 6, 500);

		assertEquals("Toyota", car.make);
		assertEquals("Tundra", car.model);
		assertEquals(2010, car.year);
	}

	@Test
	public void testing_Owner() {
		Car car = new Car("Totyota", "Tundra", 2010, 6, 500);
        Owner own = new Owner("Bob Bobbert", 1234567, "123 Sesame St.", car);

		assertEquals("Bob Bobbert", own.name);
		assertEquals(1234567, own.phone_number);
		assertEquals("123 Sesame St.", own.address);
	}
	@Test
	public void testing_Engine() {
		Engine engine = new Engine(6, 500);

		assertEquals(6, engine.cylinders);
		assertEquals(500, engine.horsepower);
	}
}