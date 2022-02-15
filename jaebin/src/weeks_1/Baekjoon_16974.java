package weeks_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//백준 알고리즘 : 16974번, 레벨 햄버거
public class Baekjoon_16974 {
    // 총 개수
    public static long total[], patty[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        long X = Long.parseLong(st.nextToken());
        long result = 0;
        //레벨 0  patty  -> len 3  //1 ->1
        //레벨 1  BPPPB  -> 레벨0 이 BPB에 양쪽에 낌   //5 ->3
        //레벨 2  BBPPPBPBPPPBB  -> 레벨1 가운데 인덱스가 양쪽에 낌   // 13 -> 7
        //레벨 3  BBBPPPBPBPPPBBPBBPPPBPBPPPBBB  -> 레벨1 가운데 인덱스가 양쪽에 낌 //29 ->15
        //B가 0 P가 1
        total = new long[N + 1];
        patty = new long[N + 1];
        total[0] = patty[0] = 1;

        for (int i = 1; i < N + 1; i++) {
            total[i] = 2 * total[i - 1] + 3;
            patty[i] = 2 * patty[i - 1] + 1;
        }

        result = rec(N, X);
        System.out.println(result);
    }

    // 패티수 찾기
    public static long rec(int N, long X) { // 레벨, 먹은거
        if (N == 0) {
            if (X == 0) return 0;
            else if (X == 1) return 1;
        }
        if(X == 1) {
            // 가장 첫번째 재료는 무조건 번이다.
            return 0;
        } else if(X <= 1 + total[N - 1]) {
            // x가 중간 패티 위치 보다 작으면 첫번째 번을 빼고 이전 레밸의 햄버거를 다시 확인 
            return rec(N - 1, X - 1);
        } else if(X == 1 + total[N - 1] + 1) {
            // x가 중간 패티 위치면 이전 레벨의 패티 수 + 1
            return patty[N - 1] + 1;
        } else if(X <= 1 + total[N - 1] + 1 + total[N - 1]) {
            // x가 중간 패티 위치 보다 크면 중간 패티까지의 패티 수 + 이전 레벨의 햄버거 다시 확인
            return patty[N - 1] + 1 + rec(N - 1, X - (1 + total[N - 1] + 1));
        } else {
            // 두 번째 이전 레벨의 햄버거 보다 크면
            return patty[N - 1] + 1 + patty[N - 1];
        }
    }
}
