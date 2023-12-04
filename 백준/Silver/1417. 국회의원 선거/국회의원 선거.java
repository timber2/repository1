import java.util.*;
import java.io.*;

public class Main {
	static String result = "No";
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		int Myscore = Integer.parseInt(br.readLine());
		int [] score = new int [N];
		int count =0;
		for(int i=1;i<N;i++) {
			score[i] = Integer.parseInt(br.readLine());
		}
		while (true) {
			Arrays.sort(score);
			if(score[N-1] <Myscore ) {
				break; 
			}
			else {
				Myscore++;
				score[N-1]--;
				count++;
			}
		}
		sb.append(count + "");
		System.out.println(sb);
	}
}