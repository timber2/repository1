import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static int N;
    static int[][] grap;
    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        grap = new int [N][N];

        for(int i=0;i < N;i++ ) {
            String temp = br.readLine();
            for(int j=0; j < N ;j++) {
                grap[i][j] = Integer.parseInt(temp.charAt(j) + "");
            }
        }
        solve(0,0,N);
        System.out.print(sb);
    }
    static void solve(int x, int y , int devide) {
        if(check(x,y,devide)) {
            if(grap[x][y] == 0) sb.append("0");
            else sb.append("1");
        }
        else {
            devide /=2;
            sb.append("(");
            for(int i=0;i < 2 ; i++) {
                for(int j=0; j < 2;j++) {
                    solve(x + i*devide, y + j*devide, devide);
                }
            }
            sb.append(")");
        }
    }

    static boolean check(int x, int y, int devide) {
        int temp = grap[x][y];
        for(int i=0; i < devide ; i++) {
            for(int j=0; j < devide; j++) {
                if(temp != grap[x + i][y+ j]) return false;
            }
        }
        return true;
    }
}