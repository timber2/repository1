import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb =  new StringBuilder();
        StringTokenizer str;
        String A,B;
        String sen = br.readLine();
        int M = Integer.parseInt(br.readLine());
        LinkedList<Character> list =  new LinkedList<>();
        for(int i=0;i < sen.length() ; i++) {
            list.add(sen.charAt(i));
        }
        ListIterator<Character> it = list.listIterator();
        while(it.hasNext()) {
            it.next();
        }
       for(int i =0 ;i <M ;i++) {
            str = new StringTokenizer(br.readLine());
            A = str.nextToken();
            if( A.equals("L")) {
                if(it.hasPrevious()) it.previous();
            }
            else if(A.equals("D")) {
                if(it.hasNext()) it.next();
            }
            else if(A.equals("B")) {
                if(it.hasPrevious()) {
                    it.previous();
                    it.remove();
                }
            }
            else {
                B = str.nextToken();
                it.add(B.charAt(0));
            }
       }
       it = list.listIterator();
       while(it.hasNext()) {
           sb.append(it.next());
       }


       System.out.print(sb);
    }
}
