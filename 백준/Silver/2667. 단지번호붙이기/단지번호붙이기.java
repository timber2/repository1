import java.util.*;
import java.io.*;

public class Main {
    static class node{
        int x,y;
        public node(int x,int y){
            this.x=x;
            this.y=y;
        }
    }
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static int N, area, count;
    static int[][] grap;
    static int[] dx = { 1,0,-1,0};
    static int[] dy = {0, 1,0,-1};
    static Queue<node> q = new LinkedList<>();
    static Vector<Integer> v = new Vector<>();
    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        grap = new int[N][N];
        for(int i=0;i <N;i++) {
            String s = br.readLine();
            for(int j=0;j < N;j++) {
                grap[i][j] = Integer.parseInt(s.charAt(j) + "");
            }
        }
        count =0;
        for(int i=0;i<N;i++) {
            for(int j=0;j<N;j++) {
                if(grap[i][j] == 1) {
                    count++;
                    area = 1;
                    grap[i][j] = -1;
                    bfs(i,j);
                    v.add(area);
                }
            }
        }
        Collections.sort(v);
        sb.append(count+ "\n");
        for(int i=0;i <count;i++) sb.append(v.get(i)+ "\n");
        sb.deleteCharAt(sb.length()-1);
        System.out.print(sb);
    }
    public static void bfs(int a,int b) {
        Queue<node> q = new LinkedList<>();
        q.offer(new node(a,b));
        while(!q.isEmpty()) {
            node temp = q.poll();
            int x = temp.x;
            int y = temp.y;
            for(int i=0;i <dx.length;i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if(nx <0 || nx >= N || ny <0 || ny >= N || grap[nx][ny] == -1 || grap[nx][ny] == 0) continue;
                else {
                    q.offer(new node(nx,ny));
                    area++;
                    grap[nx][ny] = -1;
                }
            }
        }
    }
}