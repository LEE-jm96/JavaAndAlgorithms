package weeks_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//백준 알고리즘 : 1769번, 3의 배수
public class Baekjoon_1769_1 {
    public static long count;
    public static String temp;

    /*
     * 결과 :  성공
     * 제한 조건 에서 자료형의 크기에 대해서 자주 생각하자!! -> X가 백만까지가 아니라 백만 자리 -> 문자열로 처리해야함.
     * 문자열을 char 배열로 바꿔서 인덱스 하나하나 더해줌.
     * 결론 : 문제를 꼼꼼히 보자!!!
     * */
    public static void main(String[] args) throws IOException, NumberFormatException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String X = br.readLine();

        count = 0;
        temp = "";

        if (X.length() < 2) {
            int a = Integer.parseInt(X);
            if (a == 3 || a == 6 || a == 9) {
                System.out.println(count);
                System.out.println("YES");
            } else {
                System.out.println(count);
                System.out.println("NO");
            }
        } else {
            rec(X);
            int b = Integer.parseInt(temp);
            System.out.println(count);
            if (b == 0) {
                System.out.println("NO");
            } else if (b % 3 == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    public static void rec(String X) throws NumberFormatException {
        if (X.length() < 2) return;
        temp = "";
        char[] ch = X.toCharArray();
        long result = 0;

        for (int i = 0; i < ch.length; i++) {
            result += Character.getNumericValue(ch[i]);
        }
        count++;
        temp = String.valueOf(result);
        rec(temp);
        return;
    }
}
