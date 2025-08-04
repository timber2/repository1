import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;
    static int T, N, Index;
    static long result;
    static int[] arr;
    public static void main(String[] args) throws IOException {
        T = Integer.parseInt(br.readLine());
        while(T-->0) {
            result = 0;
            N  = Integer.parseInt(br.readLine());
            arr = new int[N];
            st = new StringTokenizer(br.readLine());
            for(int i=0;i < N ;i++) arr[i] = Integer.parseInt(st.nextToken());
            int max = Integer.MIN_VALUE;
            for(int i= N -1 ;i >=0 ; i--) {
                if( arr[i] >= max ) max = arr[i];
                else result += max - arr[i];

            }
            sb.append(result).append("\n");
        }
        System.out.print(sb);
    }
}