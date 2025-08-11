import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;
    static int N,M;
    static int[] arr;
    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        arr = new int [N];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i< N ;i++) arr[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(arr);
        M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        while(st.hasMoreTokens()) {
            int target = Integer.parseInt(st.nextToken());
            sb.append(endIndex(target) - startIndex(target)).append(" ");
        }
        System.out.print(sb);
    }
    public static int startIndex(int target) {
        int mid, st = 0, en = arr.length;
        while(st < en) {
            mid = (st+en)/2;
            if(arr[mid] >= target) en = mid;
            else st = mid + 1;
        }
        return st;
    }
    public static int endIndex(int target) {
        int mid, st = 0, en = arr.length;
        while(st < en) {
            mid = (st+en)/2;
            if(arr[mid] > target) en = mid;
            else st = mid + 1;
        }
        return st;
    }
}