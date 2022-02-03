import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class baekjoon1158 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		
		Queue<Integer> queue = new LinkedList<>();
		int[] arr = new int[n];
		
		
		for(int i=1;i<=n;i++) {
			queue.add(i);
		}
		int cnt=1;
		
		int i=0;
		boolean flag = true;
		while(flag) {
			if(queue.isEmpty()||i==n) {
				flag=false;
			}
			else {
			if(k==1) {
				arr[i]=queue.peek();
				queue.poll();
				i++;
			}else{
				queue.add(queue.peek());
				queue.poll();
				if(cnt%(k-1) ==0 ) {
					arr[i]=queue.peek();
					queue.remove();
					i++;
				}
				cnt++;
			}
			}
		}
		String str = "<";
		for(int j=0;j<n;j++) {
			str += Integer.toString(arr[j]);
			if(j<n-1) {
				str += ", ";
			}
		}
		str +=">";
		System.out.println(str);
	}
}
