import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb =  new StringBuilder();
		StringTokenizer str = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(str.nextToken());
		int B = Integer.parseInt(str.nextToken());
		B = swap(A,A=B);
		sb.append(gcd(A,B) + "\n"+ lcm(A,B)/gcd(A,B));
		System.out.print(sb);
	}
	static int swap(int A , int B) {
		return A;
	}
	static int gcd(int A, int B) {
		int R;
		while((R = A%B) !=0) {
			A = B;
			B = R;
		}
		return B;
	}
	static int lcm(int A, int B) {
		return A*B;
	}
}