import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int Y =0 ,M =0, num;
        int[] array = new int [N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            num = Integer.parseInt(st.nextToken());
            Y += fun1(num);
            M += fun2(num);
        }
        if (Y < M ) {
            sb.append("Y " + Y);
        }
        else if (M < Y) {
            sb.append("M "+ M);
        }
        else {
            sb.append("Y M " + Y);
        }
        System.out.println(sb);
    }
    public static int fun1(int a) {
        return (a/30 +1) * 10;
    }
    public static int fun2(int a) {
        return (a/60 + 1) *15;
    }
}