import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb;
        ArrayDeque<Integer> q;
        boolean reverse;
        int T = Integer.parseInt(br.readLine());
        StringTokenizer str;
        Loop1:
        while(T-- >0) {
            reverse = false;
            sb = new StringBuilder();
            q = new ArrayDeque<>();
            String p = br.readLine();
            int n = Integer.parseInt(br.readLine());
            str = new StringTokenizer(br.readLine(), "[,]");
            while(str.hasMoreTokens()) {
                String a = str.nextToken();
                q.addLast(Integer.parseInt(a));
            }
            for(int i=0;i <p.length();i++) {
                if(p.charAt(i) == 'R') {
                    reverse = !reverse;
                }
                else { // D
                    if (q.size() ==0) {
                        System.out.println("error");
                        continue Loop1;
                    }
                    else  {
                        if(reverse) q.removeLast();
                        else q.removeFirst();
                    }
                }
            }
            sb = new StringBuilder();
            sb.append("[");
            if(reverse) {
                while(!q.isEmpty()) {
                    sb.append(q.removeLast() + ",");
                }
            }
            else {
                while(!q.isEmpty()) {
                    sb.append(q.removeFirst() + ",");
                }
            }
            if(sb.charAt(sb.length()-1) == ',') sb.deleteCharAt(sb.length()-1);
            sb.append("]");
            System.out.println(sb);
            // ---------------------------
        }
    }
}