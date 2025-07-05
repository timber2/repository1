import java.io.*;
import java.util.*;

public class Main {
    static class node {
        int x, y;
        node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb;
    static StringTokenizer str;
    static int T, M , N, time;
    static int jihun_x, jihun_y;
    static boolean canEscape;
    static final int INF = Integer.MAX_VALUE;
    static char[][] map;
    static int[][] visited;
    static int[] dx = {1,0,-1,0};
    static int[] dy = {0,1,0,-1};
    static Queue<node> q = new LinkedList<>();
    public static void main(String[] args) throws IOException {
        T = Integer.parseInt(br.readLine());
        while(T-- > 0) {
            canEscape = false;
            time =1;
            sb = new StringBuilder();
            str = new StringTokenizer(br.readLine());
            M = Integer.parseInt(str.nextToken());
            N = Integer.parseInt(str.nextToken());
            map = new char[N][M];
            visited = new int[N][M];
            for(int i=0;i < N ; i++) {
                String s = br.readLine();
                for(int j=0;j < M ; j++) {
                    map[i][j] = s.charAt(j);
                    if(s.charAt(j) == '*') {
                        visited[i][j] = 0;
                        q.add(new node(i,j));
                        continue;
                    }
                    else if (s.charAt(j) =='@') {
                        jihun_x = i;
                        jihun_y = j;
                    }
                    visited[i][j] = INF;
                }
            }
            while (!q.isEmpty()) {
                fireBfs();
            }
            //----------------------------------
            q.add(new node(jihun_x,jihun_y));
            Loop1:
            while (!q.isEmpty()) {
                int count = q.size();
                for(int i=0;i < count;i++) {
                    jihunBfs();
                    if(canEscape) break Loop1;
                }
                time++;
            }
            //----------------------------------
            if(canEscape) sb.append(time);
            else sb.append("IMPOSSIBLE");
//            for(int i=0;i <N ; i++) {
//                for(int j=0;j <M;j++) {
//                    System.out.print(visited[i][j] + " ");
//                }
//                System.out.println();
//            }
            System.out.println(sb);
        }
    }
    public static void fireBfs() {
        node temp = q.poll();
        int x = temp.x;
        int y = temp.y;
        for(int i = 0;i <dx.length;i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx <0 || nx >= N || ny < 0 || ny >= M || map[nx][ny] == '#' || visited[nx][ny] != INF) continue;
            else {
                visited[nx][ny] = visited[x][y] + 1;
                q.add(new node(nx,ny));
            }
        }

    }
    public static void jihunBfs() {
        node temp = q.poll();
        int x = temp.x;
        int y = temp.y;
        for(int i=0;i < dx.length;i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx <0 || nx >=N || ny <0 || ny>=M) {
                canEscape = true;
                return;
            }
            else if(visited[nx][ny] == -1 || visited[nx][ny] <= time || map[nx][ny] == '#') continue;
            else {
                q.add(new node(nx,ny));
                visited[nx][ny] = -1;
            }
        }
    }
}