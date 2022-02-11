package weeks_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

//백준 알고리즘 : 14713번, 앵무새
public class Baekjoon_14713 {
    public static void main(String[] args) throws IOException {
        /**
         * 전략 :
         * */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 큐
        LinkedList<String> queue;
        // 큐 목록들
        List<LinkedList<String>> queueLists = new LinkedList<>();

        boolean flag = false;

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            String s = br.readLine();
            String[] arr = s.split(" ");
            queue = new LinkedList<>();
            for (int j = 0; j < arr.length; j++) {
                queue.offer(arr[j]);
            }
            queueLists.add(queue);
        }
        String l = br.readLine();
        String[] arr = l.split(" ");
        LinkedList<String> queueResult = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            queueResult.offer(arr[i]);
        }
        int index = 0;
        loop:
        while (true) {
            if (queueResult.isEmpty()) break;
            String s = queueResult.peek();
            for (int i = 0; i < queueLists.size(); i++) {
                if (s.equals(queueLists.get(i).peek())) {
                    queueLists.get(i).poll();
                    queueResult.poll();
                    if (queueLists.get(i).isEmpty()) {
                        queueLists.remove(i);
                    }
                    index++;
                    break;
                }
            }
            if (index > 0) {
                index--;
                continue;
            } else {
                flag = false;
                break;
            }
        }
        if (queueLists.isEmpty() && queueResult.isEmpty()) {
            flag = true;
        } else {
            flag = false;
        }
        if (flag) System.out.println("Possible");
        else System.out.println("Impossible");
    }
}
