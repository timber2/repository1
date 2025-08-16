import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N, max =0;
    static int[] arr, dp;
    public static void main(String[] args) throws Exception {
        N = Integer.parseInt(br.readLine());
        arr = new int [N];
        dp = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i < N ;i++) arr[i] = Integer.parseInt(st.nextToken());
        dp[0] = 0;
        for(int i=1; i < N ;i++) {
            for(int j = i-1 ; j >= 0 ;j--) {
                if(arr[i] < arr[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }
        for(int i=0;i < N ;i++) max = Math.max(max, dp[i]);
        System.out.print(max + 1);
    }
}