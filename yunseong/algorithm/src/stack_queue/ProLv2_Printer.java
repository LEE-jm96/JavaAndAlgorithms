package stack_queue;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
//*/
public class ProLv2_Printer {
		public static void main(String[] args) {
			int[] priorities = {2,1,3,2};
			int answer = new ProLv2_Printer().solution(priorities, 2); 
			System.out.println(answer);
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
		    }//0 2, 1 1, 2 3, 3 2 큐에 객체를 순서대로 담아준다.

		    while(!queue.isEmpty()){// 문제에서 제시한 규칙대로 큐 재배치
		    	Service cur = queue.poll();//첫번째부터 꺼내서
		        boolean flag = false;
		        for(Service t : queue){
		        	if(t.priority>cur.priority)//우선순위 확인하고 
		        		flag = true;//더큰 우선순위가 존재하면 true로 바꿔준다.
		        }
		        if(flag) queue.add(cur);//더큰 우선순위가 존재하기때문에 뺐던걸 다시 집어넣어줌
		        else{//우선순위대로 배치가 된 이후에는 poll 한것을 다시 안넣어주고 큐에서 버림
		            answer++;//원하는 로케가 나올때까지 올려준다. 그게 순서기 때문
		            if(cur.location == location) {//
		                break;
		            }
		        }
		    }
	return answer;
	}
}
//*/
