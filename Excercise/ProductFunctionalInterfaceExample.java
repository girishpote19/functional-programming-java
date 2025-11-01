package FunctionalProgrammingCustomClass;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class ProductFunctionalInterfaceExample {

	public static void main(String[] args) {
		
		List<Product> products = Arrays.asList(
				
				new Product("RassiBomb", 500),
				new Product("Rocket", 1500),
				new Product("SkyShots", 5000),
				new Product("sursuri", 500),
				new Product("paus", 400)
				);

		//EX01 - Filter products costing more than ₹1000.
		Predicate<Product> costMoreThan1000 = p -> p.getPrice() > 1000;
		
		//EX02 - Apply a 15% discount on them.
		Function<Product, Product> discountApply = p -> {
			p.setPrice(p.getPrice() * 0.85);
			return p;
		};
		
		// EX03 - Print the final discounted prices with product names.
		Consumer<Product> finalPrice = p -> System.out.println(p);

		products.stream()
			.filter(costMoreThan1000)
			.map(discountApply)
			.forEach(finalPrice);
		
		//EX 04 - count how many products above 2000
		long count = products.stream()
							.filter(p -> p.getPrice() > 2000).count();
		
		System.out.println("Number of Products above Rs2000:"+count);
		
		//EX05 - collect discounted products name in new list<string>
		List<String> discountedProductNames = products.stream()
				.filter(p -> p.getPrice() < 2000)
				.map(Product :: getName)
				.collect(Collectors.toList());
		

		System.out.println("Discounted Product names less than 2000 RS:");
		discountedProductNames.forEach(System.out::println);
	}

}
