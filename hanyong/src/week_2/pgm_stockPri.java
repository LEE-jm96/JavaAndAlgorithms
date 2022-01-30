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
            stack.push(i);
        }
        while(!stack.empty()){
            answer[stack.peek()] = prices.length - stack.peek() - 1;
            stack.pop();
        }
        return answer;
    }
}
