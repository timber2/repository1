import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = br.readLine();
		int mult = 1;
		int cnt = 0;
		for(int i=s.length()-1;i>=0;i--) {
			cnt += Character.getNumericValue(s.charAt(i)) * mult;
			mult *=2;
			if(mult == 8 || i ==0) {
				sb.append(cnt);
				mult =1;
				cnt = 0;
			}
		}
		sb.reverse();
		System.out.print(sb);
	}
}