import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class baekjoon1755 {
	static String[] number = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
	static int[] iNumber = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String[] temp = input.split(" ");

		int m = Integer.parseInt(temp[0]);
		int n = Integer.parseInt(temp[1]);

		System.out.println(change(m, n));

	}

	public static StringBuilder change(int m, int n) {

		String[] arr = new String[n - m + 1];

		int j = 0;
		for (int i = m; i <= n; i++) {

			String str1 = null, str2 = null;
			for (int k = 0; k < number.length; k++) {
				if (i / 10 > 0 && i / 10 == k) {
					str1 = number[k];
				}
				if (i % 10 == k) {
					str2 = number[k];
				}
			}

			if (i / 10 == 0) {
				arr[j] = str2;
			} else if (i / 10 > 0) {
				arr[j] = str1 + " " + str2;
			}
			j++;
		}

		Arrays.sort(arr);
		StringBuilder sb = new StringBuilder();

		int k = 1;
		for (int i = 0; i < arr.length; i++) {
			String[] temp = new String[2];
			
			if (arr[i].contains(" ")) {
				temp = arr[i].split(" ");

				for (int l = 0; l < number.length; l++) {
					if (temp[0].equals(number[l])) {
						sb.append(l);
						for (int p = 0; p < number.length; p++) {
							if (temp[1].equals(number[p])) {
								sb.append(p);
							}
						}
					}
				}
			} else {
				temp[1] = arr[i];
				for (int l = 0; l < number.length; l++) {
					if (temp[1].equals(number[l])) {
						sb.append(l);
					}
				}
			}
			if (k % 10 == 0) {
				sb.append("\n");
			} else {
				sb.append(" ");
			}
			k++;
		}
		return sb;
	}
}
