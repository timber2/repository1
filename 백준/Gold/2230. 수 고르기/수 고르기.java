import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N,M,min = Integer.MAX_VALUE;
    static int[] arr;
    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int [N];
        for(int i=0;i < N ;i++) arr[i] = Integer.parseInt(br.readLine());
        Arrays.sort(arr);
        int st = 0 , en = 0;
        while(st < N) {
            while(en < N && arr[en] - arr[st] < M) {
                en++;
            }
            if(en == N) break;
            min = Math.min(min, arr[en] - arr[st]);
            st++;
        }
        System.out.print(min);
    }
}