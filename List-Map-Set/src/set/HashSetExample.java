package set;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {

		Set<String> students = new HashSet<String>();
		students.add("Tom");
		students.add("Ryan");
		students.add("Ryan");
		students.add("Dwayne");
		students.add("Smith");
		students.add("Morgan");
		students.add("Christian");
		students.add("Tom");

		System.out.println(students.size());
		System.out.println(students);

		for (String items : students) {
			System.out.println(items);
		}

//		System.out.println("==========================");
//		System.out.println(students.get(0));
//		students.remove(0);
//		System.out.println(students.get(0));
//		System.out.println(students.size());
	}

}
