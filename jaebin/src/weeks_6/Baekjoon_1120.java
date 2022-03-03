package weeks_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//백준 알고리즘 1120번 : 문자열, 브루트 포스
public class Baekjoon_1120 {
    public static void main(String[] args) throws IOException {
        /**
         * 전략 : 일단 b가 a보다 크므로 총 반복 횟수는 b.length() - a.length() +1 이 된다.
         * 그리고 b를 반복횟수에 맞게 인덱스 i를 하나씩 늘려서 a.length 만큼 자른다.
         * 같은 자리수를 반복 하여 비교하여 최소값을 구하고 ,
         * 최소값 끼리 비교하여 제일 최소값을 찾는다.
         * */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder a = new StringBuilder(st.nextToken());
        StringBuilder b = new StringBuilder(st.nextToken());
        int result = 0;

        for (int i = 0; i < b.length() - a.length() + 1; i++) {
            int min = 0;
            StringBuilder temp = new StringBuilder(b.substring(i, a.length() + i));
            for (int j = 0; j < temp.length(); j++) {
                if (temp.charAt(j) != a.charAt(j)) min++;
            }
            if (i == 0) {
                result = min;
                continue;
            }
            if (min < result) result = min;
        }
        System.out.println(result);
    }
}
