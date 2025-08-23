import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;
    static int N,M;
    static Map<String, List<String>> map = new HashMap<>();
    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        for(int i=0;i < N ;i++) {
            String group = br.readLine();
            int K = Integer.parseInt(br.readLine());
            List<String> member = new ArrayList<>();
            for(int j=0 ; j < K ;j++) member.add(br.readLine());
            Collections.sort(member);
            map.put(group, member);
        }
        for(int i=0 ; i < M ; i++) {
            String temp = br.readLine();
            int type = Integer.parseInt(br.readLine());
            if(type == 1) {
                for(String e : map.keySet()) {
                    if(map.get(e).contains(temp))sb.append(e).append("\n");
                }
            }
            else {
                List<String> list = map.get(temp);
                for(int j=0;j < list.size();j++) {
                    sb.append(list.get(j)).append("\n");
                }
            }
        }
        System.out.print(sb.toString());
    }
}