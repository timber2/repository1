import java.io.*;
import java.util.*;

class Solution
{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;
    static int T, sum;
    static int[] arr = new int [3];
    public static void main(String args[]) throws Exception
    {
        T= Integer.parseInt(br.readLine());
        for(int test_case = 1; test_case <= T; test_case++)
        {
            sum = 0;
            st = new StringTokenizer(br.readLine());
            int B = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());
            for(int i=0;i < 3 ;i++) arr[i] = Integer.parseInt(st.nextToken());
            int base = B * arr[0] + W * arr[1];
            int cross = 2*Math.min(B,W) * arr[2] + (B- Math.min(B,W)) * arr[0] + (W - Math.min(B,W)) * arr[1];
            sb.append(Math.max(base,cross)).append("\n");
        }
        System.out.print(sb.toString());
    }
}