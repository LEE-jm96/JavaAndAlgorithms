package weeks_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//백준 알고리즘 1476번 : 날짜 계산, 브루트 포스
public class Baekjoon_1476 {
    public static void main(String[] args) throws IOException {
        /**
         *  (1 ≤ E ≤ 15, 1 ≤ S ≤ 28, 1 ≤ M ≤ 19)
         *  전략 : 각각 나머지들을 받기때문에 최종 년도 - 나머지는 각각의 배수
         * */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int E = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int year = 0;

        while (true) {
            year++;
            int a = year - E;
            int b = year - S;
            int c = year - M;

            if (a % 15 == 0 && b % 28 == 0 && c % 19 == 0) {
                break;
            }
        }
        System.out.println(year);
    }
}
