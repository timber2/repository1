import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static String s;
    static int sum = 0, num =0;
    static boolean flag;
    public static void main(String[] args) throws IOException {
        s = br.readLine();
        for(int i=0;i < s.length();i++ ) {
            char c = s.charAt(i);
            if(Character.isDigit(c)) {
                num = num*10 + Integer.parseInt(c + "");
                continue;
            }
            else if (c == '+') {
                if(flag) sum -= num;
                else sum += num;
            }
            else {
                if(flag) sum -= num;
                else sum += num;
                flag = true;
            }
            num = 0;
        }
        if(flag) sum -= num;
        else sum += num;
        System.out.print(sum);
    }
}