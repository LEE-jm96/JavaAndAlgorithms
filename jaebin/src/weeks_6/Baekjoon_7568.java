package weeks_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//백준 알고리즘 7568번 : 덩치 , 브루트 포스
public class Baekjoon_7568 {
    public static void main(String[] args) throws IOException {
        /**
         *
         * 전략 : 이차원 배열을 통해 t명의 키와 몸무게를 0번째, 1번째에 받는다.
         * 새로운 result 배열을 생성하고, t명의 0번째부터 t-1 번째까지 비교한다
         * 키와 몸무게를 비교하여 두개 모두 커야 덩치가 큰것이므로 등수가 한개 밀려야한다. rank++
         * */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int t = Integer.parseInt(br.readLine());
        int[][] arr = new int[t][2];

        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int index = 0;
            while (st.hasMoreTokens()) {
                arr[i][index] = Integer.parseInt(st.nextToken());
                index++;
            }
        }
        int[] result = new int[t];

        for (int i = 0; i < t; i++) {
            int rank = 1;
            for (int j = 0; j < t; j++) {
                if (i == j) continue;
                if (arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
                    rank++;
                }
            }
            result[i] = rank;
        }
        for (int i = 0; i < t; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
