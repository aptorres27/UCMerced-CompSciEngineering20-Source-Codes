import java.util.Scanner;

public class ChooseFunc {

	public static void main(String[] args) {

		System.out.println("This program supports 4 functions of a max number:");
		System.out.println("\t1. SumAll");
		System.out.println("\t2. SumSquare");
		System.out.println("\t3. Factorial");
		System.out.println("\t4. Fibonacci");

		Scanner input = new Scanner(System.in);

		while (true) {
			System.out.print("Please choose the function you want:");
			int func = input.nextInt();

			System.out.print("Please enter the max number: ");
			int max = input.nextInt();
			long [] resArr = new long [max+2];

			for (int i = 1; i <= max;i++ ) {
				if (func == 1) {
					resArr[i] = resArr[i-1] + i;
				} else if (func == 2) {
					resArr[i] = resArr[i-1] + i * i;
				} else if (func == 3) {
					if (i == 1)
						resArr[i] = 1;
					else
						resArr[i] = resArr[i-1] * i;
				} else if (func == 4) {
					if (i == 1)
						resArr[i] = 1;
					else 
						resArr[i] = resArr[i-2] + resArr[i-1];
				} else {
					System.out.println("Error: Do not know " + func);
					break;
				}
			}

			System.out.print("Do you wish to repeat inputs? (1 for yes): ");
			if (input.nextInt() == 1) {
				continue;
				
			}
			
			System.out.print("Do you wish to print out all the results? (1 for yes): ");
			if (input.nextInt() == 1) {
				System.out.println("Results in the array:");
				System.out.println("\tIndex\tValue");
				for (int i = 0; i <= max;i++) {
					System.out.println("\t" + i + "\t" + resArr[i]);
				}
					
			}

			System.out.print("Do you wish to end the program? (1 for yes): ");
			if (input.nextInt() == 1) {
				break;
			}
		}
	}
}