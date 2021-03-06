package scanner;

import java.util.Scanner;

public class UseOfScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Ask and Capture answer to the following questions:
			What is your name?
			How old are you?
			What is your gender?
			Where are you from?
			Where do you live now?
			Where do you work?
			What is your job role?
			What is your salary?
			How much raise are you getting next year?
		 */
		
		Scanner inputString = new Scanner(System.in);
		Scanner inputInt = new Scanner(System.in);
		Scanner inputFloat = new Scanner(System.in);
		
		
		System.out.println("What is your name?");
		String name = inputString.next();
		
		System.out.println("How old are you?");
		int age = inputInt.nextInt();
		
		System.out.println("What is your gender?");
		String gender = inputString.next();
		
		System.out.println("Where are you from?");
		String location = inputString.next();
		
		System.out.println("Where do you live now?");
		String currentLocation = inputString.next();
		
		System.out.println("Where do you work?");
		String jobLocation = inputString.next();
		
		System.out.println("What is your job role?");
		String jobRole = inputString.next();
		
		System.out.println("What is your salary?");
		float salary = inputFloat.nextFloat();
		
		System.out.println("How much raise are you getting next year?");
		float raise = inputFloat.nextFloat();
		
		float totalSalary = salary + raise ;
		
		/*
		My name is James Bond. I am 40 years old, male. 
		I work at IBM as Automation Engineer. 
		I currently live in New York. 
		I am originally from England. 
		I make 100000.00 dollar. 
		I will get 50000.00 as annual raise so my total salary would be 150000.00 dollar next year.
		*/
		
		System.out.println("My name is " + name + ".I am " + age + "years old, male.I work at " + jobLocation
				+ " as Automation Engineer. I currently live in " + location + ".I am originally from "
				+ currentLocation + ".I make " + salary + " dollar. " + "I will get " + raise
				+ " as annual raise so my total salary would be " + totalSalary + " dollar next year.");
		
	}

}
