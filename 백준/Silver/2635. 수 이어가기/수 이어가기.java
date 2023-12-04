import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException { 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		int Max = Integer.MIN_VALUE;
		Vector A = new Vector();
		for(int i=N;i>=0;i--) {
			Vector V = new Vector();
			V.add(N);
			int prevNum = N;
			int nextNum = N-i;
			while(nextNum >=0) {
				V.add(nextNum);
				int dif = prevNum-nextNum;
				prevNum = nextNum;
				nextNum = dif;
			}
			if(V.size()>Max) {
				Max = V.size();
				A = V;
			}
		}
		sb.append(Max+"\n");
		for(var e : A) {
			sb.append(e+" ");
		}
		sb.deleteCharAt(sb.length()-1);
		System.out.print(sb);
	}
}