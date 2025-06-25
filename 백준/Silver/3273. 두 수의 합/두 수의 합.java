import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int[] array = new int [2000001];
        StringTokenizer str = new StringTokenizer(br.readLine());
        while(str.hasMoreTokens()){
            int a = Integer.parseInt(str.nextToken());
            array[a] = 1;
        }
        int count =0;
        int x = Integer.parseInt(br.readLine());
        for(int i=0;i < array.length;i++) {
            if(x -i >=0 && array[i] == 1) {
                array[i] = 0;
                if(array[x-i] ==1 ) {
                    count++;
                }
                array[x-i]= 0;
            }
        }
        sb.append(count + "");
        System.out.print(sb);
    }
}
