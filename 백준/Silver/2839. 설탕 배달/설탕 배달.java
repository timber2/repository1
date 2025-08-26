import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int N;
    static int result =0;
    public static void main(String[] args) throws IOException {
        N =Integer.parseInt(br.readLine());
        while(N !=0) {
            if(N%5==0) {
                result += N/5;
                break;
            }
            N -=3;
            result++;
            if(N / 3 ==0 && N % 3 !=0) {
                System.out.print("-1");
                return;
            }
        }
        System.out.print(result);
    }
}