package sort;

import java.util.*;
public class Baekjoon_11656 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = "";
		str = sc.next();
		
		String[] answer = new String[str.length()];
		
		for(int i = 0; i < answer.length; i++) {
			answer[i] = str.substring(i);
		}
		
		Arrays.sort(answer);
		for(int i = 0; i < answer.length; i++) {
			System.out.println(answer[i]);
		}
	}
}
