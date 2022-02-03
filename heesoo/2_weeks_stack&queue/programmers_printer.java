import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class programmers_printer {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int cnt =5;
		int[] priorities = new int[cnt];
		
		for(int i=0; i<cnt;i++) {
			priorities[i]=scan.nextInt();
		}
		
		System.out.println("location : ");
		int location = scan.nextInt();
		
		System.out.println(solution(priorities, location));
	}
	public static class Printer{
		private int priority;
		private int location;

		public Printer(int priority, int location){
			this.priority = priority;
			this.location = location;
		}
	}
	 public static int solution(int[] priorities, int location) {
	      int answer = 0;
	      
	      Queue<Printer> queue = new LinkedList<>();
	      
	      for(int i=0; i<priorities.length;i++) {
	    	  queue.add(new Printer(priorities[i],i));
	      }
	      System.out.println(queue.peek());
	      
	      
	      while(!queue.isEmpty()) {
	    	  	Printer printer = queue.poll();
	    	  	
	    	  	boolean flag = false;
	    	  	
	    	  	for(Printer sub : queue) {
	    	  		if(printer.priority < sub.priority) {
	    	  			flag = true;
	    	  			break;
	    	  		}
	    	  		
	    	  	}
	    	  if(flag) {
	    		  queue.add(printer);
	    	  }else {
	    		  answer ++;
	    		  if(printer.location == location)
	    			  break;
	    	  }
	      }
	      return answer;
	    }
}
