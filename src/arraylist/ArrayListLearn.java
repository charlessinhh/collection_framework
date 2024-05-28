package arraylist;

import java.util.ArrayList;

public class ArrayListLearn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Array
		// At the time of declaration
//		int[] numbers = new int[5]; // array of 5 integers
//
//		// With values
//		int[] primes = {2, 3, 5, 7, 11};

		// Using 'new' keyword
//		String[] fruits = new String[]{"Apple", "Banana", "Cherry"};
		
		
		//Dynamic Array
		// it is a class
		//default generics
		ArrayList<Object> ar = new ArrayList<Object>();
		ar.add(1);
		ar.add("charles");
		ar.add(null);
		
		System.out.println(ar);
		System.out.println(ar.get(4));
	}

}
