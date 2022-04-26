package functions;

import java.util.Scanner;

public class JavaFunctions {

	public static void main(String[] args) {
		
//		1. Ask the USER for a string (it should print �Please enter a String:�)
//		        assume the user enters �hello�
//		2. Convert that string to all uppercase and print it (it should print �HELLO�)
//		3. Print the length of that string (it should print 5)
//		4. Replace �O� with �Z� (it should print �HELLZ�)
//		5. Give the last char of the string (it should print �Z�)
//		6. Concatenate the string from step 1 with string "Test" (it should print �hello Test�)
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a String");
		String userString = input.next();
		System.out.println(userString);
		
		String newUserString = userString.toUpperCase();
		
		System.out.println(newUserString);
		
		System.out.println(newUserString.length());
		
		System.out.println(newUserString.replace("O", "Z"));
		
		System.out.println(newUserString.charAt(newUserString.length() - 1));
		
		System.out.println(userString.concat(" Test"));
		
	}

}
