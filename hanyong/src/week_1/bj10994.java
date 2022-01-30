package week_1;

import java.util.Scanner;

public class bj10994 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        char[][] star = new char[500][500];
        for (int i = 0; i < 500; i++) {
            for (int j = 0; j < 500; j++) {
                star[i][j] = ' ';
            }
        }
        star = MakeStar(0, size).clone(); //x = 시작점 좌표 역할
        //빈 배열을 ' '으로 채워주는 반복문(빈배열을 ' '출력만 해줄경우 오답 처리)
        for (int i = 0; i < change(size); i++) {
            for (int j = 0; j < change(size); j++) {
                if(star[i][j] != '*'){
                    star[i][j] = ' ';
                }
            }
        }
        for (int i = 0; i < change(size); i++) {
            for (int j = 0; j < change(size); j++) {
                System.out.print(star[i][j]);
            }
            System.out.println();
        }
    }
    public static char[][] MakeStar(int x, int size){
        char[][] star = new char[450][450];
        char[][] star_r = new char[450][450];
        int side = change(size);
        if(size == 1){
            star[x][x] = '*';
        }else {
            for (int i = 0; i < side; i++) {
                star[x][x + i] = '*';
                star[x + i][x] = '*';
                star[x + side - 1][x + i] = '*';
                star[x + i][x + side - 1] = '*';
            }
        }

        if(size > 1){
            star_r = MakeStar(x+2,size-1).clone();
        }
        merger(star,star_r);

        return star;
    }
    //입력받은 값을 출력해야할 사각형의 한변의 길이로 변환
    public static int change(int size){
        int side = 1 + 4 * (size-1); //한 변의 길이 = 1+(n-1)*4개
        return side;
    }
    //재귀할때 상위레벨 사각형과 합쳐주는 함
    public static char[][] merger(char x[][], char y[][]){
        for (int i = 0; i < 397; i++) {
            for (int j = 0; j < 397; j++) {
                if(x[i][j] != '*'){
                    x[i][j] = y[i][j];
                }
            }
        }
        return x;
    }
}
