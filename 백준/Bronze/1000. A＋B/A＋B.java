import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        System.out.print(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()));
    }
}