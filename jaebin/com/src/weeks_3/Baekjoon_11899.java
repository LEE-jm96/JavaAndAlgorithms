package weeks_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

//백준 알고리즘 문제 : 11899번, 괄호 끼워넣기
public class Baekjoon_11899 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] arr = br.readLine().toCharArray();
        LinkedList<Character> stk = new LinkedList<>();


        for (int i = 0; i < arr.length; i++) {
            if (stk.isEmpty()) {
                stk.push(arr[i]);
            } else {
                switch (arr[i]) {
                    case ')':
                        if (stk.peek().equals('(') ) {
                            stk.pop();
                        } else {
                            stk.push(arr[i]);
                        }
                        continue;
                    case '(':
                        stk.push(arr[i]);
                }
            }
        }
        System.out.println(stk.size());
    }
}
