package stack_queue;

import java.util.Scanner;
import java.util.Stack;

public class Bj10773_zero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> budget = new Stack<>();
		int n = sc.nextInt();
		int sum = 0;
		for (int i = 0; i < n; i++) {
			int money = sc.nextInt();
			
			if(money!= 0) budget.push(money);
			else budget.pop();
			
		}
		
		for(int money : budget) {
			sum += money;
		}
		
		System.out.println(sum);
		
	}

}
