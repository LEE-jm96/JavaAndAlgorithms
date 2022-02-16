package week_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 *빈 스택에 )가 들어오면 answer++ 후 삭제
 * (가 있는데 )가 들어오면 그냥 삭제
 * 문자열을 모두 스택에 넣은수 남은 ( 를 하나삭제할때마다 answer++
 */

public class bj11899 {
    public static void main(String[] args) throws IOException {
        System.out.println(solution());
    }
    public static int solution() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int answer = 0;
        String str = bf.readLine();
        Stack<Character> stk = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ')'){
                if(stk.isEmpty()){
                    answer++;
                }else{
                    stk.pop();
                }
            }else{
                stk.add(str.charAt(i));
            }
        }
        while (!stk.isEmpty()){ //스택에 남은 ( 처리
            stk.pop();
            answer++;
        }
        return answer;
    }
}
