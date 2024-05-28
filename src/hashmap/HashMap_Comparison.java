package hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashMap_Comparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> map1 = new HashMap<Integer,String>();
		map1.put(1, "one");
		map1.put(2, "two");
		map1.put(3, "three");
		System.out.println(map1);
		
		HashMap<Integer,String> map2 = new HashMap<Integer,String>();
		map2.put(1, "one");
		map2.put(2, "two");
		map2.put(3, "three");
		
		HashMap<Integer,String> map3 = new HashMap<Integer,String>();
		map3.put(1, "one");
		map3.put(2, "two");
		map3.put(3, "three");
		map3.put(3, "three0");
		
		//1. one the basis of key-value pair: use equals method:
		System.out.println(map1.equals(map2));  //true
		System.out.println(map1.equals(map3));  //false
		
		//2.compare hashmap for the same keys: keySet();
		System.out.println(map1.keySet().equals(map2.keySet()));  //true
		System.out.println(map1.keySet().equals(map3.keySet()));  //true
		
		//3 find out the extra keys:
		HashMap<Integer,String> map4 = new HashMap<Integer,String>();
		map4.put(1, "one");
		map4.put(2, "two");
		map4.put(3, "three");
		map4.put(4, "four");
		
		//3 find out the extra keys in map4 from map1:
		HashSet<Integer> keys = new HashSet<Integer>( map1.keySet());
		keys.addAll(map4.keySet());
		keys.removeAll(map1.keySet());
		System.out.println(keys);
		
		
		//compare maps by values
		
		HashMap<Integer,String> map5 = new HashMap<Integer,String>();
		map5.put(1, "one");
		map5.put(2, "two");
		map5.put(3, "three");
		System.out.println(map5);
		
		HashMap<Integer,String> map6 = new HashMap<Integer,String>();
		map6.put(4, "one");
		map6.put(5, "two");
		map6.put(6, "three");
		
		HashMap<Integer,String> map7 = new HashMap<Integer,String>();
		map7.put(1, "one");
		map7.put(2, "two");
		map7.put(3, "three");
		map7.put(4, "three");
		
		//1. duplicate values are not allowed : using ArrayList
		System.out.println(new ArrayList<>(map5.values()).equals(new ArrayList<>(map6.values())));  //true
		System.out.println(new ArrayList<>(map5.values()).equals(new ArrayList<>(map7.values())));  //false
		
		//2. duplicate values are allowed : using hashSet
		System.out.println(new HashSet<>(map5.values()).equals(new HashSet<>(map6.values())));    //true
		System.out.println(new HashSet<>(map5.values()).equals(new HashSet<>(map7.values())));	  //true
	}
}
