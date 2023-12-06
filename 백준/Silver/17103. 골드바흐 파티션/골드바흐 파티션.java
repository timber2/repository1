import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		boolean [] bool =  new boolean[1000001];
		Arrays.fill(bool, true);
		for(int i=2;i<1000000;i+=2) { 
			if(!bool[i]) {
				continue;
			}
			int num = i;
			while((num +=i) <=1000000) {
				bool[num] = false;
			}
			if(i == 2) {
				i--;
			}
		}
		int T = Integer.parseInt(br.readLine());
		while((T--) !=0) {
			int cnt = 0;
			int N = Integer.parseInt(br.readLine());
			for(int A= 2, B = N-2; A<=B; A+=2,B-=2) {
				if(bool[A] && bool[B]) {
					cnt++;
				}
				if(A==2) {
					A--;
					B++;
				}
			}
			sb.append(cnt + "\n");
		}
		sb.deleteCharAt(sb.length() -1);
		System.out.print(sb);
	}
}