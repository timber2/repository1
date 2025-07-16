import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;
    static int L, C;
    static char[] ch;
    static char[] grap;
    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        L = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        grap = new char[L];
        ch = new char[C];

        st = new StringTokenizer(br.readLine());
        for(int i=0;i < C ;i++) {
            ch[i] = st.nextToken().charAt(0);
        }
        Arrays.sort(ch);
        func(0, 0,false,0);
        System.out.print(sb);

    }
    public static void func(int k, int st, boolean flag, int count) {
        if(k == L) {
            if(flag && count >=2) {
                for (int i = 0; i < L; i++) {
                    sb.append(grap[i]);
                }
                sb.append("\n");
            }
        }
        else {
            for(int i=st;i < C ; i++) {
                grap[k] = ch[i];
                if(ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
                    func(k+1, i+1, true,count);
                }
                else  {
                    func(k+1,i + 1, flag, count + 1);
                }
            }
        }
    }
}