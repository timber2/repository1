import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
//        Deque<Integer> q = new LinkedList<>();
        ArrayDeque<Integer> q = new ArrayDeque<>();
        for(int i=1 ;i  <= N ;i++) q.add(i);
        int first, target, left,right, count = 0;
        st = new StringTokenizer(br.readLine());
        while(st.hasMoreTokens()) {
            first = q.getFirst();
            target = Integer.parseInt(st.nextToken());
            // 좌측으로 회전
            left = 0;
            while(q.getFirst() != target) {
                q.addLast(q.getFirst());
                q.removeFirst();
                left++;
            }
            while(q.getFirst() != first) {
                q.addLast(q.getFirst());
                q.removeFirst();
            }
            // 오른쪽으로 회전
            right = 0;
            while(q.getFirst() != target) {
                q.addFirst(q.getLast());
                q.removeLast();
                right++;

            }
            q.removeFirst();
            count += (left>right) ? right : left;
        }
        sb.append(count);
        System.out.print(sb);
    }
}