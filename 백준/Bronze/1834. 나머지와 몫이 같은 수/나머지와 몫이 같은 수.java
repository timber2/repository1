import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		long N = Integer.parseInt(br.readLine());
		long count = 0;
		for(int i=1;i<N;i++) {
			count += i*N + i;
		}
		bw.write(count + "");
		bw.flush();
		bw.close();
	}
}