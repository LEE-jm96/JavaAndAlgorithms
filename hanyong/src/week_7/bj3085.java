package week_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj3085 {

    public static char[][] board;
    public static int num;
    public static int max = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        num = Integer.parseInt(br.readLine());
        board = new char[num][num];
        for(int i=0; i<num; i++) {
            String str = br.readLine();
            for(int j=0; j<board[i].length; j++) {
                board[i][j] = str.charAt(j);
            }
        }
        for(int i=0; i<num; i++) {
            for(int j=0; j<num-1; j++) {
                swap_h(i,j);
                checkArr();
                swap_h(i,j);
            }
        }
        for(int i=0; i<num-1; i++) {
            for(int j=0; j<num; j++) {
                swap_w(i,j);
                checkArr();
                swap_w(i,j);
            }
        }
        System.out.println(max);
    }


    public static void swap_h(int a, int b) {
        char temp = board[a][b];
        board[a][b] = board[a][b+1];
        board[a][b+1] = temp;
    }
    public static void swap_w(int a, int b) {
        char temp = board[a][b];
        board[a][b] = board[a+1][b];
        board[a+1][b] = temp;
    }

    public static void checkArr() {
        //가로 체크
        for(int i=0; i<num; i++) {
            int count = 1;
            for(int j=0; j<num-1; j++) {
                if(board[i][j] == board[i][j+1])
                    count ++;
                else
                    count = 1;
                max = Math.max(max, count);
            }
        }
        //세로 체크
        for(int i=0; i<num; i++) {
            int count = 1;
            for(int j=0; j<num-1; j++) {
                if(board[j][i] == board[j+1][i])
                    count ++;
                else
                    count = 1;
                max = Math.max(max, count);
            }
        }
    }

}
