import java.util.Scanner;

public class Errors4 {

	public static void main(String[] args) {
		int n1, n2;
		Scanner keyboard = new Scanner(System.in); 
		System.out.print("Enter the first number: ");
		n1 = keyboard.nextInt(); 
		
		System.out.print("Enter the second number: ");
		n2 = keyboard.nextInt();
		
		System.out.println("The sum of the numbers is " + (int)(n1+n2));
	}

}