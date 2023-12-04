import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Stack<Character> S = new Stack<>();
		String s = br.readLine();
		int sum = 0;
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			switch(c) {
				case '(':
					S.push(c);
					break;
				case ')':
					if(s.charAt(i-1) =='(') {
						S.pop();
						sum+=S.size();
					}
					else {
						S.pop();
						sum++;
					}
					break;
			}
			if(i == s.length()-1) {
				while(!S.isEmpty()) {
					sum++;
					S.pop();
				}
			}
		}
		sb.append(sum+"");
		System.out.print(sb);
	}
}