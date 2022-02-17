package weeks_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//백준 알고리즘 : 1769번, 3의 배수
public class Baekjoon_1769 {
    static long count;
    static long temp;

    /*
    * 결과 :  실패 -> 런타임 에러
    * 혹시? 재귀의 깊이 문제? 자료형 변환 문제?  -> 새로운클래스로 품.
    * */
    public static void main(String[] args) throws IOException, NumberFormatException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long X = Long.parseLong(br.readLine());
        count = 0;
        temp = 0;

        if (X > 10) rec(X);
        else temp = X;

        System.out.println(count);
        if (temp % 3 == 0 && temp != 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    //55
    public static void rec(long X) throws NumberFormatException {
        if (X < 10) return;
        long len = (long) (Math.log10(X) + 1);
        temp = 0;
        count++;
        while (len != 0) {
            temp += (X % 10);
            X /= 10;
            len--;
        }
        rec(temp);
        return;
    }
}
