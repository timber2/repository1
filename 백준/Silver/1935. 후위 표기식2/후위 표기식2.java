import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		//  65 ~ 90 , + = 43. - = 45 , * = 42 , / = 47 % = 37
		int N = Integer.parseInt(br.readLine());
		Double [] alphabet = new Double [N];
		String st = br.readLine();
		Stack<Double> S = new Stack<>();
		for(int i=0;i<N;i++) {
			alphabet[i] = Double.parseDouble(br.readLine());
		} // 1 2 3 4 5 
		Double result = null;
		for(int i =0;i<st.length();i++) {
			if((int)st.charAt(i)>=65) {
				S.push(alphabet[(int)st.charAt(i) -65]);
			}
			else {
				Double B = S.peek();
				S.pop();
				Double A = S.peek();
				S.pop();
				switch(st.charAt(i)) {
					case '+':
						result = A + B;
						break;
					case '-':
						result = A - B;
						break;
					case '*':
						result = A * B;
						break;
					case '/':
						result = A / B;
						break;
					case '%':
						result = A % B;
						break;
				}
				S.push(result);
			}
		}
		String result2 = String.format("%.2f",S.peek());
		sb.append(result2 + "");
		System.out.print(sb);
	}
}