package stack_queue;

import java.util.Scanner;
import java.util.Stack;

public class StockPrice {//주식가격

	public static void main(String[] args) {
		int[] prices = {5,3,2,3,5,4,6};
		int[] answer = solution(prices);
		for(int i = 0; i< answer.length ; i++) System.out.print(answer[i]+ " ");
	}
	
	public static int[] solution(int[] prices) {
		int[] answer = new int[prices.length];
		Stack<Integer> stack = new Stack<Integer>();//스택생성
		
		for(int i = 0; i < prices.length; i++) {//배열전체를 반복한다.
			while(!stack.isEmpty() && prices[i] < prices[stack.peek()]) {//스택이 비어있지 않으면서 다음것이 전것보다 클때(주식가 상승) 
				answer[stack.peek()] = i - stack.peek();//answer[2]=1;
				stack.pop();//0,1
			}
			stack.push(i);//0,1,2 들어가고 0,1,3,4 
		}
		while(!stack.isEmpty()) {
			answer[stack.peek()] = prices.length - stack.peek() -1;//5 - 4 - 1  , 0,1,1,3,4
			stack.pop();
		}
		return answer;
	}
	
}
