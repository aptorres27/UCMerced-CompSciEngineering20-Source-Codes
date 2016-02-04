import java.util.Scanner;

public class Errors2 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in); //chaged kbd to keyboard
		int number = 0;
		int theSquare = 0;

		System.out.print("Enter a number and I will "); //Added ;
		System.out.print("square it for you"); //Changed : symbol to " symbol
		number =  keyboard.nextInt(); //changed int to Int
		
		theSquare = number * number; //Case sensitive changed s to S

		System.out.print(number + " squared = "); //Added ) symbol
		System.out.println(theSquare); //removed the " and " symbol
	}
}