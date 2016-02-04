
public class FindDuplicate {

	public static void main(String[] args) {
		int[] arr = {1, 2, 2, 3, 4, 2, 4, 3, 0, 5, 3, 2};
		
		// Fill-in
		for (int i = 0; i < arr.length; i++)
			for (int j = i + 1;  j < arr.length; j++){
				if(arr[i] == arr[j])
					System.out.println("Index " + i + " same as index " + j + " with value: " + arr[i]);
			}
	}

}
