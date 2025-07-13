import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;
    static int[] array;
    static int N, count=0;
    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        array = new int[N];
        for(int i=0;i < N ; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(array);
        for(int i=1;i < N ;i++) {
            array[i] +=array[i-1];
        }
        for(int i=0;i < N;i++) {
            count+=array[i];
        }
        sb.append(count);
        System.out.print(sb);
    }
}