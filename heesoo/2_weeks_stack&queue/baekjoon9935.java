import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class baekjoon9935 {
	public static void main(String[] args) throws IOException {
		//Scanner scan = new Scanner(System.in);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Stack<Character> stack = new Stack<Character>();
		
		String str = br.readLine();
		String bomb = br.readLine();
		
		for(int i=0;i<str.length();i++) {
			
			stack.push(str.charAt(i));
			
			boolean flag = true;
			
			if(stack.size()>=bomb.length()) {
				for(int j=0;j<bomb.length();j++) {
					if(stack.get(stack.size()-bomb.length()+j) !=bomb.charAt(j)) {
						flag = false;
						break;
					}
				}
				if(flag) {
					for(int j=0;j<bomb.length();j++) {
						stack.pop();
					}
				}
			}			
		}	
		StringBuilder sb = new StringBuilder();
		if(stack.size() == 0) {
			sb.append("FRULA");
		}else {
			for(int i=0;i<stack.size();i++) {
				sb.append(stack.get(i));				
			}
		}
		System.out.print(sb);
		
	}
}
