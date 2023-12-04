import java.util.*;
import java.io.*;

public class Main {
	public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    int x = Integer.parseInt(br.readLine());
	    int count =0;
	    int lngth = 0;
	    for(int i =64; i>=1; i/=2) {
	        if(lngth + i <= x) {
	            count++;
	            lngth += i;
	        }
	        
	        if(lngth==x)
	            break;
	    }
	    bw.write(count + "");
	    bw.flush();
	    bw.close();
	}
}