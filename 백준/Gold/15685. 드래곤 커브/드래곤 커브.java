import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N, cnt =0;
    static boolean[][] map = new boolean[101][101];
    static List<Integer> list;
    static int[] dx = {0, -1,0 ,1};
    static int[] dy = {1, 0,-1, 0};
    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        for(int i=0;i < N ;i++) {
            st = new StringTokenizer(br.readLine());
            int y = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            int g = Integer.parseInt(st.nextToken());
            drawCurve(x, y, d, g);
        }
        // map확인
        for(int i=0;i<100;i++) {
            for(int j=0;j<100;j++) {
                if(map[i][j] && map[i][j+1] && map[i+1][j] && map[i+1][j+1]) cnt++;
            }
        }
        System.out.print(cnt);
    }
    public static void drawCurve(int x,int y, int d,int g) {
        list = new ArrayList<>();
        map[x][y] = true;
        x = x + dx[d];
        y = y + dy[d];
        map[x][y] = true;
        list.add(d);
        int index = 1;
        for(int i=0;i< g ;i++) {
            for(int j=list.size()-1;j >=0 ;j--) {
                list.add((list.get(j) +1)%4);
            }
            for(; index < list.size() ; index++) {
                x = x + dx[list.get(index)];
                y = y + dy[list.get(index)];
                map[x][y] = true;
            }
        }
    }
}