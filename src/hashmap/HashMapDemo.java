package hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
//		HashMap <Integer,Integer> hs = new HashMap<>();
//		hs.put(1,10 );
//		hs.put(2,20 );
//		hs.put(3,30 );
//		hs.put(4,40 );
//		hs.put(5,50 );
//		
//		System.out.println(hs.get(5));
//		System.out.println(hs.containsKey(5));
		
		HashMap <String,Integer> hs1 = new HashMap<>();
		
		
		hs1.put("r", 1);
		hs1.put("t", 1);
		hs1.put("e", 2);
		//Iterator: over the set(pair): by using entrySet()
		Iterator<Entry<String, Integer>> it1 = hs1.entrySet().iterator();
		while(it1.hasNext()) {
			Entry<String,Integer> entry = it1.next();
			System.out.println("Key " + entry.getKey() + ", value "+ entry.getValue());
		}
		
		

	}

}
