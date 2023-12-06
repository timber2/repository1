import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String S = br.readLine();
		for(int i=0;i<S.length();i++) {
			int N =  Character.getNumericValue(S.charAt(i));
			int div = 4;
			while(div>0) {
				sb.append(N/div);
				N = N%div;
				div /=2;
			}
		}
		if(!sb.toString().equals("000")) {
			while(sb.charAt(0) =='0') {
				sb.deleteCharAt(0);
			}
		}
		else {
			System.out.print("0");
			System.exit(0);
		}
		System.out.print(sb);
	}
}