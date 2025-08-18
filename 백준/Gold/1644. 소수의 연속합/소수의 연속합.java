import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    static int N, result =0;
    static boolean[] isPrime;
    static List<Integer> list = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        isPrime = new boolean[N+1];
        Arrays.fill(isPrime,true);
        isPrime[0] = isPrime[1] = false;
        for(int i=2 ; i * i <=N ; i++) {
            if(isPrime[i]) {
                for(int j=i * i ; j <= N ;j+=i) {
                    isPrime[j] = false;
                }
            }
        }
        for(int i=2 ; i <=N ;i++) {
            if(isPrime[i]) list.add(i);
        }
        int st =0, en =0, sum=0;
        while(true) {
            if(sum >= N) {
                if(sum == N) result++;
                sum -=list.get(st++);
            } else{
                if(en == list.size()) break;
                sum+=list.get(en++);
            }
        }
        System.out.print(result);
    }
}