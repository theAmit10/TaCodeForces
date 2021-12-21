import java.util.Scanner;

public class BearAndBigBrother
{
	public static void main(String arhs[])
	{
		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
		int b = in.nextInt();
		
		
		int year = 0;
		
		
		while(a<=b)
		{
			a = a*3;
			b = b*2 ;
			year++;
			
			}
			
		System.out.println(year);
		}
		
	
	}
