package algorithm.bruteforce;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Bj1120_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        int n = b.length()-a.length();
        int cnt=0;
        List<Integer> answer = new ArrayList<>();

        for(int i = 0 ; i <= n ; i ++) {
            for (int j = 0; j < a.length(); j++) {
                if (a.charAt(j) != b.charAt(j + n - i)) {//차이만큼 시작하는 인덱스가 다름
                    cnt++;
                }
            }
            answer.add(cnt);//차이만큼 넣어줌
            cnt = 0;
        }
        Collections.sort(answer);//차이를 정렬함
        System.out.println(answer.get(0));//가장 작은 차이를 출력
    }
}
