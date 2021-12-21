import java.util.Scanner;
import java.util.*;

public class BoyAndGirl
{
	public static void main(String Args[])
	{
		Scanner in = new Scanner(System.in);
		
		String s = in.next();
		
		Set<Character> am = new HashSet<Character>();
		
		for(int i=0; i<s.length(); i++)
		{
			am.add(s.charAt(i));
			}
		
		int len = am.size();
		
		if(len % 2 == 0)
		{
			System.out.print("CHAT WITH HER!");
			
			}
		else{
			System.out.println("IGNORE HIM!");
			}
		
		
		}
	}
