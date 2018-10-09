import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		//Notes from 10.8.18
		System.out.println("Hello World!");

		// this is a single line comment example
		// here is another line fo comments

		/*
		 * This is a multi-line comment
		 */
		System.out.print("Hello");
		System.out.print("World\n");

		// this is a scanner object
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter your age");
		int userAge = scan.nextInt();
		System.out.println(userAge);

		// Need a garbage line to clean out scanner
		// Only needed to change from int to string

		scan.nextLine();

		System.out.println("Please enter your first and last name.");
		String userName = scan.nextLine();
		System.out.println(userName);

		// primitive data types
		byte b = 127;
		short s = 128;
		int i = 133333;

		/*
		 * long is good to store data like credit card numbers add L at the end to let
		 * the compiler know that this is supposed to be a long
		 */
		long l = 12345546786789L;

		// float can be assigned to decimals.
		// F or (float) tells compiler that this is
		// supposed to be a float and not a double.
		// float is for less precise (smaller amount of decimal places)
		float f = (float) 56.7;

		double d = 56.7;

		// initialize char with ''
		char c = '@';

		boolean bool = true;

		// this is a constant and can not change
		final String TEST = "hello";

		// can not reassign TEST when it is initialized with FINAL
		// TEST = "no way";

		// Modulus returns the remainder
		System.out.println(9 % 5);

		s++; // post increment

		System.out.println(s);

		s--;

		System.out.println(s);

		++s; // pre-increment used in FOR loops

		String words = "this is a sentence";
		words += " and I added some words....";
		// same thing as saying words = words + "and I added some words....";

		int nums = 5;
		nums += 12;
		System.out.println(nums);  //same as nums = nums + 12
		
		//implicit casting example
		// java does this automatically
		int age =30;
		double myAge = age;
		System.out.println(myAge);
	
		//explicit casting
		//when going from more precise to less precise
		double shoppingTotal = 158.87;
		int newTotal = (int) shoppingTotal;
		System.out.println(newTotal);

		// you should close the scanner at the very end of the program
		scan.close();
	//Notes 10.9.18
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
