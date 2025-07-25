import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static int N;
    static String[] array;
    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        array = new String[N];
        for(int i=0;i < N ;i++) array[i] = br.readLine();
        Arrays.sort(array, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if(s1.length() == s2.length()) return s1.compareTo(s2);
                else return s1.length() - s2.length();
            }
        });
        sb.append(array[0]).append("\n");
        for(int i=1;i < N ;i++) {
            if(array[i].equals(array[i-1])) continue;
            sb.append(array[i]).append("\n");
        }
        System.out.print(sb);
    }
}