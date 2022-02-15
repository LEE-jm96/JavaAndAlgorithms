package week_2;

import java.util.*;

public class pgm_CrossingTheBridge {//케이스 테스트 위한 main
    public static void main(String[] args) {
        Solution s = new Solution();
        int a = 2, b = 10;
        int[] c = {7, 4, 5, 6};
        System.out.println(s.solution(a,b,c));

    }
}
/*
트럭이 1만큼 움직일때마다 트럭이 올라올 수 있는경우 트럭을 뒤에 추가
트럭이 올라올 수 없는 경우 0을 추가하여 트럭의 이동을 표현.
* 트럭이 올라갈 수 없는 경우?
1. 다리위에 트럭이 가득 찬 경우.
2. 트럭 무게합 초과.
*/
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> queue = new LinkedList<>();
        int answer = bridge_length, W_sum = 0;
        boolean flag;

        for(int i : truck_weights) {//for-each 사용 연습?
            int TWeight = i;
            flag = true;
            while(flag) {
                // 큐에 아무것도 없는 경우
                if(queue.isEmpty()) {
                    queue.offer(TWeight);
                    W_sum += TWeight;
                    answer++;
                    flag = false;
                } else if(bridge_length == queue.size()) { // 큐에 공간이 가득 찬 경우
                    W_sum -= queue.poll();
                } else { //큐에 공간이 남은 경우
                    if(W_sum + TWeight <= weight) {
                        queue.offer(TWeight);
                        W_sum += TWeight;
                        answer++;
                        flag = false;
                    } else {
                        // 무게 최대치 초과시 트럭대신 0을 넣어서 앞에 트럭을 앞으로 밀어 줌
                        queue.offer(0);
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}

