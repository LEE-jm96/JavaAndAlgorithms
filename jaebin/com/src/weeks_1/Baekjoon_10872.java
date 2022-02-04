package weeks_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//백준 알고리즘 : 10872번, 팩토리얼
// 분류 :  재귀
public class Baekjoon_10872 {
    /*
     * N! 이라고 하면, N*(N-1)*(N-2)* ...2*1 이다.
     * for문을 사용하지 않고, 함수를 재귀적으로 호출하여 풀어보자
     * */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int fac = fac(Integer.parseInt(br.readLine()));
        System.out.println(fac);
    }

    public static int fac(int n) {
        if (n == 1) return 1;
        if (n == 0) return 1;
        return n * fac(n - 1);
    }
}
