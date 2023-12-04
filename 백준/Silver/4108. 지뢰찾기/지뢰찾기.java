import java.util.*;
import java.io.*;

public class Main {
	static int[] dx = {1, -1, 0, 0 , 1, -1,-1, 1};
	static int[] dy = {0, 0, 1, -1 , 1, 1, -1,-1};
	public static void main(String[] args) throws IOException { 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {	
			StringBuilder sb = new StringBuilder();
			StringTokenizer st = new StringTokenizer(br.readLine());
			int R = Integer.parseInt(st.nextToken());
			int C = Integer.parseInt(st.nextToken());
			if(R==0 && C==0) return;
			char[][] map = new char [R][C];
			for(int i=0;i<R;i++) {
				String str = br.readLine();
				for(int j = 0;j<C;j++) {
					map[i][j] = str.charAt(j);
				}
			}
			for(int i=0;i<R;i++) {
				for(int j=0;j<C;j++) {
					int count = 0;
					if(map[i][j] == '*') {
						sb.append("*");
						continue;
					}
					else {
						for(int k=0;k<8;k++) {
							int x = j + dx[k];
							int y = i + dy[k];
							if(x<0 || x>=C || y<0||y>=R) {
								continue;
							}
							if(map[y][x] == '*')
								count++;
						}
					}
					sb.append(count+"");
				}
				sb.append("\n");
			}
			System.out.print(sb);
		}
		
	}
}