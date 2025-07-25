import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;
    static int N;
    static Integer[][] array;
    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        array = new Integer[N][2];
        for(int i=0;i < N;i++) {
            st = new StringTokenizer(br.readLine());
            array[i][0] = Integer.parseInt(st.nextToken());
            array[i][1] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(array, (a,b) -> { if(a[1].equals(b[1])) return a[0]-b[0]; else return a[1]-b[1];});
        for(int i=0;i < N;i++) {
            sb.append(array[i][0]).append(" ").append(array[i][1]).append("\n");
        }
        sb.deleteCharAt(sb.length()-1);
        System.out.print(sb);
    }
}