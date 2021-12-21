import java.util.Scanner;

public class StonesOnTheTable
{
	public static void main(String Args[])
	{
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		String s = in.next();
		
		
		int one = 0;
		int two = 1;
		int count = 0;
		
		
		while(two != n )
		{
			if(s.charAt(one) == s.charAt(two))
			{
				count++;
				}
			one++;
			two++;
			}
			
		System.out.println(count);	
		
	}
	
}
