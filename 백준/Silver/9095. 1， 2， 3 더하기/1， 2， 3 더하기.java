import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static int X, T;
    static int[] array;
    public static void main(String[] args) throws IOException {
        array = new int[12];
        array[1] = 1;
        array[2] = 2;
        array[3] = 4;
        for(int i=4 ; i<=11 ;i++) {
            array[i] = array[i-1] + array[i-2] + array[i-3];
        }
        T = Integer.parseInt(br.readLine());
        while(T-->0) {
            X = Integer.parseInt(br.readLine());
            sb.append(array[X]).append("\n");
        }
        System.out.print(sb);
    }
}