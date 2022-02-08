package week_2;


import java.util.Scanner;
import java.util.Stack;

public class bj10773 {
    //제로
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int n = sc.nextInt();
            if (n == 0){
                stack.pop();
            }else{
                stack.push(n);
            }
        }

        while(!stack.isEmpty()){
            sum += stack.pop();
        }
        System.out.println(sum);

    }
}
