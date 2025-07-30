import java.util.*;
import java.io.*;

public class Main {
    static class node {
        int x,y;
        public node(int x, int y) {
            this.x = x;
            this.y =y;
        }
    }
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;
    static int N, startX, startY, shark = 2, sharkEat =0, time =0;
    static int[][] grap;
    static int[][] visited;
    static Vector<node> canEat;
    static int[] dx = {1,0,-1,0};
    static int[] dy = {0,1,0,-1};
    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        grap = new int[N][N];
        for(int i=0;i < N ;i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0;j < N ;j++) {
                int num = Integer.parseInt(st.nextToken());
                if(num ==9) {
                    startX = i;
                    startY = j;
                    grap[i][j] = 0;
                    continue;
                }
                grap[i][j] = num;
            }
        }
        bfs(startX,startY);
        sb.append(time);
        System.out.print(sb);
    }
    public static void bfs(int startX, int startY) {
        Queue<node> q = new LinkedList<>();
        q.add(new node(startX,startY));
        visited = new int[N][N];
        canEat = new Vector<>();
        while(!q.isEmpty()) {
            node temp = q.poll();
            int x = temp.x;
            int y = temp.y;
            for(int i=0;i < dx.length;i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if(nx < 0 || nx >= N || ny <0 || ny>=N || shark < grap[nx][ny] ||
                        (nx == startX && ny == startY) || visited[nx][ny] !=0 ) continue;
                q.offer(new node(nx,ny));
                visited[nx][ny] = visited[x][y] + 1;
                if(grap[nx][ny] != 0 && shark > grap[nx][ny]) {
                    if(canEat.isEmpty()) canEat.add(new node(nx,ny));
                    else {
                        node t = canEat.get(0);
                        if(visited[nx][ny] <= visited[t.x][t.y]) {
                            if(visited[nx][ny] < visited[t.x][t.y]) canEat.clear();
                            canEat.add(new node(nx,ny));
                        }

                    }
                }
            }
        }
        if(canEat.isEmpty()) return;
        Collections.sort(canEat, new Comparator<node>() {
           @Override
           public int compare(node o1, node o2) {
               if(o1.x != o2.x) return o1.x - o2.x;
               else return o1.y - o2.y;
           }
        });
        sharkEat++;
        int goX = canEat.get(0).x;
        int goY = canEat.get(0).y;
        time += visited[goX][goY];
        grap[goX][goY] = 0;
        if(sharkEat == shark) {
            shark++;
            sharkEat = 0;
        }
        bfs(goX,goY);
    }
}