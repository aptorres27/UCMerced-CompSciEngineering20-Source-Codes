import java.util.Scanner;

public class PosAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		int i = 0;
		int num = 0;
		int total = 0;
		int times = 0;
		
		do {
			System.out.print("Enter " + i + " number:");
			num = input.nextInt();
			total = total + num;
			times = i + i;
			i++;
		}
			while (num >= 0); 
		total = total - num;
		times = i - 1;
		System.out.println("Average is " + (total/times));
		
		
			
	}

}
