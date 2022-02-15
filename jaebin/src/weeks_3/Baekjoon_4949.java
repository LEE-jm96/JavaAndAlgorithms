package weeks_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

//백준 알고리즘 : 4949번, 균형잡힌 세상
public class Baekjoon_4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        /**
         * 전략 : 중괄호와 대괄호를 스택에 넣기전에 전 인덱스와 짝이 맞으면 pop 시킨다.
         * 스택에 아무것도 존재하지 않는데 ')' ,']' 빠져나온다.
         * . 만 존재하면 종료한다.
         * 1회전 하면 스택을 비운다.
         * */
        LinkedList<Character> stk = new LinkedList<>();
        while (true) {
            String s = br.readLine();
            if (s.equals(".")) break;
            char[] arr = s.toCharArray();
            boolean flag = true;
            loop:
            for (int i = 0; i < arr.length; i++) {
                switch (arr[i]) {
                    case '(':
                    case '[':
                        stk.push(arr[i]);
                        break;
                    case ')':
                        if (stk.size() == 0) {
                            flag = false;
                            break loop;
                        }
                        if (stk.peek().equals('(')) {
                            stk.pop();
                        } else {
                            stk.push(arr[i]);
                        }
                        break;
                    case ']':
                        if (stk.size() == 0) {
                            flag = false;
                            break loop;
                        }
                        if (stk.peek().equals('[')) {
                            stk.pop();
                        } else {
                            stk.push(arr[i]);
                        }
                        break;
                    //. 나오면 다음 회전으로 가야 한다.
                    case '.':
                        break loop;
                    //알파벳이면 넘긴다.
                    default:
                        break;
                }
            }
            if (stk.size() != 0) {
                flag = false;
            }
            if (flag) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
            stk.clear();
        }
    }
}
