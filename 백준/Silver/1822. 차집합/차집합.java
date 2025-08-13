import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;
    static int A,B, count =0;
    static List<Integer> listA = new ArrayList<>();
    static List<Integer> listB = new ArrayList<>();
    static List<Integer> result = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for(int i=0;i < A ;i++) listA.add(Integer.parseInt(st.nextToken()));
        Collections.sort(listA);
        st = new StringTokenizer(br.readLine());
        for(int i=0; i < B ;i++)listB.add(Integer.parseInt(st.nextToken()));
        Collections.sort(listB);
        for(int i=0;i < listA.size();i++) {
            int num = listA.get(i);
            if(Collections.binarySearch(listB, num) <0) result.add(num);
        }
        sb.append(result.size()).append("\n");
        for(int e : result) sb.append(e).append(" ");
        System.out.print(sb);
    }
}