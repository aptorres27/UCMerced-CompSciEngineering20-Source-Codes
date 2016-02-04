import java.util.Scanner;
public class DataAnalyze {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please Enter the Sample Size: ");
		int sampleSize = input.nextInt();
		int trialSize = 4;
		
		int[] data = new int[sampleSize * trialSize];
		int[] total = new int[trialSize];
		int[] average = new int [trialSize];
		
		int i = 0;
		int j = 0;
		
		//trial loop
		for (i=0;i <trialSize;i++)
		{
			System.out.println("Enter number number for Trial " + i);
			//sample loop
			for (j=0;j<sampleSize;j++)
			{
			System.out.print("Enter Sample # " + j + ":");
			data[j* trialSize + i] = input.nextInt();
			total[i] += data[j* trialSize + i];
		}
			
	}
	// calculation average for each trial	
	for (i=0; i<trialSize; i++)
		average[i] = total[i] / sampleSize;
	
	int min = average[0];
	int max = average[0];
	
	for (i=0; i<trialSize; i++)
	{
		if (average[i]< min)
			min = average[i];
		if (average[i]> max)
			max = average[i];
	}
	
	//printing
	System.out.println("\tSample #\t Trial 1\t Trial 2\t Trial 3\t Trial 4"); // Table header line
	
	for (j=0; j < sampleSize; j++)
	{
		System.out.print(j + "\t\t");
		//trial loop
		for (i=0; i < trialSize; i++)
		{
		System.out.print("\t" + data[j* trialSize + i] + "\t");
		
	}
		System.out.print("\n");
}
	System.out.println("---------------------------------------------------------------------");
	System.out.print("Average \t");
	System.out.print("\n");
	
	for (i=0; i<trialSize; i++)
		System.out.print(average[i] + "\t\t");
	System.out.print("\n");
	System.out.println("Min average " + ": " + min);
	System.out.println("Max average " + ": " + max);
	System.out.println("\n");
	
	if (min == max)
		System.out.println("The trials match EXACTLY!");
	else 
		System.out.println("The trials do NOT concur!");
	}
}
