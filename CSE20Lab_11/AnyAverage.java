import java.util.Scanner;
public class AnyAverage {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("This program will find the average of any number.");
		System.out.print("Please choose amount of numbers to average:");

		int max = input.nextInt();

		int[]arr1 = new int[max];

		int i = 0;
		int sum = 0;
		
		for (i = 0; i < max; i++) {
			System.out.print("Please enter " + i + " number: ");
			int number = input.nextInt();
			arr1[i] = number;
			sum += arr1[i];
	}
			
		System.out.print("The numbers being averaged:");
	
		for (i = 0; i < max; i++) {
			if (i % 5 == 0){
				System.out.println();
				System.out.print(arr1[i] + " ");
	}
			else {
				System.out.print(arr1[i] + " ");
			}
		}
		System.out.println();
		System.out.print("Average is: " + sum/max);
	}	
}
