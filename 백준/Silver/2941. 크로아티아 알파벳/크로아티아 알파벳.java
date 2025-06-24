import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String word = br.readLine();
        String result = "";
        for(int i=0;i < word.length();i++) {
            result += ".";
        }
        int count =0;
        while(!word.equals(result)) {
            if (word.contains("c=")) {
                word = word.replaceFirst("c=", "..");
            }
            else if (word.contains("c-")) {
                word =word.replaceFirst("c-", "..");
            }
            else if (word.contains("dz=")) {
                word =word.replaceFirst("dz=", "...");
            }
            else if (word.contains("d-")) {
                word =word.replaceFirst("d-", "..");
            }
            else if (word.contains("lj")) {
                word =word.replaceFirst("lj", "..");
            }
            else if (word.contains("nj")) {
                word =word.replaceFirst("nj", "..");
            }
            else if (word.contains("s=")) {
                word =word.replaceFirst("s=", "..");
            }
            else if (word.contains("z=")) {
                word =word.replaceFirst("z=", "..");
            }
            else {
                for(int i=0; i < word.length(); i++) {
                    if(word.charAt(i) != '.') {
                        word = word.replaceFirst(word.charAt(i) + "", ".");
                        break;
                    }
                }
            }
            count++;
        }

        sb.append(count + "");
        System.out.println(sb);
    }
}