import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer str = new StringTokenizer(br.readLine());
        long A = Long.parseLong(str.nextToken());
        long B = Long.parseLong(str.nextToken());
        long temp;
        if(A > B) {
            temp = A;
            A = B;
            B = temp;
        }
        if(A == B) {
            sb.append(0 + "\n");
        }
        else {
            sb.append((long)(B-A-1) + "\n");
        }
        for(double i= A+1 ; i <B; i++) {
            sb.append((long)i + " ");
        }
        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb);
    }
}