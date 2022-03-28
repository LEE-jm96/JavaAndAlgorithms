package greedy;

import java.util.Scanner;

public class Baekjoon_4796 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = 1;
		int answer = 0;
		
		while(true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			if(a==0 && b==0 && c==0) break;
			
			answer = a > c % b ?  (c % b) + (a * (c / b)) : a + (a * (c / b)) ;
			System.out.println("Case " + cnt + ": " + answer);
			cnt++;
		}
	}
}
