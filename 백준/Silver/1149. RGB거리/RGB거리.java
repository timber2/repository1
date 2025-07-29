import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;
    static int N;
    static int[][] c,d;
    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        c = new int[N+1][3];
        d = new int[N+1][3];
        for(int i=1; i<= N ;i++) {
            st = new StringTokenizer(br.readLine());
            c[i][0] = Integer.parseInt(st.nextToken());
            c[i][1] = Integer.parseInt(st.nextToken());
            c[i][2] = Integer.parseInt(st.nextToken());
        }
        d[1][0] = c[1][0];
        d[1][1] = c[1][1];
        d[1][2] = c[1][2];
        for(int i=2 ; i <= N ;i++) {
            d[i][0] = Math.min(d[i-1][1], d[i-1][2]) + c[i][0];
            d[i][1] = Math.min(d[i-1][0], d[i-1][2]) + c[i][1];
            d[i][2] = Math.min(d[i-1][0], d[i-1][1]) + c[i][2];
        }
        sb.append(Math.min(Math.min(d[N][0], d[N][1]), d[N][2]));
        System.out.print(sb);
    }
}