import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer str;
    static int N, last, size =0;
    static Queue<Integer> q = new LinkedList<>();
    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        while(N-- >0 ) {
            str = new StringTokenizer(br.readLine());
            switch (str.nextToken()) {
                case "push":
                    last = Integer.parseInt(str.nextToken());
                    q.add(last);
                    size++;
                    break;
                case "pop":
                    if(size ==0) sb.append("-1\n");
                    else  {
                        sb.append(q.remove()+"\n");
                        size--;
                    }
                    break;
                case "size":
                    sb.append(size + "\n");
                    break;
                case "empty":
                    if(size ==0) sb.append("1\n");
                    else sb.append("0\n");
                    break;
                case "front" :
                    if(size ==0) sb.append("-1\n");
                    else sb.append(q.peek() + "\n");
                    break;
                default :
                    if(size ==0) sb.append("-1\n");
                    else sb.append(last + "\n");
                    break;
            }
        }
        bw.write(sb.toString());
        bw.close();
    }
}