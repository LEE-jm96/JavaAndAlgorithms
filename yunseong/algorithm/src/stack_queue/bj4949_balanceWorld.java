package algorithm.src.stack_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class bj4949_balanceWorld {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Queue<Character> queue = new LinkedList<Character>();
		Stack<Character> stack = new Stack<Character>();
		
		while (true) {
			String str = scan.nextLine();
			if (str.equals(".")) break;
			for (int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i);
				if(ch=='('|| ch == ')'|| ch=='[' || ch==']') {
					queue.add(ch);
				}
			}
			//(((())
		
			while(!queue.isEmpty()) {//((
				char ch = queue.poll();
				
				//([   ])
				if(stack.isEmpty()) {
					if(ch ==')'||ch==']') {
						stack.push(ch);
						break;
					}else {
						stack.push(ch);
					}
				}else {
					if(stack.peek()=='(') {
						if(ch ==')') {
							stack.pop();
						}else if(ch == '(' || ch =='[') {
							stack.push(ch);
						}else {
							break;
						}
					}else if(stack.peek()=='[') {
						if(ch ==']') {
							stack.pop();
						}else if(ch == '(' || ch =='[') {
							stack.push(ch);
						}else {
							break;
						}
					}
				}
			}
			if(stack.isEmpty())	System.out.println("yes");
			else System.out.println("no");
			stack.clear();
			queue.clear();
			
		}
	}
}

