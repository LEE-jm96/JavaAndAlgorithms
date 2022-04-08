import java.io.*;
import java.util.*;

public class Baekjoon_11722 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n];
		int[] dp = new int[n + 1];
	
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for (int i = 2; i <= n; i++) {
			int max = 0;
			for (int j = 1; j < i; j++) {
				if (arr[j - 1] > arr[i - 1])
					max = Math.max(max, dp[j]);
			}
			dp[i] = max + 1;
		}
		
		Arrays.sort(dp);
		System.out.println(dp[n]);
	}
}
