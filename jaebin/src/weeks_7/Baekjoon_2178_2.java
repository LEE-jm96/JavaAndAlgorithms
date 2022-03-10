package weeks_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

//백준 2178번 : 미로탐색, 브루트 포스
public class Baekjoon_2178_2 {
    /**
     * 미로의 각 칸이 탐색 대상 노드이다.
     * 멤버변수는 좌표(행,열), 지금까지 이동한 거리
     * 방문한 칸을 다시 방문하지 않기 위한 visited 배열
     */
    public static class Node {
        int row;
        int col;
        int distance;

        public Node(int row, int col, int distance) {
            this.row = row;
            this.col = col;
            this.distance = distance;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        char arr[][] = new char[N][M];
        boolean visited[][] = new boolean[N][M];
        // 좌표를 저장 할 큐
        Queue<Node> nextQueue = new LinkedList<>();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = br.readLine().toCharArray();
        }
        int result = bfs(arr, visited, nextQueue);
        System.out.println(result);
    }

    public static boolean rangeCheck(int x, int y, int N, int M) {
        return x >= 0 && x < N && y >= 0 && y < M;
    }

    public static int bfs(char arr[][], boolean visited[][], Queue<Node> nextQueue) {
        int N = arr.length;
        int M = arr[0].length;

        nextQueue.add(new Node(0, 0, 1));
        while (!nextQueue.isEmpty()) {
            //노드를 삭제하면서 꺼냄
            Node currentNode = nextQueue.remove();
            int nowX = currentNode.row;
            int nowY = currentNode.col;

            //범위를 벗어났다면
            if ((!rangeCheck(nowX, nowY, N, M))) continue;
            // 목적지에 도착했으면 리턴
            if (nowX == N - 1 && nowY == M - 1) return currentNode.distance;
            // 방문한적이 있거나, 방문할 노드가 0이면
            if (visited[nowX][nowY]
                    || arr[nowX][nowY] == '0') continue;
            //현재 노드 방문 완료
            visited[nowX][nowY] = true;
            // 상하좌우 인접한 노드들을 전부 큐에 넣음
            nextQueue.add(new Node(nowX - 1, nowY, currentNode.distance + 1));
            nextQueue.add(new Node(nowX + 1, nowY, currentNode.distance + 1));
            nextQueue.add(new Node(nowX, nowY - 1, currentNode.distance + 1));
            nextQueue.add(new Node(nowX, nowY + 1, currentNode.distance + 1));
            // 다시 while문을 돌면서 검사 

        }
        // 탐색 실패
        return -1;
    }
}
