package weeks_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

//백준 알고리즘 : 5379번, 키로거
public class Baekjoon_5397 {
    public static void main(String[] args) throws IOException {
        /**
         * 전략 : 스택 두개를 생성하여 커서의 위치를 스택과 스택 사이라고 생각한다.
         * < 이면 왼쪽스택을 pop 해서 오른쪽에 넣는다.
         * > 이면 오른쪽스택을 pop 해서 왼쪽에 넣는다.
         * - 이면 왼쪽 스택을 지운다.
         * 마지막에 스택의 위치를 맨 끝으로 보내기위해 오른쪽 스택을 전부 왼쪽에다가 넣는다.
         * 하지만, 만약 커서의 위치가 줄의 마지막이 아니라면, 커서 및 커서 오른쪽에 있는 모든 문자는 오른쪽으로 한 칸 이동한다.
         * 이 지문이 이해가 되지 않아서 어려움을 느꼈다.
         * */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb;
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            sb = new StringBuilder(br.readLine());
            LinkedList<Character> leftStk = new LinkedList<>();
            LinkedList<Character> rightStk = new LinkedList<>();

            for (int j = 0; j < sb.length(); j++) {
                char a = sb.charAt(j);
                if (leftStk.isEmpty() && a == '<') continue;
                if (rightStk.isEmpty() && a == '>') continue;
                if (leftStk.isEmpty() && a == '-') continue;
                switch (a) {
                    case '<':
                        rightStk.push(leftStk.pop());
                        break;
                    case '>':
                        leftStk.push(rightStk.pop());
                        break;
                    case '-':
                        leftStk.pop();
                        break;
                    default:
                        leftStk.push(a);
                }
            }

            while (!rightStk.isEmpty()) {
                leftStk.push(rightStk.pop());
            }

            sb = new StringBuilder();
            int len = leftStk.size();
            for (int j = 0; j < len; j++) {
                rightStk.push(leftStk.pop());
            }
            for (int j = 0; j < len; j++) {
                sb.append(rightStk.pop());
            }
            System.out.println(sb);
        }
    }
}
