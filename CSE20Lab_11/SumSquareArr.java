import java.util.Scanner;
public class SumSquareArr {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner input = new Scanner(System.in);

			System.out.print("Please enter the max number:");

			int max = input.nextInt();

			int[]arr1 = new int[max+1];
			int[]arr2 = new int[max+1];
			int[]arr3 = new int[max+1];

			int i = 1;

			// For-loop to calculate 
			for (i = 1;i <= max;i++)
				arr1[i] = arr1[i-1] + i*i;

			i = 1;
			
			// While-loop to calculate
			while (i <= max) {
				arr2[i] = arr2[i-1] + i*i;
				i++;
			}

			i = 1;

			// Do-While-loop to calculate
			do
				arr3[i] = arr3[i-1] + i*i;
			while (++i <= max);

			for (i = 0; i <= max; i++)
				System.out.println("Arr1 " + arr1[i] + " Arr2 " + arr2[i] + " Arr3 " + arr3[i]);

			System.out.println("Sum of All is " + arr1[max]);
	}

}
