package learning.java.core.sample1;

/**
 * @date 2024-01-16
 * @version 0.0.1
 * @author Lohith.Samaga
 *
 */
public class ArrayAddition {
	int a,b;
	
	public ArrayAddition() {
		
	}
	
	public Integer addIntegerArray(Integer[] numbers) {
		Integer sum = 0;
		
		if (numbers == null) {
			return sum;
		}
		
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		
		return sum;
	}

	public Double addDoubleArray(Double[] numbers) {
		Double sum = 0d;
		
		if (numbers == null) {
			return sum;
		}
		
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		
		return sum;
	}

}
