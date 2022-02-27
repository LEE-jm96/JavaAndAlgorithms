package weeks_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//백준 알고리즘 14729번 : 칠무해, 정렬
public class Baekjoon_14729 {
    public static void main(String[] args) throws IOException {
        /**
         *
         * 학생의 수 N(8 ≤ N ≤ 10,000,000)이 주어진다.
         * 처음에 리스트를 사용했더니 메모리 초과. 고정적인 길이의 배열을 이용하자
         * 시간이 생각보다 많이 걸렸다. 카운팅 정렬을 사용해야하나? 자료구조를 바꿔봐야하나?
         * */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int seven = 7;
        int n = Integer.parseInt(br.readLine());
        double[] scores = new double[n];

        for (int i = 0; i < n; i++) {
            scores[i] = Double.parseDouble(br.readLine());
        }

        Arrays.sort(scores);
        for (int i = 0; i < seven; i++) {
            System.out.printf("%.3f" + "\n", scores[i]);
        }
    }
}
