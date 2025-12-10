package CollectionFW;

import java.util.ArrayList;

public class LearnigArrayListVsLInkedList {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 0; i <= 5; i++) {
			list.add(i);
		}
		System.out.println(list);

		list.remove(2);

		System.out.println("removed element:" + list);

	}

}
