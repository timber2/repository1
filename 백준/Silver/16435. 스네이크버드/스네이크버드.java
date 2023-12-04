import java.util.*;
import java.io.*;

public class Main {
    static int lngth;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);
        int N = Integer.parseInt(st.nextToken());
        int[] fruit = new int [N];
        lngth = Integer.parseInt(st.nextToken());
        String str1 = br.readLine();
        st = new StringTokenizer(str1);
        for(int i=0;i<N;i++) {
            fruit[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(fruit); // 1 2 3 4 5 6 7 8 9 
        for(int i=0;i<N;i++) {
            if(lngth >=fruit[i])
                lngth++;
        }
        bw.write(lngth+"");
        bw.flush();
        bw.close();
    }
}