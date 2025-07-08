import java.io.*;
import java.util.*;

public class Main {
    static class node {
        int x,y;
        public node(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb;
    static StringTokenizer str;
    static int[] dx = {1,1,0,-1,-1,-1,0,1};
    static int[] dy = {0,1,1,1,0,-1,-1,-1};
    static int h,w, count;
    static int[][] map;
    static Queue<node> q = new LinkedList<>();
    public static void main(String[] args) throws IOException {
        while(true) {
            sb = new StringBuilder();
            str = new StringTokenizer(br.readLine());
            w = Integer.parseInt(str.nextToken());
            h = Integer.parseInt(str.nextToken());
            if(h == 0 && w == 0) break;
            map = new int[h][w];
            count =0;
            for(int i=0;i < h ; i++) {
                str = new StringTokenizer(br.readLine());
                for(int j=0;j <w;j++) {
                    map[i][j] = Integer.parseInt(str.nextToken());
                }
            }
            for(int i=0;i < h ;i++) {
                for(int j=0;j <w;j++) {
                    if(map[i][j] == 1) {
                        q.add(new node(i,j));
                        map[i][j] = -1;
                        bfs();
                        count++;
                    }
                }
            }
            sb.append(count);
            System.out.println(sb);
        }
    }
    public static void bfs() {
        while (!q.isEmpty()) {
            node temp = q.poll();
            int x = temp.x;
            int y = temp.y;
            for(int i=0;i <dx.length;i++ ){
                int nx = x + dx[i];
                int ny = y + dy[i];
                if(nx < 0 || ny < 0 || nx >= h || ny >= w || map[nx][ny] ==-1 || map[nx][ny] == 0 ) continue;
                else {
                    q.offer(new node(nx,ny));
                    map[nx][ny] = -1;
                }
            }
        }
    }
}