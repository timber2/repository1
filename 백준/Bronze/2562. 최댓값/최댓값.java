import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int num,index= 0,  max = 0;
        for(int i=0; i <9; i++) {
            num = Integer.parseInt(br.readLine());
            if ( num >= max) {
                index = i+ 1;
                max = num;
            }
        }
        sb.append(max + "\n" + index);
        System.out.print(sb);
    }
}