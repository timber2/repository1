import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;
    static int N,M, max = Integer.MIN_VALUE;
    static int[] grap;
    static int[] nums = new int[10001];
    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        grap = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int temp = Integer.parseInt(st.nextToken());
            if(temp > max ) max = temp;
            nums[temp]++;
        }
        func(0);
        System.out.print(sb);
    }
    public static void func(int k) {
        if(k == M ) {
            for(int i=0;i < M ;i++) {
                sb.append(grap[i]).append(" ");
            }
            sb.append("\n");
        }
        else {
            for(int i=1;i <= max ;i++) {
                if(nums[i] == 0) continue;
                grap[k] = i;
                nums[i]--;
                func(k+1);
                nums[i]++;
            }
        }
    }
}