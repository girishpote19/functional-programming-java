package FunctionalProgramming;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FP02StreamOperations {

	public static void main(String args[]) {

		List<String> courses = Arrays.asList("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure",
				"Docker", "Kubernetes");

		// EX02 - Print All Courses individually

		// allCoursesIndividually(courses);
//---------------------------------------------------------------------------------------------------------------------------------------------------		
		// EX 03 - Print Courses Containing the word "Spring"
		// coursesContainingSpring(courses);

//---------------------------------------------------------------------------------------------------------------------------------------------------		
		// EX 04 - Print Courses Whose Name has atleast 4 letters
		// coursesContaining4letters(courses);
// ---------------------------------------------------------------------------------------------------------------------------------------------------	
		// EX 06 - Print the number of characters in each course name
		// courseNameSize(courses);
// ---------------------------------------------------------------------------------------------------------------------------------------------------		
		// EX 11 - Create a List with lengths of all course titles.
		lengthOfAllCourseTitles(courses);

	}

	private static void lengthOfAllCourseTitles(List<String> courses) {
		List<String> coursesList = courses.stream().map(a -> a + "=" + a.length()).collect(Collectors.toList());
		System.out.println(coursesList);

	}

	private static void courseNameSize(List<String> courses) {
		courses.stream().map(x -> x + "=" + x.length()).forEach(System.out::println);

	}

	private static void coursesContaining4letters(List<String> courses) {
		courses.stream().filter(x -> x.length() >= 4).forEach(System.out::println);

	}

	private static void coursesContainingSpring(List<String> courses) {
		courses.stream().filter(x -> x.contains("Spring")).forEach(System.out::println);

	}

	private static void allCoursesIndividually(List<String> courses) {

		courses.stream().forEach(System.out::println);
	}

}
