import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class baekjoon2075 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n*n];
		int k=0;
		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			String[] arrStr =str.split(" ");
			for (int j = 0; j < arrStr.length; j++) {
				arr[k]= Integer.parseInt(arrStr[j]);
				k++;
			}
		}
		
		Arrays.sort(arr);
		
		System.out.println(arr[n*n-n]);
	}
}
