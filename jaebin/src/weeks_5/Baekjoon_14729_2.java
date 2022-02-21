package weeks_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;

//백준 알고리즘 14729번 : 칠무해, 정렬
public class Baekjoon_14729_2 {
    public static void main(String[] args) throws IOException {
        /**
         *
         * 학생의 수 N(8 ≤ N ≤ 10,000,000)이 주어진다.
         * 우선순위 정렬 이용하면 메모리 초과
         * 카운팅 정렬 이용
         * 시간 2배 빨라짐.
         * */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int seven = 7;
        //(8~10,000,000)
        int n = Integer.parseInt(br.readLine());
        // 점수는 xx.xxx 임으로 *1000 해준다
        int[] scores = new int[100001];

        for (int i = 0; i < n; i++) {
            int a = (int) ((Double.parseDouble(br.readLine())) * 1000.0);
            scores[a]++;
        }
        loop:
        for (int i = 0, cnt = 0; i < scores.length; i++) {
            while (scores[i] != 0) {
                scores[i]--;
                cnt++;
                System.out.printf("%.3f" + "\n", i / 1000.0);
                if (cnt == seven) break loop;
            }
        }
    }
}
