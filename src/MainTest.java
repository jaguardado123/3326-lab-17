import static org.junit.Assert.*;
import org.junit.Test;
import tools.MyMath;

public class MainTest {
	
	@Test
	public void testing_sum_as_static() {
		assertEquals(8, MyMath.sum(3,5));
	}

	@Test
	public void testing_sum_as_static2() {
		assertEquals(10, MyMath.sum(4,6));
	}

	@Test
	public void testing_product_as_static() {
		assertEquals(15, MyMath.sum(3,5));
	}

	@Test
	public void testing_product_as_static2() {
		assertEquals(24, MyMath.sum(4,6));
	}
}