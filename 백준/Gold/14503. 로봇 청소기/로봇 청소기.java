import java.io.*;
import java.util.*;

public class Main {
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int cnt = 0;
    static int N, M, x, y, d;
    static int[][] map;
    static boolean[][] visited;
    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        visited = new boolean[N][M];

        st = new StringTokenizer(br.readLine());
        x = Integer.parseInt(st.nextToken());
        y = Integer.parseInt(st.nextToken());
        d = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        solve();
        System.out.print(cnt);
    }
    public static void solve() {
        // 현재 칸 청소
        while(true) {
            if (!visited[x][y]) {
                visited[x][y] = true;
                cnt++;
            }
            // 4방향 중 청소할 곳이 있는지 확인
            if (bfs()) {
                // 4번 회전하면서 청소 가능한 방향 찾기
                for (int i = 0; i < 4; i++) {
                    d = (d + 3) % 4; // 반시계로 회전
                    int nx = x + dx[d];
                    int ny = y + dy[d];
                    if (canClean(nx, ny)) {
                        x = nx;
                        y = ny;
                        break;
                    }
                }
            } else {
                // 후진
                int nx = x + dx[(d + 2) % 4];
                int ny = y + dy[(d + 2) % 4];
                if (nx >= 0 && nx < N && ny >= 0 && ny < M && map[nx][ny] != 1) {
                    x = nx;
                    y = ny;
                }
                else break;
            }
        }
    }
    public static boolean bfs() {
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (canClean(nx, ny)) return true;
        }
        return false;
    }
    public static boolean canClean(int nx, int ny) {
        return nx >= 0 && nx < N && ny >= 0 && ny < M && map[nx][ny] != 1 && !visited[nx][ny];
    }
}
