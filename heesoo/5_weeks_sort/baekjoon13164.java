import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class baekjoon13164 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		int[] n = new int[2];
		for (int i = 0; i < 2; i++) {
			if (st.hasMoreTokens())
				n[i] = Integer.parseInt(st.nextToken());
		}

		int[] arr = new int[n[0]];

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n[0]; i++) {
			if (st.hasMoreTokens()) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
		}

		int[] sub = new int[n[0] - 1]; 
		int i = n[0] - 1;

		while (i > 0) {
			sub[i - 1] = arr[i] - arr[i - 1]; // 학생들 간의 키 차이
			i--;
		}

		Arrays.sort(sub);

		int result = 0;

		for (int j = 0; j < n[0] - n[1]; j++) { 
			result += sub[j];
			System.out.println(result);
		}

		System.out.println(result);
	}

}
