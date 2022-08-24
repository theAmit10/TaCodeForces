import java.util.Scanner;

public class InSearchOfAnEasyProblem{
	public static void main(String Args[]){
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int arr[] = new int[n];
		
		for(int i=0; i<n; i++){
			arr[i] = in.nextInt();
			}
		boolean flag = true;
		for(int i=0;i<n;i++){
			if(arr[i] == 1){
				flag = false;
				}
			else{
				flag = true;
				}
			}
		
		if(flag){
			System.out.println("EASY");
			}
			else{
				System.out.println("HARD");
				}
		}
	}
