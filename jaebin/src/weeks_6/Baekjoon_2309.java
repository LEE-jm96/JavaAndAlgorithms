package weeks_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//백준 알고리즘 2309번 : 일곱 난쟁이, 브루트 포스
public class Baekjoon_2309 {
    public static void main(String[] args) throws IOException {
        /**
         * 전략 : 9명의 난쟁이의 키를 sum에 모두 더하고
         * 이중 for문을 이용하여 두명의 난쟁이의 키인 b,c를 빼면서 sum 의 합이 100이 되면 전체 루프를 빠져나오고,
         * 두명의 난쟁이의 키는 0으로 초기화한다.
         * 일곱 난쟁이를 찾은 배열을 오름차순으로 정렬하고, 2번째 인덱스 부터 출력하면 답이 나온다.
         * */
        int[] a = new int[9];
        int sum = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(br.readLine());
            sum += a[i];
        }
        int b = 0;
        int c = 0;
        loop:
        for (int i = 0; i < a.length; i++) {
            b = a[i];
            for (int j = i + 1; j < a.length; j++) {
                c = a[j];
                if (sum - (b + c) == 100) {
                    a[i] = 0;
                    a[j] = 0;
                    break loop;
                }
            }
        }
        Arrays.sort(a);
        for (int i = 2; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
