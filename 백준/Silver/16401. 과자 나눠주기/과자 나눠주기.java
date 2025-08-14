import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N,M, result =0, max =0;
    static int[] arr;
    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        arr = new int [N];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i < N ;i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            max = Math.max(max,arr[i]);
        }
        func(M);
        System.out.print(result);
    }
    public static void func(int M) {
        int cnt, mid, st = 1, en = max;
        while(st <= en) {
            mid = (st+en)/2;
            cnt = calCnt(mid);
            if(cnt  < M) en = mid -1;
            else {
                result = mid;
                st = mid + 1;
            }
        }
    }
    public static int calCnt(int length) {
        int cnt =0;
        for(int i=0;i < N; i++) cnt += arr[i]/length;
        return cnt;
    }
}