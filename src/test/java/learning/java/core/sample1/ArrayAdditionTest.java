package learning.java.core.sample1;

import java.time.LocalDateTime;

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
		Assertions.assertEquals(a.addArray(null), Integer.valueOf(0));
	}

	@DisplayName("Test Integer Array Addition with values")
	@Test
	public void test02() {
		a = new ArrayAddition();
		Assertions.assertEquals(a.addArray(new Integer[] {1,2,3}), Integer.valueOf(6));
	}

}