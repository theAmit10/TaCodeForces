import java.util.Scanner;

public class Team{

public static void main(String Args[])
{
	Scanner input = new Scanner(System.in);
	
	int test = input.nextInt();
	int totalCount = 0;
	
	while(test-- > 0)
	{
		int arr[] = new int[3];
		
		for(int i=0 ; i<arr.length; i++)
		{
			arr[i] = input.nextInt();
			
			}
		int count =0 ;
		
		for(int i=0 ; i<arr.length; i++)
		{
			if(arr[i] == 1)
			{
				count++;
				}
			
			}
			
		if(count >= 2)
		{
			totalCount++;
			} 
		
		
		
		}cs
		
		System.out.println(totalCount);
	
	
	
	}


}
