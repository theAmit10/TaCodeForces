import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;


public class TwoThreeMoves{

	
		public static void main(String[] args) {	
		FastScanner in = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		
		
		
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
				
				out.println(ans);
				continue;
				
		}
		out.close();
		
	}
	
	static void sort(int[] a) {
		ArrayList<Integer> arr = new ArrayList<>();
		for (int x : a) {
			arr.add(x);
		}
		Collections.sort(arr);
		for (int i = 0; i < a.length; i++) {
			a[i] = arr.get(i);
		}
	}
	
	static void swap(int[] a, int x, int y) {
		int temp = a[x];
		a[x] = a[y];
		a[y] = temp;
	}
	
	static class FastScanner {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer("");
		
		String next() {
			while (!st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}
		
		int nextInt() {
			return Integer.parseInt(next());
		}
		
		int[] readArray(int n) {
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = nextInt();
			}
			return a;
		}
		
		long[] readLongArray(int n) {
			long[] a = new long[n];
			for (int i = 0; i < n; i++) {
				a[i] = nextLong();
			}
			return a;
		}
		
		long nextLong() {
			return Long.parseLong(next());
		}
		
		double nextDouble() {
			return Double.parseDouble(next());
		}
		
		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch(IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}
}
