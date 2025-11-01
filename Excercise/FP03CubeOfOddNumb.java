package FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FP03CubeOfOddNumb {

	public static void main(String args[]) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 19, 17, 26);

		// EX 05 - Print the cubes of odd numbers
		// cubeOfOddNumbers(numbers);
//--------------------------------------------------------------------------------------------------------		
		// EX 07 = Square every number in a list and find the sum of squares
		// squareOfAllNumbAndSumOfSquares(numbers);

//--------------------------------------------------------------------------------------------------------	
		// EX 08 - Cube every number in a list and find the sum of cubes
		// cubeEveryNoAndSum(numbers);

//--------------------------------------------------------------------------------------------------------	
		// EX 09 - Find Sum of Odd Numbers in a list
		// sumOfOddNumb(numbers);

//--------------------------------------------------------------------------------------------------------
		// EX 10 - Create a List with Even Numbers Filtered from the Numbers List

		EvenNoAsList(numbers);

	}

	private static void EvenNoAsList(List<Integer> numbers) {
		List<Integer> evenNo = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
		System.out.println(evenNo);
	}

	private static void sumOfOddNumb(List<Integer> numbers) {
		Integer sumOfOdd = numbers.stream().filter(x -> x % 2 != 0).reduce(0, (a, b) -> a + b);
		System.out.println(sumOfOdd);
	}

	private static void cubeEveryNoAndSum(List<Integer> numbers) {
		Integer sumOfAll = numbers.stream().map(x -> x * x * x).reduce(0, (x, y) -> x + y);
		System.out.println(sumOfAll);
	}

	private static void squareOfAllNumbAndSumOfSquares(List<Integer> numbers) {
		Integer sumOfAll = numbers.stream().map(x -> x * x).reduce(0, (x, y) -> x + y);
		System.out.println(sumOfAll);

	}

	private static void cubeOfOddNumbers(List<Integer> numbers) {
		numbers.stream().filter(x -> x % 2 != 0).map(y -> y * y * y).forEach(System.out::println);
	}

}
