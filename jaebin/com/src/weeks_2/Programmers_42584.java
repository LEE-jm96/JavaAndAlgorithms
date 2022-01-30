package weeks_2;

import java.util.LinkedList;

//프로그래머스 레벨2 : 주식가격, 스택/큐
public class Programmers_42584 {
    public static void main(String[] args) {
        int[] p = {1, 2, 3, 2, 3};
        solution(p);
    }

    public static int[] solution(int[] prices) {
        int[] answer = {};
        /* 전략:
         * 배열에 있는 첫번째 부터 마지막 인덱스까지 떨어진지 아닌지를 검사해야합니다.
         * 완전탐색 : 브루트 포스, prices 크기와 prices 길이에 대한 시간초과 고민을 해야합니다.
         * 자료구조 : 후입 선출의 스택을 이용하여 풉니다.
         * */
        // 스택을 사용할 수 있지만, 연결리스트를 스택처럼 사용하여도 됩니다.
//        Stack<Integer> stk = new Stack<>();
        // price배열 원소를 하나씩 넣는다.-> 큐와 탐색 시작 -> stk 탐색한 원소를 빼고, count를 넣어서 결과값을 넣을 stk
        LinkedList<Integer> stk = new LinkedList<>();
        int count;
        //1    2 3 2 3 // 1 2     3 2 3 //
        for (int i = 0; i < prices.length; i++) {
            count = 0;
            stk.push(prices[i]);
            int a = stk.peek();

            for (int j = stk.size() - 1; j < prices.length; j++) {
                if (j == prices.length - 1) break;
                count++;
                if (a > prices[j]) {
                    count--;
                    break;
                }
            }
            stk.pop();
            stk.push(count);
        }

        answer = new int[stk.size()];
        for (int i = answer.length - 1; i >= 0; i--) {
            answer[i] = stk.pop();
        }
        return answer;
    }
}
