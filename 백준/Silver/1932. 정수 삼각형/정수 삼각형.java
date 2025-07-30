import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb =new StringBuilder();
    static StringTokenizer st;
    static int N;
    static int[][] tr;
    static int[][] dp;
    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        tr = new int[N+1][N+1];
        dp = new int[N+1][N+1];
        for(int i=1; i<= N ; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=1 ; j <=i; j++) {
                tr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        dp[1][1] = tr[1][1];
        for(int i= 2; i<= N;i++) {
            for(int j= 1 ; j <= i ;j++) {
                if(j ==1) dp[i][j] = dp[i-1][j] + tr[i][j]; 
                else if (j == i) dp[i][j] = dp[i-1][j-1] + tr[i][j];
                else dp[i][j] = Math.max(dp[i-1][j-1], dp[i-1][j]) + tr[i][j];
            }
        }
        int max = Integer.MIN_VALUE;
        for(int i=1; i<=N ;i++) {
            if(dp[N][i] > max) max = dp[N][i];
        }
        sb.append(max);
        System.out.print(sb);
    }
}