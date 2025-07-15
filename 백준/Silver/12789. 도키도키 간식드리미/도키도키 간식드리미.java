import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer str;
    static Stack<Integer> s = new Stack<>();
    static int N,  num, now= 1;
    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        str = new StringTokenizer(br.readLine());
        Loop1:
        while(N-->0) {
            num = Integer.parseInt(str.nextToken());
            while(num == now || (!s.isEmpty() &&s.peek() == now)) {
                if(num == now) {
                    now++;
                    continue Loop1;
                }
                else {
                    s.pop();
                    now++;
                }
            }
            if(!s.isEmpty() && num > s.peek()) {
                sb.append("Sad");
                System.out.print(sb);
                return;
            }
            s.push(num);
        }
        sb.append("Nice");
        System.out.print(sb);
    }
}