import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str);
		StringBuilder sb = new StringBuilder();
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int[][] square = new int [A][B];
		for(int i=0;i<A;i++) {
			str = br.readLine();
			st = new StringTokenizer(str);
			for(int j=0;j<B;j++) {
				square[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		int Max_sum = Integer.MIN_VALUE;
		int sum,Index1=0,Index2=0;
		for(int i=0;i<A;i++) {
			for(int j=0;j<B;j++) {
				sum=0;
				if((i+2)>=A || (j+2)>=B) {
					continue;
				}
				else {
					for(int k=i;k<i+3;k++) {
						for(int l=j;l<j+3;l++) {
							sum+=square[k][l];
						}
					}
					if(sum > Max_sum) {
						Max_sum = sum;
						Index1 = i+1;
						Index2 = j+1;
					}
				}
			}
		}
		sb.append(Max_sum + "\n" + Index1 + " " + Index2);
		System.out.print(sb);
	}
}