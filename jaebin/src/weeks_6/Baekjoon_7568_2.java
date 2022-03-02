package weeks_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

//백준 알고리즘 7568번 : 덩치 , 브루트 포스


public class Baekjoon_7568_2 {
    public static void main(String[] args) throws IOException {
        /**
         * 전략 : student 클래스를 통해 t명의 키와 몸무게 그리고 랭크를 받는다.
         *  t명끼리 키와 비교하고, 몸무게를 비교할때, 둘다 큰사람이 덩치가 더 크기 때문에 랭크가 +1 밀린다.
         * */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int t = Integer.parseInt(br.readLine());
        List<Student> students = new ArrayList<>(t);

        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int w = Integer.parseInt(st.nextToken());
            int h = Integer.parseInt(st.nextToken());
            Student student = new Student(w, h, 1);
            students.add(i, student);
        }
        for (int i = 0; i < t; i++) {
            int rank = 1;
            for (int j = 0; j < t; j++) {
                if (i == j) continue;
                if (students.get(i).getH() < students.get(j).getH() &&
                        students.get(i).getW() < students.get(j).getW()) {
                    rank++;
                }
            }
            students.get(i).setRank(rank);
        }
        for (int i = 0; i < t; i++) {
            System.out.print(students.get(i).getRank() + " ");
        }
    }
}

class Student {
    int w;
    int h;
    int rank;

    public Student(int w, int h, int rank) {
        this.w = w;
        this.h = h;
        this.rank = rank;
    }

    public int getW() {
        return w;
    }

    public int getH() {
        return h;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
}