import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] array = new int [10];
        int word = Integer.parseInt(br.readLine());
        while(word >0 ){
            array[word%10]++;
            word/=10;
        }
        array[6] = (array[6] + array[9] + 1) /2;
        int max = 0;
        for(int i=0;i <9 ; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        sb.append(max);
        System.out.print(sb);
    }
}
