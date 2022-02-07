package StackQueue2;

import java.util.Scanner;
import java.util.Stack;

public class baekjoon11899 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Stack<Character> stack = new Stack<>();
		
		
		String str = scan.nextLine();
		int count = 0;
	
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch == '(') {
				stack.push(ch);
			}else if(ch == ')') {
				if(!stack.isEmpty()) {
					stack.pop();
					count++;
				}
			}
			
		}
		System.out.println(str.length()-count*2);
	}
}
