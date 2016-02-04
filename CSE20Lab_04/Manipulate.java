import java.util.Scanner;

public class Manipulate {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the first int number:");
		int nInt1 = input.nextInt();
		
		System.out.println("Please enter the second int number:");
		int nInt2 = input.nextInt();
		
		System.out.println("When you add num1 and and num2 is " + (int) (nInt1 + nInt2) + ".");
		System.out.println("When you sub num1 and and num2 is " + (int) (nInt1 - nInt2) + ".");
		System.out.println("When you mul num1 and and num2 is " + (int) (nInt1 * nInt2) + ".");
		System.out.println("When you div num1 and and num2 is " + (int) (nInt1 / nInt2) + ".");
		System.out.println("The remainder of num1 and num2 is " + (int) (nInt1 % nInt2) + " .");
		
		System.out.println("Please enter the first int number:");
		short nShort1 = input.nextShort();
		
		System.out.println("Please enter the second int number:");
		short nShort2 = input.nextShort();
		
		System.out.println("When you add num1 and and num2 is " + (short) (nShort1 + nShort2) + ".");
		System.out.println("When you sub num1 and and num2 is " + (short) (nShort1 - nShort2) + ".");
		System.out.println("When you mul num1 and and num2 is " + (short) (nShort1 * nShort2) + ".");
		System.out.println("When you div num1 and and num2 is " + (short) (nShort1 / nShort2) + ".");
		System.out.println("The remainder of num1 and num2 is " + (short) (nShort1 % nShort2) + " .");
		
		System.out.println("Please enter the first int number:");
		float nFloat1 = input.nextFloat();
		
		System.out.println("Please enter the second int number:");
		float nFloat2 = input.nextFloat();
		
		System.out.println("When you add num1 and and num2 is " + (float) (nFloat1 + nFloat2) + ".");
		System.out.println("When you sub num1 and and num2 is " + (float) (nFloat1 - nFloat2) + ".");
		System.out.println("When you mul num1 and and num2 is " + (float) (nFloat1 * nFloat2) + ".");
		System.out.println("When you div num1 and and num2 is " + (float) (nFloat1 / nFloat2) + ".");
		
		
		System.out.println("Please enter the first int number:");
		double nDouble1 = input.nextDouble();
		
		System.out.println("Please enter the second int number:");
		double nDouble2 = input.nextDouble();
		
		System.out.println("When you add num1 and and num2 is " + (double) (nDouble1 + nDouble2) + ".");
		System.out.println("When you sub num1 and and num2 is " + (double) (nDouble1 - nDouble2) + ".");
		System.out.println("When you mul num1 and and num2 is " + (double) (nDouble1 * nDouble2) + ".");
		System.out.println("When you div num1 and and num2 is " + (double) (nDouble1 / nDouble2) + ".");
	
	}

}
