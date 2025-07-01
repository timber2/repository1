import javax.sound.midi.SysexMessage;
import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static Stack<Character> s;
    static int N,count= 0;
    static String word;
    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        while(N-- >0 ) {
            s = new Stack<>();
            word = br.readLine();
            for(int i=0;i <word.length();i++) {
                if(s.empty()) s.push(word.charAt(i));
                else if (word.charAt(i) == 'A') {
                    if(s.peek() =='A') s.pop();
                    else s.push(word.charAt(i));
                }
                else  {
                    if (s.peek() == 'B') s.pop();
                    else s.push(word.charAt(i));
                }
            }
            if(s.isEmpty()) {
                count++;
            }
        }
        sb.append(count);
        System.out.println(sb);
    }
}