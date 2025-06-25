import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int num = 1;
        int[] array = new int[10];
        for(int i=0;i <3 ;i++) {
            num *= Integer.parseInt(br.readLine());
        }
        // 32130248
        while(num > 0) {
            array[num%10]++;
            num /=10;
        }
        for(int i=0;i <10;i++) {
            sb.append(array[i] + "\n");
        }
        System.out.print(sb);
    }
}
