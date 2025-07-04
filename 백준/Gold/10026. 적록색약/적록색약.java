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
    static StringBuilder sb = new StringBuilder();
    static int N,count;
    static int[] dx = {1,0,-1,0};
    static int[] dy = {0,1,0,-1};
    static char[][] graph;
    static char[][] graph2;
    static boolean[][] visited;
    static boolean isGreen;
    static Queue<node> q = new LinkedList<>();
    public static void main(String[] args) throws IOException {
        sb = new StringBuilder();
        N = Integer.parseInt(br.readLine());
        graph = new char[N][N];
        graph2 = new char[N][N];
        visited = new boolean[N][N];
        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            for (int j = 0; j < N; j++) {
                graph[i][j] = s.charAt(j);
                if(s.charAt(j) =='G') graph2[i][j] = 'R';
                else graph2[i][j] = s.charAt(j);
            }
        }
        count = 0;
        isGreen = false;
        for(int i=0;i < N;i++) {
            for(int j=0;j < N;j++) {
                if(visited[i][j]) continue;
                else {
                    node cur = new node(i,j);
                    q.add(cur);
                    visited[i][j] = true;
                    bfs(isGreen);
                    count++;
                }
            }
        }
        sb.append(count + " ");
        isGreen = true;
        count =0;
        visited = new boolean[N][N];
        for(int i=0;i < N;i++) {
            for(int j=0;j < N;j++) {
                if(visited[i][j]) continue;
                else {
                    node cur = new node(i,j);
                    q.add(cur);
                    visited[i][j] = true;
                    bfs(isGreen);
                    count++;
                }
            }
        }
        sb.append(count + " ");
        sb.deleteCharAt(sb.length()-1);
        System.out.print(sb);
    }
    static void bfs(boolean isGreen) {
        while(!q.isEmpty()) {
            node cur = q.poll();
            int x = cur.x;
            int y = cur.y;
            for(int i=0;i <dx.length; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if(!isGreen) {
                    if(nx <0 || nx >=N || ny <0 || ny >=N || visited[nx][ny] || graph[nx][ny] != graph[x][y]) continue;
                    visited[nx][ny] = true;
                    q.add(new node(nx,ny));
                }
                else {
                    if(nx <0 || nx >=N || ny <0 || ny >=N || visited[nx][ny] || graph2[nx][ny] != graph2[x][y]) continue;
                    visited[nx][ny] = true;
                    q.add(new node(nx,ny));
                }
            }
        }

    }
}