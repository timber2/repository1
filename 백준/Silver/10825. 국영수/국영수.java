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
        Collections.sort(list, new Comparator<String>() {
           @Override
           public int compare(String a, String b) {
               if(map.get(a)[0] == map.get(b)[0]) {
                   if(map.get(a)[1] == map.get(b)[1]) {
                       if(map.get(a)[2] == map.get(b)[2]) {
                           for(int i=0; i < Math.min(a.length(),  b.length()) ;i++) {
                               if((int) a.charAt(i) > (int) b.charAt(i)) return 1;
                               else if((int) a.charAt(i) < (int) b.charAt(i)) return -1;
                           }
                       }
                       return map.get(b)[2] - map.get(a)[2];
                   }
                   return map.get(a)[1] - map.get(b)[1];
               }
               return map.get(b)[0] - map.get(a)[0];
           }
        });
        for(String e : list ) sb.append(e).append("\n");
        System.out.print(sb);
    }
}