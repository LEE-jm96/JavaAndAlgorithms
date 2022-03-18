package sort;

import java.util.*;

public class Baekjoon_12788 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int mem = sc.nextInt();
		int starr[] = new int[mem];
		
		int a = sc.nextInt();  int b = sc.nextInt();
		int tot = a * b;
		
		for(int i = 0; i < starr.length; i++) {
			starr[i] = sc.nextInt();
		}
		
		Arrays.sort(starr);
		int sum = 0;
		int acnt = 0;
		String an = "";
		
		for(int i = starr.length -1; i >= 0; i--) {
			sum += starr[i];
			if(tot <= sum) {
				acnt = starr.length - i;
				System.out.println(acnt);
				break;
			}
			if(i == 0) {
				if(tot > sum) {
					an = "STRESS";
					System.out.println(an);
					break;
				}
			}
		}
	}
}
