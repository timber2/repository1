import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = br.readLine();
		boolean b = false;
		Stack<Character> S = new Stack<>();
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if(b) { // 꺽새 활성화
				sb.append(c + "");
				if(c == '>') {
					b = false;
				}
			}
			else { // 꺽새 활성화 안된것
				if(c == ' ') {
					
				}
				else if(c=='<') {
					b = true;
				}
				else {
					S.push(c);
					if(i ==s.length()-1) {
						while(S.size()!=0) {
							sb.append(S.pop());
						}
					}
					continue;
				}
				while(S.size()!=0) {
					sb.append(S.pop());
				}
				sb.append(c+"");
			}
		}
		System.out.print(sb);
	}
}