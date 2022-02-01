package week_2;

import java.util.Stack;

public class pgm_stockPri {
    public static void main(String[] args) { //케이스 테스트 위한 main
        int[] pri = new int[10];
        int[] ans = new int[pri.length];
        for (int i = 0; i < pri.length; i++) {
            pri[i] = (int)(1 + (Math.random()*10000)) ;
        }
        ans = solution(pri);
        for (int i = 0; i < pri.length; i++) {
            System.out.print(pri[i] + "\t");
        }
        System.out.println();
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + "\t");
        }

    }
    public static int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < prices.length; i++) {
            while(!stack.empty() && prices[i] < prices[stack.peek()]){
                answer[stack.peek()] = i - stack.peek();
                stack.pop();
            }
            /*스택에는 값이 들어온 시점을 저장.
              i번째 가격이 저장된 마지막가격보다 내려간 경우
              저장된 마지막가격이 유지된 시간을 answer에 저장하고 삭제하는 작업을
              저장된 마지막가격이 i번째 가격보다 높을때까지 반복.
            */
            stack.push(i);
        }
        while(!stack.empty()){
            answer[stack.peek()] = prices.length - stack.peek() - 1;
            stack.pop();
        }//끝까지 가격이 하락하지 않은 경우 처리.
        return answer;
    }
}
