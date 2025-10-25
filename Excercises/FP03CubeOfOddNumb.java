package FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FP03CubeOfOddNumb {

	public static void main(String args[]) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 19, 17, 26);

		// EX 05 - Print the cubes of odd numbers
		// cubeOfOddNumbers(numbers);
//--------------------------------------------------------------------------------------------------------		
		// EX 07 = Square every number in a list and find the sum of squares
		squareOfAllNumbAndSumOfSquares(numbers);

	}

	private static void squareOfAllNumbAndSumOfSquares(List<Integer> numbers) {
		Integer sumOfAll = numbers.stream().map(x -> x * x).reduce(0, (x, y) -> x + y);
		System.out.println(sumOfAll);

	}

	private static void cubeOfOddNumbers(List<Integer> numbers) {
		numbers.stream().filter(x -> x % 2 != 0).map(y -> y * y * y).forEach(System.out::println);
	}

}
