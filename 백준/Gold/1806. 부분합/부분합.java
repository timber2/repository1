import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N, S, len = Integer.MAX_VALUE;
    static int[] arr;
    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());
        arr = new int [N];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i < N ;i++) arr[i] = Integer.parseInt(st.nextToken());
        int st = 0, en = 0, sum =0;
        while(true) {
            while(en < N && sum < S) {
                sum += arr[en++];
            }
            if(sum < S) break;
            while(sum >= S && st < N ) {
                len = Math.min(len,en-st);
                sum-= arr[st++];
            }
        }
        if(len == Integer.MAX_VALUE) System.out.print(0);
        else System.out.print(len);
    }
}