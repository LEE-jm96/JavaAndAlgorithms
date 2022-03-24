package dp;

import java.util.Scanner;

public class Baekjoon_1463 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] dp = new int[n + 1];

		dp[0] = 0;
		dp[1] = 0;

		for (int i = 2; i < dp.length; i++) {
			int one = 9999;
			int two = 9999;
			
			if(i == 2) dp[i] = 1;
			else if(i == 3) dp[i] = 1;
 
			int three = dp[i - 1];
			if (i % 3 == 0)
				one = dp[i / 3];
			if (i % 2 == 0)
				two = dp[i / 2];
			dp[i] = 1 + Math.min(Math.min(one, two), three);
		}

		System.out.println(dp[n]);
	}
}