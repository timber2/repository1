import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int N , target;
    static long[] dp;
    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        dp = new long[N+1];
        dp[1] =1;
        if(N>=2) dp[2] =1;
        for(int i=3; i<=N ;i++) dp[i] = dp[i-1] + dp[i-2];
        System.out.print(dp[N]);
    }
}