import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;
    static int N, result = Integer.MAX_VALUE;
    static int[][] grap;
    static int[] member;
    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        grap = new int[N][N];
        member = new int[N];
        for(int i=0;i < N ;i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j <  N ;j++) {
                grap[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        func(0,0);
        sb.append(result);
        System.out.print(sb);
    }
    static void func(int depth, int start) {
        if(depth == N /2 ) {
            // 점수 매겨서 팀 간의 차이를 비교하는 로직
            int team1=0, team2=0;
            for(int i=0;i < N ;i++) {
              for(int j=i+1;j < N ;j++) {
                  if(member[i] != member[j]) continue;
                  if (member[i] == 0) {
                      team1 += grap[i][j];
                      team1 += grap[j][i];
                  } else if (member[i] == 1) {
                      team2 += grap[i][j];
                      team2 += grap[j][i];
                  }
              }
            }
            result = Math.min(result, Math.abs(team1-team2));
            return;
        }
        else {
            for(int i=start;i < N ;i++) {
                if(member[i] == 1) continue;
                member[i] = 1;
                func(depth +1, i+1);
                member[i] = 0;
            }
        }
    }
}