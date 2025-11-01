package FunctionalProgrammingCustomClass;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionalInterfaceExample {

	public static void main(String[] args) {
		
		List<Employee> emp = Arrays.asList(
				new Employee("girish", 45000),
				new Employee("harish", 55000),
				new Employee("gajanan", 60000),
				new Employee("ganita", 48000)
				);
		
		//EX01 - Filter employees with salary > 50,000
		Predicate<Employee> highSalary = e -> e.getSalary() > 50000; //predicate -> condition check
		
		//EX02 - Increase their salary by 10%
		Function<Employee, Employee> incrementSalary = e -> { //Function -> transform data (increase salary)
			e.setSalary(e.getSalary() * 1.10);
			return e;
		};
		
		//EX03 - Print the updated employee details
		Consumer<Employee> display = e -> System.out.println(e); //consumer -> perform action -print 
		
		emp.stream()
			.filter(highSalary)
			.map(incrementSalary)
			.forEach(display);
	}

}
