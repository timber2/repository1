import java.util.*;
import java.io.*;
public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;
    static int N,max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
    static int[] array;
    static int[] operator = new int[4];
    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        array = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) array[i] = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) operator[i] = Integer.parseInt(st.nextToken());
        func(0, array[0]);
        sb.append(max).append("\n").append(min);
        System.out.print(sb);
    }
    public static void func(int depth, int res) {
        if(depth == N-1) {
            min = Math.min(res,min);
            max = Math.max(res,max);
            return;
        }
        else {
            for(int i=0;i < operator.length;i++) {
                if(operator[i] == 0) continue;
                else {
                    operator[i]--;
                    if (i == 0) func(depth + 1, res + array[depth+1]);
                    else if (i == 1) func(depth + 1, res - array[depth+1]);
                    else if (i == 2) func(depth + 1, res * array[depth+1]);
                    else func(depth + 1, res / array[depth+1]);
                    operator[i]++;
                }
            }
        }
    }
}