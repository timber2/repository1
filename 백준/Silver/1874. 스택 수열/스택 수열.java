import java.io.*;
import java.nio.file.FileSystemNotFoundException;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Integer> s = new Stack<>();
        int num, max = 0, N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++) {
            num = Integer.parseInt(br.readLine());
            if(num > max) {
                while(max !=num) {
                    s.push(++max);
                    sb.append("+\n");
                }
            }
            while(true) {
                sb.append("-\n");
                if(s.isEmpty()) {
                    System.out.print("NO");
                    return;
                }
                if(s.pop() == num) break;
            }
        }
        System.out.print(sb);
    }
}