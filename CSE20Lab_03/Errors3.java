import java.util.Scanner;

public class Errors3 { //Added {

	public static void main(String[] args) {
		Scanner kbd = new Scanner (System.in); //Added ()
		int numerator; // Changed Int to int
		int denominator; //changed interger to int

		System.out.println("This program divides two numbers."); //Added out in System.println("This program divides two numbers.");
		System.out.print("Enter the numerator: "); //Added out in System.print("Enter the numerator: ");
		numerator = kbd.nextInt();
		System.out.print("Enter the denominator: ");
		denominator = kbd.nextInt(); //corrected the spelling 

		System.out.print(numerator); //Case sensitive 
		System.out.print("/");
		System.out.print(denominator); //Case Sensitive
		System.out.print(" = ");
		System.out.println((double) numerator/denominator); //Case sensitive
	}
} //Added this
