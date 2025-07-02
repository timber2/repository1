import java.util.*;
import java.io.*;

class node {
    int x,y;
    node(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer str;
    static int[] dx = {1, 0, -1,0};
    static int[] dy = {0,1, 0, -1};
    static int N,M;
    static int[][] board;
    static int[][] dis;
    static final int max = Integer.MAX_VALUE;
    static Queue<node> q = new LinkedList<>();
    public static void main(String[] args) throws IOException {
        str = new StringTokenizer(br.readLine());
        M = Integer.parseInt(str.nextToken());
        N = Integer.parseInt(str.nextToken());
        board = new int[N][M];
        dis = new int[N][M];
        for(int i=0;i < N ; i++) {
            str = new StringTokenizer(br.readLine());
            for(int j=0;j <M ;j++) {
                board[i][j] = Integer.parseInt(str.nextToken());
                if(board[i][j] == 0) dis[i][j] = max;
                else if (board[i][j] == 1) {
                    dis[i][j] = 0;
                    q.add(new node(i,j));
                }
            }
        }
        // ------------------- 탐색---------------------
        while(!q.isEmpty()) {
            node cur = q.remove();
            int x = cur.x;
            int y = cur.y;
            bfs(x,y);
        }
        int maxDay=0;
        Loop1:
        for(int i=0;i < N ; i++) {
            for(int j=0;j < M;j++) {
                if(dis[i][j] == max ) {
                    maxDay = -1;
                    break Loop1;
                }
                if(maxDay < dis[i][j] && board[i][j] !=1) {
                    maxDay = dis[i][j];
                }
            }
        }
        sb.append(maxDay);
        System.out.print(sb);

    }
    public static void bfs (int x, int y) {
        for(int i=0;i < 4 ;i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if( nx >=0 && nx < N && ny >= 0 && ny < M && board[nx][ny] != -1 && dis[nx][ny] == max) {
                dis[nx][ny] = dis[x][y] + 1;
                q.add(new node(nx,ny));
            }
        }
    }
}