import java.util.Scanner;

public class EvenOdds{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int k = in.nextInt();
		
		int arr[] = new int[n];
		int odd[] = new int[n/2];
		int even[] = new int[n/2];
		
		int count = 1;
		for(int i=0;i<n; i++){
			arr[i] = count;
			count++;
		}
		
		int oddCount = 0;
		int evenCount = 0;
		
		for(int i=0; i<n;i++){
			if(arr[i]%2==0){
				even[evenCount] = arr[i];
				evenCount++;
				}
			else{
				odd[oddCount] = arr[i];
				oddCount++;
				}
			
			}
			
		for(int i=0;i<n/2;i++){
			arr[i] = odd[i];
			}

		for(int i=n/2; i<n; i++){
			arr[i] = even[i];
			}
			
		System.out.println(arr[k-1]);
		
		}
	}
