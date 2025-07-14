import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;
    static int N, M;
    static int[] grap;
    static int[] nums;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        visited = new boolean[N];
        grap = new int[M];
        nums = new int[N];
        st =  new StringTokenizer(br.readLine());
        for(int i=0;i < N ;i++ ){
            nums[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(nums);
        func(0);
        System.out.print(sb);
    }
    public static void func(int k) {
        if( k== M) {
            for(int i=0;i < M ;i++) {
                sb.append(grap[i]).append(" ");
            }
            sb.append("\n");
        }
        else {
            for(int i=0;i < N ;i++) {
                grap[k] = nums[i];
                func(k+1);
            }
        }
    }
}