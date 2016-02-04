import java.util.Scanner;
public class AnyAverage {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Please enter the max number:");

		int max = input.nextInt();
		int i = 0;
		int total = 0;
		while ( i <= max) {
			System.out.println("Enter Number #" + i + ":");
			total += input.nextInt();
			i++;
			}
		System.out.println("Average is:" + (float)(total/max++));

	}
}

