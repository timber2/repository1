import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;
    static int[] arr;
    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        arr = new int [N];
        for(int i=0;i < M ;i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken()) -1;
            int end = Integer.parseInt(st.nextToken()) -1;
            int num = Integer.parseInt(st.nextToken());
            for(int j= start  ; j <= end ; j++) {
                arr[j] = num;
            }
        }
        for(int e : arr) sb.append(e + " ");
        System.out.print(sb.toString());
    }
}