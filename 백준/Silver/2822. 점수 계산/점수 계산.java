import java.io.*;
import java.util.*;

public class Main {
	static int [] Q = new int [8];
	static int [] A = new int [8];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for(int i=0;i<8;i++) {
			Q[i] = Integer.parseInt(br.readLine());
			A[i] = Q[i];
		}
		Arrays.sort(A);
		int sum = 0;
		for(int i=3;i<8;i++) {
			sum+=A[i];
		}
		bw.write(sum + "\n");
		for(int i=0;i<8;i++) {		
			if(Q[i] > A[2]) 
				bw.write((i+1) + " ");
		}
		bw.flush();
		bw.close();
	}
}