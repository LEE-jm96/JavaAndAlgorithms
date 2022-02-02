package stack_queue;

import java.util.LinkedList;
import java.util.Queue;

public class Printer {
		public static void main(String[] args) {
			
		}
		class Service{	
			int location;
			int priority;
			public Service(int location, int priority) {
				this.location = location;
				this.priority = priority;
			}
		}
	public int solution(int[] priorities, int location) {
		
		    int answer = 0;

		    Queue<Service> queue = new LinkedList<>();

		    for(int i=0; i<priorities.length; i++){
		    	queue.add(new Service(i, priorities[i]));
		    }

		    int now=0;
		    while(!queue.isEmpty()){
		    	Service cur = queue.poll();
		        boolean flag = false;
		        for(Service t : queue){
		        	if(t.priority>cur.priority){
		        		flag = true;
		            }
		        }
		        if(flag) { // 우선순위 높은게 있으면 뒤로 보낸다
		            queue.add(cur);
		        }else{
		            now++;
		            if(cur.location == location) {
		            	answer = now;
		                break;
		            }
		        }
		    }
	return answer;
	}
}
