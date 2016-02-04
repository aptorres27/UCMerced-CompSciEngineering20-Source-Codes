import java.util.Scanner;

public class SumAll {

		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);

			System.out.print("Please enter the max number:");

			int max = input.nextInt();
			int i = 0;
			int total = 0;
			while ( i <= max) {
				System.out.println("Number " + i);
				total += i;
				i++;				
	}				
			
			System.out.println("Sum of All is " + total );
			
				
		}
		}
