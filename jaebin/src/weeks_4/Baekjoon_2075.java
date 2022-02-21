package weeks_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.StringTokenizer;

//백준 알고리즘 2075번 : N번째 큰 수, 정렬
public class Baekjoon_2075 {
    public static void main(String[] args) throws IOException {
        /**
         * 최대 1500 1500 상자
         * 하지만 숫자의 범위가 -10억 ~ 10억이다.
         * 어떤 자료구조를 사용하여 구해야할까?
         * : 방법 1 : 스택을 사용후 Collections 내림차순 정렬(큰수 -> 작은수)후 n번째 수 출력.
         * */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        LinkedList<Integer> stk = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                stk.push(Integer.valueOf(st.nextToken()));
            }
        }
        Collections.sort(stk,Collections.reverseOrder());
        int result = 0;
        for (int i = 0; i < n; i++) {
            if (i == n-1) {
                result = stk.pop();
                break;
            }
            stk.pop();
        }
        System.out.println(result);
    }
}
