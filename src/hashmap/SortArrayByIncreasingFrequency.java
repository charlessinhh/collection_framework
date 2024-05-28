package hashmap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class SortArrayByIncreasingFrequency {

	public static void main(String[] args) {
		int[] nums = {-1,1,-6,4,5,-6,1,4,1};
		// Output: [3,1,1,2,2,2]   [1,3,3,2,2]  [5,-1,4,4,-6,-6,1,1,1]

		HashMap<Integer, Integer> hs1 = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			int n = nums[i];

			if (hs1.containsKey(n)) {
				hs1.put(n, hs1.get(n) + 1);
			} else {
				hs1.put(n, 1);
			}
		}
		hs1.forEach((k, v) -> System.out.println("Key " + k + ", value " + v));
		
		PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>( (a,b) -> a.getValue() == b.getValue() ? b.getKey() - a.getKey() : a.getValue() - b.getValue());
		pq.addAll(hs1.entrySet());
		System.out.println("pq "+pq);
		
		int[] result = new int[nums.length];
		int count = 0 ;
		while(!pq.isEmpty() && count < nums.length) {
			Map.Entry<Integer,Integer> e = pq.poll();
			System.out.println("e: "+e);
			
			for(int i = 0 ; i < e.getValue();i++) {
				result[count] = e.getKey();
				System.out.println("result[count] : " +result[count]);
				count++;
			}
		}
		System.out.println("------------------");
//		for(int i = 0 ; i < result.length;i++) {
//			System.out.println(result[i]);
//		}
		System.out.println("result : "+ Arrays.toString(result));

	}

}
