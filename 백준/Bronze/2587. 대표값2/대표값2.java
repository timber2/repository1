import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        int[] array = new int[5];
        for(int i=0;i < 5 ;i++) {
            int num = Integer.parseInt(br.readLine());
            array[i] =num;
            sum +=num;
        }
        Arrays.sort(array);
        sb.append(sum/5 + "\n");
        sb.append(array[2] + "");
        System.out.print(sb);
    }
}