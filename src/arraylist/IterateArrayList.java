package arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class IterateArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> studentName = new ArrayList<>();
		studentName.add("charles");
		studentName.add("charles1");
		studentName.add("charles2");
		studentName.add("charles3");
		
		studentName.add("charles3");studentName.add("charles4");
		studentName.add("charles3");
		studentName.add("charles0");
		
		for(String stu : studentName) {
			System.out.println(stu);
		}
		System.out.println("------------");
		//jdk8
		studentName.stream().forEach(stu -> System.out.println(stu));
		
		System.out.println("--d-d-d-");

		//iterator
		Iterator<String> it = studentName.iterator();
		while(it.hasNext()) {

			System.out.println(it.next());
		}
	}

}
