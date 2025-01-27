import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        int[] count = new int[10];
        int num = 1;
        for(int i=0;i <3;i++) {
            int n = Integer.parseInt(br.readLine());
            num *= n;
        }
        while( num != 0 ) {
            count[num%10]++;
            num /=10;
        }
        for(var e : count) {
            sb.append(e + "\n");
        }
        sb.deleteCharAt(sb.length()-1);
        System.out.print(sb);
    }
}