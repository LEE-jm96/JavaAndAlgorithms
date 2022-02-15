import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class baekjoon10989 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());

		int[] arr = new int[num];
		
		StringBuffer result = new StringBuffer();
		
		for(int i=0;i<num;i++) {
			arr[i]=Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(arr);
		
		for(int item : arr) {
			result.append(item+"\n");
		}
		System.out.println(result);
	}
}
