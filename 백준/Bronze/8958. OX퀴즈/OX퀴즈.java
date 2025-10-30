import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static int N, sum;
    static String s;
    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        for(int i=0;i< N ;i++) {
            s = br.readLine();
            sum = 0;
            int cnt = 1;
            for(int j=0; j < s.length();j++) {
                if(s.charAt(j) == 'O') {
                    sum +=cnt;
                    cnt++;
                }
                else cnt = 1;
            }
            sb.append(sum).append("\n");
        }
        System.out.print(sb);
    }
}