import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;
    static LinkedList<Integer> list = new LinkedList<>();
    static ListIterator<Integer> it;
    static int N,K, num;
    public static void main(String[] args) throws IOException {
        sb.append("<");
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        for(int i=1;i <= N ;i++) list.add(i);
        it = list.listIterator();
        while(!list.isEmpty()) {
            for(int i=0;i < K ;i++) {
                if(!it.hasNext()) it = list.listIterator();
                num = it.next();
            }
            it.remove();
            sb.append(num + ", ");
        }
        sb = new StringBuilder(sb.substring(0, sb.length()-2));
        sb.append(">");
        System.out.print(sb.toString());
    }
}