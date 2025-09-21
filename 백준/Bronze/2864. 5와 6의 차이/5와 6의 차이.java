import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int max, min;
    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        while(st.hasMoreTokens()) {
            String s = st.nextToken();
            StringBuilder sb = new StringBuilder(s);
            for(int i=0; i < s.length();i++) {
                if(s.charAt(i) == '5') sb.setCharAt(i,'6');
            }
            max += Integer.parseInt(sb.toString());
            sb = new StringBuilder(s);
            for(int i=0;i < s.length();i++) {
                if(s.charAt(i) == '6') sb.setCharAt(i, '5');
            }
            min += Integer.parseInt(sb.toString());
        }
        System.out.print(min + " " + max);
    }
}