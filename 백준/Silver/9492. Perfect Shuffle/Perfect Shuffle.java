import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N;
		while((N = Integer.parseInt(br.readLine()))!= 0) {
			StringBuilder sb = new StringBuilder();
			String []array = new String[N];
			for(int i=0;i<N;i++) {
				array[i] = br.readLine();
			}
			for(int i=0;i<N;i++) {
				if(i%2==0) {
					sb.append(array[i/2]+"\n");
				}
				else {
					if(N%2==0) {
						sb.append(array[i/2 + N/2] + "\n");
					}
					else {
						sb.append(array[i/2 + N/2 + 1] + "\n");
					}
				}
			}
			System.out.print(sb);
		}
	}
}