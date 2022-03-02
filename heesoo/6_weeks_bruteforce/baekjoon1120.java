import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class baekjoon1120 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		String[] str = new String[2];
		for (int i = 0; i < 2; i++) {
			str[i] = st.nextToken();
		}
		String strA = str[0];
		String strB = str[1];

		int aLength = strA.length();
		int bLength = strB.length();

		int cnt = 0;
		int[] strcnt = new int[bLength - aLength + 1];

		while (cnt < bLength - aLength + 1) {
			int j = 0;
			for (int i = cnt; i < aLength + cnt; i++) {
				if (strA.charAt(j) == strB.charAt(i)) {
					strcnt[cnt]++;
				}
				j++;
			}
			cnt++;
		}

		Arrays.sort(strcnt);

		System.out.println(aLength - strcnt[strcnt.length - 1]);

	}
}
