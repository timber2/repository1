import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;
    static int N, index = 0;
    static String[] array;
    static long[] result;
    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        array = new String[N];
        result = new long[N];
        while(st.hasMoreTokens()) array[index++] = st.nextToken();
        for(int i = index ; i < N ;) {
            st = new StringTokenizer(br.readLine());
            while(st.hasMoreTokens()) array[i++] = st.nextToken();
        }
        for(int i=0;i < N;i++) {
            StringBuilder temp = new StringBuilder(array[i]);
            array[i] = temp.reverse().toString();
            result[i] = Long.parseLong(array[i]);
        }
        Arrays.sort(result);
        for(long e : result) sb.append(e).append("\n");
        System.out.print(sb);
    }
}