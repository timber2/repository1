import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static int N;
    static int[] array;
    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        array = new int[N];
        for(int i=0;i < N  ; i++){
            array[i]= Integer.parseInt(br.readLine());
        }
        Arrays.sort(array);
        for(int e : array) sb.append(e + "\n");
        System.out.print(sb);
    }
}