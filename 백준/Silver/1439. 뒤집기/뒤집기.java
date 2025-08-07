import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static char prev = '2';
    static int zeroCnt =0, oneCnt =0;
    public static void main(String[] args) throws IOException {
        String s = br.readLine();
        for(int i=0;i < s.length();i++) {
            char c = s.charAt(i);
            if(c != prev) {
                if(c == '0') zeroCnt++;
                else oneCnt++;
                prev = c;
            }
        }
        System.out.print(Math.min(zeroCnt, oneCnt));
    }
}