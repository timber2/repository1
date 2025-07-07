import java.io.*;
import java.util.*;

public class Main {
    static class node {
        int x,y;
        public node (int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;
    static int N, max= 0, count;
    static int[][] map;
    static int[][] visited;
    static int[] dx = { 1,0,-1,0};
    static int[] dy = {0,1,0,-1};
    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        for(int i=0;i < N;i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0;j < N;j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for(int i=0; i <=101; i++) {
            count = 0;
            bfs(i);
            if(count > max) {
                max =count;
            }
        }
        sb.append(max);
        System.out.print(sb);
    }
    public static void bfs(int height) {
        Queue<node> q = new LinkedList<>();
        visited = new int[N][N];
        for(int i=0;i <  N ; i++) {
            for(int j=0; j < N ;j++) {
                if( height >= map[i][j] || visited[i][j] ==1 ) continue;
                else {
                    count++;
                    q.add(new node(i,j));
                    visited[i][j] = 1;
                    while(!q.isEmpty()) {
                        node cur = q.poll();
                        int x = cur.x;
                        int y = cur.y;
                        for(int k=0; k < dx.length;k++) {
                            int nx = x + dx[k];
                            int ny = y + dy[k];
                            if(nx <0 || nx >= N || ny < 0 || ny >=N || visited[nx][ny] ==1 ||height >= map[nx][ny] ) continue;
                            else {
                                visited[nx][ny] = 1;
                                q.add(new node(nx,ny));
                            }
                        }
                    }
                }
            }
        }
    }
}