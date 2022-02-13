package algorithm.src.stack_queue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class bj1874_stackSequence {

	public static void main(String[] args) {
		// 스택수열..
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Stack<Integer> stack = new Stack<Integer>();
		List<Character> list = new ArrayList<Character>();
		
	
		int[] origin = new int[n];
		for (int i = 0; i < n; i++) {
			origin[i] = sc.nextInt();
		}
		
		int j = 1;
		for (int i = 0; i < n; i++) {
			if(stack.isEmpty()) {
				stack.push(j++);
				list.add('+');
			}
			while(stack.size() < n && stack.peek()!=origin[i]) {			
				stack.push(j++);//1,2,5,7,8
				list.add('+');
			}
			if(!stack.isEmpty()&&stack.peek()==origin[i]) {
				stack.pop();
				list.add('-');				
			}
		}
		
		Iterator it = list.iterator();
		
		if(stack.isEmpty()) {
			while(it.hasNext()) {
				System.out.println(it.next());
			}
		}else {
			System.out.println("NO");
		}
	}
}
