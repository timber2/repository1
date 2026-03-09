import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;
    static int n,w,L;
    static ArrayDeque<Integer> q = new ArrayDeque<>();
    static ArrayDeque<Integer> bridge = new ArrayDeque<>();
    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        w = Integer.parseInt(st.nextToken());
        L = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for(int i=0; i< w ;i++) bridge.add(0);
        for(int i=0;i <n ;i++) q.add(Integer.parseInt(st.nextToken()));
        int time =0, totalWeight = 0;
        while(!bridge.isEmpty()) {
            time++;
            totalWeight -= bridge.poll();
            if(!q.isEmpty()) {
                if(q.peek() + totalWeight <= L) {
                    totalWeight += q.peek();
                    bridge.add(q.poll());
                }
                else {
                    bridge.add(0);
                }
            }
        }
        sb.append(time);
        System.out.print(sb.toString());
    }
}