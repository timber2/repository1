import java.io.*;
import java.util.*;

public class Main {
    static class node {
        int x ,y;
        public node(int x, int y) {
            this.x =x;
            this.y =y;
        }
    }
    static BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N,K,L, result =0;
    static int x =0 , y =0, dir = 1;
    static int[][] map;
    static List<String[]> dirConvert =  new ArrayList<>();
    static ArrayDeque<node> q = new ArrayDeque<>();
    static int[] dx = { 1, 0, -1, 0};
    static int[] dy = { 0, 1, 0 , -1};
    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        map = new int [N][N];
        K = Integer.parseInt(br.readLine());
        for(int i=0;i <K ; i++) {
            st = new StringTokenizer(br.readLine());
            map[Integer.parseInt(st.nextToken()) -1][Integer.parseInt(st.nextToken()) -1] = 1;
        }
        L = Integer.parseInt(br.readLine());
        for(int i=0;i < L ;i++) {
            st = new StringTokenizer(br.readLine());
            dirConvert.add(new String[]{ st.nextToken(),st.nextToken()});
        }
        q.add(new node(0,0));
        func();
        System.out.print(result);
    }
    public static void func() {
        while(true) {
            result +=1;
            x +=dx[dir];
            y +=dy[dir];
            // 일단 움직였을때 벽이나 몸이냐
            if(x <0 || y < 0 || x >= N || y >= N || map[x][y] == -1) return;
            q.addFirst(new node (x,y));
            // 만약 사과가 없다면
            if(map[x][y] != 1) {
                node temp = q.removeLast();
                map[temp.x][temp.y] = 0;
            }
            map[x][y] = -1;
            // 회전해야할 때라면
            if(!dirConvert.isEmpty() && Integer.parseInt(dirConvert.get(0)[0])  == result) {
                rotate(dirConvert.get(0)[1]);
                dirConvert.remove(0);
            }
        }
    }

    public static void rotate(String d) {
        if(d.equals("L")) dir = (dir+1)%4;
        else {
            dir--;
            if(dir < 0 ) dir = 3;
        }
    }
}