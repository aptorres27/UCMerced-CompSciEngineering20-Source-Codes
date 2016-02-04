import java.util.Scanner;

public class Multiples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter the max number:");

		int max = input.nextInt();
		
		System.out.print("Please enter the base number:");
		
		int base = input.nextInt();
		int last = 0;
		
		for (int i = 0; i * base<= max; i++) { 
			last = i * base;
			System.out.println("Number is " + last);
	}
	}
}
