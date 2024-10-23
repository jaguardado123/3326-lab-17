import static org.junit.Assert.*;
import org.junit.Test;
import dealership.*;

public class MainTest {
	
	@Test
	public void testing_Car() {
		Car car = new Car("Toyota", "Camry", 2000);
		assertEquals("Toyota", car.make);
		assertEquals("Camry", car.model);
		assertEquals(2000, car.year);
	}

	@Test
	public void testing_RV() {
		RV rv = new RV("Forest River", 2010, 20.5f);
		assertEquals("Forest River", rv.make);
		assertEquals(2010, rv.year);
		assertEquals(true, rv.size == 20.5f);
	}
	@Test
	public void testing_Trailer() {
		Trailer trailer = new Trailer("Felling", 30.2f, 9000.0f);
		assertEquals("Felling", trailer.make);
		assertEquals(true, trailer.size == 30.2f);
		assertEquals(true, trailer.weight_capacity == 9000.0f);
	}
}