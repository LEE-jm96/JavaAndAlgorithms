import java.util.Scanner;
import java.util.Stack;

public class programmers_stockPrice {
	
	static int top=-1;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] answer = {};
		

		int[] stackArray;  
		stackArray = new int[5];
		
		for(int i=0;i<5;i++) {
			stackArray[i] = scan.nextInt();
		}
		
		int[] result = solution(stackArray);
		
		for(int i=0;i<result.length;i++)
		System.out.print(result[i]+" ");
		
	}
	public static int[] solution(int[] prices) {
		int[] answer = new int [prices.length];
		
		Stack<Integer> stack = new Stack<>();
		
		for(int i=0;i<prices.length;i++) {
			while(!stack.isEmpty() && prices[i]<prices[stack.peek()]) {
				answer[stack.peek()] =i -stack.pop();
			}
			stack.push(i);
		}
		
		while(!stack.isEmpty()) {
			answer[stack.peek()] = prices.length - stack.peek() -1;
			stack.pop();
		}

		return answer;
	}
	
	
}
