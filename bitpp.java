import java.util.Scanner;

public class bitpp
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		
		
		int x = in.nextInt();
		String arr[] = new String[x];
		int count = 0; 
		
		for(int i=0 ;i<x; i++)
		{
			arr[i] = in.next();
			}
			
		for(int i=0; i<x; i++)
		{
			if((arr[i].equals("++X")) || (arr[i].equals("X++")))
			{
				count++;
				}
			if ((arr[i].equals("--X")) || (arr[i].equals("X--")))
			{
				count--;
				}
				
			
			}
			
		System.out.println(count);
		
		
		
		}
	
	
	
	
	}
