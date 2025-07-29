import java.util.*;
import java.io.*;


public class Main {
	static int T;
	static int[][] array = new int[41][2];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb= new StringBuilder();
		array[0][0] = 1;
		array[0][1] =0;
		array[1][0] = 0;
		array[1][1] = 1;
		for(int i=2;i<41;i++) {
			array[i][0] = array[i-1][0] + array[i-2][0];
			array[i][1] = array[i-1][1] + array[i-2][1];
		}
		T = Integer.parseInt(br.readLine());
		for(int i=0; i<T;i++) {
			int N = Integer.parseInt(br.readLine());
			sb.append(array[N][0] + " " + array[N][1] + "\n");
		}
		sb.deleteCharAt(sb.length()-1);
		System.out.print(sb);
	}
}