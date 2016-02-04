import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter a number 0-25: ");
		int num = input.nextInt();
		
		System.out.println("You have entered " + num);
		
		if (0<=num && num<=25)	
			System.out.println( num +  " character of Alphabet is "  +  (char)(num + 'A') );
		else
			System.out.println("Outside of acceptable range");
					

	}
}
