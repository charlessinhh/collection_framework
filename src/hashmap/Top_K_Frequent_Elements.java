package hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Top_K_Frequent_Elements {

	public static void main(String[] args) {
//		Input: nums = [1,1,1,2,2,3], k = 2
//		Output: [1,2]
		//hashmap [ 1=3,2=2,3=1]
//		int[] nums = {3,2,2,2,1,2,2,3,3};
//		int[] nums = {2,3,1,3,2};
		int[] nums = {1,1,2,2,2,3};
		int K = 2;
		HashMap<Integer, Integer> hs1 = new HashMap<>();
		
		for(int  i = 0 ; i < nums.length;i++) {
			int n = nums[i];
			
			if(hs1.containsKey(n)) {
				hs1.put(n, hs1.get(n)+1);
			}
			else {
				hs1.put(n, 1);
			}
		}
		hs1.forEach((k,v) -> System.out.println("Key "+ k + ", value "+v));
		
		PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>((a,b) -> b.getValue() - a.getValue());
		pq.addAll(hs1.entrySet());
		System.out.println("pq "+pq);
		int[] result = new int[K];
		
		for(int j = 0 ; j < K;j++) {
			Map.Entry e = pq.poll();
			System.out.println(e);
			int key = (int) e.getKey();
			System.out.println(key);
			result[j] = key;
		}
		System.out.println();
	}

}
