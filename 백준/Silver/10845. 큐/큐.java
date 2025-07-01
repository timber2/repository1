import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Queue<Integer> Q = new LinkedList<>();
		int n = Integer.parseInt(br.readLine());
		int last = Integer.MAX_VALUE;;
		for(int i=0;i<n;i++) {
			StringTokenizer str = new StringTokenizer(br.readLine());
			switch(str.nextToken()) {
				case "push" :
					last = Integer.parseInt(str.nextToken());
					Q.add(last);
					break;
				case "pop" :
					if(!Q.isEmpty()) sb.append(Q.remove() + "\n");
					else sb.append("-1\n");
					break;
				case "size" :
					sb.append(Q.size() + "\n");
					break;
				case "empty" :
					if(Q.isEmpty()) 	sb.append("1\n");
					else sb.append("0\n");
					break;
				case "front" :
					if(!Q.isEmpty()) sb.append(Q.peek() + "\n");
					else sb.append("-1\n");
					break;
				case "back" :
					if(!Q.isEmpty()) sb.append(last + "\n");
					else sb.append("-1\n");
					break;
			}
		}
		System.out.print(sb);
	}
}