import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;
    static Map<String, int[]> map = new HashMap<>();
    static int N;
    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        for(int i=0;i < N ;i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int kor = Integer.parseInt(st.nextToken());
            int eng = Integer.parseInt(st.nextToken());
            int math = Integer.parseInt(st.nextToken());
            map.put(name, new int[] {kor, eng, math});
        }
        List<String> list = new ArrayList<>(map.keySet());
        Collections.sort(list, (a,b) -> {
            int[] aScore = map.get(a);
            int[] bScore = map.get(b);
            if(aScore[0] != bScore[0]) return bScore[0] - aScore[0];
            else if(aScore[1] !=bScore[1]) return aScore[1] - bScore[1];
            else if(aScore[2] !=bScore[2]) return bScore[2] - aScore[2];
            return a.compareTo(b);
        });
        for(String e : list ) sb.append(e).append("\n");
        System.out.print(sb);
    }
}