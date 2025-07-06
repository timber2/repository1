import java.io.*;
import java.util.*;

public class Main {
    static class node {
        int x,y;
        node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    static int N , M , k;
    static int[][] map;
    static int count, area;
    static int[] dx = {1,0,-1,0};
    static int[] dy = { 0 , 1, 0 , -1};
    static Vector<Integer> v = new Vector<>();
    static Queue<node> q = new LinkedList<>();
    public static void main(String[] args) throws IOException {
           st = new StringTokenizer(br.readLine());
           N = Integer.parseInt(st.nextToken());
           M = Integer.parseInt(st.nextToken());
           k = Integer.parseInt(st.nextToken());
           map = new int[N][M];
           int x1,y1, x2,y2;
           for(int a = 0; a< k ; a++) {
               st = new StringTokenizer(br.readLine());
               x1 = Integer.parseInt(st.nextToken());
               y1 = Integer.parseInt(st.nextToken());
               x2 = Integer.parseInt(st.nextToken());
               y2 = Integer.parseInt(st.nextToken());
               for (int i = y1; i < y2; i++) {
                   for (int j = x1; j < x2; j++) {
                       map[i][j] = 1;
                   }
               }
           }
           count = 0;
           for(int i=0;i <N ; i++) {
               for(int j=0 ; j< M ; j++) {
                   if(map[i][j] ==0) {
                       area =1;
                       count++;
                       q.add(new node(i,j));
                       map[i][j] = -1;
                       bfs();
                       v.add(area);
                   }
               }
           }

           sb.append(count +"\n");
           Collections.sort(v);
           for(int i=0;i <count;i++) {
               sb.append(v.get(i) + " ");
           }
           sb.deleteCharAt(sb.length()-1);
           System.out.print(sb);
    }
    public static void bfs() {
        while (!q.isEmpty()) {
            node temp = q.poll();
            int x = temp.x;
            int y = temp.y;
            for (int i = 0; i < dx.length; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (nx < 0 || nx >= N || ny < 0 || ny >= M || map[nx][ny] == -1 || map[nx][ny] == 1) continue;
                else {
                    map[nx][ny] = -1;
                    q.add(new node(nx, ny));
                    area++;
                }
            }
        }
    }
}