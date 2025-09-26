import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int N, min;
    static int[] dp = new int [50001];
    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        dp[1] = 1;
        for(int i=2; i<=N ;i++) {
            min = Integer.MAX_VALUE;
            for(int j=1 ; j* j <=i ;j++) {
                int temp = i - j*j;
                min = Math.min(min, dp[temp]);
            }
            dp[i] = min +1;

        }
        System.out.print(dp[N]);
    }
}