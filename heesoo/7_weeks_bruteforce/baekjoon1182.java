import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon1182 {
	static int N, S, count = 0;
	static int[] arr;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		S = Integer.parseInt(st.nextToken());

		arr = new int[N];

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		dfs(0, 0);

		if (S == 0) {// 공집합 포함으로 빼준다
			count--;

		}
		System.out.println(count);

	}

	static void dfs(int v, int su) {
		if (v == N) {
			if (su == S) {
				count++;
			}
			return;
		}

		// 부분수열, 지금 위치의 원소 선택하거나 선택하지 않거나
		dfs(v + 1, su + arr[v]);
		dfs(v + 1, su);
	}
}
