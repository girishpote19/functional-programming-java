package FunctionalProgramming;

import java.util.function.BiPredicate;

public class FP07BiPredicateExample {

	public static void main(String[] args) {
		BiPredicate<String, String> isEqual = (n, m) -> n.equals(m);

		System.out.println(isEqual.test("Girish", "Girish"));
		System.out.println(isEqual.test("Girish", "Harish"));

	}

}
