
public class Errors9 {

	public static void main(String[] args) {
		double[] inp = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0}; //3 errors displacement of commas & periods then semicolon needed
		double sum = 0; //2 errors changed to double and added = 0
		
		for (int i = 1; i <= inp.length-1; ++i ) { 
			sum += inp[i] * inp [i]; // 4 errors changed S to s, added +, changed + to *, deleted i*i
			System.out.println("Squared of index " + i + " is " + inp[i] * inp[i]); // 3 errors changed sum to i, added * and inp[i]
		}
		System.out.println("Sum of Squares is " + sum);
	}

}
