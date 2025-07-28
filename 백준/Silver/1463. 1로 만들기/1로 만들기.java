import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static int X;
    static int[] array;
    public static void main(String[] args) throws IOException {
        X = Integer.parseInt(br.readLine());
        array = new int[X+1];
        dp(X);
        sb.append(array[X]);
        System.out.print(sb);
    }
    public static void dp(int X) {
        array[1] = 0;
        if(X >=2 ) array[2] = 1;
        if(X>=3 ) array[3] =1;
        for(int i=2; i<X ;i++) {
            if(i*2 <= X && (array[i*2] == 0 || array[i*2] > array[i]+1 )){
                array[i*2] = array[i] +1;
            }
            if(i*3 <= X && (array[i*3] == 0 || array[i*3] > array[i]+1 )) {
                array[i*3] = array[i] +1;
            }
            if(i + 1 <= X && (array[i+1] == 0 || array[i+1] > array[i]+1 )) {
                array[i+1] = array[i]+1;
            }
        }
    }
}