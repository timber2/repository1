import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static int T, k, n;
    static int[][] dp;
    public static void main(String[] args) throws IOException {
        T = Integer.parseInt(br.readLine());
        while(T-->0) {
            k = Integer.parseInt(br.readLine());
            n = Integer.parseInt(br.readLine());
            dp = new int [k+1][n];
            for(int i=0; i < n ;i++) dp[0][i] = i+1;
            for(int i=1 ; i<= k ; i++) {
                dp[i][0] = 1;
                for(int j= 1 ; j< n ;j++) {
                    dp[i][j] = dp[i][j-1] + dp[i-1][j];
                }
            }
            sb.append(dp[k][n-1]).append("\n");
        }
        System.out.print(sb.toString());
    }
}