import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		long [] array = new long[N+1];
		array[1] = 1;
		if(N>=2) array[2] = 2;
		for(int i=3;i<=N;i++) {
			array[i] = (array[i-1] + array[i-2])%10007;
		}
		sb.append(array[N]);
		System.out.println(sb);		
	}
}