import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb;
    static StringTokenizer str;
    static int N, last, size =0;
    static Queue<Integer> q = new LinkedList<>();
    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        while(N-- >0 ) {
            sb = new StringBuilder();
            str = new StringTokenizer(br.readLine());
            switch (str.nextToken()) {
                case "push":
                    last = Integer.parseInt(str.nextToken());
                    q.add(last);
                    size++;
                    break;
                case "pop":
                    if(size ==0) sb.append("-1");
                    else  {
                        sb.append(q.remove() );
                        size--;
                    }
                    bw.write(sb.toString() + "\n");
                    break;
                case "size":
                    sb.append(size);
                    bw.write(sb.toString() + "\n");
                    break;
                case "empty":
                    if(size ==0) sb.append("1");
                    else sb.append("0");
                    bw.write(sb.toString() + "\n");
                    break;
                case "front" :
                    if(size ==0) sb.append("-1");
                    else sb.append(q.peek());
                    bw.write(sb.toString() + "\n");
                    break;
                default :
                    if(size ==0) sb.append("-1");
                    else sb.append(last);
                    bw.write(sb.toString() + "\n");
                    break;
            }
        }
        bw.flush();
    }
}