import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static Set<String> set = new HashSet<>();
    static StringBuilder sb;
    public static void main(String[] args) throws IOException {
        sb= new StringBuilder(br.readLine());
        for(int i=0; i < sb.length(); i++) {
            for(int j= i+1; j <= sb.length();j++) {
                set.add(sb.substring(i,j));
            }
        }
        System.out.print(set.size());
    }
}