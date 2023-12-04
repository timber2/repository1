import java.util.*;
import java.io.*;

public class Main {
	static String result = "No";
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		long k = Integer.parseInt(br.readLine());
		String str= br.readLine();
		StringTokenizer st = new StringTokenizer(str);
		long a = Integer.parseInt(st.nextToken());
		long b = Integer.parseInt(st.nextToken());
		long c = Integer.parseInt(st.nextToken());
		long d = Integer.parseInt(st.nextToken());
		if(a*k +b == c*k+d) {
			result = "Yes " + (a*k+b) ;
		}
		sb.append(result);
		System.out.println(sb);
	}
}