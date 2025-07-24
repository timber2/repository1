import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;
    static int N;
    static String[][] array;
    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        array = new String[N][2];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            array[i][0] = st.nextToken();
            array[i][1] = st.nextToken();
        }
        Arrays.sort(array, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
            }
        });
        for(int i=0;i < N ;i++) {
            sb.append(array[i][0] + " " + array[i][1]).append("\n");
        }
        System.out.print(sb);
    }
}