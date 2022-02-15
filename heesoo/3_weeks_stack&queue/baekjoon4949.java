import java.util.Scanner;
import java.util.Stack;

public class baekjoon4949 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Stack<Character> stack = new Stack<>();

		while (true) {
			
			String str = scan.nextLine();
			if (str.equals(".")) {
				break;
			}
			
			for (int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i);

				if(stack.isEmpty()) {
					switch(ch) {
					case '(':
						stack.push(ch);
						break;
					case '[':
						stack.push(ch);
						break;
					case ')':
						stack.push(ch);
						break;
					case ']':
						stack.push(ch);
						break;
					}
				}else {
					char st = stack.peek();
					switch(st) {
					case '(':
						if(ch == ')') stack.pop();
						else if (ch =='(' || ch =='[') stack.push(ch);
						else if ( ch == ']') stack.push(ch);
						break;
					case '[':
						if(ch == ']') stack.pop();
						else if (ch =='(' || ch =='[') stack.push(ch);
						else if ( ch == ')') stack.push(ch);
						break;
					case ')':
						stack.push(ch);
						break;
					case ']':
						stack.push(ch);
						break;
					
					}
				}
				
				
			}
			if (stack.isEmpty())
				System.out.println("yes");
			else
				System.out.println("no");
			stack.clear();
		}
	}
}
