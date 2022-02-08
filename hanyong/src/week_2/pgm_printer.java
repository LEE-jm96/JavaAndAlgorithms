package week_2;

import java.util.PriorityQueue;
import java.util.Collections; //우선순위 큐의 큰수부터 정렬시에 필요.

public class pgm_printer {
    public static void main(String[] args) {//케이스 테스트 위한 main
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
            priorityQueue.offer(priorities[i]);//순서대로 큐에 저장
        }
        /* // 원하는 위치의 우선순위만 계산하려 했으나 같은 우선순위 순서 계산에 문제
        for (int i = 0; i < priorities.length; i++) {
            if (priorityQueue.peek() != priorities[location]) {
                priorityQueue.poll();
                answer++;
            }
        }
        */
        while (!priorityQueue.isEmpty()) {
            for (int i = 0; i < priorities.length; i++) {
                if (priorityQueue.peek() == priorities[i]) { //값이 일치할 경우 처리하고 다음 순위로
                    priorityQueue.poll();
                    answer++;
                    if(i == location){ //처리할 때 내가 원하는 위치인지 확인하고 맞을 경우 answer리턴
                        return answer;
                    }
                }
            }
        }

        return answer;
    }
}
    