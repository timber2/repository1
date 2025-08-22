import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;
    static int N;
    static String[] array;
    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        array = new String[N];
        for(int i=0;i < N ;i++) array[i] = br.readLine();
        Arrays.sort(array, new Comparator<String>() {
           @Override
           public int compare(String a, String b) {
               if(a.length() != b.length()) return a.length() - b.length();
               else {
                   int sumA=0, sumB=0;
                   for(int j=0; j < a.length();j++) if(Character.isDigit(a.charAt(j))) sumA += Character.getNumericValue(a.charAt(j));
                   for(int j=0; j < b.length();j++) if(Character.isDigit(b.charAt(j))) sumB += Character.getNumericValue(b.charAt(j));
                   if(sumA != sumB) return sumA - sumB;
                   else {
                       for(int k=0; k < a.length() ; k++) {
                           if((int)a.charAt(k) != (int)b.charAt(k)) return  (int)a.charAt(k) - (int)b.charAt(k);
                       }
                       return 0;
                   }
               }
           }
        });
        for(int i=0;i < N;i++) {
            sb.append(array[i]).append("\n");
        }
        System.out.print(sb);
    }
}