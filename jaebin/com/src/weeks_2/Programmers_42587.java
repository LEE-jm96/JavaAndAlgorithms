package weeks_2;

import java.util.LinkedList;

//프로그래머스 레벨 2 : 프린터, 스택/큐
public class Programmers_42587 {
    public static void main(String[] args) {
        int n[] = {1, 1, 9, 1, 1, 2};
        int l = 0;
        solution(n, l);
    }

    public static int solution(int[] priorities, int location) {
        /*
         * 전략 : 프린터 -> 인쇄 요청이 들어온 순서대로 인쇄.
         * 하지만, 중요도가 높은 문서를 먼저 인쇄해야한다.
         * 그 후 해당 인덱스 보다 중요도가 높은 문서가 존재하면 해당 인덱스까지 다시 큐의 뒤에 넣는다.
         * 자료구조 :  선입선출의 큐를 사용해야합니다. 하지만 중요도가 높은 문서를 먼저 인쇄 해야합니다.
         * */
        int answer = 0;
        // index에 순위가 담겨져 있는 배열
        int index[] = new int[priorities.length];

        // priorities 배열을 돌리기 위한 프린터의 중요도가 들어있는 큐, 중요도의 인덱스가 들어있는큐
        LinkedList<Integer> queue = new LinkedList<>();
        LinkedList<Integer> indexQueue = new LinkedList<>();

        for (int i = 0; i < priorities.length; i++) {
            queue.offer(priorities[i]);
            indexQueue.offer(i);
        }
        int rank = 1;
        while (true) {
            int a = queue.poll();
            int count = indexQueue.poll();

            int b = 0;

            for (int i = 0; i < queue.size(); i++) {
                if (a < queue.get(i)) {
                    queue.offer(a);
                    indexQueue.offer(count);
                    break;
                } else b++;
            }
            if (b == queue.size()) {
                index[count % priorities.length] = rank;
                rank++;
            }
            if (queue.size() == 0) break;
        }
//        for (int i = 0; i < index.length; i++) {
//            System.out.println(index[i]);
//        }
        answer = index[location];
        return answer;
    }
}
