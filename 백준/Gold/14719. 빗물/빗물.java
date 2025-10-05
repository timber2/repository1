import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int H,W, cnt, result = 0;
    static int[][] map;
    static boolean flag;
    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        H = Integer.parseInt(st.nextToken());
        W = Integer.parseInt(st.nextToken());
        map = new int[H][W];
        st = new StringTokenizer(br.readLine());
        int index = 0;
        while(st.hasMoreTokens()) {
            int end = Integer.parseInt(st.nextToken());
            for(int i= H-1 ; i >=H-end ;i--) map[i][index] = 1;
            index++;
        }
        for(int i= H-1 ; i >= 0 ;i--) {
            flag = false;
            cnt = 0;
            for(int j=0 ; j < W ;j++) {
                if(flag && map[i][j] == 0) cnt++;
                else if (map[i][j] == 1){
                    flag = true;
                    result +=cnt;
                    cnt =0;
                }

            }
        }
        System.out.print(result);
    }
}