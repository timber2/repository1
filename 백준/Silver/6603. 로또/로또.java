import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb;
    static StringTokenizer st;
    static int[] num;
    static int[] grap =  new int[6];
    static String s;
    static int M;
    public static void main(String[] args) throws IOException {
        while(!(s = br.readLine()).equals("0")) {
            sb = new StringBuilder();
            st = new StringTokenizer(s);
            M = Integer.parseInt(st.nextToken());
            num = new int[M];
            for(int i=0;i < M;i++) {
                num[i]  = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(num);
            dfs(0, 0);
            System.out.print(sb + "\n");
        }
    }
    public static void dfs(int k, int st) {
        if(k == 6) {
            for(int i=0 ; i< 6 ;i++) {
                sb.append(grap[i]).append(" ");
            }
            sb.append("\n");
        }
        else {
            for(int i=st;i < M ;i++) {
                grap[k] = num[i];
                dfs(k+1, i + 1);
            }
        }
    }
}