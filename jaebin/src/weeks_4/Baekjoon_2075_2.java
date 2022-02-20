package weeks_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

//백준 알고리즘 2075번 : N번째 큰 수, 정렬
public class Baekjoon_2075_2 {
    public static void main(String[] args) throws IOException {
        /**
         * 최대 1500 1500 상자
         * 하지만 숫자의 범위가 -10억 ~ 10억이다.
         * 어떤 자료구조를 사용하여 구해야할까?
         * 모든 수는 자신의 한 칸 위에 있는 수보다 크다는 것이다. -> 중복값이 없다.
         * :방법 2 : 우선순위 큐를 이용한다.
         * LinkedList를 이용하는것보다 3배 빨랐다.
         * */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        //우선순위가 큰수부터 이기 때문에, 내림차순 정렬
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                queue.offer(Integer.valueOf(st.nextToken()));
            }
        }
        int result =0;
        for (int i = 0; i < n; i++) {
            if (i == n-1){
                result = queue.poll();
                break;
            }
            queue.poll();
        }
        System.out.println(result);
    }
}
