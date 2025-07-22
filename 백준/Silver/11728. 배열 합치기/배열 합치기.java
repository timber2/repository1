import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;
    static int N,M;
    static int[] array1 ,array2, result;
    static int index1= 0,index2=0, index3=0;
    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        array1 = new int[N];
        array2 = new int[M];
        result = new int[N + M];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i < N;i++) {
            array1[i] =Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for(int i=0; i < M;i++) {
            array2[i] =Integer.parseInt(st.nextToken());
        }
        while(index1 != N && index2 != M) {
            if(array1[index1] < array2[index2]) {
                result[index3++] = array1[index1++];
            }
            else {
                result[index3++] = array2[index2++];
            }
        }

        while(index1 != N ) {
            result[index3++] = array1[index1++];
        }
        while(index2 != M) {
            result[index3++] = array2[index2++];
        }
        for(int e : result) {
            sb.append(e).append(" ");
        }
        System.out.print(sb);
    }
}