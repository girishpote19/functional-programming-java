package FunctionalProgramming;

import java.util.function.BiConsumer;

public class FP09BiConsumerExample {

	public static void main(String[] args) {

		BiConsumer<String, Integer> input = (name, age) -> System.out
				.println("name is " + name + " And age is " + age + " years old");

		input.accept("Girish", 25);

	}

}
