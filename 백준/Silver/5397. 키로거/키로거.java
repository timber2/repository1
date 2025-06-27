import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb;
        LinkedList<Character> list;
        ListIterator<Character> it;
        int N = Integer.parseInt(br.readLine());
        for(int i=0;i  < N ; i++) {
            list = new LinkedList<>();
            it = list.listIterator();
            sb = new StringBuilder();
            String s = br.readLine();
            for(int j=0; j <s.length();j++) {
                if(s.charAt(j) == '<') {
                    if(it.hasPrevious()) it.previous();
                }
                else if(s.charAt(j) == '>') {
                    if(it.hasNext()) it.next();
                }
                else if(s.charAt(j) == '-') {
                    if(it.hasPrevious()) {
                        it.previous();
                        it.remove();
                    }

                }
                else {
                    it.add(s.charAt(j));
                }
            }
            it = list.listIterator();
            while(it.hasNext()) {
                sb.append(it.next());
            }
            System.out.println(sb);
        }
    }
}