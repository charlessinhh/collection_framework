package hashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class FirstUniqueCharacterInString {

	public static void main(String[] args) {

//		String s = "loveleetcode";
		String s = "aabb";
		
		// 1 using indexOf
//		for(char c : s.toCharArray()) {
//			int firstIndex = s.indexOf(c);
//			int lastIndex = s.lastIndexOf(c);
//			if(firstIndex == lastIndex) {
//				
//				System.out.println("c: "+c+ " index: "+firstIndex);
//				break;
//				
//				
//			}
//		}
		
		//2 brute-force
		boolean flag = true; // let unique present
//		
		for(int i = 0 ; i < s.length();i++) {
			for(int j = 0 ; j < s.length();j++) {
				System.out.println("flag1 : "+flag);
				if(s.charAt(i) == s.charAt(j) && i != j) {
					//unique not present
					flag = false;
					break;
					
				}
			}
			System.out.println("flag2 : "+flag);
			if(flag == true) {
				System.out.println(i);
				break;
			}
			else {
				flag = true; //make flag true so that iteration can happen
			}
		}
		
		
		//3
		
//		HashMap<Character,Integer> map = new LinkedHashMap<>();
//        for(int i = 0; i<s.length(); i++){
//            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
//        }
//        map.forEach((k,v) -> System.out.println("Key "+ k + ", value "+v));
//        
//        for(int i = 0; i<s.length(); i++){
//            if(map.get(s.charAt(i)) == 1) {
//            	System.out.println(i);
//            	break;
//            }
//        }

	}

}
