import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer str = new StringTokenizer(br.readLine());
		String S = str.nextToken();
		long N =Long.parseLong(str.nextToken());
		int sum = 0;
		long a = N;
		for(int i=S.length()-1;i>=0;i--) {
			int num;
			if((int)S.charAt(i) >=65) {
				num = (int)S.charAt(i) - 55;
			}
			else {
				num = Character.getNumericValue(S.charAt(i));
			}
			if(i == S.length()-1) {
				sum +=num;
			}
			else {
				sum += num*N;
				N = N*a;
			}
		}
		sb.append(sum);
		System.out.print(sb);
	}
}