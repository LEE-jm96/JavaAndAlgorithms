package weeks_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//백준 알고리즘 3085번 : 사탕게임, 브루트 포스
public class Baekjoon_3085 {
    static int N = 0;
    //상하
    static int[] dx = {-1, 0, 1, 0};
    //좌우
    static int[] dy = {0, 1, 0, -1};

    // char 2차원 배열
    static char[][] arr;

    // 결과 개수
    static int maxCount = 0;

    //범위 체크
    public static boolean rangeCheck(int x, int y) {
        return x >= 0 && x < N && y >= 0 && y < N;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new char[N][N];

        // 입력값 arr 배열에 초기화
        for (int i = 0; i < arr.length; i++) {
            StringBuilder sb = new StringBuilder(br.readLine());
            arr[i] = sb.toString().toCharArray();
        }

        //행
        for (int x = 0; x < N; x++) {
            //열
            for (int y = 0; y < N; y++) {

                //4가지 방향 다 해보기
                for (int d = 0; d < 4; d++) {
                    int nx = x + dx[d];
                    int ny = y + dy[d];

                    if (rangeCheck(nx, ny) && arr[x][y] != arr[nx][ny]) {
                        char temp = arr[x][y];
                        arr[x][y] = arr[nx][ny];
                        arr[nx][ny] = temp;

                        // 개수 체크
                        countCheck();

                        //되돌리기
                        temp = arr[x][y];
                        arr[x][y] = arr[nx][ny];
                        arr[nx][ny] = temp;
                    }
                }
            }
        }
        System.out.println(maxCount);
    }

    public static void countCheck() {
        for (int x = 0; x < N; x++) {
            for (int y = 0; y < N; y++) {
                //i,j
                int row = 1;
                int col = 1;

                int cx = x;
                int cy = y;

                // 연속된 행
                for (int k = y + 1; k < N; k++) {
                    if (arr[x][cy] == arr[x][k]) {
                        row++;
                        cy = k;
                    } else break; // 연속이 끊어짐
                }

                // 연속된 열
                for (int k = x + 1; k < N; k++) {
                    if (arr[cx][y] == arr[k][y]) {
                        col++;
                        cx = k;
                    } else break; // 연속이 끊어짐

                }

                //연속된 행과 열중 큰수
                int result = Math.max(row, col);
                maxCount = Math.max(result, maxCount);
            }
        }
    }
}
