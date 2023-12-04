import java.io.*;
import java.util.*;

public class Main {
	static int [] UL = new int [9];
	static int [] SL = new int [9];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String UL_score = br.readLine();
		StringTokenizer st = new StringTokenizer(UL_score);
		for(int i=0;i<9;i++) {
			UL[i] = Integer.parseInt(st.nextToken());
		}
		String SL_score = br.readLine();
		st = new StringTokenizer(SL_score);
		for(int i=0;i<9;i++) {
			SL[i] = Integer.parseInt(st.nextToken());
		}
		int result=0;
		for(int i=0;i<=8 ;i++) {
			if(sum(UL, i) > result) {
				bw.write("Yes");
				bw.flush();
				return;
			}
			result =sum(SL,i);
		}
		bw.write("No");
		bw.flush();
		bw.close();
	}
	static int sum(int [] array , int a) {
		int sum = 0;
		for(int i=0;i<=a;i++) {
			sum+=array[i];
		}
		return sum;
	}
}