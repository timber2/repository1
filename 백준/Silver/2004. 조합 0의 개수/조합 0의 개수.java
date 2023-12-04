import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer str = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(str.nextToken());
		int B = Integer.parseInt(str.nextToken());
		int cnt2,cnt5;
		cnt2 = count2(A) - count2(A-B) - count2(B);
		cnt5 = count5(A) - count5(A-B) - count5(B);
		int result = (cnt2>cnt5) ? cnt5 : cnt2;
		sb.append(result);
		System.out.print(result);
	}
	static int count2(int A) {
		int count = 0;
		while(A/2 !=0) {
			count +=A/2;
			A/=2;
		}
		return count;
	}
	static int count5(int A) {
		int count = 0;
		while(A/5 !=0) {
			count +=A/5;
			A/=5;
		}
		return count;
	}
}