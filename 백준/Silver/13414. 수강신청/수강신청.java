import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb =new StringBuilder();
    static StringTokenizer st;
    static int K, L;
    static String[] number;
    static HashMap<String, Integer> map = new HashMap<>();
    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        K = Integer.parseInt(st.nextToken());
        L = Integer.parseInt(st.nextToken());
        number = new String[L + 1];
        for(int i=1 ; i <= L ;i++) map.put(br.readLine(), i);
        for(String s : map.keySet()) number[map.get(s)] = s;
        int idx = 1;
        while(K>0 && idx <= L) {
            if(number[idx] != null) {
                sb.append(number[idx]).append("\n");
                K--;
            }
            idx++;
        }
        System.out.print(sb);
    }
}