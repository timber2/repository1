import java.io.*;
import java.util.*;

class Solution {
    static boolean[][] boxes;
    static int cnt;
    static boolean flag;
    public int solution(int n, int w, int num) {
        boxes = new boolean[n/w +1][w];
        cnt =0;
        flag = true;
        Loop1:
        for(int i=0; i < n/w+1 ; i++) {
            if(flag) {
                for(int j=0 ; j < w ; j++) {
                    cnt++;
                    if(cnt > n) break Loop1;
                    boxes[i][j] = true;
                }
            }
            else {
                for(int j= w-1; j >=0 ; j--) {
                    cnt++;
                    if(cnt > n) break Loop1;
                    boxes[i][j] = true;
                }
            }
            flag = !flag;
        }
        int answer = 1;
        int floor = (num-1)/w; // 1
        int sequence;
        if(floor % 2 ==0) sequence = (num-1)%w;
        else sequence = w - ((num-1)%w) -1; // 
        while(true) {
            floor++; 
            if(floor >= boxes.length || !boxes[floor][sequence]) break;
            answer++;
        }
        return answer;
    }
}