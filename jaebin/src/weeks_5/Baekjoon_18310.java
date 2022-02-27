package weeks_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//백준 알고리즘 18310번 : 안테나, 정렬
public class Baekjoon_18310 {
    public static void main(String[] args) throws IOException {
        /**
         * 전략 :  느낌상 중간값을 가지는게 최소값이 될것 이라고 생각했다.
         * */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> list = new ArrayList<>();
        while (st.hasMoreTokens()) {
            list.add(Integer.valueOf(st.nextToken()));
        }
        int a = 0;
        if (n % 2 == 0) {
            a = n / 2;
        } else {
            a = (n / 2) + 1;
        }
        Collections.sort(list);
        int standard = list.get(a - 1);
        System.out.println(standard);
    }
}
