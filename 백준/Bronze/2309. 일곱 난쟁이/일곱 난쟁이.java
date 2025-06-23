import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] array = new int [9];
        int sum = 0;
        for(int i= 0 ; i < 9;i++) {
            array[i] = Integer.parseInt(br.readLine());
            sum += array[i];
        }
        int i=0,j=0;
        Arrays.sort(array);
        Loop1:
        for(i=0 ; i < 8 ; i++) {
            for(j = i+1 ; j <9 ;j++) {
                if(array[i] + array[j] == sum - 100) {
                    break Loop1;
                }
            }
        }
        for(int k=0;k < 9 ;k++) {
            if( k == i || k ==j) {
                continue;
            }
            else {
                sb.append(array[k] + "\n");
            }
        }
        System.out.print(sb);
    }
}