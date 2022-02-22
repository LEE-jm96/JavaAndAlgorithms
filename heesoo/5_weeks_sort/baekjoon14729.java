import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class baekjoon14729 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		float[] array = new float[N];  //LinkedList 사용시 메모리초과

		for (int i = 0; i < array.length; i++) {
			array[i] = Float.parseFloat(br.readLine());

		}

		Arrays.sort(array);

		for (int i = 0; i < 7; i++) {
			System.out.printf("%.3f\n", array[i]);
		}

	}
}
