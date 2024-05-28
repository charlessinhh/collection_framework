package arraylist;

import java.util.ArrayList;

public class VirtualCapacity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//virtual capacity of ArrayList is 10,  vc = 10
		
		
		ArrayList<Object> ar = new ArrayList<>();  
		System.out.println(ar.size()); //pc = 0
		ar.add(10);
		System.out.println(ar.size());  //pc = 1
		ar.add(100);
		ar.add(200);
		ar.add(300);
		System.out.println(ar.size());  //pc = 4
	}

}
