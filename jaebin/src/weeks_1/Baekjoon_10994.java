package weeks_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//백준 알고리즘 : 10994번, 별 찍기-19
public class Baekjoon_10994 {
    public static char[][] result;
    public static int[] location;
    public static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        location = new int[2]; // {0,1}
        //행과열의 크기를 구해보자
        //행 : 1 , 5 , 9    ->4씩 늘어남
        //열 : 1 , 9 , 17   ->8씩 늘어남

        //행과 열의 별과 " "의 규칙을 구해보자
        //행 -> 모든게 별
        //열 -> 홀수가 별

        //n인 배열의 행과 열의 길이를 구하자 -> 배열의 크기 구하기.
        result = new char[4 * (n - 1) + 1][4 * (n - 1) + 1];
        //시작점 : (0,0)
        location[0] = 0;
        location[1] = 0;
        N = n;
        rec(n, location);

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j]);
            }
            if (i == result.length - 1) break;
            System.out.println();
        }
    }

    //제일 큰 수 n의 배열을 만들고 그 안에 작은 n-1 형태의 배열의 원소를 넣고 또 그 안에 n-2 배열의 원소를 만들어 넣는 형식
    // 그렇기 때문에 매개 변수는 n(n=3)과 좌표값 location[2] : {0,0} -> {4,2} ->{8,4}
    // 매개변수 : n, location[]
    public static void rec(int n, int[] location) {
        //5 9  3 5
        if (n == 1) {
            result[2 * (N - 1) + 1 - 1][2 * (N - 1) + 1 - 1] = '*';
            return;
        }

        int row = result.length - location[0];
        int col = result[0].length - location[1];

        for (int i = location[0]; i < row; i++) {
            for (int j = location[1]; j < col; j++) {
                if (i == location[0] || i == row - 1) {
                    result[i][j] = '*';
                    continue;
                }

                if (j == location[1] || j == col - 1) {
                    result[i][j] = '*';
                    continue;
                }
                result[i][j] = ' ';
            }
        }
        location[0] += 2;
        location[1] += 2;
        n--;
        rec(n, location);
        return;
    }
}
