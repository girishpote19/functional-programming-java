package FunctionalProgramming;

import java.util.Arrays;
import java.util.List;

public class FP01OddNumbers {

	public static void main(String args[]) {
		// print only the odd numbers from the list

		List<Integer> numbers = Arrays.asList(1, 3, 2, 7, 12, 19, 17, 26);

		oddNumbersFromList(numbers);

	}

	private static void oddNumbersFromList(List<Integer> numbers) {
		numbers.stream().filter(n -> n % 2 != 0).forEach(System.out::println);

	}

}
