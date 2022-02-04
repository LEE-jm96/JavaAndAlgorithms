package weeks_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

//백준 알고리즘 : 1158번, 요세푸스 문제
public class Baekjoon_1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        //7 3
        //1 2 3 4 5 6 7
        LinkedList<Integer> queue = new LinkedList<>();
        LinkedList<Integer> result = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            queue.offer(i + 1);
        }
        int index = 0;
        while (true) {
            if (queue.size() == 0) break;
            index++;
            if (index == k) {
                result.add(queue.poll());
                index = 0;
            } else {
                queue.offer(queue.poll());
            }
        }
        System.out.print("<");

        for (int i = 0; i < result.size(); i++) {
            if (i == result.size() - 1)
                System.out.print(result.get(i));
            else
                System.out.print(result.get(i) + ", ");
        }
        System.out.print(">");
    }
}
