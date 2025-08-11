import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;
    static int N , M;
    static int[] arr;
    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        arr = new int [N];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i <  N ;i++) arr[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(arr);
        M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        while(st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());
            int result =0, st = 0, en = arr.length -1;
            while(st <= en) {
                int mid = (st+en)/2;
                if(num < arr[mid]) en = mid -1;
                else if(num > arr[mid]) st = mid +1;
                else {
                    result = 1;
                    break;
                }
            } 
            sb.append(result).append("\n");
        }
        System.out.print(sb);
    }
}