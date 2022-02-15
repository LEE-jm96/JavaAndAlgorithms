import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class baekjoon5397 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Character> stack = new Stack<>();
		Stack<Character> tempStack = new Stack<>();
		
		int n = Integer.parseInt(br.readLine());
		String[] arrstr = new String[n];
		
		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			
			for(int j=0;j<str.length();j++) {
				char ch = str.charAt(j);
				switch(ch) {
				case '<':
					if(!stack.isEmpty()) {
						tempStack.push(stack.peek());
						stack.pop();
					}
					break;
				case '>':
						if(!tempStack.isEmpty()) {
							stack.push(tempStack.peek());
							tempStack.pop();
						}
					
					break;
				case '-':
					if(!stack.isEmpty()) {
						stack.pop();
					}
					break;
				default:
					stack.push(ch);
					break;
				}
			}
			while(!tempStack.isEmpty()) {
				stack.push(tempStack.pop());
			}
			
			StringBuffer sb = new StringBuffer();

			 for(int k=0; k<stack.size(); k++) {
	                sb.append(stack.elementAt(k));
	            }
			
			System.out.println(sb);
			sb.setLength(0);
			stack.clear();
		}
	}
}
