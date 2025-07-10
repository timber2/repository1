import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static int N;
    static Vector<Integer> v = new Vector<>();
    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        for(int i=0;i < N ; i++) {
            v.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(v);
        for(int i=0;i < v.size();i++) {
            sb.append(v.get(i) + "\n");
        }
        sb.deleteCharAt(sb.length()-1);
        System.out.print(sb);
    }
}