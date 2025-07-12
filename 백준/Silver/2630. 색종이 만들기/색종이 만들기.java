import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;
    static int[][] grap;
    static int N, white =0, blue =0;;
    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        grap = new int[N][N];
        for(int i=0;i < N;i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j < N ; j++) {
                grap[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        solve(0,0,N);
        sb.append(white + "\n" + blue);
        System.out.print(sb);
    }
    static void solve(int x, int y , int devide) {
        if(check(x,y , devide)) {
            if(grap[x][y] == 0) white++;
            else blue++;
        }
        else {
            devide /=2;
            for(int i=0;i < 2 ;i++) {
                for(int j=0;j < 2 ;j++) {
                    solve(x + i * devide, y +j * devide , devide);
                }
            }
        }
    }
    static boolean check(int x, int y, int devide) {
        int temp = grap[x][y];
        for(int i=0;i < devide ;i++) {
            for(int j=0; j < devide; j++) {
                if(temp != grap[x + i][y +j]) return false;
            }
        }
        return true;
    }
}