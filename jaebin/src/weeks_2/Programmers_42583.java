package weeks_2;

import java.util.LinkedList;

//프로그래머스 레벨 2 : 다리를 지나는 트럭, 스택/큐
public class Programmers_42583 {
    public static void main(String[] args) {
        int a = 100;
        int b = 100;
        int c[] = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        solution(a, b, c);

    }

    public static int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        /**
         * 전략: 다리를 지난 트럭, 다리를 지나고 있는 트럭 2개의 자료구조를 만든다. 대기트럭은 truck_weigths
         *  다리를 지나고 있는 트럭에 0,0을 넣고 초당 한대씩 넣고 한대씩 뺸다.
         *  한대씩 넣는 순간에 현재 다리위에 있는 무게 + 새로 들어오는 트럭의 무게가 > weight 라면, 0을 넣어준다.
         *
         * 결론: 부연설명이 헷갈리는 문제, 1초(경과시간)에 bridge_length 만큼 움직인다는 부연설명이 없었다.
         * */

        //다리길이, 다리 버티는 무게, 트럭의 무게들
        //2 , 10 ,{7,4,5,6}
        LinkedList<Integer> ingQueue = new LinkedList<>();
        LinkedList<Integer> endQueue = new LinkedList<>();
        for (int i = 0; i < bridge_length; i++) {
            ingQueue.offer(0);
        }
        //truck_weights 의 인덱스
        int index = 0;
        int sum = 0;

        while (true) {

            //마지막 truck_weights[index]가 들어가고 다음 회차입니다.
            if (endQueue.size() == truck_weights.length) {
                break;
            }
            // 1초 증가
            answer++;
            int n = ingQueue.poll();
            if (n != 0) {
                endQueue.offer(n);
                sum -= n;
            }

            if (index == truck_weights.length) {
                continue;
            } else {
                if (sum + truck_weights[index] <= weight) {
                    ingQueue.offer(truck_weights[index]);
                    sum += truck_weights[index];
                    index++;
                } else ingQueue.offer(0);
            }
        }

        System.out.println(answer);
        return answer;
    }
}
