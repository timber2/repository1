import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static long N;
    static long[] dp;
    public static void main(String[] args) throws IOException {
        N = Long.parseLong(br.readLine());
        dp = new long[(int)N+1];
        dp[1] = 1;
        if(N >= 2) dp[2] = 1;
        for(int i=3; i <= N ;i++) dp[i] = dp[i-1] + dp[i-2];
        sb.append(dp[(int)N]);
        System.out.print(sb);
    }
}