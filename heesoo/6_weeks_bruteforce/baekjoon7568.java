import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon7568 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());// 전체 사람수

		int[][] arr = new int[n][2];

		for (int i = 0; i < arr.length; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}

		int[] result = new int[n];
		int k = 0;

		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (i != j && arr[i][0] < arr[j][0]) {
					if (arr[i][1] < arr[j][1]) {
						count++;
					}
				}
				result[k] = count;
			}

			k++;
		}

		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + 1 + " ");
		}

	}
}