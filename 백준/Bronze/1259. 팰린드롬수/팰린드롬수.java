import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		while(true) {
			String str = br.readLine();
			if(str.equals("0"))
				break;
			StringBuilder sb = new StringBuilder(str);
			sb.reverse();
			if(str.equals(sb.toString()))
			{
				bw.write("yes\n");
				bw.flush();
			}
			else {
				bw.write("no\n");
				bw.flush();
			}
		}
	}
}