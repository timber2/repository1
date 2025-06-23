import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer str = new StringTokenizer(br.readLine());
        double A = Double.parseDouble(str.nextToken());
        double B = Double.parseDouble(str.nextToken());
        double temp;
        if(A > B) {
            temp = A;
            A = B;
            B = temp;
        }
        if(A == B) {
            sb.append(0 + "\n");
        }
        else {
            sb.append((int)(B-A-1) + "\n");
        }
        for(double i= A+1 ; i <B; i++) {
            sb.append((int)i + " ");
        }
        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb);
    }
}