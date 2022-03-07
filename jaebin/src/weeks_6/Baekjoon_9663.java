package weeks_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//백준 알고리즘 9663번 : N-Queen , 브루트 포스
public class Baekjoon_9663 {
    public static int[] arr;
    public static int N;
    public static int count;

    public static void main(String[] args) throws IOException {
        /**
         * 전략: N-Queen.md
         * */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        count = 0;

        rec(0);
        System.out.println(count);
    }

    // 재귀함수, depth는 깊이, 열
    public static void rec(int depth) {
        // 깊이, 즉 열이 N이 되었다는것은 탐색이 완료 되었다는것을 의미한다. 개수를 1 증가 시키고 , 탈출한다.
        if (depth == N) {
            count++;
            return;
        }

        for (int i = 0; i < N; i++) {
            //depth는 열, arr[depth]는 행
            arr[depth] = i;
            boolean check = true;

            for (int j = 0; j < depth; j++) {
                // 해당 열의 행과 j열의 행이 일치 할 경우 (같은 행에 존재 할 경우)
                if (arr[j] == arr[depth]) {
                    check = false;
                }
                // 대각선상에 놓여 있는 경우
                // (열의 차와 행의 차가 같을 경우가 대각선에 놓여있는 경우)
                else if (Math.abs(depth - j) == Math.abs(arr[depth] - arr[j])) {
                    check = false;
                }
            }

            //놓을 수 있는 상황이면 다음 열로 넘기기
            if (check) {
                rec(depth + 1);
            }
        }
    }
}
