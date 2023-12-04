import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++) {		
			StringBuilder sb = new StringBuilder();
			br.readLine();
			String str = br.readLine();
			StringTokenizer st = new StringTokenizer(str);
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			char [][] ch = new char [A][B];
			for(int j =0;j<A;j++) {
				str = br.readLine();
				for(int k =0;k<B;k++) {
					ch[j][k] = str.charAt(k);					
				}
			}
			int count = 0;
			// '>' 나 'v'이게 탐색 
			for(int j=0;j<A;j++) {
				for(int k =0;k<B;k++) {
					if((ch[j][k] == '>') && (k+1 <B) && (k+2 <B)) {
						if(ch[j][k+1] == 'o' && ch[j][k+2] == '<') {
							count++;
						}
					}
					if((ch[j][k] == 'v') && (j+1 <A) && (j+2 <A)) {
						if(ch[j+1][k] == 'o' && ch[j+2][k] == '^') {
							count++;
						}
					}
				}
			}
			sb.append(count +"");
			System.out.println(sb);
		}
	}
}