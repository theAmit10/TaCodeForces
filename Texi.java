import java.util.Scanner;


public class Texi{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int arr[] = new int[n];
		
		int sum= 0;
		
		for(int i=0; i<n; i++){
			arr[i] = in.nextInt();
			sum += arr[i];
			}
			
		int temp = sum / 4;
		int rem = sum % 4;
		int ans = temp ;
		if(rem == 0){
			ans += rem;
			}else{
				ans += 1 ;
				}
		
		int one  = 1;
		
		if(sum<4){
			System.out.println(one);
			}else{
				System.out.println(ans);
				}
		}
	}
