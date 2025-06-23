import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb;
        StringTokenizer st;
        for(int i=0;i <3; i++) {
            sb = new StringBuilder();
            st = new StringTokenizer(br.readLine());
            int count =0;
            while(st.hasMoreTokens()) {
                if(st.nextToken().equals("0")) {
                    count++;
                }
            }
            if( count ==0 ) {
                sb.append("E");
            }
            else if (count ==1 ) {
                sb.append("A");
            }
            else if (count ==2 ) {
                sb.append("B");
            }
            else if (count ==3 ) {
                sb.append("C");
            }
            else {
                sb.append("D");
            }
            System.out.println(sb);
        }
        //
    }
}