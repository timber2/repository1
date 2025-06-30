import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static Stack<String> s = new Stack<>();
    static String str;
    static int count,num=1;
    public static void main(String[] args) throws IOException {
        while( !(str= br.readLine()).contains("-") ) {
            count =0;
            for(int i=0;i <str.length();i++) {
                if(str.charAt(i) == '}') {
                    if(!s.isEmpty() && s.peek() =="}") {
                        count+=1;
                        s.pop();
                    }
                    else if (!s.isEmpty() && s.peek()=="{") {
                        s.pop();
                    }
                    else s.push("}");
                }
                else {
                    s.push("{");
                }
            }
            while (!s. isEmpty()) {
                String a = s.pop();
                String b = s.pop();
                if(a.equals(b)) count++;
                else count+=2;
            }
            sb.append(num++ + ". " + count + "\n");
        }
        System.out.print(sb);
    }
}