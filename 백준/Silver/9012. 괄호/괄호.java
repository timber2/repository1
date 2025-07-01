import javax.sound.midi.SysexMessage;
import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb;
    static Stack<Character> s;
    static int N,count= 0;
    static String word;
    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        Loop1:
        while(N-- >0 ) {
            sb = new StringBuilder();
            s = new Stack<>();
            word = br.readLine();
            for(int i=0;i < word.length();i++) {
                if(word.charAt(i) == '(') {
                    s.push(word.charAt(i));
                }
                else {
                    if(s.empty()) {
                        sb.append("NO");
                        System.out.println(sb);
                        continue Loop1;
                    }
                    else s.pop();
                }
            }
            if(!s.empty()) sb.append("NO");
            else sb.append("YES");
            System.out.println(sb);
        }
    }
}