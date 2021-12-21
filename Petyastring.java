import java.util.Scanner;

public class Petyastring
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		
		String a = in.next();
		String b = in.next();
		
		a = a.toLowerCase();
		b = b.toLowerCase();
		
		
		int answer = 0;
	
			
		for(int i=0; i<a.length(); i++)
				{
				if(a.charAt(i) == b.charAt(i))
				{continue;}
				else if(a.charAt(i) < b.charAt(i) )
				{answer = -1;
				break;
				}
				else
				{
				answer = 1;
				break;
				}
			}
			
		System.out.println(answer);
		
	}
	}
		
	
	
	
	
