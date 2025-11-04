package FPPractice1112025;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FPPracticeString {

	public static void main(String args[]) {

		List<String> courses = Arrays.asList("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure",
				"Docker", "Kubernetes");

		// Print All Courses individually

		allCoursesIndividually(courses);

		// Print Courses Containing the word "Spring"
		courseContainSpring(courses);

		// Print Courses Whose Name has atleast 4 letters
		courseHasAtleast4Letters(courses);

		// Print the number of characters in each course name
		charInCourseName(courses);

		// Create a List with lengths of all course titles.
		listOfAllCourses(courses);

		// print course legnth > 11 and in upperCase
		course11AndUpperCase(courses);

	}

	private static void allCoursesIndividually(List<String> courses) {
		courses.stream().forEach(System.out::println);
		System.out.println("=====================================================");
	}

	private static void courseContainSpring(List<String> courses) {
		courses.stream().filter(n -> n.contains("Spring")).forEach(System.out::println);
		System.out.println("=====================================================");
	}

	private static void courseHasAtleast4Letters(List<String> courses) {
		courses.stream().filter(m -> m.length() >= 4).forEach(System.out::println);
		System.out.println("=====================================================");

	}

	private static void charInCourseName(List<String> courses) {

		courses.stream().map(m -> m + "=" + m.length()).forEach(System.out::println);
		System.out.println("=====================================================");
	}

	private static void listOfAllCourses(List<String> courses) {
		List<String> allCourses = courses.stream().map(p -> p + "=" + p.length()).collect(Collectors.toList());
		System.out.println("List Of All COurses is :" + allCourses);
		System.out.println("=====================================================");
	}

	private static void course11AndUpperCase(List<String> courses) {
		courses.stream().filter(m -> m.length() > 11).map(p -> p.toUpperCase()).forEach(System.out::println);
	}

}
