package FunctionalProgramming;

import java.util.function.Supplier;

public class FP10SupplierExample {

	public static void main(String[] args) {
		Supplier<Double> data = () -> Math.random();

		System.out.println(data.get());

	}

}
