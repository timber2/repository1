import java.util.*;
import java.io.*;

public class Main {
	static int [] dp;
	static int N;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {
		StringBuilder sb = new StringBuilder();
		N = Integer.parseInt(br.readLine());
		dp = new int [N+1];
		Arrays.fill(dp,  -1);
		dp[1] = 0;
		if(N >=2) {
			dp[2] =1;
			if(N>=3) {
				dp[3] = 1;
			}
		}
		for(int i=4;i<=N;i++) {
			dp[i] = func(i) + 1;
		}
		sb.append(dp[N]);
		System.out.print(sb);
	}
	static int func(int i) {
		int a= dp[i/3],b = dp[i/2],c = dp[i-1];
		if(i%3!=0) {
			a = Integer.MAX_VALUE;
		}
		if(i%2!=0) {
			b = Integer.MAX_VALUE;
		}
		return Math.min(Math.min(a,b),c);
	}
}