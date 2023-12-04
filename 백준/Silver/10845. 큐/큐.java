import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Queue<Integer> Q = new LinkedList<>();
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		int last = 0;
		for(int i=0;i<N;i++) {
			String str = br.readLine();
			StringTokenizer st = new StringTokenizer(str);
			str = st.nextToken();
			switch(str) {
				case "push":
					last = Integer.parseInt(st.nextToken());
					Q.add(last);
					break;
				case "pop":
					if(Q.isEmpty()) {
						sb.append("-1\n");
						continue;
					}
					sb.append(Q.peek() + "\n");
					Q.remove();
					break;
				case "size":
					sb.append(Q.size()+"\n");
					break;
				case "empty":
					if(Q.isEmpty()) {
						sb.append("1\n");
					}
					else {
						sb.append("0\n");
					}
					break;
				case "front":
					if(Q.isEmpty()) {
						sb.append("-1\n");
						continue;
					}
					sb.append(Q.peek()+"\n");
					break;
				case "back":
					if(Q.isEmpty()) {
						sb.append("-1\n");
						continue;
					}
					sb.append(last+"\n");
					break;
				}
		}
		System.out.println(sb);
	}
}