import java.util.Scanner;

public class AndThenThereWareK{

	public static void main(String Args[]){
		
		Scanner in = new Scanner(System.in);
		
		int t = in.nextInt();
		
		int arr[] = new int[t];
	
		
		for(int j=0; j<t; j++){
			int n = in.nextInt();
			
			int x = 1;
			
			while(true){
				if(x*2>n){
					arr[j] = x-1;
					break;
					}
				x*=2;
				
				}
			
			}
			
			for(int i=0 ; i<t; i++){
			System.out.println(arr[i]);
			}
		
		
		}

}
