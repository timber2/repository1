import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		boolean [] bool = new boolean[10000001];
		Vector<Integer> V = new Vector<>();
		Arrays.fill(bool, true);
		
		for(int i=2;i<=10000000;i+=2) {
			if(!bool[i]) {
				continue;
			}
			int num = i * 2;
			while(num<=10000000) {
				bool[num] = false;	
				num = num + i;
			}
			if(i==2) {
				i -=1;
			}
		}
        if(N ==1) {
            System.exit(0);
        }
		if(bool[N]) {
			System.out.print(N);
			System.exit(0);
		}
		while(N !=1) {
			for(int i=2;i<=10000000;i+=2) {
				if(!bool[i]) {
					continue;
				}
				if(N%i == 0) {
					N = N/i;
					V.add(i);
					break;
				}
				if(i==2) {
					i-=1;
				}
			}
		}
		Object[] ob = V.toArray();
		Arrays.sort(ob);
		for(int i=0;i<ob.length;i++) {
			sb.append(ob[i] + "\n");
		}
		sb.deleteCharAt(sb.length()-1);
		System.out.print(sb);
	}
}