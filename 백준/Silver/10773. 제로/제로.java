import java.io.*;
import java.nio.file.FileSystemNotFoundException;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int num, count =0;
        Stack<Integer> s = new Stack<>();
        for(int i=0;i < N ;i++) {
            num = Integer.parseInt(br.readLine());
            if(num ==0 ) {
                s.pop();
            }
            else s.push(num);
        }
        while(!s.isEmpty()) {
            count+=s.pop();
        }
        sb.append(count);
        System.out.print(sb);
    }
}