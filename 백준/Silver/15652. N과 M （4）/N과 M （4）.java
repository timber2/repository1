import java.io.*;
import java.util.*;


public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    static int N,S;
    static int[] array;
    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());
        array = new int[S];
        visited = new boolean[N + 1];
        func(0,1);
        System.out.print(sb);
    }
    public static void func(int k, int prev) {
        if( k == S ) {
            for(int i=0;i < S;i++) {
                sb.append(array[i]).append(" ");
            }
            sb.deleteCharAt(sb.length()-1);
            sb.append("\n");
        }
        else {
            for(int i=prev;i <= N ;i++) {
                if(visited[i] ) continue;
                array[k] = i;
                func(k+1, i);
            }
        }
    }
}