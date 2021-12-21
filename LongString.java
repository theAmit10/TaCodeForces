import java.util.Scanner;

import java.lang.*;
import java.io.*;


public class LongString{
	
	public static void main(String Args[]) throws java.lang.Exception
	{
		Scanner input = new Scanner(System.in);
		int test = input.nextInt();
		
		while(test --> 0)
		{
			String s = input.next();
			
			int count = 0;
			
			
			if (s.length() > 10)
			{
				count = s.length() - 2;
				
				String str = String.valueOf(count);
				
				int last_item = s.length() - 1;
				
				System.out.println(s.charAt(0) +str  +s.charAt(last_item) );
				
				}
			else{
				
				System.out.println(s);
				
				}
			
			}
		
		
		}
	
	
	}
