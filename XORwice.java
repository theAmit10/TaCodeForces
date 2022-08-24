import java.util.Scanner;

public class XORwice{

	public static void main(String Args[]){
		
		Scanner in = new Scanner(System.in);
		
		int t = in.nextInt();
		
		while(t-->0){
			int a = in.nextInt();
			int b = in.nextInt();
			
			int temp = a | b;
			
			System.out.println((a ^ temp) + (b^temp));
			
			}
	}
	}
