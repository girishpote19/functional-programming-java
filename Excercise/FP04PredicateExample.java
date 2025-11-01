package FunctionalProgramming;

import java.util.function.Predicate;

public class FP04PredicateExample {

	public static void main(String[] args) {

		Predicate<Integer> num = n -> n % 2 == 0;
		System.out.println(num.test(1));
		System.out.println(num.test(2));

	}

}
