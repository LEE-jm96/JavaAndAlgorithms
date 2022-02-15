package weeks_4;

import java.io.*;
import java.util.Arrays;

//백준 10989번 : 정렬, 수 정렬하기3

/**
 * countingSort (카운팅 정렬)
 */
public class Baekjoon_10989 {
    public static void main(String[] args) throws IOException {
        /**
         * 카운팅 정렬의 기본 메커니즘은 아주 단순하다. 데이터의 값이 몇 번 나왔는지를 세주는 것이다.
         * */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        //(1~10000)
        int[] arr = new int[10001];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            arr[Integer.parseInt(br.readLine())]++;
        }
        for (int i = 1; i < 10001; i++) {
            // 1부터 10000까지 0이상의 개수를 가지고 있는 i 숫자를 출력
            // 중복된 숫자의 개수가 존재 함으로 원소(개수의 값)값을 하나씩 줄이면서 출력
            while (arr[i] > 0) {
                sb.append(i).append('\n');
                arr[i]--;
            }
        }

        bw.write(sb.toString() + '\n');
        bw.flush();
        bw.close();
    }
}
