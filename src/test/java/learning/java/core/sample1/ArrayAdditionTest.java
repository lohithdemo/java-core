package learning.java.core.sample1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ArrayAdditionTest {
	private ArrayAddition a;

	
	@BeforeAll
	public void initialize() {

	}

	@DisplayName("Test Integer Array Addition with null")
	@Test
	public void test01() {
		a = new ArrayAddition();
		Assertions.assertEquals(a.addIntegerArray(null), Integer.valueOf(0));
	}

	@DisplayName("Test Integer Array Addition with values")
	@Test
	public void test02() {
		a = new ArrayAddition();
		Assertions.assertEquals(a.addIntegerArray(new Integer[] {1,2,3}), 6);
	}
	
	@DisplayName("Test Double Array Addition with values")
	@Test
	public void test03() {
		a = new ArrayAddition();
		Assertions.assertEquals(a.addDoubleArray(new Double[] {1d,2d,3d}), 6d);
	}

}