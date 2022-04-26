package calculator;

import java.util.Scanner;

public class CalculatorApp {

	public static void main(String[] args) {

//		1. Build a basic calculator (Plus, Minus, Multiplication, Division)
//		     a.  (Ask user for a number and then ask for the second number
//		               then ask for the operation: ADD, SUB, MULTI, DIV)
//          b.  Two of the math operation needs to be a static Methods and two of them to be non-static methods. All 4 operations should be in a separate class.
//		     c.  Use IF and ELSE or SWITCH”

		Scanner input = new Scanner(System.in);

		System.out.print("Enter 1st number:   ");
		int num1 = input.nextInt();

		System.out.print("Enter 2nd number:   ");
		int num2 = input.nextInt();

		System.out.println("");

		System.out.println("Enter your choice: ");
		System.out.println("1. ADD");
		System.out.println("2. SUB");
		System.out.println("3. MUL");
		System.out.println("4. DIV");
		System.out.println("");
		System.out.print("Enter your choice [1 - 4] :  ");

		int choice = input.nextInt();

		System.out.println("");

//		if(choice == 1) {
//			Add.addition(num1,num2);
//		}
//		else if(choice == 2) {
//			Sub.subtraction(num1, num2);
//		}
//		else if(choice == 3) {
//			Multi mul = new Multi();
//			mul.multiplication(num1, num2);
//		}
//		else if(choice == 4) {
//			Div div = new Div();
//			div.division(num1, num2);
//		}
//		else {
//			System.out.println("Invalid Input");
//		}
		
		switch (choice) {
		
		case 1:
			Add.addition(num1,num2);
			break;
			
		case 2:
			Sub.subtraction(num1, num2);
			break;
			
		case 3:
			Multi mul = new Multi();
     		mul.multiplication(num1, num2);
     		break;
			
		case 4:
			Div div = new Div();
    		div.division(num1, num2);
    		break;
    		
    		default:
    			System.out.println("Invalid input");
		}	
	}
}
