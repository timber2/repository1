import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;
    static int N, C;
    static HashMap<Integer,Integer> map = new LinkedHashMap<>();
    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for(int i=0;i < N ;i++) {
            int num = Integer.parseInt(st.nextToken());
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        List<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list , new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return map.get(b)- map.get(a);
            }
        });
        for(int e : list) {
            for(int i=0;i < map.get(e) ; i ++) {
                sb.append(e).append(" ");
            }
        }
        System.out.print(sb);
    }
}