import java.util.*;
import java.io.*;

public class Main {
	static String result = "stay home";
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str);
		int persons = Integer.parseInt(st.nextToken());// 인원
		int money = Integer.parseInt(st.nextToken());// 예산 
		int hotel = Integer.parseInt(st.nextToken());// 호탤
		int week = Integer.parseInt(st.nextToken());// 주 
		int Lowest_cost = Integer.MAX_VALUE;
		for(int i=0;i<hotel;i++) {
			int cost = Integer.parseInt(br.readLine());
			str = br.readLine();
			st = new StringTokenizer(str);
			if(cost *persons <=money) {
				for(int j=0;j<week;j++) {
					if(Integer.parseInt(st.nextToken())>=persons) {
						if(cost<Lowest_cost) {
							Lowest_cost = cost;
							result = cost*persons + "";
							break;
						}
					}
				}
				
			}
			else {
				continue;
			}
		}
		sb.append(result);
		System.out.println(sb);
	}
}