package hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;

public class FrequencyKeyValue {

	public static void main(String[] args) {
		String str = "tree";
		HashMap<Character,Integer > hs1 = new HashMap<>();
		
		for(int i = 0 ; i < str.length();i++) {
			char ch = str.charAt(i);
			
			if(hs1.containsKey(ch)) {
				hs1.put(ch, hs1.get(ch)+1);
			}
			else {
				hs1.put(ch, 1);
			}
		}
		
		
		
//		Iterator<Entry<Character,Integer>> it = hs1.entrySet().iterator();
//		while(it.hasNext()) {
//			Entry<Character,Integer> entry = it.next();
//			System.out.println("key "+ entry.getKey() + " "+ " value "+ entry.getValue());
//		}
		
//		hs1.forEach((k,v) -> System.out.println("key " + k + " value "+ v ));
		
//		for (char c : str.toCharArray())
//			hs1.put(c, hs1.getOrDefault(c, 0) + 1);
		
		PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
		pq.addAll(hs1.entrySet());
		
		System.out.println(pq);
		StringBuilder sb = new StringBuilder();
        while (!pq.isEmpty()) {
            Map.Entry e = pq.poll();
            System.out.println(e);
            for (int i = 0; i < (int)e.getValue(); i++) 
                sb.append(e.getKey());
        }
        System.out.println(sb.toString());
	}

}
