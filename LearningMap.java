package CollectionFW;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LearningMap {

	public static void main(String args[]) {

		// HashMap - storesKey-value pair .... insertion / deletion order of the
		// elements not maintain ... if same key put again then newly added key value
		// override old one...null/empty key-value allowed...
		Map<String, Integer> hashMap = new HashMap<>();

//		hashMap.put("One", 1);
//		hashMap.put("Two", 2);
//		hashMap.put("Three", 3);
//		hashMap.put("Four", 4);
//		hashMap.putIfAbsent("One", 10); // check already key is present or not and accordingly put elements
////		hashMap.put("", null);
////		hashMap.put(null, 0);
//
//		System.out.println(hashMap);
//		System.out.println(hashMap.keySet());
//		System.out.println(hashMap.values());
//		System.out.println(hashMap.containsValue(1));

//		for (Map.Entry<String, Integer> e : hashMap.entrySet()) {
//			
//			System.out.println(e);
//			System.out.println(e.getKey());
//			System.out.println(e.getValue());
//			
//
//		}
		
		//TreeMap -- stores keyvalue pairs in sorted format based on keys .. allowed null keyvalue
		
		Map<String, Integer> treeMap = new HashMap<>();

		treeMap.put("One", 1);
		treeMap.put("Two", 2);
		treeMap.put("Three", 3);
		treeMap.put("Four", 4);
		
		System.out.println(treeMap);

	}

}
