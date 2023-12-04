import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		while((T--)!=0) {
			StringBuilder sb = new StringBuilder();
			StringTokenizer str = new StringTokenizer(br.readLine());
			long count = 0;
			int N = Integer.parseInt(str.nextToken());
			int[] array = new int [N];
			for(int i=0;i<N;i++) {
				array[i] = Integer.parseInt(str.nextToken());
			}
			for(int i=0;i<N-1;i++) {
				for(int j=i+1;j<N;j++) {
					count+=GCD(array[i],array[j]);
				}
			}
			sb.append(count);
			System.out.println(sb);
		}
	}
	static int GCD(int A, int B) {
		if(A < B) {
			B = swap(A,A=B);
		}
		int r;
		while(B !=0) {
			r = A%B;
			A = B;
			B = r;
		}
		return A;
	}
	static int swap(int A, int B) {
		return A;
	}
}