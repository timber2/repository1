import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer str;
        int[] array = new int [21];
        int i,j, temp;
        for(int a=1; a< 21;a ++) {
            array[a] = a;
        }
        for(int a=0;a <10;a++) {
            str = new StringTokenizer(br.readLine());
            i = Integer.parseInt(str.nextToken());
            j = Integer.parseInt(str.nextToken());
            for(int b = 0 ; b<(j-i+1)/2;b++) {
                temp = array[b + i];
                array[b +i] = array[j - b];
                array[j-b] = temp;
            }
        }
        for (int k=0; k < array.length; k++) {
            sb.append(array[k] + " ");
        }
        sb.deleteCharAt(sb.length()-1);
        sb.delete(0,2);
        System.out.println(sb);
    }
}