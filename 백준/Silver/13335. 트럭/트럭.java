// 트럭

import java.io.*;
import java.util.*;

public class Main {
    static class Truck {
        int time, weight;
        public Truck (int weight) {
            this.time = 1;
            this.weight = weight;
        }
    }
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;
    static int n,w, L, result =0, weightSum =0;
    static List<Truck> list = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken()); // n은 트럭 수
        w = Integer.parseInt(st.nextToken()); // w는 다리 길이
        L = Integer.parseInt(st.nextToken()); // L은 최대 하중
        st = new StringTokenizer(br.readLine());
        Truck nxt = new Truck(Integer.parseInt(st.nextToken()));
        Loop1 :
        while(true) {
            result++;
            for(int i=list.size()-1; i >=0 ;i--) {
                list.get(i).time++;
                if(list.get(i).time > w)  {
                    weightSum -= list.get(i).weight;
                    list.remove(i);
                    n--;
                    if(n == 0) break Loop1;
                }
            }
            if(nxt != null) {
                if(weightSum + nxt.weight <= L) {
                    list.add(nxt);
                    weightSum += nxt.weight;
                    if(st.hasMoreTokens()) {
                        nxt = new Truck(Integer.parseInt(st.nextToken()));
                    }
                    else nxt = null;
                }
            }
        }
        sb.append(result);
        System.out.print(sb.toString());
    }
}