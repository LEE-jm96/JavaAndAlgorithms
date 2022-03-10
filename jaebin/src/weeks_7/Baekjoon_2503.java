package weeks_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

//백준 알고리즘 2503번: 숫자야구, 브루트 포스
public class Baekjoon_2503 {
    static int count;

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
        for (int i = 123; i <= 987; i++) {
            if (!checkSameNum(i)) {
                continue;
            }
            int all = 0;
            for (int j = 0; j < N; j++) {
                int strikeCount = 0;
                int ballCount = 0;

                //
                BaseBall baseBall = baseBalls.get(j);
                String currentNum = Integer.toString(baseBall.num);
                String loopNum = Integer.toString(i);

                for (int k = 0; k < 3; k++) {
                    if (currentNum.charAt(k) == loopNum.charAt(k)) {
                        strikeCount++;
                    }
                }

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
                if (baseBall.strike == strikeCount && baseBall.ball == ballCount) {
                    all++;
                }
            }
            if (all == N) {
                result++;
            }
        }
        return result;
    }

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
