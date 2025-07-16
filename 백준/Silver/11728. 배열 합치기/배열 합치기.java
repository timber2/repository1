import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;
    static int N , M;
    static int[] array1,array2,result;
    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        array1 = new int[N];
        array2 = new int[M];
        result = new int[N+M];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i < N ;i++) {
            array1[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for(int i=0;i < M ;i++) {
            array2[i] = Integer.parseInt(st.nextToken());
        }
        int index1 =0, index2 =0;
        for(int i =0; i < N + M ;i++) {
            if(array1[index1] < array2[index2]) result[i] = array1[index1++];
            else result[i] = array2[index2++];

            if(index1 == N) {
                for(int j=i+1 ; j < M+ N ;j++) {
                    result[j] = array2[index2++];
                }
                break;
            }
            else if(index2 ==M) {
                for(int j=i+1 ; j < M+ N ;j++) {
                    result[j] = array1[index1++];
                }
                break;
            }
        }
        for(int i=0;i < N+M;i++) {
            sb.append(result[i] + " ");
        }
        System.out.print(sb);
    }
}