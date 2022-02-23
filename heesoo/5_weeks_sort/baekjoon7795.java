import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class baekjoon7795 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //프로그램 실행중 bufferedReader는 한개만 만들어야함

	public static void main(String[] args) throws NumberFormatException, IOException {

		int num = Integer.parseInt(br.readLine()); // 입력받는 테스트 케이스

		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int cnt = 0;
		while (cnt < num) {
			st = new StringTokenizer(br.readLine());
			int[] n = new int[2];
			int i = 0;
			while (i < 2) {
				if (st.hasMoreTokens()) //뒤의 토큰이 없을 때는 읽어오지 말아야함
					n[i] = Integer.parseInt(st.nextToken());
				i++;
			}

			int result = slove(n[0], n[1]);

			sb.append(Integer.toString(result) + "\n");

			cnt++;
		}
		System.out.println(sb);
	}

	public static int slove(int a, int b) throws NumberFormatException, IOException {
		// string split => 시간초과
		int count = 0;

		int[] A = new int[a];
		int[] B = new int[b];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < a; i++) {
			if (st.hasMoreTokens())
				A[i] = Integer.parseInt(st.nextToken());

		}
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < b; i++) {
			if (st.hasMoreElements())
				B[i] = Integer.parseInt(st.nextToken());

		}
		Arrays.sort(B); //B 배열 정렬로 비교 시간 단축
		for (int i = 0; i < A.length; i++) {
			int j = 0;
			while (j < B.length && A[i] > B[j]) {
				count++;
				j++;
			}
		}

		return count;
	}
}
