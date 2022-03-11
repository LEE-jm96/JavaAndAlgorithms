package weeks_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

//백준 2178번 : 미로탐색, 브루트 포스
public class Baekjoon_2178 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int arr[][] = new int[N][M];
        boolean visited[][] = new boolean[N][M];
        // 좌표를 저장 할 큐
        Queue<int[]> nextQueue = new LinkedList<>();

        for (int i = 0; i < arr.length; i++) {
            String s = br.readLine();
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = Character.getNumericValue(s.charAt(j));
            }
        }
        bfs(arr, visited, nextQueue);
        System.out.println(arr[N - 1][M - 1]);
    }

    public static boolean rangeCheck(int x, int y, int N, int M) {
        return x >= 0 && x < N && y >= 0 && y < M;
    }

    public static int[][] bfs(int arr[][], boolean visited[][], Queue<int[]> nextQueue) {
        //상하
        int dx[] = {-1, 1, 0, 0};
        //좌우
        int dy[] = {0, 0, -1, 1};

        int N = arr.length;
        int M = arr[0].length;
        nextQueue.add(new int[]{0, 0});
        while (!nextQueue.isEmpty()) {
            int now[] = nextQueue.poll();
            int nowX = now[0];
            int nowY = now[1];

            //상하좌우 
            for (int i = 0; i < 4; i++) {
                int nextX = nowX + dx[i];
                int nextY = nowY + dy[i];
                //범위를 벗어나거나, 방문한적이 있거나, 방문할 노드가 0이면 
                if ((!rangeCheck(nextX, nextY, N, M))
                        || visited[nextX][nextY]
                        || arr[nextX][nextY] == 0) continue;
                nextQueue.add(new int[]{nextX, nextY});
                // 지난가면서 누적합 계산 (최종 (N-1,M-1)의 최소 누적합을 알아야하기 때문이다)
                arr[nextX][nextY] = arr[nowX][nowY] + 1;
                visited[nextX][nextY] = true;
                // 다시 while문을 돌면서 검사 
            }
        }
        return arr;
    }
}
