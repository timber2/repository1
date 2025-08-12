import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    static BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N;
    static int[] arr;
    static ArrayList<Integer> list = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        for(int i=0;i < N ;i++) arr[i] = Integer.parseInt(br.readLine());
        for(int i=0;i < N; i++) {
            for(int j=i ; j < N ;j++) list.add(arr[i] + arr[j]);
        }
        Arrays.sort(arr);
        Collections.sort(list);
        for(int i=N-1 ; i >=0 ; i--) {
            for(int j=0 ; j < N ;j++) {
                int target = arr[i]-arr[j];
                if(Collections.binarySearch(list,target) >= 0) {
                    System.out.print(arr[i]);
                    return;
                }
            }
        }
    }
}