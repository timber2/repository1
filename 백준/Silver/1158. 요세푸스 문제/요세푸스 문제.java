import java.util.*;
import java.io.*;

public class Main {
	static int[] array = new int [20000001];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		sb.append("<");
		StringTokenizer str = new StringTokenizer(br.readLine());
		Queue<Integer> Q = new LinkedList<>();
		int N = Integer.parseInt(str.nextToken());
		int K = Integer.parseInt(str.nextToken()) -1;
		for(int i=0;i<N;i++) {
			Q.add(i+1);
		}
		while(N-->0) {
			for(int i=0;i<K;i++) {
				Q.add(Q.peek());
				Q.remove();
			}
			sb.append(Q.peek()+ ", ");
			Q.remove();
		}
		sb.deleteCharAt(sb.length()-1);
		sb.deleteCharAt(sb.length()-1);
		sb.append(">");
		System.out.print(sb);
	}
}