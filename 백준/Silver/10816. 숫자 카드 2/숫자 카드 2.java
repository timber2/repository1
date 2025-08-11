import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;
    static int N,M, bound = 10_000_000;
    static int[] arr;
    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        arr = new int [20_000_001];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i< N ;i++) {
            int index = Integer.parseInt(st.nextToken());
            arr[index + bound]++;
        }
        M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        while(st.hasMoreTokens()) sb.append(arr[bound + Integer.parseInt(st.nextToken())]).append(" ");
        System.out.print(sb);
    }
}