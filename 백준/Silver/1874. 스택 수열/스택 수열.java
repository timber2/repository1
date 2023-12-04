import java.util.*;
import java.io.*;

public class Main {
	static int count =0;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Stack<Integer> stk = new Stack<>();
		int N = Integer.parseInt(br.readLine());
		for(int i=0;i<N;i++) {
			int num = Integer.parseInt(br.readLine());
			if(num>count) 
			{
				while(num!=count) {
					stk.push(++count);
					sb.append("+\n");
				}
				stk.pop();
				sb.append("-\n");
			}
			else {
				if(stk.empty()) {
					System.out.println("NO");
					return;
				}
				while(stk.peek() !=num) {
					stk.pop();
					sb.append("-\n");
					if(stk.empty()) {
						System.out.println("NO");
						return;
					}
				}
				stk.pop();
				sb.append("-\n");
			}
		}
		System.out.print(sb);
	}
}