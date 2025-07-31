import java.util.*;
import java.io.*;

public class Main {
    static class node {
        int x,y;
        public node(int x,int y) {
            this.x = x;
            this.y = y;
        }
    }
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static Character[][] grap = new Character[12][6];
    static boolean[][] visited;
    static Boolean flag;
    static Vector<node> v;
    static int[] dx = { 1, 0 , -1 ,0 };
    static int[] dy = {0, 1, 0 ,-1};
    static int result =0;
    public static void main(String[] args) throws IOException {
        for(int i=0;i < 12 ;i++) {
            String s = br.readLine();
            for(int j=0; j < 6;j++) grap[i][j] = s.charAt(j);
        }
        func();
        sb.append(result);
        System.out.print(sb);
    }
    public static void func() {
        while(true) {
            flag = false;
            visited = new boolean[12][6];
            for(int i=0;i< 12 ;i++) {
                for(int j=0 ; j < 6 ;j++) {
                    if(grap[i][j] !='.' && !visited[i][j]) {
                        visited[i][j] = true;
                        bfs(i,j);
                    }
                }
            }
            if(flag) {
                grapChange();
                result++;
            }
            else break;
        }
    }
    public static void bfs(int x, int y) {
        Queue<node> q = new LinkedList<>();
        q.add(new node(x,y));
        Character color = grap[x][y];
        v = new Vector<>();
        v.add(new node(x,y));
        int count =0;
        while(!q.isEmpty()) {
            node temp = q.poll();
            int tempX = temp.x;
            int tempY = temp.y;
            for(int i=0;i < dx.length;i++) {
                int nx = tempX + dx[i];
                int ny = tempY + dy[i];
                if(nx <0 || nx>= 12 || ny <0 || ny >=6 || visited[nx][ny] || grap[nx][ny]!= color) continue;
                q.add(new node(nx,ny));
                v.add(new node(nx,ny));
                count++;
                visited[nx][ny] = true;
            }
        }
        if(count >= 3) {
            flag = true;
            breakPuyo();
        }
    }
    public static void breakPuyo() {
        // 뿌요 부수기
        for(int i=0;i <v.size();i++) grap[v.get(i).x][v.get(i).y] = '.';
    }
    public static void grapChange(){
        // 중력 영향을 받아 그래프 변경
        for(int i=0;i<12;i++) {
            for (int j = 0; j < 6; j++) {
                if (grap[i][j] != '.' && i < 11 && grap[i + 1][j] == '.') {
                    //깊이 계산
                    int depth = 0;
                    for (int k = i + 1; k < 12; k++) {
                        if (grap[k][j] == '.') {
                            depth++;
                            break;
                        }
                    }
                    for (int k =1; k <= depth ; k++) {
                        for(int l = i + k ; l >0 ; l--) {
                            grap[l][j] = grap[l-1][j];
                            grap[l-1][j] = '.';
                        }
                    }
                }
            }
        }
    }
}