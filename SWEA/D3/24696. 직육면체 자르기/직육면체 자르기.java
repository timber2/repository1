import java.io.*;
import java.util.*;

class Solution
{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
	public static void main(String args[]) throws Exception
	{
		int T = Integer.parseInt(br.readLine());
		Loop1:
		for(int test_case = 1; test_case <= T; test_case++)
		{
            st = new StringTokenizer(br.readLine());
            while(st.hasMoreTokens()) {
                if(Integer.parseInt(st.nextToken()) %2 ==0) {
                    System.out.println(1);
                	continue Loop1;
                }
            }
            System.out.println(2);
		}
	}
}