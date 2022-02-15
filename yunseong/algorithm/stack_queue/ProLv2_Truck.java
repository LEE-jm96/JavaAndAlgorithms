package algorithm.stack_queue;

import java.util.LinkedList;
import java.util.Queue;

public class ProLv2_Truck {

	public static void main(String[] args) {
		
	}
	
    public int solution(int bridge_length, int weight, int[] truck_weight) {
		int answer = 0;
		int sum = 0;
		Queue<Integer> q = new LinkedList<Integer>();
		for(int t : truck_weight) {
			while(true) {
				if(q.size()==0) {
					q.add(t);
					sum += t;
					answer++;
					break;	
				}else if(q.size()==bridge_length){
					sum -= q.poll();
				}else {
					if(sum+t <= weight) {
						q.add(t);
						sum+=t;
						answer++;
						break;
					}else {
						q.add(0);
						answer++;
					}
				}
			}
		}
		
		return answer+bridge_length;
	}

}
