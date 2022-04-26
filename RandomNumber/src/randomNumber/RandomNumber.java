package randomNumber;

import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {

		System.out.println(getRandomNumber());
		
	}
	
	public static int getRandomNumber() {
		Random random = new Random();
		int number = random.nextInt(9 - 0 + 1) + 0;
		return number;
	}

}
