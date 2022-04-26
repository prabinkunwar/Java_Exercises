package GenericMethods;

public class GenericMethodExamples {

	public static void main(String[] args) {
		
//		Using Generic Methods		

		Integer[] numbers	 = {10,56,32,89,53,46,78,12};	
		Double[] nums = {78.32,45.96,22.47,12.32};
		String[] words = {"Manchester United, Liverpool, Chelsea, Arsenal, Leeds United"};
		
		printArray(numbers);
		printArray(nums);
		printArray(words);
		
	}
	
	public static <E> void printArray(E[] myArray) {
		for(E item : myArray) {
			System.out.println(item);
		}
	}

// Below code is without using Generic Method
	
//	int[] numbers	 = {10,56,32,89,53,46,78,12};	
//	double[] nums = {78.32,45.96,22.47,12.32};
//	String[] words = {"Manchester United, Liverpool, Chelsea, Arsenal, Leeds United"};	
	
//	printArray(numbers);
//	printArray(nums);
//	printArray(words);
	
//	public static void printArray(int[] myArray) {
//		for( int item : myArray) {
//			System.out.println(item);
//		}
//	}
//	
//	public static void printArray(double[] myArray) {
//		for(double item : myArray) {
//			System.out.println(item);
//		}
//	}
//	
//	public static void printArray(String[] myArray) {
//		for(String item : myArray) {
//			System.out.println(item);
//		}
//	}

}
