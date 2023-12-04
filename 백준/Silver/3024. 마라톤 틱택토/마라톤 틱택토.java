import java.util.*;
import java.io.*;

public class Main {
	static int [] dx = {0,0,1,1,1,-1,-1,-1};
	static int [] dy = {1,-1,0,1,-1,0,-1,1};
	static String result = "ongoing";
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		char[][] ch = new char[N][N];
		for(int i=0;i<N;i++) {
			String st = br.readLine();
			for(int j=0;j<N;j++) {
				ch[i][j] = st.charAt(j);
			}
		}
		Loop1:
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				if(ch[i][j] == '.') {
					continue;
				}
				Loop2 :
				for(int k=0;k<8;k++) {
					int count =0;
					for(int t = 1;t<3;t++) {
						int new_x = j + dx[k]*t;
						int new_y = i + dy[k]*t;
						if(new_x<0||new_x>=N|| new_y<0||new_y>=N) {
							continue Loop2;
						}
						if(ch[new_y][new_x] == ch[i][j]) {
							count++;
						}
						if(count == 2) {
							result = ch[i][j] + "";
							break Loop1;
						}
					}
				}
			}
		}
		sb.append(result);
		System.out.print(sb);
	}
}