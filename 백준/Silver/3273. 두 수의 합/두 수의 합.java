import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;
    static int N, num, cnt =0;
    static boolean[] arr;
    public static void main(String[] args) throws IOException {
        sb = new StringBuilder();
        N = Integer.parseInt(br.readLine());
        arr = new boolean [2_000_001];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i < N ;i++) arr[Integer.parseInt(st.nextToken())] = true;
        num = Integer.parseInt(br.readLine());
        for(int i=1;i < num ;i++) {
            if(arr[i] && arr[num-i]) cnt++;
        }
        sb.append(cnt/2);
        System.out.print(sb.toString());
    }
}