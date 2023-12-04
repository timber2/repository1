import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		double sum = 0;
		int count =0;
		for(int i=0;i<20;i++) {
			String str = br.readLine();
			StringTokenizer st = new StringTokenizer(str);
			st.nextToken();
			double score = Double.parseDouble(st.nextToken());
			str = st.nextToken();
			double score2;
			if(str.equals("A+")) {
				score2 = 4.5;
			}
			else if (str.equals("A0")) {
				score2 = 4.0;
			}
			else if (str.equals("B+")) {
				score2 = 3.5;
			}
			else if (str.equals("B0")) {
				score2 = 3.0;
			}
			else if (str.equals("C+")) {
				score2 = 2.5;
			}
			else if (str.equals("C0")) {
				score2 = 2.0;
			}
			else if (str.equals("D+")) {
				score2 = 1.5;
			}
			else if (str.equals("D0")) {
				score2 = 1.0;
			}
			else if (str.equals("F")) {
				score2 = 0;
			}
			else {
				continue;
			}
			sum+=score*score2;
			count+=score;
		}
		double result = sum/count;
		sb.append(result+"");
		System.out.println(sb);
	}
}