package weeks_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//백준 알고리즘 2309번 : 일곱 난쟁이
public class Baekjoon_2309 {
    public static void main(String[] args) throws IOException {
        int[] a = new int[9];
        int sum = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(br.readLine());
            sum += a[i];
        }
        int b = 0;
        int c = 0;
        loop:
        for (int i = 0; i < a.length; i++) {
            b = a[i];
            for (int j = i + 1; j < a.length; j++) {
                c = a[j];
                if (sum - (b + c) == 100) {
                    a[i] = 0;
                    a[j] = 0;
                    break loop;
                }
            }
        }
        Arrays.sort(a);
        for (int i = 2; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
