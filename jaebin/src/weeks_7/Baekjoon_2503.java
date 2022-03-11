package weeks_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

//백준 알고리즘 2503번: 숫자야구, 브루트 포스
public class Baekjoon_2503 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        List<BaseBall> baseBalls = new ArrayList<>();
        int result = 0;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            int strike = Integer.parseInt(st.nextToken());
            int ball = Integer.parseInt(st.nextToken());

            BaseBall baseBall = new BaseBall(num, strike, ball);
            baseBalls.add(baseBall);
        }
        result = cal(N, baseBalls);
        System.out.println(result);
    }

    public static int cal(int N, List<BaseBall> baseBalls) {
        int result = 0;
        // 입력 받을 수 있는 수는 중복이 없고, 0이 포함되지 않고 123~987 범위 내 이다.
        for (int i = 123; i <= 987; i++) {
            // 검사할 범위 안에있는 정수 i가 중복이나 0이 포함되어있다면 넘어간다.
            if (!checkSameNum(i)) {
                continue;
            }
            // 정수 i가 입력한 num의 스크라이크 개수와 볼 개수가 같은 모든 경우의 수를 찾는다.
            int all = 0;
            for (int j = 0; j < N; j++) {
                // 스트라이크 개수와 볼 개수가 같은 모든 경우의 수를 찾아야한다.
                int strikeCount = 0;
                int ballCount = 0;

                //문자열로 변경하여 비교
                BaseBall baseBall = baseBalls.get(j);
                String currentNum = Integer.toString(baseBall.num);
                String loopNum = Integer.toString(i);

                //스트라이크 개수
                for (int k = 0; k < 3; k++) {
                    if (currentNum.charAt(k) == loopNum.charAt(k)) {
                        strikeCount++;
                    }
                }
                // 볼 개수
                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        if (k == l) {
                            continue;
                        } else {
                            if (currentNum.charAt(k) == loopNum.charAt(l)) {
                                ballCount++;
                            }
                        }
                    }
                }
                // 스트라이크 개수와 볼의 개수가 같은 i경우 개수 1개 증가
                if (baseBall.strike == strikeCount && baseBall.ball == ballCount) {
                    all++;
                }
            }
            // 총 N가지의 조건을 충족 한다면 결과값에 한가지 경우가 추가된다.
            if (all == N) {
                result++;
            }
        }
        return result;
    }
    // 입력받은 숫자의 중복 체크
    public static boolean checkSameNum(int num) {
        // num 123;
        int a = num / 100;
        num %= 100;
        int b = num / 10;
        int c = num % 10;

        if (a == b) {
            return false;
        } else if (b == c) {
            return false;
        } else if (a == c) {
            return false;
        } else if (a == 0 || b == 0 || c == 0) {
            return false;
        }
        return true;
    }

    public static class BaseBall {
        int num;
        int strike;
        int ball;

        public BaseBall(int num, int strike, int ball) {
            this.num = num;
            this.strike = strike;
            this.ball = ball;
        }
    }
}
