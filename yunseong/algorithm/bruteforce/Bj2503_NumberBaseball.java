package algorithm.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Bj2503_NumberBaseball {


    static int n; // 입력받을 질문갯수
    static int countStrike; // 입력받은 Strike수
    static int countBall; // 입력받은 Ball수
    static int turn; // 질문의 차례(몇번째 질문인가)를 세기위한 변수
    static String[] numbers = new String[3]; // 입력받은 세자리 수 각 자리를 저장할 배열
    static ArrayList<Integer> list = new ArrayList(987);
    // 기준에 맞는 숫자를 저장할 ArrayList. 최대 987개의 수가 들어가므로 크기를 지정해줌.

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {

            // 입력을 받을때마다 input 배열에 넣는다.
            // input[0]은 민혁이가 질문한 세자리 숫자,
            // input[1]은 strike갯수, input[2]는 ball의 갯수가 들어간다.
            String[] input = br.readLine().split(" ");

            // input[0]에 있는 민혁이가 질문한 세자리 숫자를 각 자리수 대로 나눈다.
            // 123이 입력됐으면 numbers[0]에는 1, numbers[1]에는 2, numbers[2]에는 3이 들어간다.
            numbers[0] = input[0].charAt(0) + "";
            numbers[1] = input[0].charAt(1) + "";
            numbers[2] = input[0].charAt(2) + "";

            // 입력받은 Strike와 Ball수를 저장해준다.
            countStrike = Integer.parseInt(input[1]);
            countBall = Integer.parseInt(input[2]);

            // 몇번째 질문인지 세는 변수. 첫번째 질문과 이후의 질문들을 구분하기 위해 사용한다.
            turn++;

            // cal메서드에서 계산을 수행한다.
            cal(numbers);
        }

        // 반복문이 종료되고 list의 최종 size를 출력한다.
        System.out.println(list.size());

    } // and of main

    // 계산이 수행되는 cal메서드
    static void cal(String[] compare) {

        // 조건에 맞는 숫자를 넣을 tmp list를 선언.
        ArrayList<Integer> tmp = new ArrayList();

        // 123부터 987까지 반복문을 돌며 비교대상 숫자(입력된 숫자)와 strike,ball수가 일치하는지 확인한다.
        // 반복문의 역할은 123부터 987의 숫자와 입력된 숫자를 비교하고 strike갯수와 ball의 갯수를 세는 역할임.
        for (int k = 123; k <= 987; k++) {

            int strike = 0;
            int ball = 0;

            // 각 자릿수를 변수에 저장.
            int first = k / 100;
            int second = ((k - (first * 100)) / 10);
            int third = (k - (first * 100) - (second * 10));
            // 세 자리에 같은 숫자가 있거나 0이 나오면 비교하지 않고 다음 숫자로 넘어간다.
            if (first == 0 || second == 0 || third == 0 || first == second || first == third || third == second)
                continue;
            // int형 arr에 각 자릿수를 넣어준다.
            int[] arr = { first, second, third };

            // strike와 ball을 확인할 반복문.
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    // 비교대상 숫자와 arr[i]의 숫자가 같으면 strike아니면 ball이다
                    if (arr[i] == Integer.parseInt(compare[j])) {
                        // index까지 같으면 strike, 아니면 ball
                        if (i == j) {
                            strike++;
                            continue;
                        }
                        ball++;
                    }
                }
            }

            // 입력받은 countStrike와 countBall이 위의 반복문에서 계산된 strike와 ball의 수와 같으면
            // tmp ArrayList에 해당하는 숫자를 추가한다.
            if (countStrike == strike && countBall == ball) {
                tmp.add(k);
            }
        } // end of for

        // 반복문이 모두 끝나면 기존 list와 비교해본다.
        // turn이 1인경우에는 비교할 list가 tmp의 모든 요소들을 add한다.
        // turn이 2 이상인 경우에는 이전 turn에서 넣은 list와 tmp를 비교하여 그 둘의 교집합만 list에 남아야 한다.
        // 교집합을 구하는 메서드 retainAll사용
        if (turn != 1)
            list.retainAll(tmp);
        else
            list.addAll(tmp);
    }

} // end of class
