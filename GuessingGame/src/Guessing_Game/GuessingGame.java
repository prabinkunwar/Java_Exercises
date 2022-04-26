package Guessing_Game;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {

		int count = 3;
		int number = getRandomNumber();

		Scanner input = new Scanner(System.in);

		while (true) {
			System.out.println("Enter any number between 0 - 9: ");
			int userValue = input.nextInt();

			if (userValue ==  number) {
				System.out.println("* * * * * Congrutulations You Won! * * * * *");
				break;

			} else if (userValue != number) {
				System.out.println("You have " + count + " attempts left ");
				System.out.println("");
				count--;
				if (count < 0) {
					System.out.println("* * * * * * You lost * * * * *");
					break;
				}
			}
		}
		input.close();
	}
	
	public static int getRandomNumber() {
		Random random = new Random();
		int number = random.nextInt(9 - 0 + 1) + 0;
		return number;
	}
	
}
