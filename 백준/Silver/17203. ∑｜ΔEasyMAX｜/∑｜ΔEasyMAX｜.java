import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb= new StringBuilder();
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str);
		int N = Integer.parseInt(st.nextToken()); // 5
		int Q = Integer.parseInt(st.nextToken());
		int [] speed = new int [N];
		str = br.readLine();
		st = new StringTokenizer(str);
		for(int i=0;i<N;i++) {
			speed[i] = Integer.parseInt(st.nextToken()); // 1 0 1 0 -11
		}
		for(int k=0;k<Q;k++) {
			str = br.readLine();
			st = new StringTokenizer(str);
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken()); 
			int count =0;
			for(int t = i-1;t<j-1;t++) { // t = 0 t < 4 
				if(j-1<i) {
					continue;
				}
				count+=Math.abs(speed[t+1]-speed[t]);
			}
			sb.append(count + "\n");
		}
		sb.deleteCharAt(sb.length()-1);
		System.out.print(sb);
	}
}