package CollectionFW;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LearningList {

	public static void main(String args[]) {

		List<Integer> num = new ArrayList<>();

		num.add(1);
		num.add(3);
		num.add(7);

		System.out.println("ArrayList numbers are: " + num);

		//Iterator
		
		for (Integer element : num) {
			System.out.println("Using Iterator :"+element);
		}
		
		//add element on idx method overloading
		num.add(2, 5);
		System.out.println("updated list of Numbers: "+num);
		
		
		//created new list and appending with old one 
		List<Integer> newList = Arrays.asList(1, 2, 3, 4, 10, 12, 19, 8);
		
		num.addAll(newList);
		System.out.println("Updated list after appending newList: "+num);
		
		
		//get element from list
		System.out.println("index 3rd element in List: "+num.get(3));
		
		//remove element from list
		System.out.println("removed 7th idx element from List: "+num.remove(7));
		
		if (num.contains(Integer.valueOf(19))) {
			System.out.println("19 hai bhai remove karde?");
		}
		else 
		{
			System.out.println("nahi hai");
		}
		System.out.println("removed 19 value from List: "+num.remove(Integer.valueOf(19)));
		System.out.println("updated list:"+num);
	}

}
