package CollectionFW;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearningSet {

	public static void main(String args[]) {

		//no duplicate elements allowed and order of elements for adding/removing is not fixed , null allowed
		
		  Set<Integer> hs = new HashSet<Integer>();
		  hs.add(11); 
		  hs.add(2); 
		  hs.add(121);
		  hs.add(1); 
		  hs.add(101); 
		  hs.add(1);
		  hs.add(null);
		  
//		  System.out.println(hs.contains(121)); System.out.println(hs.isEmpty());
//		  System.out.println(hs.size());
//		  
//		  System.out.println("even no:"); hs.stream().filter(m -> m % 2 ==0).forEach(System.out::println);
		  
		  System.out.println(hs);
		 
		
		//LinkedHashSet - Elements insertion/deletion order is maintain - null allowed 
		
		
//		  Set<Integer> lh = new LinkedHashSet<Integer>(); 
//		  lh.add(7);
//		  lh.add(9);
//		  lh.add(6); 
//		  lh.add(8); 
//		  lh.add(44);
//		  lh.add(null);
//		  
//		  System.out.println(lh);
//		  
//		  
//		  System.out.println(lh.remove(44)); System.out.println(lh);
//		 
//		
//		//TreeSet - Uses BinarySearch Internally and Maintain order of the elements in sorted order.And dont allow any NULL value it will throw NP exception 
//		
		Set<Integer> th = new TreeSet<>();
		th.add(7);
		th.add(9);
		th.add(6);
		th.add(8);
		th.add(44);
		th.add(1);
		th.add(null);
		
		System.out.println(th);
	}

}
