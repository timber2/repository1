import java.io.*;
import java.util.*;
public class Main {
    static BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    static int T,N;
    public static void main(String[] args) throws IOException {
        T = Integer.parseInt(br.readLine());
        while(T-- >0) {
            HashMap<String , Integer> map = new HashMap<>();
            N = Integer.parseInt(br.readLine());
            for(int i=0;i < N ;i++) {
                st = new StringTokenizer(br.readLine());
                st.nextToken();
                String key = st.nextToken();
                map.put(key, map.getOrDefault(key, 0) + 1);
            }
            List<String> list = new ArrayList<>(map.keySet());
            int result = 1;
            for(int i=0;i < list.size();i++) {
                result *= map.get(list.get(i)) + 1;
            }
            sb.append(result-1).append("\n");
        }
        System.out.print(sb.toString());
    }
}