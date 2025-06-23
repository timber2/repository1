import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int score = 0;
        if(A == B && B == C && C == A) {
            score = 10000 + A*1000;
        }
        else if(A == B || B == C || C == A) {
            if(A == B || A == C) score = 1000 + A*100;
            else score = 1000 + B*100;
        }
        else {
            score = Math.max(Math.max(A,B), C) * 100;
        }

        sb.append(score + "");
        System.out.println(sb);
    }
}