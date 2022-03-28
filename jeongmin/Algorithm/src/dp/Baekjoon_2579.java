package dp;

import java.util.Scanner;
public class Baekjoon_2579 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] dp = new int[num + 1];
		int[] answer = new int[num + 1];
		
		for(int i = 1; i < num + 1; i++) {
			dp[i] = sc.nextInt();
		}
		
		answer[1] = dp[1];
        if(num >= 2) answer[2] = dp[1] + dp[2];
	
		
		for(int i = 3; i < num + 1; i++) {
			answer[i] = Math.max(answer[i - 3] + dp[i - 1], answer[i - 2]) + dp[i];
		}
		
		System.out.println(answer[num]);
	}
}