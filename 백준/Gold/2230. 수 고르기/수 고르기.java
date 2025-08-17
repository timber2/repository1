import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N , M, min = 2_000_000_000;
    static int[] arr;
    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int [N];
        for(int i=0;i < N ;i++) arr[i] = Integer.parseInt(br.readLine());
        Arrays.sort(arr);
        for(int i=0;i < N ; i++) {
            int mid, st = i, en = N-1;
            while(st <= en) {
                mid = (st + en)/2;
                int dis = Math.abs(arr[i] - arr[mid]);
                if(dis < M) st = mid +1;
                else {
                    en = mid -1;
                    min = Math.min(min , dis);
                }
            }
        }
        System.out.print(min);
    }
}