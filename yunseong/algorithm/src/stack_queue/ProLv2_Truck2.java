package stack_queue;

import java.util.LinkedList;
import java.util.Queue;

public class ProLv2_Truck2 {

	public static void main(String[] args) {
		
		int bridge_length = 100;
		int weight = 100;
		int[] truck_weights = {10};
		System.out.println(solution(bridge_length, weight, truck_weights));
	}
    public static int solution(int bridge_length, int weight, int[] truck_weights) {
		int answer = 0;
		int sum = 0;
		
		Queue<Integer> bridge = new LinkedList<Integer>();
	
		for(int i = 0 ; i < truck_weights.length ;) {
			if(bridge.size() < bridge_length) {
				if(weight >= sum + truck_weights[i]) {
					bridge.add(truck_weights[i]);
					sum += truck_weights[i];
					i++;
				}else {
					bridge.add(0); 
				}
				answer++;
			}else sum -= bridge.poll(); 	
			
		}
		
		return answer+bridge_length;
    }
}
