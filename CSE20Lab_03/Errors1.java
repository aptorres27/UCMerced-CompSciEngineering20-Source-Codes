import java.util.Scanner; // I added this to define the Scanner

public class Errors1 {

	public static void main(String[] args) {
		System.out.println("Can you spot and fix the errors?"); // I added the " symbol inserted in the spot that is missing

		System.out.println("Enter two numbers and I ");
		System.out.println("add them for you");

		int n1= 0;
		int n2 = 0; //Organized
		int sum = 0;

		Scanner keyboard = new Scanner(System.in); // Added the ; symbol
		n1 = keyboard.nextInt(); // Added keyboard. before nextInt
		n2 = keyboard.nextInt(); // Added keyboard. before nextInt and I changed int to Int
		sum = n1 + n2; //Sum is defined
				
		System.out.println("The sum of the numbers is"); //Added out in System.println("The sum of the numbers is")
		System.out.println(n1 + n2); //changed the sign to plus
	}
}