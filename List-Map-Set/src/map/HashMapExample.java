package map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		
		Map<String, Integer> students = new HashMap<String, Integer>();
		students.put("A", 10);   // here A is the key and 10 is the value
		students.put("B", 20);
		students.put("C", 30);
		students.put("C", 40);
		students.put("D", 50);
		students.put("E", 60);
		students.put("F", 70);
		students.put("A", 90);


		System.out.println(students.size());
		System.out.println(students);
	    System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");	
	    System.out.println("");
		System.out.println(students.keySet());  // only prints the keySet eg:- [A, B, C, D, E, F]
		System.out.println(students.values()); //  only prints the values eg:- [90, 20, 40, 50, 60, 70]
		System.out.println("");
		System.out.println("- - - - - - After Remove - - - - - - - - - - - - -");	
		students.remove("A");
		System.out.println(students.size());
		System.out.println(students);

	}

}
