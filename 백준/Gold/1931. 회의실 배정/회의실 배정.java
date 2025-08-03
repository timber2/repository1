import java.io.*;
import java.util.*;

public class Main {
    static class Meeting implements Comparable<Meeting>{
        int start, end;
        public Meeting(int start, int end) {
            this.start = start;
            this.end = end;
        }
        @Override
        public int compareTo(Meeting other) {
            if(this.end == other. end) return this.start - other.start;
            return this.end - other.end;
        }
    }
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;
    static int N, now =0, count =0;
    static Meeting[] arr;
    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        arr = new Meeting[N];
        for(int i=0;i < N ;i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            arr[i] = new Meeting(start,end);
        }
        Arrays.sort(arr);
        for(int i=0;i < N ;i++) {
            if(arr[i].start >= now)  {
                count++;
                now = arr[i].end;
            }
        }
        System.out.print(count);
    }
}