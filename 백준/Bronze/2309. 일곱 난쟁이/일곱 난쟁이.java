import java.util.*;
import java.io.*;

public class Main {
		static int[] nanjaeng9 = new int [9];
		static Vector nanjaeng7 = new Vector(7);
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int sum= 0;
		for(int i = 0;i<9;i++) {
			nanjaeng9[i] = Integer.parseInt(br.readLine());
			sum+=nanjaeng9[i];
		}
		Loop1 :
		for(int i=0;i<8;i++) {
			Loop2 :
			for(int j=i+1;j<9;j++) {
				if(nanjaeng9[i] + nanjaeng9[j] == sum - 100) {
					makeArray(i,j);
					break Loop1;
				}
			}
		}
		Collections.sort(nanjaeng7);
		for(var e : nanjaeng7) {
			bw.write(e + "\n");
		}
		bw.flush();
		bw.close();
	}
	static void makeArray(int i, int j) {
		for(int a = 0 ; a < 9 ; a++) {
			if(a == i || a == j) {
				continue;
			}
			nanjaeng7.add(nanjaeng9[a]);
		}
		return;
	}
}