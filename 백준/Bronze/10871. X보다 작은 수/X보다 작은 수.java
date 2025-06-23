import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        String A = br.readLine();
        StringTokenizer st2 = new StringTokenizer(A, " ");
        st2 = new StringTokenizer(A, " ");
        while(st2.hasMoreTokens()) {
            int num  = Integer.parseInt(st2.nextToken());
            if(num < X) {
                sb.append(num + " ");
            }
        }

        System.out.println(sb);
    }
}