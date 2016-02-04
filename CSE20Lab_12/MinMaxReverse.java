
public class MinMaxReverse {

	public static void main(String[] args) {
		int[] arr = {1, 2, -3000, 4, 5, -100, 3, 50000, 700, 2, 4, 6, 8000};
		int[] rev_arr = new int [arr.length]; //[arr.length] property or attribute of that array with dot that's an attribute

		int min = arr[0], minIndex = 0;
		int max = arr[0], maxIndex = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max)
			{
				max = arr [i];
				maxIndex = i;
			}
			if (arr[i] < min)
			{
				min = arr[i];
				minIndex = i;
			}
			/* Fill in your code here to find min/max
			 * There's only one loop needed
			 */	
		}

		System.out.println("Min number is " + min + " found at index " + minIndex);
		System.out.println("Max number is " + max + " found at index " + maxIndex);

		for (int i = 0; i < arr.length; i++) {
			rev_arr[arr.length - 1 - i] = arr[i];
			/* Fill in your code here 
			 * To reverse the arr into rev_arr
			 */	
		}

		// Printing out the results
		System.out.println("\nPrinting out both array contents and they should be the same");
		for (int i = arr.length; i > 0; i--) {
			System.out.print("Arr[" + (arr.length-i) + "]=" + arr[arr.length-i]);
			System.out.println("\tsame as \tRev_Arr[" + (i-1) + "]=" + rev_arr[i-1]);
			
			
		}
		

	}

}
