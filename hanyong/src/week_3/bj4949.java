package week_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * 마침표가 나올때까지 입력받아서 괄호의 짝이 맞는지 확인하여 출력 -> X
 * 문제이해를 잘 못함.
 * 마침표만 나올때까지 문장을 입력받아 한문장마다 괄호의 짝이 맞는지 확인하여 출력.
 *
 */
public class bj4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            String temp = bf.readLine();
            //if(temp.substring(temp.length()-1).equals(".")) {	// 종료 조건문
            if(temp.equals(".")) {
                break;
            }
            System.out.println(solution(temp));
        }
    }
    public static String solution(String sb) throws IOException {
        //System.out.println(sb);
        Stack<Character> stk_s = new Stack<>();
        for (int i = 0; i < sb.length(); i++) {
            if(sb.charAt(i) == '(' || sb.charAt(i) == '[' ){ //열린괄호는 스택에 저장.
                stk_s.add(sb.charAt(i));
            }
            // 닫힌 괄호가 나올경우 앞에 열린괄호와 짝이 맞는지 확인하여 짝이 맞지 않으면 바로 no 출력.
            //짝이 맞는경우 한쌍 단위로 삭제. 소괄호와 대괄호를 각각 확인.
            else if(sb.charAt(i) == ')'){ //소괄호에 대하여 확인.
                if(stk_s.isEmpty() || stk_s.peek() != '('){
                    return "no";
                }else if(stk_s.peek() == '('){
                    stk_s.pop();
                }
            }else if(sb.charAt(i) == ']'){ //대괄호 확인.
                if(stk_s.isEmpty() || stk_s.peek() != '['){
                    return "no";
                }else if(stk_s.peek() == '['){
                    stk_s.pop();
                }
            }
        }
        if (stk_s.isEmpty()){ //스택에 남아잇는것이 없으면 짝이 맞으니 yes 출력 남은것이 있으면 no출력
            return "yes";
        }else {
            return  "no";
        }

    }
}