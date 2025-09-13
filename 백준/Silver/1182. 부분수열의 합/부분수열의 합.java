import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N, S, count =0;
    static int[] arr;
    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());
        arr = new int [N];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i< N ;i++) arr[i] = Integer.parseInt(st.nextToken());
        solve(0, 0);
        if(S ==0) count--;
        System.out.print(count);
    }
    public static void solve(int index, int sum) {
        if(N == index) {
            if(sum == S) count++;
        }
        else {
                solve(index+1, sum + arr[index]);
                solve(index+1,sum);
        }
    }
}
