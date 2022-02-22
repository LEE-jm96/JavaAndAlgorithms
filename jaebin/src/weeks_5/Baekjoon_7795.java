package weeks_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

//백준 알고리즘 7795번 : 먹을 것인가 먹힐 것인가, 정렬
public class Baekjoon_7795 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int countA = Integer.parseInt(st.nextToken());
            int countB = Integer.parseInt(st.nextToken());

            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int arrA[] = new int[countA];
            for (int j = 0; j < arrA.length; j++) {
                arrA[j] = Integer.parseInt(st2.nextToken());
            }
            StringTokenizer st3 = new StringTokenizer(br.readLine());
            int arrB[] = new int[countB];
            for (int j = 0; j < arrB.length; j++) {
                arrB[j] = Integer.parseInt(st3.nextToken());
            }
            //정렬을 해서 확인을 안했더니 시간초과
            Arrays.sort(arrA);
            Arrays.sort(arrB);
            // A는 B를 먹는다
            int cnt = 0;
            for (int j = 0; j < arrA.length; j++) {
                for (int k = 0; k < arrB.length; k++) {
                    if (arrA[j] > arrB[k]) {
                        cnt++;
                    }else {
                        break;
                    }
                }
            }
            System.out.println(cnt);
        }
    }
}
