

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class programmers_bridgeTrucks {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("다리에 올라가는 최대 트럭 개수 : ");
		int bridge_length = scan.nextInt();
		System.out.println("다리가 견딜 수 있는 무게 : ");
		int weight = scan.nextInt();
		
		System.out.println("다리를 올라갈 트럭의 개수: ");
		int truck_num = scan.nextInt();
		
		int[] truck_weights = new int[truck_num]; 
		System.out.println("다리에 올라갈 트럭 각각의 무게 : ");
		for(int i=0;i<truck_num;i++) {
		truck_weights[i] = scan.nextInt();
		}
		int result = solution(bridge_length, weight, truck_weights);
		System.out.println(result);
		
	}
	
	public static int solution(int bridge_length, int weight, int[] truck_weights) {
		
		Queue<Integer> queue = new LinkedList<>();
		int[] result = new int[truck_weights.length];
		
		int sum=0;
		int time =0;
		
		for(int i=0;i<truck_weights.length;i++) {
			int truckWeight = truck_weights[i];
			
			while(true) {
				if(queue.isEmpty()) {
					queue.add(truckWeight);
					sum+=truckWeight;
					time++;

					break;
					
				}else if(queue.size()<bridge_length) {
					if(sum+truckWeight <= weight) {
						queue.add(truckWeight);
						sum+=truckWeight;
						time++;

						break;
					}else {
						queue.add(0);  //트럭이 다리를 지날 수 있도록
						time++;
						
					}
				}else {
					sum-=queue.poll();

				}
			}
			
		}
		
		return time+bridge_length;
	}
}
