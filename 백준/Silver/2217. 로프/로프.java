import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int N, sum =0,  max = Integer.MIN_VALUE;
    static int[] arr;
    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        for(int i=0;i < N ;i++) arr[i] = Integer.parseInt(br.readLine());
        Arrays.sort(arr);
        for(int i= 1; i <=N; i++) {
            sum = arr[N-i] * i;
            max = Math.max(sum,max);
        }
        System.out.print(max);
    }
}