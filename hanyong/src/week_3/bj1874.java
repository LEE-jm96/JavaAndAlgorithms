package week_3;

import java.util.Scanner;
import java.util.Stack;

public class bj1874 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]input = new int[sc.nextInt()]; //입력받을 숫자의 갯수를 입력받아 배열 생성.
        for (int i = 0; i < input.length; i++) {
            input[i] = sc.nextInt();
        }
        System.out.println(sol(input));
    }

    /**
     * 입력받은 숫자가 num값보다 큰 경우
     *  - num값(초기값=0/현재 위치 -1 값 저장) ~ 입력받은 숫자까지 push 하고 push 할때마다 정답에 ("+\n")추가
     * 입력받은 숫자가 num값보다 작은 경우
     * 문제에서 제시한 정렬을 할 수 없음으로 "NO" 출력
     * 입력받은 숫자 == 스택에 push한 숫자(위에 두조건이 ) => 해당 숫자 pop 하고 정답에 ("-\n")추가
     *
     */
    public static String sol(int[] n){
        StringBuilder answer = new StringBuilder();
        Stack<Integer> stk = new Stack<>();
        int num = 0; //현재 위치를 표시.
        for (int i = 0; i < n.length; i++) {
            if (n[i] > num) { //
                for (int j = num + 1; j <= n[i]; j++) {
                    stk.push(j);
                    answer.append("+\n");
                }
                num = n[i];
            } else if (stk.peek() != n[i]) {
                return "NO";
            }
            stk.pop();
            answer.append("-\n");
        }
        return answer.toString();
    }
}
