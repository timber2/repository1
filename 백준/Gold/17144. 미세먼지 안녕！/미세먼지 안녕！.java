import java.io.*;
import java.util.*;

public class Main {
    static class node {
        int x,y, A;
        public node(int x, int y, int A) {
            this.x = x;
            this.y = y;
            this.A = A;
        }
    }
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int R,C,T;
    static boolean clockWise;
    static int[][] grap;
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};
    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        T = Integer.parseInt(st.nextToken());
        grap = new int [R][C];
        for(int i=0; i< R ;i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j < C ;j++)  grap[i][j] = Integer.parseInt(st.nextToken());
        }
        while(T-->0) {
            // ---------------미세먼지 확산------------------
            Queue<node> q = new ArrayDeque<>();
            List<node> list;
            for(int i=0;i< R ;i++) {
                for(int j=0 ; j< C ;j++) {
                    if(grap[i][j] > 0) q.add(new node(i,j, grap[i][j]));
                }
            }
            while(!q.isEmpty()) {
                list = new ArrayList<>();
                node temp = q.poll();
                int cnt =0;
                for(int i=0;i < dx.length ;i++) {
                    int nx = temp.x + dx[i];
                    int ny = temp.y + dy[i];
                    if(nx < 0 || ny < 0 || nx >= R || ny >=C || grap[nx][ny] == -1) continue;
                    else {
                        cnt++;
                        list.add(new node(nx,ny,grap[nx][ny]));
                    }
                }
                grap[temp.x][temp.y] -= temp.A / 5 *  cnt;
                for(node e : list) grap[e.x][e.y] += temp.A / 5;
            }
            // ---------------공기청정기 작동------------------
            for(int i=0 ;i < R ;i++) {
                for(int j=0 ; j < C ;j++) {
                    if(grap[i][j] == -1) {
                        node temp = new node(i,j, grap[i][j]);
                        if(!clockWise) {
                            // 반시계 방향
                            for(int k=0 ; k < dx.length;k++) {
                                while(true) {
                                    int nx = temp.x + dx[k];
                                    int ny = temp.y + dy[k];
                                    if(nx < 0 || ny < 0 || nx > i || ny >= C) break;
                                    if(temp.A == -1) {
                                        temp = new node(nx , ny , grap[nx][ny]);
                                        continue;
                                    }
                                    if(grap[nx][ny] == -1) grap[temp.x][temp.y] = 0;
                                    else grap[temp.x][temp.y] = grap[nx][ny];
                                    temp = new node (nx, ny , grap[nx][ny]);
                                }
                            }
                            clockWise = !clockWise;
                        }
                        else {
                            //시계 방향
                            for(int k : new int[]{2,1,0,3}) {
                                while(true) {
                                    int nx = temp.x + dx[k];
                                    int ny = temp.y + dy[k];
                                    if(nx < i || ny < 0 || nx >= R || ny >= C) break;
                                    if(temp.A == -1) {
                                        temp = new node(nx , ny , grap[nx][ny]);
                                        continue;
                                    }
                                    if(grap[nx][ny] == -1) grap[temp.x][temp.y] = 0;
                                    else grap[temp.x][temp.y] = grap[nx][ny];
                                    temp = new node (nx, ny , grap[nx][ny]);
                                }
                            }
                            clockWise = !clockWise;
                        }
                    }
                }
            }
        }
        int sum =0;
        for(int[] e : grap) {
            for(int a : e)  {
                if(a != -1) sum += a;
            }
        }
        System.out.print(sum);
    }
}