package stack_queue;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Bj9935_StringExplosion {
		public static void main(String[] args) throws Exception {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			String s = br.readLine();
			String remove = br.readLine();
			Stack<Character> stack = new Stack<Character>();

			for (int i = 0; i < s.length(); i++) {
				stack.push(s.charAt(i));

				if (stack.size() >= remove.length()) {
					boolean flag = true;
					for (int j = 0; j < remove.length(); j++) {
						if (stack.get(stack.size() - remove.length() + j) != remove.charAt(j)) {
							flag = false;
							break;                                            
						}
					}
					if (flag) {
						for (int j = 0; j < remove.length(); j++) {
							stack.pop();
						}
					}
				}
			}
			StringBuilder sb = new StringBuilder();
			for(char ch : stack) {
				sb.append(ch);
			}
			
			System.out.println(sb.length() > 0 ? sb.toString() : "FRULA");
		}
}
