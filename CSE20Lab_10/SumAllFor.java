import java.util.Scanner;
public class SumAllFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter the max number:");

		int max = input.nextInt();
		int total = 0;
		for (int i = 0; i <= max; i++) {
			System.out.println("Number " + i);
			total = total + i;
		}
		System.out.println("Sum All is: " + total );
	}

}
