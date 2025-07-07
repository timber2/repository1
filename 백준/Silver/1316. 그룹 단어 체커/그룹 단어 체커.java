import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static int T, count =0;
    static boolean[] check;
    public static void main(String[] args) throws IOException {
        T = Integer.parseInt(br.readLine());
        Loop1:
        while(T-->0) {
            check =new boolean[26];
            String s = br.readLine();
            char latest = s.charAt(0);
            for(int i=0;i <s.length();i++) {
                if(check[(int)s.charAt(i) - (int)'a']) continue Loop1;
                if(latest != s.charAt(i)) {
                    check[(int)latest - (int)'a'] = true;
                    latest = s.charAt(i);
                }
            }
            count++;
        }
        sb.append(count);
        System.out.print(sb);
    }
}