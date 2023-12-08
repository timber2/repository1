import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer str = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(str.nextToken());
		int B = Integer.parseInt(str.nextToken());
		while(N!=0) {
			int num = N%B;
			N = N/B;
			if(num >=10) {
				sb.append((char) (num+55));
				continue;
			}
			sb.append(num);
		}
		sb.reverse();
		System.out.print(sb);
	}
}