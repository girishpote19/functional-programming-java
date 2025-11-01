package FPPractice1112025;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionalProgrammingPractice {

	public static void main(String args[]) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 10, 12, 19, 8);

		// Print Only Odd Numbers from the List
		oddNumbersFromList(numbers);

		// Print the cubes of odd numbers
		cubeOfOddNo(numbers);

		// Square every number in a list and find the sum of squares
		squareAndSumOfSquare(numbers);

		// Cube every number in a list and find the sum of cubes
		cubeAndSumOfCubes(numbers);

		// Find Sum of Odd Numbers in a list
		sumOfOddNo(numbers);

		// Create a List with Even Numbers Filtered from the Numbers List
		listOfEvenNo(numbers);

	}

	private static void oddNumbersFromList(List<Integer> numbers) {
		numbers.stream().filter(p -> p % 2 != 0).forEach(System.out::println);
		System.out.println("===================================================");
	}

	private static void cubeOfOddNo(List<Integer> numbers) {
		numbers.stream().filter(p -> p % 2 != 0).map(m -> m * m * m).forEach(System.out::println);
		System.out.println("===================================================");
	}

	private static void squareAndSumOfSquare(List<Integer> numbers) {
		int sumOfSquares = numbers.stream().map(m -> m * m).reduce(0, (x, y) -> x + y);
		System.out.println("Sum of the Squares: " + sumOfSquares);
		System.out.println("===================================================");
	}

	private static void cubeAndSumOfCubes(List<Integer> numbers) {
		int sumOfCubes = numbers.stream().map(m -> m * m * m).reduce(0, (x, y) -> x + y);
		System.out.println("sum of the cubes: " + sumOfCubes);
		System.out.println("===================================================");
	}

	private static void sumOfOddNo(List<Integer> numbers) {
		int sumOfOddNo = numbers.stream().filter(m -> m % 2 != 0).reduce(0, (x, y) -> x + y);
		System.out.println("sum of odd numbers from list: " + sumOfOddNo);
	}

	private static void listOfEvenNo(List<Integer> numbers) {
		System.out.println("===================================================");
		List<Integer> evenNoAsList = numbers.stream()
											.filter(e -> e % 2 == 0)
											.sorted(Comparator.reverseOrder())
											.collect(Collectors.toList());
		System.out.println("even no from the list :" + evenNoAsList);
	}
}
