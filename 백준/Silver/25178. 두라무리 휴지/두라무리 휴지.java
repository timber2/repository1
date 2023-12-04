import java.util.*;
import java.io.*;

public class Main {
	static String result = "YES";
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		String str1 = br.readLine();
		String str2 = br.readLine();
		if(str1.charAt(0) !=str2.charAt(0) || str1.charAt(N-1) != str2.charAt(N-1)) {
			result = "NO";
		}
		if(!(str1.replaceAll("[aeiou]", "").equals(str2.replaceAll("[aeiou]", "")))) {
			result = "NO";
		}
		int [] alphabet = new int ['Z'-'A'+1];
		for(int i=0;i<N;i++) {
			alphabet[(int)str1.charAt(i)-'a']++;
			alphabet[(int)str2.charAt(i)-'a']--;
		}
		for(int i=0;i<alphabet.length;i++) {
			if(alphabet[i] !=0) {
				result = "NO";
				break;
			}
		}
		sb.append(result+"");
		System.out.print(sb);
	}
}