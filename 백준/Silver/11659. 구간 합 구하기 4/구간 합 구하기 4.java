import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;
    static int N,M;
    static int[] array, dp;
    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        array = new int[N+1];
        dp = new int [N+1];
        st = new StringTokenizer(br.readLine());
        for(int i=1; i <= N ;i++) array[i] = Integer.parseInt(st.nextToken());
        dp[1] = array[1];
        for(int i=1; i<=N ;i++) dp[i] = dp[i-1] + array[i];
        while(M-->0) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            sb.append(dp[end]- dp[start-1]).append("\n");
        }
        System.out.print(sb);
    }
}