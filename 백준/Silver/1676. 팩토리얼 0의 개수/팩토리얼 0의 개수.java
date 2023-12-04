import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		int cnt = 0;
		for(int i=5;i<=N;i+=5) {
			int A = i;
			while(A%5==0) {
				A = A/5;
				cnt++;
			}
		}
		sb.append(cnt);
		System.out.print(sb);
	}
}