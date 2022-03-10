package week_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class bj2751 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder answer = new StringBuilder();
        int N = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < N; i++) {
            list.add(sc.nextInt());
        }
        Collections.sort(list);
        for(Integer c : list) {
            answer.append(c+"\n");
        }
        System.out.println(answer);
        sc.close();
    }

}