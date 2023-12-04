import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int []worktime = new int [7];
		String [] work = {"Re","Pt","Cc","Ea","Tb","Cm","Ex"};
		StringBuilder sb = new StringBuilder();
		String str;
		int count = 0;
		while((str = br.readLine()) != null) {
			StringTokenizer st = new StringTokenizer(str);
			while(st.hasMoreTokens()) {
				String tk = st.nextToken();
				if(tk.equals("Re")) {
					worktime[0]++;
					count++;
				}
				else if (tk.equals("Pt")) {
					worktime[1]++;
					count++;
				}
				else if (tk.equals("Cc")) {
					worktime[2]++;
					count++;
				}
				else if (tk.equals("Ea")) {
					worktime[3]++;
					count++;
				}
				else if (tk.equals("Tb")) {
					worktime[4]++;
					count++;
				}
				else if (tk.equals("Cm")) {
					worktime[5]++;
					count++;
				}
				else if (tk.equals("Ex")) {
					worktime[6]++;
					count++;
				}
				else {
					count++;
				}
			}
		}
		for(int i=0;i<7;i++) {
			sb.append(work[i] + " " + worktime[i] + " " + String.format("%.2f", (double)worktime[i]/count) + "\n");
		}
		sb.append("Total " + count + " 1.00");
		System.out.print(sb);
	}
}