import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N, max =Integer.MIN_VALUE;
    static int[] arr,dp;
    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        arr = new int [N+1];
        dp = new int [N+1];
        st = new StringTokenizer(br.readLine());
        for(int i=1; i <= N ;i++) arr[i] = Integer.parseInt(st.nextToken());
        for(int i=1 ;i <=N ;i++) dp[i] = Math.max(arr[i] , dp[i-1] + arr[i]);
        for(int i=1; i <=N ;i++) if( dp[i] > max) max = dp[i];
        System.out.print(max);
    }
}