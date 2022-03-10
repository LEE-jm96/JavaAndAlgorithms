package algorithm.bruteforce;

import java.io.*;
import java.util.*;

public class Bj2178_maze {

    static int[][] map;
    static boolean[][] visited;
    static int N, M;
    static int[] dx = { -1, 0, 1, 0 };
    static int[] dy = { 0, -1, 0, 1 };

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new int[N][M];
        visited = new boolean[N][M];

        // 배열에 값 넣기
        for (int i=0; i<N; i++) {
            String temp = br.readLine();
            for (int j=0; j<M; j++) {
                map[i][j] = temp.charAt(j) - '0';
                visited[i][j] = false;
            }
        }

        visited[0][0] = true;
        bfs(0,0);
        System.out.println(map[N - 1][M - 1]);

    }

    private static void bfs(int x, int y) {
        Queue<Node> q = new LinkedList<>();
        q.add(new Node(x, y));

        while(!q.isEmpty()) {
            Node n = q.poll();
            for (int i=0; i<4; i++) { // 시작 좌표로부터 상하좌우 체크
                int nextX = n.getX() + dx[i];
                int nextY = n.getY() + dy[i];

                // 상하좌우 좌표가 배열 밖을 벗어날때
                if (nextX < 0 || nextY < 0 || nextX >= N || nextY >= M) {
                    continue;
                }

                // 상하좌우 좌표가 이미 방문한 좌표일때
                if (visited[nextX][nextY]) {
                    continue;
                }

                // 상하좌우 좌표의 값이 0일때
                if (map[nextX][nextY] == 0) {
                    continue;
                }

                // 인접노드를 큐에 집어넣는다
                q.add(new Node(nextX, nextY));
                // 배열위치의 값을 1 더해준다 -> 이동할때 지나야하는 최소 칸수
                map[nextX][nextY] = map[n.getX()][n.getY()] + 1;
                // 좌표에 방문했으므로 true
                visited[nextX][nextY] = true;
            }
        }
    }
}
class Node {
    private int x;
    private int y;

    public Node(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}