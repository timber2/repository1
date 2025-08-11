import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;
    static int N;
    static int[] arr,sorted;
    static List<Integer> list = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        arr = new int [N];
        sorted = new int [N];
        for(int i=0;i < N ;i++) {
            int num = Integer.parseInt(st.nextToken());
            arr[i] = num;
            sorted[i] = num;
        }
        Arrays.sort(sorted);
        list.add(sorted[0]);
        for(int i=1;i < N ;i++) if(sorted[i] != sorted[i-1]) list.add(sorted[i]);
        for(int i=0;i < N ;i++) sb.append(findIndex(arr[i])).append(" ");
        System.out.print(sb);
    }
    public static int findIndex(int target) {
        int mid, st = 0, en = list.size() -1;
        while(st < en) {
            mid = (st + en)/2;
            if(list.get(mid) >= target) en = mid;
            else st = mid +1;
        }
        return st;
    }
}