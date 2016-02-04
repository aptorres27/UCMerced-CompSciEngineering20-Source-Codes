import java.util.Scanner;

public class Interviewer {

	public static void main(String[] args) {
		//Q1
		System.out.println("What is your name?");
		Scanner input = new Scanner(System.in);
		String name;
		name = input.nextLine();
		
		//Q2
		System.out.println("What is your major?");
		Scanner input2 = new Scanner(System.in);
		String major;
		major = input.nextLine();
		
		//Q3
		System.out.println("How old are you?");
		Scanner input3 = new Scanner(System.in);
		String Age;
		Age = input.nextLine();
		
		//Q4
		System.out.println("Where are you from?");
		Scanner input4 = new Scanner(System.in);
		String place;
		place = input.nextLine();
	
		//Q5
		System.out.println("What is your gender?");
		Scanner input5 = new Scanner(System.in);
		String gender;
		gender = input.nextLine();
	
		System.out.print(" I had an interview with ");
		System.out.println(name + ".");
		
		System.out.print(" This person's major is ");
		System.out.println(major + ".");
		
		System.out.print(" This person's age is ");
		System.out.print(Age );
		System.out.println(" years old.");
		
		System.out.print(" This person is from ");
		System.out.println(place + ".");
		
		System.out.print(" This person is a " + gender + ".");
		
}
}
