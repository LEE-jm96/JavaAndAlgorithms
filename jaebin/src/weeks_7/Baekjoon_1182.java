package weeks_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//백준 알고리즘 1182번 : 부분수열의 합, 브루트포스, 백트래킹
public class Baekjoon_1182 {
    static int N; // 정수의 개수
    static int S;// 부분 수열의 합
    static int count = 0; // 합과 같은 부분수열의 개수
    static int arr[];// 부분수열을 넣을 배열
    /**
     * 부분 수열을 구하는 방법 : 지금 위치의 원소를 선택하는 방법과 선택하지 않는 방법
     * 지금 위치 원소를 합에 더하는 부분 rec(depth+1 , sum +arr[depth])
     * 지금 위치 원소를 빼고 구하는 부분 rec(depth+1 , sum)을 구현한다.
     * 탈출지점은 배열의 길이를 벗어나면 합이 원하는 값인지 아닌지 확인하고 맞으면 count ++ 해주고 return;
     * */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        arr = new int[N];
        int sum = 0;
        int index = 0;
        while (st.hasMoreTokens()) {
            arr[index] = Integer.parseInt(st.nextToken());
            index++;
        }
        // DFS
        rec(0, sum);
        // 합이 0이면, 공집합도 포함되므로
        if (S == 0) System.out.println(count - 1);
        else
            System.out.println(count);
    }

    public static void rec(int depth, int sum) {
        // 배열은 N-1까지, 깊이가 N과 같으면 리턴, 수열들의 합이 S와 같으면 count ++
        if (depth == N) {
            if (sum == S) {
                count++;
            }
            return;
        }
        //
        rec(depth + 1, sum + arr[depth]);
        rec(depth + 1, sum);

    }
}
