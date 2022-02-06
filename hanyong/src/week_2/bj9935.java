package week_2;

import java.util.Stack;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj9935 {
    //문자열 폭발
    public static void main(String[] args) throws IOException {
        Stack<Character> stack = new Stack<>();
        StringBuilder answer = new StringBuilder();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        //System.out.print("문자열을 입력하세요 : ");
        String str = bf.readLine();
        //System.out.print("폭탄을 입력하세요 : ");
        String bomb = bf.readLine();
        int strLen = str.length();
        int bombLen = bomb.length();
        for (int i = 0; i < strLen; i++) {
            stack.add(str.charAt(i));
            if(stack.size() >= bombLen){
                Boolean flag = true;
                //폭발 문자열과 들어온 문자열이 같은지 검사.
                for (int j = 0; j < bombLen; j++) {
                    char str_c = stack.get(stack.size() -bombLen + j);
                    char bomb_c = bomb.charAt(j);
                    if(str_c !=bomb_c){
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    for (int j = 0; j < bombLen; j++) {
                        stack.pop();
                    }
                }
            }
        }
        while (!stack.isEmpty()){
            answer.append(stack.pop());
        }
        if(answer.length() == 0){
            System.out.println("FRULA");
        }else{
            System.out.print(answer.reverse());
        }

    }
}
