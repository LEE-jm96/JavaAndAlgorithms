package week_3;

import java.util.*;
public class bj5397 {
    /**
     * 가상의 커서를 기준으로 좌/우에 해당하는 두개의 스택을 생성하고
     * 커서의 이동에따라 좌우 스택의 문자를 이동시켜서 커서의 움직임을 표현
     * -(백스페이스)는 왼쪽 스택을 하나 삭제함으로 표현
     * 왼쪽 스택으로 합처서 출력 -> 문자열이 거꾸로 출력 -> .reverse를 이용하여 반전.
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0; i<num; i++) {
            StringBuilder answer = new StringBuilder();
            String str = sc.next();
            char[] str_c = new char[str.length()];
            for (int j = 0; j < str.length(); j++) {
                str_c[j] = str.charAt(j);
            }
            Stack<Character> stk_R = new Stack<>(); //오른쪽
            Stack<Character> stk_L = new Stack<>(); //왼쪽
            for(int j=0; j<str_c.length; j++) {
                if(str_c[j] == '<' && !stk_L.isEmpty()){
                    stk_R.push(stk_L.pop());
                }else if(str_c[j] == '>' && !stk_R.isEmpty()){
                    stk_L.push(stk_R.pop());
                }else if(str_c[j] == '-' && !stk_L.isEmpty()){
                    stk_L.pop();
                }else if (str_c[j] != '<' && str_c[j] != '>' && str_c[j] != '-') {
                    stk_L.push(str_c[j]);
                }
            }
            while(!stk_R.isEmpty()) {
                stk_L.push(stk_R.pop());
            }
            while(!stk_L.isEmpty()){
                answer.append(stk_L.pop());//여기.reverse()하면 뒤집고 더하고 뒤집고 더하고를 반복하여 이상한 문자열 나옴
            }
            System.out.println(answer.reverse());
        }
    }
}