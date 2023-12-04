import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer str = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(str.nextToken());
		int S = Integer.parseInt(str.nextToken());
		int [] array = new int [N];
		str = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			array[i] = Math.abs(Integer.parseInt(str.nextToken())-S);
		}
		if(N==1) {
			System.out.print(array[0]);
			System.exit(0);
		}
		int num = array[0];
		for(int i=1;i<N;i++) {
			num = GCD(num,array[i]);
		}
		sb.append(num);
		System.out.print(sb);
	}
	static int GCD(int A, int B) {
		if(A<B) {
			B = swap(A,A=B);
		}
		int r;
		while(B!=0) {
			r = A%B;
			A = B;
			B =r;
		}
		return A;
	}
	static int swap(int A, int B) {
		return A;
	}
}