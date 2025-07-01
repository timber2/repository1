import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb;
    static Stack<Character> s;
    static String str;
    public static void main(String[] args) throws IOException {
        Loop1:
        while(!(str = br.readLine()).equals(".")) {
            sb = new StringBuilder();
            s = new Stack<>();
            for(int i =0;i <str.length();i++) {
                if (str.charAt(i) == '(') {
                    s.push(str.charAt(i));
                }
                else if (str.charAt(i) == ')') {
                    if (s.isEmpty() || s.peek() != '(') {
                        sb.append("no\n");
                        System.out.print(sb);
                        continue Loop1;
                    }
                    s.pop();
                }
                else if (str.charAt(i) == '[') {
                    s.push(str.charAt(i));
                }
                else if (str.charAt(i) == ']') {
                    if (s.isEmpty() || s.peek() != '[') {
                        sb.append("no\n");
                        System.out.print(sb);
                        continue Loop1;
                    }
                    s.pop();
                }
            }
            if(s.isEmpty()) sb.append("yes\n");
            else sb.append("no\n");
            System.out.print(sb);
        }
    }
}