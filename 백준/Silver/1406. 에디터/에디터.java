import java.awt.*;
import java.util.*;
import java.io.*;

public class Main {
    static int MX = 600001;
    static char[] dat = new char[MX];
    static int[] pre = new int[MX];
    static int[] nxt = new int[MX];
    static int unused = 1;
    static int cursor = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb =  new StringBuilder();
        StringTokenizer str;
        String A,B;
        String sen = br.readLine();
        int M = Integer.parseInt(br.readLine());
        Arrays.fill(pre,-1);
        Arrays.fill(nxt,-1);
        for(int i=0;i <sen.length();i++) {
            dat[i+1] = sen.charAt(i);
            pre[i+1] = i;
            nxt[i] = i+1;
            unused++;
            cursor++;
        }
        //printArr();
        for(int i= 0 ; i < M ;i++) {
            str = new StringTokenizer(br.readLine());
            A = str.nextToken();
            if(A.equals("L")) {
                if(pre[cursor] != -1) cursor = pre[cursor];
            }
            else if(A.equals("D")) {
                if(nxt[cursor] != -1) cursor = nxt[cursor];
            }
            else if(A.equals("B")) {
                if(pre[cursor] != -1) erase(cursor);
            }
            else {
                B = str.nextToken();
                insert(cursor, B.charAt(0));
            }


        }
        int cur = nxt[0];
        while(cur !=-1) {
            sb.append(dat[cur]);
            cur = nxt[cur];
        }
        System.out.print(sb);
    }
    static void insert(int addr, char c) {
        dat[unused] = c;
        pre[unused] = addr;
        nxt[unused] = nxt[addr];
        if(nxt[addr] != -1) pre[nxt[addr]] = unused;
        nxt[addr] = unused;
        cursor = unused++;
    }
    static void erase(int addr) {
        if(nxt[addr] != -1) pre[nxt[addr]] = pre[addr];
        nxt[pre[addr]] = nxt[addr];
        cursor = pre[addr];
    }
    static void printArr() {
        int cur = nxt[0];
        while(cur != -1) {
            System.out.print(dat[cur] + " ");
            cur = nxt[cur];
        }
        System.out.println(cursor);
    }
}
