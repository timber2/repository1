import java.util.*;
import java.io.*;

public class Main {
	static String result = "Woof-meow-tweet-squeek";
	static int[] finger = new int [5];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;
		for(int i=0;i<N;i++) {
			String str = br.readLine();
			st = new StringTokenizer(str);
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			finger[a-1]++;
			finger[b-1]++;
		}
		if(finger[0]==2 && finger[1]==0 &&finger[2]==2 &&finger[3]==2 &&finger[4]==0) {
			result = "Wa-pa-pa-pa-pa-pa-pow!";
		}
		sb.append(result+"");
		System.out.print(sb);
	}
}