package week_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj1182 {
    static int[] num;
    static int N;
    static int S;
    static int ans = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());
        num = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }
        dfs(0,0);

        if(S==0){
            ans--;
        }
        System.out.println(ans);

    }
    private static void dfs(int depth, int sum) {
        if (depth == N) {
            if (sum == S) ans++;
            return;
        }
        dfs(depth + 1, sum + num[depth]); // 1. 해당 인덱스 더함
        dfs(depth + 1, sum); // 2. 해당 인덱스 더하지않음
    }
}
