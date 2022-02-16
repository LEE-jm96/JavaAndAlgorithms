package algorithm.stack_queue;

import java.util.Scanner;
import java.util.Stack;

public class Bj11899_insertBracket {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
	
	
		Stack<Character> brackets = new Stack<Character>();
		
		for (int i = 0; i < s.length(); i++) {
			if(!brackets.isEmpty() && brackets.peek()=='(') {
				if(s.charAt(i)==')') brackets.pop();
				else brackets.add(s.charAt(i));
			}else brackets.add(s.charAt(i));
		}
		
		System.out.println(brackets.size());
	}

}


