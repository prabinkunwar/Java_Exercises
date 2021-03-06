package loops;

import java.util.Scanner;

public class LoopsAndConditions {

	public static void main(String[] args) {

//      1. Given N --- Print this pattern up to N: 1, 4, 8, 12, 16, 20?

		Scanner input = new Scanner(System.in);
		System.out.println("[ - - - T A S K -> 1 - - - ]");
		System.out.println("Please enter a number: ");
		int userValue = input.nextInt();

		for (int i = 0; i <= userValue; i = i + 4) {
			if (i == 0) {
				int n = 1;
				System.out.print(n + " ");
			} else if (i > 0) {
				System.out.print(i + " ");
			}
		}

		System.out.println();
		System.out.println();

		
//      2. Given N --- Print backward to 0.
//		  (Ask user for a number and let's assume N is 5 so if the user input 5
//		      ? then the program should print: 5 4 3 2 1 0)		

		System.out.println("[ - - - T A S K -> 2 - - - ]");
		System.out.println("Please enter any number: ");
		int userValue2 = input.nextInt();

		for (int j = userValue2; j >= 0; j--) {
			System.out.print(j + " ");
		}

		System.out.println();
		System.out.println();

		
//		3. Ask the user for a word and then print each character out one by one.
//		   Example: user enters: hello; your program will print out: h e l l o

		System.out.println("[ - - - T A S K -> 3 - - - ]");
		System.out.println("Please enter any word: ");
		String word = input.next();

		char[] wordArray = word.toCharArray();

		for (int k = 0; k <= wordArray.length - 1; k++) {
			System.out.print(wordArray[k] + " ");
		}

	}
}
