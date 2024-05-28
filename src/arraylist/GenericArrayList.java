package arraylist;

import java.util.ArrayList;

public class GenericArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> ar = new ArrayList<>();
		ar.add(100);
		
		ArrayList<Double> ar1 = new ArrayList<>();
		ar1.add(100.0);
		
		ArrayList<String> ar2 = new ArrayList<>();
		ar2.add("charles");
		
		System.out.println(ar +" "+ ar1 +" " + ar2);
	}

}
