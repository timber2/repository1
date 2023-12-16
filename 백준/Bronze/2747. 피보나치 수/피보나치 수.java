import java.util.*;
import java.io.*;

public class Main {
	static long [] array;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {
		StringBuilder sb = new StringBuilder();
		array = new long [45]; 
		array[0] = 1;
		array[1] = 1;
		for(int i=0;i<43;i++) {
			getNextIndex(i);
		}
		int N = Integer.parseInt(br.readLine());
		sb.append(array[N-1]);
		System.out.println(sb);
	}
	static void getNextIndex(int i) { 
		array[i+2] = array[i] + array[i+1];
	}
}