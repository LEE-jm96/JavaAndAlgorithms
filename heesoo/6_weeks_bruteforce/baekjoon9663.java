import java.util.Scanner;

public class baekjoon9663 {

	public static int[] arr;// index : 열, 원소 값 : 행
	public static int N;
	public static int count = 0;

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		N = in.nextInt();
		arr = new int[N];

		nQueen(0);
		System.out.println(count);

	}

	public static void nQueen(int depth) {

		if (depth == N) {// 모든 원소를 다 채운 상태면 count 증가
			count++;
			return;
		}

		for (int i = 0; i < N; i++) {
			arr[depth] = i;
			// 놓을 수 있는 위치일 경우 재귀호출
			if (Possibility(depth)) {
				nQueen(depth + 1);
			}
		}

	}

	public static boolean Possibility(int col) {

		for (int i = 0; i < col; i++) {

			if (arr[col] == arr[i]) {// 같은 행에 존재할 경우
				return false;
			}

			if (Math.abs(col - i) == Math.abs(arr[col] - arr[i])) { // 대각선상에 놓여있는 경우
				return false;
			}
		}

		return true;
	}
}