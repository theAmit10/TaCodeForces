/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		
		int t = in.nextInt();
		while(t-->0){
			int n = in.nextInt();
			
			int ans = 0;
			int pointer = 0;
			int temp = 0;
			
			while(pointer != n){
				temp = n - pointer;
				temp = Math.abs(temp);
				
				if(((temp & 1) == 0) && (temp % 3 != 0)  ){
					if(pointer < n){
						pointer = pointer + 2;
						}else{
							pointer = pointer - 2;
							}
							ans++;
					}else{
						if(pointer < n){
							pointer = pointer + 3;
							}else{
								pointer = pointer - 3;
								}
								ans++;
						}
				
				}
				
				System.out.println(ans);
				
		}
		
	}
	
	
	
	public static void main (String[] args) 
	{
		// your code goes here
		Scanner in = new Scanner(System.in);
		HashMap<int, int> hm = new HashMap<int,int>();
		
		int t = in.nextInt();
		
		for(int z=0; z<t; z++){
		    int n = in.nextInt();
		    int arr[] = new int[n];
		    
		    for(int i=0; i<n; i++){
		       arr[i] = in.nextInt();
		       hm .put()
		    }
		    
		    int len = n/2;
		    if((len & 1) == 0)
				{
					
				}
			else{
				
				
				}
		    
		    
		 
		    
		}
		
	}
}
