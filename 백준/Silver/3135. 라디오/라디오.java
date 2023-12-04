import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str);
		int A = Integer.parseInt(st.nextToken());// 현재 주파수
		int B = Integer.parseInt(st.nextToken());// 듣고싶은 주파수 
		int N = Integer.parseInt(br.readLine()); 
		
		int []array = new int [N];
		for(int i=0;i<N;i++) {
			array[i] = Math.abs(Integer.parseInt(br.readLine()) -B);
		}
		Arrays.sort(array);
		int count = 0;
		if(array[0] < Math.abs(A-B)) {
			count++;
			count+=array[0];
		}
		else {
			count = Math.abs(A-B);
		}
		sb.append(count);
		System.out.println(sb);
	}
}