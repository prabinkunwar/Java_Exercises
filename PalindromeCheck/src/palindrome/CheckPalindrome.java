package palindrome;

import java.util.Scanner;

public class CheckPalindrome {

	public static void main(String[] args) {
		

//     2.  Ask the USER for a string and print if the string is palindrome // wow = wow

		Scanner input = new Scanner(System.in);

		System.out.print("Please enter a String:  ");
		String word = input.next();

		char[] wordArray = word.toCharArray();

		String reverseWord = "";

		for (int i = wordArray.length - 1; i >= 0; i--) {
			reverseWord = reverseWord + wordArray[i];
		}
		
		System.out.println(reverseWord);
		System.out.println("");
		
		if(word.equalsIgnoreCase(reverseWord)) {
			System.out.println("The string " +word+ " is a Palindrome.");
		}
		else {
			System.out.println("The string " +word+ " is not a Palindrome.");
		}
	}
}
