import java.util.Scanner;

public class Errors6 {

	public static void main(String[] args) {
		System.out.println("This program will ask the user for three sets of two numbers and will calculate the average of each set.");

		Scanner input = new Scanner(System.in);

		int n1, n2;

		System.out.print("Please enter a number:");
		n1 = input.nextInt();

		System.out.print("Please enter another number:");
		n2 = input.nextInt();
		
		
		Scanner input1 = new Scanner(System.in);

		float f1, f2;

		System.out.print("Please enter a decimal number:");
		f1 = input.nextFloat();

		System.out.print("Please enter another decimal number:");
		f2 = input.nextFloat();
		
		Scanner input2 = new Scanner(System.in);
		
		short s1, s2;
		
		System.out.print("Please enter a number:");
		s1 = input.nextShort();

		System.out.print("Please enter another number:");
		s2 = input.nextShort();

		int average;
		average = ((n1+n2)/2);
		System.out.println("The average of the numbers is " + average);
		
		float average2;
		average2 = ((f1+f2)/2);
		System.out.println("The average of the decimal numbers is " + average2);

		float average3;
		average3 = ((s1+s2)/2);
		System.out.print("The average of the numbers is " + average3);
		
	}

}
