package FunctionalProgramming;

import java.util.function.Consumer;

public class FP05ConsumerExample {

	public static void main(String[] args) {

		Consumer<String> Printname = name -> System.out.println("Hi bro " + name);

		Printname.accept("Girish");
	}

}
