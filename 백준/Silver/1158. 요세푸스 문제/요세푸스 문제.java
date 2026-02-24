import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;
    static int N,K;
    static ArrayDeque<Integer> q = new ArrayDeque<>();
    public static void main(String[] args) throws IOException {
        sb.append("<");
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        for(int i=1;i <=N ;i++) q.add(i);
        while(!q.isEmpty()) {
            for(int i=0;i <K-1; i++) q.add(q.removeFirst());
            sb.append(q.removeFirst() + ", ");
        }
        sb.deleteCharAt(sb.length()-1);
        sb.deleteCharAt(sb.length()-1);
        sb.append(">");
        System.out.print(sb.toString());
    }
}