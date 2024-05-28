package hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapIteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		HashMap<String,String> map = new HashMap<String , String>();
//		
//		map.put("India", "NewDelhi");
//		map.put("Nepal", "KT");
//		map.put("USA", "W DC");
//		map.put(null, "Mumbai");
//		map.put("UK", "Lonndon");
//		map.put("Bihar", null);
//		
//		System.out.println(map.get("Bihar"));
//		System.out.println(map.get("USA"));
		
		//Iterator : Over the Keys: by using keySet()
		
//		Iterator<String> it = map.keySet().iterator();
//		while(it.hasNext()) {
//			String key = it.next();
//			String value = map.get(key);
//			System.out.println("Key " + key + ", value " + value);
//		}
		
		System.out.println("---------");
		
		//Iterator: over the set(pair): by using entrySet()
//		Iterator<Entry<String,String>> it1 = map.entrySet().iterator();
//		while(it1.hasNext()) {
//			Entry<String,String> entry = it1.next();
//			System.out.println("Key " + entry.getKey() + ", value "+ entry.getValue());
//		}
//		System.out.println("---------");
		
		//Iterate hashmap using java 8 for each and lambda:
//		map.forEach((k,v) -> System.out.println("Key "+ k + ", value "+v));
		
	
		
		
		
	}

}
