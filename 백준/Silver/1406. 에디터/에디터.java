import java.util.*;
import java.io.*;

public class Main {
	static int count =0;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		LinkedList<Character> list = new LinkedList<>(Arrays.asList());
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			list.add(c);
		}
		ListIterator<Character> it = list.listIterator();
		while(it.hasNext()) {
			it.next();
		}
		int N = Integer.parseInt(br.readLine());
		for(int i=0;i<N;i++) {
			str= br.readLine();
			StringTokenizer st = new StringTokenizer(str);
			String s = st.nextToken();
			if(s.equals("L") && it.hasPrevious()) {
				it.previous();
			}
			else if(s.equals("D") && it.hasNext()) {
				it.next();
			}
			else if(s.equals("B") && it.hasPrevious()) {
				it.previous();
				it.remove();
			}
			else if(s.equals("P")) { // P $
				String s2 = st.nextToken();
				char c = s2.charAt(0);
				it.add(c);
			}
		}
		it = list.listIterator();
		while(it.hasNext()) {
			sb.append(it.next() + "");
		}
		System.out.println(sb);
	}
}