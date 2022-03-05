package week_6;

import java.util.Scanner;

public class bj9663 {

    static int[] queen;
    static int n;
    static int ans;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        queen = new int[n];
        backtrack(0);
        System.out.println(ans);
    }

    static void backtrack(int row) {
        if (row == n) {
            ans++;
            return;
        }
        for (int j = 0; j < n; j++) {
            queen[row] = j;
            if (isOk(row)) {
                backtrack(row + 1);
            }
        }
    }

    static boolean isOk(int col) {
        for (int i = 0; i < col; i++) {
            // 같은 라인에 퀸이 겹치는지 확인.
            if (queen[col] == queen[i])
                return false;
            //대각선에 퀸이 겹치는지 확인.
            if (Math.abs(col - i) == Math.abs(queen[i] - queen[col])) {
                return false;
            }
        }
        return true;
    }

}