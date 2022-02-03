package weeks_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

//백준 알고리즘 : 10773번 ,제로
public class Baekjoon_10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        LinkedList<Integer> stk = new LinkedList<>();

        for (int i = 0; i < k; i++) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0)
                stk.pop();
            else
                stk.push(n);
        }
        int sum = 0;
        for (int i : stk) {
            sum += i;
        }
        System.out.println(sum);
    }
}
