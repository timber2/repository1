import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Stack<Integer> S = new Stack<>();
		Deque<Integer> D = new LinkedList<>();
		int N = Integer.parseInt(br.readLine());
		int X;
		for(int i=0;i<N;i++) {
			StringTokenizer str = new StringTokenizer(br.readLine());
			switch(str.nextToken()) {
				case "push_front": 
					X = Integer.parseInt(str.nextToken());
					D.addFirst(X);
					break;
				case "push_back" :
					X = Integer.parseInt(str.nextToken());
					D.addLast(X);
					break;
				case "pop_front" :
					if(D.isEmpty()) sb.append("-1");
					else sb.append(D.pollFirst());
					sb.append("\n");
					break;
				case "pop_back" :
					if(D.isEmpty()) sb.append("-1");
					else sb.append(D.pollLast());
					sb.append("\n");
					break;
				case "size" :
					sb.append(D.size() + "\n");
					break;
				case "empty" :
					if(D.isEmpty()) sb.append("1");
					else sb.append("0");
					sb.append("\n");
					break;
				case "front" :
					if(D.isEmpty()) sb.append("-1");
					else sb.append(D.getFirst());
					sb.append("\n");
					break;
				case "back" :
					if(D.isEmpty()) sb.append("-1");
					else sb.append(D.getLast());
					sb.append("\n");
					break;
			}
		} 
		System.out.print(sb);
	}
}