package weeks_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//백준 알고리즘 : 1874번, 스택 수열
public class Baekjoon_1874 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        //수열을 만들기 위한 스택
        LinkedList<Integer> stkA = new LinkedList<>();
        // + - 넣는 곳
        List<Character> result = new ArrayList<>();
        // 안되는 경우 유무
        boolean check = true;
        // 몇번까지 뺐는지 기억 할 인덱스
        int index = 0;


        for (int i = 0; i < n; i++) {
            int k = Integer.parseInt(br.readLine());

            if (index < k) {
                for (int j = index + 1; j <= k; j++) {
                    stkA.push(j);
                    result.add('+');
                }
                index = k;
            } else if (k != stkA.peek()) {
                check = false;
                break;
            }
            stkA.pop();
            result.add('-');
        }

        if (check) {
            for (int i = 0; i < result.size(); i++) {
                System.out.println(result.get(i));
            }
        } else System.out.println("NO");
    }
}
