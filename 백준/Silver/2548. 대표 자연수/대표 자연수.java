import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException { 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		int [] array = new int [N];
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str);
		for(int i=0;i<N;i++) {
			array[i] = Integer.parseInt(st.nextToken());
		}
		int Min_value = Integer.MAX_VALUE;
		int Min_index =0;
		for(int i=0;i<N;i++) {
			int sum = 0;
			for(int j=0;j<N;j++) {
				sum += Math.abs(array[i] - array[j]);
			}
			if(sum <Min_value) {
				Min_value = sum;
				Min_index = i;
			}
			else if(sum == Min_value) {
				Min_index = (array[i] < array[Min_index]) ? i :Min_index ;
			}
		}
		sb.append(array[Min_index]+"");
		System.out.print(sb);
	}
}