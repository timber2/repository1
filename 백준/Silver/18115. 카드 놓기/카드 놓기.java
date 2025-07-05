import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;
    static ArrayDeque<Integer> q = new ArrayDeque<>();
    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int[] array = new int[N];
        for(int i=N-1 ;i >= 0;i--) {
            array[i] = Integer.parseInt(st.nextToken());
        }
        for(int i=1;i <=N ;i++) {
            if(array[i-1] ==1) q.addFirst(i);
            else if (array[i-1]== 3) q.addLast(i);
            else {
                if(q.size() < 2) q.addLast(i);
                else {
                    int temp = q.removeFirst();
                    q.addFirst(i);
                    q.addFirst(temp);
                }
            }
        }
        for(int e : q) {
            sb.append(e + " ");
        }
        System.out.print(sb);
    }
}