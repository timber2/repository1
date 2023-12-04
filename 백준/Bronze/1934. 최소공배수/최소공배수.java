import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		for(int i=0;i<T;i++) {
			StringTokenizer str = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(str.nextToken());
			int B = Integer.parseInt(str.nextToken());
			B = swap(A, A = B);
			sb.append(A*B/lcm(A,B) + "\n");
		}
		sb.deleteCharAt(sb.length()-1);
		System.out.print(sb);
	}
	static int swap(int A, int B) {
		return A;
	}
	static int lcm(int A, int B) {
		int R;
		while((R = A%B) !=0) {
			A = B;
			B = R;
		}
		return B;
	}
}