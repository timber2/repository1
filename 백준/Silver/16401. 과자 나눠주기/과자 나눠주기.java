import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N,M;
    static long max = 0;
    static long[] arr;
    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        arr = new long [N];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i < N ;i++) arr[i] = Long.parseLong(st.nextToken());
        Arrays.sort(arr);
        func(M);
        System.out.print(max);
    }
    public static void func(int M) {
        int mid, st = 1, en = 1_000_000_000;
        long cnt;
        while(st < en) {
            mid = (st+en)/2;
            cnt = calCnt(mid);
            if(cnt  < M) en = mid;
            else {
                max = mid;
                st = mid + 1;
            }
        }
    }
    public static long calCnt(long length) {
        long cnt =0;
        for(int i=arr.length-1;i >=0 ; i--) {
            if(arr[i] / length == 0) break;
            cnt += arr[i]/length;
        }
        return cnt;
    }
}