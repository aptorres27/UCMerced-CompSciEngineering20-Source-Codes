import java.util.Scanner;

public class BooleanOp{
	public static void main(String[] args) {
		int a = 0, b = 0 , c = 0;

		System.out.println('A' + " is character");
		Scanner in = new Scanner(System.in);
		System.out.print("Input the first number: ");
		a = in.nextInt();
		System.out.print("Input the second number: ");
		b = in.nextInt();
		System.out.print("Input the third number: ");
		c = in.nextInt();
		
		System.out.println("a = " + a + " and b = " + b + " and c = " + c);
		System.out.println(a + " is greater than " + b + " : " + (a > b));
		
		System.out.println(a + " is less than " + b + " : " + (a < b));
		System.out.println(a + " is equal to " + b + " : " +  (a == b));
		
		System.out.println(a + " is greater or equal to " + b + " : " + (a >= b));
		System.out.println(a + " is less than or equal to " + b + " : " + (a <= b));
		System.out.println(a + " is not equal to " + b + " : " + (a != b));

		System.out.println(a + " is greater than " + b + " OR " + a + " is equal to " + c + " : " + (a > b || a == c));
		System.out.println(a + " is less than " + b + " OR " + a + " is equal to " + c + " : " + (a < b || a == c));
		System.out.println(a + " is equal to " + b + " OR " + a + " is equal to " + c + " : " + (a == b || a ==c));
		System.out.println(a + " is greater or equal to " + b + " AND " + a + " is equal to " + c + " : " + (a >= b && a == c));
		System.out.println(a + " is less than or equal to " + b + " AND " + a + " is equal to " + c + " : " + (a <= b && a == c ));
		System.out.println(a + " is not equal to " + b + " AND " + a + " is equal to " + c + " : " + (a!= b && a == c));

		System.out.println(a + " is less than " + b + " OR " + a + " is greater than " + c + " : " + (a < b || a > c) );
		System.out.println(a + " is less than " + b + " OR " + a + " is less than " + c + " : " + (a < b || a < c));
		System.out.println(a + " is less than " + b + " OR " + a + " is equal to " + c + " : " + (a < b || a == c));
		System.out.println(a + " is less than " + b + " AND " + a + " is greater or equal to " + c + " : " + (a < b && a >= c));
		System.out.println(a + " is less than " + b + " AND " + a + " is less than or equal to " + c + " : " + (a < b && a <= c));
		System.out.println(a + " is less than " + b + " AND " + a + " is not equal to " + c + " : " + (a < b && a != c));
		
	}
} 