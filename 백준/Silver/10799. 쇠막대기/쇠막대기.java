import javax.sound.midi.SysexMessage;
import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static Stack<Character> s = new Stack<>();
    static int N,count= 0;
    static String word;
    static char lastChar;
    public static void main(String[] args) throws IOException {
        word = br.readLine();
        for(int i=0;i < word.length();i++) {
            if(word.charAt(i) == '(') {
                lastChar = word.charAt(i);
                s.push(word.charAt(i));
            }
            else { // )
                if(lastChar == '(') {
                    s.pop();
                    count+= s.size();
                }
                else {
                    s.pop();
                    count++;
                }
                lastChar = word.charAt(i);
            }
        }
        sb.append(count);
        System.out.print(sb);
    }
}