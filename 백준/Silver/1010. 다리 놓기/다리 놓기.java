import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    static int T, N , M;
    static int[][] dp;
    public static void main(String[] args) throws IOException {
        dp = new int [31][31];
        for(int i=1; i<= 30 ;i++) dp[i][i] = 1;
        for(int i=1; i <= 30 ;i++) dp[1][i] = i;
        for(int i=2; i<= 30 ;i++) {
            for(int j= i+1 ; j<= 30 ;j++) dp[i][j] = dp[i-1][j-1] + dp[i][j-1];
        }
        T = Integer.parseInt(br.readLine());
        while(T-->0) {
            st = new StringTokenizer(br.readLine());
            sb.append(dp[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())]).append("\n");
        }
        System.out.print(sb.toString());
    }
}