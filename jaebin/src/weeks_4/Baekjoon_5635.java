package weeks_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//백준 알고리즘 5635번 : 생일, 정렬
public class Baekjoon_5635 {


    public static void main(String[] args) throws IOException {
        /**
         *처음에는 이차원 배열로 나눠서 한행에 이름들, 날짜들, 달들, 년도들
         * 받아서 정렬하고 정렬된 인덱스를 받아서 출력하려고 했으나 클래스를 만드는게 간편할것 같았다.
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        //한 문장
        String s;
        // 한 단어씩 끊은 배열
        String[] str;

        List<Student> students = new ArrayList<>();


        for (int i = 0; i < t; i++) {
            s = br.readLine();
            str = s.split(" ");
            students.add(new Student(str[0], Integer.parseInt(str[1])
                    , Integer.parseInt(str[2]), Integer.parseInt(str[3])));
        }
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.year > o2.year) {
                    return 1;
                } else if (o1.year < o2.year) {
                    return -1;
                } else {
                    if (o1.month > o2.month) {
                        return 1;
                    } else if (o1.month < o2.month) {
                        return -1;
                    } else {
                        if (o1.day > o2.day) {
                            return 1;
                        } else if (o1.day < o2.day) {
                            return -1;
                        } else {
                            return 0;
                        }
                    }
                }
            }
        });
        System.out.println(students.get(students.size() - 1).name);
        System.out.println(students.get(0).name);
    }
}

class Student {
    String name;
    int day;
    int month;
    int year;

    public Student(String name, int day, int month, int year) {
        this.name = name;
        this.day = day;
        this.month = month;
        this.year = year;
    }
}