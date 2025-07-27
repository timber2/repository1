import java.io.*;
import java.util.*;

class Student implements Comparable<Student> {
    String name;
    int kor, eng, math;
    public Student (String name, int kor, int eng, int math) {
        this.name = name;
        this.kor= kor;
        this.eng = eng;
        this.math = math;
    }
    @Override
    public int compareTo(Student o) {
        if(this.kor != o.kor) return o.kor - this.kor;
        else if(this.eng != o.eng) return this.eng - o.eng;
        else if(this.math != o.math) return o.math - this.math;
        else return this.name.compareTo(o.name);
    }
}

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;
    static int N;
    static List<Student> list = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        for(int i=0;i < N ;i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int kor = Integer.parseInt(st.nextToken());
            int eng = Integer.parseInt(st.nextToken());
            int math = Integer.parseInt(st.nextToken());
            list.add(new Student(name, kor,eng,math));
        }
        Collections.sort(list);
        for(Student e : list) sb.append(e.name).append("\n");
        System.out.print(sb);
    }
}