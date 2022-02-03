import java.util.Scanner;
import java.util.Stack;

public class baekjoon10773 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Stack<Integer> stack = new Stack<>();
		int num=0;
		
		int k = scan.nextInt();//숫자 개수
		for(int i=0;i<k;i++) {
			num = scan.nextInt();
			if(num==0) {
				stack.pop();
			}else {
				stack.push(num);
			}
		}
		
		int sum=0;
		
		while(!stack.isEmpty()) {
			sum += stack.pop();
		}
		System.out.println(sum);
		
	}
}
