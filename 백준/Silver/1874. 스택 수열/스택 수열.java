import java.util.*;
import java.io.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {
		Stack<Integer> S = new Stack<>();
		StringBuilder sb = new StringBuilder();
		// 숫자를 입력받음 ex) 4 3 6 8 7 5 2 1 
		int n = Integer.parseInt(br.readLine());
		int it = 0; // 현재 숫자
		for(int i=0;i<n;i++) {
			int num = Integer.parseInt(br.readLine());
			if(num >=it) {
				while(num !=it) {
					it++;
					S.add(it);
					sb.append("+\n");
				}
				S.pop();
				sb.append("-\n");
			}
			else {  // num이 현재 it보다 작은 경우에는
				if(S.empty()) {
					System.out.print("NO");
					System.exit(0);
				}
				while(S.peek() != num) {
					S.pop();
					sb.append("-\n");
					if(S.empty()) {
						System.out.print("NO");
						System.exit(0);
					}
				}
				S.pop();
				sb.append("-\n");
			}
		}
		sb.deleteCharAt(sb.length()-1);
		System.out.print(sb);
	}
}