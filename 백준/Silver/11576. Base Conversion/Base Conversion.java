import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer str = new StringTokenizer(br.readLine());
		long A = Integer.parseInt(str.nextToken());
		long B = Integer.parseInt(str.nextToken());
		int m = Integer.parseInt(br.readLine());
		str = new StringTokenizer(br.readLine());
		int[] array = new int [m];
		Stack<Long> S = new Stack<>();
		for(int i=m-1;i>=0;i--) {
			array[i] = Integer.parseInt(str.nextToken());
		} // 16 2
		if(A==B) {
			for(int i=m-1;i>=0;i--) {
				sb.append(array[i] + " ");
			}
			sb.deleteCharAt(sb.length()-1);
			System.out.print(sb);
			System.exit(0);
		}
		long sum =0;
		long n = A;
		for(int i=0;i<m;i++) {
			if(i==0) {
				sum += array[i];
			}
			else {
				sum += array[i] * A;
				A *=n;
			}
		}
		while(sum!=0) {
			S.add(sum%B);
			sum = sum/B;
		}
		while(!S.isEmpty()) {
			 sb.append(S.pop() + " ");
		}
		sb.deleteCharAt(sb.length()-1);
		System.out.print(sb);
	}
}