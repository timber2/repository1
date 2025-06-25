import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        int[] alphabet = new int[26];
        String str = br.readLine();
        for(int i=0;i <str.length();i++) {
            alphabet[(int)str.charAt(i)-97]++;
        }
        for(int i=0;i < alphabet.length;i++) {
            sb.append(alphabet[i] + " ");
        }
        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb);
    }
}