import java.util.*;
import java.io.*;

public class Main {
    static class node {
        int x,y;
        node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb;
    static StringTokenizer str;
    static int M,N,K,T;
    static int[] dx = { 1 , 0 , -1 , 0};
    static int[] dy = { 0, 1, 0 ,-1};
    static int[][] grap;
    static boolean[][] visited;
    static Queue<node> q = new LinkedList<>();
    public static void main(String[] args) throws IOException {
        T = Integer.parseInt(br.readLine());
        while(T-- > 0) {
            sb = new StringBuilder();
            str = new StringTokenizer(br.readLine());
            M = Integer.parseInt(str.nextToken()); // 가로
            N = Integer.parseInt(str.nextToken()); // 세로
            K = Integer.parseInt(str.nextToken()); // 배추 개수
            int count = 0;
            grap = new int[N][M];
            visited = new boolean[N][M];
            while (K-- > 0) {
                str = new StringTokenizer(br.readLine());
                int width = Integer.parseInt(str.nextToken());
                int height = Integer.parseInt(str.nextToken());
                grap[height][width] = 1;
            }
            for(int i=0;i <N;i++) {
                for(int j=0; j < M;j++) {
                    if(grap[i][j] ==0 || visited[i][j]) continue;
                    else {
                        count++;
                        q.add(new node(i,j));
                        visited[i][j] = true;
                        while(!q.isEmpty()) {
                            node cur = q.remove();
                            int x = cur.x;
                            int y = cur.y;
                            bfs(x,y);
                        }
                    }
                }
            }
            sb.append(count);
            System.out.println(sb);
        }
    }
    static void bfs(int x, int y) {
        for(int k = 0 ; k <4 ; k++) {
            int nx = x + dx[k];
            int ny = y + dy[k];
            if(nx <0 || nx >= N || ny <0 || ny>= M || visited[nx][ny] || grap[nx][ny] !=1) continue;
            q.add(new node(nx,ny));
            visited[nx][ny] = true;
        }
    }
}