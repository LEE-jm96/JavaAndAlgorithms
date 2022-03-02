import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

public class baekjoon2309 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] arr = new int[9];
		int[] result = new int[2];
		int sum = 0;
		int j = 0;

		for (int i = 0; i < 9; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i];
		}

		for (int i = 0; i < arr.length - 1; i++) {
			//int sum2 = sum; // 합계 초기화 필요
			for (int k = i + 1; k < arr.length; k++) {
				if (sum-arr[i]-arr[k] == 100) {
					result[0] = arr[i];
					result[1] = arr[k];
					break;
				}
			}
		}
		
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			if (!(arr[i] == result[0] || arr[i] == result[1]))
				System.out.println(arr[i]);
			
		}
	}
}
