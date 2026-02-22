import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static LinkedList<Character> list;
    static String s;
    static int T;
    public static void main(String[] args) throws IOException {
        T = Integer.parseInt(br.readLine());
        while(T-->0 ) {
            list = new LinkedList<>();
            ListIterator<Character> it = list.listIterator();
            s = br.readLine();
            for(int i=0;i < s.length();i++) {
                if(s.charAt(i) == '<') {
                    if(it.hasPrevious()) it.previous();
                }
                else if (s.charAt(i) == '>') {
                    if(it.hasNext()) it.next();
                }
                else if (s.charAt(i) == '-') {
                    if(it.hasPrevious()) {
                        it.previous();
                        it.remove();
                    }
                }
                else {
                    it.add(s.charAt(i));
                }
            }
            for(Character e : list) sb.append(e);
            sb.append("\n");
        }
        sb.deleteCharAt(sb.length()-1);
        System.out.print(sb.toString());
    }
}