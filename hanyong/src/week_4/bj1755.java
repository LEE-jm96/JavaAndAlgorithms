package week_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Word implements Comparable<Word>{
    String str;
    int num;
    public Word(String str, int num){
        this.str = str;
        this.num = num;
    }
    public int compareTo(Word o) {// 사전 순 정렬
        return this.str.compareTo(o.str);
    }
}
public class bj1755 {
    static int m, n;
    static List<Word> list;
    static String[] arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        n = sc.nextInt();
        list = new ArrayList<>();
        for (int i = m; i <= n; i++) {
            StringBuilder sb = new StringBuilder();
            if (i > 9) {
                sb.append(arr[i / 10]);
                sb.append(arr[i % 10]);
            } else {
                sb.append(arr[i]);
            }
            list.add(new Word(sb.toString(), i));
        }
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i).num + " ");
            if ((i + 1) % 10 == 0 && i !=0) {//한줄에 10개씩 출력.
                System.out.println();
            }

        }
    }
}