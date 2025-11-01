package FunctionalProgramming;

import java.util.function.Function;

public class FP06FunctionExample {

	public static void main(String[] args) {
		
		Function<Integer, Integer> square = n -> n*n;
		
		System.out.println(square.apply(2));

	}

}
