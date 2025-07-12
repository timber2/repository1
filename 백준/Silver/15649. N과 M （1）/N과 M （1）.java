import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer str;
    static int N,M;
    static int[] grap;
    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        str = new StringTokenizer(br.readLine());
        N = Integer.parseInt(str.nextToken());
        M = Integer.parseInt(str.nextToken());
        grap = new int[M];
        visited = new boolean[N];
        func(0);
        sb.deleteCharAt(sb.length()-1);
        System.out.print(sb);
    }
    public static void func(int k) {
        if(k == M) {
            for(int i=0; i < M ;i++) {
                sb.append(grap[i]).append(" ");
            }
            sb.deleteCharAt(sb.length()-1);
            sb.append("\n");
        }
        else {
            for(int i= 1;i <=N ;i++) {
                if(visited[i-1] == false) {
                    grap[k] = i;
                    visited[i-1] = true;
                    func(k+1);
                    visited[i-1] = false;
                }
            }
        }
    }
}