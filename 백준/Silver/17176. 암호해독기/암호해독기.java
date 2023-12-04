import java.util.*;
import java.io.*;

public class Main {
	static char answer = 'y';
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		int[] array = new int[53];
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str);
		for(int i=0;i<N;i++) {
			int a = Integer.parseInt(st.nextToken());
			array[a]++;
		}
		str = br.readLine();
		for(int i=0;i<str.length();i++) {
			int a = (int)str.charAt(i) - 64;
			if(a ==-32) {
				a = 0;
			}
			if(a>=27) {
				a-=6;
			}
			if(array[a] ==0) {
				answer = 'n';
				break;
			}
			array[a]--;
		}
		sb.append(answer+"");
		System.out.print(answer);
	}
}