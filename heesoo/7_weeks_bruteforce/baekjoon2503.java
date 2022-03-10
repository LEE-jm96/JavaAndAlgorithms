import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class baekjoon2503 {
	static String[] numbers = new String[3];
	static int strikeNum;
	static int ballNum;
	static int count;
	static ArrayList<Integer> list = new ArrayList(987);

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		for (int i = 0; i < N; i++) {

			String[] tmp = br.readLine().split(" ");

			String data = tmp[0];
			strikeNum = Integer.parseInt(tmp[1]);
			ballNum = Integer.parseInt(tmp[2]);

			numbers[0] = data.charAt(0) + "";
			numbers[1] = data.charAt(1) + "";
			numbers[2] = data.charAt(2) + "";

			count++;

			solve(numbers);
		}
		System.out.println(list.size());
	}

	static void solve(String[] compare) {

		ArrayList<Integer> temp = new ArrayList();

		for (int i = 123; i <= 987; i++) {// 가장 작은 수부터 가장 큰 수 까지 반복

			int strike = 0;
			int ball = 0;

			int first = i / 100;
			int second = (i % 100) / 10;
			int third = i % 10;

			if (first == 0 || second == 0 || third == 0 || first == second || second == third || third == first) {
				continue;
			}

			int[] arr = new int[3];
			arr[0] = first;
			arr[1] = second;
			arr[2] = third;

			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 3; k++) {
					if (arr[j] == Integer.parseInt(numbers[k])) {
						if (j == k) {
							strike++;

						} else {
							ball++;
						}
					}
				}
			}
			// 입력받은 strikeNum와 ballNum이 위의 반복문에서 계산된 strike와 ball의 수와 같으면
			// temp에 해당하는 숫자를 추가한다.
			if (strikeNum == strike && ballNum == ball) {
				temp.add(i);
			}

		}
		// 기존 list와 비교
		if (count != 1) {
			list.retainAll(temp); // 교집합
		} else {
			list.addAll(temp);
		}

	}
}
