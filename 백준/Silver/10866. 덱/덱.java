import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Deque<Integer> D = new ArrayDeque<>();
		int N = Integer.parseInt(br.readLine());
		for(int i=0;i<N;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			switch(st.nextToken()) {
				case "push_front" :
					int A = Integer.parseInt(st.nextToken());
					D.addFirst(A);
					break;
				case "push_back" :
					A = Integer.parseInt(st.nextToken());
					D.addLast(A);
					break;
				case "pop_front" :
					if(D.isEmpty()) {
						sb.append("-1\n");
					}
					else {
						sb.append(D.removeFirst() + "\n");
					}
					break;
				case "pop_back" :
					if(D.isEmpty()) {
						sb.append("-1\n");
					}
					else {
						sb.append(D.removeLast() + "\n");
					}
					break;
				case "size" :
					sb.append(D.size() + "\n");
					break;
				case "empty" :
					if(D.isEmpty()) {
						sb.append("1\n");
					}
					else {
						sb.append("0\n");
					}
					break;
				case "front" :
					if(D.isEmpty()) {
						sb.append("-1\n");
					}
					else {
						sb.append(D.getFirst() + "\n");
					}
					break;
				case "back" :
					if(D.isEmpty()) {
						sb.append("-1\n");
					}
					else {
						sb.append(D.getLast() + "\n");
					}
					break;
			}
		}
		System.out.print(sb);
	}
}