package weeks_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

//백준 알고리즘 13164번 : 행복 유치원, 정렬
public class Baekjoon_13164 {
    public static void main(String[] args) throws IOException {
        /**
         * 전략 : 이미 정렬이 되어있는 상태, 키 차이의 배열을 넣는다.
         *  그림판에 그림을 그려 보니까 오름차순으로 정렬한 키차이 배열의 원소들을 0부터 n-k 까지 합한 것이 최소값이 되는것을 알았다.
         *  n k  n-k
         *  5 4   1     result = c[0]
         *  5 3   2     result = c[0] + c[1]
         *  5 2   3     reuslt = c[0] + c[1] + c[2]
         * */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        List<Integer> c = new ArrayList<>();
        for (int i = 0; i < arr.length - 1; i++) {
            c.add(arr[i + 1] - arr[i]);
        }
        Collections.sort(c);
        int result = 0;
        //0부터 n-k까지 키차이 배열
        for (int i = 0; i < n - k; i++) {
            result += c.get(i);
        }
        System.out.println(result);
    }
}
