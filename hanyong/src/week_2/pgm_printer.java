package week_2;

import java.util.PriorityQueue;
import java.util.Collections;

public class pgm_printer {
    public static void main(String[] args) {
        int[] pri = new int[10];
        for (int i = 0; i < pri.length; i++) {
            pri[i] = (int)(1 + (Math.random()*9));
        }
        for (int i = 0; i < pri.length; i++) {
            System.out.print(pri[i] + "\t");
        }
        System.out.println();
        //solution(pri,0);
        System.out.println(solution(pri,3));
    }
    public static int solution(int[] priorities, int location) {
        int answer = 0;
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < priorities.length; i++) {
            priorityQueue.offer(priorities[i]);
        }
        while (!priorityQueue.isEmpty()) {
            for (int i = 0; i < priorities.length; i++) {
                if (priorityQueue.peek() == priorities[i]) {
                    priorityQueue.poll();
                    answer++;
                    if(i == location){
                        return answer;
                    }
                }
            }
        }
        return answer;
    }
}
    