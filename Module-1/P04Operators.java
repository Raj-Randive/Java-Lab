import java.util.Scanner;

public class P04Operators{
	
	public static void main(String args[]){
		Scanner myScan = new Scanner(System.in);
		
		// #1 Arithmetic Operators

		System.out.print("Enter first number: ");
		float a = myScan.nextFloat();
		System.out.print("Enter second number: ");
		int b = myScan.nextInt();
		System.out.print("Enter third number: ");
		int c = myScan.nextInt();
		System.out.print("Enter fourth number: ");
		int d = myScan.nextInt();

		System.out.println("\nThe addition of a and b is: " + (a+b));
		System.out.println("The subtraction of a and b is: " + (a-b));
		System.out.println("The multiplication of a and b is: " + (a*b));
		System.out.println("The Division of a and b is: " + (a/b));

		// #2 Logical Operators

		System.out.println("\nThe && operator : " + (a>b && b>c));
		System.out.println("The || operator : " + (a>b || b>c));
		// System.out.println("The ! operator : " +  );

		// #3 Conditional Operators

		System.out.println("\nThe > operator : " + (a>b));
		System.out.println("The < operator : " + (a<b));
		System.out.println("The >= operator : " + (a>=b));
		System.out.println("The <= operator : " + (a>=b));
		System.out.println("The == operator : " + (a>=b));
		System.out.println("The != operator : " + (a>=b));

		// #4 Increment/Decrement Operators

		System.out.println("\nThe a++ operator : " + (a++));
		System.out.println("The ++b operator : " + (++b));
		System.out.println("The c-- operator : " + (c--));
		System.out.println("The --d operator : " + (--d));


		myScan.close();
	}

}